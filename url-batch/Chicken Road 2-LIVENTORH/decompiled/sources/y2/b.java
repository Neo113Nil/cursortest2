package y2;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f3803a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3804b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3805c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3806e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3807f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3808g;

    /* renamed from: h, reason: collision with root package name */
    public int f3809h = 0;
    public int i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f3810j = 0;

    public b(int i, String str, String str2, int i4, int i5, int i6, long j4) {
        this.f3803a = i;
        this.f3804b = str;
        this.f3805c = str2;
        this.d = i4;
        this.f3806e = i5;
        this.f3807f = i6;
        this.f3808g = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3803a == bVar.f3803a && this.f3804b.equals(bVar.f3804b) && this.f3805c.equals(bVar.f3805c) && this.d == bVar.d && this.f3806e == bVar.f3806e && this.f3807f == bVar.f3807f && this.f3808g == bVar.f3808g && this.f3809h == bVar.f3809h && this.i == bVar.i && this.f3810j == bVar.f3810j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3810j) + ((Integer.hashCode(this.i) + ((Integer.hashCode(this.f3809h) + ((Long.hashCode(this.f3808g) + ((Integer.hashCode(this.f3807f) + ((Integer.hashCode(this.f3806e) + ((Integer.hashCode(this.d) + ((this.f3805c.hashCode() + ((this.f3804b.hashCode() + (Integer.hashCode(this.f3803a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GliderVehicleData(gliderId=" + this.f3803a + ", gliderName=" + this.f3804b + ", gliderEmoji=" + this.f3805c + ", baseSpeed=" + this.d + ", baseHandling=" + this.f3806e + ", baseDurability=" + this.f3807f + ", purchasePrice=" + this.f3808g + ", speedUpgradeLevel=" + this.f3809h + ", handlingUpgradeLevel=" + this.i + ", durabilityUpgradeLevel=" + this.f3810j + ")";
    }
}
