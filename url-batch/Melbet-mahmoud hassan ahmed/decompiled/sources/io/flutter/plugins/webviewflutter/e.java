package io.flutter.plugins.webviewflutter;

import android.webkit.DownloadListener;
import io.flutter.plugins.webviewflutter.e;
import io.flutter.plugins.webviewflutter.k;

/* loaded from: classes.dex */
public class e implements k.f {

    /* renamed from: a, reason: collision with root package name */
    private final i2 f17638a;

    /* renamed from: b, reason: collision with root package name */
    private final a f17639b;

    /* renamed from: c, reason: collision with root package name */
    private final d f17640c;

    public static class a {
        public b a(d dVar) {
            return new b(dVar);
        }
    }

    public static class b implements DownloadListener, p2 {

        /* renamed from: f, reason: collision with root package name */
        private d f17641f;

        public b(d dVar) {
            this.f17641f = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void d(Void r02) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(Void r02) {
        }

        @Override // io.flutter.plugins.webviewflutter.p2
        public void a() {
            d dVar = this.f17641f;
            if (dVar != null) {
                dVar.h(this, new k.d.a() { // from class: io.flutter.plugins.webviewflutter.f
                    @Override // io.flutter.plugins.webviewflutter.k.d.a
                    public final void a(Object obj) {
                        e.b.e((Void) obj);
                    }
                });
            }
            this.f17641f = null;
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j7) {
            d dVar = this.f17641f;
            if (dVar != null) {
                dVar.j(this, str, str2, str3, str4, j7, new k.d.a() { // from class: io.flutter.plugins.webviewflutter.g
                    @Override // io.flutter.plugins.webviewflutter.k.d.a
                    public final void a(Object obj) {
                        e.b.d((Void) obj);
                    }
                });
            }
        }
    }

    public e(i2 i2Var, a aVar, d dVar) {
        this.f17638a = i2Var;
        this.f17639b = aVar;
        this.f17640c = dVar;
    }

    @Override // io.flutter.plugins.webviewflutter.k.f
    public void a(Long l7) {
        this.f17638a.b(this.f17639b.a(this.f17640c), l7.longValue());
    }
}
