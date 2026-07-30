package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.xr, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4192xr extends AbstractBinderC3186f8 implements InterfaceC2703Od {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f35258x = 0;

    /* renamed from: n, reason: collision with root package name */
    public final C3320hg f35259n;

    /* renamed from: u, reason: collision with root package name */
    public final JSONObject f35260u;

    /* renamed from: v, reason: collision with root package name */
    public final long f35261v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f35262w;

    public BinderC4192xr(String str, InterfaceC2669Md interfaceC2669Md, C3320hg c3320hg, long j9) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
        JSONObject jSONObject = new JSONObject();
        this.f35260u = jSONObject;
        this.f35262w = false;
        this.f35259n = c3320hg;
        this.f35261v = j9;
        try {
            jSONObject.put("adapter_version", interfaceC2669Md.f().toString());
            jSONObject.put(com.anythink.expressad.foundation.g.a.bs, interfaceC2669Md.e().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String readString = parcel.readString();
            AbstractC3241g8.f(parcel);
            synchronized (this) {
                if (!this.f35262w) {
                    if (readString == null) {
                        synchronized (this) {
                            G3(2, "Adapter returned null signals");
                        }
                    } else {
                        try {
                            JSONObject jSONObject = this.f35260u;
                            jSONObject.put("signals", readString);
                            C3151ea c3151ea = AbstractC3368ia.f31690i2;
                            q2.r rVar = q2.r.f40116e;
                            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                                p2.j.f39798C.f39810k.getClass();
                                jSONObject.put("latency", SystemClock.elapsedRealtime() - this.f35261v);
                            }
                            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31681h2)).booleanValue()) {
                                jSONObject.put("signal_error_code", 0);
                            }
                        } catch (JSONException unused) {
                        }
                        this.f35259n.a(this.f35260u);
                        this.f35262w = true;
                    }
                }
            }
        } else if (i == 2) {
            String readString2 = parcel.readString();
            AbstractC3241g8.f(parcel);
            synchronized (this) {
                G3(2, readString2);
            }
        } else {
            if (i != 3) {
                return false;
            }
            C4927z0 c4927z0 = (C4927z0) AbstractC3241g8.b(parcel, C4927z0.CREATOR);
            AbstractC3241g8.f(parcel);
            synchronized (this) {
                G3(2, c4927z0.f40123u);
            }
        }
        parcel2.writeNoException();
        return true;
    }

    public final synchronized void G3(int i, String str) {
        try {
            if (this.f35262w) {
                return;
            }
            try {
                JSONObject jSONObject = this.f35260u;
                jSONObject.put("signal_error", str);
                C3151ea c3151ea = AbstractC3368ia.f31690i2;
                q2.r rVar = q2.r.f40116e;
                if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                    p2.j.f39798C.f39810k.getClass();
                    jSONObject.put("latency", SystemClock.elapsedRealtime() - this.f35261v);
                }
                if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31681h2)).booleanValue()) {
                    jSONObject.put("signal_error_code", i);
                }
            } catch (JSONException unused) {
            }
            this.f35259n.a(this.f35260u);
            this.f35262w = true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
