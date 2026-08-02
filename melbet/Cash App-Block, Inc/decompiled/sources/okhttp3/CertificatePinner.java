package okhttp3;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Set;
import kotlin.UnsignedKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CertificatePinner {
    public static final CertificatePinner DEFAULT = new CertificatePinner(CollectionsKt.toSet(new ArrayList()), null);
    public final UnsignedKt certificateChainCleaner;
    public final Set pins;

    public CertificatePinner(Set set, UnsignedKt unsignedKt) {
        set.getClass();
        this.pins = set;
        this.certificateChainCleaner = unsignedKt;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) obj;
        return Intrinsics.areEqual(certificatePinner.pins, this.pins) && Intrinsics.areEqual(certificatePinner.certificateChainCleaner, this.certificateChainCleaner);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1517, 41, this.pins);
        UnsignedKt unsignedKt = this.certificateChainCleaner;
        return m + (unsignedKt != null ? unsignedKt.hashCode() : 0);
    }
}
