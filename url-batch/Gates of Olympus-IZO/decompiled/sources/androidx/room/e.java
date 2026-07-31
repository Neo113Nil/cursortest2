package androidx.room;

import java.util.concurrent.Callable;
import k2.AbstractC0552y;
import n2.InterfaceC0701g;

/* loaded from: classes.dex */
public final class e extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f4067e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f4068f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f4069g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String[] f4070h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Callable f4071i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(s sVar, String[] strArr, Callable callable, P1.d dVar) {
        super(2, dVar);
        this.f4069g = sVar;
        this.f4070h = strArr;
        this.f4071i = callable;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        e eVar = new e(this.f4069g, this.f4070h, this.f4071i, dVar);
        eVar.f4068f = obj;
        return eVar;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((e) create((InterfaceC0701g) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f4067e;
        if (i3 == 0) {
            I2.l.Q(obj);
            InterfaceC0701g interfaceC0701g = (InterfaceC0701g) this.f4068f;
            Callable callable = this.f4071i;
            d dVar = new d(this.f4069g, interfaceC0701g, this.f4070h, callable, null);
            this.f4067e = 1;
            if (AbstractC0552y.d(dVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return L1.z.f2729a;
    }
}
