package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;

/* loaded from: classes9.dex */
public interface JavaClassesTracker {

    public static final class Default implements JavaClassesTracker {
        public static final Default INSTANCE = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker
        public void reportClass(JavaClassDescriptor javaClassDescriptor) {
            javaClassDescriptor.getClass();
        }
    }

    void reportClass(JavaClassDescriptor javaClassDescriptor);
}
