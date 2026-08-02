package kotlin.reflect.jvm.internal;

import com.google.crypto.tink.subtle.Bytes;
import com.google.crypto.tink.subtle.Hkdf;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaConstructor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaField;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public abstract class RuntimeTypeMapper {
    public static final ClassId JAVA_LANG_VOID = ClassId.Companion.topLevel(new FqName("java.lang.Void"));

    public static JvmFunctionSignature$KotlinFunction mapJvmFunctionSignature(FunctionDescriptor functionDescriptor) {
        String jvmMethodNameIfSpecial = SpecialBuiltinMembers.getJvmMethodNameIfSpecial(functionDescriptor);
        if (jvmMethodNameIfSpecial == null) {
            if (functionDescriptor instanceof PropertyGetterDescriptor) {
                String asString = DescriptorUtilsKt.getPropertyIfAccessor(functionDescriptor).getName().asString();
                asString.getClass();
                jvmMethodNameIfSpecial = JvmAbi.getterName(asString);
            } else if (functionDescriptor instanceof PropertySetterDescriptor) {
                String asString2 = DescriptorUtilsKt.getPropertyIfAccessor(functionDescriptor).getName().asString();
                asString2.getClass();
                jvmMethodNameIfSpecial = JvmAbi.setterName(asString2);
            } else {
                jvmMethodNameIfSpecial = functionDescriptor.getName().asString();
                jvmMethodNameIfSpecial.getClass();
            }
        }
        return new JvmFunctionSignature$KotlinFunction(new JvmMemberSignature.Method(jvmMethodNameIfSpecial, MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor, false, false, 1, null)));
    }

    public static Hkdf mapPropertySignature(PropertyDescriptor propertyDescriptor) {
        propertyDescriptor.getClass();
        PropertyDescriptor original = ((PropertyDescriptor) DescriptorUtils.unwrapFakeOverride(propertyDescriptor)).getOriginal();
        original.getClass();
        if (original instanceof DeserializedPropertyDescriptor) {
            DeserializedPropertyDescriptor deserializedPropertyDescriptor = (DeserializedPropertyDescriptor) original;
            ProtoBuf.Property proto = deserializedPropertyDescriptor.getProto();
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> generatedExtension = JvmProtoBuf.propertySignature;
            generatedExtension.getClass();
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.getExtensionOrNull(proto, generatedExtension);
            if (jvmPropertySignature != null) {
                return new JvmPropertySignature$KotlinProperty(deserializedPropertyDescriptor, proto, jvmPropertySignature, deserializedPropertyDescriptor.getNameResolver(), deserializedPropertyDescriptor.getTypeTable());
            }
        } else if (original instanceof JavaPropertyDescriptor) {
            JavaPropertyDescriptor javaPropertyDescriptor = (JavaPropertyDescriptor) original;
            SourceElement source = javaPropertyDescriptor.getSource();
            JavaSourceElement javaSourceElement = source instanceof JavaSourceElement ? (JavaSourceElement) source : null;
            JavaElement javaElement = javaSourceElement != null ? javaSourceElement.getJavaElement() : null;
            if (javaElement instanceof ReflectJavaField) {
                return new JvmPropertySignature$JavaField(((ReflectJavaField) javaElement).getMember());
            }
            if (!(javaElement instanceof ReflectJavaMethod)) {
                f$$ExternalSyntheticLambda0.m$2("Incorrect resolution sequence for Java field ", original, " (source = ", javaElement);
                return null;
            }
            Method member = ((ReflectJavaMethod) javaElement).getMember();
            PropertySetterDescriptor setter = javaPropertyDescriptor.getSetter();
            SourceElement source2 = setter != null ? setter.getSource() : null;
            JavaSourceElement javaSourceElement2 = source2 instanceof JavaSourceElement ? (JavaSourceElement) source2 : null;
            JavaElement javaElement2 = javaSourceElement2 != null ? javaSourceElement2.getJavaElement() : null;
            ReflectJavaMethod reflectJavaMethod = javaElement2 instanceof ReflectJavaMethod ? (ReflectJavaMethod) javaElement2 : null;
            return new JvmPropertySignature$JavaMethodProperty(member, reflectJavaMethod != null ? reflectJavaMethod.getMember() : null);
        }
        PropertyGetterDescriptor getter = original.getGetter();
        getter.getClass();
        JvmFunctionSignature$KotlinFunction mapJvmFunctionSignature = mapJvmFunctionSignature(getter);
        PropertySetterDescriptor setter2 = original.getSetter();
        return new JvmPropertySignature$MappedKotlinProperty(mapJvmFunctionSignature, setter2 != null ? mapJvmFunctionSignature(setter2) : null);
    }

    public static Bytes mapSignature(FunctionDescriptor functionDescriptor) {
        Method member;
        JvmMemberSignature.Method jvmConstructorSignature;
        JvmMemberSignature.Method jvmMethodSignature;
        functionDescriptor.getClass();
        FunctionDescriptor original = ((FunctionDescriptor) DescriptorUtils.unwrapFakeOverride(functionDescriptor)).getOriginal();
        original.getClass();
        if (original instanceof DeserializedCallableMemberDescriptor) {
            DeserializedMemberDescriptor deserializedMemberDescriptor = (DeserializedMemberDescriptor) original;
            MessageLite proto = deserializedMemberDescriptor.getProto();
            if ((proto instanceof ProtoBuf.Function) && (jvmMethodSignature = JvmProtoBufUtil.INSTANCE.getJvmMethodSignature((ProtoBuf.Function) proto, deserializedMemberDescriptor.getNameResolver(), deserializedMemberDescriptor.getTypeTable())) != null) {
                return new JvmFunctionSignature$KotlinFunction(jvmMethodSignature);
            }
            if (!(proto instanceof ProtoBuf.Constructor) || (jvmConstructorSignature = JvmProtoBufUtil.INSTANCE.getJvmConstructorSignature((ProtoBuf.Constructor) proto, deserializedMemberDescriptor.getNameResolver(), deserializedMemberDescriptor.getTypeTable())) == null) {
                return mapJvmFunctionSignature(original);
            }
            DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
            containingDeclaration.getClass();
            return InlineClassesUtilsKt.isInlineClass(containingDeclaration) ? new JvmFunctionSignature$KotlinFunction(jvmConstructorSignature) : new JvmFunctionSignature$KotlinConstructor(jvmConstructorSignature);
        }
        if (original instanceof JavaMethodDescriptor) {
            SourceElement source = ((JavaMethodDescriptor) original).getSource();
            JavaSourceElement javaSourceElement = source instanceof JavaSourceElement ? (JavaSourceElement) source : null;
            Object javaElement = javaSourceElement != null ? javaSourceElement.getJavaElement() : null;
            ReflectJavaMethod reflectJavaMethod = javaElement instanceof ReflectJavaMethod ? (ReflectJavaMethod) javaElement : null;
            if (reflectJavaMethod != null && (member = reflectJavaMethod.getMember()) != null) {
                return new JvmFunctionSignature$JavaMethod(member);
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java method " + original);
        }
        if (!(original instanceof JavaClassConstructorDescriptor)) {
            return mapJvmFunctionSignature(original);
        }
        SourceElement source2 = ((JavaClassConstructorDescriptor) original).getSource();
        JavaSourceElement javaSourceElement2 = source2 instanceof JavaSourceElement ? (JavaSourceElement) source2 : null;
        JavaElement javaElement2 = javaSourceElement2 != null ? javaSourceElement2.getJavaElement() : null;
        if (javaElement2 instanceof ReflectJavaConstructor) {
            return new JvmFunctionSignature$JavaConstructor(((ReflectJavaConstructor) javaElement2).getMember());
        }
        if (javaElement2 instanceof ReflectJavaClass) {
            ReflectJavaClass reflectJavaClass = (ReflectJavaClass) javaElement2;
            if (reflectJavaClass.isAnnotationType()) {
                return new JvmFunctionSignature$FakeJavaAnnotationConstructor(reflectJavaClass.getElement());
            }
        }
        f$$ExternalSyntheticLambda0.m$2("Incorrect resolution sequence for Java constructor ", original, " (", javaElement2);
        return null;
    }
}
