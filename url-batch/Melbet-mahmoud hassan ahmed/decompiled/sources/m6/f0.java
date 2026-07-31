package m6;

import y5.e;
import y5.g;

/* loaded from: classes.dex */
public abstract class f0 extends y5.a implements y5.e {

    /* renamed from: f, reason: collision with root package name */
    public static final a f19280f = new a(null);

    public static final class a extends y5.b<y5.e, f0> {

        /* renamed from: m6.f0$a$a, reason: collision with other inner class name */
        static final class C0110a extends kotlin.jvm.internal.j implements f6.l<g.b, f0> {

            /* renamed from: f, reason: collision with root package name */
            public static final C0110a f19281f = new C0110a();

            C0110a() {
                super(1);
            }

            @Override // f6.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f0 invoke(g.b bVar) {
                if (bVar instanceof f0) {
                    return (f0) bVar;
                }
                return null;
            }
        }

        private a() {
            super(y5.e.f23478e, C0110a.f19281f);
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }
    }

    public f0() {
        super(y5.e.f23478e);
    }

    @Override // y5.e
    public final <T> y5.d<T> C(y5.d<? super T> dVar) {
        return new kotlinx.coroutines.internal.f(this, dVar);
    }

    public abstract void P(y5.g gVar, Runnable runnable);

    public boolean Q(y5.g gVar) {
        return true;
    }

    @Override // y5.a, y5.g.b, y5.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) e.a.a(this, cVar);
    }

    @Override // y5.a, y5.g
    public y5.g minusKey(g.c<?> cVar) {
        return e.a.b(this, cVar);
    }

    public String toString() {
        return q0.a(this) + '@' + q0.b(this);
    }

    @Override // y5.e
    public final void y(y5.d<?> dVar) {
        ((kotlinx.coroutines.internal.f) dVar).r();
    }
}
