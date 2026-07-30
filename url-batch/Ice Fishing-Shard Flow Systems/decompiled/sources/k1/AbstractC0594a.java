package k1;

import C4.p;
import X0.d;
import android.util.SparseArray;
import java.util.HashMap;

/* renamed from: k1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0594a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f6031a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f6032b;

    static {
        HashMap hashMap = new HashMap();
        f6032b = hashMap;
        hashMap.put(d.f2851d, 0);
        hashMap.put(d.f2852e, 1);
        hashMap.put(d.f2853i, 2);
        for (d dVar : hashMap.keySet()) {
            f6031a.append(((Integer) f6032b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f6032b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i2) {
        d dVar = (d) f6031a.get(i2);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(p.g(i2, "Unknown Priority for value "));
    }
}
