package b6;

import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1372a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1373b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1374c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1375d;

    public k1(int i, String str, String str2, List list) {
        this.f1372a = i;
        this.f1373b = str;
        this.f1374c = str2;
        this.f1375d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return this.f1372a == k1Var.f1372a && this.f1373b.equals(k1Var.f1373b) && this.f1374c.equals(k1Var.f1374c) && this.f1375d.equals(k1Var.f1375d);
    }

    public final int hashCode() {
        return this.f1375d.hashCode() + ((this.f1374c.hashCode() + ((this.f1373b.hashCode() + (Integer.hashCode(this.f1372a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Quiz(id=" + this.f1372a + ", title=" + this.f1373b + ", emoji=" + this.f1374c + ", questions=" + this.f1375d + ")";
    }
}
