package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C4927z0;

/* renamed from: com.google.android.gms.internal.ads.Zn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2900Zn implements InterfaceC2944al, InterfaceC2608Ik, InterfaceC4131wk, InterfaceC2592Hl {

    /* renamed from: n, reason: collision with root package name */
    public final C3002bo f29062n;

    /* renamed from: u, reason: collision with root package name */
    public final C3381io f29063u;

    /* renamed from: v, reason: collision with root package name */
    public final Context f29064v;

    public C2900Zn(C3002bo c3002bo, C3381io c3381io, Context context) {
        this.f29062n = c3002bo;
        this.f29063u = c3381io;
        this.f29064v = context;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2592Hl
    public final void C(String str) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31533Q7)).booleanValue()) {
            C3002bo c3002bo = this.f29062n;
            c3002bo.f29588a.put(NativeAdvancedJsUtils.f18064p, "sgf");
            c3002bo.b("sgf_reason", str);
            c3002bo.d();
            this.f29063u.b(c3002bo.f29588a);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2944al
    public final void D(C2953au c2953au) {
        C3002bo c3002bo = this.f29062n;
        c3002bo.getClass();
        C2518Df c2518Df = c2953au.f29349b;
        List list = (List) c2518Df.f24453u;
        if (!list.isEmpty()) {
            int i = ((Ut) list.get(0)).f28141b;
            c3002bo.b(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, Ut.a(i));
            if (i == 6) {
                c3002bo.f29588a.put("as", true != c3002bo.f29589b.f29533z ? "0" : "1");
            }
        }
        C3151ea c3151ea = AbstractC3368ia.f31485L2;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            c3002bo.b("mwl", Integer.toString(list.size()));
        }
        c3002bo.b("gqi", ((Wt) c2518Df.f24454v).f28491b);
        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.Sa)).booleanValue()) {
            d();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2944al
    public final void H(C2687Ne c2687Ne) {
        this.f29062n.a(c2687Ne.f26579n);
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Ta)).booleanValue()) {
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2592Hl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(B2.u uVar) {
        String str;
        C3151ea c3151ea = AbstractC3368ia.f31533Q7;
        q2.r rVar = q2.r.f40116e;
        if (!((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            return;
        }
        C3381io c3381io = this.f29063u;
        C3002bo c3002bo = this.f29062n;
        if (uVar == null) {
            c3002bo.f29588a.put(NativeAdvancedJsUtils.f18064p, "sgs");
            ConcurrentHashMap concurrentHashMap = c3002bo.f29588a;
            concurrentHashMap.put("request_id", "-1");
            c3381io.b(concurrentHashMap);
            return;
        }
        C2687Ne c2687Ne = uVar.f305c;
        if (c2687Ne != null) {
            b(c2687Ne.f26578F, C2947ao.f29318d);
        }
        try {
            JSONObject jSONObject = new JSONObject(uVar.f304b);
            c3002bo.f29588a.put(NativeAdvancedJsUtils.f18064p, "sgs");
            ConcurrentHashMap concurrentHashMap2 = c3002bo.f29588a;
            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.cb)).booleanValue()) {
                try {
                    str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                } catch (JSONException e6) {
                    int i = t2.C.f40822b;
                    u2.i.d("Error retrieving JSONObject from the requestJson, ", e6);
                }
                concurrentHashMap2.put("tpc", str);
                if (c2687Ne != null) {
                    c3002bo.a(c2687Ne.f26579n);
                }
                c3002bo.d();
                c3381io.b(concurrentHashMap2);
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Ua)).booleanValue()) {
                    return;
                }
                d();
                return;
            }
            str = "na";
            concurrentHashMap2.put("tpc", str);
            if (c2687Ne != null) {
            }
            c3002bo.d();
            c3381io.b(concurrentHashMap2);
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Ua)).booleanValue()) {
            }
        } catch (JSONException unused) {
            c3002bo.f29588a.put(NativeAdvancedJsUtils.f18064p, "sgf");
            ConcurrentHashMap concurrentHashMap3 = c3002bo.f29588a;
            concurrentHashMap3.put("sgf_reason", "request_invalid");
            c3381io.b(concurrentHashMap3);
        }
    }

    public final void b(Bundle bundle, C3675oC c3675oC) {
        C3151ea c3151ea = AbstractC3368ia.f31467J2;
        q2.r rVar = q2.r.f40116e;
        if (!((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() || bundle == null) {
            return;
        }
        p2.j.f39798C.f39810k.getClass();
        bundle.putLong("public-api-callback", System.currentTimeMillis());
        C3002bo c3002bo = this.f29062n;
        c3002bo.getClass();
        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.Le)).booleanValue()) {
            c3002bo.b("brr", true != c3002bo.f29590c.f30913q ? "0" : "1");
        }
        if (bundle.containsKey("ls")) {
            c3002bo.b("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int i = c3675oC.f33117w;
        for (int i4 = 0; i4 < i; i4++) {
            C2947ao c2947ao = (C2947ao) c3675oC.get(i4);
            long j9 = bundle.getLong(com.anythink.basead.b.c.i.a(c2947ao.f29321b), -1L);
            long j10 = bundle.getLong(com.anythink.basead.b.c.i.a(c2947ao.f29322c), -1L);
            if (j9 > 0 && j10 > 0) {
                c3002bo.b(c2947ao.f29320a, String.valueOf(j10 - j9));
            }
        }
        c(bundle.getBundle("client_sig_latency_key"));
        c(bundle.getBundle("gms_sig_latency_key"));
    }

    public final void c(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j9 = bundle.getLong(str);
            if (j9 >= 0) {
                this.f29062n.b(str, String.valueOf(j9));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        r3 = r4.getHistoricalProcessExitReasons(r3.getPackageName(), 0, 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        List historicalProcessExitReasons;
        int reason;
        if (((Boolean) AbstractC2751Ra.f27376d.r()).booleanValue() || p2.j.f39798C.f39808h.f29027q.getAndSet(true) || !S2.b.g()) {
            return;
        }
        String str = (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.Va);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Context context = this.f29064v;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null || historicalProcessExitReasons == null || historicalProcessExitReasons.isEmpty()) {
                return;
            }
            reason = O.D0.e(historicalProcessExitReasons.get(0)).getReason();
            com.bumptech.glide.manager.o n9 = com.bumptech.glide.manager.o.d(new TA(',')).n(WA.f28369v);
            com.bumptech.glide.manager.o oVar = new com.bumptech.glide.manager.o((InterfaceC3352iB) n9.f23625w, true, (UA) n9.f23624v);
            str.getClass();
            Iterator g9 = ((InterfaceC3352iB) oVar.f23625w).g(oVar, str);
            while (true) {
                AbstractC3298hB abstractC3298hB = (AbstractC3298hB) g9;
                if (!abstractC3298hB.hasNext()) {
                    return;
                }
                String str2 = (String) abstractC3298hB.next();
                try {
                } catch (NumberFormatException unused) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 53);
                    sb.append("Invalid number format in appExitInfoReasonAllowlist: ");
                    sb.append(str2);
                    t2.C.k(sb.toString());
                }
                if (Integer.parseInt(str2) == reason) {
                    C3381io c3381io = this.f29063u;
                    c3381io.getClass();
                    HashMap hashMap = new HashMap(c3381io.f31998a);
                    hashMap.put(NativeAdvancedJsUtils.f18064p, "aei");
                    hashMap.put("aeir", String.valueOf(reason));
                    c3381io.c(hashMap);
                    return;
                }
            }
        } catch (NoClassDefFoundError e6) {
            e = e6;
            p2.j.f39798C.f39808h.d("CsiAdLoadListener.maybeLogAppExitInfo", e);
        } catch (NoSuchMethodError e9) {
            e = e9;
            p2.j.f39798C.f39808h.d("CsiAdLoadListener.maybeLogAppExitInfo", e);
        } catch (RuntimeException e10) {
            e = e10;
            p2.j.f39798C.f39808h.d("CsiAdLoadListener.maybeLogAppExitInfo", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2608Ik
    public final void e() {
        Bundle bundle;
        C3002bo c3002bo = this.f29062n;
        c3002bo.f29588a.put(NativeAdvancedJsUtils.f18064p, "loaded");
        synchronized (c3002bo) {
            bundle = c3002bo.f29592e;
        }
        b(bundle, C2947ao.f29319e);
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.ce)).booleanValue()) {
            c3002bo.f29588a.put("mafe", true != com.bumptech.glide.h.s("MUTE_AUDIO") ? "0" : "1");
        }
        c3002bo.d();
        this.f29063u.b(c3002bo.f29588a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4131wk
    public final void v(C4927z0 c4927z0) {
        C3002bo c3002bo = this.f29062n;
        c3002bo.f29588a.put(NativeAdvancedJsUtils.f18064p, "ftl");
        c3002bo.b("ftl", String.valueOf(c4927z0.f40122n));
        c3002bo.b("ed", c4927z0.f40124v);
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31667f8)).booleanValue()) {
            c3002bo.b("emsg", c4927z0.f40123u);
        }
        c3002bo.d();
        this.f29063u.b(c3002bo.f29588a);
    }
}
