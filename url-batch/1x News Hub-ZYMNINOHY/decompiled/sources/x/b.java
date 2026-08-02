package x;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f10693e = new b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f10694a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10695b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10696c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10697d;

    public b(int i3, int i4, int i5, int i6) {
        this.f10694a = i3;
        this.f10695b = i4;
        this.f10696c = i5;
        this.f10697d = i6;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f10694a, bVar2.f10694a), Math.max(bVar.f10695b, bVar2.f10695b), Math.max(bVar.f10696c, bVar2.f10696c), Math.max(bVar.f10697d, bVar2.f10697d));
    }

    public static b b(int i3, int i4, int i5, int i6) {
        return (i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) ? f10693e : new b(i3, i4, i5, i6);
    }

    public static b c(Insets insets) {
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
        return t.e.a(this.f10694a, this.f10695b, this.f10696c, this.f10697d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f10697d == bVar.f10697d && this.f10694a == bVar.f10694a && this.f10696c == bVar.f10696c && this.f10695b == bVar.f10695b;
    }

    public final int hashCode() {
        return (((((this.f10694a * 31) + this.f10695b) * 31) + this.f10696c) * 31) + this.f10697d;
    }

    public final String toString() {
        return "Insets{left=" + this.f10694a + ", top=" + this.f10695b + ", right=" + this.f10696c + ", bottom=" + this.f10697d + '}';
    }
}
