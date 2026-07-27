package Q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class a extends V2.c implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final Comparator f2474c = Comparator.comparing(new A3.b(12));

    /* renamed from: d, reason: collision with root package name */
    public static final a f2475d;

    static {
        a aVar;
        ArrayList arrayList = new ArrayList();
        if (arrayList.size() != 2 || arrayList.get(0) == null) {
            Object[] array = arrayList.toArray();
            for (int i2 = 0; i2 < array.length; i2 += 2) {
                V2.e eVar = (V2.e) array[i2];
                if (eVar != null && eVar.f3237b.isEmpty()) {
                    array[i2] = null;
                }
            }
            aVar = new a(array, f2474c);
        } else {
            aVar = new a(arrayList.toArray());
        }
        f2475d = aVar;
    }

    public final L3.j e() {
        ArrayList arrayList = new ArrayList(Arrays.asList(this.f3233a));
        L3.j jVar = new L3.j();
        jVar.f1503a = arrayList;
        return jVar;
    }
}
