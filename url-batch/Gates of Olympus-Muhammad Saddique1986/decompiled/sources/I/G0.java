package I;

import g2.InterfaceC0439a;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class G0 implements Iterable, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public final F0 f2684d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2685e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2686f;

    public G0(F0 f02, int i3, int i4) {
        this.f2684d = f02;
        this.f2685e = i3;
        this.f2686f = i4;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i3;
        ArrayList arrayList;
        int Q3;
        F0 f02 = this.f2684d;
        if (f02.f2678j != this.f2686f) {
            throw new ConcurrentModificationException();
        }
        HashMap hashMap = f02.f2680l;
        C0141c c0141c = null;
        int i4 = this.f2685e;
        if (hashMap != null) {
            if (f02.f2677i) {
                C0143d.w("use active SlotWriter to crate an anchor for location instead");
                throw null;
            }
            if (i4 >= 0 && i4 < (i3 = f02.f2673e) && (Q3 = C0143d.Q((arrayList = f02.f2679k), i4, i3)) >= 0) {
                c0141c = (C0141c) arrayList.get(Q3);
            }
            if (c0141c != null) {
            }
        }
        return new L(f02, i4 + 1, f02.f2672d[(i4 * 5) + 3] + i4);
    }
}
