package f0;

import a0.q;
import q6.i;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f2609a;

    /* renamed from: b, reason: collision with root package name */
    public String f2610b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2611c = false;

    /* renamed from: d, reason: collision with root package name */
    public d f2612d = null;

    public f(String str, String str2) {
        this.f2609a = str;
        this.f2610b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return i.a(this.f2609a, fVar.f2609a) && i.a(this.f2610b, fVar.f2610b) && this.f2611c == fVar.f2611c && i.a(this.f2612d, fVar.f2612d);
    }

    public final int hashCode() {
        int d8 = q.d((this.f2610b.hashCode() + (this.f2609a.hashCode() * 31)) * 31, 31, this.f2611c);
        d dVar = this.f2612d;
        return d8 + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f2612d + ", isShowingSubstitution=" + this.f2611c + ')';
    }
}
