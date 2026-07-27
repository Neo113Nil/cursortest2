package w0;

import A.AbstractC0017m;
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1287b {

    /* renamed from: a, reason: collision with root package name */
    public final Resources.Theme f11374a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11375b;

    public C1287b(Resources.Theme theme, int i2) {
        this.f11374a = theme;
        this.f11375b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1287b)) {
            return false;
        }
        C1287b c1287b = (C1287b) obj;
        return Intrinsics.a(this.f11374a, c1287b.f11374a) && this.f11375b == c1287b.f11375b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11375b) + (this.f11374a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.f11374a);
        sb.append(", id=");
        return AbstractC0017m.l(sb, this.f11375b, ')');
    }
}
