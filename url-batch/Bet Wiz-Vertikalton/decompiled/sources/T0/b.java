package T0;

import e1.d;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f846a;

    /* renamed from: b, reason: collision with root package name */
    public final int f847b;

    /* renamed from: c, reason: collision with root package name */
    public final int f848c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final List f849e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f850f;

    /* renamed from: g, reason: collision with root package name */
    public final int f851g;
    public final int h;
    public final int i;

    public /* synthetic */ b(int i, int i2, int i3, List list, List list2, int i4, int i5) {
        this(i, i2, i3, list, list2, false, 0, i4, i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f846a == bVar.f846a && this.f847b == bVar.f847b && this.f848c == bVar.f848c && d.a(this.d, bVar.d) && d.a(this.f849e, bVar.f849e) && this.f850f == bVar.f850f && this.f851g == bVar.f851g && this.h == bVar.h && this.i == bVar.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + ((Integer.hashCode(this.h) + ((Integer.hashCode(this.f851g) + ((Boolean.hashCode(this.f850f) + ((this.f849e.hashCode() + ((this.d.hashCode() + ((Integer.hashCode(this.f848c) + ((Integer.hashCode(this.f847b) + (Integer.hashCode(this.f846a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LevelDefinition(levelId=" + this.f846a + ", rows=" + this.f847b + ", cols=" + this.f848c + ", nodes=" + this.d + ", edges=" + this.f849e + ", hasTimer=" + this.f850f + ", timerSeconds=" + this.f851g + ", crystalReward=" + this.h + ", baseScore=" + this.i + ")";
    }

    public b(int i, int i2, int i3, List list, List list2, boolean z2, int i4, int i5, int i6) {
        this.f846a = i;
        this.f847b = i2;
        this.f848c = i3;
        this.d = list;
        this.f849e = list2;
        this.f850f = z2;
        this.f851g = i4;
        this.h = i5;
        this.i = i6;
    }
}
