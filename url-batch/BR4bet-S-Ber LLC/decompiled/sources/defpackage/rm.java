package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class rm extends la0 implements uc0, ms, n40, in {
    public final m3 r;
    public final m3 s;
    public final Handler t;
    public final en u;
    public final /* synthetic */ m3 v;

    public rm(m3 m3Var) {
        this.v = m3Var;
        Handler handler = new Handler();
        this.u = new en();
        this.r = m3Var;
        this.s = m3Var;
        this.t = handler;
    }

    @Override // defpackage.la0
    public final View P(int i) {
        return this.v.findViewById(i);
    }

    @Override // defpackage.la0
    public final boolean Q() {
        Window window = this.v.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.n40
    public final s3 a() {
        return this.v.i.b;
    }

    @Override // defpackage.uc0
    public final tc0 d() {
        return this.v.d();
    }

    @Override // defpackage.ms
    public final os e() {
        return this.v.z;
    }

    @Override // defpackage.in
    public final void b() {
    }
}
