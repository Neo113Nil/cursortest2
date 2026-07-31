package g1;

import L1.z;
import N2.v;

/* renamed from: g1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0398e extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4806e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0399f f4807f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0398e(C0399f c0399f, int i3) {
        super(0);
        this.f4806e = i3;
        this.f4807f = c0399f;
    }

    @Override // Y1.a
    public final Object b() {
        switch (this.f4806e) {
            case 0:
                C0399f c0399f = this.f4807f;
                v vVar = (v) c0399f.f4812c.b();
                if (O2.c.a(vVar) != -1) {
                    return F0.a.l(vVar.f2967d.o(), true);
                }
                throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + c0399f.f4812c + ", instead got " + vVar).toString());
            default:
                F0.a aVar = C0399f.f4809f;
                C0399f c0399f2 = this.f4807f;
                synchronized (aVar) {
                    C0399f.f4808e.remove(((v) c0399f2.f4813d.getValue()).f2967d.o());
                }
                return z.f2729a;
        }
    }
}
