package kotlin.jvm.internal;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClassifier;
import kotlin.reflect.jvm.internal.KTypeParameterImpl;
import kotlin.reflect.jvm.internal.KTypeParameterOwnerImpl;
import papa.Choreographers$$ExternalSyntheticLambda1;

/* loaded from: classes9.dex */
public abstract class KTypeParameterBase implements KClassifier {
    public final Object container;
    public final Lazy javaContainingDeclaration$delegate;

    public KTypeParameterBase(KTypeParameterOwnerImpl kTypeParameterOwnerImpl) {
        kTypeParameterOwnerImpl.getClass();
        this.container = kTypeParameterOwnerImpl;
        this.javaContainingDeclaration$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Choreographers$$ExternalSyntheticLambda1(this, 16));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof KTypeParameterBase)) {
            return false;
        }
        KTypeParameterBase kTypeParameterBase = (KTypeParameterBase) obj;
        return Intrinsics.areEqual(((KTypeParameterImpl) this).name, ((KTypeParameterImpl) kTypeParameterBase).name) && Intrinsics.areEqual(this.container, kTypeParameterBase.container);
    }

    public abstract List getUpperBounds();

    public final int hashCode() {
        return ((KTypeParameterImpl) this).name.hashCode() + (this.container.hashCode() * 31);
    }

    public final String toString() {
        TypeParameterReference.Companion.getClass();
        StringBuilder sb = new StringBuilder();
        KTypeParameterImpl kTypeParameterImpl = (KTypeParameterImpl) this;
        int ordinal = kTypeParameterImpl.variance.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                sb.append("in ");
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                sb.append("out ");
            }
        }
        sb.append(kTypeParameterImpl.name);
        return sb.toString();
    }
}
