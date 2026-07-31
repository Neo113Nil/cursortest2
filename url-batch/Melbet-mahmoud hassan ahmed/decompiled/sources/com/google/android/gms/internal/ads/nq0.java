package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

@TargetApi(14)
/* loaded from: classes.dex */
public final class nq0 {

    /* renamed from: b, reason: collision with root package name */
    private long f9207b;

    /* renamed from: a, reason: collision with root package name */
    private final long f9206a = TimeUnit.MILLISECONDS.toNanos(((Long) sw.c().b(m10.f8339y)).longValue());

    /* renamed from: c, reason: collision with root package name */
    private boolean f9208c = true;

    nq0() {
    }

    public final void a(SurfaceTexture surfaceTexture, yp0 yp0Var) {
        if (yp0Var == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (this.f9208c || Math.abs(timestamp - this.f9207b) >= this.f9206a) {
            this.f9208c = false;
            this.f9207b = timestamp;
            a3.g2.f72i.post(new mq0(this, yp0Var));
        }
    }

    public final void b() {
        this.f9208c = true;
    }
}
