package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vz implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public vz(brn brnVar, int i, int i2) {
        this.c = i2;
        this.b = brnVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                Object obj = ((brn) this.b).a;
                if (obj != null) {
                    ((uw) obj).a(this.a);
                    break;
                }
                break;
            case 1:
                ((uw) this.b).a(this.a);
                break;
            case 2:
                ((coc) this.b).k(this.a);
                break;
            case 3:
                ((eql) this.b).a(this.a + 1);
                break;
            case 4:
                ((gah) this.b).stopSelf(this.a);
                break;
            case 5:
                ((ier) this.b).f().d(this.a);
                break;
            case 6:
                ((iey) this.b).f().d(this.a);
                break;
            case 7:
                ((ifb) this.b).c.d(this.a);
                break;
            case 8:
                ifm ifmVar = (ifm) this.b;
                if (!ifmVar.h) {
                    int i = this.a;
                    if (ifmVar.e.e != 4) {
                        ifmVar.d += i;
                        break;
                    } else {
                        ifmVar.j.d(i);
                        break;
                    }
                }
                break;
            case 9:
                try {
                    int i2 = kob.a;
                    kjf kjfVar = ((kel) this.b).m;
                    int i3 = this.a;
                    if (!kjfVar.b()) {
                        kjfVar.e += i3;
                        kjfVar.a();
                        break;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    ((kel) this.b).k(th);
                    return;
                }
            case 10:
                ((kgc) this.b).g.d(this.a);
                break;
            case 11:
                ((kgh) this.b).f.g(this.a);
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ((kgh) this.b).f.r(this.a);
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((kgh) this.b).f.s(this.a);
                break;
            default:
                ((lkd) this.b).onStatus(this.a);
                break;
        }
    }

    public /* synthetic */ vz(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    public vz(Object obj, int i, int i2, byte[] bArr) {
        this.c = i2;
        this.a = i;
        this.b = obj;
    }
}
