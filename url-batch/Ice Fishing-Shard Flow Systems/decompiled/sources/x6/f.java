package x6;

import D6.o;
import G0.l;
import P.V;
import R5.q;
import j6.C0588e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.A;
import kotlin.collections.CollectionsKt;
import kotlin.collections.D;
import kotlin.collections.E;
import kotlin.collections.I;
import kotlin.collections.IndexedValue;
import kotlin.collections.s;
import kotlin.jvm.internal.Intrinsics;
import z6.J;

/* loaded from: classes.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f8429a;

    /* renamed from: b, reason: collision with root package name */
    public final V6.b f8430b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8431c;

    /* renamed from: d, reason: collision with root package name */
    public final A f8432d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f8433e;

    /* renamed from: f, reason: collision with root package name */
    public final e[] f8434f;

    /* renamed from: g, reason: collision with root package name */
    public final List[] f8435g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f8436h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f8437i;
    public final e[] j;

    /* renamed from: k, reason: collision with root package name */
    public final q f8438k;

    public f(String serialName, V6.b kind, int i2, List typeParameters, a builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f8429a = serialName;
        this.f8430b = kind;
        this.f8431c = i2;
        this.f8432d = builder.f8414b;
        ArrayList arrayList = builder.f8415c;
        CollectionsKt.y(arrayList);
        int i5 = 0;
        this.f8433e = (String[]) arrayList.toArray(new String[0]);
        this.f8434f = J.b(builder.f8417e);
        this.f8435g = (List[]) builder.f8418f.toArray(new List[0]);
        ArrayList arrayList2 = builder.f8419g;
        Intrinsics.checkNotNullParameter(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            zArr[i5] = ((Boolean) obj).booleanValue();
            i5++;
        }
        this.f8436h = zArr;
        String[] strArr = this.f8433e;
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        D d7 = new D(new o(5, strArr));
        ArrayList arrayList3 = new ArrayList(s.g(d7, 10));
        Iterator it = d7.iterator();
        while (true) {
            E e7 = (E) it;
            if (!e7.f6121e.hasNext()) {
                this.f8437i = I.h(arrayList3);
                this.j = J.b(typeParameters);
                this.f8438k = R5.i.b(new V(6, this));
                return;
            }
            IndexedValue indexedValue = (IndexedValue) e7.next();
            arrayList3.add(new Pair(indexedValue.f6124b, Integer.valueOf(indexedValue.f6123a)));
        }
    }

    @Override // x6.e
    public final int a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = (Integer) this.f8437i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // x6.e
    public final String b() {
        return this.f8429a;
    }

    @Override // x6.e
    public final V6.b c() {
        return this.f8430b;
    }

    @Override // x6.e
    public final int d() {
        return this.f8431c;
    }

    @Override // x6.e
    public final String e(int i2) {
        return this.f8433e[i2];
    }

    public final boolean equals(Object obj) {
        int i2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            e eVar = (e) obj;
            if (this.f8429a.equals(eVar.b()) && Arrays.equals(this.j, ((f) obj).j)) {
                int d7 = eVar.d();
                int i5 = this.f8431c;
                if (i5 == d7) {
                    for (0; i2 < i5; i2 + 1) {
                        e[] eVarArr = this.f8434f;
                        i2 = (Intrinsics.a(eVarArr[i2].b(), eVar.i(i2).b()) && Intrinsics.a(eVarArr[i2].c(), eVar.i(i2).c())) ? i2 + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // x6.e
    public final boolean f() {
        return false;
    }

    @Override // x6.e
    public final List getAnnotations() {
        return this.f8432d;
    }

    @Override // x6.e
    public final List h(int i2) {
        return this.f8435g[i2];
    }

    public final int hashCode() {
        return ((Number) this.f8438k.getValue()).intValue();
    }

    @Override // x6.e
    public final e i(int i2) {
        return this.f8434f[i2];
    }

    @Override // x6.e
    public final boolean j(int i2) {
        return this.f8436h[i2];
    }

    public final String toString() {
        return CollectionsKt.s(C0588e.c(0, this.f8431c), ", ", this.f8429a.concat("("), ")", new l(3, this), 24);
    }

    @Override // x6.e
    public final void g() {
    }
}
