package a7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m extends a1 {
    public final Object f0(i6.i iVar) {
        Object obj;
        do {
            obj = a1.f240d.get(this);
            if (!(obj instanceof p0)) {
                if (obj instanceof o) {
                    throw ((o) obj).f286a;
                }
                return x.s(obj);
            }
        } while (b0(obj) < 0);
        x0 x0Var = new x0(m.a.G(iVar), this);
        x0Var.t();
        x0Var.w(new e(1, x.k(this, true, new f0(2, x0Var))));
        return x0Var.s();
    }
}
