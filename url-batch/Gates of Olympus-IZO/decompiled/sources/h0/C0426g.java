package h0;

import android.graphics.PathMeasure;
import b0.C0279l;

/* renamed from: h0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0426g extends Z1.j implements Y1.a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0426g f4971f = new C0426g(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0426g f4972g = new C0426g(0, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4973e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0426g(int i3, int i4) {
        super(i3);
        this.f4973e = i4;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f4973e) {
            case 0:
                return new C0279l(new PathMeasure());
            default:
                return L1.z.f2729a;
        }
    }
}
