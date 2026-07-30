package x0;

import java.util.Arrays;
import java.util.Comparator;
import r1.d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final t f9637a = new t();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        r rVar = (r) obj;
        r rVar2 = (r) obj2;
        int i7 = 0;
        if (d.t(rVar) && d.t(rVar2)) {
            d0 t2 = r1.f.t(rVar);
            d0 t8 = r1.f.t(rVar2);
            if (!r6.k.a(t2, t8)) {
                Object[] objArr = new d0[16];
                int i8 = 0;
                while (t2 != null) {
                    int i9 = i8 + 1;
                    if (objArr.length < i9) {
                        objArr = Arrays.copyOf(objArr, Math.max(i9, objArr.length * 2));
                        r6.k.e(objArr, "copyOf(this, newSize)");
                    }
                    if (i8 != 0) {
                        e6.k.X(objArr, objArr, 0 + 1, 0, i8);
                    }
                    objArr[0] = t2;
                    i8++;
                    t2 = t2.s();
                }
                Object[] objArr2 = new d0[16];
                int i10 = 0;
                while (t8 != null) {
                    int i11 = i10 + 1;
                    if (objArr2.length < i11) {
                        objArr2 = Arrays.copyOf(objArr2, Math.max(i11, objArr2.length * 2));
                        r6.k.e(objArr2, "copyOf(this, newSize)");
                    }
                    if (i10 != 0) {
                        e6.k.X(objArr2, objArr2, 0 + 1, 0, i10);
                    }
                    objArr2[0] = t8;
                    i10++;
                    t8 = t8.s();
                }
                int min = Math.min(i8 - 1, i10 - 1);
                if (min >= 0) {
                    while (r6.k.a(objArr[i7], objArr2[i7])) {
                        if (i7 != min) {
                            i7++;
                        }
                    }
                    return r6.k.g(((d0) objArr[i7]).t(), ((d0) objArr2[i7]).t());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (d.t(rVar)) {
                return -1;
            }
            if (d.t(rVar2)) {
                return 1;
            }
        }
        return 0;
    }
}
