package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Xi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2861Xi implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28670n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3858rh f28671u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ JSONObject f28672v;

    public /* synthetic */ RunnableC2861Xi(InterfaceC3858rh interfaceC3858rh, JSONObject jSONObject) {
        this.f28671u = interfaceC3858rh;
        this.f28672v = jSONObject;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        InterfaceC3858rh interfaceC3858rh = this.f28671u;
        JSONObject jSONObject = this.f28672v;
        switch (this.f28670n) {
            case 0:
                String obj = jSONObject.toString();
                String o9 = D.y.o(new StringBuilder(obj.length() + 31), "Calling AFMA_updateActiveView(", obj, ")");
                int i = t2.C.f40822b;
                u2.i.a(o9);
                interfaceC3858rh.b("AFMA_updateActiveView", jSONObject);
                break;
            default:
                C3675oC c3675oC = C3648nm.J;
                interfaceC3858rh.c("onVideoEvent", jSONObject);
                break;
        }
    }

    public /* synthetic */ RunnableC2861Xi(JSONObject jSONObject, InterfaceC3858rh interfaceC3858rh) {
        this.f28672v = jSONObject;
        this.f28671u = interfaceC3858rh;
    }
}
