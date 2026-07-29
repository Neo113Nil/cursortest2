package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.TapjoyConstants;
import com.tapjoy.internal.gk;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes2.dex */
public final class gb {

    /* renamed from: b, reason: collision with root package name */
    private static final gb f8151b;

    /* renamed from: c, reason: collision with root package name */
    private static gb f8152c;

    /* renamed from: a, reason: collision with root package name */
    public final fz f8153a = new fz();

    /* renamed from: d, reason: collision with root package name */
    private Context f8154d;

    static {
        gb gbVar = new gb();
        f8151b = gbVar;
        f8152c = gbVar;
    }

    public static gb a() {
        return f8152c;
    }

    public static fz b() {
        return f8152c.f8153a;
    }

    gb() {
    }

    public final synchronized void a(Context context) {
        if (context != null) {
            if (this.f8154d == null) {
                this.f8154d = context;
                SharedPreferences c2 = c();
                String string = c().getString(TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS, null);
                if (string != null) {
                    try {
                        bn b2 = bn.b(string);
                        try {
                            Map d2 = b2.d();
                            b2.close();
                            this.f8153a.a(d2);
                        } catch (Throwable th) {
                            b2.close();
                            throw th;
                        }
                    } catch (Exception unused) {
                        c2.edit().remove(TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS).apply();
                    }
                }
                Observer observer = new Observer() { // from class: com.tapjoy.internal.gb.1
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        Object obj2;
                        gg.a(gb.this.f8153a.a("usage_tracking_enabled", false));
                        Iterator it = gb.this.f8153a.f8204b.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            Object a2 = ((gk.a) it.next()).a("usage_tracking_exclude");
                            if (a2 != null && List.class.isInstance(a2)) {
                                obj2 = List.class.cast(a2);
                                break;
                            }
                        }
                        gg.a((Collection) obj2);
                    }
                };
                this.f8153a.addObserver(observer);
                observer.update(this.f8153a, null);
            }
        }
    }

    public final SharedPreferences c() {
        return this.f8154d.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
    }
}
