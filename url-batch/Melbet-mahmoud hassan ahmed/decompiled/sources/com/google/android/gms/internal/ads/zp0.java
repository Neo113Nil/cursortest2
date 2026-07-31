package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

@TargetApi(14)
/* loaded from: classes.dex */
public abstract class zp0 extends TextureView implements wq0 {

    /* renamed from: f, reason: collision with root package name */
    protected final nq0 f15216f;

    /* renamed from: g, reason: collision with root package name */
    protected final xq0 f15217g;

    public zp0(Context context) {
        super(context);
        this.f15216f = new nq0();
        this.f15217g = new xq0(context, this);
    }

    public void A(int i7) {
    }

    public void B(int i7) {
    }

    public void C(int i7) {
    }

    public void a(int i7) {
    }

    public void f(String str, String[] strArr) {
        v(str);
    }

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract long l();

    public abstract void m();

    public abstract long o();

    public abstract long p();

    public abstract String q();

    public abstract void r();

    public abstract void s();

    public abstract void t(int i7);

    public abstract void u(yp0 yp0Var);

    public abstract void v(String str);

    public abstract void w();

    public abstract void y(float f7, float f8);

    public void z(int i7) {
    }
}
