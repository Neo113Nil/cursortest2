package kotlin.reflect.jvm.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KotlinKProperty;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;

/* loaded from: classes9.dex */
public final class KotlinKMutableProperty0 extends KotlinKProperty0 implements KMutableProperty0 {
    public final Lazy setter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinKMutableProperty0(KDeclarationContainerImpl kDeclarationContainerImpl, String str, Object obj, KmProperty kmProperty) {
        super(kDeclarationContainerImpl, str, obj, kmProperty);
        kDeclarationContainerImpl.getClass();
        str.getClass();
        kmProperty.getClass();
        this.setter$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ConvertFromJavaKt$$Lambda$4(this, 25));
    }

    @Override // kotlin.reflect.KMutableProperty
    public final KMutableProperty.Setter getSetter() {
        return (Setter) this.setter$delegate.getValue();
    }

    public final class Setter extends KotlinKProperty.Setter implements KMutableProperty0.Setter {
        public final KotlinKMutableProperty0 property;

        public Setter(KotlinKMutableProperty0 kotlinKMutableProperty0) {
            this.property = kotlinKMutableProperty0;
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

        @Override // kotlin.reflect.jvm.internal.KotlinKProperty.Accessor, kotlin.reflect.KProperty.Accessor
        public final KotlinKProperty getProperty() {
            return this.property;
        }
    }

    @Override // kotlin.reflect.KMutableProperty0, kotlin.reflect.KMutableProperty
    public final KMutableProperty0.Setter getSetter() {
        return (Setter) this.setter$delegate.getValue();
    }
}
