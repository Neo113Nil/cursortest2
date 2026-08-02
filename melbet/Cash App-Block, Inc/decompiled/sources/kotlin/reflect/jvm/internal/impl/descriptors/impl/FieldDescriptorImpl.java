package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* loaded from: classes9.dex */
public final class FieldDescriptorImpl extends AnnotatedImpl implements FieldDescriptor {
    public final PropertyDescriptor correspondingProperty;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldDescriptorImpl(Annotations annotations, PropertyDescriptor propertyDescriptor) {
        super(annotations);
        annotations.getClass();
        propertyDescriptor.getClass();
        this.correspondingProperty = propertyDescriptor;
    }
}
