package y0;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import u0.AbstractC3456c;
import u0.C3455b;
import u0.f;
import v0.AbstractC3461a;

/* loaded from: classes.dex */
public class b extends AbstractC3456c {

    /* renamed from: d, reason: collision with root package name */
    private static List f46721d;

    /* renamed from: e, reason: collision with root package name */
    private static final Map f46722e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private static String f46723f;

    /* renamed from: a, reason: collision with root package name */
    private final u0.d f46724a;

    /* renamed from: b, reason: collision with root package name */
    private final d f46725b;

    /* renamed from: c, reason: collision with root package name */
    private final d f46726c;

    static class a implements f.a {
        a() {
        }

        @Override // u0.f.a
        public String a(u0.d dVar) {
            String str;
            if (dVar.b().equals(C3455b.f46376c)) {
                str = "/agcgw_all/CN";
            } else if (dVar.b().equals(C3455b.f46378e)) {
                str = "/agcgw_all/RU";
            } else if (dVar.b().equals(C3455b.f46377d)) {
                str = "/agcgw_all/DE";
            } else {
                if (!dVar.b().equals(C3455b.f46379f)) {
                    return null;
                }
                str = "/agcgw_all/SG";
            }
            return dVar.a(str);
        }
    }

    /* renamed from: y0.b$b, reason: collision with other inner class name */
    static class C0292b implements f.a {
        C0292b() {
        }

        @Override // u0.f.a
        public String a(u0.d dVar) {
            String str;
            if (dVar.b().equals(C3455b.f46376c)) {
                str = "/agcgw_all/CN_back";
            } else if (dVar.b().equals(C3455b.f46378e)) {
                str = "/agcgw_all/RU_back";
            } else if (dVar.b().equals(C3455b.f46377d)) {
                str = "/agcgw_all/DE_back";
            } else {
                if (!dVar.b().equals(C3455b.f46379f)) {
                    return null;
                }
                str = "/agcgw_all/SG_back";
            }
            return dVar.a(str);
        }
    }

    public b(u0.d dVar) {
        Log.d("AGC_Instance", "AGConnectInstanceImpl init");
        this.f46724a = dVar;
        if (f46721d == null) {
            Log.e("AGC_Instance", "please call `initialize()` first");
        }
        this.f46725b = new d(f46721d, dVar.getContext());
        d dVar2 = new d(null, dVar.getContext());
        this.f46726c = dVar2;
        if (dVar instanceof w0.c) {
            dVar2.a(((w0.c) dVar).d(), dVar.getContext());
        }
        Log.d("AGC_Instance", "AGConnectInstanceImpl init end");
    }

    public static AbstractC3456c f() {
        String str = f46723f;
        return str == null ? g("DEFAULT_INSTANCE") : g(str);
    }

    public static synchronized AbstractC3456c g(String str) {
        AbstractC3456c abstractC3456c;
        synchronized (b.class) {
            try {
                abstractC3456c = (AbstractC3456c) f46722e.get(str);
                if (abstractC3456c == null) {
                    if ("DEFAULT_INSTANCE".equals(str)) {
                        Log.w("AGC_Instance", "please call `initialize()` first");
                    } else {
                        Log.w("AGC_Instance", "not find instance for : " + str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC3456c;
    }

    public static AbstractC3456c h(u0.d dVar) {
        return i(dVar, false);
    }

    private static synchronized AbstractC3456c i(u0.d dVar, boolean z4) {
        AbstractC3456c abstractC3456c;
        synchronized (b.class) {
            Map map = f46722e;
            abstractC3456c = (AbstractC3456c) map.get(dVar.getIdentifier());
            if (abstractC3456c == null || z4) {
                abstractC3456c = new b(dVar);
                map.put(dVar.getIdentifier(), abstractC3456c);
            }
        }
        return abstractC3456c;
    }

    public static synchronized void j(Context context) {
        synchronized (b.class) {
            Log.w("AGC_Instance", "agc sdk initialize");
            if (f46722e.size() > 0) {
                Log.w("AGC_Instance", "Repeated invoking initialize");
            } else {
                k(context, AbstractC3461a.c(context));
            }
        }
    }

    private static synchronized void k(Context context, u0.d dVar) {
        synchronized (b.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    Log.w("AGC_Instance", "context.getApplicationContext null");
                } else {
                    context = applicationContext;
                }
                l();
                if (f46721d == null) {
                    f46721d = new c(context).a();
                }
                i(dVar, true);
                f46723f = dVar.getIdentifier();
                Log.i("AGC_Instance", "initFinish callback start");
                C3522a.a();
                Log.i("AGC_Instance", "AGC SDK initialize end");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void l() {
        f.b("/agcgw/url", new a());
        f.b("/agcgw/backurl", new C0292b());
    }

    @Override // u0.AbstractC3456c
    public Context b() {
        return this.f46724a.getContext();
    }

    @Override // u0.AbstractC3456c
    public u0.d d() {
        return this.f46724a;
    }
}
