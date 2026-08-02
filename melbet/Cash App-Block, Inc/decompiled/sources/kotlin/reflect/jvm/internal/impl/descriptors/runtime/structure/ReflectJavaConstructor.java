package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;

/* loaded from: classes9.dex */
public final class ReflectJavaConstructor extends ReflectJavaMember implements JavaConstructor {
    public final Constructor member;

    public ReflectJavaConstructor(Constructor<?> constructor) {
        constructor.getClass();
        this.member = constructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    public List<ReflectJavaTypeParameter> getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = getMember().getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor
    public List<JavaValueParameter> getValueParameters() {
        Type[] genericParameterTypes = getMember().getGenericParameterTypes();
        genericParameterTypes.getClass();
        if (genericParameterTypes.length == 0) {
            return EmptyList.INSTANCE;
        }
        Class<?> declaringClass = getMember().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) ArraysKt___ArraysJvmKt.copyOfRange(1, genericParameterTypes.length, genericParameterTypes);
        }
        Annotation[][] parameterAnnotations = getMember().getParameterAnnotations();
        if (parameterAnnotations.length < genericParameterTypes.length) {
            a$$ExternalSyntheticBUOutline0.m$2(getMember(), "Illegal generic signature: ");
            return null;
        }
        if (parameterAnnotations.length > genericParameterTypes.length) {
            parameterAnnotations = (Annotation[][]) ArraysKt___ArraysJvmKt.copyOfRange(parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length, parameterAnnotations);
        }
        parameterAnnotations.getClass();
        return getValueParameters(genericParameterTypes, parameterAnnotations, getMember().isVarArgs());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    public Constructor<?> getMember() {
        return this.member;
    }
}
