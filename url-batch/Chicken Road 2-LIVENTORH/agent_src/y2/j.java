package y2;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f3842a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3843b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3844c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3845e;

    public j(int i, String str, String str2, String str3, long j4) {
        this.f3842a = i;
        this.f3843b = str;
        this.f3844c = str2;
        this.d = str3;
        this.f3845e = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f3842a == jVar.f3842a && this.f3843b.equals(jVar.f3843b) && this.f3844c.equals(jVar.f3844c) && this.d.equals(jVar.d) && this.f3845e == jVar.f3845e;
    }

    public final int hashCode() {
        return ((Long.hashCode(this.f3845e) + ((this.d.hashCode() + ((this.f3844c.hashCode() + ((this.f3843b.hashCode() + (Integer.hashCode(this.f3842a) * 31)) * 31)) * 31)) * 31)) * 31) - 166371741;
    }

    public final String toString() {
        return "ShopItemData(itemId=" + this.f3842a + ", itemName=" + this.f3843b + ", itemEmoji=" + this.f3844c + ", itemDescription=" + this.d + ", itemPrice=" + this.f3845e + ", itemType=consumable)";
    }
}
