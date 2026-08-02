package kotlin.reflect.jvm.internal;

import com.google.maps.android.compose.InputHandlerKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty0;
import kotlin.reflect.jvm.internal.KotlinKProperty;
import kotlin.reflect.jvm.internal.KotlinKProperty0;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;

/* loaded from: classes9.dex */
public class KotlinKProperty0 extends KotlinKProperty implements KProperty0 {
    public final Lazy delegateValue;
    public final Lazy getter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinKProperty0(KDeclarationContainerImpl kDeclarationContainerImpl, String str, Object obj, KmProperty kmProperty) {
        super(kDeclarationContainerImpl, str, obj, kmProperty);
        kDeclarationContainerImpl.getClass();
        str.getClass();
        kmProperty.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        final int i = 0;
        this.getter$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KotlinKProperty0$$Lambda$0
            public final KotlinKProperty0 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                KotlinKProperty0 kotlinKProperty0 = this.arg$0;
                switch (i2) {
                    case 0:
                        return new KotlinKProperty0.Getter(kotlinKProperty0);
                    default:
                        return InputHandlerKt.getDelegateImpl(kotlinKProperty0, kotlinKProperty0.computeDelegateSource());
                }
            }
        });
        final int i2 = 1;
        this.delegateValue = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KotlinKProperty0$$Lambda$0
            public final KotlinKProperty0 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                KotlinKProperty0 kotlinKProperty0 = this.arg$0;
                switch (i22) {
                    case 0:
                        return new KotlinKProperty0.Getter(kotlinKProperty0);
                    default:
                        return InputHandlerKt.getDelegateImpl(kotlinKProperty0, kotlinKProperty0.computeDelegateSource());
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

    public final class Getter extends KotlinKProperty.Getter implements KProperty0.Getter {
        public final KotlinKProperty0 property;

        public Getter(KotlinKProperty0 kotlinKProperty0) {
            this.property = kotlinKProperty0;
        }

        @Override // kotlin.reflect.KProperty.Accessor
        public final KProperty getProperty() {
            return this.property;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.property.get();
        }

        @Override // kotlin.reflect.jvm.internal.KotlinKProperty.Accessor, kotlin.reflect.KProperty.Accessor
        public final KotlinKProperty getProperty() {
            return this.property;
        }
    }

    @Override // kotlin.reflect.KProperty
    public final KProperty0.Getter getGetter() {
        return (Getter) this.getter$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.KotlinKProperty, kotlin.reflect.KProperty
    public final KotlinKProperty.Getter getGetter() {
        return (Getter) this.getter$delegate.getValue();
    }
}
