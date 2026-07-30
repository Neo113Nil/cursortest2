package f4;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {
    public static final int $stable = 0;
    private final boolean enabled;
    private final String gateUrl;
    private final String hint;

    public a() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ a copy$default(a aVar, boolean z8, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z8 = aVar.enabled;
        }
        if ((i7 & 2) != 0) {
            str = aVar.gateUrl;
        }
        if ((i7 & 4) != 0) {
            str2 = aVar.hint;
        }
        return aVar.copy(z8, str, str2);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final String component2() {
        return this.gateUrl;
    }

    public final String component3() {
        return this.hint;
    }

    public final a copy(boolean z8, String str, String str2) {
        r6.k.f(str, "gateUrl");
        r6.k.f(str2, "hint");
        return new a(z8, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.enabled == aVar.enabled && r6.k.a(this.gateUrl, aVar.gateUrl) && r6.k.a(this.hint, aVar.hint);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getGateUrl() {
        return this.gateUrl;
    }

    public final String getHint() {
        return this.hint;
    }

    public int hashCode() {
        return this.hint.hashCode() + r6.i.a(Boolean.hashCode(this.enabled) * 31, 31, this.gateUrl);
    }

    public String toString() {
        boolean z8 = this.enabled;
        String str = this.gateUrl;
        String str2 = this.hint;
        StringBuilder sb = new StringBuilder("PlateConfig(enabled=");
        sb.append(z8);
        sb.append(", gateUrl=");
        sb.append(str);
        sb.append(", hint=");
        return a0.m.m(sb, str2, ")");
    }

    public a(boolean z8, String str, String str2) {
        r6.k.f(str, "gateUrl");
        r6.k.f(str2, "hint");
        this.enabled = z8;
        this.gateUrl = str;
        this.hint = str2;
    }

    public /* synthetic */ a(boolean z8, String str, String str2, int i7, r6.e eVar) {
        this((i7 & 1) != 0 ? false : z8, (i7 & 2) != 0 ? "" : str, (i7 & 4) != 0 ? "" : str2);
    }
}
