package q;

import java.util.List;
import p0.InterfaceC0945F;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import z2.C1412P;

/* renamed from: q.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1034m implements InterfaceC0945F {

    /* renamed from: b, reason: collision with root package name */
    public static final C1034m f9282b = new C1034m(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C1034m f9283c = new C1034m(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9284a;

    public /* synthetic */ C1034m(int i2) {
        this.f9284a = i2;
    }

    @Override // p0.InterfaceC0945F
    public final InterfaceC0946G f(InterfaceC0947H interfaceC0947H, List list, long j4) {
        InterfaceC0946G t4;
        InterfaceC0946G t5;
        switch (this.f9284a) {
            case 0:
                t4 = interfaceC0947H.t(M0.a.k(j4), M0.a.j(j4), C1412P.c(), C1033l.f9274e);
                return t4;
            default:
                t5 = interfaceC0947H.t(M0.a.g(j4) ? M0.a.i(j4) : 0, M0.a.f(j4) ? M0.a.h(j4) : 0, C1412P.c(), C1033l.f9278l);
                return t5;
        }
    }
}
