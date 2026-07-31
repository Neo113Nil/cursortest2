package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.k;

/* loaded from: classes.dex */
public class n2 extends k.j {

    /* renamed from: b, reason: collision with root package name */
    private final i2 f17743b;

    public n2(m5.c cVar, i2 i2Var) {
        super(cVar);
        this.f17743b = i2Var;
    }

    private long i(m2 m2Var) {
        Long g7 = this.f17743b.g(m2Var);
        if (g7 != null) {
            return g7.longValue();
        }
        throw new IllegalStateException("Could not find identifier for JavaScriptChannel.");
    }

    public void h(m2 m2Var, k.j.a<Void> aVar) {
        if (this.f17743b.f(m2Var)) {
            c(Long.valueOf(i(m2Var)), aVar);
        } else {
            aVar.a(null);
        }
    }

    public void j(m2 m2Var, String str, k.j.a<Void> aVar) {
        super.g(Long.valueOf(i(m2Var)), str, aVar);
    }
}
