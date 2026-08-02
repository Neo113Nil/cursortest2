package kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import papa.Choreographers$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public final class PolymorphicSerializer extends AbstractPolymorphicSerializer {
    public final List _annotations;
    public final KClass baseClass;
    public final Lazy descriptor$delegate;

    public PolymorphicSerializer(KClass kClass) {
        kClass.getClass();
        this.baseClass = kClass;
        this._annotations = EmptyList.INSTANCE;
        this.descriptor$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Choreographers$$ExternalSyntheticLambda1(this, 18));
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public final KClass getBaseClass() {
        return this.baseClass;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.descriptor$delegate.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.baseClass + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PolymorphicSerializer(KClass kClass, Annotation[] annotationArr) {
        this(kClass);
        kClass.getClass();
        List asList = Arrays.asList(annotationArr);
        asList.getClass();
        this._annotations = asList;
    }
}
