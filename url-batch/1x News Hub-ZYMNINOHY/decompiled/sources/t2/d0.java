package t2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n0.C1148j;

/* loaded from: classes.dex */
public final class d0 extends y2.b {

    /* renamed from: b, reason: collision with root package name */
    public final Z f10409b;

    /* renamed from: c, reason: collision with root package name */
    public f0 f10410c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f10411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N f10412e;

    public d0(Z z, e0 e0Var, N n3) {
        this.f10411d = e0Var;
        this.f10412e = n3;
        this.f10409b = z;
    }

    @Override // y2.b
    public final void b(Object obj, Object obj2) {
        y2.k kVar = (y2.k) obj;
        boolean z = obj2 == null;
        y2.k kVar2 = this.f10409b;
        y2.k kVar3 = z ? kVar2 : this.f10410c;
        if (kVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y2.k.f10851a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, kVar3)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z) {
                y2.k kVar4 = this.f10410c;
                kotlin.jvm.internal.j.b(kVar4);
                kVar2.f(kVar4);
            }
        }
    }

    @Override // y2.b
    public final C1148j c(Object obj) {
        if (this.f10411d.D() == this.f10412e) {
            return null;
        }
        return y2.a.f10835e;
    }
}
