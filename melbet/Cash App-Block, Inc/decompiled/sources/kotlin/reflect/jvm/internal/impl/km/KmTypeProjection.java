package kotlin.reflect.jvm.internal.impl.km;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class KmTypeProjection {
    public static final Companion Companion = new Companion(null);
    public static final KmTypeProjection STAR = new KmTypeProjection(null, null);

    /* renamed from: type, reason: collision with root package name */
    public final KmType f1528type;
    public final KmVariance variance;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public KmTypeProjection(KmVariance kmVariance, KmType kmType) {
        this.variance = kmVariance;
        this.f1528type = kmType;
    }

    public final KmVariance component1() {
        return this.variance;
    }

    public final KmType component2() {
        return this.f1528type;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KmTypeProjection)) {
            return false;
        }
        KmTypeProjection kmTypeProjection = (KmTypeProjection) obj;
        return this.variance == kmTypeProjection.variance && Intrinsics.areEqual(this.f1528type, kmTypeProjection.f1528type);
    }

    public final KmType getType() {
        return this.f1528type;
    }

    public final KmVariance getVariance() {
        return this.variance;
    }

    public int hashCode() {
        KmVariance kmVariance = this.variance;
        int hashCode = (kmVariance == null ? 0 : kmVariance.hashCode()) * 31;
        KmType kmType = this.f1528type;
        return hashCode + (kmType != null ? kmType.hashCode() : 0);
    }

    public String toString() {
        return "KmTypeProjection(variance=" + this.variance + ", type=" + this.f1528type + ')';
    }
}
