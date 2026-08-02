package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cgy {
    private static SparseArray a = new SparseArray();
    private static HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(ccn.a, 0);
        b.put(ccn.b, 1);
        b.put(ccn.c, 2);
        for (ccn ccnVar : b.keySet()) {
            a.append(((Integer) b.get(ccnVar)).intValue(), ccnVar);
        }
    }

    public static int a(ccn ccnVar) {
        Integer num = (Integer) b.get(ccnVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value ".concat(String.valueOf(String.valueOf(ccnVar))));
    }

    public static ccn b(int i) {
        ccn ccnVar = (ccn) a.get(i);
        if (ccnVar != null) {
            return ccnVar;
        }
        throw new IllegalArgumentException(a.Y(i, "Unknown Priority for value "));
    }
}
