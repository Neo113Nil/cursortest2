package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class iw0 {
    public final v8 a;
    public final int b;
    public final int c;
    public final jo d;
    public final List e;
    public final Map f;
    public final Set g;

    public iw0(v8 v8Var, int i, int i2, jo joVar, List list, Map map, Set set) {
        list.getClass();
        map.getClass();
        set.getClass();
        this.a = v8Var;
        this.b = i;
        this.c = i2;
        this.d = joVar;
        this.e = list;
        this.f = map;
        this.g = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.Set] */
    public static iw0 a(iw0 iw0Var, v8 v8Var, int i, int i2, jo joVar, List list, Map map, LinkedHashSet linkedHashSet, int i3) {
        if ((i3 & 1) != 0) {
            v8Var = iw0Var.a;
        }
        v8 v8Var2 = v8Var;
        if ((i3 & 2) != 0) {
            i = iw0Var.b;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = iw0Var.c;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            joVar = iw0Var.d;
        }
        jo joVar2 = joVar;
        if ((i3 & 16) != 0) {
            list = iw0Var.e;
        }
        List list2 = list;
        if ((i3 & 32) != 0) {
            map = iw0Var.f;
        }
        Map map2 = map;
        LinkedHashSet linkedHashSet2 = linkedHashSet;
        if ((i3 & 64) != 0) {
            linkedHashSet2 = iw0Var.g;
        }
        LinkedHashSet linkedHashSet3 = linkedHashSet2;
        iw0Var.getClass();
        v8Var2.getClass();
        list2.getClass();
        map2.getClass();
        linkedHashSet3.getClass();
        return new iw0(v8Var2, i4, i5, joVar2, list2, map2, linkedHashSet3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw0)) {
            return false;
        }
        iw0 iw0Var = (iw0) obj;
        return this.a.equals(iw0Var.a) && this.b == iw0Var.b && this.c == iw0Var.c && this.d.equals(iw0Var.d) && Intrinsics.a(this.e, iw0Var.e) && Intrinsics.a(this.f, iw0Var.f) && Intrinsics.a(this.g, iw0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + qy0.c(this.c, qy0.c(this.b, this.a.hashCode() * 31, 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PersistedGameData(settings=" + this.a + ", goldenFeathers=" + this.b + ", bestCompletedDistance=" + this.c + ", dailyRewardState=" + this.d + ", history=" + this.e + ", achievementProgress=" + this.f + ", claimedAchievementIds=" + this.g + ")";
    }
}
