package t0;

import e2.InterfaceC0422a;
import java.util.LinkedHashMap;

/* renamed from: t0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1001n extends f2.k implements InterfaceC0422a {

    /* renamed from: f, reason: collision with root package name */
    public static final C1001n f8772f = new C1001n(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C1001n f8773g = new C1001n(0, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8774e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1001n(int i3, int i4) {
        super(i3);
        this.f8774e = i4;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f8774e) {
            case 0:
                return new LinkedHashMap();
            default:
                return new E(3, 0, false);
        }
    }
}
