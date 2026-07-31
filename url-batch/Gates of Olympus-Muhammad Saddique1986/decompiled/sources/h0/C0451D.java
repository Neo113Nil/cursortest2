package h0;

import B.Y;
import d0.InterfaceC0403d;
import e2.InterfaceC0424c;

/* renamed from: h0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0451D extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0452E f5858f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0451D(C0452E c0452e, int i3) {
        super(1);
        this.f5857e = i3;
        this.f5858f = c0452e;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [e2.a, f2.k] */
    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f5857e) {
            case 0:
                C0452E c0452e = this.f5858f;
                c0452e.f5861d = true;
                c0452e.f5863f.b();
                return R1.y.f4171a;
            default:
                InterfaceC0403d interfaceC0403d = (InterfaceC0403d) obj;
                C0452E c0452e2 = this.f5858f;
                C0460c c0460c = c0452e2.f5859b;
                float f3 = c0452e2.f5868k;
                float f4 = c0452e2.f5869l;
                G1.m S3 = interfaceC0403d.S();
                long n3 = S3.n();
                S3.h().f();
                try {
                    ((Y) S3.f2116b).o(f3, f4, 0L);
                    c0460c.a(interfaceC0403d);
                    A.k.q(S3, n3);
                    return R1.y.f4171a;
                } catch (Throwable th) {
                    A.k.q(S3, n3);
                    throw th;
                }
        }
    }
}
