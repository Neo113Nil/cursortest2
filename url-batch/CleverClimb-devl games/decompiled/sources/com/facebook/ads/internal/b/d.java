package com.facebook.ads.internal.b;

import android.os.Bundle;
import com.facebook.ads.internal.q.a.o;

/* loaded from: classes.dex */
public class d implements o<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private c f5035a;

    /* renamed from: b, reason: collision with root package name */
    private final c f5036b;

    /* renamed from: c, reason: collision with root package name */
    private final b f5037c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5038d;
    private boolean e;
    private boolean f;

    public d(b bVar) {
        this.f5038d = false;
        this.e = false;
        this.f = false;
        this.f5037c = bVar;
        this.f5036b = new c(bVar.f5026b);
        this.f5035a = new c(bVar.f5026b);
    }

    public d(b bVar, Bundle bundle) {
        this.f5038d = false;
        this.e = false;
        this.f = false;
        this.f5037c = bVar;
        this.f5036b = (c) bundle.getSerializable("testStats");
        this.f5035a = (c) bundle.getSerializable("viewableStats");
        this.f5038d = bundle.getBoolean("ended");
        this.e = bundle.getBoolean("passed");
        this.f = bundle.getBoolean("complete");
    }

    private void a() {
        this.e = true;
        b();
    }

    private void b() {
        this.f = true;
        c();
    }

    private void c() {
        this.f5038d = true;
        this.f5037c.a(this.f, this.e, this.e ? this.f5035a : this.f5036b);
    }

    public void a(double d2, double d3) {
        if (this.f5038d) {
            return;
        }
        this.f5036b.a(d2, d3);
        this.f5035a.a(d2, d3);
        double f = this.f5035a.b().f();
        if (this.f5037c.e && d3 < this.f5037c.f5026b) {
            this.f5035a = new c(this.f5037c.f5026b);
        }
        if (this.f5037c.f5027c >= 0.0d && this.f5036b.b().e() > this.f5037c.f5027c && f == 0.0d) {
            b();
        } else if (f >= this.f5037c.f5028d) {
            a();
        }
    }

    @Override // com.facebook.ads.internal.q.a.o
    public Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("viewableStats", this.f5035a);
        bundle.putSerializable("testStats", this.f5036b);
        bundle.putBoolean("ended", this.f5038d);
        bundle.putBoolean("passed", this.e);
        bundle.putBoolean("complete", this.f);
        return bundle;
    }
}
