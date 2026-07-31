package Z;

import java.util.Arrays;
import java.util.Comparator;
import t0.AbstractC0898f;
import t0.D;

/* loaded from: classes.dex */
public final class t implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final t f3458a = new t();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        q qVar = (q) obj;
        q qVar2 = (q) obj2;
        int i3 = 0;
        if (!c.t(qVar) || !c.t(qVar2)) {
            if (c.t(qVar)) {
                return -1;
            }
            return c.t(qVar2) ? 1 : 0;
        }
        D t3 = AbstractC0898f.t(qVar);
        D t4 = AbstractC0898f.t(qVar2);
        if (Z1.i.a(t3, t4)) {
            return 0;
        }
        Object[] objArr = new D[16];
        int i4 = 0;
        while (t3 != null) {
            int i5 = i4 + 1;
            if (objArr.length < i5) {
                objArr = Arrays.copyOf(objArr, Math.max(i5, objArr.length * 2));
                Z1.i.e(objArr, "copyOf(this, newSize)");
            }
            if (i4 != 0) {
                M1.k.X(objArr, objArr, 0 + 1, 0, i4);
            }
            objArr[0] = t3;
            i4++;
            t3 = t3.q();
        }
        Object[] objArr2 = new D[16];
        int i6 = 0;
        while (t4 != null) {
            int i7 = i6 + 1;
            if (objArr2.length < i7) {
                objArr2 = Arrays.copyOf(objArr2, Math.max(i7, objArr2.length * 2));
                Z1.i.e(objArr2, "copyOf(this, newSize)");
            }
            if (i6 != 0) {
                M1.k.X(objArr2, objArr2, 0 + 1, 0, i6);
            }
            objArr2[0] = t4;
            i6++;
            t4 = t4.q();
        }
        int min = Math.min(i4 - 1, i6 - 1);
        if (min >= 0) {
            while (Z1.i.a(objArr[i3], objArr2[i3])) {
                if (i3 != min) {
                    i3++;
                }
            }
            return Z1.i.g(((D) objArr[i3]).r(), ((D) objArr2[i3]).r());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
    }
}
