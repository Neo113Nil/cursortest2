package A0;

import A.AbstractC0017m;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final C0036g f279a;

    /* renamed from: b, reason: collision with root package name */
    public final L f280b;

    /* renamed from: c, reason: collision with root package name */
    public final List f281c;

    /* renamed from: d, reason: collision with root package name */
    public final int f282d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f283e;

    /* renamed from: f, reason: collision with root package name */
    public final int f284f;

    /* renamed from: g, reason: collision with root package name */
    public final M0.b f285g;

    /* renamed from: h, reason: collision with root package name */
    public final M0.k f286h;

    /* renamed from: i, reason: collision with root package name */
    public final F0.d f287i;

    /* renamed from: j, reason: collision with root package name */
    public final long f288j;

    public H(C0036g c0036g, L l4, List list, int i2, boolean z4, int i4, M0.b bVar, M0.k kVar, F0.d dVar, long j4) {
        this.f279a = c0036g;
        this.f280b = l4;
        this.f281c = list;
        this.f282d = i2;
        this.f283e = z4;
        this.f284f = i4;
        this.f285g = bVar;
        this.f286h = kVar;
        this.f287i = dVar;
        this.f288j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h4 = (H) obj;
        return Intrinsics.a(this.f279a, h4.f279a) && Intrinsics.a(this.f280b, h4.f280b) && Intrinsics.a(this.f281c, h4.f281c) && this.f282d == h4.f282d && this.f283e == h4.f283e && u3.l.b0(this.f284f, h4.f284f) && Intrinsics.a(this.f285g, h4.f285g) && this.f286h == h4.f286h && Intrinsics.a(this.f287i, h4.f287i) && M0.a.c(this.f288j, h4.f288j);
    }

    public final int hashCode() {
        return Long.hashCode(this.f288j) + ((this.f287i.hashCode() + ((this.f286h.hashCode() + ((this.f285g.hashCode() + AbstractC0784j.c(this.f284f, AbstractC0017m.d((((this.f281c.hashCode() + ((this.f280b.hashCode() + (this.f279a.hashCode() * 31)) * 31)) * 31) + this.f282d) * 31, 31, this.f283e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.f279a);
        sb.append(", style=");
        sb.append(this.f280b);
        sb.append(", placeholders=");
        sb.append(this.f281c);
        sb.append(", maxLines=");
        sb.append(this.f282d);
        sb.append(", softWrap=");
        sb.append(this.f283e);
        sb.append(", overflow=");
        int i2 = this.f284f;
        sb.append((Object) (u3.l.b0(i2, 1) ? "Clip" : u3.l.b0(i2, 2) ? "Ellipsis" : u3.l.b0(i2, 3) ? "Visible" : "Invalid"));
        sb.append(", density=");
        sb.append(this.f285g);
        sb.append(", layoutDirection=");
        sb.append(this.f286h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.f287i);
        sb.append(", constraints=");
        sb.append((Object) M0.a.l(this.f288j));
        sb.append(')');
        return sb.toString();
    }
}
