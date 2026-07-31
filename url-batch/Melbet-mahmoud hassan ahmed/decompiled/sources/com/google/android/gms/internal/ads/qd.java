package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public abstract class qd implements Callable {

    /* renamed from: a, reason: collision with root package name */
    protected final String f10649a = getClass().getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    protected final gc f10650b;

    /* renamed from: c, reason: collision with root package name */
    protected final String f10651c;

    /* renamed from: d, reason: collision with root package name */
    protected final String f10652d;

    /* renamed from: e, reason: collision with root package name */
    protected final j8 f10653e;

    /* renamed from: f, reason: collision with root package name */
    protected Method f10654f;

    /* renamed from: g, reason: collision with root package name */
    protected final int f10655g;

    /* renamed from: h, reason: collision with root package name */
    protected final int f10656h;

    public qd(gc gcVar, String str, String str2, j8 j8Var, int i7, int i8) {
        this.f10650b = gcVar;
        this.f10651c = str;
        this.f10652d = str2;
        this.f10653e = j8Var;
        this.f10655g = i7;
        this.f10656h = i8;
    }

    protected abstract void a();

    public Void b() {
        long nanoTime;
        Method j7;
        int i7;
        try {
            nanoTime = System.nanoTime();
            j7 = this.f10650b.j(this.f10651c, this.f10652d);
            this.f10654f = j7;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (j7 == null) {
            return null;
        }
        a();
        bb d7 = this.f10650b.d();
        if (d7 != null && (i7 = this.f10655g) != Integer.MIN_VALUE) {
            d7.c(this.f10656h, i7, (System.nanoTime() - nanoTime) / 1000, null, null);
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        b();
        return null;
    }
}
