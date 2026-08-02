package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.hpke.HPKE;

/* loaded from: classes.dex */
public final class UShort implements Comparable {
    public static final Companion Companion = new Companion(null);
    public final short data;

    public final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.compare(this.data & HPKE.aead_EXPORT_ONLY, ((UShort) obj).data & HPKE.aead_EXPORT_ONLY);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UShort) {
            return this.data == ((UShort) obj).data;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.data);
    }

    public final String toString() {
        return String.valueOf(this.data & HPKE.aead_EXPORT_ONLY);
    }
}
