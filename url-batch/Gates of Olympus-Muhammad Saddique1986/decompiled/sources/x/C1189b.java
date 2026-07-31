package x;

import a0.C0241f;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import b0.C0338g;
import b0.C0344m;
import b0.C0345n;
import e2.InterfaceC0424c;
import h2.AbstractC0508a;
import p.W0;

/* renamed from: x.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1189b extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f10056f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1189b(long j3, int i3) {
        super(1);
        this.f10055e = i3;
        this.f10056f = j3;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f10055e) {
            case 0:
                Y.c cVar = (Y.c) obj;
                float d3 = C0241f.d(cVar.f4651d.d()) / 2.0f;
                C0338g w2 = AbstractC0508a.w(cVar, d3);
                int i3 = Build.VERSION.SDK_INT;
                long j3 = this.f10056f;
                return cVar.b(new W0(d3, w2, new C0344m(j3, 5, i3 >= 29 ? C0345n.f5427a.a(j3, 5) : new PorterDuffColorFilter(b0.M.D(j3), b0.M.G(5)))));
            default:
                ((A0.i) obj).c(B.F.f280c, new B.E(EnumC1187E.f9940d, this.f10056f, 2, true));
                return R1.y.f4171a;
        }
    }
}
