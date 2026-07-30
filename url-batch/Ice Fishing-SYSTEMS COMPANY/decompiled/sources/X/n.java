package X;

import v7.InterfaceC5133d;
import w7.EnumC5179a;

/* loaded from: classes.dex */
public final class n extends x7.h implements E7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f3573n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3574u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ D f3575v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(D d2, InterfaceC5133d interfaceC5133d) {
        super(2, interfaceC5133d);
        this.f3575v = d2;
    }

    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
        n nVar = new n(this.f3575v, interfaceC5133d);
        nVar.f3574u = obj;
        return nVar;
    }

    @Override // E7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((l) obj, (InterfaceC5133d) obj2)).invokeSuspend(q7.v.f40183a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r7 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (r7 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078 A[RETURN] */
    @Override // x7.AbstractC5217a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        int i = this.f3573n;
        q7.v vVar = q7.v.f40183a;
        if (i != 0) {
            if (i == 1) {
                com.bumptech.glide.f.r(obj);
                return vVar;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            return vVar;
        }
        com.bumptech.glide.f.r(obj);
        l lVar = (l) this.f3574u;
        boolean z8 = lVar instanceof j;
        D d2 = this.f3575v;
        if (!z8) {
            if (lVar instanceof k) {
                this.f3573n = 2;
                if (D.a(d2, (k) lVar, this) == enumC5179a) {
                }
            }
        }
        j jVar = (j) lVar;
        this.f3573n = 1;
        E e6 = (E) d2.f3541e.E();
        if (!(e6 instanceof C0401a)) {
            if (e6 instanceof h) {
                if (e6 == jVar.f3566a) {
                    obj2 = d2.e(this);
                }
            } else if (kotlin.jvm.internal.h.a(e6, F.f3544a)) {
                obj2 = d2.e(this);
            } else if (e6 instanceof g) {
                throw new IllegalStateException("Can't read in final state.");
            }
        }
        obj2 = vVar;
        return obj2 == enumC5179a ? enumC5179a : vVar;
    }
}
