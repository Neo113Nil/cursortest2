package com.unity3d.player;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class GoogleVrApi {

    /* renamed from: a, reason: collision with root package name */
    private static AtomicReference f9265a = new AtomicReference();

    private GoogleVrApi() {
    }

    static void a() {
        f9265a.set(null);
    }

    static void a(d dVar) {
        f9265a.compareAndSet(null, new GoogleVrProxy(dVar));
    }

    static GoogleVrProxy b() {
        return (GoogleVrProxy) f9265a.get();
    }

    public static GoogleVrVideo getGoogleVrVideo() {
        return (GoogleVrVideo) f9265a.get();
    }
}
