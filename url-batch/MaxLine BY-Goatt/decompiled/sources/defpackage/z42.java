package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class z42 {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(y42.m, 0);
        hashMap.put(y42.n, 1);
        hashMap.put(y42.o, 2);
        for (y42 y42Var : hashMap.keySet()) {
            a.append(((Integer) b.get(y42Var)).intValue(), y42Var);
        }
    }

    public static int a(y42 y42Var) {
        Integer num = (Integer) b.get(y42Var);
        if (num != null) {
            return num.intValue();
        }
        b71.v(y42Var, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static y42 b(int i) {
        y42 y42Var = (y42) a.get(i);
        if (y42Var != null) {
            return y42Var;
        }
        lh.e(in1.k(i, "Unknown Priority for value "));
        return null;
    }
}
