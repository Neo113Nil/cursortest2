package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gnx {
    public static final hkh a = hkh.l("com/google/apps/tiktok/monitoring/feedback/HelpAndFeedbackStarter");
    public final Activity b;
    public final gbi c;
    public final gzp d;
    public final koe e;
    public final gbj f;
    private final aec g;

    public gnx(Activity activity, bd bdVar, gbi gbiVar, gzp gzpVar, koe koeVar) {
        gnv gnvVar = new gnv(this);
        this.g = gnvVar;
        this.f = new gnw(this);
        this.b = activity;
        this.c = gbiVar;
        if (((frv) ((gzs) gzpVar).a).a == -1) {
            this.d = gyf.a;
        } else {
            this.d = gzpVar;
        }
        this.e = koeVar;
        hoq.H(bdVar.L().c == aek.b);
        bdVar.L().a(gnvVar);
    }
}
