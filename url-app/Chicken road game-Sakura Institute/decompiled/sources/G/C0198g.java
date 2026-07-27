package G;

import A.C0028y;
import W2.C0286h;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1341p;
import y2.AbstractC1343r;

/* renamed from: G.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198g implements X {

    /* renamed from: d, reason: collision with root package name */
    public final A3.e f2805d;

    /* renamed from: i, reason: collision with root package name */
    public Throwable f2807i;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2806e = new Object();

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f2808j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f2809k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final C0194e f2810l = new C0194e(0);

    public C0198g(A3.e eVar) {
        this.f2805d = eVar;
    }

    public final void c(long j4) {
        Object a4;
        synchronized (this.f2806e) {
            try {
                ArrayList arrayList = this.f2808j;
                this.f2808j = this.f2809k;
                this.f2809k = arrayList;
                this.f2810l.set(0);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C0196f c0196f = (C0196f) arrayList.get(i2);
                    c0196f.getClass();
                    try {
                        AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                        a4 = c0196f.f2802a.invoke(Long.valueOf(j4));
                    } catch (Throwable th) {
                        AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                        a4 = AbstractC1343r.a(th);
                    }
                    c0196f.f2803b.u(a4);
                }
                arrayList.clear();
                Unit unit = Unit.f7487a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // G.X
    public final Object f(Function1 function1, C2.a frame) {
        C0286h c0286h = new C0286h(1, D2.f.b(frame));
        c0286h.s();
        C0196f c0196f = new C0196f(c0286h, function1);
        synchronized (this.f2806e) {
            Throwable th = this.f2807i;
            if (th != null) {
                AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                c0286h.u(AbstractC1343r.a(th));
            } else {
                boolean isEmpty = this.f2808j.isEmpty();
                this.f2808j.add(c0196f);
                if (isEmpty) {
                    this.f2810l.set(1);
                }
                c0286h.v(new C0028y(this, 8, c0196f));
                if (isEmpty) {
                    try {
                        this.f2805d.invoke();
                    } catch (Throwable th2) {
                        synchronized (this.f2806e) {
                            try {
                                if (this.f2807i == null) {
                                    this.f2807i = th2;
                                    ArrayList arrayList = this.f2808j;
                                    int size = arrayList.size();
                                    for (int i2 = 0; i2 < size; i2++) {
                                        C0286h c0286h2 = ((C0196f) arrayList.get(i2)).f2803b;
                                        AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
                                        c0286h2.u(AbstractC1343r.a(th2));
                                    }
                                    this.f2808j.clear();
                                    this.f2810l.set(0);
                                    Unit unit = Unit.f7487a;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        Object r2 = c0286h.r();
        if (r2 == D2.a.f2163d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return r2;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object i(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.h(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element k(kotlin.coroutines.g gVar) {
        return kotlin.coroutines.f.a(this, gVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext s(CoroutineContext coroutineContext) {
        return kotlin.coroutines.f.c(coroutineContext, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext w(kotlin.coroutines.g gVar) {
        return kotlin.coroutines.f.b(this, gVar);
    }
}
