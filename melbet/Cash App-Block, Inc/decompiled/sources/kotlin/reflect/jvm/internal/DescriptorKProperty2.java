package kotlin.reflect.jvm.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CallableReference;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty2;
import kotlin.reflect.jvm.internal.DescriptorKProperty;
import kotlin.reflect.jvm.internal.DescriptorKProperty2;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* loaded from: classes3.dex */
public class DescriptorKProperty2 extends DescriptorKProperty implements KProperty2 {
    public final Lazy delegateSource;
    public final Lazy getter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKProperty2(KDeclarationContainerImpl kDeclarationContainerImpl, PropertyDescriptor propertyDescriptor, KCallableOverriddenStorage kCallableOverriddenStorage) {
        super(kDeclarationContainerImpl, propertyDescriptor, kCallableOverriddenStorage);
        kDeclarationContainerImpl.getClass();
        propertyDescriptor.getClass();
        kCallableOverriddenStorage.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        final int i = 0;
        this.getter$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty2$$Lambda$0
            public final DescriptorKProperty2 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DescriptorKProperty2 descriptorKProperty2 = this.arg$0;
                switch (i2) {
                    case 0:
                        return new DescriptorKProperty2.Getter(descriptorKProperty2);
                    default:
                        return descriptorKProperty2.computeDelegateSource();
                }
            }
        });
        final int i2 = 1;
        this.delegateSource = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty2$$Lambda$0
            public final DescriptorKProperty2 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DescriptorKProperty2 descriptorKProperty2 = this.arg$0;
                switch (i22) {
                    case 0:
                        return new DescriptorKProperty2.Getter(descriptorKProperty2);
                    default:
                        return descriptorKProperty2.computeDelegateSource();
                }
            }
        });
    }

    @Override // kotlin.reflect.KProperty
    public final KProperty.Getter getGetter() {
        return (Getter) this.getter$delegate.getValue();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Getter) this.getter$delegate.getValue()).call(obj, obj2);
    }

    @Override // kotlin.reflect.jvm.internal.DescriptorKCallable
    public DescriptorKProperty2 shallowCopy$kotlin_reflection(KCallableOverriddenStorage kCallableOverriddenStorage) {
        return new DescriptorKProperty2(this.container, getDescriptor(), kCallableOverriddenStorage);
    }

    /* loaded from: classes9.dex */
    public final class Getter extends DescriptorKProperty.Getter implements Function2 {
        public final DescriptorKProperty2 property;

        public Getter(DescriptorKProperty2 descriptorKProperty2) {
            this.property = descriptorKProperty2;
        }

        @Override // kotlin.reflect.KProperty.Accessor
        public final KProperty getProperty() {
            return this.property;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((Getter) this.property.getter$delegate.getValue()).call(obj, obj2);
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

    @Override // kotlin.reflect.jvm.internal.DescriptorKProperty, kotlin.reflect.KProperty
    public final Getter getGetter() {
        return (Getter) this.getter$delegate.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKProperty2(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2) {
        super(kDeclarationContainerImpl, str, str2, CallableReference.NO_RECEIVER);
        str.getClass();
        str2.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        final int i = 0;
        this.getter$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty2$$Lambda$0
            public final DescriptorKProperty2 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i;
                DescriptorKProperty2 descriptorKProperty2 = this.arg$0;
                switch (i22) {
                    case 0:
                        return new DescriptorKProperty2.Getter(descriptorKProperty2);
                    default:
                        return descriptorKProperty2.computeDelegateSource();
                }
            }
        });
        final int i2 = 1;
        this.delegateSource = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty2$$Lambda$0
            public final DescriptorKProperty2 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DescriptorKProperty2 descriptorKProperty2 = this.arg$0;
                switch (i22) {
                    case 0:
                        return new DescriptorKProperty2.Getter(descriptorKProperty2);
                    default:
                        return descriptorKProperty2.computeDelegateSource();
                }
            }
        });
    }
}
