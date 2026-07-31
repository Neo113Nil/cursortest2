package H5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class f0 extends M5.b {

    /* renamed from: b, reason: collision with root package name */
    public final b0 f1071b;

    /* renamed from: c, reason: collision with root package name */
    public i0 f1072c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0 f1073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1074e;

    public f0(b0 b0Var, g0 g0Var, Object obj) {
        this.f1073d = g0Var;
        this.f1074e = obj;
        this.f1071b = b0Var;
    }

    @Override // M5.b
    public final void b(Object obj, Object obj2) {
        M5.k kVar = (M5.k) obj;
        boolean z5 = obj2 == null;
        b0 b0Var = this.f1071b;
        U u6 = z5 ? b0Var : this.f1072c;
        if (u6 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = M5.k.f1606f;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, u6)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z5) {
                i0 i0Var = this.f1072c;
                kotlin.jvm.internal.i.b(i0Var);
                b0Var.f(i0Var);
            }
        }
    }

    @Override // M5.b
    public final M5.v c(Object obj) {
        if (this.f1073d.C() == this.f1074e) {
            return null;
        }
        return M5.a.f1586e;
    }
}
