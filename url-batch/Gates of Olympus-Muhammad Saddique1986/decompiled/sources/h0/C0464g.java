package h0;

import android.graphics.PathMeasure;
import b0.C0342k;
import e2.InterfaceC0422a;

/* renamed from: h0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0464g extends f2.k implements InterfaceC0422a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0464g f5961f = new C0464g(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0464g f5962g = new C0464g(0, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5963e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0464g(int i3, int i4) {
        super(i3);
        this.f5963e = i4;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f5963e) {
            case 0:
                return new C0342k(new PathMeasure());
            default:
                return R1.y.f4171a;
        }
    }
}
