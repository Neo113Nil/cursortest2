package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class as implements Runnable {
    public final /* synthetic */ bd a;
    private final /* synthetic */ int b;

    public as(ar arVar, int i) {
        this.b = i;
        this.a = arVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                bd bdVar = this.a;
                bdVar.e(bdVar.D.c);
                break;
            case 1:
                ar arVar = (ar) this.a;
                arVar.a.onDismiss(arVar.e);
                break;
            case 2:
                this.a.ab.a(aej.ON_DESTROY);
                break;
            case 3:
                this.a.g();
                break;
            case 4:
                this.a.j();
                break;
            case 5:
                this.a.ag.b(aej.ON_START);
                break;
            case 6:
                this.a.ab.a(aej.ON_START);
                break;
            case 7:
                bd bdVar2 = this.a;
                ci ciVar = bdVar2.ab;
                ciVar.b.i(bdVar2.k);
                bdVar2.k = null;
                break;
            case 8:
                this.a.ab.a(aej.ON_STOP);
                break;
            case 9:
                this.a.ag.b(aej.ON_STOP);
                break;
            case 10:
                this.a.k();
                break;
            case 11:
                this.a.h();
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                this.a.ac();
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                this.a.ag.b(aej.ON_RESUME);
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                this.a.ab.a(aej.ON_RESUME);
                break;
            case 15:
                this.a.ab.a(aej.ON_CREATE);
                break;
            case 16:
                this.a.ab.a(aej.ON_PAUSE);
                break;
            case 17:
                this.a.ag.b(aej.ON_PAUSE);
                break;
            case 18:
                this.a.aa();
                break;
            case 19:
                this.a.ag.b(aej.ON_DESTROY);
                break;
            default:
                this.a.Z();
                break;
        }
    }

    public /* synthetic */ as(bd bdVar, int i) {
        this.b = i;
        this.a = bdVar;
    }
}
