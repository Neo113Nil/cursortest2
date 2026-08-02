package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f2517e;

    /* renamed from: f, reason: collision with root package name */
    public final FlutterJNI f2518f;

    public j(long j2, FlutterJNI flutterJNI) {
        this.f2517e = j2;
        this.f2518f = flutterJNI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FlutterJNI flutterJNI = this.f2518f;
        if (flutterJNI.isAttached()) {
            flutterJNI.unregisterTexture(this.f2517e);
        }
    }
}
