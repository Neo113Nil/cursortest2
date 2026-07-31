package F1;

import I.C0156j0;
import L1.t;
import R1.y;
import X1.i;
import com.gatesof.olympus.martu.marku.ChairActivity;
import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class a extends i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public C0156j0 f1950h;

    /* renamed from: i, reason: collision with root package name */
    public int f1951i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ L1.e f1952j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0156j0 f1953k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(L1.e eVar, C0156j0 c0156j0, V1.d dVar) {
        super(2, dVar);
        this.f1952j = eVar;
        this.f1953k = c0156j0;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((a) o((V1.d) obj2, (InterfaceC0835w) obj)).q(y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new a(this.f1952j, this.f1953k, dVar);
    }

    @Override // X1.a
    public final Object q(Object obj) {
        C0156j0 c0156j0;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f1951i;
        if (i3 == 0) {
            R1.a.e(obj);
            C0156j0 c0156j02 = this.f1953k;
            this.f1950h = c0156j02;
            this.f1951i = 1;
            Object a3 = this.f1952j.a(this);
            if (a3 == aVar) {
                return aVar;
            }
            c0156j0 = c0156j02;
            obj = a3;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0156j0 = this.f1950h;
            R1.a.e(obj);
        }
        int i4 = ChairActivity.f5624x;
        c0156j0.setValue((t) obj);
        return y.f4171a;
    }
}
