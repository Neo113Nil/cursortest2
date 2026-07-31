package androidx.room;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final C2.c f4084a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f4085b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f4086c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f4087d;

    public n(C2.c cVar, int[] iArr, String[] strArr) {
        Set singleton;
        this.f4084a = cVar;
        this.f4085b = iArr;
        this.f4086c = strArr;
        if (strArr.length == 0) {
            singleton = M1.w.f2805d;
        } else {
            singleton = Collections.singleton(strArr[0]);
            Z1.i.e(singleton, "singleton(...)");
        }
        this.f4087d = singleton;
        if (iArr.length != strArr.length) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final void a(Set set) {
        Z1.i.f(set, "invalidatedTablesIds");
        int[] iArr = this.f4085b;
        int length = iArr.length;
        Collection collection = M1.w.f2805d;
        if (length != 0) {
            int i3 = 0;
            if (length != 1) {
                N1.i iVar = new N1.i();
                int length2 = iArr.length;
                int i4 = 0;
                while (i3 < length2) {
                    int i5 = i4 + 1;
                    if (set.contains(Integer.valueOf(iArr[i3]))) {
                        iVar.add(this.f4086c[i4]);
                    }
                    i3++;
                    i4 = i5;
                }
                collection = I2.d.n(iVar);
            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                collection = this.f4087d;
            }
        }
        if (collection.isEmpty()) {
            return;
        }
        ((m2.e) this.f4084a.f485f).g(L1.z.f2729a);
    }
}
