package H2;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f1091c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static volatile b f1092d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f1093a;

    /* renamed from: b, reason: collision with root package name */
    public volatile ArrayList f1094b;

    public b(Context context) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        this.f1093a = applicationContext;
        f1091c.put("FireTVFOSDAT", d.a(applicationContext));
    }

    public static b a(Context context) {
        if (f1092d == null) {
            synchronized (b.class) {
                try {
                    if (f1092d == null) {
                        f1092d = new b(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f1092d;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0021 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List b() {
        c cVar;
        if (this.f1094b != null) {
            return this.f1094b;
        }
        synchronized (this) {
            if (this.f1094b != null) {
                return this.f1094b;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : f1091c.entrySet()) {
                    if (((d) entry.getValue()).b()) {
                        String str = (String) entry.getKey();
                        Context context = this.f1093a;
                        if (str != null && context != null) {
                            if ("FireTVFOSDAT".equals(str)) {
                                cVar = new c(context);
                                if (cVar == null) {
                                    arrayList.add(cVar);
                                }
                            }
                        }
                        cVar = null;
                        if (cVar == null) {
                        }
                    }
                }
                this.f1094b = arrayList;
                return this.f1094b;
            } catch (Exception unused) {
                this.f1094b = new ArrayList();
                return this.f1094b;
            }
        }
    }
}
