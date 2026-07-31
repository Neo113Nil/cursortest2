package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class un1 implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    private final rr1 f12871f;

    /* renamed from: g, reason: collision with root package name */
    private final v3.d f12872g;

    /* renamed from: h, reason: collision with root package name */
    private e60 f12873h;

    /* renamed from: i, reason: collision with root package name */
    private t70<Object> f12874i;

    /* renamed from: j, reason: collision with root package name */
    String f12875j;

    /* renamed from: k, reason: collision with root package name */
    Long f12876k;

    /* renamed from: l, reason: collision with root package name */
    WeakReference<View> f12877l;

    public un1(rr1 rr1Var, v3.d dVar) {
        this.f12871f = rr1Var;
        this.f12872g = dVar;
    }

    private final void e() {
        View view;
        this.f12875j = null;
        this.f12876k = null;
        WeakReference<View> weakReference = this.f12877l;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.f12877l = null;
    }

    public final e60 a() {
        return this.f12873h;
    }

    public final void b() {
        if (this.f12873h == null || this.f12876k == null) {
            return;
        }
        e();
        try {
            this.f12873h.b();
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    public final void c(final e60 e60Var) {
        this.f12873h = e60Var;
        t70<Object> t70Var = this.f12874i;
        if (t70Var != null) {
            this.f12871f.k("/unconfirmedClick", t70Var);
        }
        t70<Object> t70Var2 = new t70() { // from class: com.google.android.gms.internal.ads.tn1
            @Override // com.google.android.gms.internal.ads.t70
            public final void a(Object obj, Map map) {
                un1 un1Var = un1.this;
                e60 e60Var2 = e60Var;
                try {
                    un1Var.f12876k = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    io0.d("Failed to call parse unconfirmedClickTimestamp.");
                }
                un1Var.f12875j = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (e60Var2 == null) {
                    io0.b("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    e60Var2.z(str);
                } catch (RemoteException e7) {
                    io0.i("#007 Could not call remote method.", e7);
                }
            }
        };
        this.f12874i = t70Var2;
        this.f12871f.i("/unconfirmedClick", t70Var2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference<View> weakReference = this.f12877l;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f12875j != null && this.f12876k != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f12875j);
            hashMap.put("time_interval", String.valueOf(this.f12872g.b() - this.f12876k.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.f12871f.g("sendMessageToNativeJs", hashMap);
        }
        e();
    }
}
