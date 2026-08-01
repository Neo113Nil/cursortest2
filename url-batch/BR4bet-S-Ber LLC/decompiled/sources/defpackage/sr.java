package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class sr extends rr {
    public final ur e;
    public final tr f;
    public final qa g;
    public final Object h;

    public sr(ur urVar, tr trVar, qa qaVar, Object obj) {
        this.e = urVar;
        this.f = trVar;
        this.g = qaVar;
        this.h = obj;
    }

    @Override // defpackage.rr
    public final boolean k() {
        return false;
    }

    @Override // defpackage.rr
    public final void l(Throwable th) {
        qa qaVar = this.g;
        qa t = ur.t(qaVar);
        ur urVar = this.e;
        tr trVar = this.f;
        Object obj = this.h;
        if (t == null || !urVar.B(trVar, t, obj)) {
            trVar.a.e(new et(2), 2);
            qa t2 = ur.t(qaVar);
            if (t2 == null || !urVar.B(trVar, t2, obj)) {
                urVar.l(trVar, obj);
            }
        }
    }
}
