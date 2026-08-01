package g0;

import android.util.SparseArray;
import java.util.Set;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f2742a;

    /* renamed from: b, reason: collision with root package name */
    public int f2743b;

    /* renamed from: c, reason: collision with root package name */
    public Set f2744c;

    public final L a(int i) {
        SparseArray sparseArray = this.f2742a;
        L l2 = (L) sparseArray.get(i);
        if (l2 != null) {
            return l2;
        }
        L l3 = new L();
        sparseArray.put(i, l3);
        return l3;
    }
}
