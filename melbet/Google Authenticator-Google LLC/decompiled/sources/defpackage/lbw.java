package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbw {
    public static final ldb a = new ldb("CLOSED");

    public static final Object a(lbx lbxVar, long j, krx krxVar) {
        while (true) {
            long j2 = lbxVar.b;
            if (j2 >= j && !lbxVar.t()) {
                return lbxVar;
            }
            Object l = lbxVar.l();
            ldb ldbVar = a;
            if (l == ldbVar) {
                return ldbVar;
            }
            lbx lbxVar2 = (lbx) l;
            if (lbxVar2 != null) {
                lbxVar = lbxVar2;
            } else {
                lbx lbxVar3 = (lbx) krxVar.a(Long.valueOf(j2 + 1), lbxVar);
                if (lbxVar.a.d(null, lbxVar3)) {
                    if (lbxVar.t()) {
                        lbxVar.p();
                    }
                    lbxVar = lbxVar3;
                }
            }
        }
    }
}
