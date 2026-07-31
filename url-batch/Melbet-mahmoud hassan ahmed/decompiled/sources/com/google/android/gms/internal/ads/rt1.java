package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class rt1 {

    /* renamed from: a, reason: collision with root package name */
    private final ot1 f11417a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<dd0> f11418b = new AtomicReference<>();

    rt1(ot1 ot1Var) {
        this.f11417a = ot1Var;
    }

    private final dd0 e() {
        dd0 dd0Var = this.f11418b.get();
        if (dd0Var != null) {
            return dd0Var;
        }
        io0.g("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final cf0 a(String str) {
        cf0 j02 = e().j0(str);
        this.f11417a.d(str, j02);
        return j02;
    }

    public final at2 b(String str, JSONObject jSONObject) {
        gd0 s7;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                s7 = new ce0(new AdMobAdapter());
            } else if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                s7 = new ce0(new AdUrlAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                s7 = new ce0(new zzcaf());
            } else {
                dd0 e7 = e();
                if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        s7 = e7.z(string) ? e7.s("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : e7.u(string) ? e7.s(string) : e7.s("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e8) {
                        io0.e("Invalid custom event.", e8);
                    }
                }
                s7 = e7.s(str);
            }
            at2 at2Var = new at2(s7);
            this.f11417a.c(str, at2Var);
            return at2Var;
        } catch (Throwable th) {
            throw new ps2(th);
        }
    }

    public final void c(dd0 dd0Var) {
        this.f11418b.compareAndSet(null, dd0Var);
    }

    public final boolean d() {
        return this.f11418b.get() != null;
    }
}
