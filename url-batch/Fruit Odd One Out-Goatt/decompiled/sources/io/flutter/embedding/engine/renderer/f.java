package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.FlutterJNI;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final long f397b;

    /* renamed from: c, reason: collision with root package name */
    public final FlutterJNI f398c;

    public f(long j2, FlutterJNI flutterJNI) {
        this.f397b = j2;
        this.f398c = flutterJNI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FlutterJNI flutterJNI = this.f398c;
        if (flutterJNI.isAttached()) {
            flutterJNI.unregisterTexture(this.f397b);
        }
    }
}
