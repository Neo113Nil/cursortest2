package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class xp extends bi implements tm0, lx, sb0, nq {
    public final u3 o;
    public final u3 p;
    public final Handler q;
    public final kq r;
    public final /* synthetic */ u3 s;

    public xp(u3 u3Var) {
        this.s = u3Var;
        Handler handler = new Handler();
        this.r = new kq();
        this.o = u3Var;
        this.p = u3Var;
        this.q = handler;
    }

    @Override // defpackage.bi
    public final View M(int i) {
        return this.s.findViewById(i);
    }

    @Override // defpackage.bi
    public final boolean P() {
        Window window = this.s.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.sb0
    public final i5 a() {
        return (i5) this.s.i.h;
    }

    @Override // defpackage.tm0
    public final sm0 d() {
        return this.s.d();
    }

    @Override // defpackage.lx
    public final nx e() {
        return this.s.A;
    }

    @Override // defpackage.nq
    public final void b() {
    }
}
