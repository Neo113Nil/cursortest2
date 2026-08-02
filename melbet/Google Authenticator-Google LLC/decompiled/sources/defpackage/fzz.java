package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fzz implements gpu {
    public static final hkh a = hkh.l("com/google/apps/tiktok/cache/OrphanCacheAccountSynclet");
    public final Set b;
    public final gzp c;
    private final fxl d;
    private final hvl e;
    private final boolean f;

    public fzz(Map map, gzp gzpVar, fxl fxlVar, hvl hvlVar, gzp gzpVar2) {
        this.b = map.keySet();
        this.c = gzpVar;
        this.d = fxlVar;
        this.e = hvlVar;
        this.f = ((Boolean) gzpVar2.d(false)).booleanValue();
    }

    private final hvi a(gpk gpkVar) {
        fxl fxlVar = this.d;
        return hti.f(fxlVar.d.submit(gvx.i(new bsp(fxlVar, gpkVar, 16))), new fyc(this, 2), this.e);
    }

    @Override // defpackage.gpu
    public final hvi b() {
        return this.f ? hve.a : hnu.aY(a(new gpk(1, 2)), a(new gpk(2, 2))).a(new bws(19), this.e);
    }
}
