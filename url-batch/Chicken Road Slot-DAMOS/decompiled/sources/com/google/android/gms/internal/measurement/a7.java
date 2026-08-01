package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a7 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f2137d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2138e;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2139i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d7 f2140r;

    public a7(d7 d7Var, boolean z10) {
        Objects.requireNonNull(d7Var);
        this.f2140r = d7Var;
        this.f2137d = System.currentTimeMillis();
        this.f2138e = SystemClock.elapsedRealtime();
        this.f2139i = z10;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        d7 d7Var = this.f2140r;
        if (d7Var.f2228d) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e2) {
            d7Var.b(e2, false, this.f2139i);
            b();
        }
    }

    public void b() {
    }
}
