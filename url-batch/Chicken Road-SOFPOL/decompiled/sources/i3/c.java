package i3;

import a0.q;
import android.graphics.Insets;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f3420e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f3421a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3422b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3423c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3424d;

    public c(int i, int i8, int i9, int i10) {
        this.f3421a = i;
        this.f3422b = i8;
        this.f3423c = i9;
        this.f3424d = i10;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f3421a, cVar2.f3421a), Math.max(cVar.f3422b, cVar2.f3422b), Math.max(cVar.f3423c, cVar2.f3423c), Math.max(cVar.f3424d, cVar2.f3424d));
    }

    public static c b(int i, int i8, int i9, int i10) {
        return (i == 0 && i8 == 0 && i9 == 0 && i10 == 0) ? f3420e : new c(i, i8, i9, i10);
    }

    public static c c(Insets insets) {
        int i;
        int i8;
        int i9;
        int i10;
        i = insets.left;
        i8 = insets.top;
        i9 = insets.right;
        i10 = insets.bottom;
        return b(i, i8, i9, i10);
    }

    public final Insets d() {
        return b.h(this.f3421a, this.f3422b, this.f3423c, this.f3424d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f3424d == cVar.f3424d && this.f3421a == cVar.f3421a && this.f3423c == cVar.f3423c && this.f3422b == cVar.f3422b;
    }

    public final int hashCode() {
        return (((((this.f3421a * 31) + this.f3422b) * 31) + this.f3423c) * 31) + this.f3424d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f3421a);
        sb.append(", top=");
        sb.append(this.f3422b);
        sb.append(", right=");
        sb.append(this.f3423c);
        sb.append(", bottom=");
        return q.k(sb, this.f3424d, '}');
    }
}
