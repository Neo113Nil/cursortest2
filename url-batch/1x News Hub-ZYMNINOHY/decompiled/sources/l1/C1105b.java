package l1;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: l1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1105b {

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f9934c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static volatile C1105b f9935d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f9936a;

    /* renamed from: b, reason: collision with root package name */
    public volatile ArrayList f9937b;

    public C1105b(Context context) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        this.f9936a = applicationContext;
        f9934c.put("FireTVFOSDAT", d.a(applicationContext));
    }

    public static C1105b b(Context context) {
        if (f9935d == null) {
            synchronized (C1105b.class) {
                try {
                    if (f9935d == null) {
                        f9935d = new C1105b(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f9935d;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0021 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a() {
        c cVar;
        if (this.f9937b != null) {
            return this.f9937b;
        }
        synchronized (this) {
            if (this.f9937b != null) {
                return this.f9937b;
            }
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : f9934c.entrySet()) {
                    if (((d) entry.getValue()).b()) {
                        String str = (String) entry.getKey();
                        Context context = this.f9936a;
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
                this.f9937b = arrayList;
                return this.f9937b;
            } catch (Exception unused) {
                this.f9937b = new ArrayList();
                return this.f9937b;
            }
        }
    }
}
