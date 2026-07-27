package f0;

import A.AbstractC0017m;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0575F extends AbstractC0577H implements Iterable, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public final String f6295d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6296e;

    /* renamed from: i, reason: collision with root package name */
    public final float f6297i;

    /* renamed from: j, reason: collision with root package name */
    public final float f6298j;

    /* renamed from: k, reason: collision with root package name */
    public final float f6299k;

    /* renamed from: l, reason: collision with root package name */
    public final float f6300l;

    /* renamed from: m, reason: collision with root package name */
    public final float f6301m;

    /* renamed from: n, reason: collision with root package name */
    public final float f6302n;

    /* renamed from: o, reason: collision with root package name */
    public final List f6303o;

    /* renamed from: p, reason: collision with root package name */
    public final List f6304p;

    public C0575F(String str, float f4, float f5, float f6, float f7, float f8, float f9, float f10, List list, List list2) {
        this.f6295d = str;
        this.f6296e = f4;
        this.f6297i = f5;
        this.f6298j = f6;
        this.f6299k = f7;
        this.f6300l = f8;
        this.f6301m = f9;
        this.f6302n = f10;
        this.f6303o = list;
        this.f6304p = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0575F)) {
            C0575F c0575f = (C0575F) obj;
            return Intrinsics.a(this.f6295d, c0575f.f6295d) && this.f6296e == c0575f.f6296e && this.f6297i == c0575f.f6297i && this.f6298j == c0575f.f6298j && this.f6299k == c0575f.f6299k && this.f6300l == c0575f.f6300l && this.f6301m == c0575f.f6301m && this.f6302n == c0575f.f6302n && Intrinsics.a(this.f6303o, c0575f.f6303o) && Intrinsics.a(this.f6304p, c0575f.f6304p);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6304p.hashCode() + ((this.f6303o.hashCode() + AbstractC0017m.a(this.f6302n, AbstractC0017m.a(this.f6301m, AbstractC0017m.a(this.f6300l, AbstractC0017m.a(this.f6299k, AbstractC0017m.a(this.f6298j, AbstractC0017m.a(this.f6297i, AbstractC0017m.a(this.f6296e, this.f6295d.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new L.h(this);
    }
}
