package g0;

import android.util.SparseArray;
import java.util.Set;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f2293a;

    /* renamed from: b, reason: collision with root package name */
    public int f2294b;

    /* renamed from: c, reason: collision with root package name */
    public Set f2295c;

    public final P a(int i) {
        SparseArray sparseArray = this.f2293a;
        P p2 = (P) sparseArray.get(i);
        if (p2 != null) {
            return p2;
        }
        P p3 = new P();
        sparseArray.put(i, p3);
        return p3;
    }
}
