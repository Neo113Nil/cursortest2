package y2;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f3835a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3836b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3837c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3838e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3839f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3840g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3841h;

    public i(int i, String str, String str2, String str3, int i4, long j4, long j5, int i5) {
        this.f3835a = i;
        this.f3836b = str;
        this.f3837c = str2;
        this.d = str3;
        this.f3838e = i4;
        this.f3839f = j4;
        this.f3840g = j5;
        this.f3841h = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f3835a == iVar.f3835a && this.f3836b.equals(iVar.f3836b) && this.f3837c.equals(iVar.f3837c) && this.d.equals(iVar.d) && this.f3838e == iVar.f3838e && this.f3839f == iVar.f3839f && this.f3840g == iVar.f3840g && this.f3841h == iVar.f3841h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3841h) + ((Long.hashCode(this.f3840g) + ((Long.hashCode(this.f3839f) + ((Integer.hashCode(this.f3838e) + ((this.d.hashCode() + ((this.f3837c.hashCode() + ((this.f3836b.hashCode() + (Integer.hashCode(this.f3835a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RaceTrackData(raceId=" + this.f3835a + ", raceName=" + this.f3836b + ", raceEmoji=" + this.f3837c + ", difficulty=" + this.d + ", minLevelRequired=" + this.f3838e + ", entryFee=" + this.f3839f + ", rewardCredits=" + this.f3840g + ", experienceReward=" + this.f3841h + ")";
    }
}
