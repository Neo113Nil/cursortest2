package kotlin.reflect.jvm.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty1;
import kotlin.reflect.jvm.internal.DescriptorKProperty;
import kotlin.reflect.jvm.internal.DescriptorKProperty1;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* loaded from: classes9.dex */
public class DescriptorKProperty1 extends DescriptorKProperty implements KProperty1 {
    public final Lazy delegateSource;
    public final Lazy getter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKProperty1(KDeclarationContainerImpl kDeclarationContainerImpl, PropertyDescriptor propertyDescriptor, KCallableOverriddenStorage kCallableOverriddenStorage) {
        super(kDeclarationContainerImpl, propertyDescriptor, kCallableOverriddenStorage);
        kDeclarationContainerImpl.getClass();
        propertyDescriptor.getClass();
        kCallableOverriddenStorage.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        final int i = 0;
        this.getter$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty1$$Lambda$0
            public final DescriptorKProperty1 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DescriptorKProperty1 descriptorKProperty1 = this.arg$0;
                switch (i2) {
                    case 0:
                        return new DescriptorKProperty1.Getter(descriptorKProperty1);
                    default:
                        return descriptorKProperty1.computeDelegateSource();
                }
            }
        });
        final int i2 = 1;
        this.delegateSource = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty1$$Lambda$0
            public final DescriptorKProperty1 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DescriptorKProperty1 descriptorKProperty1 = this.arg$0;
                switch (i22) {
                    case 0:
                        return new DescriptorKProperty1.Getter(descriptorKProperty1);
                    default:
                        return descriptorKProperty1.computeDelegateSource();
                }
            }
        });
    }

    @Override // kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return ((Getter) this.getter$delegate.getValue()).call(obj);
    }

    @Override // kotlin.reflect.KProperty
    public final KProperty.Getter getGetter() {
        return (Getter) this.getter$delegate.getValue();
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // kotlin.reflect.jvm.internal.DescriptorKCallable
    public DescriptorKProperty1 shallowCopy$kotlin_reflection(KCallableOverriddenStorage kCallableOverriddenStorage) {
        return new DescriptorKProperty1(this.container, getDescriptor(), kCallableOverriddenStorage);
    }

    public final class Getter extends DescriptorKProperty.Getter implements KProperty1.Getter {
        public final DescriptorKProperty1 property;

        public Getter(DescriptorKProperty1 descriptorKProperty1) {
            this.property = descriptorKProperty1;
        }

        @Override // kotlin.reflect.KProperty.Accessor
        public final KProperty getProperty() {
            return this.property;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return this.property.get(obj);
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, kotlin.reflect.KProperty.Accessor
        public final DescriptorKProperty getProperty() {
            return this.property;
        }
    }

    @Override // kotlin.reflect.KProperty
    public final KProperty1.Getter getGetter() {
        return (Getter) this.getter$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.DescriptorKProperty, kotlin.reflect.KProperty
    public final DescriptorKProperty.Getter getGetter() {
        return (Getter) this.getter$delegate.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKProperty1(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        str.getClass();
        str2.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        final int i = 0;
        this.getter$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty1$$Lambda$0
            public final DescriptorKProperty1 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i;
                DescriptorKProperty1 descriptorKProperty1 = this.arg$0;
                switch (i22) {
                    case 0:
                        return new DescriptorKProperty1.Getter(descriptorKProperty1);
                    default:
                        return descriptorKProperty1.computeDelegateSource();
                }
            }
        });
        final int i2 = 1;
        this.delegateSource = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty1$$Lambda$0
            public final DescriptorKProperty1 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DescriptorKProperty1 descriptorKProperty1 = this.arg$0;
                switch (i22) {
                    case 0:
                        return new DescriptorKProperty1.Getter(descriptorKProperty1);
                    default:
                        return descriptorKProperty1.computeDelegateSource();
                }
            }
        });
    }
}
