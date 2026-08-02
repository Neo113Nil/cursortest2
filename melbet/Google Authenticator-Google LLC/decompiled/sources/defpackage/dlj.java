package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dlj implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dlj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v40, types: [duj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v5, types: [dof, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6, types: [dof, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 8;
        int i2 = 0;
        gjl gjlVar = null;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                dlk dlkVar = (dlk) obj;
                dlkVar.g = null;
                if (!dlkVar.c.c()) {
                    return;
                }
                gty aC = hoq.aC(53, "GIL:AutoProcessBatch");
                try {
                    ((dlk) obj).a.b(new dli(obj, i2));
                    aC.close();
                    return;
                } finally {
                }
            case 1:
                ((dlk) this.a).a();
                return;
            case 2:
                this.a.b();
                return;
            case 3:
                this.a.a();
                return;
            case 4:
                ((AccountParticleDisc) this.a).o();
                return;
            case 5:
                AccountParticleDisc accountParticleDisc = (AccountParticleDisc) this.a;
                if (accountParticleDisc.f != null) {
                    dpn b = accountParticleDisc.b();
                    if (b != null) {
                        accountParticleDisc.a.o(2, 1);
                    }
                    accountParticleDisc.f.a(b, true);
                    return;
                }
                return;
            case 6:
                Map map = dpl.a;
                Object obj2 = this.a;
                final dpk dpkVar = (dpk) obj2;
                ImageView imageView = (ImageView) dpkVar.a.get();
                if (dpkVar.e || imageView == null) {
                    return;
                }
                Object obj3 = dpkVar.b;
                Integer num = (Integer) dih.R(imageView).d(0);
                final int intValue = num.intValue();
                final String format = String.format(Locale.ROOT, "%s %s", new StringBuilder(dpkVar.d.c(obj3)).toString(), num);
                Drawable drawable = (Drawable) dpl.a.get(format);
                if (drawable != null) {
                    dih.W(new dgc(obj2, drawable, 19, null == true ? 1 : 0));
                    return;
                }
                eeq eeqVar = dpkVar.c;
                final Drawable drawable2 = (Drawable) dpl.b.get(format);
                if (drawable2 != null) {
                    dih.W(new dgc(obj2, drawable2, 13, null == true ? 1 : 0));
                }
                final ees eesVar = eeqVar.b;
                ees eesVar2 = eeqVar.a;
                dvy dvyVar = (dvy) eesVar2;
                hnu.aS(dvyVar.b.c(((jit) obj3).c, dih.P(dvyVar.a, intValue)), new ecu(new eer() { // from class: dph
                    @Override // defpackage.eer
                    public final void a(Bitmap bitmap) {
                        dpk dpkVar2 = dpk.this;
                        if (dpkVar2.e) {
                            return;
                        }
                        String str = format;
                        if (bitmap != null) {
                            dpkVar2.c(new ajx((Object) dpkVar2, (Object) bitmap, (Object) str, 13, (byte[]) null));
                            return;
                        }
                        Drawable drawable3 = drawable2;
                        if (drawable3 != null) {
                            dih.W(new dgc(dpkVar2, drawable3, 16, null));
                        } else if (!cka.k(eet.a(dpkVar2.b, dpkVar2.d))) {
                            dih.W(new dlj(dpkVar2, 7));
                        } else {
                            dpkVar2.c(new dpi(dpkVar2, eesVar, intValue, str, 0));
                        }
                    }
                }, dvyVar, 1), huf.a);
                return;
            case 7:
                ((dpk) this.a).b();
                return;
            case 8:
                ((View) this.a).requestLayout();
                return;
            case 9:
                SelectedAccountDisc selectedAccountDisc = ((drp) this.a).b;
                selectedAccountDisc.setContentDescription(null);
                int i3 = yq.a;
                selectedAccountDisc.setImportantForAccessibility(4);
                return;
            case 10:
                drp drpVar = (drp) this.a;
                SelectedAccountDisc selectedAccountDisc2 = drpVar.b;
                AccountParticleDisc accountParticleDisc2 = selectedAccountDisc2.b;
                accountParticleDisc2.setVisibility(0);
                selectedAccountDisc2.a.setVisibility(8);
                accountParticleDisc2.getClass();
                selectedAccountDisc2.post(new dlj(accountParticleDisc2, i));
                drpVar.b();
                return;
            case 11:
                ((dsn) this.a).a.a.setEnabled(true);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                dsf dsfVar = ((dst) this.a).b;
                Object a = dsfVar.b.a();
                jkj k = jnu.a.k();
                if (!k.b.M()) {
                    k.t();
                }
                jkp jkpVar = k.b;
                jnu jnuVar = (jnu) jkpVar;
                jnuVar.d = 8;
                jnuVar.b = 2 | jnuVar.b;
                if (!jkpVar.M()) {
                    k.t();
                }
                jkp jkpVar2 = k.b;
                jnu jnuVar2 = (jnu) jkpVar2;
                jnuVar2.f = 8;
                jnuVar2.b |= 32;
                if (!jkpVar2.M()) {
                    k.t();
                }
                jkp jkpVar3 = k.b;
                jnu jnuVar3 = (jnu) jkpVar3;
                jnuVar3.e = 3;
                jnuVar3.b = 8 | jnuVar3.b;
                if (!jkpVar3.M()) {
                    k.t();
                }
                efc efcVar = dsfVar.f;
                jnu jnuVar4 = (jnu) k.b;
                jnuVar4.c = 32;
                jnuVar4.b |= 1;
                efcVar.a(a, (jnu) k.q());
                return;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj4 = this.a;
                dtw dtwVar = (dtw) obj4;
                dtn dtnVar = dtwVar.am;
                if (dtnVar == null) {
                    return;
                }
                Object b2 = dtwVar.aG().a.b();
                b2.getClass();
                fwm fwmVar = (fwm) b2;
                dtm dtmVar = dtnVar.a;
                if (dtmVar instanceof dty) {
                    String str = ((dty) dtmVar).a;
                    Object obj5 = fwmVar.b;
                    cwd cwdVar = cwe.a;
                    cpa cpaVar = new cpa();
                    cpaVar.b = new cli[]{cvb.a};
                    cpaVar.a = new ciu(str, 11);
                    cpaVar.c = 28006;
                    ((cms) obj5).i(0, cpaVar.a());
                } else if (dtmVar instanceof dtl) {
                    new dvn((cwy) fwmVar.b, ((dtl) dtmVar).a, 7, (Context) fwmVar.a, 1).a();
                } else if (!ksp.b(dtmVar, dul.a)) {
                    throw new koj();
                }
                dtwVar.am = null;
                if (dtnVar.b == jiv.a) {
                    ((ar) obj4).d();
                    return;
                }
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((dtw) this.a).aG().c().n(null, null, null);
                return;
            case 15:
                ?? r13 = this.a;
                if (by.U(2)) {
                    Objects.toString(r13);
                }
                ar arVar = (ar) r13;
                arVar.b = 0;
                arVar.c = R.style.OneGoogle_Dialog_Bento;
                dtw dtwVar2 = (dtw) r13;
                duh aG = dtwVar2.aG();
                iyh c = aG.c();
                eff a2 = dtwVar2.aG().a().a();
                gjl gjlVar2 = dtwVar2.ar;
                if (gjlVar2 == null) {
                    ksp.a("appStateDataInterface");
                    gjlVar2 = null;
                }
                c.n(r13, a2, (fwm) gjlVar2.d);
                dtwVar2.aG().a().a().g++;
                gjl gjlVar3 = dtwVar2.ar;
                if (gjlVar3 == null) {
                    ksp.a("appStateDataInterface");
                } else {
                    gjlVar = gjlVar3;
                }
                dtwVar2.an = new dui(gjlVar, aG.b(), new be(r13, 10), new ajq((Object) r13, 18));
                return;
            case 16:
                dtw dtwVar3 = (dtw) this.a;
                if (dtwVar3.ar == null) {
                    ksp.a("appStateDataInterface");
                }
                dtwVar3.aG().a().b().a = null;
                return;
            case 17:
                eby ebyVar = (eby) this.a;
                hel g = ebyVar.j.g();
                g.getClass();
                ebyVar.l(g);
                return;
            case 18:
                ecb ecbVar = (ecb) this.a;
                ecbVar.a(ecbVar.c);
                return;
            case 19:
                ecg ecgVar = (ecg) this.a;
                ecgVar.a(ecgVar.c);
                return;
            default:
                ecg ecgVar2 = (ecg) this.a;
                ecgVar2.a(ecgVar2.c);
                return;
        }
    }
}
