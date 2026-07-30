package D4;

import C4.d;
import C4.f;
import H4.c;
import H4.e;
import java.util.ArrayList;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class a extends c implements b {

    /* renamed from: l, reason: collision with root package name */
    public static final Comparator f354l = Comparator.comparing(new C4.a(4));

    /* renamed from: m, reason: collision with root package name */
    public static final a f355m;

    /* renamed from: i, reason: collision with root package name */
    public C4.b f356i;

    static {
        a aVar;
        ArrayList arrayList = new ArrayList();
        if (arrayList.size() != 2 || arrayList.get(0) == null) {
            Object[] array = arrayList.toArray();
            for (int i2 = 0; i2 < array.length; i2 += 2) {
                E4.a aVar2 = (E4.a) array[i2];
                if (aVar2 != null && aVar2.f701b.isEmpty()) {
                    array[i2] = null;
                }
            }
            aVar = new a(array, f354l);
        } else {
            aVar = new a(arrayList.toArray());
        }
        f355m = aVar;
    }

    @Override // D4.b
    public final f c() {
        if (this.f356i == null) {
            int i2 = 0;
            d dVar = new d(0);
            while (true) {
                Object[] objArr = this.f987d;
                if (i2 >= objArr.length) {
                    break;
                }
                Object obj = objArr[i2];
                Object obj2 = objArr[i2 + 1];
                e a7 = ((E4.a) obj).a();
                if (a7 != null) {
                    dVar.e(a7, obj2);
                }
                i2 += 2;
            }
            this.f356i = dVar.b();
        }
        return this.f356i;
    }
}
