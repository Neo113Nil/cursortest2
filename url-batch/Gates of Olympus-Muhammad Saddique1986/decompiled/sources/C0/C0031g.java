package C0;

import java.util.ArrayList;
import java.util.List;
import z.C1256t;

/* renamed from: C0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031g implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    public final String f596a;

    /* renamed from: b, reason: collision with root package name */
    public final List f597b;

    /* renamed from: c, reason: collision with root package name */
    public final List f598c;

    /* renamed from: d, reason: collision with root package name */
    public final List f599d;

    static {
        C1256t c1256t = C.f505a;
    }

    public C0031g(String str, List list, List list2, List list3) {
        this.f596a = str;
        this.f597b = list;
        this.f598c = list2;
        this.f599d = list3;
        if (list2 != null) {
            List W02 = S1.l.W0(list2, new C0030f());
            int size = W02.size();
            int i3 = -1;
            int i4 = 0;
            while (i4 < size) {
                C0029e c0029e = (C0029e) W02.get(i4);
                if (c0029e.f593b < i3) {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap");
                }
                int length = this.f596a.length();
                int i5 = c0029e.f594c;
                if (i5 > length) {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + c0029e.f593b + ", " + i5 + ") is out of boundary").toString());
                }
                i4++;
                i3 = i5;
            }
        }
    }

    public final List a() {
        List list = this.f597b;
        return list == null ? S1.u.f4320d : list;
    }

    @Override // java.lang.CharSequence
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0031g subSequence(int i3, int i4) {
        if (i3 > i4) {
            throw new IllegalArgumentException(("start (" + i3 + ") should be less or equal to end (" + i4 + ')').toString());
        }
        String str = this.f596a;
        if (i3 == 0 && i4 == str.length()) {
            return this;
        }
        String substring = str.substring(i3, i4);
        f2.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new C0031g(substring, AbstractC0032h.a(this.f597b, i3, i4), AbstractC0032h.a(this.f598c, i3, i4), AbstractC0032h.a(this.f599d, i3, i4));
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i3) {
        return this.f596a.charAt(i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0031g)) {
            return false;
        }
        C0031g c0031g = (C0031g) obj;
        return f2.j.a(this.f596a, c0031g.f596a) && f2.j.a(this.f597b, c0031g.f597b) && f2.j.a(this.f598c, c0031g.f598c) && f2.j.a(this.f599d, c0031g.f599d);
    }

    public final int hashCode() {
        int hashCode = this.f596a.hashCode() * 31;
        List list = this.f597b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.f598c;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List list3 = this.f599d;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f596a.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f596a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [S1.u] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0031g(String str, ArrayList arrayList, int i3) {
        this(str, arrayList.isEmpty() ? null : arrayList, null, null);
        arrayList = (i3 & 2) != 0 ? S1.u.f4320d : arrayList;
    }
}
