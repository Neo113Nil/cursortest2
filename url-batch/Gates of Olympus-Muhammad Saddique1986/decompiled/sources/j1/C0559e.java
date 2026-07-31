package j1;

import R1.y;
import T2.v;
import e2.InterfaceC0422a;

/* renamed from: j1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0559e extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6375e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f6376f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0559e(f fVar, int i3) {
        super(0);
        this.f6375e = i3;
        this.f6376f = fVar;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        switch (this.f6375e) {
            case 0:
                f fVar = this.f6376f;
                v vVar = (v) fVar.f6381c.b();
                if (U2.c.a(vVar) != -1) {
                    return A1.i.l(vVar.f4447d.o(), true);
                }
                throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + fVar.f6381c + ", instead got " + vVar).toString());
            default:
                A1.i iVar = f.f6378f;
                f fVar2 = this.f6376f;
                synchronized (iVar) {
                    f.f6377e.remove(((v) fVar2.f6382d.getValue()).f4447d.o());
                }
                return y.f4171a;
        }
    }
}
