package defpackage;

import java.io.File;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fxs implements htq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fxs(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r11v23, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r11v27, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v46, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r11v48, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v50, types: [gjj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v56, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v57, types: [grn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v59, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v60, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [hvi, java.lang.Object] */
    @Override // defpackage.htq
    public final hvi a() {
        switch (this.b) {
            case 0:
                fxt fxtVar = (fxt) this.a;
                azj b = azj.b(fxtVar.a);
                if (!bmi.h()) {
                    throw new IllegalArgumentException("You must call this method on a background thread");
                }
                b.a.e.e().b();
                hvl hvlVar = fxtVar.b;
                b.getClass();
                return hvlVar.submit(new fnh(b, 12));
            case 1:
                Object obj = this.a;
                fxo fxoVar = (fxo) obj;
                hel e = fxoVar.h.e(true);
                hfk hfkVar = new hfk();
                int i = ((his) e).c;
                for (int i2 = 0; i2 < i; i2++) {
                    File file = (File) e.get(i2);
                    try {
                        hfkVar.c(Integer.valueOf(Integer.parseInt(file.getName())));
                    } catch (NumberFormatException e2) {
                        ((hkf) ((hkf) ((hkf) fxo.a.f()).h(e2)).i("com/google/apps/tiktok/account/storage/WipeoutAccountsSynclet", "cleanUpObseleteAccountDirsInternal", 172, "WipeoutAccountsSynclet.java")).u("Account directory name is malformed. Directory name: %s", file.getName());
                    }
                }
                int i3 = 16;
                return hti.g(hoq.at(((iyi) ((fwm) fxoVar.g.b).a).h(), new esh(i3), huf.a), gvx.c(new egl(obj, hfkVar.g(), i3)), fxoVar.f);
            case 2:
                return this.a;
            case 3:
                return hnu.aJ(((jll) this.a.b()).f());
            case 4:
                return hoq.at(((htq) this.a.b()).a(), new fyc(gha.a, 13), huf.a);
            case 5:
                return hnu.aJ(this.a.b());
            case 6:
                return ((htq) this.a.b()).a();
            case 7:
                return hnu.aG(this.a);
            case 8:
                return ((ghn) this.a).q.c();
            case 9:
                return ((ghn) this.a).q.c();
            case 10:
                gty aB = hoq.aB(168, "Updating storage infos", gub.a, true);
                try {
                    hvi b2 = ((gid) this.a).b();
                    gaj.d(169, b2, "Failed to update StorageInfos after registration", new Object[0]);
                    aB.b(b2);
                    ixf.j(aB, null);
                    return b2;
                } finally {
                }
            case 11:
                hvi b3 = ((gid) this.a).b();
                gaj.d(173, b3, "Failed to update StorageInfos after registration", new Object[0]);
                return b3;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj2 = this.a;
                return hoq.ar(new avc(obj2, 20), ((iwq) obj2).d);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return hnu.aG(this.a);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return hti.f(this.a.a(), gvx.a(new fxn(10)), huf.a);
            case 15:
                Object obj3 = this.a;
                gjt gjtVar = new gjt(obj3, 3);
                gqn gqnVar = (gqn) obj3;
                return gqnVar.f(hoq.au(gqnVar.g, gjtVar, gqnVar.b));
            case 16:
                return this.a;
            case 17:
                return this.a.b();
            case 18:
                return this.a;
            default:
                return this.a;
        }
    }
}
