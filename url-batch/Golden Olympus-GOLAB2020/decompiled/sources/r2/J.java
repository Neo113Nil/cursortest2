package r2;

import a2.AbstractC1241b;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o2.C3345o;
import s2.AbstractC3412c;
import s2.AbstractC3413d;
import t2.AbstractC3435f;

/* loaded from: classes3.dex */
final class J extends AbstractC3413d {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f43531a = new AtomicReference(null);

    @Override // s2.AbstractC3413d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(H h4) {
        t2.G g4;
        if (AbstractC3435f.a(this.f43531a) != null) {
            return false;
        }
        AtomicReference atomicReference = this.f43531a;
        g4 = I.f43529a;
        AbstractC3435f.b(atomicReference, g4);
        return true;
    }

    public final Object e(kotlin.coroutines.d dVar) {
        t2.G g4;
        C3345o c3345o = new C3345o(AbstractC1241b.c(dVar), 1);
        c3345o.E();
        AtomicReference atomicReference = this.f43531a;
        g4 = I.f43529a;
        if (!androidx.lifecycle.r.a(atomicReference, g4, c3345o)) {
            Result.Companion companion = Result.Companion;
            c3345o.resumeWith(Result.m243constructorimpl(Unit.f41027a));
        }
        Object y4 = c3345o.y();
        if (y4 == AbstractC1241b.f()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y4 == AbstractC1241b.f() ? y4 : Unit.f41027a;
    }

    @Override // s2.AbstractC3413d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public kotlin.coroutines.d[] b(H h4) {
        AbstractC3435f.b(this.f43531a, null);
        return AbstractC3412c.f45960a;
    }

    public final void g() {
        t2.G g4;
        t2.G g5;
        t2.G g6;
        t2.G g7;
        AtomicReference atomicReference = this.f43531a;
        while (true) {
            Object a4 = AbstractC3435f.a(atomicReference);
            if (a4 == null) {
                return;
            }
            g4 = I.f43530b;
            if (a4 == g4) {
                return;
            }
            g5 = I.f43529a;
            if (a4 == g5) {
                AtomicReference atomicReference2 = this.f43531a;
                g6 = I.f43530b;
                if (androidx.lifecycle.r.a(atomicReference2, a4, g6)) {
                    return;
                }
            } else {
                AtomicReference atomicReference3 = this.f43531a;
                g7 = I.f43529a;
                if (androidx.lifecycle.r.a(atomicReference3, a4, g7)) {
                    Result.Companion companion = Result.Companion;
                    ((C3345o) a4).resumeWith(Result.m243constructorimpl(Unit.f41027a));
                    return;
                }
            }
        }
    }

    public final boolean h() {
        t2.G g4;
        t2.G g5;
        AtomicReference atomicReference = this.f43531a;
        g4 = I.f43529a;
        Object andSet = atomicReference.getAndSet(g4);
        Intrinsics.checkNotNull(andSet);
        g5 = I.f43530b;
        return andSet == g5;
    }
}
