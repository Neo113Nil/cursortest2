package x;

import I.InterfaceC0142c0;
import e2.InterfaceC0426e;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class f0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public Object f10115h;

    /* renamed from: i, reason: collision with root package name */
    public int f10116i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0142c0 f10117j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f10118k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q.k f10119l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(InterfaceC0142c0 interfaceC0142c0, long j3, q.k kVar, V1.d dVar) {
        super(2, dVar);
        this.f10117j = interfaceC0142c0;
        this.f10118k = j3;
        this.f10119l = kVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((f0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new f0(this.f10117j, this.f10118k, this.f10119l, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        InterfaceC0142c0 interfaceC0142c0;
        q.m mVar;
        q.m mVar2;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f10116i;
        q.k kVar = this.f10119l;
        InterfaceC0142c0 interfaceC0142c02 = this.f10117j;
        if (i3 == 0) {
            R1.a.e(obj);
            q.m mVar3 = (q.m) interfaceC0142c02.getValue();
            if (mVar3 != null) {
                q.l lVar = new q.l(mVar3);
                if (kVar != null) {
                    this.f10115h = interfaceC0142c02;
                    this.f10116i = 1;
                    if (kVar.b(lVar, this) == aVar) {
                        return aVar;
                    }
                }
                interfaceC0142c0 = interfaceC0142c02;
            }
            mVar = new q.m(this.f10118k);
            if (kVar != null) {
                this.f10115h = mVar;
                this.f10116i = 2;
                if (kVar.b(mVar, this) == aVar) {
                    return aVar;
                }
                mVar2 = mVar;
                mVar = mVar2;
            }
            interfaceC0142c02.setValue(mVar);
            return R1.y.f4171a;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar2 = (q.m) this.f10115h;
            R1.a.e(obj);
            mVar = mVar2;
            interfaceC0142c02.setValue(mVar);
            return R1.y.f4171a;
        }
        interfaceC0142c0 = (InterfaceC0142c0) this.f10115h;
        R1.a.e(obj);
        interfaceC0142c0.setValue(null);
        mVar = new q.m(this.f10118k);
        if (kVar != null) {
        }
        interfaceC0142c02.setValue(mVar);
        return R1.y.f4171a;
    }
}
