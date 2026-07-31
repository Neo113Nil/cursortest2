package kotlinx.coroutines.internal;

import m6.h0;

/* loaded from: classes.dex */
public final class t {

    static final class a extends kotlin.jvm.internal.j implements f6.l<Throwable, v5.q> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f6.l<E, v5.q> f18376f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ E f18377g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ y5.g f18378h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(f6.l<? super E, v5.q> lVar, E e7, y5.g gVar) {
            super(1);
            this.f18376f = lVar;
            this.f18377g = e7;
            this.f18378h = gVar;
        }

        public final void a(Throwable th) {
            t.b(this.f18376f, this.f18377g, this.f18378h);
        }

        @Override // f6.l
        public /* bridge */ /* synthetic */ v5.q invoke(Throwable th) {
            a(th);
            return v5.q.f22838a;
        }
    }

    public static final <E> f6.l<Throwable, v5.q> a(f6.l<? super E, v5.q> lVar, E e7, y5.g gVar) {
        return new a(lVar, e7, gVar);
    }

    public static final <E> void b(f6.l<? super E, v5.q> lVar, E e7, y5.g gVar) {
        g0 c7 = c(lVar, e7, null);
        if (c7 == null) {
            return;
        }
        h0.a(gVar, c7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> g0 c(f6.l<? super E, v5.q> lVar, E e7, g0 g0Var) {
        try {
            lVar.invoke(e7);
        } catch (Throwable th) {
            if (g0Var == null || g0Var.getCause() == th) {
                return new g0(kotlin.jvm.internal.i.i("Exception in undelivered element handler for ", e7), th);
            }
            v5.b.a(g0Var, th);
        }
        return g0Var;
    }

    public static /* synthetic */ g0 d(f6.l lVar, Object obj, g0 g0Var, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            g0Var = null;
        }
        return c(lVar, obj, g0Var);
    }
}
