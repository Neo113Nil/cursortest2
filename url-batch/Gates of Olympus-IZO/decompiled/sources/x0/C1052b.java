package x0;

import H2.AbstractC0080b;
import Z1.i;
import android.content.res.Resources;

/* renamed from: x0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1052b {

    /* renamed from: a, reason: collision with root package name */
    public final Resources.Theme f8719a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8720b;

    public C1052b(Resources.Theme theme, int i3) {
        this.f8719a = theme;
        this.f8720b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1052b)) {
            return false;
        }
        C1052b c1052b = (C1052b) obj;
        return i.a(this.f8719a, c1052b.f8719a) && this.f8720b == c1052b.f8720b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8720b) + (this.f8719a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.f8719a);
        sb.append(", id=");
        return AbstractC0080b.k(sb, this.f8720b, ')');
    }
}
