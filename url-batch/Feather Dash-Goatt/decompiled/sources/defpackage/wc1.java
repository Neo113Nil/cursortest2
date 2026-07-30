package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class wc1 {
    public final Map a;
    public final Map b;

    public wc1(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        this.a = map;
        this.b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc1)) {
            return false;
        }
        wc1 wc1Var = (wc1) obj;
        return Intrinsics.a(this.a, wc1Var.a) && Intrinsics.a(this.b, wc1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StartupAttributionData(conversionData=" + this.a + ", deepLinkData=" + this.b + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wc1(Map map) {
        this(map, r0);
        ov ovVar = ov.d;
        ovVar.getClass();
    }
}
