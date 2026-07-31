package y1;

import android.util.SparseArray;
import o2.i0;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray<i0> f23373a = new SparseArray<>();

    public i0 a(int i7) {
        i0 i0Var = this.f23373a.get(i7);
        if (i0Var != null) {
            return i0Var;
        }
        i0 i0Var2 = new i0(9223372036854775806L);
        this.f23373a.put(i7, i0Var2);
        return i0Var2;
    }

    public void b() {
        this.f23373a.clear();
    }
}
