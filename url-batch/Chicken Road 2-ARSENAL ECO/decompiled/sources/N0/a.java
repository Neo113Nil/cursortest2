package N0;

import A0.d;
import W4.o;
import android.util.SparseArray;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f1678a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f1679b;

    static {
        HashMap hashMap = new HashMap();
        f1679b = hashMap;
        hashMap.put(d.f43f, 0);
        hashMap.put(d.f44g, 1);
        hashMap.put(d.f45h, 2);
        for (d dVar : hashMap.keySet()) {
            f1678a.append(((Integer) f1679b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f1679b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i7) {
        d dVar = (d) f1678a.get(i7);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(o.c("Unknown Priority for value ", i7));
    }
}
