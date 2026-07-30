package z;

import a0.m;
import r6.i;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f9968a;

    /* renamed from: b, reason: collision with root package name */
    public String f9969b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9970c = false;

    /* renamed from: d, reason: collision with root package name */
    public d f9971d = null;

    public e(String str, String str2) {
        this.f9968a = str;
        this.f9969b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.a(this.f9968a, eVar.f9968a) && k.a(this.f9969b, eVar.f9969b) && this.f9970c == eVar.f9970c && k.a(this.f9971d, eVar.f9971d);
    }

    public final int hashCode() {
        int e9 = m.e(i.a(this.f9968a.hashCode() * 31, 31, this.f9969b), 31, this.f9970c);
        d dVar = this.f9971d;
        return e9 + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f9971d + ", isShowingSubstitution=" + this.f9970c + ')';
    }
}
