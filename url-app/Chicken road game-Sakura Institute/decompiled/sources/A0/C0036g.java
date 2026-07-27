package A0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import z2.C1403G;
import z2.C1405I;

/* renamed from: A0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036g implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    public final String f328a;

    /* renamed from: b, reason: collision with root package name */
    public final List f329b;

    /* renamed from: c, reason: collision with root package name */
    public final List f330c;

    /* renamed from: d, reason: collision with root package name */
    public final List f331d;

    static {
        y.t tVar = C.f236a;
    }

    public C0036g(String str, List list, List list2, List list3) {
        List D3;
        this.f328a = str;
        this.f329b = list;
        this.f330c = list2;
        this.f331d = list3;
        if (list2 == null || (D3 = C1403G.D(list2, new C0035f())) == null) {
            return;
        }
        int size = D3.size();
        int i2 = -1;
        int i4 = 0;
        while (i4 < size) {
            C0034e c0034e = (C0034e) D3.get(i4);
            if (c0034e.f325b < i2) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap");
            }
            int length = this.f328a.length();
            int i5 = c0034e.f326c;
            if (i5 > length) {
                throw new IllegalArgumentException(("ParagraphStyle range [" + c0034e.f325b + ", " + i5 + ") is out of boundary").toString());
            }
            i4++;
            i2 = i5;
        }
    }

    public final List a() {
        List list = this.f329b;
        return list == null ? C1405I.f11931d : list;
    }

    @Override // java.lang.CharSequence
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0036g subSequence(int i2, int i4) {
        if (i2 > i4) {
            throw new IllegalArgumentException(("start (" + i2 + ") should be less or equal to end (" + i4 + ')').toString());
        }
        String str = this.f328a;
        if (i2 == 0 && i4 == str.length()) {
            return this;
        }
        String substring = str.substring(i2, i4);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new C0036g(substring, AbstractC0037h.a(this.f329b, i2, i4), AbstractC0037h.a(this.f330c, i2, i4), AbstractC0037h.a(this.f331d, i2, i4));
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.f328a.charAt(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0036g)) {
            return false;
        }
        C0036g c0036g = (C0036g) obj;
        return Intrinsics.a(this.f328a, c0036g.f328a) && Intrinsics.a(this.f329b, c0036g.f329b) && Intrinsics.a(this.f330c, c0036g.f330c) && Intrinsics.a(this.f331d, c0036g.f331d);
    }

    public final int hashCode() {
        int hashCode = this.f328a.hashCode() * 31;
        List list = this.f329b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.f330c;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List list3 = this.f331d;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f328a.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f328a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0036g(String str, ArrayList arrayList, int i2) {
        this(str, r4, null, null);
        List list = (i2 & 2) != 0 ? C1405I.f11931d : arrayList;
        C1405I c1405i = C1405I.f11931d;
        List list2 = list.isEmpty() ? null : list;
        c1405i.getClass();
    }
}
