package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class pnx5pC0XzaCw extends ZbWwgt3aGe7A implements ListIterator {
    public final /* synthetic */ e6tOsSdd2EFb dgRBjINgWbAK;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pnx5pC0XzaCw(e6tOsSdd2EFb e6tossdd2efb, int i) {
        super(0, e6tossdd2efb);
        this.dgRBjINgWbAK = e6tossdd2efb;
        S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
        int PxuCJdSBwIXG = e6tossdd2efb.PxuCJdSBwIXG();
        s2OOm9zPNm0h.getClass();
        S2OOm9zPNm0h.lS5Rgt96tfkO(i, PxuCJdSBwIXG);
        this.OPXfSBeufaJ8 = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.OPXfSBeufaJ8 > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.OPXfSBeufaJ8;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            u9.RfyTYNmI9Srp();
            return null;
        }
        int i = this.OPXfSBeufaJ8 - 1;
        this.OPXfSBeufaJ8 = i;
        return this.dgRBjINgWbAK.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.OPXfSBeufaJ8 - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
