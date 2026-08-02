package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import java.util.Iterator;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class eqn implements koe {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ eqn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r7v47, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r7v49, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r7v74, types: [java.lang.Object, koe] */
    @Override // defpackage.koe, defpackage.kod
    public final Object b() {
        bah x;
        View view;
        switch (this.b) {
            case 0:
                return false;
            case 1:
                ?? r7 = this.a;
                if (!((gzp) r7.b()).f()) {
                    return null;
                }
                return null;
            case 2:
                return ((glu) this.a).a();
            case 3:
                return ((bd) this.a).F();
            case 4:
                return (kt) this.a.b();
            case 5:
                return (String) this.a.b();
            case 6:
                Object obj = this.a;
                return (gnc) azj.d((Context) obj).b((bg) obj);
            case 7:
                bd bdVar = (bd) this.a;
                bkj d = azj.d(bdVar.x());
                a.v(bdVar.x(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
                if (bmi.h()) {
                    x = d.a(bdVar.x().getApplicationContext());
                } else {
                    if (bdVar.D() != null) {
                        d.a.a(bdVar.D());
                    }
                    bdVar.F();
                    Context x2 = bdVar.x();
                    x = d.b.x(x2, azj.b(x2.getApplicationContext()), bdVar.L(), (!bdVar.ao() || bdVar.ap() || (view = bdVar.R) == null || view.getWindowToken() == null || bdVar.R.getVisibility() != 0) ? false : true);
                }
                return (gnc) x;
            case 8:
                int i = hel.d;
                heg hegVar = new heg(4);
                hegVar.h(new gor());
                hegVar.j(((gow) ((ldt) this.a).c).b());
                hegVar.h(new gpb());
                return hegVar.g();
            case 9:
                return this.a.b();
            case 10:
                return this.a.b();
            case 11:
                return this.a;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return hel.q(new idg(((idy) this.a).b));
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                int i2 = hel.d;
                heg hegVar2 = new heg(4);
                Iterator it = ((icp) this.a).d.iterator();
                while (it.hasNext()) {
                    hegVar2.h(((ics) it.next()).a());
                }
                hel g = hegVar2.g();
                g.getClass();
                return g;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return hel.q(new ifa(this.a, 0));
            case 15:
                return hel.q(new idx(((icp) this.a).a.n));
            case 16:
                return hel.q(new ifa(((icp) this.a).a, 1));
            case 17:
                return hel.q(this.a);
            case 18:
                return hel.q((hel) this.a.b());
            case 19:
                int i3 = igs.d;
                return juf.a.bB().a((Context) this.a);
            default:
                try {
                    Context context = ((igt) this.a).b;
                    return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException e) {
                    throw new AssertionError("Could not find our own package, this should be impossible.\nNo app version will appear in logs.", e);
                }
        }
    }
}
