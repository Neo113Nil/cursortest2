package kotlin.reflect.jvm.internal.calls;

import androidx.room.Room;
import com.google.maps.android.compose.MarkerKt;
import io.noties.markwon.MarkwonImpl;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.ReflectKCallable;
import kotlin.reflect.jvm.internal.ReflectKFunction;
import kotlin.reflect.jvm.internal.ReflectKParameter;
import kotlin.reflect.jvm.internal.ReflectKProperty;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class ValueClassAwareCaller implements Caller {
    public final Caller caller;
    public final MarkwonImpl data;
    public final boolean isDefault;

    /* JADX WARN: Code restructure failed: missing block: B:116:0x008e, code lost:
    
        if ((r13 instanceof kotlin.reflect.jvm.internal.calls.BoundCaller) != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ValueClassAwareCaller(List list, ReflectKCallable reflectKCallable, Caller caller, boolean z) {
        Class inlineClass;
        Method declaredMethod;
        boolean z2;
        List allParameters;
        Iterator it;
        int size;
        int size2;
        MarkwonImpl markwonImpl;
        Member member;
        Class inlineClass2;
        KType unsubstitutedUnderlyingType;
        reflectKCallable.getClass();
        list.getClass();
        this.caller = caller;
        this.isDefault = z;
        KType returnType = reflectKCallable.getReturnType();
        boolean z3 = reflectKCallable instanceof ReflectKFunction;
        if ((z3 && ((ReflectKFunction) reflectKCallable).isSuspend() && (unsubstitutedUnderlyingType = UtilKt.unsubstitutedUnderlyingType(returnType)) != null && MarkerKt.isPrimitiveType(unsubstitutedUnderlyingType)) || (inlineClass = MarkerKt.toInlineClass(returnType)) == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = inlineClass.getDeclaredMethod("box-impl", MarkerKt.getInlineClassUnboxMethod(inlineClass, reflectKCallable).getReturnType());
                declaredMethod.getClass();
            } catch (NoSuchMethodException unused) {
                f$$ExternalSyntheticLambda0.m("No box method found in inline class: ", inlineClass, " (calling ", reflectKCallable);
                throw null;
            }
        }
        if (reflectKCallable instanceof KProperty.Getter) {
            KProperty property = ((KProperty.Getter) reflectKCallable).getProperty();
            property.getClass();
            if (MarkerKt.isUnderlyingPropertyOfValueClass((ReflectKProperty) property)) {
                IntRange.INSTANCE.getClass();
                markwonImpl = new MarkwonImpl(IntRange.EMPTY, new Method[0], declaredMethod);
                this.data = markwonImpl;
                return;
            }
        }
        int i = -1;
        if (!(caller instanceof CallerImpl.Method.BoundStatic) || ((CallerImpl.Method.BoundStatic) caller).isCallByToValueClassMangledMethod) {
            if (!Room.isConstructor(reflectKCallable)) {
                List parameters = reflectKCallable.getParameters();
                if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                    Iterator it2 = parameters.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (((ReflectKParameter) it2.next()).getKind() == KParameter$Kind.INSTANCE) {
                            KDeclarationContainerImpl container = reflectKCallable.getContainer();
                            KClassImpl kClassImpl = container instanceof KClassImpl ? (KClassImpl) container : null;
                            if (kClassImpl == null || !kClassImpl.isValue()) {
                                i = 1;
                            }
                        }
                    }
                }
                i = 0;
            }
            this.data = markwonImpl;
            return;
        }
        this.caller.getMember();
        ArrayList arrayList = new ArrayList();
        ClassBasedDeclarationContainer container2 = reflectKCallable.getContainer();
        if (!Room.isConstructor(reflectKCallable) && (container2 instanceof KClass)) {
            KClass kClass = (KClass) container2;
            if (kClass.isValue()) {
                arrayList.add(KClasses.createDefaultType(kClass));
            }
        }
        if (Room.isConstructor(reflectKCallable)) {
            KClass kClass2 = container2 instanceof KClass ? (KClass) container2 : null;
            if (kClass2 != null && kClass2.isInner()) {
                z2 = true;
                for (ReflectKParameter reflectKParameter : reflectKCallable.getAllParameters()) {
                    if (reflectKParameter.getKind() != KParameter$Kind.INSTANCE || z2) {
                        arrayList.add(reflectKParameter.getType());
                    }
                }
                allParameters = reflectKCallable.getAllParameters();
                if ((allParameters instanceof Collection) || !allParameters.isEmpty()) {
                    it = allParameters.iterator();
                    while (it.hasNext()) {
                        if (((ReflectKParameter) it.next()).getKind() == KParameter$Kind.EXTENSION_RECEIVER) {
                            size = arrayList.size() - 1;
                            break;
                        }
                    }
                }
                size = arrayList.size();
                size2 = arrayList.size() + i + (!this.isDefault ? ((size + 31) / 32) + 1 : 0) + ((z3 || !((ReflectKFunction) reflectKCallable).isSuspend()) ? 0 : 1);
                boolean z4 = this.isDefault;
                if (getParameterTypes().size() == size2) {
                    StringBuilder sb = new StringBuilder("Inconsistent number of parameters in the descriptor and Java reflection object: ");
                    sb.append(this.caller.getParameterTypes().size());
                    sb.append(" != ");
                    sb.append(size2);
                    sb.append("\nCalling: ");
                    sb.append(reflectKCallable);
                    List parameterTypes = this.caller.getParameterTypes();
                    sb.append("\nParameter types: ");
                    sb.append(parameterTypes);
                    sb.append(")\nDefault: ");
                    sb.append(z4);
                    throw new KotlinReflectionInternalError(sb.toString());
                }
                IntRange until = RangesKt___RangesKt.until(Math.max(i, 0), arrayList.size() + i);
                Method[] methodArr = new Method[size2];
                int i2 = 0;
                while (i2 < size2) {
                    methodArr[i2] = (i2 > until.last || until.first > i2 || (inlineClass2 = MarkerKt.toInlineClass((KType) arrayList.get(i2 - i))) == null) ? null : MarkerKt.getInlineClassUnboxMethod(inlineClass2, reflectKCallable);
                    i2++;
                }
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    methodArr[((Number) it3.next()).intValue()] = null;
                }
                ClassBasedDeclarationContainer container3 = reflectKCallable.getContainer();
                if (!Room.isConstructor(reflectKCallable) && (container3 instanceof KClass) && ((KClass) container3).isValue() && (member = this.caller.getMember()) != null) {
                    if (member.getDeclaringClass() == null ? false : !Reflection.factory.getOrCreateKotlinClass(r11).isValue()) {
                        methodArr[0] = null;
                    }
                }
                markwonImpl = new MarkwonImpl(until, methodArr, declaredMethod);
                this.data = markwonImpl;
                return;
            }
        }
        z2 = false;
        while (r6.hasNext()) {
        }
        allParameters = reflectKCallable.getAllParameters();
        if (allParameters instanceof Collection) {
        }
        it = allParameters.iterator();
        while (it.hasNext()) {
        }
        size = arrayList.size();
        size2 = arrayList.size() + i + (!this.isDefault ? ((size + 31) / 32) + 1 : 0) + ((z3 || !((ReflectKFunction) reflectKCallable).isSuspend()) ? 0 : 1);
        boolean z42 = this.isDefault;
        if (getParameterTypes().size() == size2) {
        }
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final Object call(Object[] objArr) {
        Object invoke;
        Method method;
        objArr.getClass();
        MarkwonImpl markwonImpl = this.data;
        IntRange intRange = (IntRange) markwonImpl.parser;
        Method[] methodArr = (Method[]) markwonImpl.visitorFactory;
        Method method2 = (Method) markwonImpl.plugins;
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            int i2 = intRange.first;
            if (i <= intRange.last && i2 <= i && (method = methodArr[i]) != null) {
                if (obj != null) {
                    obj = method.invoke(obj, null);
                } else {
                    Class<?> returnType = method.getReturnType();
                    returnType.getClass();
                    obj = UtilKt.defaultPrimitiveValue(returnType);
                }
            }
            objArr2[i] = obj;
        }
        Object call = this.caller.call(objArr2);
        return (call == CoroutineSingletons.COROUTINE_SUSPENDED || method2 == null || (invoke = method2.invoke(null, call)) == null) ? call : invoke;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final Member getMember() {
        return this.caller.getMember();
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final List getParameterTypes() {
        return this.caller.getParameterTypes();
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final Type getReturnType() {
        return this.caller.getReturnType();
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final boolean isBoundInstanceCallWithValueClasses() {
        return this.caller instanceof CallerImpl.Method.BoundInstance;
    }
}
