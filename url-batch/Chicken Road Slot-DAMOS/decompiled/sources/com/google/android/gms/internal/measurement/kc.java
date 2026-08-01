package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class kc implements a8.m {

    /* renamed from: d, reason: collision with root package name */
    public final String f2449d;

    /* renamed from: e, reason: collision with root package name */
    public final z6.j f2450e;

    /* renamed from: i, reason: collision with root package name */
    public volatile int f2451i = -1;

    /* renamed from: r, reason: collision with root package name */
    public v5 f2452r;

    public kc(String str, z6.j jVar) {
        this.f2449d = str;
        this.f2450e = jVar;
    }

    public abstract Object a();

    public abstract Object b(String str);

    public abstract Object c(Object obj);

    public abstract Object d();

    public abstract void e(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:54:0x010c A[Catch: all -> 0x00a5, TryCatch #2 {all -> 0x00a5, blocks: (B:37:0x0090, B:39:0x0094, B:40:0x00a9, B:42:0x00b5, B:44:0x00c7, B:46:0x00d5, B:52:0x00f6, B:54:0x010c, B:55:0x0112, B:57:0x011b, B:59:0x0129, B:61:0x0131, B:62:0x0148, B:75:0x015b, B:64:0x016e, B:68:0x0178, B:70:0x017e, B:71:0x0183, B:78:0x0163, B:81:0x00fe, B:82:0x00ea, B:83:0x00e2, B:85:0x0185), top: B:36:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0178 A[Catch: all -> 0x00a5, TryCatch #2 {all -> 0x00a5, blocks: (B:37:0x0090, B:39:0x0094, B:40:0x00a9, B:42:0x00b5, B:44:0x00c7, B:46:0x00d5, B:52:0x00f6, B:54:0x010c, B:55:0x0112, B:57:0x011b, B:59:0x0129, B:61:0x0131, B:62:0x0148, B:75:0x015b, B:64:0x016e, B:68:0x0178, B:70:0x017e, B:71:0x0183, B:78:0x0163, B:81:0x00fe, B:82:0x00ea, B:83:0x00e2, B:85:0x0185), top: B:36:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017e A[Catch: all -> 0x00a5, TryCatch #2 {all -> 0x00a5, blocks: (B:37:0x0090, B:39:0x0094, B:40:0x00a9, B:42:0x00b5, B:44:0x00c7, B:46:0x00d5, B:52:0x00f6, B:54:0x010c, B:55:0x0112, B:57:0x011b, B:59:0x0129, B:61:0x0131, B:62:0x0148, B:75:0x015b, B:64:0x016e, B:68:0x0178, B:70:0x017e, B:71:0x0183, B:78:0x0163, B:81:0x00fe, B:82:0x00ea, B:83:0x00e2, B:85:0x0185), top: B:36:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // a8.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get() {
        vc vcVar;
        Object obj;
        String str;
        int i3;
        Object obj2;
        s.r0 r0Var;
        sa saVar;
        if (ia.f2401e == null) {
            Object obj3 = sa.j;
            ia.f2401e = new b1.j(5);
        }
        Context context = (Context) sa.f2783k.get();
        Object obj4 = null;
        if (context == null) {
            synchronized (ia.f2399c) {
            }
            kotlin.collections.i0.l("Must call PhenotypeContext.setContext() first");
            return null;
        }
        sa saVar2 = sa.f2784l;
        if (saVar2 == null) {
            Context applicationContext = context.getApplicationContext();
            try {
                applicationContext.getClass();
                Context applicationContext2 = applicationContext.getApplicationContext();
                applicationContext2.getClass();
                Class<?> cls = applicationContext2.getClass();
                new StringBuilder(String.valueOf(cls).length() + 72);
                cls.toString();
                throw new IllegalStateException("Given application context does not implement GeneratedComponentManager: ".concat(String.valueOf(cls)));
            } catch (IllegalStateException unused) {
                synchronized (sa.j) {
                    try {
                        if (sa.f2784l != null) {
                            saVar = sa.f2784l;
                        } else {
                            saVar = (sa) new ta(applicationContext, 0).get();
                            sa.f2784l = saVar;
                            h.h(Level.CONFIG, saVar.a(), null, "Application doesn't implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info.", new Object[0]);
                        }
                        saVar2 = saVar;
                    } finally {
                    }
                }
            }
        }
        int i10 = this.f2451i;
        if (i10 == -1 || i10 < ((AtomicInteger) this.f2452r.f2870e).get()) {
            synchronized (this) {
                try {
                    int i11 = this.f2451i;
                    if (i11 == -1) {
                        sa.b();
                        saVar2.getClass();
                        vcVar = this.f2450e.c(saVar2);
                        this.f2452r = vcVar.g;
                    } else {
                        vcVar = null;
                    }
                    int i12 = ((AtomicInteger) this.f2452r.f2870e).get();
                    if (i11 < i12) {
                        sa.b();
                        saVar2.getClass();
                        a8.g b10 = oa.b(saVar2.f2787b);
                        if (b10.b()) {
                            na naVar = (na) b10.a();
                            Uri a9 = pa.a();
                            String str2 = this.f2449d;
                            if (a9 != null) {
                                r0Var = (s.r0) naVar.f2575a.get(a9.toString());
                            } else {
                                naVar.getClass();
                                r0Var = null;
                            }
                            String str3 = r0Var == null ? null : (String) r0Var.get(str2);
                            if (str3 != null) {
                                try {
                                    obj = b(str3);
                                } catch (IOException | IllegalArgumentException e2) {
                                    Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.f2449d), e2);
                                }
                                if (vcVar == null) {
                                    vcVar = this.f2450e.c(saVar2);
                                }
                                str = vcVar.f2887c;
                                i3 = 1;
                                if (Build.VERSION.SDK_INT >= 26 && !saVar2.f2787b.getPackageName().equals("com.android.vending") && !str.startsWith("com.google.android.gms.measurement#")) {
                                    ListenableFuture a10 = saVar2.a().a(new xc(saVar2, str));
                                    a10.a(new bd(i3, a10), f8.d0.f4128d);
                                }
                                obj2 = ((b8.x) vcVar.a().f1295d).get(this.f2449d);
                                if (obj2 != null) {
                                    try {
                                        obj4 = c(obj2);
                                    } catch (IOException | ClassCastException e9) {
                                        Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.f2449d), e9);
                                    }
                                }
                                if (true == b10.b()) {
                                    obj = obj4;
                                }
                                if (obj == null) {
                                    obj = a();
                                }
                                if (obj != null) {
                                    e(obj);
                                    this.f2451i = i12;
                                }
                            }
                        }
                        obj = null;
                        if (vcVar == null) {
                        }
                        str = vcVar.f2887c;
                        i3 = 1;
                        if (Build.VERSION.SDK_INT >= 26) {
                            ListenableFuture a102 = saVar2.a().a(new xc(saVar2, str));
                            a102.a(new bd(i3, a102), f8.d0.f4128d);
                        }
                        obj2 = ((b8.x) vcVar.a().f1295d).get(this.f2449d);
                        if (obj2 != null) {
                        }
                        if (true == b10.b()) {
                        }
                        if (obj == null) {
                        }
                        if (obj != null) {
                        }
                    }
                } finally {
                }
            }
            obj.getClass();
            return obj;
        }
        obj = d();
        obj.getClass();
        return obj;
    }
}
