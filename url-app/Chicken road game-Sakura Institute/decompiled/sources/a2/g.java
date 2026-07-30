package a2;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g implements CharSequence {

    /* renamed from: f, reason: collision with root package name */
    public final String f373f;

    /* renamed from: g, reason: collision with root package name */
    public final List f374g;

    /* renamed from: h, reason: collision with root package name */
    public final List f375h;

    /* renamed from: i, reason: collision with root package name */
    public final List f376i;

    static {
        androidx.room.c cVar = c0.f323a;
    }

    public g(String str, List list, List list2, List list3) {
        this.f373f = str;
        this.f374g = list;
        this.f375h = list2;
        this.f376i = list3;
        if (list2 != null) {
            List t02 = e6.l.t0(list2, new f());
            int size = t02.size();
            int i7 = -1;
            int i8 = 0;
            while (i8 < size) {
                e eVar = (e) t02.get(i8);
                int i9 = eVar.f364b;
                int i10 = eVar.f365c;
                if (i9 < i7) {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap");
                }
                if (i10 > this.f373f.length()) {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + eVar.f364b + ", " + i10 + ") is out of boundary").toString());
                }
                i8++;
                i7 = i10;
            }
        }
    }

    public final List a() {
        List list = this.f374g;
        return list == null ? e6.u.f2826f : list;
    }

    @Override // java.lang.CharSequence
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final g subSequence(int i7, int i8) {
        if (i7 > i8) {
            throw new IllegalArgumentException(("start (" + i7 + ") should be less or equal to end (" + i8 + ')').toString());
        }
        String str = this.f373f;
        if (i7 == 0 && i8 == str.length()) {
            return this;
        }
        String substring = str.substring(i7, i8);
        r6.k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new g(substring, h.a(this.f374g, i7, i8), h.a(this.f375h, i7, i8), h.a(this.f376i, i7, i8));
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i7) {
        return this.f373f.charAt(i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return r6.k.a(this.f373f, gVar.f373f) && r6.k.a(this.f374g, gVar.f374g) && r6.k.a(this.f375h, gVar.f375h) && r6.k.a(this.f376i, gVar.f376i);
    }

    public final int hashCode() {
        int hashCode = this.f373f.hashCode() * 31;
        List list = this.f374g;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.f375h;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List list3 = this.f376i;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f373f.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f373f;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(String str, ArrayList arrayList, int i7) {
        this(str, r3.isEmpty() ? null : r3, null, null);
        List list = (i7 & 2) != 0 ? e6.u.f2826f : arrayList;
    }
}
