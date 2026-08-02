package kotlin.reflect.jvm.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.DescriptorKProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* loaded from: classes9.dex */
public class DescriptorKPropertyN extends DescriptorKProperty {
    public final Lazy getter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKPropertyN(KDeclarationContainerImpl kDeclarationContainerImpl, PropertyDescriptor propertyDescriptor, KCallableOverriddenStorage kCallableOverriddenStorage) {
        super(kDeclarationContainerImpl, propertyDescriptor, kCallableOverriddenStorage);
        kDeclarationContainerImpl.getClass();
        propertyDescriptor.getClass();
        kCallableOverriddenStorage.getClass();
        this.getter$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ConvertFromJavaKt$$Lambda$4(this, 22));
    }

    @Override // kotlin.reflect.KProperty
    public final KProperty.Getter getGetter() {
        return (Getter) this.getter$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.DescriptorKCallable
    public DescriptorKPropertyN shallowCopy$kotlin_reflection(KCallableOverriddenStorage kCallableOverriddenStorage) {
        return new DescriptorKPropertyN(this.container, getDescriptor(), kCallableOverriddenStorage);
    }

    public final class Getter extends DescriptorKProperty.Getter {
        public final DescriptorKPropertyN property;

        public Getter(DescriptorKPropertyN descriptorKPropertyN) {
            this.property = descriptorKPropertyN;
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

    @Override // kotlin.reflect.jvm.internal.DescriptorKProperty, kotlin.reflect.KProperty
    public final DescriptorKProperty.Getter getGetter() {
        return (Getter) this.getter$delegate.getValue();
    }
}
