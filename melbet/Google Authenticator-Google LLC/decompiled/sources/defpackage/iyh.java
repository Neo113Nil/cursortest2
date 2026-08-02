package defpackage;

import android.content.Intent;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iyh {
    public Object a;
    public Object b;
    public Object c;

    public iyh(byte[] bArr) {
        this.c = null;
        this.b = null;
        this.a = hza.d;
    }

    public final hzb a() {
        Object obj = this.c;
        if (obj == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.a == null) {
            throw new GeneralSecurityException("variant not set");
        }
        ((Integer) obj).intValue();
        ((Integer) this.b).intValue();
        return new hzb((hza) this.a);
    }

    public final void b() {
        this.c = 32;
    }

    public final void c() {
        this.b = 16;
    }

    public final gzp d() {
        Object obj = this.b;
        if (obj != null) {
            return (gzp) obj;
        }
        ksp.a("appIdentifier");
        return null;
    }

    public final void e(Intent intent, dtn dtnVar, int i) {
        Object obj;
        Object obj2 = this.b;
        if (obj2 == null) {
            Object obj3 = this.c;
            if (obj3 == null || (obj = this.a) == null) {
                return;
            }
            ((fwm) obj).C(efe.b, (eff) obj3, i);
            return;
        }
        dtw dtwVar = (dtw) obj2;
        dtwVar.am = dtnVar;
        oc ocVar = dtwVar.ao;
        if (ocVar == null) {
            dtwVar.ap.ay(intent);
        } else {
            ocVar.b(intent);
        }
    }

    public final chu f() {
        Object obj;
        Object obj2;
        Object obj3 = this.c;
        if (obj3 != null && (obj = this.b) != null && (obj2 = this.a) != null) {
            return new chu((String) obj3, (String) obj, null, null, (byte[]) obj2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" title");
        }
        if (this.b == null) {
            sb.append(" dismissButtonLabel");
        }
        if (this.a == null) {
            sb.append(" richBodyTextHtmlProtoBytes");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null dismissButtonLabel");
        }
        this.b = str;
    }

    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.c = str;
    }

    public final void i(hpo hpoVar) {
        this.a = hpoVar.f();
    }

    public final ces j() {
        Object obj;
        Object obj2 = this.c;
        if (obj2 != null && (obj = this.a) != null) {
            return new ces((String) obj2, (byte[]) this.b, (ccn) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" backendName");
        }
        if (this.a == null) {
            sb.append(" priority");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void k(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.c = str;
    }

    public final void l(ccn ccnVar) {
        if (ccnVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.a = ccnVar;
    }

    public final boolean m() {
        return this.b != null;
    }

    public final void n(duj dujVar, eff effVar, fwm fwmVar) {
        this.b = dujVar;
        if (effVar != null) {
            this.c = effVar;
        }
        if (fwmVar != null) {
            this.a = fwmVar;
        }
    }

    public iyh() {
    }
}
