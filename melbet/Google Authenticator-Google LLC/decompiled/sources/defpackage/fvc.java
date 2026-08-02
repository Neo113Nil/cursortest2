package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fvc implements jrw {
    private final jsb a;
    private final jsb b;
    private final /* synthetic */ int c;

    public fvc(jsb jsbVar, jsb jsbVar2, int i) {
        this.c = i;
        this.a = jsbVar;
        this.b = jsbVar2;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        int i = 0;
        switch (this.c) {
            case 0:
                return ((gpn) this.a).b().b(fsq.a(), (iyi) this.b.b());
            case 1:
                return new fwm((koe) this.a, (Executor) this.b.b());
            case 2:
                Object obj = ((jrx) this.b).a;
                fuj b = ((fuk) this.a).b();
                gzp gzpVar = (gzp) obj;
                gzpVar.getClass();
                return gzpVar.f() ? (kee) gzpVar.b() : new kee(b, null);
            case 3:
                return new fwm(((fwb) this.b).b(), ((jrh) this.a).a());
            case 4:
                return new fwo((die) this.a.b(), (Executor) this.b.b(), i);
            case 5:
                return new fwm(((fwn) this.a).b(), ((fwu) this.b).b());
            case 6:
                return new fxw(((fxx) this.a).b(), ((bnu) this.b).a());
            case 7:
                return new fyk((fwm) this.a.b(), (gzp) ((jrx) this.b).a);
            case 8:
                azh azhVar = (azh) this.a.b();
                return new gcf(azhVar, 1);
            case 9:
                try {
                    auy i2 = auy.i(((jrk) this.a).b());
                    if (i2.i == null) {
                        synchronized (auy.a) {
                            if (i2.i == null) {
                                try {
                                    i2.i = (azh) Class.forName("androidx.work.multiprocess.RemoteWorkManagerClient").getConstructor(Context.class, auy.class).newInstance(i2.b, i2);
                                } catch (Throwable unused) {
                                    asq.a();
                                }
                                if (i2.i == null && !TextUtils.isEmpty(i2.c.i)) {
                                    throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                                }
                            }
                        }
                    }
                    azh azhVar2 = i2.i;
                    if (azhVar2 != null) {
                        return azhVar2;
                    }
                    throw new IllegalStateException("Unable to initialize RemoteWorkManager");
                } catch (IllegalStateException e) {
                    throw new IllegalStateException("RemoteWorkManager instantiation failed. You might be missing a dependency on\n\"//third_party/java/androidx/work:multiprocess\",", e);
                }
            case 10:
                Object obj2 = ((jrx) this.b).a;
                Context b2 = ((jrk) this.a).b();
                gzp gzpVar2 = (gzp) obj2;
                if (gzpVar2.f()) {
                    ((gcd) gzpVar2.b()).a();
                }
                try {
                    return atd.d(b2);
                } catch (IllegalStateException e2) {
                    throw new IllegalStateException("WorkManager instantiation failed. If you are in a test, add a dependency on\n\"//java/com/google/apps/tiktok/contrib/work/testing\",", e2);
                }
            case 11:
                Object hjnVar = ((Boolean) ((bnu) this.a).a().d(false)).booleanValue() ? new hjn(((gcx) this.b).b()) : hjb.a;
                hjnVar.getClass();
                return hjnVar;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                try {
                    PackageInfo packageInfo = ((gda) this.b).b().getPackageInfo(((jrk) this.a).b().getPackageName(), 0);
                    packageInfo.getClass();
                    return packageInfo;
                } catch (PackageManager.NameNotFoundException e3) {
                    throw new IllegalStateException("Can't find our own package", e3);
                }
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                jsb jsbVar = this.a;
                ikm b3 = ((gdf) this.b).b();
                hvm hvmVar = (hvm) jsbVar.b();
                hvmVar.getClass();
                kqn b4 = b3.b(hvmVar);
                b4.getClass();
                return b4;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                jsb jsbVar2 = this.a;
                ikm b5 = ((gdf) this.b).b();
                hvm hvmVar2 = (hvm) jsbVar2.b();
                hvmVar2.getClass();
                kqn b6 = b5.b(hvmVar2);
                b6.getClass();
                return b6;
            case 15:
                return new gpj((bd) ((jrx) this.a).a, (Executor) this.b.b());
            case 16:
                jsb jsbVar3 = this.b;
                Map b7 = ((jrz) this.a).b();
                Map b8 = ((jrz) jsbVar3).b();
                b7.getClass();
                b8.getClass();
                hen h = her.h(b7.size());
                for (Map.Entry entry : b7.entrySet()) {
                    String str = (String) entry.getKey();
                    ggh gghVar = (ggh) entry.getValue();
                    String str2 = (String) b8.get(str);
                    if (str2 != null) {
                        h.g(a.ag(str2, str, "#"), gghVar);
                    } else {
                        h.g(str, gghVar);
                    }
                }
                return h.d(true);
            case 17:
                jsb jsbVar4 = this.b;
                Map b9 = ((jrz) this.a).b();
                Map b10 = ((jrz) jsbVar4).b();
                b9.getClass();
                b10.getClass();
                hen henVar = new hen(4);
                for (String str3 : b9.keySet()) {
                    String str4 = (String) b10.get(str3);
                    if (str4 != null) {
                        String ag = a.ag(str4, str3, "#");
                        henVar.g(str3, ag);
                        henVar.g(ag, ag);
                    } else {
                        henVar.g(str3, str3);
                    }
                }
                return henVar.d(true);
            case 18:
                kee keeVar = (kee) this.b.b();
                Map map = ((jrt) this.a).a;
                map.getClass();
                keeVar.getClass();
                hfk i3 = hfm.i(map.size());
                for (String str5 : map.keySet()) {
                    i3.c(str5);
                    i3.c(keeVar.d(str5));
                }
                hfm g = i3.g();
                g.getClass();
                return g;
            case 19:
                boolean booleanValue = ((gjf) this.a).a().booleanValue();
                jsb jsbVar5 = this.b;
                jsbVar5.getClass();
                return booleanValue ? ixd.k(((gjz) jsbVar5).b()) : kpm.a;
            default:
                boolean booleanValue2 = ((gjf) this.a).a().booleanValue();
                jsb jsbVar6 = this.b;
                jsbVar6.getClass();
                return booleanValue2 ? ixd.k(((gkb) jsbVar6).b()) : kpm.a;
        }
    }

    public fvc(jsb jsbVar, jsb jsbVar2, int i, short[] sArr) {
        this.c = i;
        this.b = jsbVar;
        this.a = jsbVar2;
    }
}
