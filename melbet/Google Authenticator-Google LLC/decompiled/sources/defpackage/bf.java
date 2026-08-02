package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bf extends bl implements up, uq, ul, um, agl, nw, oi, ame, cb, xk {
    final /* synthetic */ bg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bg bgVar) {
        super(bgVar, bgVar, new Handler());
        this.a = bgVar;
    }

    @Override // defpackage.aer
    public final ael L() {
        return this.a.d;
    }

    @Override // defpackage.agl
    public final agk O() {
        return this.a.O();
    }

    @Override // defpackage.bl, defpackage.bi
    public final View a(int i) {
        return this.a.findViewById(i);
    }

    @Override // defpackage.ame
    public final boe aE() {
        return this.a.aE();
    }

    @Override // defpackage.bl, defpackage.bi
    public final boolean b() {
        Window window = this.a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.oi
    public final oh c() {
        return this.a.g;
    }

    @Override // defpackage.bl
    public final void d() {
        this.a.invalidateOptionsMenu();
    }

    @Override // defpackage.cb
    public final void e() {
        this.a.e();
    }

    @Override // defpackage.nw
    public final oe f() {
        return this.a.f();
    }
}
