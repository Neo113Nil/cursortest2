package I;

import android.os.Looper;
import e2.InterfaceC0422a;

/* renamed from: I.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0137a extends f2.k implements InterfaceC0422a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0137a f2788f = new C0137a(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0137a f2789g = new C0137a(0, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2790e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0137a(int i3, int i4) {
        super(i3);
        this.f2790e = i4;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f2790e) {
            case 0:
                return Looper.getMainLooper() != null ? D.f2646d : D0.f2648d;
            default:
                C0143d.x("Unexpected call to default provider");
                throw null;
        }
    }
}
