package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdError;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.bx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3011bx {

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f29608h = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f29609a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3065cx f29610b;

    /* renamed from: c, reason: collision with root package name */
    public final Dw f29611c;

    /* renamed from: d, reason: collision with root package name */
    public final Cw f29612d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f29613e;

    /* renamed from: f, reason: collision with root package name */
    public Zw f29614f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f29615g = new Object();

    public C3011bx(Context context, InterfaceC3065cx interfaceC3065cx, Dw dw, Cw cw, boolean z8) {
        this.f29609a = context;
        this.f29610b = interfaceC3065cx;
        this.f29611c = dw;
        this.f29612d = cw;
        this.f29613e = z8;
    }

    public final boolean a(Vw vw) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                Zw zw = new Zw(c(vw).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.f29609a, "msa-r", vw.a(), null, new Bundle(), 2), vw, this.f29610b, this.f29611c, this.f29613e);
                if (!zw.k()) {
                    throw new C2956ax(4000, "init failed");
                }
                int m8 = zw.m();
                if (m8 != 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(m8).length() + 4);
                    sb.append("ci: ");
                    sb.append(m8);
                    throw new C2956ax(4001, sb.toString());
                }
                synchronized (this.f29615g) {
                    Zw zw2 = this.f29614f;
                    if (zw2 != null) {
                        try {
                            zw2.l();
                        } catch (C2956ax e6) {
                            this.f29611c.c(e6.f29355n, -1L, e6);
                        }
                    }
                    this.f29614f = zw;
                }
                this.f29611c.b(3000, System.currentTimeMillis() - currentTimeMillis);
                return true;
            } catch (Exception e9) {
                throw new C2956ax(AdError.INTERNAL_ERROR_2004, e9);
            }
        } catch (C2956ax e10) {
            this.f29611c.c(e10.f29355n, System.currentTimeMillis() - currentTimeMillis, e10);
            return false;
        } catch (Exception e11) {
            this.f29611c.c(4010, System.currentTimeMillis() - currentTimeMillis, e11);
            return false;
        }
    }

    public final Zw b() {
        Zw zw;
        synchronized (this.f29615g) {
            zw = this.f29614f;
        }
        return zw;
    }

    public final synchronized Class c(Vw vw) {
        try {
            C3077d8 c3077d8 = vw.f28322a;
            if (c3077d8 == null) {
                throw new C2956ax(4010, "mc");
            }
            String A8 = c3077d8.A();
            HashMap hashMap = f29608h;
            Class cls = (Class) hashMap.get(A8);
            if (cls != null) {
                return cls;
            }
            try {
                Cw cw = this.f29612d;
                File file = vw.f28323b;
                cw.getClass();
                if (!Cw.a(file)) {
                    throw new C2956ax(2026, "VM did not pass signature verification");
                }
                try {
                    File file2 = vw.f28324c;
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    Class<?> loadClass = new DexClassLoader(vw.f28323b.getAbsolutePath(), file2.getAbsolutePath(), null, this.f29609a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(A8, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException e6) {
                    e = e6;
                    throw new C2956ax(AdError.REMOTE_ADS_SERVICE_ERROR, e);
                } catch (IllegalArgumentException e9) {
                    e = e9;
                    throw new C2956ax(AdError.REMOTE_ADS_SERVICE_ERROR, e);
                } catch (SecurityException e10) {
                    e = e10;
                    throw new C2956ax(AdError.REMOTE_ADS_SERVICE_ERROR, e);
                }
            } catch (GeneralSecurityException e11) {
                throw new C2956ax(2026, e11);
            }
        } finally {
        }
    }
}
