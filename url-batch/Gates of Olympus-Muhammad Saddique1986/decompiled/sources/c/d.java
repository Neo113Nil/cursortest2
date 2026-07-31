package c;

import R1.y;
import X1.i;
import e2.InterfaceC0427f;
import f2.q;
import q2.m0;

/* loaded from: classes.dex */
public final class d extends i implements InterfaceC0427f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5448h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5449i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, V1.d dVar, int i3) {
        super(3, dVar);
        this.f5448h = i3;
        this.f5449i = obj;
    }

    @Override // e2.InterfaceC0427f
    public final Object g(Object obj, Object obj2, Object obj3) {
        V1.d dVar = (V1.d) obj3;
        switch (this.f5448h) {
            case 0:
                d dVar2 = new d((q) this.f5449i, dVar, 0);
                y yVar = y.f4171a;
                dVar2.q(yVar);
                return yVar;
            default:
                d dVar3 = new d((m0) this.f5449i, dVar, 1);
                y yVar2 = y.f4171a;
                dVar3.q(yVar2);
                return yVar2;
        }
    }

    @Override // X1.a
    public final Object q(Object obj) {
        y yVar = y.f4171a;
        Object obj2 = this.f5449i;
        switch (this.f5448h) {
            case 0:
                R1.a.e(obj);
                ((q) obj2).f5828d = true;
                break;
            default:
                R1.a.e(obj);
                ((m0) obj2).a(null);
                break;
        }
        return yVar;
    }
}
