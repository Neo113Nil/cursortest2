package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewr {
    private final boolean a;
    private Map b;

    public ewr(gzp gzpVar, Map map) {
        this.a = !gzpVar.f();
        this.b = map;
    }

    public final void a() {
        if (this.a) {
            fao.c();
        }
        this.b.getClass();
        for (ewp ewpVar : ewp.values()) {
            ewq ewqVar = (ewq) this.b.get(ewpVar);
            if (ewqVar != null) {
                ewqVar.a();
            }
        }
        this.b = null;
    }
}
