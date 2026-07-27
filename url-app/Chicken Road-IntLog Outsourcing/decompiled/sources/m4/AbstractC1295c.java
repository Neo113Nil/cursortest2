package m4;

import D4.AbstractC0020u;
import D4.C0007g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k4.C1219e;
import k4.InterfaceC1218d;
import k4.InterfaceC1220f;
import k4.InterfaceC1221g;
import k4.InterfaceC1223i;
import kotlin.jvm.internal.i;

/* renamed from: m4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1295c extends AbstractC1293a {
    private final InterfaceC1223i _context;
    private transient InterfaceC1218d intercepted;

    public AbstractC1295c(InterfaceC1218d interfaceC1218d, InterfaceC1223i interfaceC1223i) {
        super(interfaceC1218d);
        this._context = interfaceC1223i;
    }

    @Override // k4.InterfaceC1218d
    public InterfaceC1223i getContext() {
        InterfaceC1223i interfaceC1223i = this._context;
        i.b(interfaceC1223i);
        return interfaceC1223i;
    }

    public final InterfaceC1218d intercepted() {
        InterfaceC1218d interfaceC1218d = this.intercepted;
        if (interfaceC1218d == null) {
            InterfaceC1220f interfaceC1220f = (InterfaceC1220f) getContext().o(C1219e.f10719a);
            interfaceC1218d = interfaceC1220f != null ? new I4.h((AbstractC0020u) interfaceC1220f, this) : this;
            this.intercepted = interfaceC1218d;
        }
        return interfaceC1218d;
    }

    @Override // m4.AbstractC1293a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC1218d interfaceC1218d = this.intercepted;
        if (interfaceC1218d != null && interfaceC1218d != this) {
            InterfaceC1221g o2 = getContext().o(C1219e.f10719a);
            i.b(o2);
            I4.h hVar = (I4.h) interfaceC1218d;
            do {
                atomicReferenceFieldUpdater = I4.h.f1293h;
            } while (atomicReferenceFieldUpdater.get(hVar) == I4.a.f1283d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C0007g c0007g = obj instanceof C0007g ? (C0007g) obj : null;
            if (c0007g != null) {
                c0007g.o();
            }
        }
        this.intercepted = C1294b.f11207a;
    }

    public AbstractC1295c(InterfaceC1218d interfaceC1218d) {
        this(interfaceC1218d, interfaceC1218d != null ? interfaceC1218d.getContext() : null);
    }
}
