package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class apk extends apf {
    final apl a;

    public apk(apl aplVar) {
        this.a = aplVar;
    }

    @Override // defpackage.apf, defpackage.apb
    public final void b(ape apeVar) {
        apl aplVar = this.a;
        int i = aplVar.w - 1;
        aplVar.w = i;
        if (i == 0) {
            aplVar.x = false;
            aplVar.p();
        }
        apeVar.y(this);
    }

    @Override // defpackage.apf, defpackage.apb
    public final void f() {
        apl aplVar = this.a;
        if (aplVar.x) {
            return;
        }
        aplVar.u();
        aplVar.x = true;
    }
}
