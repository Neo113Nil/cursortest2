package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cju extends cri {
    public static final Parcelable.Creator CREATOR = new cjv();
    private static final String[] p = new String[0];
    public final ckr a;
    public final byte[] b;
    public final int[] c;
    public final String[] d;
    public final int[] e;
    public final byte[][] f;
    public final dbl[] g;
    public final boolean h;
    public ckp i;
    public final int j;
    public final ckj k;
    public ckd l;
    public final byte[] m;
    public final Long n;
    public final jol o;
    private final String[] q;

    public cju(ckr ckrVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, dbl[] dblVarArr, ckp ckpVar, String[] strArr2, int i, ckj ckjVar, ckd ckdVar, byte[] bArr3, Long l) {
        this.a = ckrVar;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.e = iArr2;
        this.f = bArr2;
        this.h = z;
        this.g = dblVarArr;
        this.i = ckpVar;
        this.q = strArr2;
        this.j = i;
        this.o = null;
        this.k = ckjVar;
        this.l = ckdVar;
        this.m = bArr3;
        this.n = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cju) {
            cju cjuVar = (cju) obj;
            if (Objects.equals(this.a, cjuVar.a) && Arrays.equals(this.b, cjuVar.b) && Arrays.equals(this.c, cjuVar.c) && Arrays.equals(this.d, cjuVar.d) && Objects.equals(this.o, cjuVar.o) && Arrays.equals(this.e, cjuVar.e) && Arrays.deepEquals(this.f, cjuVar.f) && Arrays.equals(this.g, cjuVar.g) && Arrays.equals(this.q, cjuVar.q) && this.h == cjuVar.h && Objects.equals(this.i, cjuVar.i) && this.j == cjuVar.j && Objects.equals(this.k, cjuVar.k) && Objects.equals(this.l, cjuVar.l) && Arrays.equals(this.m, cjuVar.m) && Objects.equals(this.n, cjuVar.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.o, this.e, this.f, this.g, Boolean.valueOf(this.h), this.q, this.i, Integer.valueOf(this.j), this.k, this.l, this.m, this.n});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.a);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.b;
        sb.append(bArr == null ? null : new String(bArr, StandardCharsets.UTF_8));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.c));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.d));
        sb.append(", LogEvent: ");
        sb.append(this.o);
        sb.append(", , ExperimentIDs: ");
        sb.append(Arrays.toString(this.e));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.deepToString(this.f));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.g));
        sb.append(", MendelPackagesToFilter: ");
        sb.append(Arrays.toString(this.q));
        sb.append("AddPhenotypeExperimentTokens: ");
        sb.append(this.h);
        sb.append(", LogVerifierResult: ");
        ckp ckpVar = this.i;
        sb.append(ckpVar != null ? ckpVar.toString() : null);
        sb.append("EventCode: ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.l);
        sb.append(", ");
        sb.append(Arrays.toString(this.m));
        sb.append(", ");
        sb.append(this.n);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 2, this.a, i);
        oy.A(parcel, 3, this.b);
        oy.D(parcel, 4, this.c);
        oy.J(parcel, 5, this.d);
        oy.D(parcel, 6, this.e);
        oy.B(parcel, 7, this.f);
        oy.s(parcel, 8, this.h);
        oy.L(parcel, 9, this.g, i);
        oy.H(parcel, 11, this.i, i);
        String[] strArr = this.q;
        if (strArr == null) {
            strArr = p;
        }
        oy.J(parcel, 12, strArr);
        oy.v(parcel, 13, this.j);
        oy.H(parcel, 14, this.k, i);
        oy.H(parcel, 15, this.l, i);
        oy.A(parcel, 16, this.m);
        oy.G(parcel, 17, this.n);
        oy.r(parcel, q);
    }

    public cju(ckr ckrVar, jol jolVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, dbl[] dblVarArr, String[] strArr2, int i, Long l) {
        this.a = ckrVar;
        this.o = jolVar;
        this.b = bArr;
        this.c = iArr;
        this.d = strArr;
        this.e = iArr2;
        this.f = null;
        this.g = dblVarArr;
        this.h = true;
        this.q = strArr2;
        this.j = i;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
    }
}
