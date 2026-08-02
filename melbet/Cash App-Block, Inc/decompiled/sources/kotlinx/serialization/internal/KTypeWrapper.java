package kotlinx.serialization.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public final class KTypeWrapper implements KType {
    public final KType origin;

    public KTypeWrapper(KType kType) {
        kType.getClass();
        this.origin = kType;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        KTypeWrapper kTypeWrapper = obj instanceof KTypeWrapper ? (KTypeWrapper) obj : null;
        KType kType = kTypeWrapper != null ? kTypeWrapper.origin : null;
        KType kType2 = this.origin;
        if (!Intrinsics.areEqual(kType2, kType)) {
            return false;
        }
        KClassifier classifier = kType2.getClassifier();
        if (classifier instanceof KClass) {
            KType kType3 = obj instanceof KType ? (KType) obj : null;
            KClassifier classifier2 = kType3 != null ? kType3.getClassifier() : null;
            if (classifier2 != null && (classifier2 instanceof KClass)) {
                return PapaEvent.getJavaClass((KClass) classifier).equals(PapaEvent.getJavaClass((KClass) classifier2));
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        return this.origin.getAnnotations();
    }

    @Override // kotlin.reflect.KType
    public final List getArguments() {
        return this.origin.getArguments();
    }

    @Override // kotlin.reflect.KType
    public final KClassifier getClassifier() {
        return this.origin.getClassifier();
    }

    public final int hashCode() {
        return this.origin.hashCode();
    }

    @Override // kotlin.reflect.KType
    public final boolean isMarkedNullable() {
        return this.origin.isMarkedNullable();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.origin;
    }
}
