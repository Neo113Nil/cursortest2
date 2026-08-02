package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;

/* loaded from: classes9.dex */
public interface TypeParameterResolver {

    public static final class EMPTY implements TypeParameterResolver {
        public static final EMPTY INSTANCE = new EMPTY();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
        public TypeParameterDescriptor resolveTypeParameter(JavaTypeParameter javaTypeParameter) {
            javaTypeParameter.getClass();
            return null;
        }
    }

    TypeParameterDescriptor resolveTypeParameter(JavaTypeParameter javaTypeParameter);
}
