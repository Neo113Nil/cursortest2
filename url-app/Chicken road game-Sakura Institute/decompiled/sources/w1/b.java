package w1;

import a0.m;
import android.content.res.Resources;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Resources.Theme f9491a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9492b;

    public b(Resources.Theme theme, int i7) {
        this.f9491a = theme;
        this.f9492b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.a(this.f9491a, bVar.f9491a) && this.f9492b == bVar.f9492b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9492b) + (this.f9491a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.f9491a);
        sb.append(", id=");
        return m.l(sb, this.f9492b, ')');
    }
}
