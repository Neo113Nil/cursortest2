package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class i61 extends n61 {
    public final boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i61(g61 g61Var) {
        super(true);
        boolean z = true;
        R(g61Var);
        bu N = N();
        cu cuVar = N instanceof cu ? (cu) N : null;
        if (cuVar != null) {
            n61 q = cuVar.q();
            while (!q.I()) {
                bu N2 = q.N();
                cu cuVar2 = N2 instanceof cu ? (cu) N2 : null;
                if (cuVar2 != null) {
                    q = cuVar2.q();
                }
            }
            this.q = z;
        }
        z = false;
        this.q = z;
    }

    @Override // defpackage.n61
    public final boolean I() {
        return this.q;
    }

    @Override // defpackage.n61
    public final boolean K() {
        return true;
    }
}
