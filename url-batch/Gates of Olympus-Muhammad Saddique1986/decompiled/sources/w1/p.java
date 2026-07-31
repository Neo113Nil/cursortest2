package w1;

import h2.AbstractC0508a;
import java.util.Collections;
import java.util.Set;
import n2.AbstractC0737q;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final o f9884a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f9885b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f9886c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f9887d;

    public p(o oVar, int[] iArr, String[] strArr) {
        Set singleton;
        this.f9884a = oVar;
        this.f9885b = iArr;
        this.f9886c = strArr;
        if (strArr.length == 0) {
            singleton = S1.w.f4322d;
        } else {
            singleton = Collections.singleton(strArr[0]);
            f2.j.e(singleton, "singleton(...)");
        }
        this.f9887d = singleton;
        if (iArr.length != strArr.length) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final void a(Set set) {
        f2.j.f(set, "invalidatedTablesIds");
        int[] iArr = this.f9885b;
        int length = iArr.length;
        Set set2 = S1.w.f4322d;
        if (length != 0) {
            int i3 = 0;
            if (length != 1) {
                T1.h hVar = new T1.h();
                int length2 = iArr.length;
                int i4 = 0;
                while (i3 < length2) {
                    int i5 = i4 + 1;
                    if (set.contains(Integer.valueOf(iArr[i3]))) {
                        hVar.add(this.f9886c[i4]);
                    }
                    i3++;
                    i4 = i5;
                }
                set2 = AbstractC0508a.q(hVar);
            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                set2 = this.f9887d;
            }
        }
        if (set2.isEmpty()) {
            return;
        }
        this.f9884a.a(set2);
    }

    public final void b(String[] strArr) {
        String[] strArr2 = this.f9886c;
        int length = strArr2.length;
        Set set = S1.w.f4322d;
        if (length != 0) {
            if (length != 1) {
                T1.h hVar = new T1.h();
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        if (AbstractC0737q.s(str2, str, true)) {
                            hVar.add(str2);
                        }
                    }
                }
                set = AbstractC0508a.q(hVar);
            } else {
                int length2 = strArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        break;
                    }
                    if (AbstractC0737q.s(strArr[i3], strArr2[0], true)) {
                        set = this.f9887d;
                        break;
                    }
                    i3++;
                }
            }
        }
        if (set.isEmpty()) {
            return;
        }
        this.f9884a.a(set);
    }
}
