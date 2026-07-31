package w1;

import com.gatesof.olympus.martu.marku.data.db.AppDatabase_Impl;
import e2.InterfaceC0426e;
import java.util.concurrent.Callable;
import q2.AbstractC0837y;
import t2.InterfaceC1054g;

/* renamed from: w1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1182e extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f9868h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f9869i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AppDatabase_Impl f9870j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String[] f9871k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Callable f9872l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1182e(AppDatabase_Impl appDatabase_Impl, String[] strArr, Callable callable, V1.d dVar) {
        super(2, dVar);
        this.f9870j = appDatabase_Impl;
        this.f9871k = strArr;
        this.f9872l = callable;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C1182e) o((V1.d) obj2, (InterfaceC1054g) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C1182e c1182e = new C1182e(this.f9870j, this.f9871k, this.f9872l, dVar);
        c1182e.f9869i = obj;
        return c1182e;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9868h;
        if (i3 == 0) {
            R1.a.e(obj);
            C1181d c1181d = new C1181d(this.f9870j, (InterfaceC1054g) this.f9869i, this.f9871k, this.f9872l, null);
            this.f9868h = 1;
            if (AbstractC0837y.e(c1181d, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
        }
        return R1.y.f4171a;
    }
}
