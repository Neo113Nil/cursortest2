package U0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f865a;

    /* renamed from: b, reason: collision with root package name */
    public final String f866b;

    /* renamed from: c, reason: collision with root package name */
    public final a f867c;
    public final int d;

    public e(int i, String str, a aVar, int i2) {
        g1.d.e(str, "label");
        this.f865a = i;
        this.f866b = str;
        this.f867c = aVar;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f865a == eVar.f865a && g1.d.a(this.f866b, eVar.f866b) && this.f867c == eVar.f867c && this.d == eVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.f867c.hashCode() + ((this.f866b.hashCode() + (Integer.hashCode(this.f865a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LevelDefinition(id=" + this.f865a + ", label=" + this.f866b + ", difficulty=" + this.f867c + ", minimaxDepth=" + this.d + ")";
    }
}
