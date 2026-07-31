package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class X extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final UnityPlayerForActivityOrService f22112a;

    /* renamed from: c, reason: collision with root package name */
    public Handler f22114c;

    /* renamed from: h, reason: collision with root package name */
    public int f22119h;

    /* renamed from: i, reason: collision with root package name */
    public int f22120i;

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f22113b = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    public boolean f22115d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f22116e = false;

    /* renamed from: f, reason: collision with root package name */
    public int f22117f = 2;

    /* renamed from: g, reason: collision with root package name */
    public int f22118g = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f22121j = 5;

    public X(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.f22112a = unityPlayerForActivityOrService;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        setName("UnityMain");
        Looper.prepare();
        this.f22114c = new Handler(Looper.myLooper(), new V(this));
        this.f22113b.countDown();
        Looper.loop();
    }
}
