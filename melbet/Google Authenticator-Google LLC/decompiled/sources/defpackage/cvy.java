package defpackage;

import android.os.SystemClock;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class cvy implements ddd {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cvy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ddd
    public final void c(Exception exc) {
        clg clgVar;
        int i = this.b;
        int i2 = 4;
        if (i == 0) {
            cwe.b.b(this.a, new cvr(i2));
            return;
        }
        int i3 = 0;
        if (i == 1) {
            cvw.b.b(this.a, new cvr(i3));
            return;
        }
        int i4 = 5;
        if (i == 2) {
            cwi.b.b(this.a, new cvr(i4));
            return;
        }
        if (i == 3) {
            cww.l.b(this.a, new cvr(7));
            return;
        }
        if (i == 4) {
            if ((exc instanceof cmm) && (clgVar = ((cmm) exc).a.i) != null && clgVar.c == 24) {
                ((cyg) this.a).c.set(SystemClock.elapsedRealtime());
                return;
            }
            return;
        }
        if (i != 5) {
            boolean z = djf.a;
            Log.w("CBVerifier", String.format("Committing phenotypeflags for %s failed. %s", this.a, exc));
        } else {
            boolean z2 = djf.a;
            Log.w("CBVerifier", String.format("Fail to register phenotypeflags for %s. %s", this.a, exc));
        }
    }
}
