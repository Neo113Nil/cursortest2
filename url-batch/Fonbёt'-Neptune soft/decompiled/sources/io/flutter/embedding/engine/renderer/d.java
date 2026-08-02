package io.flutter.embedding.engine.renderer;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ io.flutter.view.o f2503f;

    public /* synthetic */ d(io.flutter.view.o oVar, int i2) {
        this.f2502e = i2;
        this.f2503f = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2502e) {
            case 0:
                ((FlutterRenderer$ImageReaderSurfaceProducer) this.f2503f).lambda$dequeueImage$0();
                break;
            default:
                ((i) this.f2503f).getClass();
                break;
        }
    }
}
