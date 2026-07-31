package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class pa0 implements ha0, fa0 {

    /* renamed from: f, reason: collision with root package name */
    private final eu0 f10141f;

    /* JADX WARN: Multi-variable type inference failed */
    public pa0(Context context, po0 po0Var, gb gbVar, y2.a aVar) {
        y2.t.A();
        eu0 a7 = ru0.a(context, vv0.a(), "", false, false, null, null, po0Var, null, null, null, ar.a(), null, null);
        this.f10141f = a7;
        ((View) a7).setWillNotDraw(true);
    }

    private static final void M(Runnable runnable) {
        qw.b();
        if (bo0.p()) {
            runnable.run();
        } else {
            a3.g2.f72i.post(runnable);
        }
    }

    final /* synthetic */ void E(String str) {
        this.f10141f.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.ha0
    public final void Q(String str) {
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        M(new Runnable() { // from class: com.google.android.gms.internal.ads.na0
            @Override // java.lang.Runnable
            public final void run() {
                pa0.this.E(format);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ob0
    public final void U0(String str, final t70<? super ob0> t70Var) {
        this.f10141f.O(str, new v3.m() { // from class: com.google.android.gms.internal.ads.ja0
            @Override // v3.m
            public final boolean apply(Object obj) {
                t70 t70Var2;
                t70 t70Var3 = t70.this;
                t70 t70Var4 = (t70) obj;
                if (!(t70Var4 instanceof oa0)) {
                    return false;
                }
                t70Var2 = ((oa0) t70Var4).f9572a;
                return t70Var2.equals(t70Var3);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ob0
    public final void X(String str, t70<? super ob0> t70Var) {
        this.f10141f.G0(str, new oa0(this, t70Var));
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final /* synthetic */ void a(String str, String str2) {
        ea0.c(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void b(final String str) {
        M(new Runnable() { // from class: com.google.android.gms.internal.ads.ka0
            @Override // java.lang.Runnable
            public final void run() {
                pa0.this.g(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final /* synthetic */ void b1(String str, JSONObject jSONObject) {
        ea0.d(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.ha0
    public final void c() {
        this.f10141f.destroy();
    }

    final /* synthetic */ void g(String str) {
        this.f10141f.b(str);
    }

    @Override // com.google.android.gms.internal.ads.ha0
    public final boolean h() {
        return this.f10141f.s0();
    }

    @Override // com.google.android.gms.internal.ads.ha0
    public final pb0 i() {
        return new pb0(this);
    }

    final /* synthetic */ void k(String str) {
        this.f10141f.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.ha0
    public final void q0(final String str) {
        M(new Runnable() { // from class: com.google.android.gms.internal.ads.ma0
            @Override // java.lang.Runnable
            public final void run() {
                pa0.this.r(str);
            }
        });
    }

    final /* synthetic */ void r(String str) {
        this.f10141f.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.ha0
    public final void r0(final ra0 ra0Var) {
        final byte[] bArr = null;
        this.f10141f.E0().Y0(new sv0(bArr) { // from class: com.google.android.gms.internal.ads.ia0
            @Override // com.google.android.gms.internal.ads.sv0
            public final void zza() {
                ra0 ra0Var2 = ra0.this;
                final nb0 nb0Var = ra0Var2.f11082a;
                final mb0 mb0Var = ra0Var2.f11083b;
                final ha0 ha0Var = ra0Var2.f11084c;
                a3.g2.f72i.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.xa0
                    @Override // java.lang.Runnable
                    public final void run() {
                        nb0.this.h(mb0Var, ha0Var);
                    }
                }, 10000L);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final /* synthetic */ void s(String str, JSONObject jSONObject) {
        ea0.b(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final /* synthetic */ void t(String str, Map map) {
        ea0.a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.ha0
    public final void z(final String str) {
        M(new Runnable() { // from class: com.google.android.gms.internal.ads.la0
            @Override // java.lang.Runnable
            public final void run() {
                pa0.this.k(str);
            }
        });
    }
}
