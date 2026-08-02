package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class zd extends j6 {

    /* renamed from: e, reason: collision with root package name */
    public final ib f4886e;
    public final ib f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4887g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4888h;

    /* renamed from: i, reason: collision with root package name */
    public final yd f4889i;

    public zd(Context context, ib ibVar, ib ibVar2, String str, String str2) {
        super(context, 1000L);
        this.f4889i = new yd(this);
        this.f4886e = ibVar;
        this.f = ibVar2;
        this.f4887g = str;
        this.f4888h = str2;
    }

    @Override // com.startapp.sdk.internal.j6
    public final Object a() {
        Object a3;
        if (!f()) {
            return null;
        }
        synchronized (this) {
            a3 = a(((sf) this.f4886e.a()).getString(this.f4887g, null));
        }
        return a3;
    }

    public abstract Object a(String str);

    public final synchronized void b(Object obj) {
        if (obj != null) {
            try {
                rf edit = ((sf) this.f4886e.a()).edit();
                String str = this.f4887g;
                String c3 = c(obj);
                edit.a(str, c3);
                edit.f4395a.putString(str, c3);
                String str2 = this.f4888h;
                long currentTimeMillis = System.currentTimeMillis();
                edit.a(str2, Long.valueOf(currentTimeMillis));
                edit.f4395a.putLong(str2, currentTimeMillis);
                edit.apply();
            } catch (Throwable th) {
                throw th;
            }
        }
        a(Math.max(60000L, d()));
    }

    public String c(Object obj) {
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public abstract long d();

    public final synchronized void e() {
        a(Math.max(0L, (Math.max(60000L, d()) + ((sf) this.f4886e.a()).getLong(this.f4888h, 0L)) - System.currentTimeMillis()));
    }

    public abstract boolean f();

    public abstract void g();

    public final synchronized void a(long j3) {
        if (f()) {
            k8 k8Var = (k8) this.f.a();
            k8Var.f4053a.removeCallbacks(this.f4889i);
            k8 k8Var2 = (k8) this.f.a();
            k8Var2.f4053a.postDelayed(this.f4889i, j3);
        }
    }
}
