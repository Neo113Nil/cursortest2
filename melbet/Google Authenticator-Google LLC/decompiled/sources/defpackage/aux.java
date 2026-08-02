package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import com.google.android.apps.authenticator2.R;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aux implements kri {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aux(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, kri] */
    /* JADX WARN: Type inference failed for: r5v3, types: [cvd, java.lang.Object] */
    @Override // defpackage.kri
    public final Object a() {
        switch (this.b) {
            case 0:
                auy auyVar = (auy) this.a;
                Context context = auyVar.b;
                int i = avs.a;
                if (Build.VERSION.SDK_INT >= 34) {
                    avq.a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                List e = avs.e(context, jobScheduler);
                if (e != null && !e.isEmpty()) {
                    Iterator it = e.iterator();
                    while (it.hasNext()) {
                        avs.f(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                auyVar.d.C().y();
                aub.a(auyVar.c, auyVar.d, auyVar.e);
                return kow.a;
            case 1:
                return new axg((ajw) this.a);
            case 2:
                this.a.a();
                return kow.a;
            case 3:
                dev devVar = (dev) this.a;
                return new bvw(devVar.b, devVar.a().a);
            case 4:
                return new dey(new kee(this.a));
            case 5:
                Object obj = this.a;
                return new dfb(((dev) obj).b, new kee(obj));
            case 6:
                Pattern pattern = fav.a;
                bvw bvwVar = (bvw) this.a;
                fau fauVar = new fau((Context) bvwVar.b);
                fauVar.b("androidatgoogle_privacy");
                fauVar.c("PrivacyScreenData.pb");
                Uri a = fauVar.a();
                fcj a2 = fck.a();
                a2.d(a);
                a2.c(dfe.a);
                return ((fym) bvwVar.a).a(a2.a());
            case 7:
                return new ckt(this.a, 4);
            case 8:
                return new cbs(this.a, 3);
            case 9:
                return new cbs(this.a, 2);
            case 10:
                return dqk.a(new dqb(), ((Resources) ((bse) this.a).b).getString(R.string.og_google_one_account_a11y));
            case 11:
                final bse bseVar = (bse) this.a;
                return dqk.a(new dqr() { // from class: dqc
                    @Override // defpackage.dqr
                    public final dqq a(kee keeVar) {
                        return new dqf((Resources) bse.this.b, keeVar, 1);
                    }
                }, ((Resources) bseVar.b).getString(R.string.og_google_membership_a11y));
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                duq duqVar = (duq) this.a;
                Object b = duqVar.i.b();
                b.getClass();
                dya dyaVar = (dya) b;
                String str = (String) duqVar.d().e();
                Object b2 = duqVar.j.b();
                b2.getClass();
                dvb dvbVar = (dvb) ((gzp) b2).e();
                Optional optional = (Optional) ((dvbVar == null || dvbVar.a()) ? dyaVar.f : Optional.empty());
                if (!optional.isPresent()) {
                    bst bstVar = (bst) dyaVar.e;
                    if (!bstVar.f() && !bstVar.g()) {
                        return null;
                    }
                }
                Object obj2 = dyaVar.b;
                Object obj3 = dyaVar.c;
                Object obj4 = dyaVar.h;
                Object obj5 = dyaVar.g;
                return new dvq((jiw) obj2, (iyh) obj3, (cwy) obj4, optional, (Optional) obj5, (Context) dyaVar.d, (Optional) dyaVar.a, (bst) dyaVar.e, str);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                duq duqVar2 = (duq) this.a;
                fym fymVar = (fym) duqVar2.k.b();
                if (fymVar == null) {
                    return null;
                }
                Object obj6 = fymVar.b;
                Object obj7 = fymVar.c;
                return new dvi((jiw) obj6, (iyh) obj7, fymVar.e, (Optional) fymVar.d, (Context) fymVar.a, (bst) fymVar.f);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Context context2 = (Context) ((fwm) this.a).a;
                ehi ehiVar = new ehi(context2);
                ehiVar.c(context2, null, null);
                return ehiVar;
            case 15:
                ((eat) this.a).c();
                return kow.a;
            case 16:
                return ((ekx) this.a).b();
            case 17:
                return ((ekx) this.a).b().c();
            case 18:
                return ((glu) this.a).O();
            case 19:
                return ((glu) this.a).N();
            default:
                return ((glu) this.a).P();
        }
    }
}
