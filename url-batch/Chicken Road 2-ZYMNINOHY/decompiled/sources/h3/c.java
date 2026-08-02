package h3;

import C3.h;
import f3.C0426d;
import f3.InterfaceC0425c;
import f3.InterfaceC0427e;
import f3.InterfaceC0428f;
import f3.InterfaceC0430h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.i;
import x3.AbstractC1558s;
import x3.C1546f;

/* loaded from: classes.dex */
public abstract class c extends AbstractC0448a {
    private final InterfaceC0430h _context;
    private transient InterfaceC0425c intercepted;

    public c(InterfaceC0425c interfaceC0425c, InterfaceC0430h interfaceC0430h) {
        super(interfaceC0425c);
        this._context = interfaceC0430h;
    }

    @Override // f3.InterfaceC0425c
    public InterfaceC0430h getContext() {
        InterfaceC0430h interfaceC0430h = this._context;
        i.b(interfaceC0430h);
        return interfaceC0430h;
    }

    public final InterfaceC0425c intercepted() {
        InterfaceC0425c interfaceC0425c = this.intercepted;
        if (interfaceC0425c != null) {
            return interfaceC0425c;
        }
        InterfaceC0427e interfaceC0427e = (InterfaceC0427e) getContext().n(C0426d.f8816a);
        InterfaceC0425c hVar = interfaceC0427e != null ? new h((AbstractC1558s) interfaceC0427e, this) : this;
        this.intercepted = hVar;
        return hVar;
    }

    @Override // h3.AbstractC0448a
    public void releaseIntercepted() {
        InterfaceC0425c interfaceC0425c = this.intercepted;
        if (interfaceC0425c != null && interfaceC0425c != this) {
            InterfaceC0428f n = getContext().n(C0426d.f8816a);
            i.b(n);
            h hVar = (h) interfaceC0425c;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h.f292h;
            while (atomicReferenceFieldUpdater.get(hVar) == C3.a.f282d) {
            }
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C1546f c1546f = obj instanceof C1546f ? (C1546f) obj : null;
            if (c1546f != null) {
                c1546f.n();
            }
        }
        this.intercepted = C0449b.f9240a;
    }

    public c(InterfaceC0425c interfaceC0425c) {
        this(interfaceC0425c, interfaceC0425c != null ? interfaceC0425c.getContext() : null);
    }
}
