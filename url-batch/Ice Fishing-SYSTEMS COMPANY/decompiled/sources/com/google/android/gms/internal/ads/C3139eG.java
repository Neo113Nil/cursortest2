package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.eG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3139eG extends AbstractC4000uE {

    /* renamed from: a, reason: collision with root package name */
    public final CG f30340a;

    public C3139eG(CG cg) {
        this.f30340a = cg;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4000uE
    public final boolean a() {
        return this.f30340a.f24159b.C() != EI.RAW;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3139eG)) {
            return false;
        }
        CG cg = ((C3139eG) obj).f30340a;
        CG cg2 = this.f30340a;
        if (cg2.f24159b.C().equals(cg.f24159b.C())) {
            C3573mI c3573mI = cg2.f24159b;
            String A8 = c3573mI.A();
            C3573mI c3573mI2 = cg.f24159b;
            if (A8.equals(c3573mI2.A()) && c3573mI.B().equals(c3573mI2.B())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        CG cg = this.f30340a;
        return Objects.hash(cg.f24159b, cg.f24158a);
    }

    public final String toString() {
        CG cg = this.f30340a;
        String A8 = cg.f24159b.A();
        int ordinal = cg.f24159b.C().ordinal();
        return D.y.l("(typeUrl=", A8, ", outputPrefixType=", ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }
}
