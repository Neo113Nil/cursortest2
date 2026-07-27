package R3;

import a3.C0182a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2651a;

    public t(ArrayList arrayList) {
        this.f2651a = arrayList;
    }

    public final void a(double d6, Q2.c cVar, C0182a c0182a) {
        Iterator it = this.f2651a.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(d6, cVar, c0182a);
        }
    }

    public final void b(long j2, Q2.c cVar, C0182a c0182a) {
        Iterator it = this.f2651a.iterator();
        while (it.hasNext()) {
            ((t) it.next()).b(j2, cVar, c0182a);
        }
    }
}
