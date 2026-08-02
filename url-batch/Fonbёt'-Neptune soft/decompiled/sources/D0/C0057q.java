package D0;

import A.C0002c;
import I.C0079n;
import android.webkit.DownloadListener;
import w0.InterfaceC0320f;

/* renamed from: D0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057q implements DownloadListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0050j f399a;

    public C0057q(C0050j c0050j) {
        this.f399a = c0050j;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(final String str, final String str2, final String str3, final String str4, final long j2) {
        C0050j c0050j = this.f399a;
        c0050j.f366a.c(new Runnable() { // from class: D0.o
            @Override // java.lang.Runnable
            public final void run() {
                C0056p c0056p = new C0056p(0);
                C0057q c0057q = C0057q.this;
                C0050j c0050j2 = c0057q.f399a;
                String str5 = str;
                Q0.h.e(str5, "urlArg");
                String str6 = str2;
                Q0.h.e(str6, "userAgentArg");
                String str7 = str3;
                Q0.h.e(str7, "contentDispositionArg");
                String str8 = str4;
                Q0.h.e(str8, "mimetypeArg");
                O o2 = c0050j2.f366a;
                o2.getClass();
                new C0079n((InterfaceC0320f) o2.f260b, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart", o2.a(), null).h(G0.e.O(c0057q, str5, str6, str7, str8, Long.valueOf(j2)), new C0002c(11, c0056p));
            }
        });
    }
}
