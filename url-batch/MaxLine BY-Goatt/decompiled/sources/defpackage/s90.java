package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class s90 implements ew {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ s90(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    @Override // defpackage.ew
    public final long a() {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                u90 u90Var = (u90) obj;
                long a = u90Var.F.a();
                if (a != 16) {
                    return a;
                }
                va2 va2Var = (va2) tk3.J(u90Var, za2.b);
                if (va2Var != null) {
                    long j = va2Var.a;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((aw) tk3.J(u90Var, e20.a)).a;
            default:
                return ((cb2) obj).c;
        }
    }
}
