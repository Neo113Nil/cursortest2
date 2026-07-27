package x2;

import io.flutter.embedding.engine.FlutterEngine;

/* renamed from: x2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1542e implements InterfaceC1539b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlutterEngine f12288a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1544g f12289b;

    public C1542e(C1544g c1544g, FlutterEngine flutterEngine) {
        this.f12289b = c1544g;
        this.f12288a = flutterEngine;
    }

    @Override // x2.InterfaceC1539b
    public final void a() {
        this.f12289b.f12296a.remove(this.f12288a);
    }

    @Override // x2.InterfaceC1539b
    public final void b() {
    }
}
