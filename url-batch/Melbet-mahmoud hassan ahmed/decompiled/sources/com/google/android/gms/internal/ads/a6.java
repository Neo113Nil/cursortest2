package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a6<T> implements Comparable<a6<T>> {

    /* renamed from: f, reason: collision with root package name */
    private final m6 f2632f;

    /* renamed from: g, reason: collision with root package name */
    private final int f2633g;

    /* renamed from: h, reason: collision with root package name */
    private final String f2634h;

    /* renamed from: i, reason: collision with root package name */
    private final int f2635i;

    /* renamed from: j, reason: collision with root package name */
    private final Object f2636j;

    /* renamed from: k, reason: collision with root package name */
    private final e6 f2637k;

    /* renamed from: l, reason: collision with root package name */
    private Integer f2638l;

    /* renamed from: m, reason: collision with root package name */
    private d6 f2639m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f2640n;

    /* renamed from: o, reason: collision with root package name */
    private j5 f2641o;

    /* renamed from: p, reason: collision with root package name */
    private z5 f2642p;

    /* renamed from: q, reason: collision with root package name */
    private final o5 f2643q;

    public a6(int i7, String str, e6 e6Var) {
        Uri parse;
        String host;
        this.f2632f = m6.f8428c ? new m6() : null;
        this.f2636j = new Object();
        int i8 = 0;
        this.f2640n = false;
        this.f2641o = null;
        this.f2633g = i7;
        this.f2634h = str;
        this.f2637k = e6Var;
        this.f2643q = new o5();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i8 = host.hashCode();
        }
        this.f2635i = i8;
    }

    public final int b() {
        return this.f2643q.b();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f2638l.intValue() - ((a6) obj).f2638l.intValue();
    }

    public final int d() {
        return this.f2635i;
    }

    public final j5 e() {
        return this.f2641o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a6<?> f(j5 j5Var) {
        this.f2641o = j5Var;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a6<?> g(d6 d6Var) {
        this.f2639m = d6Var;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a6<?> h(int i7) {
        this.f2638l = Integer.valueOf(i7);
        return this;
    }

    protected abstract g6<T> i(w5 w5Var);

    public final String k() {
        String str = this.f2634h;
        if (this.f2633g == 0) {
            return str;
        }
        String num = Integer.toString(1);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length());
        sb.append(num);
        sb.append('-');
        sb.append(str);
        return sb.toString();
    }

    public final String l() {
        return this.f2634h;
    }

    public Map<String, String> m() {
        return Collections.emptyMap();
    }

    public final void n(String str) {
        if (m6.f8428c) {
            this.f2632f.a(str, Thread.currentThread().getId());
        }
    }

    public final void o(k6 k6Var) {
        e6 e6Var;
        synchronized (this.f2636j) {
            e6Var = this.f2637k;
        }
        if (e6Var != null) {
            e6Var.a(k6Var);
        }
    }

    protected abstract void p(T t6);

    final void q(String str) {
        d6 d6Var = this.f2639m;
        if (d6Var != null) {
            d6Var.b(this);
        }
        if (m6.f8428c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new y5(this, str, id));
            } else {
                this.f2632f.a(str, id);
                this.f2632f.b(toString());
            }
        }
    }

    public final void r() {
        synchronized (this.f2636j) {
            this.f2640n = true;
        }
    }

    final void s() {
        z5 z5Var;
        synchronized (this.f2636j) {
            z5Var = this.f2642p;
        }
        if (z5Var != null) {
            z5Var.a(this);
        }
    }

    final void t(g6<?> g6Var) {
        z5 z5Var;
        synchronized (this.f2636j) {
            z5Var = this.f2642p;
        }
        if (z5Var != null) {
            z5Var.b(this, g6Var);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.f2635i));
        String concat = valueOf.length() != 0 ? "0x".concat(valueOf) : new String("0x");
        x();
        String str = this.f2634h;
        String valueOf2 = String.valueOf(this.f2638l);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7 + String.valueOf(concat).length() + 6 + valueOf2.length());
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(concat);
        sb.append(" NORMAL ");
        sb.append(valueOf2);
        return sb.toString();
    }

    final void u(int i7) {
        d6 d6Var = this.f2639m;
        if (d6Var != null) {
            d6Var.c(this, i7);
        }
    }

    final void v(z5 z5Var) {
        synchronized (this.f2636j) {
            this.f2642p = z5Var;
        }
    }

    public final boolean w() {
        boolean z6;
        synchronized (this.f2636j) {
            z6 = this.f2640n;
        }
        return z6;
    }

    public final boolean x() {
        synchronized (this.f2636j) {
        }
        return false;
    }

    public byte[] y() {
        return null;
    }

    public final o5 z() {
        return this.f2643q;
    }

    public final int zza() {
        return this.f2633g;
    }
}
