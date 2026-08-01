package y2;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f3813a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3814b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3815c;
    public final int d;

    /* renamed from: f, reason: collision with root package name */
    public final long f3817f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3818g;

    /* renamed from: e, reason: collision with root package name */
    public int f3816e = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3819h = false;

    public d(int i, String str, String str2, int i4, long j4, int i5) {
        this.f3813a = i;
        this.f3814b = str;
        this.f3815c = str2;
        this.d = i4;
        this.f3817f = j4;
        this.f3818g = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f3813a == dVar.f3813a && this.f3814b.equals(dVar.f3814b) && this.f3815c.equals(dVar.f3815c) && this.d == dVar.d && this.f3816e == dVar.f3816e && this.f3817f == dVar.f3817f && this.f3818g == dVar.f3818g && this.f3819h == dVar.f3819h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3819h) + ((Integer.hashCode(this.f3818g) + ((Long.hashCode(this.f3817f) + ((Integer.hashCode(this.f3816e) + ((Integer.hashCode(this.d) + ((this.f3815c.hashCode() + ((this.f3814b.hashCode() + (Integer.hashCode(this.f3813a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MissionQuestData(missionId=" + this.f3813a + ", missionTitle=" + this.f3814b + ", missionDescription=" + this.f3815c + ", targetValue=" + this.d + ", currentProgress=" + this.f3816e + ", rewardCredits=" + this.f3817f + ", rewardExperience=" + this.f3818g + ", isCompletedStatus=" + this.f3819h + ")";
    }
}
