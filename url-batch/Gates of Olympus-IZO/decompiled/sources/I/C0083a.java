package I;

import android.os.Looper;

/* renamed from: I.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0083a extends Z1.j implements Y1.a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0083a f2231f = new C0083a(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0083a f2232g = new C0083a(0, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2233e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0083a(int i3, int i4) {
        super(i3);
        this.f2233e = i4;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f2233e) {
            case 0:
                return Looper.getMainLooper() != null ? D.f2085d : E0.f2095d;
            default:
                C0089d.x("Unexpected call to default provider");
                throw null;
        }
    }
}
