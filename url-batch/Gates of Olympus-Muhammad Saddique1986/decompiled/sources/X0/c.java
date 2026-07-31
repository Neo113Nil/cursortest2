package X0;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f4622e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f4623a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4624b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4625c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4626d;

    public c(int i3, int i4, int i5, int i6) {
        this.f4623a = i3;
        this.f4624b = i4;
        this.f4625c = i5;
        this.f4626d = i6;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f4623a, cVar2.f4623a), Math.max(cVar.f4624b, cVar2.f4624b), Math.max(cVar.f4625c, cVar2.f4625c), Math.max(cVar.f4626d, cVar2.f4626d));
    }

    public static c b(int i3, int i4, int i5, int i6) {
        return (i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) ? f4622e : new c(i3, i4, i5, i6);
    }

    public static c c(Insets insets) {
        int i3;
        int i4;
        int i5;
        int i6;
        i3 = insets.left;
        i4 = insets.top;
        i5 = insets.right;
        i6 = insets.bottom;
        return b(i3, i4, i5, i6);
    }

    public final Insets d() {
        return b.a(this.f4623a, this.f4624b, this.f4625c, this.f4626d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f4626d == cVar.f4626d && this.f4623a == cVar.f4623a && this.f4625c == cVar.f4625c && this.f4624b == cVar.f4624b;
    }

    public final int hashCode() {
        return (((((this.f4623a * 31) + this.f4624b) * 31) + this.f4625c) * 31) + this.f4626d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f4623a);
        sb.append(", top=");
        sb.append(this.f4624b);
        sb.append(", right=");
        sb.append(this.f4625c);
        sb.append(", bottom=");
        return A.k.j(sb, this.f4626d, '}');
    }
}
