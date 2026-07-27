package f0;

import A.AbstractC0017m;
import Z.AbstractC0319p;
import Z.K;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;

/* renamed from: f0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0579J extends AbstractC0577H {

    /* renamed from: d, reason: collision with root package name */
    public final String f6313d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6314e;

    /* renamed from: i, reason: collision with root package name */
    public final int f6315i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC0319p f6316j;

    /* renamed from: k, reason: collision with root package name */
    public final float f6317k;

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC0319p f6318l;

    /* renamed from: m, reason: collision with root package name */
    public final float f6319m;

    /* renamed from: n, reason: collision with root package name */
    public final float f6320n;

    /* renamed from: o, reason: collision with root package name */
    public final int f6321o;

    /* renamed from: p, reason: collision with root package name */
    public final int f6322p;

    /* renamed from: q, reason: collision with root package name */
    public final float f6323q;

    /* renamed from: r, reason: collision with root package name */
    public final float f6324r;

    /* renamed from: s, reason: collision with root package name */
    public final float f6325s;

    /* renamed from: t, reason: collision with root package name */
    public final float f6326t;

    public C0579J(String str, List list, int i2, AbstractC0319p abstractC0319p, float f4, AbstractC0319p abstractC0319p2, float f5, float f6, int i4, int i5, float f7, float f8, float f9, float f10) {
        this.f6313d = str;
        this.f6314e = list;
        this.f6315i = i2;
        this.f6316j = abstractC0319p;
        this.f6317k = f4;
        this.f6318l = abstractC0319p2;
        this.f6319m = f5;
        this.f6320n = f6;
        this.f6321o = i4;
        this.f6322p = i5;
        this.f6323q = f7;
        this.f6324r = f8;
        this.f6325s = f9;
        this.f6326t = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0579J.class == obj.getClass()) {
            C0579J c0579j = (C0579J) obj;
            return Intrinsics.a(this.f6313d, c0579j.f6313d) && Intrinsics.a(this.f6316j, c0579j.f6316j) && this.f6317k == c0579j.f6317k && Intrinsics.a(this.f6318l, c0579j.f6318l) && this.f6319m == c0579j.f6319m && this.f6320n == c0579j.f6320n && K.r(this.f6321o, c0579j.f6321o) && K.s(this.f6322p, c0579j.f6322p) && this.f6323q == c0579j.f6323q && this.f6324r == c0579j.f6324r && this.f6325s == c0579j.f6325s && this.f6326t == c0579j.f6326t && this.f6315i == c0579j.f6315i && Intrinsics.a(this.f6314e, c0579j.f6314e);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f6314e.hashCode() + (this.f6313d.hashCode() * 31)) * 31;
        AbstractC0319p abstractC0319p = this.f6316j;
        int a4 = AbstractC0017m.a(this.f6317k, (hashCode + (abstractC0319p != null ? abstractC0319p.hashCode() : 0)) * 31, 31);
        AbstractC0319p abstractC0319p2 = this.f6318l;
        return Integer.hashCode(this.f6315i) + AbstractC0017m.a(this.f6326t, AbstractC0017m.a(this.f6325s, AbstractC0017m.a(this.f6324r, AbstractC0017m.a(this.f6323q, AbstractC0784j.c(this.f6322p, AbstractC0784j.c(this.f6321o, AbstractC0017m.a(this.f6320n, AbstractC0017m.a(this.f6319m, (a4 + (abstractC0319p2 != null ? abstractC0319p2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
