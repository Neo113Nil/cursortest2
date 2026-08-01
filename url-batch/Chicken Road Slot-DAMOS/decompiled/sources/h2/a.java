package h2;

import q1.f;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final f f4435a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4436b;

    public a(f fVar, int i3) {
        this.f4435a = fVar;
        this.f4436b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4435a.equals(aVar.f4435a) && this.f4436b == aVar.f4436b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4436b) + (this.f4435a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageVectorEntry(imageVector=");
        sb2.append(this.f4435a);
        sb2.append(", configFlags=");
        return v4.a.m(sb2, this.f4436b, ')');
    }
}
