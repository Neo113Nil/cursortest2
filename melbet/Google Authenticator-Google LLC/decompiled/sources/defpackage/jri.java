package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jri implements jrw {
    private final jsb a;
    private final /* synthetic */ int b;

    public jri(jsb jsbVar, int i) {
        this.b = i;
        this.a = jsbVar;
    }

    public final gzp a() {
        int i = this.b;
        jsb jsbVar = this.a;
        if (i == 0) {
            return gzp.g((Activity) ((jrx) jsbVar).a);
        }
        gzp gzpVar = (gzp) ((jrx) jsbVar).a;
        if (!gzpVar.f()) {
            return gyf.a;
        }
        gzpVar.getClass();
        return gzp.h(new eks(gzpVar, 10));
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        return this.b != 0 ? a() : a();
    }
}
