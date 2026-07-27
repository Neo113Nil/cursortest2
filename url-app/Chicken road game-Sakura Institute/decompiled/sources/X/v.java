package X;

import java.util.Arrays;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import r0.AbstractC1065f;
import r0.E;
import z2.C1436t;

/* loaded from: classes.dex */
public final class v implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final v f4357a = new v();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        t tVar = (t) obj;
        t tVar2 = (t) obj2;
        int i2 = 0;
        if (!d.t(tVar) || !d.t(tVar2)) {
            if (d.t(tVar)) {
                return -1;
            }
            return d.t(tVar2) ? 1 : 0;
        }
        E v4 = AbstractC1065f.v(tVar);
        E v5 = AbstractC1065f.v(tVar2);
        if (Intrinsics.a(v4, v5)) {
            return 0;
        }
        Object[] objArr = new E[16];
        int i4 = 0;
        while (v4 != null) {
            int i5 = i4 + 1;
            if (objArr.length < i5) {
                objArr = Arrays.copyOf(objArr, Math.max(i5, objArr.length * 2));
                Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(this, newSize)");
            }
            if (i4 != 0) {
                C1436t.f(objArr, objArr, 0 + 1, 0, i4);
            }
            objArr[0] = v4;
            i4++;
            v4 = v4.s();
        }
        Object[] objArr2 = new E[16];
        int i6 = 0;
        while (v5 != null) {
            int i7 = i6 + 1;
            if (objArr2.length < i7) {
                objArr2 = Arrays.copyOf(objArr2, Math.max(i7, objArr2.length * 2));
                Intrinsics.checkNotNullExpressionValue(objArr2, "copyOf(this, newSize)");
            }
            if (i6 != 0) {
                C1436t.f(objArr2, objArr2, 0 + 1, 0, i6);
            }
            objArr2[0] = v5;
            i6++;
            v5 = v5.s();
        }
        int min = Math.min(i4 - 1, i6 - 1);
        if (min >= 0) {
            while (Intrinsics.a(objArr[i2], objArr2[i2])) {
                if (i2 != min) {
                    i2++;
                }
            }
            return Intrinsics.e(((E) objArr[i2]).t(), ((E) objArr2[i2]).t());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
    }
}
