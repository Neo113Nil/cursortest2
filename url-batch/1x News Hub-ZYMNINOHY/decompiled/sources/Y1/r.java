package Y1;

import E1.AbstractC0033i;
import android.webkit.DownloadListener;

/* loaded from: classes.dex */
public final class r implements DownloadListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0113j f1883a;

    public r(C0113j c0113j) {
        this.f1883a = c0113j;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(final String str, final String str2, final String str3, final String str4, final long j3) {
        C0113j c0113j = this.f1883a;
        c0113j.f1861a.c(new Runnable() { // from class: Y1.p
            @Override // java.lang.Runnable
            public final void run() {
                C0120q c0120q = new C0120q(0);
                r rVar = r.this;
                C0113j c0113j2 = rVar.f1883a;
                String urlArg = str;
                kotlin.jvm.internal.j.e(urlArg, "urlArg");
                String userAgentArg = str2;
                kotlin.jvm.internal.j.e(userAgentArg, "userAgentArg");
                String contentDispositionArg = str3;
                kotlin.jvm.internal.j.e(contentDispositionArg, "contentDispositionArg");
                String mimetypeArg = str4;
                kotlin.jvm.internal.j.e(mimetypeArg, "mimetypeArg");
                A0.d dVar = c0113j2.f1861a;
                dVar.getClass();
                if (!((C0107d) dVar.f17b).d(rVar)) {
                    AbstractC0033i.q("missing-instance-error", "Callback to `DownloadListener.onDownloadStart` failed because native instance was not in the instance manager.", "");
                } else {
                    new B0.p((P1.f) dVar.f16a, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart", dVar.a(), (K0.j) null).h(c2.f.L(rVar, urlArg, userAgentArg, contentDispositionArg, mimetypeArg, Long.valueOf(j3)), new C0.f(7, c0120q));
                }
            }
        });
    }
}
