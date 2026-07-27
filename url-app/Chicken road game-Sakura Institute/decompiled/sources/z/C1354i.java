package z;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;
import r0.B;

/* renamed from: z.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1354i {

    /* renamed from: a, reason: collision with root package name */
    public final String f11761a;

    /* renamed from: b, reason: collision with root package name */
    public String f11762b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11763c = false;

    /* renamed from: d, reason: collision with root package name */
    public C1350e f11764d = null;

    public C1354i(String str, String str2) {
        this.f11761a = str;
        this.f11762b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1354i)) {
            return false;
        }
        C1354i c1354i = (C1354i) obj;
        return Intrinsics.a(this.f11761a, c1354i.f11761a) && Intrinsics.a(this.f11762b, c1354i.f11762b) && this.f11763c == c1354i.f11763c && Intrinsics.a(this.f11764d, c1354i.f11764d);
    }

    public final int hashCode() {
        int d4 = AbstractC0017m.d(B.a(this.f11762b, this.f11761a.hashCode() * 31, 31), 31, this.f11763c);
        C1350e c1350e = this.f11764d;
        return d4 + (c1350e == null ? 0 : c1350e.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f11764d + ", isShowingSubstitution=" + this.f11763c + ')';
    }
}
