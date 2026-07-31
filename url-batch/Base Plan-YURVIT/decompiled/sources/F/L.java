package F;

import W0.C0066f;
import android.content.Intent;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public final class L extends P0.i implements O0.l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f273g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(int i2, Object obj) {
        super(1);
        this.f272f = i2;
        this.f273g = obj;
    }

    @Override // O0.l
    public final Object j(Object obj) {
        switch (this.f272f) {
            case 0:
                Throwable th = (Throwable) obj;
                P p2 = (P) this.f273g;
                if (th != null) {
                    p2.f295l.D(new b0(th));
                }
                if (p2.f297n.f203f != D0.g.f205a) {
                    ((Y) p2.f297n.a()).close();
                }
                return D0.h.f206a;
            case 1:
                C0066f c0066f = (C0066f) this.f273g;
                D0.h hVar = D0.h.f206a;
                c0066f.g(hVar);
                return hVar;
            case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService").setPackage((String) obj);
                P0.h.d(intent, "Intent(CustomTabsService…          .setPackage(it)");
                return Boolean.valueOf(((PackageManager) this.f273g).resolveService(intent, 0) != null);
            default:
                ((e1.h) this.f273g).b();
                return D0.h.f206a;
        }
    }
}
