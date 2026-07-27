package m1;

import B1.C0097d;

/* renamed from: m1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0858c implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f8257e;

    public /* synthetic */ RunnableC0858c(g gVar, int i2) {
        this.f8256d = i2;
        this.f8257e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8256d) {
            case 0:
                this.f8257e.f8272q.onDismiss(null);
                break;
            default:
                g gVar = this.f8257e;
                if (gVar.f8266k != null) {
                    if (gVar.f8266k == null) {
                        C0097d c0097d = new C0097d(17, false);
                        Object obj = g.f8261v;
                        c0097d.f987e = obj;
                        c0097d.f988i = obj;
                        c0097d.f989j = obj;
                        gVar.f8266k = c0097d;
                    }
                    gVar.f8266k.getClass();
                    break;
                }
                break;
        }
    }
}
