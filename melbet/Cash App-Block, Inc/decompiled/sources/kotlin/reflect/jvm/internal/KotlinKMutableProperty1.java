package kotlin.reflect.jvm.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KotlinKProperty;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;

/* loaded from: classes9.dex */
public final class KotlinKMutableProperty1 extends KotlinKProperty1 implements KMutableProperty1 {
    public final Lazy setter$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinKMutableProperty1(KDeclarationContainerImpl kDeclarationContainerImpl, String str, Object obj, KmProperty kmProperty) {
        super(kDeclarationContainerImpl, str, obj, kmProperty);
        str.getClass();
        kmProperty.getClass();
        this.setter$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ConvertFromJavaKt$$Lambda$4(this, 26));
    }

    @Override // kotlin.reflect.KMutableProperty
    public final KMutableProperty.Setter getSetter() {
        return (Setter) this.setter$delegate.getValue();
    }

    @Override // kotlin.reflect.KMutableProperty1
    public final void set(Object obj, Object obj2) {
        ((Setter) this.setter$delegate.getValue()).call(obj, obj2);
    }

    public final class Setter extends KotlinKProperty.Setter implements KMutableProperty1.Setter {
        public final KotlinKMutableProperty1 property;

        public Setter(KotlinKMutableProperty1 kotlinKMutableProperty1) {
            this.property = kotlinKMutableProperty1;
        }

        @Override // kotlin.reflect.KProperty.Accessor
        public final KProperty getProperty() {
            return this.property;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            this.property.set(obj, obj2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.KotlinKProperty.Accessor, kotlin.reflect.KProperty.Accessor
        public final KotlinKProperty getProperty() {
            return this.property;
        }
    }

    @Override // kotlin.reflect.KMutableProperty1, kotlin.reflect.KMutableProperty
    public final KMutableProperty1.Setter getSetter() {
        return (Setter) this.setter$delegate.getValue();
    }
}
