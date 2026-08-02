package kotlin.reflect.jvm.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.DescriptorKProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* loaded from: classes9.dex */
public final class DescriptorKMutablePropertyN extends DescriptorKPropertyN implements KMutableProperty {
    public final Lazy setter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKMutablePropertyN(KDeclarationContainerImpl kDeclarationContainerImpl, PropertyDescriptor propertyDescriptor, KCallableOverriddenStorage kCallableOverriddenStorage) {
        super(kDeclarationContainerImpl, propertyDescriptor, kCallableOverriddenStorage);
        kDeclarationContainerImpl.getClass();
        propertyDescriptor.getClass();
        kCallableOverriddenStorage.getClass();
        this.setter$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ConvertFromJavaKt$$Lambda$4(this, 20));
    }

    @Override // kotlin.reflect.KMutableProperty
    public final KMutableProperty.Setter getSetter() {
        return (Setter) this.setter$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.DescriptorKPropertyN, kotlin.reflect.jvm.internal.DescriptorKCallable
    public final DescriptorKCallable shallowCopy$kotlin_reflection(KCallableOverriddenStorage kCallableOverriddenStorage) {
        return new DescriptorKMutablePropertyN(this.container, getDescriptor(), kCallableOverriddenStorage);
    }

    public final class Setter extends DescriptorKProperty.Setter {
        public final DescriptorKMutablePropertyN property;

        public Setter(DescriptorKMutablePropertyN descriptorKMutablePropertyN) {
            this.property = descriptorKMutablePropertyN;
        }

        @Override // kotlin.reflect.KProperty.Accessor
        public final KProperty getProperty() {
            return this.property;
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, kotlin.reflect.KProperty.Accessor
        public final DescriptorKProperty getProperty() {
            return this.property;
        }
    }

    @Override // kotlin.reflect.jvm.internal.DescriptorKPropertyN, kotlin.reflect.jvm.internal.DescriptorKCallable
    public final DescriptorKPropertyN shallowCopy$kotlin_reflection(KCallableOverriddenStorage kCallableOverriddenStorage) {
        return new DescriptorKMutablePropertyN(this.container, getDescriptor(), kCallableOverriddenStorage);
    }
}
