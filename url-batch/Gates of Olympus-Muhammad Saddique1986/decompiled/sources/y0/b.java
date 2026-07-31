package y0;

import A.k;
import android.content.res.Resources;
import f2.j;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Resources.Theme f10380a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10381b;

    public b(Resources.Theme theme, int i3) {
        this.f10380a = theme;
        this.f10381b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return j.a(this.f10380a, bVar.f10380a) && this.f10381b == bVar.f10381b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10381b) + (this.f10380a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.f10380a);
        sb.append(", id=");
        return k.j(sb, this.f10381b, ')');
    }
}
