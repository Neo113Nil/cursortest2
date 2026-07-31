package o2;

import a2.AbstractC1241b;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o2.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3325e {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f42050b = AtomicIntegerFieldUpdater.newUpdater(C3325e.class, "notCompletedCount$volatile");

    /* renamed from: a, reason: collision with root package name */
    private final Q[] f42051a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* renamed from: o2.e$a */
    private final class a extends C0 {

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f42052i = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* renamed from: f, reason: collision with root package name */
        private final InterfaceC3343n f42053f;

        /* renamed from: g, reason: collision with root package name */
        public InterfaceC3320b0 f42054g;

        public a(InterfaceC3343n interfaceC3343n) {
            this.f42053f = interfaceC3343n;
        }

        public final void A(InterfaceC3320b0 interfaceC3320b0) {
            this.f42054g = interfaceC3320b0;
        }

        @Override // o2.InterfaceC3353s0
        public void a(Throwable th) {
            if (th != null) {
                Object g4 = this.f42053f.g(th);
                if (g4 != null) {
                    this.f42053f.u(g4);
                    b w4 = w();
                    if (w4 != null) {
                        w4.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C3325e.d().decrementAndGet(C3325e.this) == 0) {
                InterfaceC3343n interfaceC3343n = this.f42053f;
                Q[] qArr = C3325e.this.f42051a;
                ArrayList arrayList = new ArrayList(qArr.length);
                for (Q q4 : qArr) {
                    arrayList.add(q4.getCompleted());
                }
                interfaceC3343n.resumeWith(Result.m243constructorimpl(arrayList));
            }
        }

        public final b w() {
            return (b) f42052i.get(this);
        }

        public final InterfaceC3320b0 x() {
            InterfaceC3320b0 interfaceC3320b0 = this.f42054g;
            if (interfaceC3320b0 != null) {
                return interfaceC3320b0;
            }
            Intrinsics.throwUninitializedPropertyAccessException("handle");
            return null;
        }

        public final void z(b bVar) {
            f42052i.set(this, bVar);
        }
    }

    /* renamed from: o2.e$b */
    private final class b implements InterfaceC3341m {

        /* renamed from: b, reason: collision with root package name */
        private final a[] f42056b;

        public b(a[] aVarArr) {
            this.f42056b = aVarArr;
        }

        @Override // o2.InterfaceC3341m
        public void a(Throwable th) {
            b();
        }

        public final void b() {
            for (a aVar : this.f42056b) {
                aVar.x().dispose();
            }
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f42056b + ']';
        }
    }

    public C3325e(Q[] qArr) {
        this.f42051a = qArr;
        this.notCompletedCount$volatile = qArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater d() {
        return f42050b;
    }

    public final Object c(kotlin.coroutines.d dVar) {
        C3345o c3345o = new C3345o(AbstractC1241b.c(dVar), 1);
        c3345o.E();
        int length = this.f42051a.length;
        a[] aVarArr = new a[length];
        for (int i4 = 0; i4 < length; i4++) {
            Q q4 = this.f42051a[i4];
            q4.start();
            a aVar = new a(c3345o);
            aVar.A(B0.l(q4, false, false, aVar, 3, null));
            Unit unit = Unit.f41027a;
            aVarArr[i4] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i5 = 0; i5 < length; i5++) {
            aVarArr[i5].z(bVar);
        }
        if (c3345o.isCompleted()) {
            bVar.b();
        } else {
            AbstractC3349q.c(c3345o, bVar);
        }
        Object y4 = c3345o.y();
        if (y4 == AbstractC1241b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4;
    }
}
