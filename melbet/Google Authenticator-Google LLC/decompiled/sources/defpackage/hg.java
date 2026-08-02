package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hg extends jt {
    final /* synthetic */ hh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg(hh hhVar, View view) {
        super(view);
        this.a = hhVar;
    }

    @Override // defpackage.jt
    public final gt a() {
        hi hiVar = this.a.a.j;
        if (hiVar == null) {
            return null;
        }
        return hiVar.a();
    }

    @Override // defpackage.jt
    public final boolean b() {
        this.a.a.o();
        return true;
    }

    @Override // defpackage.jt
    public final boolean c() {
        hk hkVar = this.a.a;
        if (hkVar.m != null) {
            return false;
        }
        hkVar.l();
        return true;
    }
}
