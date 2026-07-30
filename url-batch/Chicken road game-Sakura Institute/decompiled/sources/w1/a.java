package w1;

import a0.m;
import f1.f;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final f f9489a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9490b;

    public a(f fVar, int i7) {
        this.f9489a = fVar;
        this.f9490b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.a(this.f9489a, aVar.f9489a) && this.f9490b == aVar.f9490b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9490b) + (this.f9489a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.f9489a);
        sb.append(", configFlags=");
        return m.l(sb, this.f9490b, ')');
    }
}
