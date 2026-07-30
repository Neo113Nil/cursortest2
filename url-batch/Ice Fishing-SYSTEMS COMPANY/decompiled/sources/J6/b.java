package J6;

import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1400a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1401b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1402c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1403d;

    public b(int i, String str, int i4, int i9) {
        this.f1400a = i;
        this.f1401b = i4;
        this.f1402c = i9;
        this.f1403d = str;
    }

    public static b a(int i, int i4, String str) {
        return new b(i, str, i4, d.b(i << 3));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1400a == bVar.f1400a && this.f1401b == bVar.f1401b && this.f1402c == bVar.f1402c && this.f1403d.equals(bVar.f1403d);
    }

    public final int hashCode() {
        return this.f1403d.hashCode() ^ ((((((this.f1400a ^ 1000003) * 1000003) ^ this.f1401b) * 1000003) ^ this.f1402c) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProtoFieldInfo{fieldNumber=");
        sb.append(this.f1400a);
        sb.append(", tag=");
        sb.append(this.f1401b);
        sb.append(", tagSize=");
        sb.append(this.f1402c);
        sb.append(", jsonName=");
        return AbstractC5051n.g(sb, this.f1403d, "}");
    }
}
