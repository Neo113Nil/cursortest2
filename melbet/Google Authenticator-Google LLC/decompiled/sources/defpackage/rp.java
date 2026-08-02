package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rp extends rl {
    final /* synthetic */ rq d;

    public rp(rq rqVar) {
        this.d = rqVar;
    }

    @Override // defpackage.rl
    protected final String b() {
        rm rmVar = (rm) this.d.a.get();
        if (rmVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + String.valueOf(rmVar.a) + "]";
    }
}
