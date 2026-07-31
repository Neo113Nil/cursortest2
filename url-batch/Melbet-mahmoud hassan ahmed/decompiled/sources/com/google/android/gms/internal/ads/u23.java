package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class u23 {

    /* renamed from: g, reason: collision with root package name */
    private static final HashMap<String, Class<?>> f12601g = new HashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private final Context f12602a;

    /* renamed from: b, reason: collision with root package name */
    private final v23 f12603b;

    /* renamed from: c, reason: collision with root package name */
    private final u03 f12604c;

    /* renamed from: d, reason: collision with root package name */
    private final p03 f12605d;

    /* renamed from: e, reason: collision with root package name */
    private i23 f12606e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f12607f = new Object();

    public u23(Context context, v23 v23Var, u03 u03Var, p03 p03Var) {
        this.f12602a = context;
        this.f12603b = v23Var;
        this.f12604c = u03Var;
        this.f12605d = p03Var;
    }

    private final synchronized Class<?> d(j23 j23Var) {
        String O = j23Var.a().O();
        HashMap<String, Class<?>> hashMap = f12601g;
        Class<?> cls = hashMap.get(O);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.f12605d.a(j23Var.c())) {
                throw new t23(2026, "VM did not pass signature verification");
            }
            try {
                File b7 = j23Var.b();
                if (!b7.exists()) {
                    b7.mkdirs();
                }
                Class loadClass = new DexClassLoader(j23Var.c().getAbsolutePath(), b7.getAbsolutePath(), null, this.f12602a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(O, loadClass);
                return loadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e7) {
                throw new t23(2008, e7);
            }
        } catch (GeneralSecurityException e8) {
            throw new t23(2026, e8);
        }
    }

    public final x03 a() {
        i23 i23Var;
        synchronized (this.f12607f) {
            i23Var = this.f12606e;
        }
        return i23Var;
    }

    public final j23 b() {
        synchronized (this.f12607f) {
            i23 i23Var = this.f12606e;
            if (i23Var == null) {
                return null;
            }
            return i23Var.f();
        }
    }

    public final boolean c(j23 j23Var) {
        int i7;
        Exception exc;
        u03 u03Var;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                i23 i23Var = new i23(d(j23Var).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f12602a, "msa-r", j23Var.e(), null, new Bundle(), 2), j23Var, this.f12603b, this.f12604c);
                if (!i23Var.h()) {
                    throw new t23(4000, "init failed");
                }
                int e7 = i23Var.e();
                if (e7 != 0) {
                    StringBuilder sb = new StringBuilder(15);
                    sb.append("ci: ");
                    sb.append(e7);
                    throw new t23(4001, sb.toString());
                }
                synchronized (this.f12607f) {
                    i23 i23Var2 = this.f12606e;
                    if (i23Var2 != null) {
                        try {
                            i23Var2.g();
                        } catch (t23 e8) {
                            this.f12604c.c(e8.a(), -1L, e8);
                        }
                    }
                    this.f12606e = i23Var;
                }
                this.f12604c.d(3000, System.currentTimeMillis() - currentTimeMillis);
                return true;
            } catch (Exception e9) {
                throw new t23(2004, e9);
            }
        } catch (t23 e10) {
            u03 u03Var2 = this.f12604c;
            i7 = e10.a();
            u03Var = u03Var2;
            exc = e10;
            u03Var.c(i7, System.currentTimeMillis() - currentTimeMillis, exc);
            return false;
        } catch (Exception e11) {
            i7 = 4010;
            u03Var = this.f12604c;
            exc = e11;
            u03Var.c(i7, System.currentTimeMillis() - currentTimeMillis, exc);
            return false;
        }
    }
}
