package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* loaded from: classes.dex */
final class jn implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: k, reason: collision with root package name */
    private static final jn f7184k = new jn();

    /* renamed from: f, reason: collision with root package name */
    public volatile long f7185f;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f7186g;

    /* renamed from: h, reason: collision with root package name */
    private final HandlerThread f7187h;

    /* renamed from: i, reason: collision with root package name */
    private Choreographer f7188i;

    /* renamed from: j, reason: collision with root package name */
    private int f7189j;

    private jn() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.f7187h = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f7186g = handler;
        handler.sendEmptyMessage(0);
    }

    public static jn a() {
        return f7184k;
    }

    public final void b() {
        this.f7186g.sendEmptyMessage(1);
    }

    public final void c() {
        this.f7186g.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        this.f7185f = j7;
        this.f7188i.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 0) {
            this.f7188i = Choreographer.getInstance();
            return true;
        }
        if (i7 == 1) {
            int i8 = this.f7189j + 1;
            this.f7189j = i8;
            if (i8 == 1) {
                this.f7188i.postFrameCallback(this);
            }
            return true;
        }
        if (i7 != 2) {
            return false;
        }
        int i9 = this.f7189j - 1;
        this.f7189j = i9;
        if (i9 == 0) {
            this.f7188i.removeFrameCallback(this);
            this.f7185f = 0L;
        }
        return true;
    }
}
