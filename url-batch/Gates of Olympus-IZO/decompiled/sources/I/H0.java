package I;

import a2.InterfaceC0184a;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class H0 implements Iterable, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public final G0 f2130d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2131e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2132f;

    public H0(G0 g02, int i3, int i4) {
        this.f2130d = g02;
        this.f2131e = i3;
        this.f2132f = i4;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i3;
        ArrayList arrayList;
        int P2;
        G0 g02 = this.f2130d;
        if (g02.f2124j != this.f2132f) {
            throw new ConcurrentModificationException();
        }
        HashMap hashMap = g02.f2126l;
        C0087c c0087c = null;
        int i4 = this.f2131e;
        if (hashMap != null) {
            if (g02.f2123i) {
                C0089d.w("use active SlotWriter to crate an anchor for location instead");
                throw null;
            }
            if (i4 >= 0 && i4 < (i3 = g02.f2119e) && (P2 = C0089d.P((arrayList = g02.f2125k), i4, i3)) >= 0) {
                c0087c = (C0087c) arrayList.get(P2);
            }
            if (c0087c != null) {
            }
        }
        return new M(g02, i4 + 1, g02.f2118d[(i4 * 5) + 3] + i4);
    }
}
