package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import java.util.Objects;

/* loaded from: classes.dex */
final class ab4 implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: k, reason: collision with root package name */
    private static final ab4 f2717k = new ab4();

    /* renamed from: f, reason: collision with root package name */
    public volatile long f2718f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f2719g;

    /* renamed from: h, reason: collision with root package name */
    private final HandlerThread f2720h;

    /* renamed from: i, reason: collision with root package name */
    private Choreographer f2721i;

    /* renamed from: j, reason: collision with root package name */
    private int f2722j;

    private ab4() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.f2720h = handlerThread;
        handlerThread.start();
        Handler e02 = n13.e0(handlerThread.getLooper(), this);
        this.f2719g = e02;
        e02.sendEmptyMessage(0);
    }

    public static ab4 a() {
        return f2717k;
    }

    public final void b() {
        this.f2719g.sendEmptyMessage(1);
    }

    public final void c() {
        this.f2719g.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        this.f2718f = j7;
        Choreographer choreographer = this.f2721i;
        Objects.requireNonNull(choreographer);
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 0) {
            this.f2721i = Choreographer.getInstance();
            return true;
        }
        if (i7 == 1) {
            int i8 = this.f2722j + 1;
            this.f2722j = i8;
            if (i8 == 1) {
                Choreographer choreographer = this.f2721i;
                Objects.requireNonNull(choreographer);
                choreographer.postFrameCallback(this);
            }
            return true;
        }
        if (i7 != 2) {
            return false;
        }
        int i9 = this.f2722j - 1;
        this.f2722j = i9;
        if (i9 == 0) {
            Choreographer choreographer2 = this.f2721i;
            Objects.requireNonNull(choreographer2);
            choreographer2.removeFrameCallback(this);
            this.f2718f = -9223372036854775807L;
        }
        return true;
    }
}
