package h0;

import g2.InterfaceC0439a;
import java.util.Iterator;
import java.util.List;

/* renamed from: h0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0453F extends AbstractC0455H implements Iterable, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public final String f5871d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5872e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5873f;

    /* renamed from: g, reason: collision with root package name */
    public final float f5874g;

    /* renamed from: h, reason: collision with root package name */
    public final float f5875h;

    /* renamed from: i, reason: collision with root package name */
    public final float f5876i;

    /* renamed from: j, reason: collision with root package name */
    public final float f5877j;

    /* renamed from: k, reason: collision with root package name */
    public final float f5878k;

    /* renamed from: l, reason: collision with root package name */
    public final List f5879l;

    /* renamed from: m, reason: collision with root package name */
    public final List f5880m;

    public C0453F(String str, float f3, float f4, float f5, float f6, float f7, float f8, float f9, List list, List list2) {
        this.f5871d = str;
        this.f5872e = f3;
        this.f5873f = f4;
        this.f5874g = f5;
        this.f5875h = f6;
        this.f5876i = f7;
        this.f5877j = f8;
        this.f5878k = f9;
        this.f5879l = list;
        this.f5880m = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0453F)) {
            C0453F c0453f = (C0453F) obj;
            return f2.j.a(this.f5871d, c0453f.f5871d) && this.f5872e == c0453f.f5872e && this.f5873f == c0453f.f5873f && this.f5874g == c0453f.f5874g && this.f5875h == c0453f.f5875h && this.f5876i == c0453f.f5876i && this.f5877j == c0453f.f5877j && this.f5878k == c0453f.f5878k && f2.j.a(this.f5879l, c0453f.f5879l) && f2.j.a(this.f5880m, c0453f.f5880m);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5880m.hashCode() + ((this.f5879l.hashCode() + A.k.a(this.f5878k, A.k.a(this.f5877j, A.k.a(this.f5876i, A.k.a(this.f5875h, A.k.a(this.f5874g, A.k.a(this.f5873f, A.k.a(this.f5872e, this.f5871d.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new N.g(this);
    }
}
