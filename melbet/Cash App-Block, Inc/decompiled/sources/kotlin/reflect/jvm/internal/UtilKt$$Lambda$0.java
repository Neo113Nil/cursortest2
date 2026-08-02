package kotlin.reflect.jvm.internal;

import androidx.camera.video.VideoCapture$$ExternalSyntheticLambda6;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.km.KmConstructor;
import kotlin.reflect.jvm.internal.impl.km.KmFunction;
import kotlin.reflect.jvm.internal.impl.km.KmType;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmExtensionsKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt;
import kotlin.text.Regex;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public final class UtilKt$$Lambda$0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public static final UtilKt$$Lambda$0 INSTANCE$1 = new UtilKt$$Lambda$0(1);
    public static final UtilKt$$Lambda$0 INSTANCE$2 = new UtilKt$$Lambda$0(2);
    public static final UtilKt$$Lambda$0 INSTANCE$3 = new UtilKt$$Lambda$0(3);
    public static final UtilKt$$Lambda$0 INSTANCE$4 = new UtilKt$$Lambda$0(4);
    public static final UtilKt$$Lambda$0 INSTANCE$5 = new UtilKt$$Lambda$0(5);
    public static final UtilKt$$Lambda$0 INSTANCE$6 = new UtilKt$$Lambda$0(6);
    public static final UtilKt$$Lambda$0 INSTANCE$7 = new UtilKt$$Lambda$0(7);
    public static final UtilKt$$Lambda$0 INSTANCE$8 = new UtilKt$$Lambda$0(8);
    public static final UtilKt$$Lambda$0 INSTANCE$9 = new UtilKt$$Lambda$0(9);
    public static final UtilKt$$Lambda$0 INSTANCE$10 = new UtilKt$$Lambda$0(10);
    public static final UtilKt$$Lambda$0 INSTANCE$11 = new UtilKt$$Lambda$0(11);
    public static final UtilKt$$Lambda$0 INSTANCE$12 = new UtilKt$$Lambda$0(12);
    public static final UtilKt$$Lambda$0 INSTANCE$13 = new UtilKt$$Lambda$0(13);
    public static final UtilKt$$Lambda$0 INSTANCE$14 = new UtilKt$$Lambda$0(14);
    public static final UtilKt$$Lambda$0 INSTANCE$15 = new UtilKt$$Lambda$0(15);
    public static final UtilKt$$Lambda$0 INSTANCE$16 = new UtilKt$$Lambda$0(16);
    public static final UtilKt$$Lambda$0 INSTANCE$17 = new UtilKt$$Lambda$0(17);
    public static final UtilKt$$Lambda$0 INSTANCE$18 = new UtilKt$$Lambda$0(18);
    public static final UtilKt$$Lambda$0 INSTANCE$19 = new UtilKt$$Lambda$0(19);
    public static final UtilKt$$Lambda$0 INSTANCE$20 = new UtilKt$$Lambda$0(20);
    public static final UtilKt$$Lambda$0 INSTANCE = new UtilKt$$Lambda$0(0);

    public /* synthetic */ UtilKt$$Lambda$0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                KType kType = (KType) obj;
                FqName fqName = UtilKt.JVM_STATIC;
                kType.getClass();
                return UtilKt.unsubstitutedUnderlyingType(kType);
            case 1:
                TypeVariable typeVariable = (TypeVariable) obj;
                typeVariable.getClass();
                Type[] bounds = typeVariable.getBounds();
                bounds.getClass();
                Object first = ArraysKt___ArraysKt.first(bounds);
                if (first instanceof TypeVariable) {
                    return (TypeVariable) first;
                }
                return null;
            case 2:
                Class cls = (Class) obj;
                cls.getClass();
                if (Modifier.isStatic(cls.getModifiers())) {
                    return null;
                }
                return cls.getDeclaringClass();
            case 3:
                Class cls2 = (Class) obj;
                cls2.getClass();
                TypeVariable[] typeParameters = cls2.getTypeParameters();
                typeParameters.getClass();
                return ArraysKt___ArraysKt.asSequence(typeParameters);
            case 4:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                parameterizedType.getClass();
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 5:
                ParameterizedType parameterizedType2 = (ParameterizedType) obj;
                parameterizedType2.getClass();
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                actualTypeArguments.getClass();
                return ArraysKt___ArraysKt.toList(actualTypeArguments);
            case 6:
                KmType kmType = (KmType) obj;
                kmType.getClass();
                return kmType.getOuterType();
            case 7:
                KmType kmType2 = (KmType) obj;
                kmType2.getClass();
                return kmType2.getArguments();
            case 8:
                DescriptorKCallable descriptorKCallable = (DescriptorKCallable) obj;
                VideoCapture$$ExternalSyntheticLambda6 videoCapture$$ExternalSyntheticLambda6 = FakeOverridesKt.modalityIntersectionOverrideComparator;
                descriptorKCallable.getClass();
                ClassBasedDeclarationContainer container = descriptorKCallable.getContainer();
                KClass kClass = container instanceof KClass ? (KClass) container : null;
                return Boolean.valueOf(kClass != null && PapaEvent.getJavaClass(kClass).isInterface());
            case 9:
                DescriptorKCallable descriptorKCallable2 = (DescriptorKCallable) obj;
                VideoCapture$$ExternalSyntheticLambda6 videoCapture$$ExternalSyntheticLambda62 = FakeOverridesKt.modalityIntersectionOverrideComparator;
                descriptorKCallable2.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(descriptorKCallable2.getContainer(), Reflection.factory.getOrCreateKotlinClass(Object.class)));
            case 10:
                Class<?> returnType = ((Method) obj).getReturnType();
                returnType.getClass();
                return ReflectClassUtilKt.getDesc(returnType);
            case 11:
                Class cls3 = (Class) obj;
                cls3.getClass();
                return ReflectClassUtilKt.getDesc(cls3);
            case 12:
                PropertyDescriptor propertyDescriptor = (PropertyDescriptor) obj;
                Regex regex = KDeclarationContainerImpl.LOCAL_PROPERTY_SIGNATURE;
                propertyDescriptor.getClass();
                return DescriptorRenderer.DEBUG_TEXT.render(propertyDescriptor) + " | " + RuntimeTypeMapper.mapPropertySignature(propertyDescriptor).asString();
            case 13:
                KmFunction kmFunction = (KmFunction) obj;
                Regex regex2 = KDeclarationContainerImpl.LOCAL_PROPERTY_SIGNATURE;
                kmFunction.getClass();
                return kmFunction.getName() + " | " + JvmExtensionsKt.getSignature(kmFunction);
            case 14:
                FunctionDescriptor functionDescriptor = (FunctionDescriptor) obj;
                Regex regex3 = KDeclarationContainerImpl.LOCAL_PROPERTY_SIGNATURE;
                functionDescriptor.getClass();
                return DescriptorRenderer.DEBUG_TEXT.render(functionDescriptor) + " | " + RuntimeTypeMapper.mapSignature(functionDescriptor).asString();
            case 15:
                KmConstructor kmConstructor = (KmConstructor) obj;
                Regex regex4 = KDeclarationContainerImpl.LOCAL_PROPERTY_SIGNATURE;
                kmConstructor.getClass();
                return String.valueOf(JvmExtensionsKt.getSignature(kmConstructor));
            case 16:
                ReflectKParameter reflectKParameter = (ReflectKParameter) obj;
                reflectKParameter.getClass();
                StringBuilder sb = new StringBuilder();
                String name = reflectKParameter.getName();
                if (name == null) {
                    name = "_";
                }
                sb.append(name);
                sb.append(": ");
                sb.append(reflectKParameter.getType());
                return sb.toString();
            case 17:
                ReflectKParameter reflectKParameter2 = (ReflectKParameter) obj;
                reflectKParameter2.getClass();
                return ReflectionObjectRenderer.renderType(reflectKParameter2.getType(), false);
            case 18:
                ReflectKParameter reflectKParameter3 = (ReflectKParameter) obj;
                reflectKParameter3.getClass();
                return ReflectionObjectRenderer.renderType(reflectKParameter3.getType(), false);
            case 19:
                Name name2 = (Name) obj;
                name2.getClass();
                return RenderingUtilsKt.render$default(name2, false, 1, null);
            default:
                Class cls4 = (Class) obj;
                cls4.getClass();
                return ReflectClassUtilKt.getDesc(cls4);
        }
    }
}
