package defpackage;

import android.app.Dialog;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dtv implements kzr {
    final /* synthetic */ dtw a;
    final /* synthetic */ FrameLayout b;
    final /* synthetic */ View c;

    public dtv(dtw dtwVar, FrameLayout frameLayout, View view) {
        this.a = dtwVar;
        this.b = frameLayout;
        this.c = view;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [dme, java.lang.Object] */
    @Override // defpackage.kzr
    public final /* synthetic */ Object cg(Object obj, kqj kqjVar) {
        dtw dtwVar = this.a;
        eia eiaVar = (eia) obj;
        eia eiaVar2 = dtwVar.al;
        if (eiaVar2 != null && !ksp.b(eiaVar2, eiaVar)) {
            dtwVar.d();
            return kow.a;
        }
        if (dtwVar.al == null) {
            dtwVar.al = eiaVar;
            dtwVar.aq.d(((dya) dtwVar.aG().a().b.b()).b(this.b));
            ldt c = dtwVar.aG().a().c();
            View view = this.c;
            dkr a = eiaVar.a();
            a.getClass();
            if (((iyh) c.d).a == null) {
                ksp.a("clientAuthSideChannel");
            }
            jkj k = hrd.a.k();
            k.getClass();
            jkj k2 = hqz.a.k();
            k2.getClass();
            boolean h = ((bst) c.b).h();
            if (!k2.b.M()) {
                k2.t();
            }
            hqz hqzVar = (hqz) k2.b;
            hqzVar.b |= 1;
            hqzVar.c = h;
            jkp q = k2.q();
            q.getClass();
            hqz hqzVar2 = (hqz) q;
            if (!k.b.M()) {
                k.t();
            }
            hrd hrdVar = (hrd) k.b;
            hrdVar.f = hqzVar2;
            hrdVar.b |= 128;
            jkp q2 = k.q();
            q2.getClass();
            dlb b = c.e.b();
            bqd q3 = c.q(230389, (hrd) q2);
            q3.c(a);
            q3.c(efr.a);
            b.b(view, q3);
            Dialog dialog = dtwVar.e;
            if (dialog == null) {
                throw new IllegalStateException(a.ab(dtwVar, "DialogFragment ", " does not have a Dialog."));
            }
            ((ea) dialog).f().b(dtwVar.M(), new dtu(dtwVar, view));
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.og_bento_menu_scrim);
            if (frameLayout != null) {
                dtwVar.aG().a().c().p(frameLayout, 90573, jfw.a);
            }
            dtr aF = dtwVar.aF();
            dui duiVar = dtwVar.an;
            if (duiVar == null) {
                ksp.a("fragmentScopedData");
                duiVar = null;
            }
            aF.a(eiaVar, duiVar);
        }
        return kow.a;
    }
}
