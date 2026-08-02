package kotlin.reflect;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.slf4j.Marker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/KTypeProjection;", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class KTypeProjection {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final KTypeProjection star = new KTypeProjection(null, null);

    /* renamed from: type, reason: collision with root package name */
    public final KType f1521type;
    public final KVariance variance;

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static KTypeProjection getSTAR() {
            return KTypeProjection.star;
        }

        public static KTypeProjection invariant(KType kType) {
            kType.getClass();
            return new KTypeProjection(kType, KVariance.INVARIANT);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                KVariance kVariance = KVariance.INVARIANT;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KVariance kVariance2 = KVariance.INVARIANT;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KVariance kVariance3 = KVariance.INVARIANT;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public KTypeProjection(KType kType, KVariance kVariance) {
        String str;
        this.variance = kVariance;
        this.f1521type = kType;
        if ((kVariance == null) == (kType == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) str);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) obj;
        return this.variance == kTypeProjection.variance && Intrinsics.areEqual(this.f1521type, kTypeProjection.f1521type);
    }

    /* renamed from: getType, reason: from getter */
    public final KType getF1521type() {
        return this.f1521type;
    }

    public final KVariance getVariance() {
        return this.variance;
    }

    public final int hashCode() {
        KVariance kVariance = this.variance;
        int hashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        KType kType = this.f1521type;
        return hashCode + (kType != null ? kType.hashCode() : 0);
    }

    public final String toString() {
        KVariance kVariance = this.variance;
        int i = kVariance == null ? -1 : WhenMappings.$EnumSwitchMapping$0[kVariance.ordinal()];
        if (i == -1) {
            return Marker.ANY_MARKER;
        }
        KType kType = this.f1521type;
        if (i == 1) {
            return String.valueOf(kType);
        }
        if (i == 2) {
            return "in " + kType;
        }
        if (i != 3) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        return "out " + kType;
    }
}
