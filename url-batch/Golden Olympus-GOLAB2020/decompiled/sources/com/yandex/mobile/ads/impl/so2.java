package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import com.yandex.mobile.ads.impl.wn2;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class so2 implements go2, wn2.a {

    /* renamed from: f, reason: collision with root package name */
    private static so2 f31886f;

    /* renamed from: a, reason: collision with root package name */
    private float f31887a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final po2 f31888b;

    /* renamed from: c, reason: collision with root package name */
    private final vn2 f31889c;

    /* renamed from: d, reason: collision with root package name */
    private ko2 f31890d;

    /* renamed from: e, reason: collision with root package name */
    private mn2 f31891e;

    public so2(po2 po2Var, vn2 vn2Var) {
        this.f31888b = po2Var;
        this.f31889c = vn2Var;
    }

    public static so2 a() {
        if (f31886f == null) {
            f31886f = new so2(new po2(), new vn2());
        }
        return f31886f;
    }

    public final void b() {
        wn2.a().a(this);
        wn2.a().b();
        v62.g().getClass();
        v62.a();
        this.f31890d.a();
    }

    public final void c() {
        v62.g().b();
        wn2.a().c();
        this.f31890d.b();
    }

    public final float d() {
        return this.f31887a;
    }

    public final void a(float f4) {
        this.f31887a = f4;
        if (this.f31891e == null) {
            this.f31891e = mn2.a();
        }
        Iterator<ln2> it = this.f31891e.c().iterator();
        while (it.hasNext()) {
            it.next().j().a(f4);
        }
    }

    public final void a(Context context) {
        this.f31889c.getClass();
        tn2 tn2Var = new tn2();
        po2 po2Var = this.f31888b;
        Handler handler = new Handler();
        po2Var.getClass();
        this.f31890d = new ko2(handler, context, tn2Var, this);
    }
}
