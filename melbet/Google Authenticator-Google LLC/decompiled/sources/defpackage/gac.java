package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gac implements gpu {
    public static final hkh a = hkh.l("com/google/apps/tiktok/cache/OrphanCacheSingletonSynclet");
    public final Context b;
    public final Set c;
    public final gzp d;
    public final gpj e;
    private final hvl f;
    private final boolean g;

    public gac(Context context, Map map, gzp gzpVar, hvl hvlVar, gzp gzpVar2, gpj gpjVar) {
        this.b = context;
        this.c = map.keySet();
        this.d = gzpVar;
        this.f = hvlVar;
        this.g = ((Boolean) gzpVar2.d(false)).booleanValue();
        this.e = gpjVar;
    }

    private final hvi a(gpk gpkVar) {
        return this.f.submit(gvx.h(new evb(this, gpkVar, 7)));
    }

    @Override // defpackage.gpu
    public final hvi b() {
        if (this.g) {
            return hve.a;
        }
        hvl hvlVar = this.f;
        return hnu.aY(hvlVar.submit(gvx.h(new fnh(this, 13))), a(new gpk(1, 2)), a(new gpk(2, 2))).a(new bws(19), hvlVar);
    }
}
