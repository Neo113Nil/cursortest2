package z;

import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class g {
    private final String from;
    private final String to;

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ g copy$default(g gVar, String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = gVar.from;
        }
        if ((i8 & 2) != 0) {
            str2 = gVar.to;
        }
        return gVar.copy(str, str2);
    }

    public final String component1() {
        return this.from;
    }

    public final String component2() {
        return this.to;
    }

    public final g copy(String from, String to) {
        s.checkNotNullParameter(from, "from");
        s.checkNotNullParameter(to, "to");
        return new g(from, to);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.areEqual(this.from, gVar.from) && s.areEqual(this.to, gVar.to);
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getTo() {
        return this.to;
    }

    public int hashCode() {
        return (this.from.hashCode() * 31) + this.to.hashCode();
    }

    public String toString() {
        return "SimultaneousInterpretationStreamtrans(from=" + this.from + ", to=" + this.to + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(String from) {
        this(from, null, 2, 0 == true ? 1 : 0);
        s.checkNotNullParameter(from, "from");
    }

    public g(String from, String to) {
        s.checkNotNullParameter(from, "from");
        s.checkNotNullParameter(to, "to");
        this.from = from;
        this.to = to;
    }

    public /* synthetic */ g(String str, String str2, int i8, kotlin.jvm.internal.o oVar) {
        this((i8 & 1) != 0 ? "cn" : str, (i8 & 2) != 0 ? "en" : str2);
    }
}
