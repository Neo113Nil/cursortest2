package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.unity3d.player.c1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1733c1 {

    /* renamed from: a, reason: collision with root package name */
    public final UnityPlayer f22150a;

    /* renamed from: c, reason: collision with root package name */
    public C1750i0 f22152c;

    /* renamed from: b, reason: collision with root package name */
    public Context f22151b = null;

    /* renamed from: d, reason: collision with root package name */
    public final Semaphore f22153d = new Semaphore(0);

    /* renamed from: e, reason: collision with root package name */
    public final ReentrantLock f22154e = new ReentrantLock();

    /* renamed from: f, reason: collision with root package name */
    public VideoPlayer f22155f = null;

    /* renamed from: g, reason: collision with root package name */
    public int f22156g = 2;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22157h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22158i = false;

    public C1733c1(UnityPlayer unityPlayer) {
        this.f22150a = null;
        this.f22150a = unityPlayer;
    }

    public void runOnUiThread(Runnable runnable) {
        Context context = this.f22151b;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            h1.T.a(5, "Not running from an Activity; Ignoring execution request...");
        }
    }
}
