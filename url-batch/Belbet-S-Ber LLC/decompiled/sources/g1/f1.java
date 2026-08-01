package g1;

import android.util.SparseArray;
import java.util.Set;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f1657a;

    /* renamed from: b, reason: collision with root package name */
    public int f1658b;

    /* renamed from: c, reason: collision with root package name */
    public Set f1659c;

    public final e1 a(int i) {
        SparseArray sparseArray = this.f1657a;
        e1 e1Var = (e1) sparseArray.get(i);
        if (e1Var != null) {
            return e1Var;
        }
        e1 e1Var2 = new e1();
        sparseArray.put(i, e1Var2);
        return e1Var2;
    }
}
