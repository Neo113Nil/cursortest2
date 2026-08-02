package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fsb implements fsj {
    private final bg a;
    private oc b;
    private oc c;

    public fsb(bg bgVar) {
        this.a = bgVar;
    }

    @Override // defpackage.fsj
    public final Intent a() {
        return this.a.getIntent();
    }

    @Override // defpackage.fsj
    public final oc b() {
        oc ocVar = this.c;
        if (ocVar != null) {
            return ocVar;
        }
        ksp.a("_requirementActivityLauncher");
        return null;
    }

    @Override // defpackage.fsj
    public final oc c() {
        oc ocVar = this.b;
        if (ocVar != null) {
            return ocVar;
        }
        ksp.a("_switchAccountActivityLauncher");
        return null;
    }

    @Override // defpackage.fsj
    public final void d(ob obVar, ob obVar2) {
        om omVar = new om();
        bg bgVar = this.a;
        this.b = bgVar.q(omVar, obVar);
        this.c = bgVar.q(new om(), obVar2);
    }

    @Override // defpackage.fsj
    public final boolean e() {
        return true;
    }

    @Override // defpackage.fsj
    public final boolean f() {
        return this.a.isFinishing();
    }

    @Override // defpackage.fsj
    public final boolean g() {
        return this.a.a().X();
    }
}
