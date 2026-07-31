package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.util.Objects;

/* loaded from: classes.dex */
final class bk implements fm {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f3447a;

    /* renamed from: b, reason: collision with root package name */
    private final tl f3448b;

    /* renamed from: c, reason: collision with root package name */
    private final ck f3449c;

    /* renamed from: d, reason: collision with root package name */
    private final lm f3450d;

    /* renamed from: e, reason: collision with root package name */
    private final hh f3451e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f3452f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3453g;

    /* renamed from: h, reason: collision with root package name */
    private long f3454h;

    /* renamed from: i, reason: collision with root package name */
    private long f3455i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ ek f3456j;

    public bk(ek ekVar, Uri uri, tl tlVar, ck ckVar, lm lmVar) {
        this.f3456j = ekVar;
        Objects.requireNonNull(uri);
        this.f3447a = uri;
        Objects.requireNonNull(tlVar);
        this.f3448b = tlVar;
        Objects.requireNonNull(ckVar);
        this.f3449c = ckVar;
        this.f3450d = lmVar;
        this.f3451e = new hh();
        this.f3453g = true;
        this.f3455i = -1L;
    }

    @Override // com.google.android.gms.internal.ads.fm
    public final void a() {
        this.f3452f = true;
    }

    @Override // com.google.android.gms.internal.ads.fm
    public final boolean b() {
        return this.f3452f;
    }

    @Override // com.google.android.gms.internal.ads.fm
    public final void c() {
        bh bhVar;
        long j7;
        Handler handler;
        Runnable runnable;
        while (!this.f3452f) {
            int i7 = 0;
            try {
                long j8 = this.f3451e.f6243a;
                long e7 = this.f3448b.e(new vl(this.f3447a, null, j8, j8, -1L, null, 0));
                this.f3455i = e7;
                if (e7 != -1) {
                    e7 += j8;
                    this.f3455i = e7;
                }
                bhVar = new bh(this.f3448b, j8, e7);
                try {
                    ch b7 = this.f3449c.b(bhVar, this.f3448b.c());
                    if (this.f3453g) {
                        b7.b(j8, this.f3454h);
                        this.f3453g = false;
                    }
                    long j9 = j8;
                    int i8 = 0;
                    while (true) {
                        if (i8 != 0) {
                            break;
                        }
                        try {
                            if (this.f3452f) {
                                i8 = 0;
                                break;
                            }
                            this.f3450d.a();
                            i8 = b7.e(bhVar, this.f3451e);
                            long d7 = bhVar.d();
                            j7 = this.f3456j.f4630l;
                            if (d7 > j7 + j9) {
                                j9 = bhVar.d();
                                this.f3450d.b();
                                handler = this.f3456j.f4636r;
                                runnable = this.f3456j.f4635q;
                                handler.post(runnable);
                            }
                        } catch (Throwable th) {
                            th = th;
                            i7 = i8;
                            if (i7 != 1 && bhVar != null) {
                                this.f3451e.f6243a = bhVar.d();
                            }
                            zm.m(this.f3448b);
                            throw th;
                        }
                    }
                    if (i8 != 1) {
                        this.f3451e.f6243a = bhVar.d();
                        i7 = i8;
                    }
                    zm.m(this.f3448b);
                    if (i7 != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                bhVar = null;
            }
        }
    }

    public final void e(long j7, long j8) {
        this.f3451e.f6243a = j7;
        this.f3454h = j8;
        this.f3453g = true;
    }
}
