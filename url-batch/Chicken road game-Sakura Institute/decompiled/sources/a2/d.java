package a2;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d implements Appendable {

    /* renamed from: f, reason: collision with root package name */
    public final StringBuilder f343f = new StringBuilder(16);

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f344g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f345h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f346i = new ArrayList();

    public d(g gVar) {
        new ArrayList();
        b(gVar);
    }

    public final void a(d0 d0Var, int i7, int i8) {
        this.f344g.add(new c(i7, i8, d0Var));
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof g) {
            b((g) charSequence);
            return this;
        }
        this.f343f.append(charSequence);
        return this;
    }

    public final void b(g gVar) {
        StringBuilder sb = this.f343f;
        int length = sb.length();
        sb.append(gVar.f373f);
        List list = gVar.f374g;
        if (list != null) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                e eVar = (e) list.get(i7);
                a((d0) eVar.f363a, eVar.f364b + length, eVar.f365c + length);
            }
        }
        List list2 = gVar.f375h;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                e eVar2 = (e) list2.get(i8);
                this.f345h.add(new c(eVar2.f364b + length, eVar2.f365c + length, (u) eVar2.f363a));
            }
        }
        List list3 = gVar.f376i;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i9 = 0; i9 < size3; i9++) {
                e eVar3 = (e) list3.get(i9);
                this.f346i.add(new c(eVar3.f363a, eVar3.f364b + length, eVar3.f365c + length, eVar3.f366d));
            }
        }
    }

    public final g c() {
        StringBuilder sb = this.f343f;
        String sb2 = sb.toString();
        ArrayList arrayList = this.f344g;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList2.add(((c) arrayList.get(i7)).a(sb.length()));
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        ArrayList arrayList3 = this.f345h;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        for (int i8 = 0; i8 < size2; i8++) {
            arrayList4.add(((c) arrayList3.get(i8)).a(sb.length()));
        }
        if (arrayList4.isEmpty()) {
            arrayList4 = null;
        }
        ArrayList arrayList5 = this.f346i;
        ArrayList arrayList6 = new ArrayList(arrayList5.size());
        int size3 = arrayList5.size();
        for (int i9 = 0; i9 < size3; i9++) {
            arrayList6.add(((c) arrayList5.get(i9)).a(sb.length()));
        }
        return new g(sb2, arrayList2, arrayList4, arrayList6.isEmpty() ? null : arrayList6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList] */
    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i7, int i8) {
        ?? r42;
        ?? r13;
        boolean z8 = charSequence instanceof g;
        StringBuilder sb = this.f343f;
        if (z8) {
            g gVar = (g) charSequence;
            int length = sb.length();
            String str = gVar.f373f;
            sb.append((CharSequence) str, i7, i8);
            List b9 = h.b(gVar, i7, i8);
            if (b9 != null) {
                int size = b9.size();
                for (int i9 = 0; i9 < size; i9++) {
                    e eVar = (e) b9.get(i9);
                    a((d0) eVar.f363a, eVar.f364b + length, eVar.f365c + length);
                }
            }
            List list = null;
            if (i7 == i8 || (r42 = gVar.f375h) == 0) {
                r42 = 0;
            } else if (i7 != 0 || i8 < str.length()) {
                ArrayList arrayList = new ArrayList(r42.size());
                int size2 = r42.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    Object obj = r42.get(i10);
                    e eVar2 = (e) obj;
                    if (h.c(i7, i8, eVar2.f364b, eVar2.f365c)) {
                        arrayList.add(obj);
                    }
                }
                r42 = new ArrayList(arrayList.size());
                int size3 = arrayList.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    e eVar3 = (e) arrayList.get(i11);
                    r42.add(new e(v1.g.e(eVar3.f364b, i7, i8) - i7, v1.g.e(eVar3.f365c, i7, i8) - i7, eVar3.f363a));
                }
            }
            if (r42 != 0) {
                int size4 = r42.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    e eVar4 = (e) r42.get(i12);
                    this.f345h.add(new c(eVar4.f364b + length, eVar4.f365c + length, (u) eVar4.f363a));
                }
            }
            if (i7 != i8 && (r13 = gVar.f376i) != 0) {
                if (i7 != 0 || i8 < str.length()) {
                    ArrayList arrayList2 = new ArrayList(r13.size());
                    int size5 = r13.size();
                    for (int i13 = 0; i13 < size5; i13++) {
                        Object obj2 = r13.get(i13);
                        e eVar5 = (e) obj2;
                        if (h.c(i7, i8, eVar5.f364b, eVar5.f365c)) {
                            arrayList2.add(obj2);
                        }
                    }
                    r13 = new ArrayList(arrayList2.size());
                    int size6 = arrayList2.size();
                    for (int i14 = 0; i14 < size6; i14++) {
                        e eVar6 = (e) arrayList2.get(i14);
                        r13.add(new e(eVar6.f363a, v1.g.e(eVar6.f364b, i7, i8) - i7, v1.g.e(eVar6.f365c, i7, i8) - i7, eVar6.f366d));
                    }
                }
                list = r13;
            }
            if (list != null) {
                int size7 = list.size();
                for (int i15 = 0; i15 < size7; i15++) {
                    e eVar7 = (e) list.get(i15);
                    this.f346i.add(new c(eVar7.f363a, eVar7.f364b + length, eVar7.f365c + length, eVar7.f366d));
                }
            }
            return this;
        }
        sb.append(charSequence, i7, i8);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c4) {
        this.f343f.append(c4);
        return this;
    }
}
