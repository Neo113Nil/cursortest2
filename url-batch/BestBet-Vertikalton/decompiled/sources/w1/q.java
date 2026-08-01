package w1;

import c1.AbstractC0091d;
import d1.AbstractC0095c;
import d1.InterfaceC0096d;
import s1.AbstractC0318a;
import s1.AbstractC0335s;

/* loaded from: classes.dex */
public class q extends AbstractC0318a implements InterfaceC0096d {
    public final AbstractC0095c d;

    public q(b1.j jVar, AbstractC0095c abstractC0095c) {
        super(jVar, true);
        this.d = abstractC0095c;
    }

    @Override // s1.U
    public final boolean B() {
        return true;
    }

    @Override // d1.InterfaceC0096d
    public final InterfaceC0096d e() {
        AbstractC0095c abstractC0095c = this.d;
        if (abstractC0095c != null) {
            return abstractC0095c;
        }
        return null;
    }

    @Override // s1.U
    public void g(Object obj) {
        a.c(AbstractC0091d.m(this.d), AbstractC0335s.h(obj), null);
    }

    @Override // s1.U
    public void i(Object obj) {
        this.d.b(AbstractC0335s.h(obj));
    }
}
