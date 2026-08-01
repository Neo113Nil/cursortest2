package androidx.room;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final B1.c f2116a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f2117b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f2118c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f2119d;

    public q(B1.c cVar, int[] iArr, String[] strArr) {
        Set singleton;
        this.f2116a = cVar;
        this.f2117b = iArr;
        this.f2118c = strArr;
        if (strArr.length == 0) {
            singleton = X0.v.f1387a;
        } else {
            singleton = Collections.singleton(strArr[0]);
            j1.h.d(singleton, "singleton(...)");
        }
        this.f2119d = singleton;
        if (iArr.length != strArr.length) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final void a(Set set) {
        j1.h.e(set, "invalidatedTablesIds");
        int[] iArr = this.f2117b;
        int length = iArr.length;
        Collection collection = X0.v.f1387a;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                Y0.i iVar = new Y0.i();
                int length2 = iArr.length;
                int i2 = 0;
                while (i < length2) {
                    int i3 = i2 + 1;
                    if (set.contains(Integer.valueOf(iArr[i]))) {
                        iVar.add(this.f2118c[i2]);
                    }
                    i++;
                    i2 = i3;
                }
                collection = H1.d.i(iVar);
            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                collection = this.f2119d;
            }
        }
        if (collection.isEmpty()) {
            return;
        }
        ((t1.b) this.f2116a.f69c).b(W0.i.f1345a);
    }
}
