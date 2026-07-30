package io.flutter.embedding.engine.renderer;

import io.flutter.view.o;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5556d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f5557e;

    public /* synthetic */ b(o oVar, int i2) {
        this.f5556d = i2;
        this.f5557e = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5556d) {
            case 0:
                ((FlutterRenderer$ImageReaderSurfaceProducer) this.f5557e).lambda$dequeueImage$0();
                break;
            default:
                ((g) this.f5557e).getClass();
                break;
        }
    }
}
