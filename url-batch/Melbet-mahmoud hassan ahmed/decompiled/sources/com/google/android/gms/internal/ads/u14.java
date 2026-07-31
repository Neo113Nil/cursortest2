package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class u14 implements w04 {

    /* renamed from: b, reason: collision with root package name */
    protected u04 f12567b;

    /* renamed from: c, reason: collision with root package name */
    protected u04 f12568c;

    /* renamed from: d, reason: collision with root package name */
    private u04 f12569d;

    /* renamed from: e, reason: collision with root package name */
    private u04 f12570e;

    /* renamed from: f, reason: collision with root package name */
    private ByteBuffer f12571f;

    /* renamed from: g, reason: collision with root package name */
    private ByteBuffer f12572g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f12573h;

    public u14() {
        ByteBuffer byteBuffer = w04.f13656a;
        this.f12571f = byteBuffer;
        this.f12572g = byteBuffer;
        u04 u04Var = u04.f12545e;
        this.f12569d = u04Var;
        this.f12570e = u04Var;
        this.f12567b = u04Var;
        this.f12568c = u04Var;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f12572g;
        this.f12572g = w04.f13656a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final u04 b(u04 u04Var) {
        this.f12569d = u04Var;
        this.f12570e = i(u04Var);
        return e() ? this.f12570e : u04.f12545e;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final void c() {
        this.f12572g = w04.f13656a;
        this.f12573h = false;
        this.f12567b = this.f12569d;
        this.f12568c = this.f12570e;
        k();
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final void d() {
        c();
        this.f12571f = w04.f13656a;
        u04 u04Var = u04.f12545e;
        this.f12569d = u04Var;
        this.f12570e = u04Var;
        this.f12567b = u04Var;
        this.f12568c = u04Var;
        m();
    }

    @Override // com.google.android.gms.internal.ads.w04
    public boolean e() {
        return this.f12570e != u04.f12545e;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public boolean f() {
        return this.f12573h && this.f12572g == w04.f13656a;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final void g() {
        this.f12573h = true;
        l();
    }

    protected abstract u04 i(u04 u04Var);

    protected final ByteBuffer j(int i7) {
        if (this.f12571f.capacity() < i7) {
            this.f12571f = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        } else {
            this.f12571f.clear();
        }
        ByteBuffer byteBuffer = this.f12571f;
        this.f12572g = byteBuffer;
        return byteBuffer;
    }

    protected void k() {
    }

    protected void l() {
    }

    protected void m() {
    }

    protected final boolean n() {
        return this.f12572g.hasRemaining();
    }
}
