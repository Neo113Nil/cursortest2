package q5;

import H5.AbstractC0161v;
import H5.C0147g;
import M5.h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.i;
import o5.C0565e;
import o5.InterfaceC0564d;
import o5.InterfaceC0566f;
import o5.InterfaceC0567g;
import o5.InterfaceC0569i;

/* renamed from: q5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0607c extends AbstractC0605a {
    private final InterfaceC0569i _context;
    private transient InterfaceC0564d intercepted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0607c(InterfaceC0564d interfaceC0564d) {
        super(interfaceC0564d);
        InterfaceC0569i context = interfaceC0564d != null ? interfaceC0564d.getContext() : null;
        this._context = context;
    }

    @Override // o5.InterfaceC0564d
    public InterfaceC0569i getContext() {
        InterfaceC0569i interfaceC0569i = this._context;
        i.b(interfaceC0569i);
        return interfaceC0569i;
    }

    public final InterfaceC0564d intercepted() {
        InterfaceC0564d interfaceC0564d = this.intercepted;
        if (interfaceC0564d != null) {
            return interfaceC0564d;
        }
        InterfaceC0566f interfaceC0566f = (InterfaceC0566f) getContext().m(C0565e.f5619f);
        InterfaceC0564d hVar = interfaceC0566f != null ? new h((AbstractC0161v) interfaceC0566f, this) : this;
        this.intercepted = hVar;
        return hVar;
    }

    @Override // q5.AbstractC0605a
    public void releaseIntercepted() {
        InterfaceC0564d interfaceC0564d = this.intercepted;
        if (interfaceC0564d != null && interfaceC0564d != this) {
            InterfaceC0567g m4 = getContext().m(C0565e.f5619f);
            i.b(m4);
            h hVar = (h) interfaceC0564d;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.f1595m;
            while (atomicReferenceFieldUpdater.get(hVar) == M5.a.f1585d) {
            }
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C0147g c0147g = obj instanceof C0147g ? (C0147g) obj : null;
            if (c0147g != null) {
                c0147g.n();
            }
        }
        this.intercepted = C0606b.f5812f;
    }
}
