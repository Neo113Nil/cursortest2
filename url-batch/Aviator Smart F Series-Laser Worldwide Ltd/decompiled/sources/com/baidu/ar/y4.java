package com.baidu.ar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes.dex */
public class y4 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final y9 f3749a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3750b;

    /* renamed from: c, reason: collision with root package name */
    public final c f3751c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3752d;

    public y4(c cVar, Looper looper, int i8) {
        super(looper);
        this.f3752d = false;
        this.f3751c = cVar;
        this.f3750b = i8;
        this.f3749a = new y9();
    }

    public void a() {
        this.f3752d = true;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        SystemClock.uptimeMillis();
        if (this.f3752d) {
            return;
        }
        this.f3749a.a();
        synchronized (this) {
            this.f3749a.a();
        }
    }
}
