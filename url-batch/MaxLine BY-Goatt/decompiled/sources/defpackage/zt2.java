package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zt2 {
    public final yd a;
    public final pw2 b;
    public final boolean e;
    public final ca0 g;
    public final hp0 h;
    public final List i;
    public fy j;
    public u81 k;
    public final int c = Integer.MAX_VALUE;
    public final int d = 1;
    public final int f = 1;

    public zt2(yd ydVar, pw2 pw2Var, boolean z, ca0 ca0Var, hp0 hp0Var, List list) {
        this.a = ydVar;
        this.b = pw2Var;
        this.e = z;
        this.g = ca0Var;
        this.h = hp0Var;
        this.i = list;
    }

    public final void a(u81 u81Var) {
        fy fyVar = this.j;
        if (fyVar == null || u81Var != this.k || fyVar.b()) {
            this.k = u81Var;
            fyVar = new fy(this.a, ci2.i(this.b, u81Var), this.i, this.g, this.h);
        }
        this.j = fyVar;
    }
}
