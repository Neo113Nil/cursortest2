package defpackage;

import android.app.Activity;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gkj {
    private static final hkh e = hkh.l("com/google/apps/tiktok/inject/account/ScreenAccountComponentManagers");
    public final jpu a;
    public final Object b = new Object();
    public final Map c = new HashMap();
    public final glu d;
    private final boolean f;

    public gkj(glu gluVar, jpu jpuVar, kee keeVar) {
        this.d = gluVar;
        this.a = jpuVar;
        gzp gzpVar = (gzp) keeVar.a;
        boolean z = false;
        if (gzpVar.f() && (gzpVar.b() instanceof gjc)) {
            z = true;
        }
        this.f = z;
    }

    public final gkg a(frv frvVar) {
        bd bdVar;
        glu gluVar;
        Object eknVar;
        boolean z = this.f;
        Set b = b();
        if (z || b.isEmpty() || (b.size() == 1 && b.contains(frvVar))) {
            jpu jpuVar = this.a;
            int d = jpuVar.d() - 1;
            Activity activity = null;
            if (d == 0) {
                bdVar = null;
                activity = jpuVar.a();
                gluVar = null;
            } else if (d != 1) {
                bdVar = jpuVar.b();
                gluVar = null;
            } else {
                gluVar = jpuVar.e();
                bdVar = null;
            }
            return new gkg(frvVar, new gld(activity, gluVar, bdVar), this.d);
        }
        IllegalStateException illegalStateException = new IllegalStateException("There is already an account id in use! TikTok does not support multiple accounts yet.\n\tCurrent AccountId: " + String.valueOf(b) + "\n\tNew AccountId: " + String.valueOf(frvVar));
        hkf hkfVar = (hkf) ((hkf) ((hkf) e.f()).h(illegalStateException)).i("com/google/apps/tiktok/inject/account/ScreenAccountComponentManagers", "createManager", 99, "ScreenAccountComponentManagers.java");
        eki ekiVar = new eki((long) b.size());
        if (b.size() == 1) {
            eknVar = new ekj(((frv) hnu.X(b)).a != -1);
        } else {
            eknVar = new ekn("N/A");
        }
        hkfVar.x("There is already an account id in use! TikTok does not support multiple accounts yet. # of current account ids: %s, current account valid: %s, new account valid: %s", ekiVar, eknVar, new ekj(frvVar.a != -1));
        throw illegalStateException;
    }

    public final Set b() {
        Set unmodifiableSet;
        synchronized (this.b) {
            unmodifiableSet = DesugarCollections.unmodifiableSet(this.c.keySet());
        }
        return unmodifiableSet;
    }
}
