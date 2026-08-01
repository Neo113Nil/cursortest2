package g0;

import android.util.SparseArray;
import java.util.Set;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f2328a;

    /* renamed from: b, reason: collision with root package name */
    public int f2329b;

    /* renamed from: c, reason: collision with root package name */
    public Set f2330c;

    public final N a(int i) {
        SparseArray sparseArray = this.f2328a;
        N n2 = (N) sparseArray.get(i);
        if (n2 != null) {
            return n2;
        }
        N n3 = new N();
        sparseArray.put(i, n3);
        return n3;
    }
}
