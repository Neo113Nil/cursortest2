package defpackage;

import android.content.pm.PackageInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class emp implements jrw {
    private final jsb a;
    private final /* synthetic */ int b;

    public emp(jsb jsbVar, int i) {
        this.b = i;
        this.a = jsbVar;
    }

    public final Integer a() {
        int i = this.b;
        if (i == 0) {
            return Integer.valueOf(((bsh) this.a.b()).a);
        }
        jsb jsbVar = this.a;
        if (i != 1) {
            return Integer.valueOf(((PackageInfo) jsbVar.b()).versionCode);
        }
        Integer num = (Integer) ((gzp) ((jrx) jsbVar).a).d(4);
        num.intValue();
        return num;
    }

    @Override // defpackage.koe, defpackage.kod
    public final /* synthetic */ Object b() {
        int i = this.b;
        return i != 0 ? i != 1 ? a() : a() : a();
    }
}
