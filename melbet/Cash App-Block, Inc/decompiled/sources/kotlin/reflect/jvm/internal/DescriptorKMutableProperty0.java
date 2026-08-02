package kotlin.reflect.jvm.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.DescriptorKProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* loaded from: classes9.dex */
public final class DescriptorKMutableProperty0 extends DescriptorKProperty0 implements KMutableProperty0 {
    public final Lazy setter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKMutableProperty0(KDeclarationContainerImpl kDeclarationContainerImpl, PropertyDescriptor propertyDescriptor, KCallableOverriddenStorage kCallableOverriddenStorage) {
        super(kDeclarationContainerImpl, propertyDescriptor, kCallableOverriddenStorage);
        kDeclarationContainerImpl.getClass();
        propertyDescriptor.getClass();
        kCallableOverriddenStorage.getClass();
        this.setter$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ConvertFromJavaKt$$Lambda$4(this, 17));
    }

    @Override // kotlin.reflect.KMutableProperty
    public final KMutableProperty.Setter getSetter() {
        return (Setter) this.setter$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.DescriptorKProperty0, kotlin.reflect.jvm.internal.DescriptorKCallable
    public final DescriptorKCallable shallowCopy$kotlin_reflection(KCallableOverriddenStorage kCallableOverriddenStorage) {
        return new DescriptorKMutableProperty0(this.container, getDescriptor(), kCallableOverriddenStorage);
    }

    public final class Setter extends DescriptorKProperty.Setter implements KMutableProperty0.Setter {
        public final DescriptorKMutableProperty0 property;

        public Setter(DescriptorKMutableProperty0 descriptorKMutableProperty0) {
            this.property = descriptorKMutableProperty0;
        }

        @Override // kotlin.reflect.KProperty.Accessor
        public final KProperty getProperty() {
            return this.property;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ((Setter) this.property.setter$delegate.getValue()).call(obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, kotlin.reflect.KProperty.Accessor
        public final DescriptorKProperty getProperty() {
            return this.property;
        }
    }

    @Override // kotlin.reflect.KMutableProperty0, kotlin.reflect.KMutableProperty
    public final KMutableProperty0.Setter getSetter() {
        return (Setter) this.setter$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.DescriptorKProperty0, kotlin.reflect.jvm.internal.DescriptorKCallable
    public final DescriptorKProperty0 shallowCopy$kotlin_reflection(KCallableOverriddenStorage kCallableOverriddenStorage) {
        return new DescriptorKMutableProperty0(this.container, getDescriptor(), kCallableOverriddenStorage);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKMutableProperty0(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        str.getClass();
        str2.getClass();
        this.setter$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ConvertFromJavaKt$$Lambda$4(this, 17));
    }
}
