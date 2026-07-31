package V3;

import D3.M;
import a4.AbstractC0230c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class a extends AbstractC0230c implements c {

    /* renamed from: h, reason: collision with root package name */
    public static final Comparator f2705h = Comparator.comparing(new A4.b(18));

    /* renamed from: i, reason: collision with root package name */
    public static final a f2706i;

    static {
        a aVar;
        ArrayList arrayList = new ArrayList();
        if (arrayList.size() != 2 || arrayList.get(0) == null) {
            Object[] array = arrayList.toArray();
            for (int i7 = 0; i7 < array.length; i7 += 2) {
                a4.e eVar = (a4.e) array[i7];
                if (eVar != null && eVar.f3140b.isEmpty()) {
                    array[i7] = null;
                }
            }
            aVar = new a(array, f2705h);
        } else {
            aVar = new a(arrayList.toArray());
        }
        f2706i = aVar;
    }

    public final M e() {
        return new M(27, new ArrayList(Arrays.asList(this.f3136f)));
    }
}
