package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class get implements gef {
    public final /* synthetic */ geu a;

    public get(geu geuVar) {
        this.a = geuVar;
    }

    @Override // defpackage.gef
    public final void a(gee geeVar) {
        boolean a;
        int ordinal = geeVar.b.ordinal();
        if (ordinal == 0) {
            a = a.a(this.a.d, null, gec.a);
        } else {
            if (ordinal != 1) {
                throw new IllegalStateException("Unrecognized CallReason: ".concat(geeVar.toString()));
            }
            AtomicReference atomicReference = this.a.d;
            gec gecVar = gec.a;
            gec gecVar2 = gec.b;
            if (a.a(atomicReference, gecVar, gecVar2)) {
                return;
            } else {
                a = a.a(atomicReference, null, gecVar2);
            }
        }
        if (a) {
            geu geuVar = this.a;
            geuVar.a.execute(new fnh(this, 18));
        }
    }
}
