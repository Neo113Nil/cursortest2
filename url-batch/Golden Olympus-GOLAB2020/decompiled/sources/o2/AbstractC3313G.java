package o2;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import t2.AbstractC3444o;
import t2.C3440k;
import t2.C3443n;

/* renamed from: o2.G, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3313G extends kotlin.coroutines.a implements kotlin.coroutines.e {

    /* renamed from: c, reason: collision with root package name */
    public static final a f42003c = new a(null);

    /* renamed from: o2.G$a */
    public static final class a extends kotlin.coroutines.b {

        /* renamed from: o2.G$a$a, reason: collision with other inner class name */
        static final class C0241a extends kotlin.jvm.internal.s implements Function1 {

            /* renamed from: i, reason: collision with root package name */
            public static final C0241a f42004i = new C0241a();

            C0241a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC3313G invoke(CoroutineContext.Element element) {
                if (element instanceof AbstractC3313G) {
                    return (AbstractC3313G) element;
                }
                return null;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(kotlin.coroutines.e.f41111K2, C0241a.f42004i);
        }
    }

    public AbstractC3313G() {
        super(kotlin.coroutines.e.f41111K2);
    }

    @Override // kotlin.coroutines.e
    public final void a(kotlin.coroutines.d dVar) {
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C3440k) dVar).t();
    }

    @Override // kotlin.coroutines.e
    public final kotlin.coroutines.d b(kotlin.coroutines.d dVar) {
        return new C3440k(this, dVar);
    }

    public abstract void g(CoroutineContext coroutineContext, Runnable runnable);

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.b bVar) {
        return e.a.a(this, bVar);
    }

    public void h(CoroutineContext coroutineContext, Runnable runnable) {
        g(coroutineContext, runnable);
    }

    public boolean i(CoroutineContext coroutineContext) {
        return true;
    }

    public AbstractC3313G j(int i4) {
        AbstractC3444o.a(i4);
        return new C3443n(this, i4);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return e.a.b(this, bVar);
    }

    public String toString() {
        return N.a(this) + '@' + N.b(this);
    }
}
