package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.UserManager;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class edk implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ edk(eea eeaVar, efu efuVar, eed eedVar, dra draVar, int i) {
        this.e = i;
        this.a = eeaVar;
        this.b = efuVar;
        this.c = eedVar;
        this.d = draVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [dra, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [efu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v7, types: [efu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v3, types: [dme, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean isDemoUser;
        int i = this.e;
        if (i == 0) {
            this.b.f(new cfe(5), view);
            ((eed) this.c).a.c = this.d;
            ((eea) this.a).g(view);
            return;
        }
        if (i == 1) {
            ?? r7 = ((ldt) this.b).e;
            Object obj = this.c;
            dkv a = r7.a();
            dku a2 = ((cfe) obj).a();
            View view2 = (View) this.a;
            a.a(a2, view2);
            this.d.onClick(view2);
            return;
        }
        int i2 = 2;
        if (i == 2) {
            this.b.f(new cfe(5), view);
            Object a3 = ((eed) this.a).a.a();
            ((eea) this.d).d((eeg) this.c, a3);
            return;
        }
        ?? r72 = ((cbp) this.d).a;
        Object obj2 = ((gzs) this.b).a;
        if (r72.containsKey(obj2)) {
            isDemoUser = ((UserManager) ((Context) ((iwq) ((fwm) r72.get(obj2)).b).a).getSystemService(UserManager.class)).isDemoUser();
            if (isDemoUser) {
                return;
            }
            hoq.K(r72.containsKey(obj2), "No AddAccountHandler found for account type %s", obj2);
            fwm fwmVar = (fwm) r72.get(obj2);
            Object obj3 = fwmVar.b;
            iwq iwqVar = (iwq) obj3;
            Bundle bundle = (Bundle) ((gzp) iwqVar.c).d(new Bundle());
            bundle.putBoolean("allowSkip", false);
            Object obj4 = iwqVar.b;
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            Object obj5 = fwmVar.a;
            try {
                Object obj6 = ((cbp) obj4).a;
                hvi f = hti.f(hnu.aN(gvx.b(new bwr(obj6, new fvh(bundle, (Activity) obj5), 11)), ((iyi) obj6).c), gvx.a(new euy(13)), huf.a);
                Object obj7 = this.c;
                Object obj8 = this.a;
                StrictMode.setThreadPolicy(threadPolicy);
                ((gbi) obj7).i(new cbp(hti.g(f, gvx.c(new fvr(obj3, i2)), huf.a)), ((fzp) obj8).c);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        }
    }

    public /* synthetic */ edk(eea eeaVar, efu efuVar, eeg eegVar, eed eedVar, int i) {
        this.e = i;
        this.d = eeaVar;
        this.b = efuVar;
        this.c = eegVar;
        this.a = eedVar;
    }

    public /* synthetic */ edk(fzp fzpVar, gzp gzpVar, cbp cbpVar, gbi gbiVar, int i) {
        this.e = i;
        this.a = fzpVar;
        this.b = gzpVar;
        this.d = cbpVar;
        this.c = gbiVar;
    }

    public /* synthetic */ edk(ldt ldtVar, cfe cfeVar, View view, View.OnClickListener onClickListener, int i) {
        this.e = i;
        this.b = ldtVar;
        this.c = cfeVar;
        this.a = view;
        this.d = onClickListener;
    }
}
