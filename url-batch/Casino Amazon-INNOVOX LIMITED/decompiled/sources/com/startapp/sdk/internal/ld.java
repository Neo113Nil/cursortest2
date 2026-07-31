package com.startapp.sdk.internal;

import android.content.Context;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class ld extends a6 {
    public final pa e;
    public final pa f;
    public final String g;
    public final String h;
    public final kd i;

    public ld(Context context, pa paVar, pa paVar2, String str, String str2) {
        super(context, 1000L);
        this.i = new kd(this);
        this.e = paVar;
        this.f = paVar2;
        this.g = str;
        this.h = str2;
    }

    @Override // com.startapp.sdk.internal.a6
    public final Object a() {
        Object a2;
        if (!f()) {
            return null;
        }
        synchronized (this) {
            a2 = a(((af) this.e.a()).getString(this.g, null));
        }
        return a2;
    }

    public abstract Object a(String str);

    public final synchronized void b(Object obj) {
        if (obj != null) {
            ze edit = ((af) this.e.a()).edit();
            String str = this.g;
            String c = c(obj);
            edit.a(str, c);
            edit.f526a.putString(str, c);
            edit.putLong(this.h, System.currentTimeMillis()).apply();
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
        a(Math.max(0L, (Math.max(60000L, d()) + ((af) this.e.a()).getLong(this.h, 0L)) - System.currentTimeMillis()));
    }

    public abstract boolean f();

    public abstract void g();

    public final synchronized void a(long j) {
        if (f()) {
            v7 v7Var = (v7) this.f.a();
            v7Var.f464a.removeCallbacks(this.i);
            v7 v7Var2 = (v7) this.f.a();
            v7Var2.f464a.postDelayed(this.i, j);
        }
    }
}
