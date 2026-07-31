package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m20 {

    /* renamed from: a, reason: collision with root package name */
    private MotionEvent f8366a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* renamed from: b, reason: collision with root package name */
    private MotionEvent f8367b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* renamed from: c, reason: collision with root package name */
    private final Context f8368c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f8369d;

    /* renamed from: e, reason: collision with root package name */
    private final o20 f8370e;

    public m20(Context context, ScheduledExecutorService scheduledExecutorService, o20 o20Var, byte[] bArr) {
        this.f8368c = context;
        this.f8369d = scheduledExecutorService;
        this.f8370e = o20Var;
    }

    public final cc3<String> a() {
        return (ib3) rb3.o(ib3.E(rb3.i(null)), a30.f2582c.e().longValue(), TimeUnit.MILLISECONDS, this.f8369d);
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.f8366a.getEventTime()) {
            this.f8366a = MotionEvent.obtain(motionEvent);
        } else {
            if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.f8367b.getEventTime()) {
                return;
            }
            this.f8367b = MotionEvent.obtain(motionEvent);
        }
    }
}
