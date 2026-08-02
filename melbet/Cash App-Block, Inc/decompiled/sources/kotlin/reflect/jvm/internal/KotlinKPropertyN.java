package kotlin.reflect.jvm.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KotlinKProperty;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;

/* loaded from: classes9.dex */
public class KotlinKPropertyN extends KotlinKProperty {
    public final Lazy getter$delegate;

    public KotlinKPropertyN(KDeclarationContainerImpl kDeclarationContainerImpl, String str, Object obj, KmProperty kmProperty) {
        super(kDeclarationContainerImpl, str, obj, kmProperty);
        this.getter$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new KotlinKPropertyN$$Lambda$0(this, 0));
    }

    @Override // kotlin.reflect.KProperty
    public final KProperty.Getter getGetter() {
        return (Getter) this.getter$delegate.getValue();
    }

    public final class Getter extends KotlinKProperty.Getter {
        public final KotlinKPropertyN property;

        public Getter(KotlinKPropertyN kotlinKPropertyN) {
            this.property = kotlinKPropertyN;
        }

        @Override // kotlin.reflect.KProperty.Accessor
        public final KProperty getProperty() {
            return this.property;
        }

        @Override // kotlin.reflect.jvm.internal.KotlinKProperty.Accessor, kotlin.reflect.KProperty.Accessor
        public final KotlinKProperty getProperty() {
            return this.property;
        }
    }

    @Override // kotlin.reflect.jvm.internal.KotlinKProperty, kotlin.reflect.KProperty
    public final KotlinKProperty.Getter getGetter() {
        return (Getter) this.getter$delegate.getValue();
    }
}
