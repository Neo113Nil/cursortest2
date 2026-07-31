package B0;

import java.util.List;

/* renamed from: B0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0007d implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    public final String f251a;

    /* renamed from: b, reason: collision with root package name */
    public final List f252b;

    /* renamed from: c, reason: collision with root package name */
    public final List f253c;

    /* renamed from: d, reason: collision with root package name */
    public final List f254d;

    static {
        C2.c cVar = v.f346a;
    }

    public C0007d(String str, List list, List list2, List list3) {
        this.f251a = str;
        this.f252b = list;
        this.f253c = list2;
        this.f254d = list3;
        if (list2 != null) {
            List y02 = M1.l.y0(list2, new C0006c(0));
            int size = y02.size();
            int i3 = -1;
            int i4 = 0;
            while (i4 < size) {
                C0005b c0005b = (C0005b) y02.get(i4);
                if (c0005b.f247b < i3) {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap");
                }
                int length = this.f251a.length();
                int i5 = c0005b.f248c;
                if (i5 > length) {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + c0005b.f247b + ", " + i5 + ") is out of boundary").toString());
                }
                i4++;
                i3 = i5;
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i3) {
        return this.f251a.charAt(i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0007d)) {
            return false;
        }
        C0007d c0007d = (C0007d) obj;
        return Z1.i.a(this.f251a, c0007d.f251a) && Z1.i.a(this.f252b, c0007d.f252b) && Z1.i.a(this.f253c, c0007d.f253c) && Z1.i.a(this.f254d, c0007d.f254d);
    }

    public final int hashCode() {
        int hashCode = this.f251a.hashCode() * 31;
        List list = this.f252b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.f253c;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List list3 = this.f254d;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f251a.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i3, int i4) {
        if (i3 > i4) {
            throw new IllegalArgumentException(("start (" + i3 + ") should be less or equal to end (" + i4 + ')').toString());
        }
        String str = this.f251a;
        if (i3 == 0 && i4 == str.length()) {
            return this;
        }
        String substring = str.substring(i3, i4);
        Z1.i.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new C0007d(substring, AbstractC0008e.a(this.f252b, i3, i4), AbstractC0008e.a(this.f253c, i3, i4), AbstractC0008e.a(this.f254d, i3, i4));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f251a;
    }
}
