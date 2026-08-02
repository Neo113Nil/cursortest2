package defpackage;

import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evx {
    public final jjq a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final euc f;
    private final boolean g;
    private final List h;
    private final List i;
    private final List j;
    private final boolean k;

    public evx(boolean z, List list, jjq jjqVar, String str, String str2, List list2, List list3, boolean z2, boolean z3, boolean z4, euc eucVar) {
        list.getClass();
        jjqVar.getClass();
        str.getClass();
        str2.getClass();
        list2.getClass();
        list3.getClass();
        eucVar.getClass();
        this.g = z;
        this.h = list;
        this.a = jjqVar;
        this.b = str;
        this.c = str2;
        this.i = list2;
        this.j = list3;
        this.k = z2;
        this.d = z3;
        this.e = z4;
        this.f = eucVar;
    }

    public final int a(iac iacVar, String str) {
        iacVar.getClass();
        str.getClass();
        if (!this.k) {
            return 14;
        }
        if (!this.g || !this.h.contains(iacVar)) {
            return 3;
        }
        if (this.a.v()) {
            return 4;
        }
        List list = this.i;
        if (list.isEmpty() || list.contains(str)) {
            return this.j.contains(str) ? 6 : 0;
        }
        return 5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evx)) {
            return false;
        }
        evx evxVar = (evx) obj;
        return this.g == evxVar.g && ksp.b(this.h, evxVar.h) && ksp.b(this.a, evxVar.a) && ksp.b(this.b, evxVar.b) && ksp.b(this.c, evxVar.c) && ksp.b(this.i, evxVar.i) && ksp.b(this.j, evxVar.j) && this.k == evxVar.k && this.d == evxVar.d && this.e == evxVar.e && ksp.b(this.f, evxVar.f);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.g), this.h, this.a, this.b, this.c, this.i, this.j, Boolean.valueOf(this.k), Boolean.valueOf(this.d), Boolean.valueOf(this.e));
    }

    public final String toString() {
        return "SharedStorageInfo(shouldUseSharedStorage=" + this.g + ", enabledBackings=" + this.h + ", secret=" + this.a + ", dirPath=" + this.b + ", gmsCoreDirPath=" + this.c + ", includeStaticConfigPackages=" + this.i + ", excludeStaticConfigPackages=" + this.j + ", hasStorageInfoFromGms=" + this.k + ", allowEmptySnapshotToken=" + this.d + ", enableCommitV2Api=" + this.e + ", clientFlags=" + this.f + ")";
    }
}
