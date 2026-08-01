package h3;

import android.graphics.Insets;
import e3.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f4442e = new b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f4443a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4444b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4445c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4446d;

    public b(int i3, int i10, int i11, int i12) {
        this.f4443a = i3;
        this.f4444b = i10;
        this.f4445c = i11;
        this.f4446d = i12;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f4443a, bVar2.f4443a), Math.max(bVar.f4444b, bVar2.f4444b), Math.max(bVar.f4445c, bVar2.f4445c), Math.max(bVar.f4446d, bVar2.f4446d));
    }

    public static b b(int i3, int i10, int i11, int i12) {
        return (i3 == 0 && i10 == 0 && i11 == 0 && i12 == 0) ? f4442e : new b(i3, i10, i11, i12);
    }

    public static b c(Insets insets) {
        int i3;
        int i10;
        int i11;
        int i12;
        i3 = insets.left;
        i10 = insets.top;
        i11 = insets.right;
        i12 = insets.bottom;
        return b(i3, i10, i11, i12);
    }

    public final Insets d() {
        return l.h(this.f4443a, this.f4444b, this.f4445c, this.f4446d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4446d == bVar.f4446d && this.f4443a == bVar.f4443a && this.f4445c == bVar.f4445c && this.f4444b == bVar.f4444b;
    }

    public final int hashCode() {
        return (((((this.f4443a * 31) + this.f4444b) * 31) + this.f4445c) * 31) + this.f4446d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f4443a);
        sb2.append(", top=");
        sb2.append(this.f4444b);
        sb2.append(", right=");
        sb2.append(this.f4445c);
        sb2.append(", bottom=");
        return v4.a.m(sb2, this.f4446d, '}');
    }
}
