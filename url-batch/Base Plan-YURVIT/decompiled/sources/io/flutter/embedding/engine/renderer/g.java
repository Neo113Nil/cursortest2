package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f2366e;

    /* renamed from: f, reason: collision with root package name */
    public final FlutterJNI f2367f;

    public g(long j2, FlutterJNI flutterJNI) {
        this.f2366e = j2;
        this.f2367f = flutterJNI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FlutterJNI flutterJNI = this.f2367f;
        if (flutterJNI.isAttached()) {
            flutterJNI.unregisterTexture(this.f2366e);
        }
    }
}
