package x3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class c0 extends C3.b {

    /* renamed from: b, reason: collision with root package name */
    public final Y f16024b;

    /* renamed from: c, reason: collision with root package name */
    public e0 f16025c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f16026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16027e;

    public c0(Y y4, d0 d0Var, Object obj) {
        this.f16026d = d0Var;
        this.f16027e = obj;
        this.f16024b = y4;
    }

    @Override // C3.b
    public final void b(Object obj, Object obj2) {
        C3.k kVar = (C3.k) obj;
        boolean z = obj2 == null;
        C3.k kVar2 = this.f16024b;
        C3.k kVar3 = z ? kVar2 : this.f16025c;
        if (kVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3.k.f302a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, kVar3)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z) {
                C3.k kVar4 = this.f16025c;
                kotlin.jvm.internal.i.b(kVar4);
                kVar2.f(kVar4);
            }
        }
    }

    @Override // C3.b
    public final C3.v c(Object obj) {
        if (this.f16026d.A() == this.f16027e) {
            return null;
        }
        return C3.a.f283e;
    }
}
