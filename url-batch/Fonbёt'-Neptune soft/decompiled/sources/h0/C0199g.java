package h0;

import D0.RunnableC0061v;
import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: h0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199g {

    /* renamed from: a, reason: collision with root package name */
    public final String f2305a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2306b;

    /* renamed from: c, reason: collision with root package name */
    public HandlerThread f2307c;

    /* renamed from: d, reason: collision with root package name */
    public Handler f2308d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC0061v f2309e;

    /* renamed from: f, reason: collision with root package name */
    public C0198f f2310f;

    public C0199g(String str, int i2) {
        this.f2305a = str;
        this.f2306b = i2;
    }

    public final synchronized void a() {
        HandlerThread handlerThread = this.f2307c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f2307c = null;
            this.f2308d = null;
        }
    }

    public final synchronized void b(RunnableC0061v runnableC0061v) {
        HandlerThread handlerThread = new HandlerThread(this.f2305a, this.f2306b);
        this.f2307c = handlerThread;
        handlerThread.start();
        this.f2308d = new Handler(this.f2307c.getLooper());
        this.f2309e = runnableC0061v;
    }
}
