package e2;

import B1.C0097d;
import y.t;

/* loaded from: classes.dex */
public final class p implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6241d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f6242e;

    public /* synthetic */ p(r rVar, int i2) {
        this.f6241d = i2;
        this.f6242e = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6241d) {
            case 0:
                r rVar = this.f6242e;
                if (!rVar.f6247b && !rVar.f6248c) {
                    C0097d c0097d = rVar.f6255j;
                    if (c0097d.y()) {
                        c0097d.d("timed out on connect", null, new Object[0]);
                    }
                    ((p2.e) rVar.f6246a.f11494e).a();
                    break;
                }
                break;
            default:
                r rVar2 = this.f6242e;
                t tVar = rVar2.f6246a;
                if (tVar != null) {
                    tVar.t("0");
                    rVar2.e();
                    break;
                }
                break;
        }
    }
}
