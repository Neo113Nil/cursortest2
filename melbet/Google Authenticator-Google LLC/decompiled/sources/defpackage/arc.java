package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arc extends yn {
    public final List a;

    public arc() {
        super(null, null);
        this.a = new ArrayList(3);
    }

    private static final void n(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    @Override // defpackage.yn
    public final void j(int i) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((yn) it.next()).j(i);
            }
        } catch (ConcurrentModificationException e) {
            n(e);
        }
    }

    @Override // defpackage.yn
    public final void k(int i, float f, int i2) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((yn) it.next()).k(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            n(e);
        }
    }

    @Override // defpackage.yn
    public final void l(int i) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((yn) it.next()).l(i);
            }
        } catch (ConcurrentModificationException e) {
            n(e);
        }
    }

    public final void m(yn ynVar) {
        this.a.add(ynVar);
    }
}
