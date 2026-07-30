package com.baidu.mshield.utility;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f8403a = new e();

    /* renamed from: b, reason: collision with root package name */
    public HandlerThread f8404b = new HandlerThread("rp_th", 10);

    /* renamed from: c, reason: collision with root package name */
    public Handler f8405c;

    public e() {
        b();
        this.f8405c = new Handler(this.f8404b.getLooper());
    }

    public static Looper a() {
        return f8403a.f8405c.getLooper();
    }

    public final void b() {
        this.f8404b.start();
    }
}
