package defpackage;

import android.widget.RadioButton;
import com.google.android.apps.authenticator2.R;
import com.google.android.apps.authenticator2.editotp.AccountView;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bqd {
    public final Object a;
    public final Object b;
    public final Object c;
    public Object d;

    public bqd(cfe cfeVar) {
        this.a = dks.e;
        this.d = null;
        this.b = (jkl) dkx.a.k();
        this.c = cfeVar.a;
        e(((hre) ((jkj) cfeVar.a).b).d);
    }

    public static RadioButton a(AccountView accountView) {
        return (RadioButton) accountView.findViewById(R.id.radio_button);
    }

    private final void e(int i) {
        Object obj = this.b;
        jkl jklVar = (jkl) obj;
        long j = ((dkx) jklVar.b).g + i;
        jkj jkjVar = (jkj) obj;
        if (!jkjVar.b.M()) {
            jkjVar.t();
        }
        dkx dkxVar = (dkx) jklVar.b;
        dkxVar.b |= 8;
        dkxVar.g = j;
    }

    private final void f(int i) {
        Object obj = this.b;
        jkl jklVar = (jkl) obj;
        long j = ((dkx) jklVar.b).h + i;
        jkj jkjVar = (jkj) obj;
        if (!jkjVar.b.M()) {
            jkjVar.t();
        }
        dkx dkxVar = (dkx) jklVar.b;
        dkxVar.b |= 16;
        dkxVar.h = j;
    }

    public final void b(dkq dkqVar) {
        Object obj = this.d;
        hoq.K(obj == null, "CVE %s has already been built.", obj);
        Object obj2 = this.b;
        jkl jklVar = (jkl) obj2;
        hre hreVar = ((dkx) jklVar.b).d;
        if (hreVar == null) {
            hreVar = hre.a;
        }
        hoq.H(!((hreVar.b & 2048) != 0));
        iwq iwqVar = dkqVar.b;
        if (!jklVar.an(iwqVar)) {
            int a = iwqVar.a();
            jkj jkjVar = (jkj) obj2;
            if (!jkjVar.b.M()) {
                jkjVar.t();
            }
            dkx dkxVar = (dkx) jklVar.b;
            jkt jktVar = dkxVar.c;
            if (!jktVar.c()) {
                dkxVar.c = jkp.y(jktVar);
            }
            dkxVar.c.g(a);
        }
        Object obj3 = dkqVar.a;
        jklVar.ao(iwqVar, obj3);
        e(iwqVar.a());
        e(iwqVar.hashCode());
        e(obj3.hashCode());
    }

    public final void c(dkr dkrVar) {
        Object obj = this.d;
        hoq.K(obj == null, "CVE %s has already been built.", obj);
        iwq iwqVar = dkrVar.b;
        Object obj2 = dkrVar.a;
        ((jkl) this.b).ao(iwqVar, obj2);
        f(iwqVar.a());
        f(iwqVar.hashCode());
        f(obj2.hashCode());
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, java.util.Set] */
    public final dks d(cka ckaVar) {
        hoq.I(this.d == null, "Cannot create CVE twice.");
        Object obj = this.b;
        jkj jkjVar = (jkj) obj;
        if (!jkjVar.b.M()) {
            jkjVar.t();
        }
        Object obj2 = this.c;
        dkx dkxVar = (dkx) ((jkl) obj).b;
        hre hreVar = (hre) ((jkj) obj2).q();
        dkx dkxVar2 = dkx.a;
        hreVar.getClass();
        dkxVar.d = hreVar;
        dkxVar.b = 1 | dkxVar.b;
        dks dksVar = new dks((jkl) ((dkx) jkjVar.q()).C(), (dja) this.a, ckaVar);
        this.d = dksVar;
        ?? r6 = dksVar.d.a;
        if (!r6.isEmpty()) {
            Iterator it = r6.iterator();
            while (it.hasNext()) {
                if (!((dlk) ((kee) it.next()).a).e) {
                    fao.c();
                }
            }
        }
        return (dks) this.d;
    }

    public bqd(AccountView accountView, brn brnVar, gnh gnhVar) {
        this.a = accountView;
        this.b = brnVar;
        this.c = gnhVar;
    }
}
