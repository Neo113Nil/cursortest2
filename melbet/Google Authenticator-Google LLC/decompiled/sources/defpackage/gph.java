package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gph implements jrw {
    private final jsb a;
    private final /* synthetic */ int b;

    public gph(jsb jsbVar, int i) {
        this.b = i;
        this.a = jsbVar;
    }

    /* JADX WARN: Type inference failed for: r6v100, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r6v69, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r6v78, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r6v91, types: [java.lang.Object, koe] */
    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        switch (this.b) {
            case 0:
                return new gpg(((jrk) this.a).b(), 0);
            case 1:
                return new ikj(((jrk) this.a).b());
            case 2:
                return new gpi(((jrk) this.a).b(), 0);
            case 3:
                Context b = ((jrk) this.a).b();
                djl.g();
                return new iyi(hel.r(new fat(new gwh(b, (byte[]) null)), new faw()));
            case 4:
                return new gpj(((jrk) this.a).b());
            case 5:
                return new gpy(((jrk) this.a).b(), 1);
            case 6:
                return new gti((gvn) this.a.b(), 0);
            case 7:
                return new gtp((ExecutorService) this.a.b());
            case 8:
                gva gvaVar = (gva) this.a.b();
                gvaVar.getClass();
                return new grv(gvaVar, 3);
            case 9:
                return new brn((gvn) ((gzs) ((bnu) this.a).a()).a, (byte[]) null);
            case 10:
                Object obj = ((ikm) this.a.b()).a;
                obj.getClass();
                return obj;
            case 11:
                return new ifv(this.a);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Set b2 = ((jsd) this.a).b();
                gzl gzlVar = igg.a;
                hfk hfkVar = new hfk();
                Iterator it = b2.iterator();
                while (it.hasNext()) {
                    hfkVar.c(new iec((String) it.next()));
                }
                hfm g = hfkVar.g();
                g.getClass();
                return g;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Activity a = ((jrh) this.a).a();
                try {
                    return (bg) a;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Expected activity to be a FragmentActivity: ".concat(a.toString()), e);
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Activity activity = (Activity) ((jrx) this.a).a;
                try {
                    return activity == null ? gyf.a : gzp.h((bg) activity);
                } catch (ClassCastException e2) {
                    throw new IllegalStateException("Expected activity to be a FragmentActivity: ".concat(String.valueOf(String.valueOf(activity))), e2);
                }
            case 15:
                String packageName = ((jrk) this.a).b().getPackageName();
                packageName.getClass();
                return packageName;
            case 16:
                return Boolean.valueOf(((kee) ((jvr) this.a).b().a.b()).c("tiktok.device", "45670050").c());
            case 17:
                return Boolean.valueOf(((kee) ((jvx) this.a).b().a.b()).c("tiktok.device", "45724886").c());
            case 18:
                String packageName2 = ((jrk) this.a).b().getPackageName();
                packageName2.getClass();
                return packageName2;
            case 19:
                return Boolean.valueOf(((kee) ((jwe) this.a).b().a.b()).c("tiktok.directboot", "45760529").c());
            default:
                return Boolean.valueOf(((kee) ((jwh) this.a).b().a.b()).c("tiktok.directboot", "45770504").c());
        }
    }
}
