package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Sn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2781Sn {

    /* renamed from: a, reason: collision with root package name */
    public final C3602mu f27615a;

    /* renamed from: b, reason: collision with root package name */
    public final C2764Rn f27616b;

    public C2781Sn(C3602mu c3602mu, C2764Rn c2764Rn) {
        this.f27615a = c3602mu;
        this.f27616b = c2764Rn;
    }

    public final C3656nu a(String str, JSONObject jSONObject) {
        InterfaceC3531ld b9;
        C2764Rn c2764Rn = this.f27616b;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                b9 = new BinderC4178xd(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                b9 = new BinderC4178xd(new zzbyb());
            } else {
                InterfaceC3423jd interfaceC3423jd = (InterfaceC3423jd) ((AtomicReference) this.f27615a.f32776w).get();
                if (interfaceC3423jd == null) {
                    int i = t2.C.f40822b;
                    u2.i.f("Unexpected call to adapter creator.");
                    throw new RemoteException();
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        b9 = interfaceC3423jd.N(string) ? interfaceC3423jd.b("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : interfaceC3423jd.E(string) ? interfaceC3423jd.b(string) : interfaceC3423jd.b("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e6) {
                        int i4 = t2.C.f40822b;
                        u2.i.d("Invalid custom event.", e6);
                    }
                }
                b9 = interfaceC3423jd.b(str);
            }
            C3656nu c3656nu = new C3656nu(b9);
            c2764Rn.a(str, c3656nu);
            return c3656nu;
        } catch (Throwable th) {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Ha)).booleanValue()) {
                c2764Rn.a(str, null);
            }
            throw new C3334hu(th);
        }
    }

    public final InterfaceC2669Md b(String str) {
        InterfaceC3423jd interfaceC3423jd = (InterfaceC3423jd) ((AtomicReference) this.f27615a.f32776w).get();
        if (interfaceC3423jd == null) {
            int i = t2.C.f40822b;
            u2.i.f("Unexpected call to adapter creator.");
            throw new RemoteException();
        }
        InterfaceC2669Md C7 = interfaceC3423jd.C(str);
        C2764Rn c2764Rn = this.f27616b;
        synchronized (c2764Rn) {
            if (c2764Rn.f27422a.containsKey(str)) {
                return C7;
            }
            try {
                c2764Rn.f27422a.put(str, new C2747Qn(str, C7.f(), C7.e(), true));
                return C7;
            } catch (Throwable unused) {
                return C7;
            }
        }
    }
}
