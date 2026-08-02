package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jpu implements aer, agl, aeh {
    private final Activity a;
    private final bd b;
    private final glu c;

    public jpu(Activity activity, glu gluVar, bd bdVar) {
        int i = activity != null ? 1 : 0;
        i = gluVar != null ? i + 1 : i;
        iwi.a((bdVar != null ? i + 1 : i) == 1, "Exactly one of the host components must be non-null.", new Object[0]);
        this.a = activity;
        this.c = gluVar;
        this.b = bdVar;
    }

    @Override // defpackage.aer
    public final ael L() {
        return ((aer) c()).L();
    }

    @Override // defpackage.aeh
    public final agh N() {
        return ((aeh) c()).N();
    }

    @Override // defpackage.agl
    public final agk O() {
        return ((agl) c()).O();
    }

    @Override // defpackage.aeh
    public final ago P() {
        return ((aeh) c()).P();
    }

    public final Activity a() {
        Activity activity = this.a;
        iwi.b(activity);
        return activity;
    }

    public final bd b() {
        bd bdVar = this.b;
        iwi.b(bdVar);
        return bdVar;
    }

    public final Object c() {
        int d = d() - 1;
        return d != 0 ? d != 1 ? b() : e() : a();
    }

    public final int d() {
        if (this.a != null) {
            return 1;
        }
        if (this.b != null) {
            return 3;
        }
        if (this.c != null) {
            return 2;
        }
        throw new AssertionError("Shouldn't reach here.");
    }

    public final glu e() {
        glu gluVar = this.c;
        iwi.b(gluVar);
        return gluVar;
    }

    public final String toString() {
        return "ScreenHost{host=" + c().toString() + "}";
    }
}
