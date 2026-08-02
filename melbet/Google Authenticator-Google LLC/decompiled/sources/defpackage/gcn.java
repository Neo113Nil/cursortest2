package defpackage;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gcn implements jrw {
    private final jsb a;
    private final /* synthetic */ int b;

    public gcn(jsb jsbVar, int i) {
        this.b = i;
        this.a = jsbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        Set singleton;
        int i = 0;
        switch (this.b) {
            case 0:
                return new arv((aru) this.a.b());
            case 1:
                return new gcf((atd) this.a.b(), 0);
            case 2:
                String str = ((PackageInfo) this.a.b()).versionName;
                str.getClass();
                return str;
            case 3:
                kqn kqnVar = (kqn) this.a.b();
                kqnVar.getClass();
                return new lby(kqnVar, 1);
            case 4:
                kqn kqnVar2 = (kqn) this.a.b();
                kqnVar2.getClass();
                return new lby(kqnVar2, 1);
            case 5:
                return new iwq((gzp) ((jrx) this.a).a);
            case 6:
                fym fymVar = (fym) this.a.b();
                fymVar.getClass();
                return new ggr(fymVar, i);
            case 7:
                giz gizVar = (giz) this.a.b();
                gizVar.getClass();
                return new fyd(gizVar, 2);
            case 8:
                Map map = (Map) this.a.b();
                map.getClass();
                return new kee(map);
            case 9:
                iwq iwqVar = (iwq) this.a.b();
                iwqVar.getClass();
                return new kee(iwqVar);
            case 10:
                try {
                    return ((jrk) this.a).b().getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            case 11:
                return new iyi(ixc.D(new fbs[]{new fat(new gwh(((jrk) this.a).b(), (byte[]) null)), new faw()}));
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                giq giqVar = (giq) this.a.b();
                giqVar.getClass();
                return new gio(giqVar, 0);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return new ikj(this.a);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                frv frvVar = (frv) ((jrx) this.a).a;
                if (frvVar == null) {
                    singleton = Collections.EMPTY_SET;
                } else {
                    gua b = guc.b();
                    frw.a(b, frvVar);
                    singleton = Collections.singleton(((guc) b).f());
                }
                singleton.getClass();
                return singleton;
            case 15:
                Activity activity = (Activity) ((jrx) this.a).a;
                try {
                    return gzp.g((bg) activity);
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Expected activity to be a FragmentActivity: ".concat(String.valueOf(String.valueOf(activity))), e);
                }
            case 16:
                bd bdVar = (bd) ((jrx) this.a).a;
                return cka.q(bdVar, bdVar);
            case 17:
                return new gmz(jrv.a(this.a));
            case 18:
                return new gnj(((jrk) this.a).b());
            case 19:
                return new gnp((ddw) this.a.b());
            default:
                return deb.a(((jrk) this.a).b());
        }
    }
}
