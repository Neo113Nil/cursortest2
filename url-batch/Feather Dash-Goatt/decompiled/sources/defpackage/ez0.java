package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class ez0 {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(dz0.d, 0);
        hashMap.put(dz0.e, 1);
        hashMap.put(dz0.g, 2);
        for (dz0 dz0Var : hashMap.keySet()) {
            a.append(((Integer) b.get(dz0Var)).intValue(), dz0Var);
        }
    }

    public static int a(dz0 dz0Var) {
        Integer num = (Integer) b.get(dz0Var);
        if (num != null) {
            return num.intValue();
        }
        af.i(dz0Var, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static dz0 b(int i) {
        dz0 dz0Var = (dz0) a.get(i);
        if (dz0Var != null) {
            return dz0Var;
        }
        dd0.e(qy0.i(i, "Unknown Priority for value "));
        return null;
    }
}
