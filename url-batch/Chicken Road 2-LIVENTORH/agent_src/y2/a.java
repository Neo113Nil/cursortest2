package y2;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3800a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3801b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3802c;

    public a(String str, String str2, boolean z3) {
        this.f3800a = str;
        this.f3801b = str2;
        this.f3802c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f3.d.a(this.f3800a, aVar.f3800a) && f3.d.a(this.f3801b, aVar.f3801b) && this.f3802c == aVar.f3802c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3802c) + ((this.f3801b.hashCode() + (this.f3800a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AchievementDataModel(achievementTitle=" + this.f3800a + ", achievementDescription=" + this.f3801b + ", isUnlockedStatus=" + this.f3802c + ")";
    }
}
