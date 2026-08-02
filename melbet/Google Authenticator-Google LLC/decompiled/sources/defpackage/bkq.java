package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bkq implements bkd {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.bkd
    public final void g() {
        Iterator it = bmi.e(this.a).iterator();
        while (it.hasNext()) {
            ((bln) it.next()).g();
        }
    }

    @Override // defpackage.bkd
    public final void h() {
        Iterator it = bmi.e(this.a).iterator();
        while (it.hasNext()) {
            ((bln) it.next()).h();
        }
    }

    @Override // defpackage.bkd
    public final void i() {
        Iterator it = bmi.e(this.a).iterator();
        while (it.hasNext()) {
            ((bln) it.next()).i();
        }
    }
}
