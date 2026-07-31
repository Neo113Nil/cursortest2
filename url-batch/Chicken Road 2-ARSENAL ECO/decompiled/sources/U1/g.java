package U1;

import U5.x;
import java.util.List;
import kotlin.jvm.internal.i;
import l5.C0512p;

/* loaded from: classes.dex */
public final class g {
    public static final a Companion = new a(null);
    private static final g EMPTY = new g(C0512p.f5303f, null);
    private final List<String> enabledKeys;
    private final x metadata;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final g getEMPTY() {
            return g.EMPTY;
        }

        private a() {
        }
    }

    public g(List<String> enabledKeys, x xVar) {
        i.e(enabledKeys, "enabledKeys");
        this.enabledKeys = enabledKeys;
        this.metadata = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ g copy$default(g gVar, List list, x xVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            list = gVar.enabledKeys;
        }
        if ((i7 & 2) != 0) {
            xVar = gVar.metadata;
        }
        return gVar.copy(list, xVar);
    }

    public final List<String> component1() {
        return this.enabledKeys;
    }

    public final x component2() {
        return this.metadata;
    }

    public final g copy(List<String> enabledKeys, x xVar) {
        i.e(enabledKeys, "enabledKeys");
        return new g(enabledKeys, xVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return i.a(this.enabledKeys, gVar.enabledKeys) && i.a(this.metadata, gVar.metadata);
    }

    public final List<String> getEnabledKeys() {
        return this.enabledKeys;
    }

    public final x getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        int hashCode = this.enabledKeys.hashCode() * 31;
        x xVar = this.metadata;
        return hashCode + (xVar == null ? 0 : xVar.f2672f.hashCode());
    }

    public String toString() {
        return "RemoteFeatureFlagsResult(enabledKeys=" + this.enabledKeys + ", metadata=" + this.metadata + ')';
    }
}
