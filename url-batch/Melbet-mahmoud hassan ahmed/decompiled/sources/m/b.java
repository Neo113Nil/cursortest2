package m;

import android.graphics.Insets;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f18823e = new b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f18824a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18825b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18826c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18827d;

    private b(int i7, int i8, int i9, int i10) {
        this.f18824a = i7;
        this.f18825b = i8;
        this.f18826c = i9;
        this.f18827d = i10;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f18824a, bVar2.f18824a), Math.max(bVar.f18825b, bVar2.f18825b), Math.max(bVar.f18826c, bVar2.f18826c), Math.max(bVar.f18827d, bVar2.f18827d));
    }

    public static b b(int i7, int i8, int i9, int i10) {
        return (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) ? f18823e : new b(i7, i8, i9, i10);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return Insets.of(this.f18824a, this.f18825b, this.f18826c, this.f18827d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f18827d == bVar.f18827d && this.f18824a == bVar.f18824a && this.f18826c == bVar.f18826c && this.f18825b == bVar.f18825b;
    }

    public int hashCode() {
        return (((((this.f18824a * 31) + this.f18825b) * 31) + this.f18826c) * 31) + this.f18827d;
    }

    public String toString() {
        return "Insets{left=" + this.f18824a + ", top=" + this.f18825b + ", right=" + this.f18826c + ", bottom=" + this.f18827d + '}';
    }
}
