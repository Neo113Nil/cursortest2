package C0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: C0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028d implements Appendable {

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f588a = new StringBuilder(16);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f589b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f590c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f591d = new ArrayList();

    public C0028d(C0031g c0031g) {
        new ArrayList();
        b(c0031g);
    }

    public final void a(D d3, int i3, int i4) {
        this.f589b.add(new C0027c(i3, i4, d3));
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C0031g) {
            b((C0031g) charSequence);
        } else {
            this.f588a.append(charSequence);
        }
        return this;
    }

    public final void b(C0031g c0031g) {
        StringBuilder sb = this.f588a;
        int length = sb.length();
        sb.append(c0031g.f596a);
        List list = c0031g.f597b;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0029e c0029e = (C0029e) list.get(i3);
                a((D) c0029e.f592a, c0029e.f593b + length, c0029e.f594c + length);
            }
        }
        List list2 = c0031g.f598c;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                C0029e c0029e2 = (C0029e) list2.get(i4);
                this.f590c.add(new C0027c(c0029e2.f593b + length, c0029e2.f594c + length, (u) c0029e2.f592a));
            }
        }
        List list3 = c0031g.f599d;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                C0029e c0029e3 = (C0029e) list3.get(i5);
                this.f591d.add(new C0027c(c0029e3.f593b + length, c0029e3.f594c + length, c0029e3.f592a, c0029e3.f595d));
            }
        }
    }

    public final C0031g c() {
        StringBuilder sb = this.f588a;
        String sb2 = sb.toString();
        ArrayList arrayList = this.f589b;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(((C0027c) arrayList.get(i3)).a(sb.length()));
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        ArrayList arrayList3 = this.f590c;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        for (int i4 = 0; i4 < size2; i4++) {
            arrayList4.add(((C0027c) arrayList3.get(i4)).a(sb.length()));
        }
        if (arrayList4.isEmpty()) {
            arrayList4 = null;
        }
        ArrayList arrayList5 = this.f591d;
        ArrayList arrayList6 = new ArrayList(arrayList5.size());
        int size3 = arrayList5.size();
        for (int i5 = 0; i5 < size3; i5++) {
            arrayList6.add(((C0027c) arrayList5.get(i5)).a(sb.length()));
        }
        return new C0031g(sb2, arrayList2, arrayList4, arrayList6.isEmpty() ? null : arrayList6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i3, int i4) {
        ?? r4;
        ?? r13;
        boolean z3 = charSequence instanceof C0031g;
        StringBuilder sb = this.f588a;
        if (z3) {
            C0031g c0031g = (C0031g) charSequence;
            int length = sb.length();
            sb.append((CharSequence) c0031g.f596a, i3, i4);
            List b3 = AbstractC0032h.b(c0031g, i3, i4);
            if (b3 != null) {
                int size = b3.size();
                for (int i5 = 0; i5 < size; i5++) {
                    C0029e c0029e = (C0029e) b3.get(i5);
                    a((D) c0029e.f592a, c0029e.f593b + length, c0029e.f594c + length);
                }
            }
            List list = null;
            String str = c0031g.f596a;
            if (i3 == i4 || (r4 = c0031g.f598c) == 0) {
                r4 = 0;
            } else if (i3 != 0 || i4 < str.length()) {
                ArrayList arrayList = new ArrayList(r4.size());
                int size2 = r4.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    Object obj = r4.get(i6);
                    C0029e c0029e2 = (C0029e) obj;
                    if (AbstractC0032h.c(i3, i4, c0029e2.f593b, c0029e2.f594c)) {
                        arrayList.add(obj);
                    }
                }
                r4 = new ArrayList(arrayList.size());
                int size3 = arrayList.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    C0029e c0029e3 = (C0029e) arrayList.get(i7);
                    r4.add(new C0029e(O2.d.y(c0029e3.f593b, i3, i4) - i3, O2.d.y(c0029e3.f594c, i3, i4) - i3, c0029e3.f592a));
                }
            }
            if (r4 != 0) {
                int size4 = r4.size();
                for (int i8 = 0; i8 < size4; i8++) {
                    C0029e c0029e4 = (C0029e) r4.get(i8);
                    this.f590c.add(new C0027c(c0029e4.f593b + length, c0029e4.f594c + length, (u) c0029e4.f592a));
                }
            }
            if (i3 != i4 && (r13 = c0031g.f599d) != 0) {
                if (i3 != 0 || i4 < str.length()) {
                    ArrayList arrayList2 = new ArrayList(r13.size());
                    int size5 = r13.size();
                    for (int i9 = 0; i9 < size5; i9++) {
                        Object obj2 = r13.get(i9);
                        C0029e c0029e5 = (C0029e) obj2;
                        if (AbstractC0032h.c(i3, i4, c0029e5.f593b, c0029e5.f594c)) {
                            arrayList2.add(obj2);
                        }
                    }
                    r13 = new ArrayList(arrayList2.size());
                    int size6 = arrayList2.size();
                    for (int i10 = 0; i10 < size6; i10++) {
                        C0029e c0029e6 = (C0029e) arrayList2.get(i10);
                        r13.add(new C0029e(O2.d.y(c0029e6.f593b, i3, i4) - i3, O2.d.y(c0029e6.f594c, i3, i4) - i3, c0029e6.f592a, c0029e6.f595d));
                    }
                }
                list = r13;
            }
            if (list != null) {
                int size7 = list.size();
                for (int i11 = 0; i11 < size7; i11++) {
                    C0029e c0029e7 = (C0029e) list.get(i11);
                    this.f591d.add(new C0027c(c0029e7.f593b + length, c0029e7.f594c + length, c0029e7.f592a, c0029e7.f595d));
                }
            }
        } else {
            sb.append(charSequence, i3, i4);
        }
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c2) {
        this.f588a.append(c2);
        return this;
    }
}
