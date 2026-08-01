package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.a;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ok extends jw implements j90, aq, g10, el {
    public final c3 o;
    public final c3 p;
    public final Handler q;
    public final bl r;
    public final /* synthetic */ c3 s;

    public ok(c3 c3Var) {
        this.s = c3Var;
        Handler handler = new Handler();
        this.r = new bl();
        this.o = c3Var;
        this.p = c3Var;
        this.q = handler;
    }

    @Override // defpackage.jw
    public final View L(int i) {
        return this.s.findViewById(i);
    }

    @Override // defpackage.jw
    public final boolean O() {
        Window window = this.s.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.g10
    public final i3 a() {
        return this.s.i.b;
    }

    @Override // defpackage.j90
    public final i90 d() {
        return this.s.d();
    }

    @Override // defpackage.aq
    public final a e() {
        return this.s.A;
    }

    @Override // defpackage.el
    public final void b() {
    }
}
