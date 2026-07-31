package w1;

import com.gatesof.olympus.martu.marku.data.db.AppDatabase_Impl;
import e2.InterfaceC0426e;
import java.util.concurrent.Callable;
import q2.AbstractC0831s;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;
import t2.AbstractC1035F;
import t2.InterfaceC1054g;

/* renamed from: w1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1181d extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f9862h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f9863i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AppDatabase_Impl f9864j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1054g f9865k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String[] f9866l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Callable f9867m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1181d(AppDatabase_Impl appDatabase_Impl, InterfaceC1054g interfaceC1054g, String[] strArr, Callable callable, V1.d dVar) {
        super(2, dVar);
        this.f9864j = appDatabase_Impl;
        this.f9865k = interfaceC1054g;
        this.f9866l = strArr;
        this.f9867m = callable;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C1181d) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C1181d c1181d = new C1181d(this.f9864j, this.f9865k, this.f9866l, this.f9867m, dVar);
        c1181d.f9863i = obj;
        return c1181d;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9862h;
        R1.y yVar = R1.y.f4171a;
        if (i3 == 0) {
            R1.a.e(obj);
            InterfaceC0835w interfaceC0835w = (InterfaceC0835w) this.f9863i;
            s2.g a3 = n.r.a(-1, 6, null);
            C1180c c1180c = new C1180c(this.f9866l, a3);
            a3.p(yVar);
            if (interfaceC0835w.q().v(AbstractC1176C.f9850d) != null) {
                throw new ClassCastException();
            }
            AppDatabase_Impl appDatabase_Impl = this.f9864j;
            AbstractC0831s b3 = h.b(appDatabase_Impl);
            s2.g a4 = n.r.a(0, 7, null);
            AbstractC0837y.r(interfaceC0835w, b3, null, new C1179b(appDatabase_Impl, c1180c, a3, this.f9867m, a4, null), 2);
            this.f9862h = 1;
            Object i4 = AbstractC1035F.i(this.f9865k, a4, true, this);
            if (i4 != aVar) {
                i4 = yVar;
            }
            if (i4 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return yVar;
    }
}
