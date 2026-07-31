package t2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class r {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f46247b = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_next$volatile");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f46248c = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_prev$volatile");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f46249d = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public static abstract class a extends AbstractC3431b {

        /* renamed from: b, reason: collision with root package name */
        public final r f46250b;

        /* renamed from: c, reason: collision with root package name */
        public r f46251c;

        public a(r rVar) {
            this.f46250b = rVar;
        }

        @Override // t2.AbstractC3431b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(r rVar, Object obj) {
            boolean z4 = obj == null;
            r rVar2 = z4 ? this.f46250b : this.f46251c;
            if (rVar2 != null && androidx.concurrent.futures.b.a(r.m(), rVar, this, rVar2) && z4) {
                r rVar3 = this.f46250b;
                r rVar4 = this.f46251c;
                Intrinsics.checkNotNull(rVar4);
                rVar3.i(rVar4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (androidx.concurrent.futures.b.a(t2.r.f46247b, r3, r2, ((t2.C3426A) r4).f46200a) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final r g(z zVar) {
        r rVar;
        loop0: while (true) {
            r rVar2 = (r) f46248c.get(this);
            rVar = rVar2;
            while (true) {
                r rVar3 = null;
                while (true) {
                    Object obj = f46247b.get(rVar);
                    if (obj == this) {
                        if (rVar2 == rVar || androidx.concurrent.futures.b.a(f46248c, this, rVar2, rVar)) {
                            break;
                        }
                    } else {
                        if (p()) {
                            return null;
                        }
                        if (obj == zVar) {
                            break loop0;
                        }
                        if (obj instanceof z) {
                            ((z) obj).a(rVar);
                            break;
                        }
                        if (!(obj instanceof C3426A)) {
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                            rVar3 = rVar;
                            rVar = (r) obj;
                        } else {
                            if (rVar3 != null) {
                                break;
                            }
                            rVar = (r) f46248c.get(rVar);
                        }
                    }
                }
                rVar = rVar3;
            }
        }
        return rVar;
    }

    private final r h(r rVar) {
        while (rVar.p()) {
            rVar = (r) f46248c.get(rVar);
        }
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(r rVar) {
        r rVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46248c;
        do {
            rVar2 = (r) atomicReferenceFieldUpdater.get(rVar);
            if (j() != rVar) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f46248c, rVar, rVar2, this));
        if (p()) {
            rVar.g(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m() {
        return f46247b;
    }

    private final C3426A s() {
        C3426A c3426a = (C3426A) f46249d.get(this);
        if (c3426a != null) {
            return c3426a;
        }
        C3426A c3426a2 = new C3426A(this);
        f46249d.set(this, c3426a2);
        return c3426a2;
    }

    public final boolean f(r rVar) {
        f46248c.set(rVar, this);
        f46247b.set(rVar, this);
        while (j() == this) {
            if (androidx.concurrent.futures.b.a(f46247b, this, this, rVar)) {
                rVar.i(this);
                return true;
            }
        }
        return false;
    }

    public final Object j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f46247b;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof z)) {
                return obj;
            }
            ((z) obj).a(this);
        }
    }

    public final r k() {
        r rVar;
        Object j4 = j();
        C3426A c3426a = j4 instanceof C3426A ? (C3426A) j4 : null;
        if (c3426a != null && (rVar = c3426a.f46200a) != null) {
            return rVar;
        }
        Intrinsics.checkNotNull(j4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (r) j4;
    }

    public final r l() {
        r g4 = g(null);
        return g4 == null ? h((r) f46248c.get(this)) : g4;
    }

    public boolean p() {
        return j() instanceof C3426A;
    }

    public boolean q() {
        return r() == null;
    }

    public final r r() {
        Object j4;
        r rVar;
        do {
            j4 = j();
            if (j4 instanceof C3426A) {
                return ((C3426A) j4).f46200a;
            }
            if (j4 == this) {
                return (r) j4;
            }
            Intrinsics.checkNotNull(j4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            rVar = (r) j4;
        } while (!androidx.concurrent.futures.b.a(f46247b, this, j4, rVar.s()));
        rVar.g(null);
        return null;
    }

    public final int t(r rVar, r rVar2, a aVar) {
        f46248c.set(rVar, this);
        f46247b.set(rVar, rVar2);
        aVar.f46251c = rVar2;
        if (androidx.concurrent.futures.b.a(f46247b, this, rVar2, aVar)) {
            return aVar.a(this) == null ? 1 : 2;
        }
        return 0;
    }

    public String toString() {
        return new kotlin.jvm.internal.z(this) { // from class: t2.r.b
            @Override // m2.i
            public Object get() {
                return o2.N.a(this.receiver);
            }
        } + '@' + o2.N.b(this);
    }
}
