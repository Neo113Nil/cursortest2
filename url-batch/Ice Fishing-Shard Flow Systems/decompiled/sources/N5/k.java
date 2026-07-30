package N5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import v5.C0977c;
import v5.C0978d;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public final C0978d f1864b;

    /* renamed from: c, reason: collision with root package name */
    public final c f1865c;

    /* renamed from: d, reason: collision with root package name */
    public final M5.a f1866d;

    /* renamed from: e, reason: collision with root package name */
    public final Supplier f1867e;

    /* renamed from: f, reason: collision with root package name */
    public final O5.d f1868f;

    /* renamed from: g, reason: collision with root package name */
    public final j f1869g;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1863a = new Object();

    /* renamed from: h, reason: collision with root package name */
    public volatile C0977c f1870h = null;

    public k(C0978d c0978d, c cVar, M5.a aVar, Supplier supplier, O5.d dVar, List list) {
        this.f1864b = c0978d;
        this.f1865c = cVar;
        this.f1866d = aVar;
        this.f1867e = supplier;
        this.f1868f = dVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((j) it.next());
        }
        this.f1869g = arrayList.isEmpty() ? e.f1847d : arrayList.size() == 1 ? (j) arrayList.get(0) : new d(new ArrayList(arrayList));
    }
}
