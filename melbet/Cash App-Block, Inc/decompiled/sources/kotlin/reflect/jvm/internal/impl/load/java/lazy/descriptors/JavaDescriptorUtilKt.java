package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* loaded from: classes9.dex */
public final class JavaDescriptorUtilKt {
    public static final boolean isJavaField(PropertyDescriptor propertyDescriptor) {
        propertyDescriptor.getClass();
        return propertyDescriptor.getGetter() == null;
    }
}
