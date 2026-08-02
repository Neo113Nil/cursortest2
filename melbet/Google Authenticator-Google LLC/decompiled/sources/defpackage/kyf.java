package defpackage;

import android.os.Trace;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kyf implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kyf(Runnable runnable, int i) {
        this.c = i;
        this.b = "onFailed";
        this.a = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, ljr] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, ljr] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, ljr] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kmo] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kuv] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                this.a.c((kvj) this.b, kow.a);
                return;
            case 1:
                ((kkv) this.a).b.w.d(this.b);
                return;
            case 2:
                int i = lia.b;
                try {
                    ((lka) this.b).onRequestFinished((RequestFinishedInfo) this.a);
                    return;
                } catch (Exception e) {
                    jav.c("HttpEngineWrapper", "Exception thrown from observation task", e);
                    return;
                }
            case 3:
                new cyi("JavaUploadDataSinkBase#executeOnExecutor " + ((String) this.b) + " running callback", 2, null);
                try {
                    this.a.run();
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 4:
                ljq ljqVar = (ljq) this.b;
                String str = ljqVar.p;
                ljo ljoVar = ljqVar.b;
                ljoVar.a(new ljn(ljoVar, (UrlResponseInfo) this.a, str, 0), "onRedirectReceived");
                return;
            case 5:
                try {
                    this.b.a();
                    return;
                } catch (Throwable th3) {
                    ((ljq) this.a).b(new lis("System error", th3));
                    return;
                }
            case 6:
                try {
                    this.b.a();
                    return;
                } catch (Throwable th4) {
                    ((ljq) this.a).c(th4);
                    return;
                }
            case 7:
                try {
                    this.b.a();
                    return;
                } catch (Throwable th5) {
                    Object obj = this.a;
                    kkh kkhVar = new kkh(obj, 13, null);
                    ljq ljqVar2 = (ljq) obj;
                    ljqVar2.d(kkhVar, "enterUserErrorState");
                    ljqVar2.b(new lio("Exception received from UrlRequest.Callback", th5));
                    return;
                }
            case 8:
                String str2 = ljq.a;
                new cyi("Cronet JavaUrlRequest#executeOnExecutor " + ((String) this.b) + " running callback", 2, null);
                try {
                    this.a.run();
                    Trace.endSection();
                    return;
                } catch (Throwable th6) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            case 9:
                Object obj2 = this.b;
                Object obj3 = this.a;
                ((ljq) obj3).d(new kyf(obj3, obj2, 5), "read");
                return;
            case 10:
                Object obj4 = this.a;
                Object obj5 = this.b;
                try {
                    ((ljo) obj5).a.onSucceeded(((ljo) obj5).d, (UrlResponseInfo) obj4);
                } catch (Exception e2) {
                    ((ljo) obj5).d.i("onSucceded", e2);
                }
                ljo ljoVar2 = (ljo) obj5;
                ljoVar2.c();
                ljoVar2.d.r.a();
                return;
            case 11:
                new cyi("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor  " + ((String) this.b) + " running callback", 2, null);
                try {
                    this.a.run();
                    Trace.endSection();
                    return;
                } catch (Throwable th8) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                    }
                    throw th8;
                }
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                new cyi("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor " + ((String) this.b) + " running callback", 2, null);
                try {
                    this.a.run();
                    Trace.endSection();
                    return;
                } catch (Throwable th10) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th11) {
                        th10.addSuppressed(th11);
                    }
                    throw th10;
                }
            default:
                Object obj6 = this.a;
                Object obj7 = this.b;
                try {
                    ((ljo) obj7).a.onCanceled(((ljo) obj7).d, (UrlResponseInfo) obj6);
                } catch (Exception e3) {
                    ((ljo) obj7).d.i("onCanceled", e3);
                }
                ljo ljoVar3 = (ljo) obj7;
                ljoVar3.c();
                ljoVar3.d.r.a();
                return;
        }
    }

    public /* synthetic */ kyf(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ kyf(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public kyf(kkv kkvVar, kmo kmoVar, int i) {
        this.c = i;
        this.b = kmoVar;
        this.a = kkvVar;
    }
}
