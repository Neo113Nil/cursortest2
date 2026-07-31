package io.flutter.plugins.webviewflutter;

import android.webkit.WebStorage;
import io.flutter.plugins.webviewflutter.k;

/* loaded from: classes.dex */
public class w2 implements k.w {

    /* renamed from: a, reason: collision with root package name */
    private final i2 f17810a;

    /* renamed from: b, reason: collision with root package name */
    private final a f17811b;

    public static class a {
        public WebStorage a() {
            return WebStorage.getInstance();
        }
    }

    public w2(i2 i2Var, a aVar) {
        this.f17810a = i2Var;
        this.f17811b = aVar;
    }

    @Override // io.flutter.plugins.webviewflutter.k.w
    public void a(Long l7) {
        this.f17810a.b(this.f17811b.a(), l7.longValue());
    }

    @Override // io.flutter.plugins.webviewflutter.k.w
    public void b(Long l7) {
        ((WebStorage) this.f17810a.h(l7.longValue())).deleteAllData();
    }
}
