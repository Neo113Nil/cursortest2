package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class od {

    /* renamed from: a, reason: collision with root package name */
    private final gc f9609a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9610b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9611c;

    /* renamed from: e, reason: collision with root package name */
    private final Class<?>[] f9613e;

    /* renamed from: d, reason: collision with root package name */
    private volatile Method f9612d = null;

    /* renamed from: f, reason: collision with root package name */
    private final CountDownLatch f9614f = new CountDownLatch(1);

    public od(gc gcVar, String str, String str2, Class<?>... clsArr) {
        this.f9609a = gcVar;
        this.f9610b = str;
        this.f9611c = str2;
        this.f9613e = clsArr;
        gcVar.k().submit(new nd(this));
    }

    static /* bridge */ /* synthetic */ void b(od odVar) {
        try {
            try {
                Class loadClass = odVar.f9609a.i().loadClass(odVar.c(odVar.f9609a.u(), odVar.f9610b));
                if (loadClass != null) {
                    odVar.f9612d = loadClass.getMethod(odVar.c(odVar.f9609a.u(), odVar.f9611c), odVar.f9613e);
                    Method method = odVar.f9612d;
                }
            } catch (kb | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
            }
        } finally {
            odVar.f9614f.countDown();
        }
    }

    private final String c(byte[] bArr, String str) {
        return new String(this.f9609a.e().b(bArr, str), "UTF-8");
    }

    public final Method a() {
        if (this.f9612d != null) {
            return this.f9612d;
        }
        try {
            if (this.f9614f.await(2L, TimeUnit.SECONDS)) {
                return this.f9612d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
