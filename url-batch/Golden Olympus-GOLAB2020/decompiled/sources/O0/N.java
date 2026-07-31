package O0;

import android.content.Context;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: b, reason: collision with root package name */
    private static N f1140b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f1141c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private Context f1142a;

    private N() {
    }

    public static N a() {
        if (f1140b == null) {
            d();
        }
        return f1140b;
    }

    private static synchronized void d() {
        synchronized (N.class) {
            if (f1140b == null) {
                f1140b = new N();
            }
        }
    }

    public void b(Context context) {
        synchronized (f1141c) {
            try {
                if (this.f1142a != null) {
                    j0.m("hmsSdk", "DataManager already initialized.");
                    return;
                }
                this.f1142a = context;
                d0.e().d().b(this.f1142a);
                d0.e().d().u(context.getPackageName());
                C.a().d(context);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(String str) {
        j0.b("hmsSdk", "HiAnalyticsDataManager.setAppid(String appid) is execute.");
        Context context = this.f1142a;
        if (context == null) {
            j0.l("hmsSdk", "sdk is not init");
        } else {
            d0.e().d().s(AbstractC0415o.a("appID", str, "[a-zA-Z0-9_][a-zA-Z0-9. _-]{0,255}", context.getPackageName()));
        }
    }
}
