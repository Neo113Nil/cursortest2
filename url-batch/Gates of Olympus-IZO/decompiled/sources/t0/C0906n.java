package t0;

import java.util.LinkedHashMap;

/* renamed from: t0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0906n extends Z1.j implements Y1.a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0906n f7938f = new C0906n(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0906n f7939g = new C0906n(0, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7940e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0906n(int i3, int i4) {
        super(i3);
        this.f7940e = i4;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f7940e) {
            case 0:
                return new LinkedHashMap();
            default:
                return new D(3, 0, false);
        }
    }
}
