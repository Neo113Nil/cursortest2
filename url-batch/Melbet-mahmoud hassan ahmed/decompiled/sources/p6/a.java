package p6;

import v5.l;
import v5.q;

/* loaded from: classes.dex */
public abstract class a<T> implements b<T> {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {212}, m = "collect")
    /* renamed from: p6.a$a, reason: collision with other inner class name */
    static final class C0124a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f, reason: collision with root package name */
        Object f20153f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f20154g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ a<T> f20155h;

        /* renamed from: i, reason: collision with root package name */
        int f20156i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0124a(a<T> aVar, y5.d<? super C0124a> dVar) {
            super(dVar);
            this.f20155h = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f20154g = obj;
            this.f20156i |= Integer.MIN_VALUE;
            return this.f20155h.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // p6.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c<? super T> cVar, y5.d<? super q> dVar) {
        C0124a c0124a;
        Object c7;
        int i7;
        Throwable th;
        q6.c cVar2;
        if (dVar instanceof C0124a) {
            c0124a = (C0124a) dVar;
            int i8 = c0124a.f20156i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0124a.f20156i = i8 - Integer.MIN_VALUE;
                Object obj = c0124a.f20154g;
                c7 = z5.d.c();
                i7 = c0124a.f20156i;
                if (i7 != 0) {
                    l.b(obj);
                    q6.c cVar3 = new q6.c(cVar, c0124a.getContext());
                    try {
                        c0124a.f20153f = cVar3;
                        c0124a.f20156i = 1;
                        if (b(cVar3, c0124a) == c7) {
                            return c7;
                        }
                        cVar2 = cVar3;
                    } catch (Throwable th2) {
                        th = th2;
                        cVar2 = cVar3;
                        cVar2.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar2 = (q6.c) c0124a.f20153f;
                    try {
                        l.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        cVar2.releaseIntercepted();
                        throw th;
                    }
                }
                cVar2.releaseIntercepted();
                return q.f22838a;
            }
        }
        c0124a = new C0124a(this, dVar);
        Object obj2 = c0124a.f20154g;
        c7 = z5.d.c();
        i7 = c0124a.f20156i;
        if (i7 != 0) {
        }
        cVar2.releaseIntercepted();
        return q.f22838a;
    }

    public abstract Object b(c<? super T> cVar, y5.d<? super q> dVar);
}
