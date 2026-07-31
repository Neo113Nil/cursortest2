package p1;

import I.C0166o0;
import I.R0;
import R1.y;
import X1.i;
import e2.InterfaceC0426e;
import q2.InterfaceC0835w;
import t2.InterfaceC1043N;

/* renamed from: p1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0802a extends i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f7818h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1043N f7819i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0166o0 f7820j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0802a(InterfaceC1043N interfaceC1043N, C0166o0 c0166o0, V1.d dVar) {
        super(2, dVar);
        this.f7819i = interfaceC1043N;
        this.f7820j = c0166o0;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0802a) o((V1.d) obj2, (InterfaceC0835w) obj)).q(y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C0802a(this.f7819i, this.f7820j, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7818h;
        if (i3 == 0) {
            R1.a.e(obj);
            R0 r02 = new R0(this.f7820j, 3);
            this.f7818h = 1;
            if (this.f7819i.d(r02, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return y.f4171a;
    }
}
