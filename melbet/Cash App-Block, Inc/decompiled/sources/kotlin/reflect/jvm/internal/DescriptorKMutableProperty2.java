package kotlin.reflect.jvm.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.DescriptorKProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* loaded from: classes9.dex */
public final class DescriptorKMutableProperty2 extends DescriptorKProperty2 implements KMutableProperty {
    public final Lazy setter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKMutableProperty2(KDeclarationContainerImpl kDeclarationContainerImpl, PropertyDescriptor propertyDescriptor, KCallableOverriddenStorage kCallableOverriddenStorage) {
        super(kDeclarationContainerImpl, propertyDescriptor, kCallableOverriddenStorage);
        kDeclarationContainerImpl.getClass();
        propertyDescriptor.getClass();
        kCallableOverriddenStorage.getClass();
        this.setter$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ConvertFromJavaKt$$Lambda$4(this, 19));
    }

    @Override // kotlin.reflect.KMutableProperty
    public final KMutableProperty.Setter getSetter() {
        return (Setter) this.setter$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.DescriptorKProperty2, kotlin.reflect.jvm.internal.DescriptorKCallable
    public final DescriptorKCallable shallowCopy$kotlin_reflection(KCallableOverriddenStorage kCallableOverriddenStorage) {
        return new DescriptorKMutableProperty2(this.container, getDescriptor(), kCallableOverriddenStorage);
    }

    public final class Setter extends DescriptorKProperty.Setter implements Function3 {
        public final DescriptorKMutableProperty2 property;

        public Setter(DescriptorKMutableProperty2 descriptorKMutableProperty2) {
            this.property = descriptorKMutableProperty2;
        }

        @Override // kotlin.reflect.KProperty.Accessor
        public final KProperty getProperty() {
            return this.property;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            ((Setter) this.property.setter$delegate.getValue()).call(obj, obj2, obj3);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, kotlin.reflect.KProperty.Accessor
        public final DescriptorKProperty getProperty() {
            return this.property;
        }
    }

    @Override // kotlin.reflect.jvm.internal.DescriptorKProperty2, kotlin.reflect.jvm.internal.DescriptorKCallable
    public final DescriptorKProperty2 shallowCopy$kotlin_reflection(KCallableOverriddenStorage kCallableOverriddenStorage) {
        return new DescriptorKMutableProperty2(this.container, getDescriptor(), kCallableOverriddenStorage);
    }
}
