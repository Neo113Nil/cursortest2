package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import s1.InterfaceC4989b;
import s1.InterfaceC4992e;
import w1.C5149b;
import w1.InterfaceC5148a;

/* renamed from: com.google.android.gms.internal.ads.Qc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2736Qc implements InterfaceC5148a {

    /* renamed from: n, reason: collision with root package name */
    public final long f27173n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f27174u;

    /* renamed from: v, reason: collision with root package name */
    public final Serializable f27175v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f27176w;

    /* renamed from: x, reason: collision with root package name */
    public Object f27177x;

    public /* synthetic */ C2736Qc(c7.m mVar, ArrayList arrayList, long j9, C2770Sc c2770Sc, C2634Kc c2634Kc) {
        this.f27174u = mVar;
        this.f27175v = arrayList;
        this.f27173n = j9;
        this.f27176w = c2770Sc;
        this.f27177x = c2634Kc;
    }

    public synchronized q1.c a() {
        try {
            if (((q1.c) this.f27177x) == null) {
                this.f27177x = q1.c.A((File) this.f27175v, this.f27173n);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (q1.c) this.f27177x;
    }

    @Override // w1.InterfaceC5148a
    public File d(InterfaceC4992e interfaceC4992e) {
        String n9 = ((S0.l) this.f27174u).n(interfaceC4992e);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + n9 + " for for Key: " + interfaceC4992e);
        }
        try {
            h8.d k6 = a().k(n9);
            if (k6 != null) {
                return ((File[]) k6.f38261u)[0];
            }
            return null;
        } catch (IOException e6) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e6);
            return null;
        }
    }

    @Override // w1.InterfaceC5148a
    public void g(InterfaceC4992e interfaceC4992e, m.Q0 q02) {
        C5149b c5149b;
        q1.c a9;
        boolean z8;
        String n9 = ((S0.l) this.f27174u).n(interfaceC4992e);
        S0.e eVar = (S0.e) this.f27176w;
        synchronized (eVar) {
            c5149b = (C5149b) ((HashMap) eVar.f2891u).get(n9);
            if (c5149b == null) {
                h8.d dVar = (h8.d) eVar.f2892v;
                synchronized (((ArrayDeque) dVar.f38261u)) {
                    c5149b = (C5149b) ((ArrayDeque) dVar.f38261u).poll();
                }
                if (c5149b == null) {
                    c5149b = new C5149b();
                }
                ((HashMap) eVar.f2891u).put(n9, c5149b);
            }
            c5149b.f41585b++;
        }
        c5149b.f41584a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + n9 + " for for Key: " + interfaceC4992e);
            }
            try {
                a9 = a();
            } catch (IOException e6) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e6);
                }
            }
            if (a9.k(n9) != null) {
                return;
            }
            com.bumptech.glide.manager.n i = a9.i(n9);
            if (i == null) {
                throw new IllegalStateException("Had two simultaneous puts for: ".concat(n9));
            }
            try {
                if (((InterfaceC4989b) q02.f39325b).b(q02.f39326c, i.c(), (s1.h) q02.f39327d)) {
                    q1.c.a((q1.c) i.f23620w, i, true);
                    i.f23617n = true;
                }
                if (!z8) {
                    try {
                        i.a();
                    } catch (IOException unused) {
                    }
                }
            } finally {
                if (!i.f23617n) {
                    try {
                        i.a();
                    } catch (IOException unused2) {
                    }
                }
            }
        } finally {
            ((S0.e) this.f27176w).n(n9);
        }
    }

    public C2736Qc(File file) {
        this.f27176w = new S0.e(19);
        this.f27175v = file;
        this.f27173n = 262144000L;
        this.f27174u = new S0.l(19);
    }
}
