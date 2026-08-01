package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final long f603b;

    /* renamed from: c, reason: collision with root package name */
    public final FlutterJNI f604c;

    public f(long j2, FlutterJNI flutterJNI) {
        this.f603b = j2;
        this.f604c = flutterJNI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FlutterJNI flutterJNI = this.f604c;
        if (flutterJNI.isAttached()) {
            flutterJNI.unregisterTexture(this.f603b);
        }
    }
}
