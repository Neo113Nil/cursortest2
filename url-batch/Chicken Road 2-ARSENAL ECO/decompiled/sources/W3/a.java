package W3;

import D3.M;
import V3.c;
import a4.AbstractC0230c;
import a4.e;
import java.util.ArrayList;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class a extends AbstractC0230c implements b {

    /* renamed from: i, reason: collision with root package name */
    public static final Comparator f2799i = Comparator.comparing(new A4.b(22));

    /* renamed from: j, reason: collision with root package name */
    public static final a f2800j;

    /* renamed from: h, reason: collision with root package name */
    public V3.a f2801h;

    static {
        a aVar;
        ArrayList arrayList = new ArrayList();
        if (arrayList.size() != 2 || arrayList.get(0) == null) {
            Object[] array = arrayList.toArray();
            for (int i7 = 0; i7 < array.length; i7 += 2) {
                X3.a aVar2 = (X3.a) array[i7];
                if (aVar2 != null && aVar2.f2864b.isEmpty()) {
                    array[i7] = null;
                }
            }
            aVar = new a(array, f2799i);
        } else {
            aVar = new a(arrayList.toArray());
        }
        f2800j = aVar;
    }

    @Override // W3.b
    public final c b() {
        if (this.f2801h == null) {
            M m4 = new M(27);
            int i7 = 0;
            while (true) {
                Object[] objArr = this.f3136f;
                if (i7 >= objArr.length) {
                    break;
                }
                Object obj = objArr[i7];
                Object obj2 = objArr[i7 + 1];
                e a7 = ((X3.a) obj).a();
                if (a7 != null) {
                    m4.u(a7, obj2);
                }
                i7 += 2;
            }
            this.f2801h = m4.t();
        }
        return this.f2801h;
    }
}
