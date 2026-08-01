package p0;

import java.util.List;

/* renamed from: p0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267b {

    /* renamed from: a, reason: collision with root package name */
    public final int f3417a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3418b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3419c;
    public final List d;

    public C0267b(int i, String str, int i2, List list) {
        this.f3417a = i;
        this.f3418b = str;
        this.f3419c = i2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0267b)) {
            return false;
        }
        C0267b c0267b = (C0267b) obj;
        return this.f3417a == c0267b.f3417a && this.f3418b.equals(c0267b.f3418b) && this.f3419c == c0267b.f3419c && this.d.equals(c0267b.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((Integer.hashCode(this.f3419c) + ((this.f3418b.hashCode() + (Integer.hashCode(this.f3417a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GoalPreset(id=" + this.f3417a + ", name=" + this.f3418b + ", goalMl=" + this.f3419c + ", quickAdds=" + this.d + ")";
    }
}
