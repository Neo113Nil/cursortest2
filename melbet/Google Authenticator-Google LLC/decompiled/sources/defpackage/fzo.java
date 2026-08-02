package defpackage;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import com.google.android.apps.authenticator2.R;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class fzo implements gel {
    final /* synthetic */ fzp a;

    public fzo(fzp fzpVar) {
        this.a = fzpVar;
    }

    @Override // defpackage.gel
    public final void g(Throwable th) {
        Throwable th2;
        fzp fzpVar = this.a;
        final Intent intent = null;
        fzpVar.o = null;
        Throwable th3 = th;
        while (th3 != null) {
            if (th3 instanceof djp) {
                throw null;
            }
            if (th3 instanceof djn) {
                th3.getMessage();
                throw null;
            }
            if (th3 instanceof djq) {
                th3.getMessage();
                throw null;
            }
            if (th3 instanceof djo) {
                th3 = new cmb(0);
            }
            if ((th3 instanceof cmg) || (th3 instanceof UserRecoverableAuthException)) {
                th2 = th3;
                break;
            }
            th3 = th3.getCause();
        }
        th2 = null;
        if (th2 == null) {
            ((hkf) ((hkf) ((hkf) fzp.a.f()).h(th)).i("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/selector/core/ExpressSignInFragmentPeer$3", "onError", (char) 151, "ExpressSignInFragmentPeer.java")).s("Load accounts failed due to non user recoverable error.");
            fpm m = fpm.m(fzpVar.f.R, R.string.tiktok_load_account_failure, -2);
            m.o(R.string.tiktok_retry, new guu(fzpVar.h, 119, "Load account error, click retry", new View.OnClickListener() { // from class: fzm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fzo.this.a.a();
                }
            }));
            m.g();
            return;
        }
        if (th2 instanceof cmg) {
            intent = ((cmg) th2).a();
        } else {
            UserRecoverableAuthException userRecoverableAuthException = (UserRecoverableAuthException) th2;
            Intent intent2 = userRecoverableAuthException.a;
            if (intent2 == null) {
                int ordinal = userRecoverableAuthException.b.ordinal();
                if (ordinal == 0) {
                    Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
                } else if (ordinal == 1) {
                    Log.e("Auth", "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.");
                }
            } else {
                intent = new Intent(intent2);
            }
        }
        if (intent == null) {
            ((hkf) ((hkf) ((hkf) fzp.a.f()).h(th2)).i("com/google/apps/tiktok/account/ui/onegoogle/expresssignin/selector/core/ExpressSignInFragmentPeer$3", "onError", (char) 168, "ExpressSignInFragmentPeer.java")).s("Load accounts failed due to user recoverable error.");
            fpm.m(fzpVar.f.R, R.string.tiktok_play_services_error, -2).g();
        } else {
            fpm m2 = fpm.m(fzpVar.f.R, R.string.tiktok_play_services_error, -2);
            m2.o(R.string.tiktok_fix_it, new guu(fzpVar.h, 118, "Play services error, click fix", new View.OnClickListener() { // from class: fzn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    fzo.this.a.f.az(intent, 29878);
                }
            }));
            m2.g();
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [dov, java.lang.Object] */
    @Override // defpackage.gel
    public final /* synthetic */ void h(Object obj) {
        Object obj2;
        her herVar = (her) obj;
        gzp h = gzp.h(herVar);
        fzp fzpVar = this.a;
        fzpVar.n = h;
        int i = hel.d;
        heg hegVar = new heg(4);
        hjr it = herVar.entrySet().iterator();
        while (it.hasNext()) {
            fuf fufVar = (fuf) ((Map.Entry) it.next()).getKey();
            ful fulVar = fufVar.b;
            if (!fulVar.k.equals("incognito")) {
                if (fulVar.k.equals("pseudonymous")) {
                    fzpVar.o = fufVar;
                } else {
                    hegVar.h(fufVar);
                }
            }
        }
        hel g = hegVar.g();
        gwh gwhVar = fzpVar.k.f;
        drb drbVar = (drb) gwhVar.a;
        drbVar.h(g);
        if (!g.isEmpty() && drbVar.a() == null) {
            Object obj3 = gwhVar.c;
            if (obj3 != null) {
                int i2 = ((his) g).c;
                int i3 = 0;
                while (i3 < i2) {
                    obj2 = g.get(i3);
                    i3++;
                    if (((String) obj3).equals(gwhVar.b.c(obj2))) {
                        break;
                    }
                }
            }
            obj2 = null;
            if (obj2 == null || !g.contains(obj2)) {
                obj2 = g.get(0);
            }
            drbVar.i(obj2, 2);
        }
        if (g.isEmpty()) {
            return;
        }
        gwhVar.c = null;
    }

    @Override // defpackage.gel
    public final /* synthetic */ void i() {
    }
}
