package e2;

import y.t;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f6244e;

    public /* synthetic */ q(t tVar, int i2) {
        this.f6243d = i2;
        this.f6244e = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6243d) {
            case 0:
                t tVar = this.f6244e;
                ((r) tVar.f11495i).f6253h.cancel(false);
                r rVar = (r) tVar.f11495i;
                rVar.f6247b = true;
                if (rVar.f6255j.y()) {
                    ((r) tVar.f11495i).f6255j.d("websocket opened", null, new Object[0]);
                }
                ((r) tVar.f11495i).e();
                break;
            default:
                t tVar2 = this.f6244e;
                if (((r) tVar2.f11495i).f6255j.y()) {
                    ((r) tVar2.f11495i).f6255j.d("closed", null, new Object[0]);
                }
                r.a((r) tVar2.f11495i);
                break;
        }
    }
}
