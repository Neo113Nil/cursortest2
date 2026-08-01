package i1;

import c2.g0;
import java.util.Comparator;
import kotlin.collections.i0;
import kotlin.jvm.internal.Intrinsics;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u implements Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final u f4631d = new u();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        t tVar = (t) obj;
        t tVar2 = (t) obj2;
        int i3 = 0;
        if (w.A(tVar) && w.A(tVar2)) {
            g0 u2 = c2.k.u(tVar);
            g0 u10 = c2.k.u(tVar2);
            if (!Intrinsics.a(u2, u10)) {
                g0[] g0VarArr = new g0[16];
                int i10 = 0;
                while (u2 != null) {
                    int i11 = i10 + 1;
                    if (g0VarArr.length < i11) {
                        int length = g0VarArr.length;
                        ?? r52 = new Object[Math.max(i11, length * 2)];
                        System.arraycopy(g0VarArr, 0, r52, 0, length);
                        g0VarArr = r52;
                    }
                    if (i10 != 0) {
                        System.arraycopy(g0VarArr, 0, g0VarArr, 0 + 1, i10 + 0);
                    }
                    g0VarArr[0] = u2;
                    i10++;
                    u2 = u2.s();
                }
                g0[] g0VarArr2 = new g0[16];
                int i12 = 0;
                while (u10 != null) {
                    int i13 = i12 + 1;
                    if (g0VarArr2.length < i13) {
                        int length2 = g0VarArr2.length;
                        ?? r53 = new Object[Math.max(i13, length2 * 2)];
                        System.arraycopy(g0VarArr2, 0, r53, 0, length2);
                        g0VarArr2 = r53;
                    }
                    if (i12 != 0) {
                        System.arraycopy(g0VarArr2, 0, g0VarArr2, 0 + 1, i12 + 0);
                    }
                    g0VarArr2[0] = u10;
                    i12++;
                    u10 = u10.s();
                }
                int min = Math.min(i10 - 1, i12 - 1);
                if (min >= 0) {
                    while (Intrinsics.a(g0VarArr[i3], g0VarArr2[i3])) {
                        if (i3 != min) {
                            i3++;
                        }
                    }
                    return Intrinsics.b(g0VarArr[i3].t(), g0VarArr2[i3].t());
                }
                i0.l("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            }
        } else {
            if (w.A(tVar)) {
                return -1;
            }
            if (w.A(tVar2)) {
                return 1;
            }
        }
        return 0;
    }
}
