package io.flutter.plugins.webviewflutter;

import android.webkit.DownloadListener;
import io.flutter.plugins.webviewflutter.k;

/* loaded from: classes.dex */
public class d extends k.d {

    /* renamed from: b, reason: collision with root package name */
    private final i2 f17634b;

    public d(m5.c cVar, i2 i2Var) {
        super(cVar);
        this.f17634b = i2Var;
    }

    private long i(DownloadListener downloadListener) {
        Long g7 = this.f17634b.g(downloadListener);
        if (g7 != null) {
            return g7.longValue();
        }
        throw new IllegalStateException("Could not find identifier for DownloadListener.");
    }

    public void h(DownloadListener downloadListener, k.d.a<Void> aVar) {
        if (this.f17634b.f(downloadListener)) {
            c(Long.valueOf(i(downloadListener)), aVar);
        } else {
            aVar.a(null);
        }
    }

    public void j(DownloadListener downloadListener, String str, String str2, String str3, String str4, long j7, k.d.a<Void> aVar) {
        g(Long.valueOf(i(downloadListener)), str, str2, str3, str4, Long.valueOf(j7), aVar);
    }
}
