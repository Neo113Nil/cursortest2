package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class lb0 extends qb0 {
    public final boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb0(jb0 jb0Var) {
        super(true);
        boolean z = true;
        U(jb0Var);
        tg Q = Q();
        ug ugVar = Q instanceof ug ? (ug) Q : null;
        if (ugVar != null) {
            qb0 q = ugVar.q();
            while (!q.N()) {
                tg Q2 = q.Q();
                ug ugVar2 = Q2 instanceof ug ? (ug) Q2 : null;
                if (ugVar2 != null) {
                    q = ugVar2.q();
                }
            }
            this.i = z;
        }
        z = false;
        this.i = z;
    }

    @Override // defpackage.qb0
    public final boolean N() {
        return this.i;
    }

    @Override // defpackage.qb0
    public final boolean O() {
        return true;
    }
}
