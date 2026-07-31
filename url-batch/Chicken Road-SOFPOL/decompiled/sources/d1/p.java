package d1;

import java.util.Comparator;
import w1.f0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final p f2102a = new p();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        n nVar = (n) obj;
        n nVar2 = (n) obj2;
        int i = 0;
        if (d.r(nVar) && d.r(nVar2)) {
            f0 u7 = w1.f.u(nVar);
            f0 u8 = w1.f.u(nVar2);
            if (!q6.i.a(u7, u8)) {
                f0[] f0VarArr = new f0[16];
                int i8 = 0;
                while (u7 != null) {
                    int i9 = i8 + 1;
                    if (f0VarArr.length < i9) {
                        int length = f0VarArr.length;
                        ?? r52 = new Object[Math.max(i9, length * 2)];
                        System.arraycopy(f0VarArr, 0, r52, 0, length);
                        f0VarArr = r52;
                    }
                    if (i8 != 0) {
                        System.arraycopy(f0VarArr, 0, f0VarArr, 0 + 1, i8 + 0);
                    }
                    f0VarArr[0] = u7;
                    i8++;
                    u7 = u7.s();
                }
                f0[] f0VarArr2 = new f0[16];
                int i10 = 0;
                while (u8 != null) {
                    int i11 = i10 + 1;
                    if (f0VarArr2.length < i11) {
                        int length2 = f0VarArr2.length;
                        ?? r53 = new Object[Math.max(i11, length2 * 2)];
                        System.arraycopy(f0VarArr2, 0, r53, 0, length2);
                        f0VarArr2 = r53;
                    }
                    if (i10 != 0) {
                        System.arraycopy(f0VarArr2, 0, f0VarArr2, 0 + 1, i10 + 0);
                    }
                    f0VarArr2[0] = u8;
                    i10++;
                    u8 = u8.s();
                }
                int min = Math.min(i8 - 1, i10 - 1);
                if (min >= 0) {
                    while (q6.i.a(f0VarArr[i], f0VarArr2[i])) {
                        if (i != min) {
                            i++;
                        }
                    }
                    return q6.i.f(f0VarArr[i].t(), f0VarArr2[i].t());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (d.r(nVar)) {
                return -1;
            }
            if (d.r(nVar2)) {
                return 1;
            }
        }
        return 0;
    }
}
