package f2;

import d2.C0301d;
import d2.InterfaceC0300c;
import d2.InterfaceC0303f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.j;
import t2.C1196f;

/* renamed from: f2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0326c extends AbstractC0324a {

    /* renamed from: b, reason: collision with root package name */
    public final d2.h f4981b;

    /* renamed from: c, reason: collision with root package name */
    public transient InterfaceC0300c f4982c;

    public AbstractC0326c(InterfaceC0300c interfaceC0300c, d2.h hVar) {
        super(interfaceC0300c);
        this.f4981b = hVar;
    }

    @Override // d2.InterfaceC0300c
    public d2.h getContext() {
        d2.h hVar = this.f4981b;
        j.b(hVar);
        return hVar;
    }

    @Override // f2.AbstractC0324a
    public void h() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0300c interfaceC0300c = this.f4982c;
        if (interfaceC0300c != null && interfaceC0300c != this) {
            InterfaceC0303f h3 = getContext().h(C0301d.f4950a);
            j.b(h3);
            y2.h hVar = (y2.h) interfaceC0300c;
            do {
                atomicReferenceFieldUpdater = y2.h.f10843h;
            } while (atomicReferenceFieldUpdater.get(hVar) == y2.a.f10834d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C1196f c1196f = obj instanceof C1196f ? (C1196f) obj : null;
            if (c1196f != null) {
                c1196f.p();
            }
        }
        this.f4982c = C0325b.f4980a;
    }

    public AbstractC0326c(InterfaceC0300c interfaceC0300c) {
        this(interfaceC0300c, interfaceC0300c != null ? interfaceC0300c.getContext() : null);
    }
}
