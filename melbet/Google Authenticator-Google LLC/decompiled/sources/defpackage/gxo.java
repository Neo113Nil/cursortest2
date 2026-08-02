package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gxo {
    public final gvy a;
    public final SparseArray b;
    public final boolean c;
    public final float d;
    public final boolean e;
    public final hel f;

    public gxo(gvy gvyVar, SparseArray sparseArray, boolean z, float f, boolean z2, hel helVar) {
        this.a = gvyVar;
        this.b = sparseArray;
        this.c = z;
        this.d = f;
        this.e = z2;
        this.f = helVar;
    }

    public static gxn a() {
        gxn gxnVar = new gxn();
        gxnVar.d(false);
        gxnVar.e(new SparseArray());
        gxnVar.g(0.0f);
        gxnVar.c(false);
        int i = hel.d;
        gxnVar.b(his.a);
        return gxnVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gxo) {
            gxo gxoVar = (gxo) obj;
            if (this.a.equals(gxoVar.a) && this.b.equals(gxoVar.b) && this.c == gxoVar.c) {
                if (Float.floatToIntBits(this.d) == Float.floatToIntBits(gxoVar.d) && this.e == gxoVar.e && hnu.H(this.f, gxoVar.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.d)) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003);
    }

    public final String toString() {
        hel helVar = this.f;
        SparseArray sparseArray = this.b;
        return "TraceRecordWithMetadata{traceRecord=" + String.valueOf(this.a) + ", spanExtras=" + String.valueOf(sparseArray) + ", isPartialTrace=" + this.c + ", traceSamplingRate=" + this.d + ", enableTiktokTraceEmptyCheckFix=" + this.e + ", cuiMetadata=" + String.valueOf(helVar) + "}";
    }

    public gxo() {
        throw null;
    }
}
