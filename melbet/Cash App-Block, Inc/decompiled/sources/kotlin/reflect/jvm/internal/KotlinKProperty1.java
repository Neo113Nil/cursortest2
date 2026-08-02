package kotlin.reflect.jvm.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty1;
import kotlin.reflect.jvm.internal.KotlinKProperty;
import kotlin.reflect.jvm.internal.KotlinKProperty1;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;

/* loaded from: classes9.dex */
public class KotlinKProperty1 extends KotlinKProperty implements KProperty1 {
    public final Lazy delegateSource;
    public final Lazy getter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinKProperty1(KDeclarationContainerImpl kDeclarationContainerImpl, String str, Object obj, KmProperty kmProperty) {
        super(kDeclarationContainerImpl, str, obj, kmProperty);
        str.getClass();
        kmProperty.getClass();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        final int i = 0;
        this.getter$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KotlinKProperty1$$Lambda$0
            public final KotlinKProperty1 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                KotlinKProperty1 kotlinKProperty1 = this.arg$0;
                switch (i2) {
                    case 0:
                        return new KotlinKProperty1.Getter(kotlinKProperty1);
                    default:
                        return kotlinKProperty1.computeDelegateSource();
                }
            }
        });
        final int i2 = 1;
        this.delegateSource = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KotlinKProperty1$$Lambda$0
            public final KotlinKProperty1 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                KotlinKProperty1 kotlinKProperty1 = this.arg$0;
                switch (i22) {
                    case 0:
                        return new KotlinKProperty1.Getter(kotlinKProperty1);
                    default:
                        return kotlinKProperty1.computeDelegateSource();
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

    public final class Getter extends KotlinKProperty.Getter implements KProperty1.Getter {
        public final KotlinKProperty1 property;

        public Getter(KotlinKProperty1 kotlinKProperty1) {
            this.property = kotlinKProperty1;
        }

        @Override // kotlin.reflect.KProperty.Accessor
        public final KProperty getProperty() {
            return this.property;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return this.property.get(obj);
        }

        @Override // kotlin.reflect.jvm.internal.KotlinKProperty.Accessor, kotlin.reflect.KProperty.Accessor
        public final KotlinKProperty getProperty() {
            return this.property;
        }
    }

    @Override // kotlin.reflect.KProperty
    public final KProperty1.Getter getGetter() {
        return (Getter) this.getter$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.KotlinKProperty, kotlin.reflect.KProperty
    public final KotlinKProperty.Getter getGetter() {
        return (Getter) this.getter$delegate.getValue();
    }
}
