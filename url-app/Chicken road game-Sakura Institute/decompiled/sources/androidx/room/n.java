package androidx.room;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final c f1097a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f1098b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f1099c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f1100d;

    public n(c cVar, int[] iArr, String[] strArr) {
        Set singleton;
        this.f1097a = cVar;
        this.f1098b = iArr;
        this.f1099c = strArr;
        if (strArr.length == 0) {
            singleton = e6.w.f2828f;
        } else {
            singleton = Collections.singleton(strArr[0]);
            r6.k.e(singleton, "singleton(...)");
        }
        this.f1100d = singleton;
        if (iArr.length != strArr.length) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final void a(Set set) {
        r6.k.f(set, "invalidatedTablesIds");
        int[] iArr = this.f1098b;
        int length = iArr.length;
        Collection collection = e6.w.f2828f;
        if (length != 0) {
            int i7 = 0;
            if (length != 1) {
                f6.j jVar = new f6.j();
                int length2 = iArr.length;
                int i8 = 0;
                while (i7 < length2) {
                    int i9 = i8 + 1;
                    if (set.contains(Integer.valueOf(iArr[i7]))) {
                        jVar.add(this.f1099c[i8]);
                    }
                    i7++;
                    i8 = i9;
                }
                collection = a8.m.k(jVar);
            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                collection = this.f1100d;
            }
        }
        if (collection.isEmpty()) {
            return;
        }
        ((e7.e) this.f1097a.f1070h).e(d6.z.f2639a);
    }
}
