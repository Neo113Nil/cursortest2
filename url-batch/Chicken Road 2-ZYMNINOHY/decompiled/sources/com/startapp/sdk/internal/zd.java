package com.startapp.sdk.internal;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class zd extends j6 {

    /* renamed from: e, reason: collision with root package name */
    public final ib f8037e;

    /* renamed from: f, reason: collision with root package name */
    public final ib f8038f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8039g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8040h;

    /* renamed from: i, reason: collision with root package name */
    public final yd f8041i;

    public zd(Context context, ib ibVar, ib ibVar2, String str, String str2) {
        super(context, 1000L);
        this.f8041i = new yd(this);
        this.f8037e = ibVar;
        this.f8038f = ibVar2;
        this.f8039g = str;
        this.f8040h = str2;
    }

    @Override // com.startapp.sdk.internal.j6
    public final Object a() {
        Object a3;
        if (!f()) {
            return null;
        }
        synchronized (this) {
            a3 = a(((sf) this.f8037e.a()).getString(this.f8039g, null));
        }
        return a3;
    }

    public abstract Object a(String str);

    public final synchronized void b(Object obj) {
        if (obj != null) {
            try {
                rf edit = ((sf) this.f8037e.a()).edit();
                String str = this.f8039g;
                String c4 = c(obj);
                edit.a(str, c4);
                edit.f7532a.putString(str, c4);
                String str2 = this.f8040h;
                long currentTimeMillis = System.currentTimeMillis();
                edit.a(str2, Long.valueOf(currentTimeMillis));
                edit.f7532a.putLong(str2, currentTimeMillis);
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
        a(Math.max(0L, (Math.max(60000L, d()) + ((sf) this.f8037e.a()).getLong(this.f8040h, 0L)) - System.currentTimeMillis()));
    }

    public abstract boolean f();

    public abstract void g();

    public final synchronized void a(long j4) {
        if (f()) {
            k8 k8Var = (k8) this.f8038f.a();
            k8Var.f7181a.removeCallbacks(this.f8041i);
            k8 k8Var2 = (k8) this.f8038f.a();
            k8Var2.f7181a.postDelayed(this.f8041i, j4);
        }
    }
}
