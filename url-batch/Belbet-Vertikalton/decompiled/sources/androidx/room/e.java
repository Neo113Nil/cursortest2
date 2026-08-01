package androidx.room;

import a.AbstractC0058a;
import b1.EnumC0098a;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class e extends c1.g implements i1.p {

    /* renamed from: b, reason: collision with root package name */
    public int f2093b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2094c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f2095d;
    public final /* synthetic */ String[] e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Callable f2096f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(w wVar, String[] strArr, Callable callable, a1.d dVar) {
        super(dVar);
        this.f2095d = wVar;
        this.e = strArr;
        this.f2096f = callable;
    }

    @Override // c1.AbstractC0104a
    public final a1.d create(Object obj, a1.d dVar) {
        e eVar = new e(this.f2095d, this.e, this.f2096f, dVar);
        eVar.f2094c = obj;
        return eVar;
    }

    @Override // i1.p
    public final Object d(Object obj, Object obj2) {
        return ((e) create((u1.c) obj, (a1.d) obj2)).invokeSuspend(W0.i.f1345a);
    }

    @Override // c1.AbstractC0104a
    public final Object invokeSuspend(Object obj) {
        EnumC0098a enumC0098a = EnumC0098a.f2223a;
        int i = this.f2093b;
        if (i == 0) {
            H1.d.i0(obj);
            u1.c cVar = (u1.c) this.f2094c;
            Callable callable = this.f2096f;
            C0087d c0087d = new C0087d(this.f2095d, cVar, this.e, callable, null);
            this.f2093b = 1;
            w1.s sVar = new w1.s(this, getContext());
            if (AbstractC0058a.b0(sVar, sVar, c0087d) == enumC0098a) {
                return enumC0098a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            H1.d.i0(obj);
        }
        return W0.i.f1345a;
    }
}
