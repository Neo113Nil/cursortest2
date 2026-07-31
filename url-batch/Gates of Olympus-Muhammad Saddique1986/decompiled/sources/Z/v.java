package Z;

import java.util.Arrays;
import java.util.Comparator;
import t0.AbstractC0993f;
import t0.E;

/* loaded from: classes.dex */
public final class v implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final v f4711a = new v();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        t tVar = (t) obj;
        t tVar2 = (t) obj2;
        int i3 = 0;
        if (!d.t(tVar) || !d.t(tVar2)) {
            if (d.t(tVar)) {
                return -1;
            }
            return d.t(tVar2) ? 1 : 0;
        }
        E t3 = AbstractC0993f.t(tVar);
        E t4 = AbstractC0993f.t(tVar2);
        if (f2.j.a(t3, t4)) {
            return 0;
        }
        Object[] objArr = new E[16];
        int i4 = 0;
        while (t3 != null) {
            int i5 = i4 + 1;
            if (objArr.length < i5) {
                objArr = Arrays.copyOf(objArr, Math.max(i5, objArr.length * 2));
                f2.j.e(objArr, "copyOf(this, newSize)");
            }
            if (i4 != 0) {
                S1.k.m0(objArr, objArr, 0 + 1, 0, i4);
            }
            objArr[0] = t3;
            i4++;
            t3 = t3.s();
        }
        Object[] objArr2 = new E[16];
        int i6 = 0;
        while (t4 != null) {
            int i7 = i6 + 1;
            if (objArr2.length < i7) {
                objArr2 = Arrays.copyOf(objArr2, Math.max(i7, objArr2.length * 2));
                f2.j.e(objArr2, "copyOf(this, newSize)");
            }
            if (i6 != 0) {
                S1.k.m0(objArr2, objArr2, 0 + 1, 0, i6);
            }
            objArr2[0] = t4;
            i6++;
            t4 = t4.s();
        }
        int min = Math.min(i4 - 1, i6 - 1);
        if (min >= 0) {
            while (f2.j.a(objArr[i3], objArr2[i3])) {
                if (i3 != min) {
                    i3++;
                }
            }
            return f2.j.g(((E) objArr[i3]).t(), ((E) objArr2[i3]).t());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
    }
}
