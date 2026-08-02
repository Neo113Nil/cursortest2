package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eht implements ehv {
    public final ehs a;
    public final List b;

    public eht(ehs ehsVar, List list) {
        this.a = ehsVar;
        this.b = list;
    }

    @Override // defpackage.ehv
    public final /* synthetic */ dkr a() {
        return eos.B(this);
    }

    @Override // defpackage.ehv
    public final ehs b() {
        return this.a;
    }

    @Override // defpackage.ehv
    public final eia c() {
        ehs ehsVar = this.a;
        if (ehsVar == null) {
            return ehz.a;
        }
        ehr ehrVar = ehsVar.a;
        return ehrVar.b ? new ehw(ehrVar.a, ehrVar.c) : new ehy(ehrVar.a);
    }

    @Override // defpackage.ehv
    public final List d() {
        return this.b;
    }

    @Override // defpackage.ehv
    public final /* synthetic */ boolean e() {
        return eos.C(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eht)) {
            return false;
        }
        eht ehtVar = (eht) obj;
        return ksp.b(this.a, ehtVar.a) && ksp.b(this.b, ehtVar.b);
    }

    public final int hashCode() {
        ehs ehsVar = this.a;
        return ((ehsVar == null ? 0 : ehsVar.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AccountsModelData(selectedAccount=" + this.a + ", nonSelectedAccounts=" + this.b + ")";
    }
}
