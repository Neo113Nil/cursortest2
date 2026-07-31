package v2;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.G;

/* renamed from: v2.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3479n {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f46484b = AtomicReferenceFieldUpdater.newUpdater(C3479n.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f46485c = AtomicIntegerFieldUpdater.newUpdater(C3479n.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f46486d = AtomicIntegerFieldUpdater.newUpdater(C3479n.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f46487e = AtomicIntegerFieldUpdater.newUpdater(C3479n.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray f46488a = new AtomicReferenceArray(UserVerificationMethods.USER_VERIFY_PATTERN);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    private final AbstractRunnableC3473h b(AbstractRunnableC3473h abstractRunnableC3473h) {
        if (e() == 127) {
            return abstractRunnableC3473h;
        }
        if (abstractRunnableC3473h.f46472c.b() == 1) {
            f46487e.incrementAndGet(this);
        }
        int i4 = f46485c.get(this) & 127;
        while (this.f46488a.get(i4) != null) {
            Thread.yield();
        }
        this.f46488a.lazySet(i4, abstractRunnableC3473h);
        f46485c.incrementAndGet(this);
        return null;
    }

    private final void c(AbstractRunnableC3473h abstractRunnableC3473h) {
        if (abstractRunnableC3473h == null || abstractRunnableC3473h.f46472c.b() != 1) {
            return;
        }
        f46487e.decrementAndGet(this);
    }

    private final int e() {
        return f46485c.get(this) - f46486d.get(this);
    }

    private final AbstractRunnableC3473h m() {
        AbstractRunnableC3473h abstractRunnableC3473h;
        while (true) {
            int i4 = f46486d.get(this);
            if (i4 - f46485c.get(this) == 0) {
                return null;
            }
            int i5 = i4 & 127;
            if (f46486d.compareAndSet(this, i4, i4 + 1) && (abstractRunnableC3473h = (AbstractRunnableC3473h) this.f46488a.getAndSet(i5, null)) != null) {
                c(abstractRunnableC3473h);
                return abstractRunnableC3473h;
            }
        }
    }

    private final boolean n(C3469d c3469d) {
        AbstractRunnableC3473h m4 = m();
        if (m4 == null) {
            return false;
        }
        c3469d.a(m4);
        return true;
    }

    private final AbstractRunnableC3473h o(boolean z4) {
        AbstractRunnableC3473h abstractRunnableC3473h;
        do {
            abstractRunnableC3473h = (AbstractRunnableC3473h) f46484b.get(this);
            if (abstractRunnableC3473h != null) {
                if ((abstractRunnableC3473h.f46472c.b() == 1) == z4) {
                }
            }
            int i4 = f46486d.get(this);
            int i5 = f46485c.get(this);
            while (i4 != i5) {
                if (z4 && f46487e.get(this) == 0) {
                    return null;
                }
                i5--;
                AbstractRunnableC3473h q4 = q(i5, z4);
                if (q4 != null) {
                    return q4;
                }
            }
            return null;
        } while (!androidx.concurrent.futures.b.a(f46484b, this, abstractRunnableC3473h, null));
        return abstractRunnableC3473h;
    }

    private final AbstractRunnableC3473h p(int i4) {
        int i5 = f46486d.get(this);
        int i6 = f46485c.get(this);
        boolean z4 = i4 == 1;
        while (i5 != i6) {
            if (z4 && f46487e.get(this) == 0) {
                return null;
            }
            int i7 = i5 + 1;
            AbstractRunnableC3473h q4 = q(i5, z4);
            if (q4 != null) {
                return q4;
            }
            i5 = i7;
        }
        return null;
    }

    private final AbstractRunnableC3473h q(int i4, boolean z4) {
        int i5 = i4 & 127;
        AbstractRunnableC3473h abstractRunnableC3473h = (AbstractRunnableC3473h) this.f46488a.get(i5);
        if (abstractRunnableC3473h != null) {
            if ((abstractRunnableC3473h.f46472c.b() == 1) == z4 && q2.i.a(this.f46488a, i5, abstractRunnableC3473h, null)) {
                if (z4) {
                    f46487e.decrementAndGet(this);
                }
                return abstractRunnableC3473h;
            }
        }
        return null;
    }

    private final long s(int i4, G g4) {
        AbstractRunnableC3473h abstractRunnableC3473h;
        do {
            abstractRunnableC3473h = (AbstractRunnableC3473h) f46484b.get(this);
            if (abstractRunnableC3473h == null) {
                return -2L;
            }
            if (((abstractRunnableC3473h.f46472c.b() != 1 ? 2 : 1) & i4) == 0) {
                return -2L;
            }
            long a4 = AbstractC3477l.f46480f.a() - abstractRunnableC3473h.f46471b;
            long j4 = AbstractC3477l.f46476b;
            if (a4 < j4) {
                return j4 - a4;
            }
        } while (!androidx.concurrent.futures.b.a(f46484b, this, abstractRunnableC3473h, null));
        g4.f41132b = abstractRunnableC3473h;
        return -1L;
    }

    public final AbstractRunnableC3473h a(AbstractRunnableC3473h abstractRunnableC3473h, boolean z4) {
        if (z4) {
            return b(abstractRunnableC3473h);
        }
        AbstractRunnableC3473h abstractRunnableC3473h2 = (AbstractRunnableC3473h) f46484b.getAndSet(this, abstractRunnableC3473h);
        if (abstractRunnableC3473h2 == null) {
            return null;
        }
        return b(abstractRunnableC3473h2);
    }

    public final int i() {
        return f46484b.get(this) != null ? e() + 1 : e();
    }

    public final void j(C3469d c3469d) {
        AbstractRunnableC3473h abstractRunnableC3473h = (AbstractRunnableC3473h) f46484b.getAndSet(this, null);
        if (abstractRunnableC3473h != null) {
            c3469d.a(abstractRunnableC3473h);
        }
        while (n(c3469d)) {
        }
    }

    public final AbstractRunnableC3473h k() {
        AbstractRunnableC3473h abstractRunnableC3473h = (AbstractRunnableC3473h) f46484b.getAndSet(this, null);
        return abstractRunnableC3473h == null ? m() : abstractRunnableC3473h;
    }

    public final AbstractRunnableC3473h l() {
        return o(true);
    }

    public final long r(int i4, G g4) {
        AbstractRunnableC3473h m4 = i4 == 3 ? m() : p(i4);
        if (m4 == null) {
            return s(i4, g4);
        }
        g4.f41132b = m4;
        return -1L;
    }
}
