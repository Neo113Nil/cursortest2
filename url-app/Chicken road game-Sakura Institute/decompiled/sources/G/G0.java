package G;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class G0 implements Iterable, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public final F0 f2682d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2683e;

    /* renamed from: i, reason: collision with root package name */
    public final int f2684i;

    public G0(F0 f02, int i2, int i4) {
        this.f2682d = f02;
        this.f2683e = i2;
        this.f2684i = i4;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i2;
        ArrayList arrayList;
        int Q3;
        F0 f02 = this.f2682d;
        if (f02.f2676m != this.f2684i) {
            throw new ConcurrentModificationException();
        }
        HashMap hashMap = f02.f2678o;
        C0190c c0190c = null;
        int i4 = this.f2683e;
        if (hashMap != null) {
            if (f02.f2675l) {
                C0192d.w("use active SlotWriter to crate an anchor for location instead");
                throw null;
            }
            if (i4 >= 0 && i4 < (i2 = f02.f2671e) && (Q3 = C0192d.Q((arrayList = f02.f2677n), i4, i2)) >= 0) {
                c0190c = (C0190c) arrayList.get(Q3);
            }
            if (c0190c != null) {
            }
        }
        return new L(f02, i4 + 1, f02.f2670d[(i4 * 5) + 3] + i4);
    }
}
