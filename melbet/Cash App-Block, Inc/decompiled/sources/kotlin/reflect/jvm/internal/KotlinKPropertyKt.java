package kotlin.reflect.jvm.internal;

import androidx.room.Room;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.maps.android.compose.InputHandlerKt;
import com.google.maps.android.compose.MarkerKt;
import com.squareup.cash.instruments.utils.CardBrandGuesser$Brand;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.KotlinKProperty;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.calls.CallerImpl$FieldSetter$BoundInstance;
import kotlin.reflect.jvm.internal.calls.CallerImpl$FieldSetter$Static;
import kotlin.reflect.jvm.internal.calls.InternalUnderlyingValOfInlineClass;
import kotlin.reflect.jvm.internal.calls.ThrowingCaller;
import kotlin.reflect.jvm.internal.impl.km.ClassKind;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmAttributes;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmExtensionsKt;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public abstract class KotlinKPropertyKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Caller computeCallerForAccessor(KotlinKProperty.Accessor accessor, boolean z) {
        Caller boundStatic;
        Caller caller;
        boolean z2;
        KotlinKProperty property = accessor.getProperty();
        boolean isLocalDelegated = InputHandlerKt.isLocalDelegated(property);
        KmProperty kmProperty = property.kmProperty;
        if (isLocalDelegated) {
            return ThrowingCaller.INSTANCE;
        }
        KDeclarationContainerImpl kDeclarationContainerImpl = property.container;
        JvmMethodSignature getterSignature = z ? JvmExtensionsKt.getGetterSignature(kmProperty) : JvmExtensionsKt.getSetterSignature(kmProperty);
        Method findMethodBySignature = getterSignature != null ? kDeclarationContainerImpl.findMethodBySignature(getterSignature.getName(), getterSignature.getDescriptor()) : null;
        if (findMethodBySignature == null) {
            if (MarkerKt.isUnderlyingPropertyOfValueClass(property) && property.getVisibility() == KVisibility.INTERNAL) {
                Class inlineClass = MarkerKt.toInlineClass(((ReflectKParameter) CollectionsKt.single(property.getParameters())).getType());
                if (inlineClass != null) {
                    Method inlineClassUnboxMethod = MarkerKt.getInlineClassUnboxMethod(inlineClass, property);
                    caller = Room.isBound(accessor) ? new InternalUnderlyingValOfInlineClass.Bound(inlineClassUnboxMethod, Room.getBoundReceiver(accessor.getProperty())) : new InternalUnderlyingValOfInlineClass.Unbound(inlineClassUnboxMethod);
                    return MarkerKt.createValueClassAwareCallerIfNeeded(EmptyList.INSTANCE, accessor, caller, false);
                }
                throw new KotlinReflectionInternalError("Underlying property of inline class " + property + " should have a field");
            }
            Field javaField = property.getJavaField();
            if (javaField == null) {
                f$$ExternalSyntheticLambda0.m$1(property, "No accessors or field is found for property ");
                return null;
            }
            if ((kDeclarationContainerImpl instanceof KClassImpl) && ((KClassImpl) kDeclarationContainerImpl).getClassKind$kotlin_reflection() == ClassKind.COMPANION_OBJECT) {
                Class<?> enclosingClass = PapaEvent.getJavaClass((KClass) kDeclarationContainerImpl).getEnclosingClass();
                enclosingClass.getClass();
                KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(enclosingClass);
                KClassImpl kClassImpl = orCreateKotlinClass instanceof KClassImpl ? (KClassImpl) orCreateKotlinClass : null;
                if (kClassImpl != null) {
                    z2 = (kClassImpl.getClassKind$kotlin_reflection() == ClassKind.INTERFACE || kClassImpl.getClassKind$kotlin_reflection() == ClassKind.ANNOTATION_CLASS) ? JvmAttributes.isMovedFromInterfaceCompanion(kmProperty) : true;
                    if (z2 && Modifier.isStatic(javaField.getModifiers())) {
                        computeCallerForAccessor$isJvmStaticProperty(accessor);
                        boundStatic = z ? new CallerImpl.FieldGetter.Static(javaField, false, 0) : new CallerImpl$FieldSetter$Static(javaField, !UtilKt.isNullableType(property.getReturnType()), false, 0);
                    } else {
                        boundStatic = !z ? Room.isBound(accessor) ? new CallerImpl.FieldGetter.BoundInstance(javaField, Room.getBoundReceiver(accessor.getProperty())) : new CallerImpl.FieldGetter.Static(javaField, true, 1) : Room.isBound(accessor) ? new CallerImpl$FieldSetter$BoundInstance(javaField, !UtilKt.isNullableType(property.getReturnType()), Room.getBoundReceiver(accessor.getProperty())) : new CallerImpl$FieldSetter$Static(javaField, !UtilKt.isNullableType(property.getReturnType()), true, 1);
                    }
                }
            }
            z2 = false;
            if (z2) {
            }
            if (!z) {
            }
        } else if (Modifier.isStatic(findMethodBySignature.getModifiers())) {
            computeCallerForAccessor$isJvmStaticProperty(accessor);
            boundStatic = Room.isBound(accessor) ? new CallerImpl.Method.BoundStatic(findMethodBySignature, false, Room.getBoundReceiver(accessor.getProperty())) : new CallerImpl.Method.Static(6, 0, findMethodBySignature, false);
        } else {
            boundStatic = Room.isBound(accessor) ? new CallerImpl.Method.BoundInstance(findMethodBySignature, Room.getBoundReceiver(accessor.getProperty())) : new CallerImpl.Method.Static(6, 1, findMethodBySignature, false);
        }
        caller = boundStatic;
        return MarkerKt.createValueClassAwareCallerIfNeeded(EmptyList.INSTANCE, accessor, caller, false);
    }

    public static final void computeCallerForAccessor$isJvmStaticProperty(KotlinKProperty.Accessor accessor) {
        if (accessor.getProperty().container instanceof KPackageImpl) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$3(accessor, "Only top-level properties are supported for now: ");
    }

    public static final CardBrandGuesser$Brand guessBrand(String str) {
        int length;
        if (str != null && (length = str.length()) >= 1) {
            switch (str.charAt(0)) {
                case '3':
                    if (length >= 2) {
                        char charAt = str.charAt(1);
                        if (charAt == '0') {
                            if (length >= 3) {
                                char charAt2 = str.charAt(2);
                                if (charAt2 == '9') {
                                    if (length >= 4 && str.charAt(3) == '5') {
                                        break;
                                    }
                                } else {
                                    switch (charAt2) {
                                    }
                                }
                            } else {
                                break;
                            }
                        } else {
                            switch (charAt) {
                                case '5':
                                    if (length >= 3) {
                                        switch (str.charAt(2)) {
                                            case '2':
                                                if (length >= 4) {
                                                    char charAt3 = str.charAt(3);
                                                    if (charAt3 != '8' && charAt3 != '9') {
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                                break;
                                        }
                                    } else {
                                        break;
                                    }
                                    break;
                            }
                        }
                    } else {
                        break;
                    }
                    break;
                case '5':
                    if (length < 2) {
                        break;
                    } else {
                        switch (str.charAt(1)) {
                        }
                    }
                    break;
                case '6':
                    if (length >= 2) {
                        char charAt4 = str.charAt(1);
                        if (charAt4 == '0') {
                            if (length >= 3 && str.charAt(2) == '1' && length >= 4 && str.charAt(3) == '1') {
                                break;
                            }
                        } else if (charAt4 != '2') {
                            if (charAt4 == '7') {
                                if (length >= 3 && str.charAt(2) == '7' && length >= 4 && str.charAt(3) == '1' && length >= 5 && str.charAt(4) == '8' && length >= 6 && str.charAt(5) == '9') {
                                    break;
                                }
                            } else if (charAt4 != '4') {
                                if (charAt4 == '5') {
                                    break;
                                } else {
                                    break;
                                }
                            } else if (length < 3) {
                                break;
                            } else {
                                switch (str.charAt(2)) {
                                }
                            }
                        } else if (length < 3) {
                            break;
                        } else {
                            switch (str.charAt(2)) {
                                case '2':
                                    if (length < 4) {
                                        break;
                                    } else {
                                        switch (str.charAt(3)) {
                                            case '1':
                                                if (length < 5) {
                                                    break;
                                                } else {
                                                    switch (str.charAt(4)) {
                                                        case '2':
                                                            if (length < 6) {
                                                                break;
                                                            } else {
                                                                switch (str.charAt(5)) {
                                                                }
                                                            }
                                                    }
                                                }
                                                break;
                                            case '9':
                                                if (length < 5) {
                                                    break;
                                                } else {
                                                    switch (str.charAt(4)) {
                                                        case '2':
                                                            if (length < 6) {
                                                                break;
                                                            } else {
                                                                switch (str.charAt(5)) {
                                                                }
                                                            }
                                                    }
                                                }
                                        }
                                    }
                                    break;
                                case '8':
                                    if (length < 4) {
                                        break;
                                    } else {
                                        switch (str.charAt(3)) {
                                        }
                                    }
                            }
                        }
                    } else {
                        break;
                    }
                    break;
            }
            return CardBrandGuesser$Brand.UNKNOWN;
        }
        return CardBrandGuesser$Brand.UNKNOWN;
    }

    public static ExecutorService newSingleThreadExecutor(NamedThreadFactory namedThreadFactory) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), namedThreadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
