package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final long f4459f;

    /* renamed from: g, reason: collision with root package name */
    public final FlutterJNI f4460g;

    public f(long j4, FlutterJNI flutterJNI) {
        this.f4459f = j4;
        this.f4460g = flutterJNI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FlutterJNI flutterJNI = this.f4460g;
        if (flutterJNI.isAttached()) {
            flutterJNI.unregisterTexture(this.f4459f);
        }
    }
}
