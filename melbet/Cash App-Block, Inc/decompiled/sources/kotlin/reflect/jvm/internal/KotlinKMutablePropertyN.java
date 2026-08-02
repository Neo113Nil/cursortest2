package kotlin.reflect.jvm.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KotlinKProperty;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;

/* loaded from: classes9.dex */
public final class KotlinKMutablePropertyN extends KotlinKPropertyN implements KMutableProperty {
    public final Lazy setter$delegate;

    public KotlinKMutablePropertyN(KDeclarationContainerImpl kDeclarationContainerImpl, String str, Object obj, KmProperty kmProperty) {
        super(kDeclarationContainerImpl, str, obj, kmProperty);
        this.setter$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ConvertFromJavaKt$$Lambda$4(this, 27));
    }

    @Override // kotlin.reflect.KMutableProperty
    public final KMutableProperty.Setter getSetter() {
        return (Setter) this.setter$delegate.getValue();
    }

    public final class Setter extends KotlinKProperty.Setter {
        public final KotlinKMutablePropertyN property;

        public Setter(KotlinKMutablePropertyN kotlinKMutablePropertyN) {
            this.property = kotlinKMutablePropertyN;
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
}
