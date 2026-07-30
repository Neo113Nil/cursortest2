package com.baidu.ar;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name */
    public String f2966a;

    /* renamed from: b, reason: collision with root package name */
    public HandlerThread f2967b;

    /* renamed from: c, reason: collision with root package name */
    public a f2968c;

    public static final class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        public void a(Runnable runnable) {
            Message obtain = Message.obtain();
            obtain.obj = runnable;
            sendMessage(obtain);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            Runnable runnable = (Runnable) message.obj;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public q0(String str) {
        this.f2966a = str;
    }

    public void a() {
        HandlerThread handlerThread = new HandlerThread(this.f2966a);
        this.f2967b = handlerThread;
        handlerThread.start();
        this.f2968c = new a(this.f2967b.getLooper());
    }

    public void a(Runnable runnable) {
        a aVar = this.f2968c;
        if (aVar != null) {
            aVar.a(runnable);
        }
    }
}
