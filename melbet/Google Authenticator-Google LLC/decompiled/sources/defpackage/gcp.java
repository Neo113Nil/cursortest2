package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gcp implements jrw {
    private final jsb a;
    private final jsb b;
    private final /* synthetic */ int c;

    public gcp(jsb jsbVar, jsb jsbVar2, int i) {
        this.c = i;
        this.a = jsbVar;
        this.b = jsbVar2;
    }

    public final String a() {
        if (this.c == 0) {
            String str = ((arv) this.a.b()).i;
            Context b = ((jrk) this.b).b();
            if (str == null) {
                str = b.getApplicationInfo().processName;
            }
            str.getClass();
            return str;
        }
        gzp a = ((bnu) this.b).a();
        gzp gzpVar = (gzp) ((jrx) this.a).a;
        if (!gzpVar.f()) {
            return (String) ((gzs) a).a;
        }
        jix jixVar = (jix) gzpVar.b();
        hoq.x(jixVar.c() == 1);
        Optional a2 = jixVar.a();
        a2.getClass();
        throw null;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        return this.c != 0 ? a() : a();
    }

    public gcp(jsb jsbVar, jsb jsbVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = jsbVar;
        this.a = jsbVar2;
    }
}
