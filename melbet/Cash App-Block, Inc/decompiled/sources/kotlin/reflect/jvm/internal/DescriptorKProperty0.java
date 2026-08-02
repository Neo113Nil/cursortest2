package kotlin.reflect.jvm.internal;

import com.google.maps.android.compose.InputHandlerKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty0;
import kotlin.reflect.jvm.internal.DescriptorKProperty;
import kotlin.reflect.jvm.internal.DescriptorKProperty0;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

/* loaded from: classes9.dex */
public class DescriptorKProperty0 extends DescriptorKProperty implements KProperty0 {
    public final Lazy delegateValue;
    public final Lazy getter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKProperty0(KDeclarationContainerImpl kDeclarationContainerImpl, PropertyDescriptor propertyDescriptor, KCallableOverriddenStorage kCallableOverriddenStorage) {
        super(kDeclarationContainerImpl, propertyDescriptor, kCallableOverriddenStorage);
        kDeclarationContainerImpl.getClass();
        propertyDescriptor.getClass();
        kCallableOverriddenStorage.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        final int i = 0;
        this.getter$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty0$$Lambda$0
            public final DescriptorKProperty0 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DescriptorKProperty0 descriptorKProperty0 = this.arg$0;
                switch (i2) {
                    case 0:
                        return new DescriptorKProperty0.Getter(descriptorKProperty0);
                    default:
                        return InputHandlerKt.getDelegateImpl(descriptorKProperty0, descriptorKProperty0.computeDelegateSource());
                }
            }
        });
        final int i2 = 1;
        this.delegateValue = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty0$$Lambda$0
            public final DescriptorKProperty0 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DescriptorKProperty0 descriptorKProperty0 = this.arg$0;
                switch (i22) {
                    case 0:
                        return new DescriptorKProperty0.Getter(descriptorKProperty0);
                    default:
                        return InputHandlerKt.getDelegateImpl(descriptorKProperty0, descriptorKProperty0.computeDelegateSource());
                }
            }
        });
    }

    @Override // kotlin.reflect.KProperty0
    public final Object get() {
        return ((Getter) this.getter$delegate.getValue()).call(new Object[0]);
    }

    @Override // kotlin.reflect.KProperty
    public final KProperty.Getter getGetter() {
        return (Getter) this.getter$delegate.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return get();
    }

    @Override // kotlin.reflect.jvm.internal.DescriptorKCallable
    public DescriptorKProperty0 shallowCopy$kotlin_reflection(KCallableOverriddenStorage kCallableOverriddenStorage) {
        return new DescriptorKProperty0(this.container, getDescriptor(), kCallableOverriddenStorage);
    }

    public final class Getter extends DescriptorKProperty.Getter implements KProperty0.Getter {
        public final DescriptorKProperty0 property;

        public Getter(DescriptorKProperty0 descriptorKProperty0) {
            this.property = descriptorKProperty0;
        }

        @Override // kotlin.reflect.KProperty.Accessor
        public final KProperty getProperty() {
            return this.property;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.property.get();
        }

        @Override // kotlin.reflect.jvm.internal.DescriptorKProperty.Accessor, kotlin.reflect.KProperty.Accessor
        public final DescriptorKProperty getProperty() {
            return this.property;
        }
    }

    @Override // kotlin.reflect.KProperty
    public final KProperty0.Getter getGetter() {
        return (Getter) this.getter$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.DescriptorKProperty, kotlin.reflect.KProperty
    public final DescriptorKProperty.Getter getGetter() {
        return (Getter) this.getter$delegate.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKProperty0(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        super(kDeclarationContainerImpl, str, str2, obj);
        str.getClass();
        str2.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        final int i = 0;
        this.getter$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty0$$Lambda$0
            public final DescriptorKProperty0 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i;
                DescriptorKProperty0 descriptorKProperty0 = this.arg$0;
                switch (i22) {
                    case 0:
                        return new DescriptorKProperty0.Getter(descriptorKProperty0);
                    default:
                        return InputHandlerKt.getDelegateImpl(descriptorKProperty0, descriptorKProperty0.computeDelegateSource());
                }
            }
        });
        final int i2 = 1;
        this.delegateValue = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKProperty0$$Lambda$0
            public final DescriptorKProperty0 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DescriptorKProperty0 descriptorKProperty0 = this.arg$0;
                switch (i22) {
                    case 0:
                        return new DescriptorKProperty0.Getter(descriptorKProperty0);
                    default:
                        return InputHandlerKt.getDelegateImpl(descriptorKProperty0, descriptorKProperty0.computeDelegateSource());
                }
            }
        });
    }
}
