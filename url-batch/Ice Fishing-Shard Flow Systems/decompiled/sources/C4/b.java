package C4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class b extends H4.c implements f {

    /* renamed from: i, reason: collision with root package name */
    public static final Comparator f296i = Comparator.comparing(new a(0));

    /* renamed from: l, reason: collision with root package name */
    public static final b f297l;

    static {
        b bVar;
        ArrayList arrayList = new ArrayList();
        if (arrayList.size() != 2 || arrayList.get(0) == null) {
            Object[] array = arrayList.toArray();
            for (int i2 = 0; i2 < array.length; i2 += 2) {
                H4.e eVar = (H4.e) array[i2];
                if (eVar != null && eVar.f991b.isEmpty()) {
                    array[i2] = null;
                }
            }
            bVar = new b(array, f296i);
        } else {
            bVar = new b(arrayList.toArray());
        }
        f297l = bVar;
    }

    public final d e() {
        ArrayList arrayList = new ArrayList(Arrays.asList(this.f987d));
        d dVar = new d();
        dVar.f300a = arrayList;
        return dVar;
    }
}
