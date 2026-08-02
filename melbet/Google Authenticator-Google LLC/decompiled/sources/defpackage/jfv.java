package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jfv {
    public final List a;
    public final jgr b;
    public final jft c;
    public final jia d;
    private final int e = 2;

    public /* synthetic */ jfv(List list, jgr jgrVar, jft jftVar, jia jiaVar) {
        this.a = list;
        this.b = jgrVar;
        this.c = jftVar;
        this.d = jiaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfv)) {
            return false;
        }
        jfv jfvVar = (jfv) obj;
        if (!ksp.b(this.a, jfvVar.a) || !ksp.b(this.b, jfvVar.b) || !ksp.b(this.c, jfvVar.c) || !ksp.b(this.d, jfvVar.d)) {
            return false;
        }
        int i = jfvVar.e;
        return true;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + 2;
    }

    public final String toString() {
        return "AccountManagementData(availableAccountsData=" + this.a + ", expandState=" + this.b + ", accountListHeader=" + this.c + ", accountManagementActions=" + this.d + ", dividerType=SMALL_SPACE)";
    }
}
