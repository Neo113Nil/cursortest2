package h0;

import H2.AbstractC0080b;
import a2.InterfaceC0184a;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class F extends H implements Iterable, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public final String f4883d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4884e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4885f;

    /* renamed from: g, reason: collision with root package name */
    public final float f4886g;

    /* renamed from: h, reason: collision with root package name */
    public final float f4887h;

    /* renamed from: i, reason: collision with root package name */
    public final float f4888i;

    /* renamed from: j, reason: collision with root package name */
    public final float f4889j;

    /* renamed from: k, reason: collision with root package name */
    public final float f4890k;

    /* renamed from: l, reason: collision with root package name */
    public final List f4891l;

    /* renamed from: m, reason: collision with root package name */
    public final List f4892m;

    public F(String str, float f3, float f4, float f5, float f6, float f7, float f8, float f9, List list, List list2) {
        this.f4883d = str;
        this.f4884e = f3;
        this.f4885f = f4;
        this.f4886g = f5;
        this.f4887h = f6;
        this.f4888i = f7;
        this.f4889j = f8;
        this.f4890k = f9;
        this.f4891l = list;
        this.f4892m = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof F)) {
            F f3 = (F) obj;
            return Z1.i.a(this.f4883d, f3.f4883d) && this.f4884e == f3.f4884e && this.f4885f == f3.f4885f && this.f4886g == f3.f4886g && this.f4887h == f3.f4887h && this.f4888i == f3.f4888i && this.f4889j == f3.f4889j && this.f4890k == f3.f4890k && Z1.i.a(this.f4891l, f3.f4891l) && Z1.i.a(this.f4892m, f3.f4892m);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4892m.hashCode() + ((this.f4891l.hashCode() + AbstractC0080b.a(this.f4890k, AbstractC0080b.a(this.f4889j, AbstractC0080b.a(this.f4888i, AbstractC0080b.a(this.f4887h, AbstractC0080b.a(this.f4886g, AbstractC0080b.a(this.f4885f, AbstractC0080b.a(this.f4884e, this.f4883d.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new N.g(this);
    }
}
