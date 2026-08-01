package C;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f156e = new d(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f157a;

    /* renamed from: b, reason: collision with root package name */
    public final int f158b;

    /* renamed from: c, reason: collision with root package name */
    public final int f159c;

    /* renamed from: d, reason: collision with root package name */
    public final int f160d;

    public d(int i, int i2, int i3, int i4) {
        this.f157a = i;
        this.f158b = i2;
        this.f159c = i3;
        this.f160d = i4;
    }

    public static d a(d dVar, d dVar2) {
        return b(Math.max(dVar.f157a, dVar2.f157a), Math.max(dVar.f158b, dVar2.f158b), Math.max(dVar.f159c, dVar2.f159c), Math.max(dVar.f160d, dVar2.f160d));
    }

    public static d b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f156e : new d(i, i2, i3, i4);
    }

    public static d c(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return b(i, i2, i3, i4);
    }

    public final Insets d() {
        return c.a(this.f157a, this.f158b, this.f159c, this.f160d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f160d == dVar.f160d && this.f157a == dVar.f157a && this.f159c == dVar.f159c && this.f158b == dVar.f158b;
    }

    public final int hashCode() {
        return (((((this.f157a * 31) + this.f158b) * 31) + this.f159c) * 31) + this.f160d;
    }

    public final String toString() {
        return "Insets{left=" + this.f157a + ", top=" + this.f158b + ", right=" + this.f159c + ", bottom=" + this.f160d + '}';
    }
}
