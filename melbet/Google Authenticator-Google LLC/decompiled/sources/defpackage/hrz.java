package defpackage;

import android.os.Trace;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hrz {
    public Object a;

    public hrz(SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.d = SwipeDismissBehavior.K(0.1f);
        swipeDismissBehavior.e = SwipeDismissBehavior.K(0.6f);
        swipeDismissBehavior.c = 0;
    }

    public static void a(guq guqVar) {
        Trace.beginSection(gta.l(guqVar.c()));
    }

    public final void b(guq guqVar) {
        if (d(guqVar) || guqVar.a() == null) {
            Trace.beginSection(guqVar.d());
            a(guqVar);
        } else {
            b(guqVar.a());
            a(guqVar);
        }
    }

    public final void c(guq guqVar) {
        if (d(guqVar) || guqVar.a() == null) {
            Trace.endSection();
            Trace.endSection();
        } else {
            Trace.endSection();
            c(guqVar.a());
        }
    }

    public final boolean d(guq guqVar) {
        return guqVar.g() != this;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.concurrent.Future] */
    public final void e() {
        Object gfrVar;
        fao.c();
        Object obj = this.a;
        obj.getClass();
        gfp gfpVar = (gfp) obj;
        gzp gzpVar = gfpVar.b;
        hoq.I(gzpVar.f(), "LocalSubscriptionState detected an atomicity failure. Previous pendingResult was already cleared. If this Exception is ever thrown, it is a major bug, and should be reported to TikTok as a P1 along with the Sponge or Listnr error report. Please file at go/tiktok/bug.");
        try {
            gfrVar = new gfs(hnu.aR(gzpVar.b()));
        } catch (ExecutionException e) {
            gfrVar = new gfr(e.getCause());
        }
        this.a = new gfp(gfpVar.a, gyf.a, gzp.h(gfrVar), gfpVar.d);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kys] */
    public final void f(jfy jfyVar) {
        ((ikm) this.a).b.j(jfyVar);
    }

    public final int g() {
        ded dedVar = ((deg) this.a).a;
        oy.at(dedVar);
        return dedVar.a;
    }

    public hrz(cnc cncVar) {
        this.a = cncVar;
    }

    public hrz(gfp gfpVar) {
        this.a = gfpVar;
    }

    public hrz(char[] cArr, byte[] bArr) {
        this.a = null;
    }

    public hrz(boolean z) {
        this.a = z ? gta.d(true) : null;
    }

    public hrz(byte[] bArr) {
        this.a = new ikm((byte[]) null);
    }

    public hrz() {
    }
}
