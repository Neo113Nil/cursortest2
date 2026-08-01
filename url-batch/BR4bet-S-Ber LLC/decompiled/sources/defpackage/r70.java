package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class r70 extends ur {
    public final boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r70() {
        super(true);
        boolean z = true;
        r(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ur.g;
        pa paVar = (pa) atomicReferenceFieldUpdater.get(this);
        qa qaVar = paVar instanceof qa ? (qa) paVar : null;
        if (qaVar != null) {
            ur j = qaVar.j();
            while (!j.n()) {
                pa paVar2 = (pa) atomicReferenceFieldUpdater.get(j);
                qa qaVar2 = paVar2 instanceof qa ? (qa) paVar2 : null;
                if (qaVar2 != null) {
                    j = qaVar2.j();
                }
            }
            this.h = z;
        }
        z = false;
        this.h = z;
    }

    @Override // defpackage.ur
    public final boolean c(Throwable th) {
        return false;
    }

    @Override // defpackage.ur
    public final boolean n() {
        return this.h;
    }
}
