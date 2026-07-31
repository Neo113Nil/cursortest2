package w0;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import u0.C3455b;
import u0.f;
import v0.AbstractC3461a;
import v0.InterfaceC3463c;

/* loaded from: classes.dex */
public class d extends AbstractC3461a {

    /* renamed from: c, reason: collision with root package name */
    private final Context f46580c;

    /* renamed from: d, reason: collision with root package name */
    private final String f46581d;

    /* renamed from: e, reason: collision with root package name */
    private volatile InterfaceC3463c f46582e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f46583f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private C3455b f46584g = C3455b.f46375b;

    /* renamed from: h, reason: collision with root package name */
    private final Map f46585h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private volatile f f46586i;

    public d(Context context, String str) {
        this.f46580c = context;
        this.f46581d = str;
    }

    private static String e(String str) {
        int i4 = 0;
        if (str.length() > 0) {
            while (str.charAt(i4) == '/') {
                i4++;
            }
        }
        return '/' + str.substring(i4);
    }

    private void f() {
        Log.d("AGC_ConfigImpl", "initConfigReader");
        if (this.f46582e == null) {
            synchronized (this.f46583f) {
                try {
                    if (this.f46582e == null) {
                        this.f46582e = new n(this.f46580c, this.f46581d);
                        this.f46586i = new f(this.f46582e);
                    }
                    h();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private String g(String str) {
        f.a aVar;
        Map a4 = u0.f.a();
        if (a4.containsKey(str) && (aVar = (f.a) a4.get(str)) != null) {
            return aVar.a(this);
        }
        return null;
    }

    private void h() {
        if (this.f46584g == C3455b.f46375b) {
            if (this.f46582e != null) {
                this.f46584g = b.f(this.f46582e.getString("/region", null), this.f46582e.getString("/agcgw/url", null));
            } else {
                Log.w("AGConnectServiceConfig", "get route fail , config not ready");
            }
        }
    }

    @Override // u0.d
    public String a(String str) {
        return i(str, null);
    }

    @Override // u0.d
    public C3455b b() {
        Log.d("AGC_ConfigImpl", "getRoutePolicy");
        if (this.f46584g == null) {
            this.f46584g = C3455b.f46375b;
        }
        C3455b c3455b = this.f46584g;
        C3455b c3455b2 = C3455b.f46375b;
        if (c3455b == c3455b2 && this.f46582e == null) {
            f();
        }
        C3455b c3455b3 = this.f46584g;
        return c3455b3 == null ? c3455b2 : c3455b3;
    }

    @Override // u0.d
    public Context getContext() {
        return this.f46580c;
    }

    @Override // u0.d
    public String getIdentifier() {
        return "DEFAULT_INSTANCE";
    }

    public String i(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("path must not be null.");
        }
        if (this.f46582e == null) {
            f();
        }
        String e4 = e(str);
        String str3 = (String) this.f46585h.get(e4);
        if (str3 != null) {
            return str3;
        }
        String g4 = g(e4);
        if (g4 != null) {
            return g4;
        }
        String string = this.f46582e.getString(e4, str2);
        return f.c(string) ? this.f46586i.a(string, str2) : string;
    }
}
