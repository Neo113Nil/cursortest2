package u6;

import a2.r;
import android.util.SparseArray;
import h6.d;
import java.util.HashMap;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f9672a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f9673b;

    static {
        HashMap hashMap = new HashMap();
        f9673b = hashMap;
        hashMap.put(d.f4479d, 0);
        hashMap.put(d.f4480e, 1);
        hashMap.put(d.f4481i, 2);
        for (d dVar : hashMap.keySet()) {
            f9672a.append(((Integer) f9673b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f9673b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        r.s(dVar, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static d b(int i3) {
        d dVar = (d) f9672a.get(i3);
        if (dVar != null) {
            return dVar;
        }
        a1.e(v4.a.j(i3, "Unknown Priority for value "));
        return null;
    }
}
