package d1;

import b1.j;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s1.C0321d;
import s1.InterfaceC0342z;
import s1.W;

/* renamed from: d1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0095c extends AbstractC0093a {

    /* renamed from: b, reason: collision with root package name */
    public final j f2474b;

    /* renamed from: c, reason: collision with root package name */
    public transient b1.d f2475c;

    public AbstractC0095c(b1.d dVar, j jVar) {
        super(dVar);
        this.f2474b = jVar;
    }

    @Override // b1.d
    public final j h() {
        j jVar = this.f2474b;
        k1.e.b(jVar);
        return jVar;
    }

    @Override // d1.AbstractC0093a
    public final void j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        b1.d dVar = this.f2475c;
        if (dVar != null && dVar != this) {
            j jVar = this.f2474b;
            k1.e.b(jVar);
            b1.h p2 = jVar.p(b1.e.f2046a);
            k1.e.b(p2);
            w1.f fVar = (w1.f) dVar;
            do {
                atomicReferenceFieldUpdater = w1.f.h;
            } while (atomicReferenceFieldUpdater.get(fVar) == w1.a.f4490c);
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            C0321d c0321d = obj instanceof C0321d ? (C0321d) obj : null;
            if (c0321d != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0321d.h;
                InterfaceC0342z interfaceC0342z = (InterfaceC0342z) atomicReferenceFieldUpdater2.get(c0321d);
                if (interfaceC0342z != null) {
                    interfaceC0342z.e();
                    atomicReferenceFieldUpdater2.set(c0321d, W.f4032a);
                }
            }
        }
        this.f2475c = C0094b.f2473a;
    }

    public AbstractC0095c(b1.d dVar) {
        this(dVar, dVar != null ? dVar.h() : null);
    }
}
