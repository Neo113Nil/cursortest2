package re;

import de.m;
import hd.q;
import hd.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.p0;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import te.b1;
import te.k;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f implements e, k {

    /* renamed from: a, reason: collision with root package name */
    public final String f8246a;

    /* renamed from: b, reason: collision with root package name */
    public final i7.a f8247b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8248c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f8249d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f8250e;

    /* renamed from: f, reason: collision with root package name */
    public final e[] f8251f;
    public final boolean[] g;

    /* renamed from: h, reason: collision with root package name */
    public final e[] f8252h;

    /* renamed from: i, reason: collision with root package name */
    public final q f8253i;

    public f(String str, i7.a aVar, int i3, List list, a aVar2) {
        list.getClass();
        this.f8246a = str;
        this.f8247b = aVar;
        this.f8248c = i3;
        ArrayList arrayList = aVar2.f8230b;
        this.f8249d = CollectionsKt.O(arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f8250e = strArr;
        this.f8251f = b1.c(aVar2.f8232d);
        this.g = CollectionsKt.N(aVar2.f8234f);
        strArr.getClass();
        m mVar = new m(1, new a1.b(15, strArr));
        ArrayList arrayList2 = new ArrayList(z.j(mVar, 10));
        Iterator it = mVar.iterator();
        while (true) {
            u uVar = (u) it;
            if (!((Iterator) uVar.f4527i).hasNext()) {
                p0.g(arrayList2);
                this.f8252h = b1.c(list);
                this.f8253i = hd.h.b(new a1.b(22, this));
                return;
            }
            IndexedValue indexedValue = (IndexedValue) uVar.next();
            arrayList2.add(new Pair(indexedValue.f5556b, Integer.valueOf(indexedValue.f5555a)));
        }
    }

    @Override // re.e
    public final String a() {
        return this.f8246a;
    }

    @Override // re.e
    public final i7.a b() {
        return this.f8247b;
    }

    @Override // re.e
    public final int c() {
        return this.f8248c;
    }

    @Override // re.e
    public final String d(int i3) {
        return this.f8250e[i3];
    }

    public final boolean equals(Object obj) {
        int i3;
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            e eVar = (e) obj;
            if (this.f8246a.equals(eVar.a()) && Arrays.equals(this.f8252h, ((f) obj).f8252h)) {
                int c10 = eVar.c();
                int i10 = this.f8248c;
                if (i10 == c10) {
                    for (0; i3 < i10; i3 + 1) {
                        e[] eVarArr = this.f8251f;
                        i3 = (Intrinsics.a(eVarArr[i3].a(), eVar.h(i3).a()) && Intrinsics.a(eVarArr[i3].b(), eVar.h(i3).b())) ? i3 + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // te.k
    public final Set f() {
        return this.f8249d;
    }

    @Override // re.e
    public final e h(int i3) {
        return this.f8251f[i3];
    }

    public final int hashCode() {
        return ((Number) this.f8253i.getValue()).intValue();
    }

    @Override // re.e
    public final boolean i(int i3) {
        return this.g[i3];
    }

    public final String toString() {
        return b1.j(this);
    }
}
