package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f5571d;

    /* renamed from: e, reason: collision with root package name */
    public final FlutterJNI f5572e;

    public h(long j, FlutterJNI flutterJNI) {
        this.f5571d = j;
        this.f5572e = flutterJNI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FlutterJNI flutterJNI = this.f5572e;
        if (flutterJNI.isAttached()) {
            flutterJNI.unregisterTexture(this.f5571d);
        }
    }
}
