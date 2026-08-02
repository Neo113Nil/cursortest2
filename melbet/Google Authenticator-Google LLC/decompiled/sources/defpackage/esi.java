package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class esi {
    public final AtomicReference a = new AtomicReference();
    private final AtomicBoolean b = new AtomicBoolean(false);
    private volatile ddw c;

    public final hvi a(Context context, boolean z, boolean z2) {
        int i = 1;
        if (!z) {
            return hnu.aJ(true);
        }
        Boolean bool = (Boolean) this.a.get();
        if (bool != null) {
            return hnu.aJ(bool);
        }
        ddw ddwVar = this.c;
        if (ddwVar == null) {
            synchronized (this) {
                ddwVar = this.c;
                if (ddwVar == null) {
                    ddw a = deb.a(context);
                    this.c = a;
                    ddwVar = a;
                }
            }
        }
        if (z2 && !this.b.getAndSet(true)) {
            ddwVar.b(new gno(this, 1));
        }
        hvc v = hvc.v(dih.d(ddwVar.a()));
        gzf a2 = gvx.a(new euy(this, i));
        huf hufVar = huf.a;
        return hso.f(hti.f(v, a2, hufVar), Throwable.class, new esh(0), hufVar);
    }
}
