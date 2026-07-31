package q6;

import f6.p;
import y5.g;

/* loaded from: classes.dex */
public final class a implements g.b {

    /* renamed from: h, reason: collision with root package name */
    public static final C0126a f20371h = new C0126a(null);

    /* renamed from: f, reason: collision with root package name */
    public final Throwable f20372f;

    /* renamed from: g, reason: collision with root package name */
    private final g.c<?> f20373g = f20371h;

    /* renamed from: q6.a$a, reason: collision with other inner class name */
    public static final class C0126a implements g.c<a> {
        private C0126a() {
        }

        public /* synthetic */ C0126a(kotlin.jvm.internal.e eVar) {
            this();
        }
    }

    public a(Throwable th) {
        this.f20372f = th;
    }

    @Override // y5.g
    public <R> R fold(R r7, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r7, pVar);
    }

    @Override // y5.g.b, y5.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // y5.g.b
    public g.c<?> getKey() {
        return this.f20373g;
    }

    @Override // y5.g
    public g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // y5.g
    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
