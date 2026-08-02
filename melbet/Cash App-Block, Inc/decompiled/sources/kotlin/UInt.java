package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class UInt implements Comparable {
    public static final Companion Companion = new Companion(null);
    public final int data;

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.compare(this.data ^ PKIFailureInfo.systemUnavail, ((UInt) obj).data ^ PKIFailureInfo.systemUnavail);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UInt) {
            return this.data == ((UInt) obj).data;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.data);
    }

    public final String toString() {
        return String.valueOf(this.data & BodyPartID.bodyIdMax);
    }
}
