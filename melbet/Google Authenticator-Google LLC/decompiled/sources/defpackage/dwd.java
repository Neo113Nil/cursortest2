package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dwd implements krt {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dwd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x020f  */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r0v52, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v6, types: [ggs, java.lang.Object] */
    @Override // defpackage.krt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj) {
        String str;
        long abs;
        int i = 1;
        switch (this.b) {
            case 0:
                View view = (View) obj;
                view.getClass();
                dwe dweVar = (dwe) this.a;
                dweVar.k.c(view, dweVar.b);
                return jiv.a;
            case 1:
                jit jitVar = (jit) obj;
                jitVar.getClass();
                dsf dsfVar = (dsf) this.a;
                if (dja.F(dsfVar, jitVar) != null) {
                    gzp gzpVar = dsfVar.e.k;
                }
                return null;
            case 2:
                View view2 = (View) obj;
                view2.getClass();
                ebp ebpVar = ((dwe) this.a).f;
                if (ebpVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ebpVar.f.onClick(view2);
                return jiv.a;
            case 3:
                View view3 = (View) obj;
                view3.getClass();
                return dja.A(view3, ((dup) this.a).a);
            case 4:
                View view4 = (View) obj;
                view4.getClass();
                dwe dweVar2 = (dwe) this.a;
                Object obj2 = ((bry) dweVar2.k.e).a;
                jit jitVar2 = dweVar2.b;
                ((dsf) obj2).d.c.a(view4, jitVar2 != null ? dja.F((dsf) obj2, jitVar2) : null);
                return jiv.a;
            case 5:
                View view5 = (View) obj;
                view5.getClass();
                this.a.a(view5);
                return jiv.a;
            case 6:
                ((View) obj).getClass();
                ((dwl) this.a).c.d(true);
                return jiv.a;
            case 7:
                ((View) obj).getClass();
                ((dwl) this.a).c.d(false);
                return kow.a;
            case 8:
                View view6 = (View) obj;
                view6.getClass();
                ((dwl) this.a).c.c(view6, null);
                return kow.a;
            case 9:
                jhh jhhVar = (jhh) obj;
                jhhVar.getClass();
                Object obj3 = this.a;
                obj3.getClass();
                return dih.J(jhhVar, (Context) obj3);
            case 10:
                jhh jhhVar2 = (jhh) obj;
                jhhVar2.getClass();
                Context context = ((TextView) ((iyi) this.a).b).getContext();
                context.getClass();
                return dih.J(jhhVar2, context);
            case 11:
                eat eatVar = (eat) this.a;
                if (eatVar.b) {
                    eatVar.a.j(eatVar.a());
                }
                return kow.a;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                View view7 = (View) obj;
                view7.getClass();
                return dja.A(view7, this.a);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ghm ghmVar = (ghm) obj;
                ghmVar.getClass();
                Object obj4 = this.a;
                try {
                    str = (String) ((ghn) obj4).o.a();
                } catch (dik e) {
                    Log.e("MendelPackageState", "Getting account name to commit for " + ((ghn) obj4).g + " would block", e);
                    str = null;
                    hnu.bw(str != null ? ((ghn) obj4).m.b().a(str, ghmVar.a, ghmVar.c) : hnu.aJ(null), "Failed to commit to config");
                    ghn ghnVar = (ghn) obj4;
                    ghnVar.v.a.add(ghnVar.g);
                    abs = Math.abs(Instant.now().toEpochMilli() - ghmVar.b);
                    TimeUnit timeUnit = TimeUnit.DAYS;
                    if (abs > 86400000) {
                    }
                    ghnVar.r.getClass();
                    return kow.a;
                } catch (Throwable th) {
                    Log.e("MendelPackageState", "Failed to get account name to commit for ".concat(((ghn) obj4).g), th);
                    str = null;
                    hnu.bw(str != null ? ((ghn) obj4).m.b().a(str, ghmVar.a, ghmVar.c) : hnu.aJ(null), "Failed to commit to config");
                    ghn ghnVar2 = (ghn) obj4;
                    ghnVar2.v.a.add(ghnVar2.g);
                    abs = Math.abs(Instant.now().toEpochMilli() - ghmVar.b);
                    TimeUnit timeUnit2 = TimeUnit.DAYS;
                    if (abs > 86400000) {
                    }
                    ghnVar2.r.getClass();
                    return kow.a;
                }
                hnu.bw(str != null ? ((ghn) obj4).m.b().a(str, ghmVar.a, ghmVar.c) : hnu.aJ(null), "Failed to commit to config");
                ghn ghnVar22 = (ghn) obj4;
                ghnVar22.v.a.add(ghnVar22.g);
                abs = Math.abs(Instant.now().toEpochMilli() - ghmVar.b);
                TimeUnit timeUnit22 = TimeUnit.DAYS;
                if (abs > 86400000) {
                    hnu.bw(hnu.aN(gvx.b(ghnVar22.n), ghnVar22.b), "Failed to fetch after encountering old config");
                }
                ghnVar22.r.getClass();
                return kow.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                List list = (List) obj;
                list.getClass();
                if (list.isEmpty()) {
                    return hnu.aJ(null);
                }
                ets b = ((ett) ((gid) this.a).a).b();
                iae[] iaeVarArr = (iae[]) list.toArray(new iae[0]);
                iae[] iaeVarArr2 = (iae[]) Arrays.copyOf(iaeVarArr, iaeVarArr.length);
                iaeVarArr2.getClass();
                dbx[] dbxVarArr = new dbx[iaeVarArr2.length];
                for (int i2 = 0; i2 < iaeVarArr2.length; i2++) {
                    iae iaeVar = iaeVarArr2[i2];
                    int[] iArr = new int[iaeVar.j.size()];
                    for (int i3 = 0; i3 < iaeVar.j.size(); i3++) {
                        iArr[i3] = iaeVar.j.e(i3);
                    }
                    String str2 = iaeVar.g;
                    int intValue = iaeVar.c == 2 ? ((Integer) iaeVar.d).intValue() : 0;
                    String[] strArr = (String[]) iaeVar.i.toArray(new String[0]);
                    byte[] x = iaeVar.k.x();
                    boolean z = iaeVar.l;
                    String str3 = iaeVar.e == 7 ? (String) iaeVar.f : "";
                    byte[] bArr = dbx.a;
                    iac b2 = iac.b(iaeVar.p);
                    if (b2 == null) {
                        b2 = iac.UNKNOWN;
                    }
                    dbxVarArr[i2] = new dbx(str2, intValue, strArr, x, z, iArr, str3, bArr, 1, b2.h);
                }
                return ets.g(b.a.a(dbxVarArr));
            case 15:
                return (iae) ((her) obj).get(this.a);
            case 16:
                String str4 = (String) obj;
                str4.getClass();
                Uri g = ((fxl) this.a).b(fxl.a, "phenotype/".concat(str4)).g();
                g.getClass();
                return g;
            case 17:
                String str5 = (String) obj;
                str5.getClass();
                Uri g2 = ((fxl) this.a).b(fxl.a, "phenotype/".concat(str5)).g();
                g2.getClass();
                return g2;
            case 18:
                Exception exc = (Exception) obj;
                exc.getClass();
                ((hkf) ((hkf) ((gjw) this.a).h.g()).h(exc).i("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "getListenersPreviouslySucceededAtThisVersion$<anonymous>", 436, "StartupAfterPackageReplacedWithRetryRunner.kt")).s("Failed to get listeners previously succeeded at this version");
                return kpk.a;
            case 19:
                Exception exc2 = (Exception) obj;
                exc2.getClass();
                ((hkf) ((hkf) ((gjw) this.a).h.g()).h(exc2).i("com/google/apps/tiktok/inject/StartupAfterPackageReplacedWithRetryRunner", "didAllListenersAlreadySucceedSqliteBacked$<anonymous>", 483, "StartupAfterPackageReplacedWithRetryRunner.kt")).s("Failed to get all listeners succeeded at this version");
                return false;
            default:
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = new ArrayList();
                sb.append("SELECT * FROM ListenerSuccessfulRuns WHERE version_code = ?");
                Object obj5 = this.a;
                gjw gjwVar = (gjw) obj5;
                arrayList.add(Long.valueOf(gjwVar.d));
                return new gwt(gjwVar.c().s(exf.q(sb, arrayList))).a(new gjp(new gjo(1), i), gjwVar.c).b().d(Exception.class, new gia(new dwd(obj5, 18), 11), huf.a);
        }
    }
}
