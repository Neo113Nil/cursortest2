package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class w extends k3.m implements androidx.lifecycle.p0, androidx.lifecycle.r, c1.f, n0 {

    /* renamed from: k, reason: collision with root package name */
    public final f.i f547k;

    /* renamed from: l, reason: collision with root package name */
    public final f.i f548l;

    /* renamed from: m, reason: collision with root package name */
    public final Handler f549m;

    /* renamed from: n, reason: collision with root package name */
    public final k0 f550n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f.i f551o;

    public w(f.i iVar) {
        this.f551o = iVar;
        Handler handler = new Handler();
        this.f550n = new k0();
        this.f547k = iVar;
        this.f548l = iVar;
        this.f549m = handler;
    }

    @Override // k3.m
    public final View K(int i4) {
        return this.f551o.findViewById(i4);
    }

    @Override // k3.m
    public final boolean L() {
        Window window = this.f551o.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // c1.f
    public final c1.d a() {
        return this.f551o.f127i.f1004b;
    }

    @Override // androidx.lifecycle.p0
    public final androidx.lifecycle.o0 e() {
        return this.f551o.e();
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t f() {
        return this.f551o.f1606y;
    }

    @Override // androidx.fragment.app.n0
    public final void d() {
    }
}
