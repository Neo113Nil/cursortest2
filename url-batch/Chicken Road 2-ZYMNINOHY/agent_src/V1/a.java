package V1;

import E.AbstractC0005f;
import I1.c;
import android.util.SparseArray;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f3222a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f3223b;

    static {
        HashMap hashMap = new HashMap();
        f3223b = hashMap;
        hashMap.put(c.f1126a, 0);
        hashMap.put(c.f1127b, 1);
        hashMap.put(c.f1128c, 2);
        for (c cVar : hashMap.keySet()) {
            f3222a.append(((Integer) f3223b.get(cVar)).intValue(), cVar);
        }
    }

    public static int a(c cVar) {
        Integer num = (Integer) f3223b.get(cVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + cVar);
    }

    public static c b(int i4) {
        c cVar = (c) f3222a.get(i4);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException(AbstractC0005f.j(i4, "Unknown Priority for value "));
    }
}
