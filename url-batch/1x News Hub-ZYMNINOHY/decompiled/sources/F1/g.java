package F1;

import io.flutter.embedding.engine.FlutterEngine;

/* loaded from: classes.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlutterEngine f514a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f515b;

    public g(i iVar, FlutterEngine flutterEngine) {
        this.f515b = iVar;
        this.f514a = flutterEngine;
    }

    @Override // F1.b
    public final void a() {
        this.f515b.f521a.remove(this.f514a);
    }

    @Override // F1.b
    public final void b() {
    }
}
