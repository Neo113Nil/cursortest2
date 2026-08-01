package androidx.room;

import b1.EnumC0098a;
import java.util.concurrent.Callable;
import r1.AbstractC0366p;
import r1.AbstractC0369t;

/* renamed from: androidx.room.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0087d extends c1.g implements i1.p {

    /* renamed from: b, reason: collision with root package name */
    public int f2088b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2089c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f2090d;
    public final /* synthetic */ u1.c e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String[] f2091f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Callable f2092g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0087d(w wVar, u1.c cVar, String[] strArr, Callable callable, a1.d dVar) {
        super(dVar);
        this.f2090d = wVar;
        this.e = cVar;
        this.f2091f = strArr;
        this.f2092g = callable;
    }

    @Override // c1.AbstractC0104a
    public final a1.d create(Object obj, a1.d dVar) {
        C0087d c0087d = new C0087d(this.f2090d, this.e, this.f2091f, this.f2092g, dVar);
        c0087d.f2089c = obj;
        return c0087d;
    }

    @Override // i1.p
    public final Object d(Object obj, Object obj2) {
        return ((C0087d) create((r1.r) obj, (a1.d) obj2)).invokeSuspend(W0.i.f1345a);
    }

    @Override // c1.AbstractC0104a
    public final Object invokeSuspend(Object obj) {
        EnumC0098a enumC0098a = EnumC0098a.f2223a;
        int i = this.f2088b;
        W0.i iVar = W0.i.f1345a;
        if (i == 0) {
            H1.d.i0(obj);
            r1.r rVar = (r1.r) this.f2089c;
            t1.b a2 = t1.i.a(-1, 6);
            B1.c cVar = new B1.c(this.f2091f, a2);
            a2.b(iVar);
            if (rVar.b().d(C.f2073a) != null) {
                throw new ClassCastException();
            }
            AbstractC0366p b2 = i.b(this.f2090d);
            t1.b a3 = t1.i.a(0, 7);
            AbstractC0369t.h(rVar, b2, new C0086c(this.f2090d, cVar, a2, this.f2092g, a3, null), 2);
            this.f2088b = 1;
            Object a4 = u1.g.a(this.e, a3, true, this);
            if (a4 != enumC0098a) {
                a4 = iVar;
            }
            if (a4 == enumC0098a) {
                return enumC0098a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            H1.d.i0(obj);
        }
        return iVar;
    }
}
