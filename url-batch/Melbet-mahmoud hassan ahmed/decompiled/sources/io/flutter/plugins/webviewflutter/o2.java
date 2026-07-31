package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import io.flutter.plugins.webviewflutter.k;

/* loaded from: classes.dex */
public class o2 implements k.l {

    /* renamed from: a, reason: collision with root package name */
    private final i2 f17748a;

    /* renamed from: b, reason: collision with root package name */
    private final a f17749b;

    /* renamed from: c, reason: collision with root package name */
    private final n2 f17750c;

    /* renamed from: d, reason: collision with root package name */
    private Handler f17751d;

    public static class a {
        public m2 a(n2 n2Var, String str, Handler handler) {
            return new m2(n2Var, str, handler);
        }
    }

    public o2(i2 i2Var, a aVar, n2 n2Var, Handler handler) {
        this.f17748a = i2Var;
        this.f17749b = aVar;
        this.f17750c = n2Var;
        this.f17751d = handler;
    }

    @Override // io.flutter.plugins.webviewflutter.k.l
    public void a(Long l7, String str) {
        this.f17748a.b(this.f17749b.a(this.f17750c, str, this.f17751d), l7.longValue());
    }

    public void b(Handler handler) {
        this.f17751d = handler;
    }
}
