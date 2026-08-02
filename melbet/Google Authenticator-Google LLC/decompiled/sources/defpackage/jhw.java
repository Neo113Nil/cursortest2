package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhw implements jgf {
    public final jhv a;
    public final jhn b;
    public final jfv c;
    public final List d;
    public final List e;
    private final boolean f;

    public jhw(jhn jhnVar, jfv jfvVar, List list, List list2) {
        list2.getClass();
        this.a = null;
        this.b = jhnVar;
        this.c = jfvVar;
        this.d = list;
        this.e = list2;
        this.f = false;
    }

    @Override // defpackage.jgf
    public final boolean a() {
        return this.c == null && this.d.isEmpty() && this.e.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhw)) {
            return false;
        }
        jhw jhwVar = (jhw) obj;
        jhv jhvVar = jhwVar.a;
        if (!ksp.b(null, null) || !ksp.b(this.b, jhwVar.b) || !ksp.b(this.c, jhwVar.c) || !ksp.b(this.d, jhwVar.d) || !ksp.b(this.e, jhwVar.e)) {
            return false;
        }
        boolean z = jhwVar.f;
        return true;
    }

    public final int hashCode() {
        jhn jhnVar = this.b;
        int hashCode = jhnVar == null ? 0 : jhnVar.hashCode();
        jfv jfvVar = this.c;
        return (((((((hashCode * 31) + (jfvVar != null ? jfvVar.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + 1237;
    }

    public final String toString() {
        return "WithAccountsState(title=null, selectedAccountData=" + this.b + ", accountManagementData=" + this.c + ", cardsAboveAccountSwitcher=" + this.d + ", cardsBelowAccountSwitcher=" + this.e + ", isAccountCardA11yHighPriority=false)";
    }
}
