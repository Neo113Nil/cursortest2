package androidx.coordinatorlayout.widget;

import A.e;
import A.f;
import androidx.collection.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final e f11572a = new f(10);

    /* renamed from: b, reason: collision with root package name */
    private final g f11573b = new g();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f11574c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f11575d = new HashSet();

    private void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f11573b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                e(arrayList2.get(i4), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    private ArrayList f() {
        ArrayList arrayList = (ArrayList) this.f11572a.b();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    private void k(ArrayList arrayList) {
        arrayList.clear();
        this.f11572a.a(arrayList);
    }

    public void a(Object obj, Object obj2) {
        if (!this.f11573b.containsKey(obj) || !this.f11573b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) this.f11573b.get(obj);
        if (arrayList == null) {
            arrayList = f();
            this.f11573b.put(obj, arrayList);
        }
        arrayList.add(obj2);
    }

    public void b(Object obj) {
        if (this.f11573b.containsKey(obj)) {
            return;
        }
        this.f11573b.put(obj, null);
    }

    public void c() {
        int size = this.f11573b.size();
        for (int i4 = 0; i4 < size; i4++) {
            ArrayList arrayList = (ArrayList) this.f11573b.q(i4);
            if (arrayList != null) {
                k(arrayList);
            }
        }
        this.f11573b.clear();
    }

    public boolean d(Object obj) {
        return this.f11573b.containsKey(obj);
    }

    public List g(Object obj) {
        return (List) this.f11573b.get(obj);
    }

    public List h(Object obj) {
        int size = this.f11573b.size();
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < size; i4++) {
            ArrayList arrayList2 = (ArrayList) this.f11573b.q(i4);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f11573b.m(i4));
            }
        }
        return arrayList;
    }

    public ArrayList i() {
        this.f11574c.clear();
        this.f11575d.clear();
        int size = this.f11573b.size();
        for (int i4 = 0; i4 < size; i4++) {
            e(this.f11573b.m(i4), this.f11574c, this.f11575d);
        }
        return this.f11574c;
    }

    public boolean j(Object obj) {
        int size = this.f11573b.size();
        for (int i4 = 0; i4 < size; i4++) {
            ArrayList arrayList = (ArrayList) this.f11573b.q(i4);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
