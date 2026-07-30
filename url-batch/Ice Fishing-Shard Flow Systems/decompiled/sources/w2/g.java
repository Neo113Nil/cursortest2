package w2;

import A6.y;
import java.util.List;
import kotlin.collections.A;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {
    public static final a Companion = new a(null);
    private static final g EMPTY = new g(A.f6115d, null);
    private final List<String> enabledKeys;
    private final y metadata;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g getEMPTY() {
            return g.EMPTY;
        }

        private a() {
        }
    }

    public g(List<String> enabledKeys, y yVar) {
        Intrinsics.checkNotNullParameter(enabledKeys, "enabledKeys");
        this.enabledKeys = enabledKeys;
        this.metadata = yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ g copy$default(g gVar, List list, y yVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = gVar.enabledKeys;
        }
        if ((i2 & 2) != 0) {
            yVar = gVar.metadata;
        }
        return gVar.copy(list, yVar);
    }

    public final List<String> component1() {
        return this.enabledKeys;
    }

    public final y component2() {
        return this.metadata;
    }

    public final g copy(List<String> enabledKeys, y yVar) {
        Intrinsics.checkNotNullParameter(enabledKeys, "enabledKeys");
        return new g(enabledKeys, yVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.a(this.enabledKeys, gVar.enabledKeys) && Intrinsics.a(this.metadata, gVar.metadata);
    }

    public final List<String> getEnabledKeys() {
        return this.enabledKeys;
    }

    public final y getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        int hashCode = this.enabledKeys.hashCode() * 31;
        y yVar = this.metadata;
        return hashCode + (yVar == null ? 0 : yVar.f141d.hashCode());
    }

    public String toString() {
        return "RemoteFeatureFlagsResult(enabledKeys=" + this.enabledKeys + ", metadata=" + this.metadata + ')';
    }
}
