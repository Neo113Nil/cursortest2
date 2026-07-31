package q6;

import f6.p;
import kotlin.jvm.internal.j;
import l6.f;
import m6.s1;
import v5.k;
import v5.q;
import y5.g;
import y5.h;

/* loaded from: classes.dex */
public final class c<T> extends kotlin.coroutines.jvm.internal.d implements p6.c<T> {

    /* renamed from: f, reason: collision with root package name */
    public final p6.c<T> f20376f;

    /* renamed from: g, reason: collision with root package name */
    public final g f20377g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20378h;

    /* renamed from: i, reason: collision with root package name */
    private g f20379i;

    /* renamed from: j, reason: collision with root package name */
    private y5.d<? super q> f20380j;

    static final class a extends j implements p<Integer, g.b, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f20381f = new a();

        a() {
            super(2);
        }

        public final Integer a(int i7, g.b bVar) {
            return Integer.valueOf(i7 + 1);
        }

        @Override // f6.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, g.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(p6.c<? super T> cVar, g gVar) {
        super(b.f20374f, h.f23481f);
        this.f20376f = cVar;
        this.f20377g = gVar;
        this.f20378h = ((Number) gVar.fold(0, a.f20381f)).intValue();
    }

    private final void b(g gVar, g gVar2, T t6) {
        if (gVar2 instanceof q6.a) {
            h((q6.a) gVar2, t6);
        }
        e.a(this, gVar);
        this.f20379i = gVar;
    }

    private final Object f(y5.d<? super q> dVar, T t6) {
        f6.q qVar;
        g context = dVar.getContext();
        s1.e(context);
        g gVar = this.f20379i;
        if (gVar != context) {
            b(context, gVar, t6);
        }
        this.f20380j = dVar;
        qVar = d.f20382a;
        return qVar.c(this.f20376f, t6, this);
    }

    private final void h(q6.a aVar, Object obj) {
        String e7;
        e7 = f.e("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + aVar.f20372f + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(e7.toString());
    }

    @Override // p6.c
    public Object emit(T t6, y5.d<? super q> dVar) {
        Object c7;
        Object c8;
        try {
            Object f7 = f(dVar, t6);
            c7 = z5.d.c();
            if (f7 == c7) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            c8 = z5.d.c();
            return f7 == c8 ? f7 : q.f22838a;
        } catch (Throwable th) {
            this.f20379i = new q6.a(th);
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        y5.d<? super q> dVar = this.f20380j;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, y5.d
    public g getContext() {
        y5.d<? super q> dVar = this.f20380j;
        g context = dVar == null ? null : dVar.getContext();
        return context == null ? h.f23481f : context;
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public Object invokeSuspend(Object obj) {
        Object c7;
        Throwable b7 = k.b(obj);
        if (b7 != null) {
            this.f20379i = new q6.a(b7);
        }
        y5.d<? super q> dVar = this.f20380j;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        c7 = z5.d.c();
        return c7;
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
