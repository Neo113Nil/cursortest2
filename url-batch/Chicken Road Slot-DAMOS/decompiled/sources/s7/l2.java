package s7;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l2 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f8810e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q2 f8811i;

    public l2(q2 q2Var, AtomicReference atomicReference, int i3) {
        this.f8809d = i3;
        switch (i3) {
            case 1:
                this.f8810e = atomicReference;
                Objects.requireNonNull(q2Var);
                this.f8811i = q2Var;
                break;
            case 2:
                this.f8810e = atomicReference;
                Objects.requireNonNull(q2Var);
                this.f8811i = q2Var;
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                this.f8810e = atomicReference;
                Objects.requireNonNull(q2Var);
                this.f8811i = q2Var;
                break;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                this.f8810e = atomicReference;
                Objects.requireNonNull(q2Var);
                this.f8811i = q2Var;
                break;
            default:
                this.f8810e = atomicReference;
                Objects.requireNonNull(q2Var);
                this.f8811i = q2Var;
                break;
        }
    }

    private final void a() {
        AtomicReference atomicReference = this.f8810e;
        synchronized (atomicReference) {
            try {
                try {
                    q1 q1Var = (q1) this.f8811i.f1478d;
                    atomicReference.set(Double.valueOf(q1Var.f8935r.C(q1Var.q().y(), e0.f8618e0)));
                } finally {
                    this.f8810e.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8809d) {
            case 0:
                AtomicReference atomicReference = this.f8810e;
                synchronized (atomicReference) {
                    try {
                        try {
                            q1 q1Var = (q1) this.f8811i.f1478d;
                            atomicReference.set(Boolean.valueOf(q1Var.f8935r.D(q1Var.q().y(), e0.f8606a0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.f8810e;
                synchronized (atomicReference2) {
                    try {
                        try {
                            q1 q1Var2 = (q1) this.f8811i.f1478d;
                            atomicReference2.set(q1Var2.f8935r.z(q1Var2.q().y(), e0.f8609b0));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 2:
                AtomicReference atomicReference3 = this.f8810e;
                synchronized (atomicReference3) {
                    try {
                        try {
                            q1 q1Var3 = (q1) this.f8811i.f1478d;
                            atomicReference3.set(Long.valueOf(q1Var3.f8935r.A(q1Var3.q().y(), e0.f8612c0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                AtomicReference atomicReference4 = this.f8810e;
                synchronized (atomicReference4) {
                    try {
                        try {
                            q1 q1Var4 = (q1) this.f8811i.f1478d;
                            atomicReference4.set(Integer.valueOf(q1Var4.f8935r.B(q1Var4.q().y(), e0.f8615d0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                a();
                return;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                q2 q2Var = this.f8811i;
                f1 f1Var = ((q1) q2Var.f1478d).f8936s;
                q1.j(f1Var);
                Bundle d10 = f1Var.B.d();
                l3 o6 = ((q1) q2Var.f1478d).o();
                AtomicReference atomicReference5 = this.f8810e;
                o6.s();
                o6.t();
                o6.G(new d6.t(o6, atomicReference5, o6.I(false), d10, 9, false));
                return;
            default:
                l3 o10 = ((q1) this.f8811i.f1478d).o();
                b4 b10 = b4.b(x2.SGTM_CLIENT);
                AtomicReference atomicReference6 = this.f8810e;
                o10.s();
                o10.t();
                o10.G(new d6.t(o10, atomicReference6, o10.I(false), b10, 10, false));
                return;
        }
    }

    public /* synthetic */ l2(q2 q2Var, AtomicReference atomicReference, int i3, boolean z10) {
        this.f8809d = i3;
        this.f8811i = q2Var;
        this.f8810e = atomicReference;
    }
}
