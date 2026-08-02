package kotlin.reflect.jvm.internal;

import androidx.room.Room;
import com.google.crypto.tink.subtle.Hkdf;
import com.google.maps.android.compose.MarkerKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.DescriptorKProperty;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.calls.CallerImpl$FieldSetter$BoundInstance;
import kotlin.reflect.jvm.internal.calls.CallerImpl$FieldSetter$BoundJvmStaticInObject;
import kotlin.reflect.jvm.internal.calls.CallerImpl$FieldSetter$Static;
import kotlin.reflect.jvm.internal.calls.InternalUnderlyingValOfInlineClass;
import kotlin.reflect.jvm.internal.calls.ThrowingCaller;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public abstract class DescriptorKPropertyKt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Caller access$computeCallerForAccessor(DescriptorKProperty.Accessor accessor, boolean z) {
        JvmFunctionSignature$KotlinFunction jvmFunctionSignature$KotlinFunction;
        Method method;
        Caller boundInstance;
        JvmProtoBuf.JvmMethodSignature setter;
        Method findMethodBySignature;
        ClassDescriptor classDescriptor;
        if (KDeclarationContainerImpl.LOCAL_PROPERTY_SIGNATURE.matches(accessor.getProperty().signature)) {
            return ThrowingCaller.INSTANCE;
        }
        ClassId classId = RuntimeTypeMapper.JAVA_LANG_VOID;
        Hkdf mapPropertySignature = RuntimeTypeMapper.mapPropertySignature(accessor.getProperty().getDescriptor());
        Class cls = null;
        if (mapPropertySignature instanceof JvmPropertySignature$KotlinProperty) {
            JvmPropertySignature$KotlinProperty jvmPropertySignature$KotlinProperty = (JvmPropertySignature$KotlinProperty) mapPropertySignature;
            NameResolver nameResolver = jvmPropertySignature$KotlinProperty.nameResolver;
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = jvmPropertySignature$KotlinProperty.signature;
            if (z) {
                if (jvmPropertySignature.hasGetter()) {
                    setter = jvmPropertySignature.getGetter();
                    findMethodBySignature = setter == null ? accessor.getProperty().container.findMethodBySignature(nameResolver.getString(setter.getName()), nameResolver.getString(setter.getDesc())) : null;
                    if (findMethodBySignature == null) {
                        boundInstance = !Modifier.isStatic(findMethodBySignature.getModifiers()) ? Room.isBound(accessor) ? new CallerImpl.Method.BoundInstance(findMethodBySignature, Room.getBoundReceiver(accessor.getProperty())) : new CallerImpl.Method.Static(6, 1, findMethodBySignature, false) : accessor.getProperty().getDescriptor().getAnnotations().hasAnnotation(UtilKt.JVM_STATIC) ? Room.isBound(accessor) ? new CallerImpl.Method.BoundJvmStaticInObject(findMethodBySignature, false, 4) : new CallerImpl.Method.Static(4, 2, findMethodBySignature, true) : Room.isBound(accessor) ? new CallerImpl.Method.BoundStatic(findMethodBySignature, false, Room.getBoundReceiver(accessor.getProperty())) : new CallerImpl.Method.Static(6, 0, findMethodBySignature, false);
                    } else if (InlineClassesUtilsKt.isUnderlyingPropertyOfInlineClass(accessor.getProperty().getDescriptor()) && Intrinsics.areEqual(accessor.getProperty().getDescriptor().getVisibility(), DescriptorVisibilities.INTERNAL)) {
                        DeclarationDescriptor containingDeclaration = accessor.getProperty().getDescriptor().getContainingDeclaration();
                        if ((containingDeclaration instanceof ClassDescriptor) && InlineClassesUtilsKt.isInlineClass(containingDeclaration) && (cls = UtilKt.toJavaClass((classDescriptor = (ClassDescriptor) containingDeclaration))) == null) {
                            StringBuilder sb = new StringBuilder("Class object for the class ");
                            sb.append(classDescriptor.getName());
                            ClassId classId2 = DescriptorUtilsKt.getClassId((ClassifierDescriptor) containingDeclaration);
                            sb.append(" cannot be found (classId=");
                            sb.append(classId2);
                            sb.append(')');
                            throw new KotlinReflectionInternalError(sb.toString());
                        }
                        if (cls == null) {
                            throw new KotlinReflectionInternalError("Underlying property of inline class " + accessor.getProperty() + " should have a field");
                        }
                        Method inlineClassUnboxMethod = MarkerKt.getInlineClassUnboxMethod(cls, accessor.getProperty());
                        boundInstance = Room.isBound(accessor) ? new InternalUnderlyingValOfInlineClass.Bound(inlineClassUnboxMethod, Room.getBoundReceiver(accessor.getProperty())) : new InternalUnderlyingValOfInlineClass.Unbound(inlineClassUnboxMethod);
                    } else {
                        Field javaField = accessor.getProperty().getJavaField();
                        if (javaField == null) {
                            f$$ExternalSyntheticLambda0.m$2(accessor.getProperty(), "No accessors or field is found for property ");
                            return null;
                        }
                        boundInstance = computeCallerForAccessor$computeFieldCaller(accessor, z, javaField);
                    }
                }
                setter = null;
                if (setter == null) {
                }
                if (findMethodBySignature == null) {
                }
            } else {
                if (jvmPropertySignature.hasSetter()) {
                    setter = jvmPropertySignature.getSetter();
                    if (setter == null) {
                    }
                    if (findMethodBySignature == null) {
                    }
                }
                setter = null;
                if (setter == null) {
                }
                if (findMethodBySignature == null) {
                }
            }
        } else if (mapPropertySignature instanceof JvmPropertySignature$JavaField) {
            boundInstance = computeCallerForAccessor$computeFieldCaller(accessor, z, ((JvmPropertySignature$JavaField) mapPropertySignature).field);
        } else {
            if (!(mapPropertySignature instanceof JvmPropertySignature$JavaMethodProperty)) {
                if (!(mapPropertySignature instanceof JvmPropertySignature$MappedKotlinProperty)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                if (z) {
                    jvmFunctionSignature$KotlinFunction = ((JvmPropertySignature$MappedKotlinProperty) mapPropertySignature).getterSignature;
                } else {
                    jvmFunctionSignature$KotlinFunction = ((JvmPropertySignature$MappedKotlinProperty) mapPropertySignature).setterSignature;
                    if (jvmFunctionSignature$KotlinFunction == null) {
                        f$$ExternalSyntheticLambda0.m$2(accessor.getProperty(), "No setter found for property ");
                        return null;
                    }
                }
                JvmMemberSignature.Method method2 = jvmFunctionSignature$KotlinFunction.signature;
                Method findMethodBySignature2 = accessor.getProperty().container.findMethodBySignature(method2.getName(), method2.getDesc());
                if (findMethodBySignature2 != null) {
                    Modifier.isStatic(findMethodBySignature2.getModifiers());
                    return Room.isBound(accessor) ? new CallerImpl.Method.BoundInstance(findMethodBySignature2, Room.getBoundReceiver(accessor.getProperty())) : new CallerImpl.Method.Static(6, 1, findMethodBySignature2, false);
                }
                f$$ExternalSyntheticLambda0.m$2(accessor.getProperty(), "No accessor found for property ");
                return null;
            }
            if (z) {
                method = ((JvmPropertySignature$JavaMethodProperty) mapPropertySignature).getterMethod;
            } else {
                JvmPropertySignature$JavaMethodProperty jvmPropertySignature$JavaMethodProperty = (JvmPropertySignature$JavaMethodProperty) mapPropertySignature;
                method = jvmPropertySignature$JavaMethodProperty.setterMethod;
                if (method == null) {
                    f$$ExternalSyntheticLambda0.m$2(jvmPropertySignature$JavaMethodProperty.getterMethod, "No source found for setter of Java method property: ");
                    return null;
                }
            }
            boundInstance = Room.isBound(accessor) ? new CallerImpl.Method.BoundInstance(method, Room.getBoundReceiver(accessor.getProperty())) : new CallerImpl.Method.Static(method);
        }
        return MarkerKt.createValueClassAwareCallerIfNeeded(EmptyList.INSTANCE, accessor, boundInstance, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
    
        if (kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.isMovedFromInterfaceCompanion(((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor) r0).getProto()) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isAnnotationClass(r1) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CallerImpl computeCallerForAccessor$computeFieldCaller(DescriptorKProperty.Accessor accessor, boolean z, Field field) {
        PropertyDescriptor descriptor = accessor.getProperty().getDescriptor();
        DeclarationDescriptor containingDeclaration = descriptor.getContainingDeclaration();
        containingDeclaration.getClass();
        if (DescriptorUtils.isCompanionObject(containingDeclaration)) {
            DeclarationDescriptor containingDeclaration2 = containingDeclaration.getContainingDeclaration();
            if (!DescriptorUtils.isInterface(containingDeclaration2)) {
            }
            if (descriptor instanceof DeserializedPropertyDescriptor) {
            }
        }
        if (Modifier.isStatic(field.getModifiers())) {
            return accessor.getProperty().getDescriptor().getAnnotations().hasAnnotation(UtilKt.JVM_STATIC) ? z ? Room.isBound(accessor) ? new CallerImpl.FieldGetter.BoundJvmStaticInObject(field, false) : new CallerImpl.FieldGetter.Static(field, true, 2) : Room.isBound(accessor) ? new CallerImpl$FieldSetter$BoundJvmStaticInObject(field, computeCallerForAccessor$isNotNullProperty(accessor), false) : new CallerImpl$FieldSetter$Static(field, computeCallerForAccessor$isNotNullProperty(accessor), true, 2) : z ? new CallerImpl.FieldGetter.Static(field, false, 0) : new CallerImpl$FieldSetter$Static(field, computeCallerForAccessor$isNotNullProperty(accessor), false, 0);
        }
        return z ? Room.isBound(accessor) ? new CallerImpl.FieldGetter.BoundInstance(field, Room.getBoundReceiver(accessor.getProperty())) : new CallerImpl.FieldGetter.Static(field) : Room.isBound(accessor) ? new CallerImpl$FieldSetter$BoundInstance(field, computeCallerForAccessor$isNotNullProperty(accessor), Room.getBoundReceiver(accessor.getProperty())) : new CallerImpl$FieldSetter$Static(field, computeCallerForAccessor$isNotNullProperty(accessor));
    }

    public static final boolean computeCallerForAccessor$isNotNullProperty(DescriptorKProperty.Accessor accessor) {
        return !TypeUtils.isNullableType(accessor.getProperty().getDescriptor().getType());
    }
}
