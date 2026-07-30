package kotlin.text;

/* loaded from: classes3.dex */
public final class g {
    private final j6.m range;
    private final String value;

    public g(String value, j6.m range) {
        kotlin.jvm.internal.s.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.s.checkNotNullParameter(range, "range");
        this.value = value;
        this.range = range;
    }

    public static /* synthetic */ g copy$default(g gVar, String str, j6.m mVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = gVar.value;
        }
        if ((i8 & 2) != 0) {
            mVar = gVar.range;
        }
        return gVar.copy(str, mVar);
    }

    public final String component1() {
        return this.value;
    }

    public final j6.m component2() {
        return this.range;
    }

    public final g copy(String value, j6.m range) {
        kotlin.jvm.internal.s.checkNotNullParameter(value, "value");
        kotlin.jvm.internal.s.checkNotNullParameter(range, "range");
        return new g(value, range);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.s.areEqual(this.value, gVar.value) && kotlin.jvm.internal.s.areEqual(this.range, gVar.range);
    }

    public final j6.m getRange() {
        return this.range;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.value.hashCode() * 31) + this.range.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.value + ", range=" + this.range + ')';
    }
}
