package y2;

import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public long f3820a;

    /* renamed from: b, reason: collision with root package name */
    public int f3821b;

    /* renamed from: c, reason: collision with root package name */
    public int f3822c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public int f3823e;

    /* renamed from: f, reason: collision with root package name */
    public int f3824f;

    /* renamed from: g, reason: collision with root package name */
    public int f3825g;

    public e(long j4, int i, int i4, ArrayList arrayList, int i5, int i6, int i7) {
        this.f3820a = j4;
        this.f3821b = i;
        this.f3822c = i4;
        this.d = arrayList;
        this.f3823e = i5;
        this.f3824f = i6;
        this.f3825g = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f3820a == eVar.f3820a && this.f3821b == eVar.f3821b && this.f3822c == eVar.f3822c && f3.d.a(this.d, eVar.d) && this.f3823e == eVar.f3823e && this.f3824f == eVar.f3824f && this.f3825g == eVar.f3825g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3825g) + ((Integer.hashCode(this.f3824f) + ((Integer.hashCode(this.f3823e) + ((this.d.hashCode() + ((Integer.hashCode(this.f3822c) + ((Integer.hashCode(this.f3821b) + (Long.hashCode(this.f3820a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PlayerGameData(creditsBalance=" + this.f3820a + ", experiencePoints=" + this.f3821b + ", playerLevel=" + this.f3822c + ", ownedGlidersIds=" + this.d + ", selectedGliderId=" + this.f3823e + ", completedRacesCount=" + this.f3824f + ", totalWinsCount=" + this.f3825g + ")";
    }
}
