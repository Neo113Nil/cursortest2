package A0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: A0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033d implements Appendable {

    /* renamed from: d, reason: collision with root package name */
    public final StringBuilder f320d = new StringBuilder(16);

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f321e = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f322i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f323j = new ArrayList();

    public C0033d(C0036g c0036g) {
        new ArrayList();
        b(c0036g);
    }

    public final void a(D d4, int i2, int i4) {
        this.f321e.add(new C0032c(i2, i4, d4));
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof C0036g) {
            b((C0036g) charSequence);
        } else {
            this.f320d.append(charSequence);
        }
        return this;
    }

    public final void b(C0036g c0036g) {
        StringBuilder sb = this.f320d;
        int length = sb.length();
        sb.append(c0036g.f328a);
        List list = c0036g.f329b;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0034e c0034e = (C0034e) list.get(i2);
                a((D) c0034e.f324a, c0034e.f325b + length, c0034e.f326c + length);
            }
        }
        List list2 = c0036g.f330c;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                C0034e c0034e2 = (C0034e) list2.get(i4);
                this.f322i.add(new C0032c(c0034e2.f325b + length, c0034e2.f326c + length, (u) c0034e2.f324a));
            }
        }
        List list3 = c0036g.f331d;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                C0034e c0034e3 = (C0034e) list3.get(i5);
                this.f323j.add(new C0032c(c0034e3.f324a, c0034e3.f325b + length, c0034e3.f326c + length, c0034e3.f327d));
            }
        }
    }

    public final C0036g c() {
        StringBuilder sb = this.f320d;
        String sb2 = sb.toString();
        ArrayList arrayList = this.f321e;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(((C0032c) arrayList.get(i2)).a(sb.length()));
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        ArrayList arrayList3 = this.f322i;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        for (int i4 = 0; i4 < size2; i4++) {
            arrayList4.add(((C0032c) arrayList3.get(i4)).a(sb.length()));
        }
        if (arrayList4.isEmpty()) {
            arrayList4 = null;
        }
        ArrayList arrayList5 = this.f323j;
        ArrayList arrayList6 = new ArrayList(arrayList5.size());
        int size3 = arrayList5.size();
        for (int i5 = 0; i5 < size3; i5++) {
            arrayList6.add(((C0032c) arrayList5.get(i5)).a(sb.length()));
        }
        return new C0036g(sb2, arrayList2, arrayList4, arrayList6.isEmpty() ? null : arrayList6);
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
    public final Appendable append(CharSequence charSequence, int i2, int i4) {
        ?? r4;
        ?? r13;
        boolean z4 = charSequence instanceof C0036g;
        StringBuilder sb = this.f320d;
        if (z4) {
            C0036g c0036g = (C0036g) charSequence;
            int length = sb.length();
            sb.append((CharSequence) c0036g.f328a, i2, i4);
            List b4 = AbstractC0037h.b(c0036g, i2, i4);
            if (b4 != null) {
                int size = b4.size();
                for (int i5 = 0; i5 < size; i5++) {
                    C0034e c0034e = (C0034e) b4.get(i5);
                    a((D) c0034e.f324a, c0034e.f325b + length, c0034e.f326c + length);
                }
            }
            List list = null;
            String str = c0036g.f328a;
            if (i2 == i4 || (r4 = c0036g.f330c) == 0) {
                r4 = 0;
            } else if (i2 != 0 || i4 < str.length()) {
                ArrayList arrayList = new ArrayList(r4.size());
                int size2 = r4.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    Object obj = r4.get(i6);
                    C0034e c0034e2 = (C0034e) obj;
                    if (AbstractC0037h.c(i2, i4, c0034e2.f325b, c0034e2.f326c)) {
                        arrayList.add(obj);
                    }
                }
                r4 = new ArrayList(arrayList.size());
                int size3 = arrayList.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    C0034e c0034e3 = (C0034e) arrayList.get(i7);
                    r4.add(new C0034e(kotlin.ranges.b.e(c0034e3.f325b, i2, i4) - i2, kotlin.ranges.b.e(c0034e3.f326c, i2, i4) - i2, c0034e3.f324a));
                }
            }
            if (r4 != 0) {
                int size4 = r4.size();
                for (int i8 = 0; i8 < size4; i8++) {
                    C0034e c0034e4 = (C0034e) r4.get(i8);
                    this.f322i.add(new C0032c(c0034e4.f325b + length, c0034e4.f326c + length, (u) c0034e4.f324a));
                }
            }
            if (i2 != i4 && (r13 = c0036g.f331d) != 0) {
                if (i2 != 0 || i4 < str.length()) {
                    ArrayList arrayList2 = new ArrayList(r13.size());
                    int size5 = r13.size();
                    for (int i9 = 0; i9 < size5; i9++) {
                        Object obj2 = r13.get(i9);
                        C0034e c0034e5 = (C0034e) obj2;
                        if (AbstractC0037h.c(i2, i4, c0034e5.f325b, c0034e5.f326c)) {
                            arrayList2.add(obj2);
                        }
                    }
                    r13 = new ArrayList(arrayList2.size());
                    int size6 = arrayList2.size();
                    for (int i10 = 0; i10 < size6; i10++) {
                        C0034e c0034e6 = (C0034e) arrayList2.get(i10);
                        r13.add(new C0034e(c0034e6.f324a, kotlin.ranges.b.e(c0034e6.f325b, i2, i4) - i2, kotlin.ranges.b.e(c0034e6.f326c, i2, i4) - i2, c0034e6.f327d));
                    }
                }
                list = r13;
            }
            if (list != null) {
                int size7 = list.size();
                for (int i11 = 0; i11 < size7; i11++) {
                    C0034e c0034e7 = (C0034e) list.get(i11);
                    this.f323j.add(new C0032c(c0034e7.f324a, c0034e7.f325b + length, c0034e7.f326c + length, c0034e7.f327d));
                }
            }
        } else {
            sb.append(charSequence, i2, i4);
        }
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c4) {
        this.f320d.append(c4);
        return this;
    }
}
