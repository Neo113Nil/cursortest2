package o2;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.List;
import m4.q;
import r0.i;

/* loaded from: classes.dex */
public final class c {
    private c() {
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) m0.j(c.class.getClassLoader()));
        }
    }

    public static <T extends r0.i> m4.q<T> b(i.a<T> aVar, List<Bundle> list) {
        q.a r7 = m4.q.r();
        for (int i7 = 0; i7 < list.size(); i7++) {
            r7.a(aVar.a((Bundle) a.e(list.get(i7))));
        }
        return r7.h();
    }

    public static <T extends r0.i> SparseArray<T> c(i.a<T> aVar, SparseArray<Bundle> sparseArray) {
        SparseArray<T> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            sparseArray2.put(sparseArray.keyAt(i7), aVar.a(sparseArray.valueAt(i7)));
        }
        return sparseArray2;
    }
}
