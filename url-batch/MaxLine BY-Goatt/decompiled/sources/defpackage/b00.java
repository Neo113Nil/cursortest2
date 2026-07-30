package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class b00 {
    public static final hv1 a = new hv1("provider");
    public static final hv1 b = new hv1("provider");
    public static final hv1 c = new hv1("compositionLocalMap");
    public static final hv1 d = new hv1("providers");
    public static final hv1 e = new hv1("reference");
    public static final n f = new n(1);

    public static final void a(ArrayList arrayList, int i, int i2) {
        int e2 = e(i, arrayList);
        if (e2 < 0) {
            e2 = -(e2 + 1);
        }
        while (e2 < arrayList.size() && ((x41) arrayList.get(e2)).b < i2) {
        }
    }

    public static final void b(vl2 vl2Var, ArrayList arrayList, int i) {
        boolean l = vl2Var.l(i);
        int[] iArr = vl2Var.b;
        if (l) {
            arrayList.add(vl2Var.n(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            b(vl2Var, arrayList, i3);
        }
    }

    public static final void c(String str) {
        throw new jz(q40.m("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void d(String str) {
        throw new jz(q40.m("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final int e(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int c2 = Intrinsics.c(((x41) list.get(i3)).b, i);
            if (c2 < 0) {
                i2 = i3 + 1;
            } else {
                if (c2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void f(zl2 zl2Var, int i, Object obj) {
        int h = zl2Var.h(i);
        Object[] objArr = zl2Var.c;
        Object obj2 = objArr[h];
        objArr[h] = sz.a;
        if (obj == obj2) {
            return;
        }
        c("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}
