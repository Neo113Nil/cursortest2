package m0;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final b1 f5108a = new b1("provider");

    /* renamed from: b, reason: collision with root package name */
    public static final b1 f5109b = new b1("provider");

    /* renamed from: c, reason: collision with root package name */
    public static final b1 f5110c = new b1("compositionLocalMap");

    /* renamed from: d, reason: collision with root package name */
    public static final b1 f5111d = new b1("providers");

    /* renamed from: e, reason: collision with root package name */
    public static final b1 f5112e = new b1("reference");

    /* renamed from: f, reason: collision with root package name */
    public static final a0.a f5113f = new a0.a(3);

    public static final void a(List list, int i, int i8) {
        int e8 = e(i, list);
        if (e8 < 0) {
            e8 = -(e8 + 1);
        }
        while (e8 < list.size() && ((o0) list.get(e8)).f5031b < i8) {
        }
    }

    public static final void b(e2 e2Var, ArrayList arrayList, int i) {
        boolean l3 = e2Var.l(i);
        int[] iArr = e2Var.f4908b;
        if (l3) {
            arrayList.add(e2Var.n(i));
            return;
        }
        int i8 = iArr[(i * 5) + 3] + i;
        for (int i9 = i + 1; i9 < i8; i9 += iArr[(i9 * 5) + 3]) {
            b(e2Var, arrayList, i9);
        }
    }

    public static final void c(String str) {
        throw new m("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final Void d(String str) {
        throw new m("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final int e(int i, List list) {
        int size = list.size() - 1;
        int i8 = 0;
        while (i8 <= size) {
            int i9 = (i8 + size) >>> 1;
            int f6 = q6.i.f(((o0) list.get(i9)).f5031b, i);
            if (f6 < 0) {
                i8 = i9 + 1;
            } else {
                if (f6 <= 0) {
                    return i9;
                }
                size = i9 - 1;
            }
        }
        return -(i8 + 1);
    }

    public static final void f(i2 i2Var, int i, Object obj) {
        int h8 = i2Var.h(i);
        Object[] objArr = i2Var.f4954c;
        Object obj2 = objArr[h8];
        objArr[h8] = n.f5019a;
        if (obj == obj2) {
            return;
        }
        c("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}
