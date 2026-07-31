package s5;

import android.os.Bundle;
import android.util.Log;
import java.util.Map;
import m5.j;
import m5.k;
import s5.b;

/* loaded from: classes.dex */
final class a implements k.c {

    /* renamed from: f, reason: collision with root package name */
    private final b f21643f;

    /* renamed from: g, reason: collision with root package name */
    private k f21644g;

    a(b bVar) {
        this.f21643f = bVar;
    }

    private static Bundle a(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, map.get(str));
        }
        return bundle;
    }

    private void b(k.d dVar, String str) {
        dVar.a(Boolean.valueOf(this.f21643f.a(str)));
    }

    private void c(k.d dVar) {
        this.f21643f.b();
        dVar.a(null);
    }

    private void d(j jVar, k.d dVar, String str) {
        b.a c7 = this.f21643f.c(str, a((Map) jVar.a("headers")), ((Boolean) jVar.a("useWebView")).booleanValue(), ((Boolean) jVar.a("enableJavaScript")).booleanValue(), ((Boolean) jVar.a("enableDomStorage")).booleanValue());
        if (c7 == b.a.NO_ACTIVITY) {
            dVar.b("NO_ACTIVITY", "Launching a URL requires a foreground activity.", null);
        } else if (c7 == b.a.ACTIVITY_NOT_FOUND) {
            dVar.b("ACTIVITY_NOT_FOUND", String.format("No Activity found to handle intent { %s }", str), null);
        } else {
            dVar.a(Boolean.TRUE);
        }
    }

    @Override // m5.k.c
    public void C(j jVar, k.d dVar) {
        String str;
        str = (String) jVar.a("url");
        String str2 = jVar.f19247a;
        str2.hashCode();
        switch (str2) {
            case "launch":
                d(jVar, dVar, str);
                break;
            case "canLaunch":
                b(dVar, str);
                break;
            case "closeWebView":
                c(dVar);
                break;
            default:
                dVar.c();
                break;
        }
    }

    void e(m5.c cVar) {
        if (this.f21644g != null) {
            Log.wtf("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            f();
        }
        k kVar = new k(cVar, "plugins.flutter.io/url_launcher_android");
        this.f21644g = kVar;
        kVar.e(this);
    }

    void f() {
        k kVar = this.f21644g;
        if (kVar == null) {
            Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
        } else {
            kVar.e(null);
            this.f21644g = null;
        }
    }
}
