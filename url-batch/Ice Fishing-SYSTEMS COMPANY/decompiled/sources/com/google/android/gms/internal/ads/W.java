package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public boolean f28332a;

    /* renamed from: b, reason: collision with root package name */
    public Object f28333b;

    /* renamed from: c, reason: collision with root package name */
    public Object f28334c;

    /* renamed from: d, reason: collision with root package name */
    public Object f28335d;

    /* renamed from: e, reason: collision with root package name */
    public Object f28336e;

    /* renamed from: f, reason: collision with root package name */
    public Object f28337f;

    public synchronized boolean a(Context context) {
        if (!MA.a(context)) {
            return false;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.f28336e = new C4086vt(5, new IA(context));
        } catch (NullPointerException e6) {
            t2.C.k("Error connecting LMD Overlay service");
            p2.j.f39798C.f39808h.d("LastMileDeliveryOverlay.bindLastMileDeliveryService", e6);
        }
        if (((C4086vt) this.f28336e) == null) {
            this.f28332a = false;
            return false;
        }
        if (((h8.d) this.f28337f) == null) {
            this.f28337f = new h8.d(this);
        }
        this.f28332a = true;
        return true;
    }

    public void b(InterfaceC3858rh interfaceC3858rh, EA ea) {
        if (interfaceC3858rh == null) {
            c("adWebview missing", "onLMDShow");
            return;
        }
        this.f28335d = interfaceC3858rh;
        if (!this.f28332a && !a(interfaceC3858rh.getContext())) {
            c("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        boolean booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Vc)).booleanValue();
        String str = ea.f24667b;
        if (booleanValue) {
            this.f28334c = str;
        }
        if (((h8.d) this.f28337f) == null) {
            this.f28337f = new h8.d(this);
        }
        C4086vt c4086vt = (C4086vt) this.f28336e;
        if (c4086vt != null) {
            h8.d dVar = (h8.d) this.f28337f;
            IA ia = (IA) c4086vt.f34886u;
            C2631Jq c2631Jq = ia.f25534a;
            if (c2631Jq == null) {
                IA.f25532c.c("error: %s", "Play Store not found.");
            } else if (IA.c(dVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, str))) {
                c2631Jq.a(new LA(c2631Jq, new RunnableC3771q0(ia, ea, dVar, 12), 0));
            }
        }
    }

    public void c(String str, String str2) {
        t2.C.k(str);
        if (((InterfaceC3858rh) this.f28335d) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put(NativeAdvancedJsUtils.f18064p, str2);
            d(hashMap, "onError");
        }
    }

    public void d(HashMap hashMap, String str) {
        AbstractC3212fg.f30743f.execute(new B2.z(this, str, hashMap, 12));
    }

    public GA e() {
        String str;
        String str2 = null;
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Vc)).booleanValue() || TextUtils.isEmpty((String) this.f28334c)) {
            String str3 = (String) this.f28333b;
            if (str3 != null) {
                str2 = str3;
                str = null;
            } else {
                c("Missing session token and/or appId", "onLMDupdate");
                str = null;
            }
        } else {
            str = (String) this.f28334c;
        }
        return new GA(str2, str);
    }
}
