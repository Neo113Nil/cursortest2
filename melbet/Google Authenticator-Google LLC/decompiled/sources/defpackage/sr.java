package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sr extends sq {
    public int m;

    public sr(sy syVar) {
        super(syVar);
        this.l = true != (syVar instanceof sv) ? 3 : 2;
    }

    @Override // defpackage.sq
    public final void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((so) it.next()).f();
        }
    }
}
