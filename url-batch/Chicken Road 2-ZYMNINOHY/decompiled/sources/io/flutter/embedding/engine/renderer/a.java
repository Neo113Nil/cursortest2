package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.renderer.FlutterRenderer;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13555a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13556b;

    public /* synthetic */ a(int i4, Object obj) {
        this.f13555a = i4;
        this.f13556b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13555a) {
            case 0:
                ((FlutterRenderer.ImageReaderSurfaceProducer) this.f13556b).lambda$dequeueImage$0();
                break;
            default:
                ((FlutterRenderer.SurfaceTextureRegistryEntry) this.f13556b).lambda$new$0();
                break;
        }
    }
}
