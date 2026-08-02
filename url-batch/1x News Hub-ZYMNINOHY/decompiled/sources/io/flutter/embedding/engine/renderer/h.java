package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f9138a;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f9139b;

    public h(long j3, FlutterJNI flutterJNI) {
        this.f9138a = j3;
        this.f9139b = flutterJNI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FlutterJNI flutterJNI = this.f9139b;
        if (flutterJNI.isAttached()) {
            flutterJNI.unregisterTexture(this.f9138a);
        }
    }
}
