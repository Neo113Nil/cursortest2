package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.anythink.expressad.foundation.d.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import k2.C4637h;
import org.json.JSONArray;
import org.json.JSONObject;
import p2.C4856a;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.Qq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2750Qq implements InterfaceC3436jq {

    /* renamed from: a, reason: collision with root package name */
    public final C3105di f27249a;

    /* renamed from: b, reason: collision with root package name */
    public final C3157eg f27250b;

    /* renamed from: c, reason: collision with root package name */
    public final C2518Df f27251c;

    /* renamed from: d, reason: collision with root package name */
    public final C3710ou f27252d;

    /* renamed from: e, reason: collision with root package name */
    public final C4242yn f27253e;

    /* renamed from: f, reason: collision with root package name */
    public final C3002bo f27254f;

    /* renamed from: g, reason: collision with root package name */
    public final C5107a f27255g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f27256h;

    public C2750Qq(C3105di c3105di, C3157eg c3157eg, C2518Df c2518Df, C3710ou c3710ou, C4242yn c4242yn, C3002bo c3002bo, C5107a c5107a, Context context, C2837Wb c2837Wb) {
        this.f27255g = c5107a;
        this.f27256h = context;
        this.f27249a = c3105di;
        this.f27250b = c3157eg;
        this.f27251c = c2518Df;
        this.f27252d = c3710ou;
        this.f27253e = c4242yn;
        this.f27254f = c3002bo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3436jq
    public final J3.a a(C2953au c2953au, Ut ut) {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31485L2)).booleanValue()) {
            p2.j.f39798C.f39810k.getClass();
            this.f27254f.c("rendering-native-ads-native-js-webview-start", System.currentTimeMillis());
        }
        J3.a b9 = this.f27252d.b();
        C2936ad c2936ad = new C2936ad(11, this, ut);
        C3157eg c3157eg = this.f27250b;
        return C3686oN.y(C3686oN.y(b9, c2936ad, c3157eg), new C2624Jj(this, c2953au, ut, 8), c3157eg);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3436jq
    public final boolean b(C2953au c2953au, Ut ut) {
        Yt yt = ut.f28173s;
        return (yt == null || yt.f28908c == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03ad A[EDGE_INSN: B:118:0x03ad->B:119:0x03ad BREAK  A[LOOP:0: B:43:0x03b2->B:116:0x0414], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x043f  */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.google.android.gms.internal.ads.OD] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.gms.internal.ads.OD] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.android.gms.internal.ads.OD] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v6, types: [com.google.android.gms.internal.ads.Df] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r5v36, types: [com.google.android.gms.internal.ads.OD] */
    /* JADX WARN: Type inference failed for: r5v48, types: [J3.a, com.google.android.gms.internal.ads.hg] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final GD c(final C2953au c2953au, final Ut ut, final JSONObject jSONObject) {
        C4856a c4856a;
        C4072vf c4072vf;
        JSONObject jSONObject2;
        ?? r12;
        C3157eg c3157eg;
        C2946an c2946an;
        String str;
        C4856a c4856a2;
        C4072vf c4072vf2;
        Wt wt;
        C3002bo c3002bo;
        String str2;
        C3261gb c3261gb;
        J3.a aVar;
        SD sd;
        J3.a aVar2;
        J3.a aVar3;
        int i;
        C2518Df c2518Df;
        q2.g1 g1Var;
        JSONObject optJSONObject;
        Wt wt2;
        J3.a e6;
        JSONObject optJSONObject2;
        J3.a aVar4;
        J3.a aVar5;
        J3.a aVar6;
        J3.a aVar7;
        J3.a d2;
        C2946an c2946an2;
        C4856a c4856a3;
        C4072vf c4072vf3;
        C3002bo c3002bo2;
        OD od;
        JSONArray optJSONArray;
        SD sd2;
        OD od2;
        final C3999uD A8;
        JSONArray jSONArray;
        int i4;
        OD od3;
        C3602mu c3602mu;
        Future future;
        final C3945tD c3945tD;
        C3945tD c3945tD2;
        JSONObject optJSONObject3;
        JSONArray optJSONArray2;
        int i9;
        boolean z8;
        C3945tD y6;
        C4072vf c4072vf4;
        C3151ea c3151ea = AbstractC3368ia.f31494M2;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            p2.j.f39798C.f39810k.getClass();
            this.f27254f.c("rendering-webview-creation-start", System.currentTimeMillis());
        }
        final J3.a b9 = this.f27252d.b();
        C3151ea c3151ea2 = AbstractC3368ia.ff;
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        boolean booleanValue = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).booleanValue();
        Context context = this.f27256h;
        if (booleanValue) {
            C5107a c5107a = this.f27255g;
            C4126wf c4126wf = ut.f28107A;
            if (c4126wf != null) {
                Yt yt = ut.f28173s;
                c4072vf4 = new C4072vf(context, c5107a, c4126wf, yt == null ? null : yt.f28907b);
            } else {
                c4072vf4 = null;
            }
            c4856a = new C4856a(context, c4072vf4);
            c4072vf = c4072vf4;
        } else {
            c4856a = new C4856a(context, null);
            c4072vf = null;
        }
        C4856a c4856a4 = c4856a;
        C2518Df c2518Df2 = this.f27251c;
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31485L2)).booleanValue()) {
            p2.j.f39798C.f39810k.getClass();
            ((C3002bo) c2518Df2.f24456x).c("rendering-native-assets-loading-start", System.currentTimeMillis());
        }
        CallableC2831Vm callableC2831Vm = new CallableC2831Vm(c2518Df2, c2953au, ut, jSONObject, 0);
        C3157eg c3157eg2 = (C3157eg) c2518Df2.f24453u;
        J3.a b10 = c3157eg2.b(callableC2831Vm);
        c2518Df2.B(46, b10);
        C2946an c2946an3 = (C2946an) c2518Df2.f24454v;
        JSONArray optJSONArray3 = jSONObject.optJSONArray("images");
        C3261gb c3261gb2 = c2946an3.f29307h;
        J3.a a9 = c2946an3.a(optJSONArray3, c3261gb2.f31024u, c3261gb2.f31026w, 47);
        c2518Df2.B(48, a9);
        C2518Df c2518Df3 = c2953au.f29349b;
        boolean booleanValue2 = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.ub)).booleanValue();
        Wt wt3 = (Wt) c2518Df3.f24454v;
        SD sd3 = c2946an3.f29306g;
        C3002bo c3002bo3 = c2946an3.f29316r;
        if (booleanValue2) {
            JSONArray optJSONArray4 = jSONObject.optJSONArray("images");
            if (optJSONArray4 == null || optJSONArray4.length() <= 0) {
                jSONObject2 = jSONObject;
                r12 = c2518Df2;
                c3157eg = c3157eg2;
                c2946an = c2946an3;
                str = "images";
                c4856a2 = c4856a4;
                c4072vf2 = c4072vf;
                wt = wt3;
                c3002bo = c3002bo3;
                str2 = com.onesignal.inAppMessages.internal.d.HTML;
                c3261gb = c3261gb2;
                aVar = a9;
                sd = sd3;
                aVar2 = b10;
                aVar3 = OD.f26665u;
            } else {
                JSONObject optJSONObject4 = optJSONArray4.optJSONObject(0);
                if (optJSONObject4 == null) {
                    aVar3 = OD.f26665u;
                } else if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31514O4)).booleanValue() && optJSONObject4.has((String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31522P4))) {
                    aVar3 = OD.f26665u;
                } else {
                    String optString = optJSONObject4.optString("base_url");
                    String optString2 = optJSONObject4.optString(com.onesignal.inAppMessages.internal.d.HTML);
                    int optInt = optJSONObject4.optInt("width", 0);
                    int optInt2 = optJSONObject4.optInt("height", 0);
                    if (optInt != 0) {
                        i = optInt;
                    } else if (optInt2 != 0) {
                        i = 0;
                    } else {
                        g1Var = q2.g1.a();
                        c2518Df = c2518Df2;
                        if (TextUtils.isEmpty(optString2)) {
                            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31529Q2)).booleanValue()) {
                                com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c3002bo3, "native-assets-loading-image-composition-start");
                            }
                            OD od4 = OD.f26665u;
                            str = "images";
                            C4072vf c4072vf5 = c4072vf;
                            c3002bo = c3002bo3;
                            c3157eg = c3157eg2;
                            C2518Df c2518Df4 = c2518Df;
                            str2 = com.onesignal.inAppMessages.internal.d.HTML;
                            c3261gb = c3261gb2;
                            aVar = a9;
                            sd = sd3;
                            aVar2 = b10;
                            q2.g1 g1Var2 = g1Var;
                            jSONObject2 = jSONObject;
                            C2882Ym c2882Ym = new C2882Ym(c2946an3, g1Var2, ut, wt3, c4856a4, c4072vf5, optString, optString2, 0);
                            c2946an = c2946an3;
                            wt = wt3;
                            c4856a2 = c4856a4;
                            c4072vf2 = c4072vf5;
                            C3945tD y8 = C3686oN.y(od4, c2882Ym, AbstractC3212fg.f30743f);
                            aVar3 = C3686oN.y(y8, new C2899Zm(y8, 0), AbstractC3212fg.f30745h);
                            r12 = c2518Df4;
                            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31537R2)).booleanValue()) {
                                AbstractC2720Pd.g(aVar3, "NativeAssetsLoader.loadImageHtml", sd);
                                r12 = c2518Df4;
                            }
                        } else {
                            jSONObject2 = jSONObject;
                            c3157eg = c3157eg2;
                            c2946an = c2946an3;
                            str = "images";
                            c4856a2 = c4856a4;
                            c4072vf2 = c4072vf;
                            c3002bo = c3002bo3;
                            wt = wt3;
                            r12 = c2518Df;
                            str2 = com.onesignal.inAppMessages.internal.d.HTML;
                            c3261gb = c3261gb2;
                            aVar = a9;
                            sd = sd3;
                            aVar2 = b10;
                            aVar3 = OD.f26665u;
                        }
                    }
                    c2518Df = c2518Df2;
                    g1Var = new q2.g1(c2946an3.f29300a, new C4637h(i, optInt2));
                    if (TextUtils.isEmpty(optString2)) {
                    }
                }
            }
            r12.B(50, aVar3);
            J3.a b11 = c2946an.b(jSONObject2.optJSONObject("secondary_image"), c3261gb.f31024u, 51);
            r12.B(52, b11);
            J3.a b12 = c2946an.b(jSONObject2.optJSONObject("app_icon"), c3261gb.f31024u, 53);
            r12.B(54, b12);
            optJSONObject = jSONObject2.optJSONObject("attribution");
            if (optJSONObject != null) {
                e6 = OD.f26665u;
                wt2 = wt;
            } else {
                JSONArray optJSONArray5 = optJSONObject.optJSONArray(str);
                JSONObject optJSONObject5 = optJSONObject.optJSONObject(d.c.f18793e);
                if (optJSONArray5 == null && optJSONObject5 != null) {
                    optJSONArray5 = new JSONArray();
                    optJSONArray5.put(optJSONObject5);
                }
                wt2 = wt;
                e6 = c2946an.e("NativeAssetsLoader.loadAttributionInfo", optJSONObject.optBoolean("require"), C3686oN.A(c2946an.a(optJSONArray5, false, true, 55), new C2991bd(1, c2946an, optJSONObject), sd));
            }
            J3.a aVar8 = e6;
            r12.B(56, aVar8);
            String[] strArr = {"html_containers", "instream"};
            JSONObject z9 = p8.g.z(jSONObject2, strArr);
            optJSONObject2 = z9 != null ? null : z9.optJSONObject(strArr[1]);
            if (optJSONObject2 != null) {
                JSONObject optJSONObject6 = jSONObject2.optJSONObject(com.anythink.basead.exoplayer.k.o.f8601a);
                if (optJSONObject6 == null) {
                    d2 = OD.f26665u;
                } else {
                    String optString3 = optJSONObject6.optString("vast_xml");
                    boolean z10 = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.tb)).booleanValue() && optJSONObject6.has(str2);
                    if (!TextUtils.isEmpty(optString3) || z10) {
                        if (z10) {
                            aVar5 = aVar8;
                            z8 = z10;
                            y6 = c2946an.d(optJSONObject6, ut, wt2, c4856a2, c4072vf2);
                            aVar4 = b11;
                            aVar7 = b12;
                            aVar6 = aVar3;
                        } else {
                            aVar5 = aVar8;
                            z8 = z10;
                            C3327hn c3327hn = c2946an.i;
                            c3327hn.getClass();
                            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31529Q2)).booleanValue()) {
                                p2.j.f39798C.f39810k.getClass();
                                aVar4 = b11;
                                aVar7 = b12;
                                aVar6 = aVar3;
                                c3327hn.i.c("native-assets-loading-video-start", System.currentTimeMillis());
                            } else {
                                aVar4 = b11;
                                aVar7 = b12;
                                aVar6 = aVar3;
                            }
                            OD od5 = OD.f26665u;
                            C2624Jj c2624Jj = new C2624Jj(c3327hn, c4856a2, c4072vf2, 1);
                            Executor executor = c3327hn.f31257b;
                            y6 = C3686oN.y(C3686oN.y(od5, c2624Jj, executor), new C2936ad(4, c3327hn, optJSONObject6), executor);
                        }
                        d2 = c2946an.e(true != z8 ? "NativeAssetsLoader.loadVideoView" : "NativeAssetsLoader.loadVideoHtml", false, C3686oN.w(y6, ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31447G4)).intValue(), TimeUnit.SECONDS, c2946an.f29309k));
                    } else {
                        int i10 = t2.C.f40822b;
                        u2.i.f("Required field 'vast_xml' or 'html' is missing");
                        d2 = OD.f26665u;
                    }
                }
                C4856a c4856a5 = c4856a2;
                c2946an2 = c2946an;
                c4856a3 = c4856a5;
                c4072vf3 = c4072vf2;
                aVar4 = b11;
                aVar7 = b12;
                aVar5 = aVar8;
                aVar6 = aVar3;
                r12.B(58, d2);
                if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.we)).booleanValue() && jSONObject2.has(com.anythink.basead.exoplayer.k.o.f8601a)) {
                    optJSONObject3 = jSONObject2.optJSONObject(com.anythink.basead.exoplayer.k.o.f8601a);
                    if (optJSONObject3.has("flags") && (optJSONArray2 = optJSONObject3.optJSONArray("flags")) != null) {
                        i9 = 0;
                        while (true) {
                            if (i9 >= optJSONArray2.length()) {
                                break;
                            }
                            JSONObject optJSONObject7 = optJSONArray2.optJSONObject(i9);
                            if (optJSONObject7 == null || !optJSONObject7.optString("key").equals("afma_video_player_type")) {
                                i9++;
                                c3002bo = c3002bo;
                            } else {
                                try {
                                    if (Integer.parseInt(optJSONObject7.optString("value")) == 3) {
                                        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31529Q2)).booleanValue()) {
                                            c3002bo2 = c3002bo;
                                            com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c3002bo2, "native-assets-loading-media-start");
                                        } else {
                                            c3002bo2 = c3002bo;
                                        }
                                        ?? c3320hg = new C3320hg();
                                        d2.c(new MD(0, d2, new Vx(c2946an2, (C3320hg) c3320hg)), AbstractC3212fg.f30743f);
                                        r12.B(61, c3320hg);
                                        od = c3320hg;
                                    }
                                } catch (NumberFormatException unused) {
                                }
                            }
                        }
                    }
                }
                c3002bo2 = c3002bo;
                od = C3686oN.c(new Bundle());
                OD od6 = od;
                C3602mu c3602mu2 = (C3602mu) r12.f24455w;
                optJSONArray = jSONObject2.optJSONArray("custom_assets");
                if (optJSONArray == null) {
                    A8 = C3686oN.c(Collections.EMPTY_LIST);
                    od2 = od6;
                } else {
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31529Q2)).booleanValue()) {
                        p2.j.f39798C.f39810k.getClass();
                        ((C3002bo) c3602mu2.f32776w).c("native-assets-loading-custom-start", System.currentTimeMillis());
                    }
                    ArrayList arrayList = new ArrayList();
                    int length = optJSONArray.length();
                    int i11 = 0;
                    while (true) {
                        sd2 = (SD) c3602mu2.f32774u;
                        if (i11 >= length) {
                            break;
                        }
                        int i12 = length;
                        JSONObject optJSONObject8 = optJSONArray.optJSONObject(i11);
                        if (optJSONObject8 == null) {
                            future = OD.f26665u;
                            c3602mu = c3602mu2;
                            jSONArray = optJSONArray;
                        } else {
                            jSONArray = optJSONArray;
                            String optString4 = optJSONObject8.optString("name");
                            if (optString4 == null) {
                                future = OD.f26665u;
                                c3602mu = c3602mu2;
                            } else {
                                i4 = i11;
                                String optString5 = optJSONObject8.optString("type");
                                od3 = od6;
                                if (com.anythink.expressad.foundation.h.k.f19794g.equals(optString5)) {
                                    future = C3686oN.c(new C3055cn(optString4, optJSONObject8.optString("string_value")));
                                    c3602mu = c3602mu2;
                                } else if (d.c.f18793e.equals(optString5)) {
                                    C2946an c2946an4 = (C2946an) c3602mu2.f32775v;
                                    c3602mu = c3602mu2;
                                    future = C3686oN.A(c2946an4.b(optJSONObject8.optJSONObject("image_value"), c2946an4.f29307h.f31024u, 0), new C2854Xb(optString4, 2), sd2);
                                } else {
                                    c3602mu = c3602mu2;
                                    future = OD.f26665u;
                                }
                                arrayList.add(future);
                                i11 = i4 + 1;
                                length = i12;
                                optJSONArray = jSONArray;
                                od6 = od3;
                                c3602mu2 = c3602mu;
                            }
                        }
                        od3 = od6;
                        i4 = i11;
                        arrayList.add(future);
                        i11 = i4 + 1;
                        length = i12;
                        optJSONArray = jSONArray;
                        od6 = od3;
                        c3602mu2 = c3602mu;
                    }
                    od2 = od6;
                    A8 = C3686oN.A(new DD(UB.n(arrayList), true), J2.f25698j, sd2);
                }
                r12.B(63, A8);
                if (jSONObject2.optBoolean("enable_omid")) {
                    JSONObject optJSONObject9 = jSONObject2.optJSONObject("omid_settings");
                    if (optJSONObject9 == null) {
                        c3945tD2 = OD.f26665u;
                    } else {
                        String optString6 = optJSONObject9.optString("omid_html");
                        if (!TextUtils.isEmpty(optString6)) {
                            C3151ea c3151ea3 = AbstractC3368ia.f31529Q2;
                            q2.r rVar2 = q2.r.f40116e;
                            if (((Boolean) rVar2.f40119c.a(c3151ea3)).booleanValue()) {
                                com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c3002bo2, "native-assets-loading-omid-start");
                            }
                            C3945tD y9 = C3686oN.y(OD.f26665u, new C2889Zc(c2946an2, optString6, c4072vf3, c4856a3), AbstractC3212fg.f30743f);
                            if (((Boolean) rVar2.f40119c.a(AbstractC3368ia.f31537R2)).booleanValue()) {
                                AbstractC2720Pd.g(y9, "NativeAssetsLoader.omidWebView", sd);
                            }
                            c3945tD = y9;
                            r12.B(65, c3945tD);
                            ArrayList arrayList2 = new ArrayList();
                            final J3.a aVar9 = aVar2;
                            arrayList2.add(aVar9);
                            final J3.a aVar10 = aVar;
                            arrayList2.add(aVar10);
                            final J3.a aVar11 = aVar6;
                            arrayList2.add(aVar11);
                            final J3.a aVar12 = aVar4;
                            arrayList2.add(aVar12);
                            final J3.a aVar13 = aVar7;
                            arrayList2.add(aVar13);
                            final J3.a aVar14 = aVar5;
                            arrayList2.add(aVar14);
                            arrayList2.add(d2);
                            final OD od7 = od2;
                            arrayList2.add(od7);
                            arrayList2.add(A8);
                            final C4856a c4856a6 = c4856a3;
                            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31749o6)).booleanValue() || jSONObject2.optInt("template_id") == 3) {
                                arrayList2.add(c3945tD);
                            }
                            UB n9 = UB.n(arrayList2);
                            final JSONObject jSONObject3 = jSONObject2;
                            final C4072vf c4072vf6 = c4072vf3;
                            final J3.a aVar15 = d2;
                            final C2518Df c2518Df5 = r12;
                            Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.Um
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    List list;
                                    JSONObject optJSONObject10;
                                    C2518Df c2518Df6 = C2518Df.this;
                                    J3.a aVar16 = aVar9;
                                    J3.a aVar17 = aVar10;
                                    J3.a aVar18 = aVar13;
                                    J3.a aVar19 = aVar12;
                                    J3.a aVar20 = aVar14;
                                    JSONObject jSONObject4 = jSONObject3;
                                    J3.a aVar21 = aVar15;
                                    J3.a aVar22 = od7;
                                    J3.a aVar23 = aVar11;
                                    J3.a aVar24 = c3945tD;
                                    J3.a aVar25 = A8;
                                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31485L2)).booleanValue()) {
                                        com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, (C3002bo) c2518Df6.f24456x, "rendering-native-assets-loading-end");
                                    }
                                    C3917sm c3917sm = (C3917sm) aVar16.get();
                                    List list2 = (List) aVar17.get();
                                    synchronized (c3917sm) {
                                        c3917sm.f34279e = list2;
                                    }
                                    InterfaceC3637nb interfaceC3637nb = (InterfaceC3637nb) aVar18.get();
                                    synchronized (c3917sm) {
                                        c3917sm.f34292s = interfaceC3637nb;
                                    }
                                    InterfaceC3637nb interfaceC3637nb2 = (InterfaceC3637nb) aVar19.get();
                                    synchronized (c3917sm) {
                                        c3917sm.f34293t = interfaceC3637nb2;
                                    }
                                    InterfaceC3421jb interfaceC3421jb = (InterfaceC3421jb) aVar20.get();
                                    synchronized (c3917sm) {
                                        c3917sm.f34277c = interfaceC3421jb;
                                    }
                                    JSONObject optJSONObject11 = jSONObject4.optJSONObject("mute");
                                    if (optJSONObject11 == null) {
                                        SB sb = UB.f27942u;
                                        list = C3675oC.f33115x;
                                    } else {
                                        JSONArray optJSONArray6 = optJSONObject11.optJSONArray("reasons");
                                        if (optJSONArray6 == null || optJSONArray6.length() <= 0) {
                                            SB sb2 = UB.f27942u;
                                            list = C3675oC.f33115x;
                                        } else {
                                            ArrayList arrayList3 = new ArrayList();
                                            for (int i13 = 0; i13 < optJSONArray6.length(); i13++) {
                                                q2.L0 f6 = C2946an.f(optJSONArray6.optJSONObject(i13));
                                                if (f6 != null) {
                                                    arrayList3.add(f6);
                                                }
                                            }
                                            list = UB.n(arrayList3);
                                        }
                                    }
                                    synchronized (c3917sm) {
                                        c3917sm.f34280f = list;
                                    }
                                    JSONObject optJSONObject12 = jSONObject4.optJSONObject("mute");
                                    q2.L0 f9 = (optJSONObject12 == null || (optJSONObject10 = optJSONObject12.optJSONObject("default_reason")) == null) ? null : C2946an.f(optJSONObject10);
                                    synchronized (c3917sm) {
                                        c3917sm.f34281g = f9;
                                    }
                                    InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) aVar21.get();
                                    if (interfaceC3858rh != null) {
                                        synchronized (c3917sm) {
                                            c3917sm.i = interfaceC3858rh;
                                        }
                                        View b02 = interfaceC3858rh.b0();
                                        synchronized (c3917sm) {
                                            c3917sm.f34288o = b02;
                                        }
                                        BinderC2554Fh g9 = interfaceC3858rh.g();
                                        synchronized (c3917sm) {
                                            c3917sm.f34276b = g9;
                                        }
                                    }
                                    c3917sm.d().putAll((Bundle) aVar22.get());
                                    InterfaceC3858rh interfaceC3858rh2 = (InterfaceC3858rh) aVar23.get();
                                    if (interfaceC3858rh2 != null) {
                                        synchronized (c3917sm) {
                                            c3917sm.f34283j = interfaceC3858rh2;
                                        }
                                        View b03 = interfaceC3858rh2.b0();
                                        synchronized (c3917sm) {
                                            c3917sm.f34289p = b03;
                                        }
                                    }
                                    if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31749o6)).booleanValue() || jSONObject4.optInt("template_id") == 3) {
                                        InterfaceC3858rh interfaceC3858rh3 = (InterfaceC3858rh) aVar24.get();
                                        if (interfaceC3858rh3 != null) {
                                            synchronized (c3917sm) {
                                                c3917sm.f34284k = interfaceC3858rh3;
                                            }
                                        }
                                    } else {
                                        synchronized (c3917sm) {
                                            c3917sm.f34286m = aVar24;
                                        }
                                        C3320hg c3320hg2 = new C3320hg();
                                        synchronized (c3917sm) {
                                            c3917sm.f34287n = c3320hg2;
                                        }
                                    }
                                    for (C3055cn c3055cn : (List) aVar25.get()) {
                                        if (c3055cn.f29747a != 1) {
                                            String str3 = c3055cn.f29748b;
                                            BinderC3098db binderC3098db = c3055cn.f29750d;
                                            synchronized (c3917sm) {
                                                if (binderC3098db == null) {
                                                    c3917sm.f34295v.remove(str3);
                                                } else {
                                                    c3917sm.f34295v.put(str3, binderC3098db);
                                                }
                                            }
                                        } else {
                                            c3917sm.o(c3055cn.f29748b, c3055cn.f29749c);
                                        }
                                    }
                                    return c3917sm;
                                }
                            };
                            final GD gd = new GD(n9, false, false);
                            gd.f25114I = new FD(gd, callable, c3157eg);
                            gd.w();
                            C3675oC o9 = UB.o(new J3.a[]{b9, gd});
                            Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.ads.Pq
                                /* JADX WARN: Removed duplicated region for block: B:46:0x0952  */
                                @Override // java.util.concurrent.Callable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object call() {
                                    C2750Qq c2750Qq;
                                    final int i13;
                                    int i14 = 13;
                                    int i15 = 0;
                                    C2750Qq c2750Qq2 = C2750Qq.this;
                                    GD gd2 = gd;
                                    J3.a aVar16 = b9;
                                    C2953au c2953au2 = c2953au;
                                    Ut ut2 = ut;
                                    JSONObject jSONObject4 = jSONObject;
                                    C4856a c4856a7 = c4856a6;
                                    C4072vf c4072vf7 = c4072vf6;
                                    c2750Qq2.getClass();
                                    C3917sm c3917sm = (C3917sm) gd2.get();
                                    C4026un c4026un = (C4026un) aVar16.get();
                                    C3151ea c3151ea4 = AbstractC3368ia.f31494M2;
                                    q2.r rVar3 = q2.r.f40116e;
                                    if (((Boolean) rVar3.f40119c.a(c3151ea4)).booleanValue()) {
                                        com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c2750Qq2.f27254f, "rendering-webview-creation-end");
                                    }
                                    C3105di c3105di = c2750Qq2.f27249a;
                                    C3602mu c3602mu3 = new C3602mu(c2953au2, ut2, (String) null);
                                    C3562m7 c3562m7 = new C3562m7(18, c3917sm);
                                    C2518Df c2518Df6 = new C2518Df(jSONObject4, c4026un, c4856a7, c4072vf7, 12);
                                    C3214fi c3214fi = c3105di.f30128b;
                                    C3105di c3105di2 = c3105di.f30131c;
                                    C4009uN a10 = C4009uN.a(new C2826Vh(c3214fi.f30772L0, 12));
                                    C2675Mj c2675Mj = new C2675Mj(c3602mu3, 0);
                                    C3218fm c3218fm = new C3218fm(c2518Df6, i15);
                                    C2694Nl c2694Nl = new C2694Nl(C4009uN.a(new C2637Kf(c2675Mj, c3218fm, i14)), 10);
                                    C4009uN a11 = C4009uN.a(new C3913si(14, c2694Nl));
                                    C2860Xh c2860Xh = c3214fi.i;
                                    C2945am c2945am = AbstractC3194fG.f30663X;
                                    C4009uN a12 = C4009uN.a(new C2484Bf(c2860Xh, a11, c2945am, 1));
                                    int i16 = 3;
                                    C4009uN a13 = C4009uN.a(new C2942aj(a10, C4009uN.a(new C2941ai(c3214fi.f30805g, a12, i16)), c3214fi.f30797c, C4009uN.a(new C2758Rh(a12, a10, i16)), c3214fi.f30803f, 0));
                                    C4009uN a14 = C4009uN.a(new C2758Rh(a13, a11, 5));
                                    C4009uN a15 = C4009uN.a(new C3377ik(c3105di2.f30176x, c2675Mj, 0));
                                    C4009uN a16 = C4009uN.a(new C2760Rj(a15, 16));
                                    int i17 = AN.f23864c;
                                    ArrayList arrayList3 = new ArrayList(1);
                                    ArrayList arrayList4 = new ArrayList(3);
                                    arrayList4.add(c3105di2.f30175w0);
                                    arrayList4.add(c3105di2.f30177x0);
                                    arrayList4.add(a14);
                                    arrayList3.add(a16);
                                    C4009uN a17 = C4009uN.a(new C3861rk(new AN(arrayList3, arrayList4), 3));
                                    C4009uN a18 = C4009uN.a(AbstractC3194fG.f30662W);
                                    C4009uN c4009uN = c3214fi.f30797c;
                                    C4009uN a19 = C4009uN.a(new C2758Rh(a18, c4009uN, 11));
                                    C2675Mj c2675Mj2 = new C2675Mj(c3602mu3, 3);
                                    C2675Mj c2675Mj3 = new C2675Mj(c3602mu3, 2);
                                    C2860Xh c2860Xh2 = c3214fi.f30805g;
                                    C4009uN a20 = C4009uN.a(new C2877Yh(c2860Xh2, 16));
                                    C4009uN a21 = C4009uN.a(AbstractC2655Lg.f26171F);
                                    C4009uN a22 = C4009uN.a(new C2674Mi(c2860Xh2, c3214fi.J, a20, a21, c3214fi.f30767I0, c3214fi.f30799d));
                                    C4009uN a23 = C4009uN.a(new C2674Mi(c3214fi.f30783R, c3214fi.f30781Q, c2675Mj, c2675Mj3, a22, c3105di2.f30137e));
                                    C2945am c2945am2 = new C2945am(4);
                                    C2945am c2945am3 = new C2945am(2);
                                    C4009uN a24 = C4009uN.a(new C2758Rh(a18, c4009uN, 16));
                                    C4009uN a25 = C4009uN.a(AbstractC3035cL.f29695z);
                                    C2694Nl c2694Nl2 = new C2694Nl(a25, 13);
                                    ArrayList arrayList5 = new ArrayList(2);
                                    ArrayList arrayList6 = new ArrayList(1);
                                    arrayList6.add(c3105di2.C0);
                                    arrayList5.add(a24);
                                    arrayList5.add(c2694Nl2);
                                    C4009uN a26 = C4009uN.a(new C2484Bf(new AN(arrayList5, arrayList6), c2675Mj, c2675Mj2, 7));
                                    C4009uN a27 = C4009uN.a(new C3913si(12, c2675Mj2));
                                    C4009uN a28 = C4009uN.a(new C2793Ti(c3214fi.f30805g, c3214fi.f30797c, c3214fi.f30799d, c2675Mj2, c2675Mj, c3105di2.f30167s0, a23, c2945am2, c2945am3, c3214fi.f30775N, c3105di2.f30169t0, c3105di2.f30137e, c3105di2.f30079B0, a26, a27, c3105di2.f30157n0));
                                    int i18 = 2;
                                    C2760Rj c2760Rj = new C2760Rj(a28, i18);
                                    C2760Rj c2760Rj2 = new C2760Rj(C4009uN.a(new C2637Kf(c2675Mj, c3214fi.f30800d0, i18)), 22);
                                    ArrayList arrayList7 = new ArrayList(4);
                                    ArrayList arrayList8 = new ArrayList(2);
                                    arrayList7.add(c3105di2.f30179y0);
                                    arrayList8.add(c3105di2.f30181z0);
                                    arrayList8.add(c3105di2.f30077A0);
                                    arrayList7.add(a19);
                                    arrayList7.add(c2760Rj);
                                    arrayList7.add(c2760Rj2);
                                    C4009uN a29 = C4009uN.a(new C3861rk(new AN(arrayList7, arrayList8), 4));
                                    C4009uN a30 = C4009uN.a(new C3107dk(c3214fi.f30805g, c3214fi.f30765H0, c3214fi.f30819o, c2675Mj2, c2675Mj, c3214fi.f30779P, c2945am));
                                    C4009uN a31 = C4009uN.a(new C2760Rj(a30, 13));
                                    C4009uN a32 = C4009uN.a(new C2758Rh(a18, c3214fi.f30797c, 10));
                                    C4009uN a33 = C4009uN.a(new C2760Rj(C4009uN.a(new C2828Vj(c3214fi.f30757D0, c3105di2.f30134d)), 11));
                                    C2760Rj c2760Rj3 = new C2760Rj(a28, 1);
                                    ArrayList arrayList9 = new ArrayList(5);
                                    ArrayList arrayList10 = new ArrayList(3);
                                    arrayList9.add(c3105di2.f30082D0);
                                    arrayList9.add(c3105di2.f30084E0);
                                    arrayList10.add(c3105di2.f30086F0);
                                    arrayList10.add(c3105di2.f30088G0);
                                    arrayList9.add(a31);
                                    arrayList9.add(a32);
                                    arrayList10.add(a33);
                                    arrayList9.add(c2760Rj3);
                                    C4009uN a34 = C4009uN.a(new C3861rk(new AN(arrayList9, arrayList10), 0));
                                    C4009uN a35 = C4009uN.a(new C2758Rh(a13, a11, 4));
                                    C4009uN a36 = C4009uN.a(new C2760Rj(a30, 14));
                                    C4009uN c4009uN2 = c3214fi.f30797c;
                                    C4009uN a37 = C4009uN.a(new C2758Rh(a18, c4009uN2, 13));
                                    C4009uN a38 = C4009uN.a(new C2760Rj(c3105di2.f30164r, 15));
                                    C2826Vh c2826Vh = new C2826Vh(a26, 20);
                                    C2760Rj c2760Rj4 = new C2760Rj(a28, 4);
                                    C3913si c3913si = new C3913si(16, c3562m7);
                                    C2694Nl c2694Nl3 = new C2694Nl(C4009uN.a(new C2484Bf(c3913si, c2694Nl, c4009uN2, 9)), 12);
                                    ArrayList arrayList11 = new ArrayList(8);
                                    ArrayList arrayList12 = new ArrayList(3);
                                    arrayList11.add(c3105di2.f30090H0);
                                    arrayList11.add(c3105di2.f30092I0);
                                    arrayList12.add(c3105di2.f30093J0);
                                    arrayList12.add(c3105di2.f30095K0);
                                    arrayList12.add(a35);
                                    arrayList11.add(a36);
                                    arrayList11.add(a37);
                                    arrayList11.add(a38);
                                    arrayList11.add(c2826Vh);
                                    arrayList11.add(c2760Rj4);
                                    arrayList11.add(c2694Nl3);
                                    C4009uN a39 = C4009uN.a(new C3861rk(new AN(arrayList11, arrayList12), 2));
                                    C2760Rj c2760Rj5 = new C2760Rj(a28, 7);
                                    ArrayList arrayList13 = new ArrayList(1);
                                    ArrayList arrayList14 = new ArrayList(1);
                                    arrayList14.add(c3105di2.f30097L0);
                                    arrayList13.add(c2760Rj5);
                                    C4009uN a40 = C4009uN.a(new C3861rk(new AN(arrayList13, arrayList14), 19));
                                    C2760Rj c2760Rj6 = new C2760Rj(C4009uN.a(new C3377ik(c2675Mj, c3214fi.f30783R)), 0);
                                    ArrayList arrayList15 = new ArrayList(1);
                                    new ArrayList(1).add(c3105di2.f30099M0);
                                    arrayList15.add(c2760Rj6);
                                    C4009uN a41 = C4009uN.a(new C2758Rh(a18, c3214fi.f30797c, 17));
                                    ArrayList arrayList16 = new ArrayList(1);
                                    ArrayList arrayList17 = new ArrayList(1);
                                    arrayList17.add(c3105di2.f30101N0);
                                    arrayList16.add(a41);
                                    C4009uN a42 = C4009uN.a(new C3861rk(new AN(arrayList16, arrayList17), 20));
                                    C4009uN a43 = C4009uN.a(new C2760Rj(a15, 17));
                                    C2760Rj c2760Rj7 = new C2760Rj(a28, 5);
                                    ArrayList arrayList18 = new ArrayList(7);
                                    ArrayList arrayList19 = new ArrayList(4);
                                    arrayList18.add(c3105di2.f30103O0);
                                    arrayList19.add(c3105di2.f30105P0);
                                    arrayList18.add(c3105di2.f30107Q0);
                                    arrayList18.add(c3105di2.f30109R0);
                                    arrayList19.add(c3105di2.f30111S0);
                                    arrayList19.add(c3105di2.f30113T0);
                                    arrayList19.add(c3105di2.f30115U0);
                                    arrayList18.add(c3105di2.f30117V0);
                                    arrayList18.add(c3105di2.f30119W0);
                                    arrayList18.add(a43);
                                    arrayList18.add(c2760Rj7);
                                    C4009uN a44 = C4009uN.a(new C3861rk(new AN(arrayList18, arrayList19), 5));
                                    C2760Rj c2760Rj8 = new C2760Rj(C4009uN.a(new C2826Vh(a29, 19)), 9);
                                    C4009uN a45 = C4009uN.a(new C2758Rh(a18, c3214fi.f30797c, 15));
                                    ArrayList arrayList20 = new ArrayList(2);
                                    ArrayList arrayList21 = new ArrayList(1);
                                    arrayList21.add(c3105di2.f30122Y0);
                                    arrayList20.add(c2760Rj8);
                                    arrayList20.add(a45);
                                    C4009uN a46 = C4009uN.a(new C3861rk(new AN(arrayList20, arrayList21), 9));
                                    List list = Collections.EMPTY_LIST;
                                    new ArrayList(1).add(c3105di2.f30124Z0);
                                    C4009uN a47 = C4009uN.a(new C2760Rj(a30, 12));
                                    ArrayList arrayList22 = new ArrayList(1);
                                    List list2 = Collections.EMPTY_LIST;
                                    arrayList22.add(a47);
                                    C4009uN a48 = C4009uN.a(new C2758Rh(a18, c3214fi.f30797c, 12));
                                    C2760Rj c2760Rj9 = new C2760Rj(a28, 3);
                                    ArrayList arrayList23 = new ArrayList(2);
                                    new ArrayList(1).add(c3105di2.f30127a1);
                                    arrayList23.add(a48);
                                    arrayList23.add(c2760Rj9);
                                    C4009uN a49 = C4009uN.a(new C2760Rj(a30, 8));
                                    ArrayList arrayList24 = new ArrayList(1);
                                    List list3 = Collections.EMPTY_LIST;
                                    arrayList24.add(a49);
                                    C2675Mj c2675Mj4 = new C2675Mj(c3602mu3, 1);
                                    C4184xj c4184xj = new C4184xj(c2675Mj, c2675Mj4, c3105di2.f30076A, c2675Mj3, c3105di2.f30140f);
                                    ArrayList arrayList25 = new ArrayList(1);
                                    ArrayList arrayList26 = new ArrayList(1);
                                    arrayList26.add(c3105di2.f30133c1);
                                    arrayList25.add(c3105di2.f30136d1);
                                    C2726Pj c2726Pj = new C2726Pj(c2675Mj2, c2675Mj, a17, a44, c3105di2.f30130b1, c4184xj, a18, new C3861rk(new AN(arrayList25, arrayList26), 6), a40, a27, c3214fi.f30828s0);
                                    C3218fm c3218fm2 = new C3218fm(c2518Df6, 1);
                                    C4009uN a50 = C4009uN.a(new C2559Fm(c3218fm2, c3214fi.f30803f));
                                    C4009uN a51 = C4009uN.a(new C2758Rh(a13, a11, 6));
                                    List list4 = Collections.EMPTY_LIST;
                                    ArrayList arrayList27 = new ArrayList(2);
                                    arrayList27.add(c3105di2.f30139e1);
                                    arrayList27.add(a51);
                                    AN an = new AN(list4, arrayList27);
                                    C4009uN c4009uN3 = c3105di2.f30176x;
                                    C4009uN a52 = C4009uN.a(new C2484Bf(c4009uN3, an, c2675Mj, 8));
                                    C4009uN a53 = C4009uN.a(new C3218fm(c2518Df6, 2));
                                    C4009uN a54 = C4009uN.a(new C3218fm(c2518Df6, 3));
                                    C2898Zl c2898Zl = c3105di2.m0;
                                    C4009uN c4009uN4 = c3214fi.f30775N;
                                    C2860Xh c2860Xh3 = c3214fi.i;
                                    C3700ok c3700ok = c3105di2.f30134d;
                                    C4009uN c4009uN5 = c3214fi.f30803f;
                                    C2694Nl c2694Nl4 = new C2694Nl(C4009uN.a(new C3163em(c4009uN3, c2898Zl, c3218fm, c3218fm2, c3913si, c4009uN4, a39, a34, a42, c2675Mj, c2860Xh3, c3700ok, a13, a50, c4009uN5, a52, c3214fi.f30783R, c3105di2.f30137e, c3214fi.f30785S, a21, c3214fi.f30782Q0, a26, a53, a54, a27)), 11);
                                    C4009uN a55 = C4009uN.a(new C3272gm(c2860Xh3, 0));
                                    C4009uN c4009uN6 = c3214fi.f30797c;
                                    C4009uN a56 = C4009uN.a(new C4121wa(a55, c4009uN6, c4009uN3, c4009uN5, 1));
                                    C4009uN c4009uN7 = c3105di2.f30171u0;
                                    C2843Wh c2843Wh = new C2843Wh(c4009uN7, c3218fm2, a56, c2694Nl4);
                                    C2559Fm c2559Fm = new C2559Fm(c4009uN7, c3218fm2);
                                    C4009uN a57 = C4009uN.a(new C3913si(15, new C3379im(c3913si, 0)));
                                    C2491Bm c2491Bm = new C2491Bm(c3214fi.J, c3700ok, c2694Nl, c3913si, c2843Wh, c2559Fm, c4009uN6, a57);
                                    C3006bs c3006bs = new C3006bs();
                                    C4009uN a58 = C4009uN.a(new C3541ln(c2675Mj4, c3006bs, c3913si, 1));
                                    C4009uN a59 = C4009uN.a(new C3541ln(c2675Mj4, c3006bs, c3913si, 0));
                                    C4009uN a60 = C4009uN.a(new C2843Wh((InterfaceC4063vN) c2675Mj4, (InterfaceC4063vN) c3006bs, (InterfaceC4063vN) c3913si, c3214fi.f30819o, 8));
                                    C4009uN a61 = C4009uN.a(new C2637Kf(c3006bs, c3913si, 17));
                                    C2860Xh c2860Xh4 = c3214fi.f30805g;
                                    C4009uN a62 = C4009uN.a(new C2843Wh(c2860Xh4, c3913si, c2491Bm, c3006bs, 7));
                                    C3006bs.a(c3006bs, C4009uN.a(new C3702om(c2726Pj, c4009uN6, c3913si, c2694Nl4, c2491Bm, c2694Nl, c2898Zl, a58, a59, a60, a61, a62, new C3807qj(c2860Xh4, c3700ok, 2), c4009uN4, c2860Xh3, c2860Xh4, a57, a25, c3214fi.f30784R0)));
                                    C4009uN c4009uN8 = c3105di2.f30142f1;
                                    C4009uN c4009uN9 = c3105di2.f30121X0;
                                    C4009uN a63 = C4009uN.a(new C2491Bm(a34, a29, c4009uN8, a46, c4009uN9, c2675Mj, c2675Mj3, a22, 1));
                                    C4009uN a64 = C4009uN.a(new C2942aj(c3214fi.f30797c, a56, C4009uN.a(new C3377ik(c3105di2.f30176x, c2675Mj, 2)), a22, a27, 1));
                                    C4009uN a65 = C4009uN.a(new C3483kj(a34, a29, c4009uN8, a46, c4009uN9, a42, c3214fi.f30819o, c3214fi.f30783R, c3214fi.f30779P, a22, 2));
                                    if (((Boolean) rVar3.f40119c.a(c3151ea4)).booleanValue()) {
                                        p2.j.f39798C.f39810k.getClass();
                                        long currentTimeMillis = System.currentTimeMillis();
                                        c2750Qq = c2750Qq2;
                                        C3002bo c3002bo4 = c2750Qq.f27254f;
                                        c3002bo4.c("rendering-ad-component-creation-end", currentTimeMillis);
                                        c3002bo4.c("rendering-configure-webview-start", currentTimeMillis);
                                    } else {
                                        c2750Qq = c2750Qq2;
                                    }
                                    C4133wm c4133wm = (C4133wm) c3105di2.f30125a.f28862u;
                                    AbstractC3137eE.h(c4133wm);
                                    AbstractC3137eE.h(c3917sm);
                                    AbstractC3137eE.h(c4026un);
                                    C2685Nc c2685Nc = new C2685Nc(c4133wm, c3917sm, c4026un, C4009uN.b(a62));
                                    if (((InterfaceC2514Db) c2685Nc.f26570u) != null) {
                                        ((C4026un) c2685Nc.f26571v).b("/nativeAdCustomClick", c2685Nc);
                                    }
                                    C3918sn c3918sn = (C3918sn) a63.d();
                                    C2557Fk c2557Fk = c3918sn.f34300b;
                                    C3757pn c3757pn = c4026un.f34650a;
                                    Objects.requireNonNull(c2557Fk);
                                    C3864rn c3864rn = new C3864rn(0, c2557Fk);
                                    C3808qk c3808qk = c3918sn.f34299a;
                                    C2659Lk c2659Lk = c3918sn.f34301c;
                                    C2727Pk c2727Pk = c3918sn.f34302d;
                                    C3325hl c3325hl = c3918sn.f34303e;
                                    synchronized (c3757pn) {
                                        c3757pn.f33506n = c3808qk;
                                        c3757pn.f33507u = c2659Lk;
                                        c3757pn.f33508v = c2727Pk;
                                        c3757pn.f33509w = c3325hl;
                                        c3757pn.f33510x = c3864rn;
                                    }
                                    Ut ut3 = c3918sn.f34304f;
                                    Wt wt4 = c3918sn.f34305g;
                                    C2657Li c2657Li = c3918sn.f34306h;
                                    synchronized (c4026un) {
                                        C3999uD c3999uD = c4026un.f34661m;
                                        if (c3999uD != null) {
                                            C2518Df c2518Df7 = new C2518Df(c4026un, ut3, wt4, c2657Li);
                                            c3999uD.c(new MD(0, c3999uD, c2518Df7), c4026un.f34654e);
                                        }
                                    }
                                    final C3219fn c3219fn = (C3219fn) a64.d();
                                    InterfaceC3858rh h9 = c3917sm.h();
                                    c3219fn.getClass();
                                    if (h9 != null) {
                                        View b02 = h9.b0();
                                        C2490Bl c2490Bl = c3219fn.f30884c;
                                        c2490Bl.v1(b02);
                                        C3110dn c3110dn = new C3110dn(h9, 1);
                                        Executor executor2 = c3219fn.f30882a;
                                        c2490Bl.s1(c3110dn, executor2);
                                        c2490Bl.s1(new C3110dn(h9, 0), executor2);
                                        C2997bj c2997bj = c3219fn.f30883b;
                                        c2490Bl.s1(c2997bj, executor2);
                                        c2997bj.f29552n = h9;
                                        C2588Hh j02 = h9.j0();
                                        if (!((Boolean) rVar3.f40119c.a(AbstractC3368ia.Ab)).booleanValue() || j02 == null) {
                                            i13 = 0;
                                        } else {
                                            j02.c("/click");
                                            InterfaceC2524Dl interfaceC2524Dl = j02.f25384D;
                                            C2820Vb c2820Vb = AbstractC2935ac.f29210a;
                                            C2657Li c2657Li2 = c3219fn.f30885d;
                                            i13 = 0;
                                            j02.b("/click", new C2871Yb(0, interfaceC2524Dl, c2657Li2));
                                            j02.z(c2657Li2, null, null);
                                        }
                                        h9.N0("/trackActiveViewUnit", new InterfaceC2990bc() { // from class: com.google.android.gms.internal.ads.en
                                            @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
                                            public final void g(Object obj, Map map) {
                                                switch (i13) {
                                                    case 0:
                                                        C2997bj c2997bj2 = c3219fn.f30883b;
                                                        c2997bj2.f29556x = true;
                                                        c2997bj2.a();
                                                        break;
                                                    default:
                                                        c3219fn.f30883b.f29556x = false;
                                                        break;
                                                }
                                            }
                                        });
                                        final int i19 = 1;
                                        h9.N0("/untrackActiveViewUnit", new InterfaceC2990bc() { // from class: com.google.android.gms.internal.ads.en
                                            @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
                                            public final void g(Object obj, Map map) {
                                                switch (i19) {
                                                    case 0:
                                                        C2997bj c2997bj2 = c3219fn.f30883b;
                                                        c2997bj2.f29556x = true;
                                                        c2997bj2.a();
                                                        break;
                                                    default:
                                                        c3219fn.f30883b.f29556x = false;
                                                        break;
                                                }
                                            }
                                        });
                                        h9.j0().f25399T = c3219fn.f30886e;
                                    }
                                    C4188xn c4188xn = (C4188xn) a65.d();
                                    C4242yn c4242yn = c2750Qq.f27253e;
                                    InterfaceC3858rh i20 = c3917sm.i();
                                    c4188xn.getClass();
                                    C4134wn c4134wn = c4242yn.f35408a;
                                    C2557Fk c2557Fk2 = c4188xn.f35244b;
                                    Objects.requireNonNull(c2557Fk2);
                                    C3864rn c3864rn2 = new C3864rn(1, c2557Fk2);
                                    C3808qk c3808qk2 = c4188xn.f35243a;
                                    C2659Lk c2659Lk2 = c4188xn.f35245c;
                                    C2727Pk c2727Pk2 = c4188xn.f35246d;
                                    C3325hl c3325hl2 = c4188xn.f35247e;
                                    C2507Cl c2507Cl = c4188xn.f35248f;
                                    synchronized (c4134wn) {
                                        synchronized (c4134wn) {
                                            c4134wn.f33506n = c3808qk2;
                                            c4134wn.f33507u = c2659Lk2;
                                            c4134wn.f33508v = c2727Pk2;
                                            c4134wn.f33509w = c3325hl2;
                                            c4134wn.f33510x = c3864rn2;
                                        }
                                        if (((Boolean) rVar3.f40119c.a(AbstractC3368ia.Bb)).booleanValue() && i20 != null && i20.j0() != null) {
                                            C2588Hh j03 = i20.j0();
                                            C2657Li c2657Li3 = c4188xn.f35251j;
                                            C2834Vp c2834Vp = c4188xn.i;
                                            j03.y(c2657Li3, c2834Vp, c4188xn.f35250h);
                                            j03.z(c2657Li3, c2834Vp, c4188xn.f35249g);
                                        }
                                        if (((Boolean) rVar3.f40119c.a(c3151ea4)).booleanValue()) {
                                            com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c2750Qq.f27254f, "rendering-configure-webview-end");
                                        }
                                        return (C3648nm) c3006bs.d();
                                    }
                                    c4134wn.f35068y = c2507Cl;
                                    if (((Boolean) rVar3.f40119c.a(AbstractC3368ia.Bb)).booleanValue()) {
                                        C2588Hh j032 = i20.j0();
                                        C2657Li c2657Li32 = c4188xn.f35251j;
                                        C2834Vp c2834Vp2 = c4188xn.i;
                                        j032.y(c2657Li32, c2834Vp2, c4188xn.f35250h);
                                        j032.z(c2657Li32, c2834Vp2, c4188xn.f35249g);
                                    }
                                    if (((Boolean) rVar3.f40119c.a(c3151ea4)).booleanValue()) {
                                    }
                                    return (C3648nm) c3006bs.d();
                                }
                            };
                            GD gd2 = new GD(o9, true, false);
                            gd2.f25114I = new FD(gd2, callable2, this.f27250b);
                            gd2.w();
                            return gd2;
                        }
                        c3945tD2 = OD.f26665u;
                    }
                } else {
                    c3945tD2 = OD.f26665u;
                }
                c3945tD = c3945tD2;
                r12.B(65, c3945tD);
                ArrayList arrayList22 = new ArrayList();
                final J3.a aVar92 = aVar2;
                arrayList22.add(aVar92);
                final J3.a aVar102 = aVar;
                arrayList22.add(aVar102);
                final J3.a aVar112 = aVar6;
                arrayList22.add(aVar112);
                final J3.a aVar122 = aVar4;
                arrayList22.add(aVar122);
                final J3.a aVar132 = aVar7;
                arrayList22.add(aVar132);
                final J3.a aVar142 = aVar5;
                arrayList22.add(aVar142);
                arrayList22.add(d2);
                final J3.a od72 = od2;
                arrayList22.add(od72);
                arrayList22.add(A8);
                final C4856a c4856a62 = c4856a3;
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31749o6)).booleanValue()) {
                }
                arrayList22.add(c3945tD);
                UB n92 = UB.n(arrayList22);
                final JSONObject jSONObject32 = jSONObject2;
                final C4072vf c4072vf62 = c4072vf3;
                final J3.a aVar152 = d2;
                final C2518Df c2518Df52 = r12;
                Callable callable3 = new Callable() { // from class: com.google.android.gms.internal.ads.Um
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        List list;
                        JSONObject optJSONObject10;
                        C2518Df c2518Df6 = C2518Df.this;
                        J3.a aVar16 = aVar92;
                        J3.a aVar17 = aVar102;
                        J3.a aVar18 = aVar132;
                        J3.a aVar19 = aVar122;
                        J3.a aVar20 = aVar142;
                        JSONObject jSONObject4 = jSONObject32;
                        J3.a aVar21 = aVar152;
                        J3.a aVar22 = od72;
                        J3.a aVar23 = aVar112;
                        J3.a aVar24 = c3945tD;
                        J3.a aVar25 = A8;
                        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31485L2)).booleanValue()) {
                            com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, (C3002bo) c2518Df6.f24456x, "rendering-native-assets-loading-end");
                        }
                        C3917sm c3917sm = (C3917sm) aVar16.get();
                        List list2 = (List) aVar17.get();
                        synchronized (c3917sm) {
                            c3917sm.f34279e = list2;
                        }
                        InterfaceC3637nb interfaceC3637nb = (InterfaceC3637nb) aVar18.get();
                        synchronized (c3917sm) {
                            c3917sm.f34292s = interfaceC3637nb;
                        }
                        InterfaceC3637nb interfaceC3637nb2 = (InterfaceC3637nb) aVar19.get();
                        synchronized (c3917sm) {
                            c3917sm.f34293t = interfaceC3637nb2;
                        }
                        InterfaceC3421jb interfaceC3421jb = (InterfaceC3421jb) aVar20.get();
                        synchronized (c3917sm) {
                            c3917sm.f34277c = interfaceC3421jb;
                        }
                        JSONObject optJSONObject11 = jSONObject4.optJSONObject("mute");
                        if (optJSONObject11 == null) {
                            SB sb = UB.f27942u;
                            list = C3675oC.f33115x;
                        } else {
                            JSONArray optJSONArray6 = optJSONObject11.optJSONArray("reasons");
                            if (optJSONArray6 == null || optJSONArray6.length() <= 0) {
                                SB sb2 = UB.f27942u;
                                list = C3675oC.f33115x;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                for (int i13 = 0; i13 < optJSONArray6.length(); i13++) {
                                    q2.L0 f6 = C2946an.f(optJSONArray6.optJSONObject(i13));
                                    if (f6 != null) {
                                        arrayList3.add(f6);
                                    }
                                }
                                list = UB.n(arrayList3);
                            }
                        }
                        synchronized (c3917sm) {
                            c3917sm.f34280f = list;
                        }
                        JSONObject optJSONObject12 = jSONObject4.optJSONObject("mute");
                        q2.L0 f9 = (optJSONObject12 == null || (optJSONObject10 = optJSONObject12.optJSONObject("default_reason")) == null) ? null : C2946an.f(optJSONObject10);
                        synchronized (c3917sm) {
                            c3917sm.f34281g = f9;
                        }
                        InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) aVar21.get();
                        if (interfaceC3858rh != null) {
                            synchronized (c3917sm) {
                                c3917sm.i = interfaceC3858rh;
                            }
                            View b02 = interfaceC3858rh.b0();
                            synchronized (c3917sm) {
                                c3917sm.f34288o = b02;
                            }
                            BinderC2554Fh g9 = interfaceC3858rh.g();
                            synchronized (c3917sm) {
                                c3917sm.f34276b = g9;
                            }
                        }
                        c3917sm.d().putAll((Bundle) aVar22.get());
                        InterfaceC3858rh interfaceC3858rh2 = (InterfaceC3858rh) aVar23.get();
                        if (interfaceC3858rh2 != null) {
                            synchronized (c3917sm) {
                                c3917sm.f34283j = interfaceC3858rh2;
                            }
                            View b03 = interfaceC3858rh2.b0();
                            synchronized (c3917sm) {
                                c3917sm.f34289p = b03;
                            }
                        }
                        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31749o6)).booleanValue() || jSONObject4.optInt("template_id") == 3) {
                            InterfaceC3858rh interfaceC3858rh3 = (InterfaceC3858rh) aVar24.get();
                            if (interfaceC3858rh3 != null) {
                                synchronized (c3917sm) {
                                    c3917sm.f34284k = interfaceC3858rh3;
                                }
                            }
                        } else {
                            synchronized (c3917sm) {
                                c3917sm.f34286m = aVar24;
                            }
                            C3320hg c3320hg2 = new C3320hg();
                            synchronized (c3917sm) {
                                c3917sm.f34287n = c3320hg2;
                            }
                        }
                        for (C3055cn c3055cn : (List) aVar25.get()) {
                            if (c3055cn.f29747a != 1) {
                                String str3 = c3055cn.f29748b;
                                BinderC3098db binderC3098db = c3055cn.f29750d;
                                synchronized (c3917sm) {
                                    if (binderC3098db == null) {
                                        c3917sm.f34295v.remove(str3);
                                    } else {
                                        c3917sm.f34295v.put(str3, binderC3098db);
                                    }
                                }
                            } else {
                                c3917sm.o(c3055cn.f29748b, c3055cn.f29749c);
                            }
                        }
                        return c3917sm;
                    }
                };
                final GD gd3 = new GD(n92, false, false);
                gd3.f25114I = new FD(gd3, callable3, c3157eg);
                gd3.w();
                C3675oC o92 = UB.o(new J3.a[]{b9, gd3});
                Callable callable22 = new Callable() { // from class: com.google.android.gms.internal.ads.Pq
                    /* JADX WARN: Removed duplicated region for block: B:46:0x0952  */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object call() {
                        C2750Qq c2750Qq;
                        final int i13;
                        int i14 = 13;
                        int i15 = 0;
                        C2750Qq c2750Qq2 = C2750Qq.this;
                        GD gd22 = gd3;
                        J3.a aVar16 = b9;
                        C2953au c2953au2 = c2953au;
                        Ut ut2 = ut;
                        JSONObject jSONObject4 = jSONObject;
                        C4856a c4856a7 = c4856a62;
                        C4072vf c4072vf7 = c4072vf62;
                        c2750Qq2.getClass();
                        C3917sm c3917sm = (C3917sm) gd22.get();
                        C4026un c4026un = (C4026un) aVar16.get();
                        C3151ea c3151ea4 = AbstractC3368ia.f31494M2;
                        q2.r rVar3 = q2.r.f40116e;
                        if (((Boolean) rVar3.f40119c.a(c3151ea4)).booleanValue()) {
                            com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c2750Qq2.f27254f, "rendering-webview-creation-end");
                        }
                        C3105di c3105di = c2750Qq2.f27249a;
                        C3602mu c3602mu3 = new C3602mu(c2953au2, ut2, (String) null);
                        C3562m7 c3562m7 = new C3562m7(18, c3917sm);
                        C2518Df c2518Df6 = new C2518Df(jSONObject4, c4026un, c4856a7, c4072vf7, 12);
                        C3214fi c3214fi = c3105di.f30128b;
                        C3105di c3105di2 = c3105di.f30131c;
                        C4009uN a10 = C4009uN.a(new C2826Vh(c3214fi.f30772L0, 12));
                        C2675Mj c2675Mj = new C2675Mj(c3602mu3, 0);
                        C3218fm c3218fm = new C3218fm(c2518Df6, i15);
                        C2694Nl c2694Nl = new C2694Nl(C4009uN.a(new C2637Kf(c2675Mj, c3218fm, i14)), 10);
                        C4009uN a11 = C4009uN.a(new C3913si(14, c2694Nl));
                        C2860Xh c2860Xh = c3214fi.i;
                        C2945am c2945am = AbstractC3194fG.f30663X;
                        C4009uN a12 = C4009uN.a(new C2484Bf(c2860Xh, a11, c2945am, 1));
                        int i16 = 3;
                        C4009uN a13 = C4009uN.a(new C2942aj(a10, C4009uN.a(new C2941ai(c3214fi.f30805g, a12, i16)), c3214fi.f30797c, C4009uN.a(new C2758Rh(a12, a10, i16)), c3214fi.f30803f, 0));
                        C4009uN a14 = C4009uN.a(new C2758Rh(a13, a11, 5));
                        C4009uN a15 = C4009uN.a(new C3377ik(c3105di2.f30176x, c2675Mj, 0));
                        C4009uN a16 = C4009uN.a(new C2760Rj(a15, 16));
                        int i17 = AN.f23864c;
                        ArrayList arrayList3 = new ArrayList(1);
                        ArrayList arrayList4 = new ArrayList(3);
                        arrayList4.add(c3105di2.f30175w0);
                        arrayList4.add(c3105di2.f30177x0);
                        arrayList4.add(a14);
                        arrayList3.add(a16);
                        C4009uN a17 = C4009uN.a(new C3861rk(new AN(arrayList3, arrayList4), 3));
                        C4009uN a18 = C4009uN.a(AbstractC3194fG.f30662W);
                        C4009uN c4009uN = c3214fi.f30797c;
                        C4009uN a19 = C4009uN.a(new C2758Rh(a18, c4009uN, 11));
                        C2675Mj c2675Mj2 = new C2675Mj(c3602mu3, 3);
                        C2675Mj c2675Mj3 = new C2675Mj(c3602mu3, 2);
                        C2860Xh c2860Xh2 = c3214fi.f30805g;
                        C4009uN a20 = C4009uN.a(new C2877Yh(c2860Xh2, 16));
                        C4009uN a21 = C4009uN.a(AbstractC2655Lg.f26171F);
                        C4009uN a22 = C4009uN.a(new C2674Mi(c2860Xh2, c3214fi.J, a20, a21, c3214fi.f30767I0, c3214fi.f30799d));
                        C4009uN a23 = C4009uN.a(new C2674Mi(c3214fi.f30783R, c3214fi.f30781Q, c2675Mj, c2675Mj3, a22, c3105di2.f30137e));
                        C2945am c2945am2 = new C2945am(4);
                        C2945am c2945am3 = new C2945am(2);
                        C4009uN a24 = C4009uN.a(new C2758Rh(a18, c4009uN, 16));
                        C4009uN a25 = C4009uN.a(AbstractC3035cL.f29695z);
                        C2694Nl c2694Nl2 = new C2694Nl(a25, 13);
                        ArrayList arrayList5 = new ArrayList(2);
                        ArrayList arrayList6 = new ArrayList(1);
                        arrayList6.add(c3105di2.C0);
                        arrayList5.add(a24);
                        arrayList5.add(c2694Nl2);
                        C4009uN a26 = C4009uN.a(new C2484Bf(new AN(arrayList5, arrayList6), c2675Mj, c2675Mj2, 7));
                        C4009uN a27 = C4009uN.a(new C3913si(12, c2675Mj2));
                        C4009uN a28 = C4009uN.a(new C2793Ti(c3214fi.f30805g, c3214fi.f30797c, c3214fi.f30799d, c2675Mj2, c2675Mj, c3105di2.f30167s0, a23, c2945am2, c2945am3, c3214fi.f30775N, c3105di2.f30169t0, c3105di2.f30137e, c3105di2.f30079B0, a26, a27, c3105di2.f30157n0));
                        int i18 = 2;
                        C2760Rj c2760Rj = new C2760Rj(a28, i18);
                        C2760Rj c2760Rj2 = new C2760Rj(C4009uN.a(new C2637Kf(c2675Mj, c3214fi.f30800d0, i18)), 22);
                        ArrayList arrayList7 = new ArrayList(4);
                        ArrayList arrayList8 = new ArrayList(2);
                        arrayList7.add(c3105di2.f30179y0);
                        arrayList8.add(c3105di2.f30181z0);
                        arrayList8.add(c3105di2.f30077A0);
                        arrayList7.add(a19);
                        arrayList7.add(c2760Rj);
                        arrayList7.add(c2760Rj2);
                        C4009uN a29 = C4009uN.a(new C3861rk(new AN(arrayList7, arrayList8), 4));
                        C4009uN a30 = C4009uN.a(new C3107dk(c3214fi.f30805g, c3214fi.f30765H0, c3214fi.f30819o, c2675Mj2, c2675Mj, c3214fi.f30779P, c2945am));
                        C4009uN a31 = C4009uN.a(new C2760Rj(a30, 13));
                        C4009uN a32 = C4009uN.a(new C2758Rh(a18, c3214fi.f30797c, 10));
                        C4009uN a33 = C4009uN.a(new C2760Rj(C4009uN.a(new C2828Vj(c3214fi.f30757D0, c3105di2.f30134d)), 11));
                        C2760Rj c2760Rj3 = new C2760Rj(a28, 1);
                        ArrayList arrayList9 = new ArrayList(5);
                        ArrayList arrayList10 = new ArrayList(3);
                        arrayList9.add(c3105di2.f30082D0);
                        arrayList9.add(c3105di2.f30084E0);
                        arrayList10.add(c3105di2.f30086F0);
                        arrayList10.add(c3105di2.f30088G0);
                        arrayList9.add(a31);
                        arrayList9.add(a32);
                        arrayList10.add(a33);
                        arrayList9.add(c2760Rj3);
                        C4009uN a34 = C4009uN.a(new C3861rk(new AN(arrayList9, arrayList10), 0));
                        C4009uN a35 = C4009uN.a(new C2758Rh(a13, a11, 4));
                        C4009uN a36 = C4009uN.a(new C2760Rj(a30, 14));
                        C4009uN c4009uN2 = c3214fi.f30797c;
                        C4009uN a37 = C4009uN.a(new C2758Rh(a18, c4009uN2, 13));
                        C4009uN a38 = C4009uN.a(new C2760Rj(c3105di2.f30164r, 15));
                        C2826Vh c2826Vh = new C2826Vh(a26, 20);
                        C2760Rj c2760Rj4 = new C2760Rj(a28, 4);
                        C3913si c3913si = new C3913si(16, c3562m7);
                        C2694Nl c2694Nl3 = new C2694Nl(C4009uN.a(new C2484Bf(c3913si, c2694Nl, c4009uN2, 9)), 12);
                        ArrayList arrayList11 = new ArrayList(8);
                        ArrayList arrayList12 = new ArrayList(3);
                        arrayList11.add(c3105di2.f30090H0);
                        arrayList11.add(c3105di2.f30092I0);
                        arrayList12.add(c3105di2.f30093J0);
                        arrayList12.add(c3105di2.f30095K0);
                        arrayList12.add(a35);
                        arrayList11.add(a36);
                        arrayList11.add(a37);
                        arrayList11.add(a38);
                        arrayList11.add(c2826Vh);
                        arrayList11.add(c2760Rj4);
                        arrayList11.add(c2694Nl3);
                        C4009uN a39 = C4009uN.a(new C3861rk(new AN(arrayList11, arrayList12), 2));
                        C2760Rj c2760Rj5 = new C2760Rj(a28, 7);
                        ArrayList arrayList13 = new ArrayList(1);
                        ArrayList arrayList14 = new ArrayList(1);
                        arrayList14.add(c3105di2.f30097L0);
                        arrayList13.add(c2760Rj5);
                        C4009uN a40 = C4009uN.a(new C3861rk(new AN(arrayList13, arrayList14), 19));
                        C2760Rj c2760Rj6 = new C2760Rj(C4009uN.a(new C3377ik(c2675Mj, c3214fi.f30783R)), 0);
                        ArrayList arrayList15 = new ArrayList(1);
                        new ArrayList(1).add(c3105di2.f30099M0);
                        arrayList15.add(c2760Rj6);
                        C4009uN a41 = C4009uN.a(new C2758Rh(a18, c3214fi.f30797c, 17));
                        ArrayList arrayList16 = new ArrayList(1);
                        ArrayList arrayList17 = new ArrayList(1);
                        arrayList17.add(c3105di2.f30101N0);
                        arrayList16.add(a41);
                        C4009uN a42 = C4009uN.a(new C3861rk(new AN(arrayList16, arrayList17), 20));
                        C4009uN a43 = C4009uN.a(new C2760Rj(a15, 17));
                        C2760Rj c2760Rj7 = new C2760Rj(a28, 5);
                        ArrayList arrayList18 = new ArrayList(7);
                        ArrayList arrayList19 = new ArrayList(4);
                        arrayList18.add(c3105di2.f30103O0);
                        arrayList19.add(c3105di2.f30105P0);
                        arrayList18.add(c3105di2.f30107Q0);
                        arrayList18.add(c3105di2.f30109R0);
                        arrayList19.add(c3105di2.f30111S0);
                        arrayList19.add(c3105di2.f30113T0);
                        arrayList19.add(c3105di2.f30115U0);
                        arrayList18.add(c3105di2.f30117V0);
                        arrayList18.add(c3105di2.f30119W0);
                        arrayList18.add(a43);
                        arrayList18.add(c2760Rj7);
                        C4009uN a44 = C4009uN.a(new C3861rk(new AN(arrayList18, arrayList19), 5));
                        C2760Rj c2760Rj8 = new C2760Rj(C4009uN.a(new C2826Vh(a29, 19)), 9);
                        C4009uN a45 = C4009uN.a(new C2758Rh(a18, c3214fi.f30797c, 15));
                        ArrayList arrayList20 = new ArrayList(2);
                        ArrayList arrayList21 = new ArrayList(1);
                        arrayList21.add(c3105di2.f30122Y0);
                        arrayList20.add(c2760Rj8);
                        arrayList20.add(a45);
                        C4009uN a46 = C4009uN.a(new C3861rk(new AN(arrayList20, arrayList21), 9));
                        List list = Collections.EMPTY_LIST;
                        new ArrayList(1).add(c3105di2.f30124Z0);
                        C4009uN a47 = C4009uN.a(new C2760Rj(a30, 12));
                        ArrayList arrayList222 = new ArrayList(1);
                        List list2 = Collections.EMPTY_LIST;
                        arrayList222.add(a47);
                        C4009uN a48 = C4009uN.a(new C2758Rh(a18, c3214fi.f30797c, 12));
                        C2760Rj c2760Rj9 = new C2760Rj(a28, 3);
                        ArrayList arrayList23 = new ArrayList(2);
                        new ArrayList(1).add(c3105di2.f30127a1);
                        arrayList23.add(a48);
                        arrayList23.add(c2760Rj9);
                        C4009uN a49 = C4009uN.a(new C2760Rj(a30, 8));
                        ArrayList arrayList24 = new ArrayList(1);
                        List list3 = Collections.EMPTY_LIST;
                        arrayList24.add(a49);
                        C2675Mj c2675Mj4 = new C2675Mj(c3602mu3, 1);
                        C4184xj c4184xj = new C4184xj(c2675Mj, c2675Mj4, c3105di2.f30076A, c2675Mj3, c3105di2.f30140f);
                        ArrayList arrayList25 = new ArrayList(1);
                        ArrayList arrayList26 = new ArrayList(1);
                        arrayList26.add(c3105di2.f30133c1);
                        arrayList25.add(c3105di2.f30136d1);
                        C2726Pj c2726Pj = new C2726Pj(c2675Mj2, c2675Mj, a17, a44, c3105di2.f30130b1, c4184xj, a18, new C3861rk(new AN(arrayList25, arrayList26), 6), a40, a27, c3214fi.f30828s0);
                        C3218fm c3218fm2 = new C3218fm(c2518Df6, 1);
                        C4009uN a50 = C4009uN.a(new C2559Fm(c3218fm2, c3214fi.f30803f));
                        C4009uN a51 = C4009uN.a(new C2758Rh(a13, a11, 6));
                        List list4 = Collections.EMPTY_LIST;
                        ArrayList arrayList27 = new ArrayList(2);
                        arrayList27.add(c3105di2.f30139e1);
                        arrayList27.add(a51);
                        AN an = new AN(list4, arrayList27);
                        C4009uN c4009uN3 = c3105di2.f30176x;
                        C4009uN a52 = C4009uN.a(new C2484Bf(c4009uN3, an, c2675Mj, 8));
                        C4009uN a53 = C4009uN.a(new C3218fm(c2518Df6, 2));
                        C4009uN a54 = C4009uN.a(new C3218fm(c2518Df6, 3));
                        C2898Zl c2898Zl = c3105di2.m0;
                        C4009uN c4009uN4 = c3214fi.f30775N;
                        C2860Xh c2860Xh3 = c3214fi.i;
                        C3700ok c3700ok = c3105di2.f30134d;
                        C4009uN c4009uN5 = c3214fi.f30803f;
                        C2694Nl c2694Nl4 = new C2694Nl(C4009uN.a(new C3163em(c4009uN3, c2898Zl, c3218fm, c3218fm2, c3913si, c4009uN4, a39, a34, a42, c2675Mj, c2860Xh3, c3700ok, a13, a50, c4009uN5, a52, c3214fi.f30783R, c3105di2.f30137e, c3214fi.f30785S, a21, c3214fi.f30782Q0, a26, a53, a54, a27)), 11);
                        C4009uN a55 = C4009uN.a(new C3272gm(c2860Xh3, 0));
                        C4009uN c4009uN6 = c3214fi.f30797c;
                        C4009uN a56 = C4009uN.a(new C4121wa(a55, c4009uN6, c4009uN3, c4009uN5, 1));
                        C4009uN c4009uN7 = c3105di2.f30171u0;
                        C2843Wh c2843Wh = new C2843Wh(c4009uN7, c3218fm2, a56, c2694Nl4);
                        C2559Fm c2559Fm = new C2559Fm(c4009uN7, c3218fm2);
                        C4009uN a57 = C4009uN.a(new C3913si(15, new C3379im(c3913si, 0)));
                        C2491Bm c2491Bm = new C2491Bm(c3214fi.J, c3700ok, c2694Nl, c3913si, c2843Wh, c2559Fm, c4009uN6, a57);
                        C3006bs c3006bs = new C3006bs();
                        C4009uN a58 = C4009uN.a(new C3541ln(c2675Mj4, c3006bs, c3913si, 1));
                        C4009uN a59 = C4009uN.a(new C3541ln(c2675Mj4, c3006bs, c3913si, 0));
                        C4009uN a60 = C4009uN.a(new C2843Wh((InterfaceC4063vN) c2675Mj4, (InterfaceC4063vN) c3006bs, (InterfaceC4063vN) c3913si, c3214fi.f30819o, 8));
                        C4009uN a61 = C4009uN.a(new C2637Kf(c3006bs, c3913si, 17));
                        C2860Xh c2860Xh4 = c3214fi.f30805g;
                        C4009uN a62 = C4009uN.a(new C2843Wh(c2860Xh4, c3913si, c2491Bm, c3006bs, 7));
                        C3006bs.a(c3006bs, C4009uN.a(new C3702om(c2726Pj, c4009uN6, c3913si, c2694Nl4, c2491Bm, c2694Nl, c2898Zl, a58, a59, a60, a61, a62, new C3807qj(c2860Xh4, c3700ok, 2), c4009uN4, c2860Xh3, c2860Xh4, a57, a25, c3214fi.f30784R0)));
                        C4009uN c4009uN8 = c3105di2.f30142f1;
                        C4009uN c4009uN9 = c3105di2.f30121X0;
                        C4009uN a63 = C4009uN.a(new C2491Bm(a34, a29, c4009uN8, a46, c4009uN9, c2675Mj, c2675Mj3, a22, 1));
                        C4009uN a64 = C4009uN.a(new C2942aj(c3214fi.f30797c, a56, C4009uN.a(new C3377ik(c3105di2.f30176x, c2675Mj, 2)), a22, a27, 1));
                        C4009uN a65 = C4009uN.a(new C3483kj(a34, a29, c4009uN8, a46, c4009uN9, a42, c3214fi.f30819o, c3214fi.f30783R, c3214fi.f30779P, a22, 2));
                        if (((Boolean) rVar3.f40119c.a(c3151ea4)).booleanValue()) {
                            p2.j.f39798C.f39810k.getClass();
                            long currentTimeMillis = System.currentTimeMillis();
                            c2750Qq = c2750Qq2;
                            C3002bo c3002bo4 = c2750Qq.f27254f;
                            c3002bo4.c("rendering-ad-component-creation-end", currentTimeMillis);
                            c3002bo4.c("rendering-configure-webview-start", currentTimeMillis);
                        } else {
                            c2750Qq = c2750Qq2;
                        }
                        C4133wm c4133wm = (C4133wm) c3105di2.f30125a.f28862u;
                        AbstractC3137eE.h(c4133wm);
                        AbstractC3137eE.h(c3917sm);
                        AbstractC3137eE.h(c4026un);
                        C2685Nc c2685Nc = new C2685Nc(c4133wm, c3917sm, c4026un, C4009uN.b(a62));
                        if (((InterfaceC2514Db) c2685Nc.f26570u) != null) {
                            ((C4026un) c2685Nc.f26571v).b("/nativeAdCustomClick", c2685Nc);
                        }
                        C3918sn c3918sn = (C3918sn) a63.d();
                        C2557Fk c2557Fk = c3918sn.f34300b;
                        C3757pn c3757pn = c4026un.f34650a;
                        Objects.requireNonNull(c2557Fk);
                        C3864rn c3864rn = new C3864rn(0, c2557Fk);
                        C3808qk c3808qk = c3918sn.f34299a;
                        C2659Lk c2659Lk = c3918sn.f34301c;
                        C2727Pk c2727Pk = c3918sn.f34302d;
                        C3325hl c3325hl = c3918sn.f34303e;
                        synchronized (c3757pn) {
                            c3757pn.f33506n = c3808qk;
                            c3757pn.f33507u = c2659Lk;
                            c3757pn.f33508v = c2727Pk;
                            c3757pn.f33509w = c3325hl;
                            c3757pn.f33510x = c3864rn;
                        }
                        Ut ut3 = c3918sn.f34304f;
                        Wt wt4 = c3918sn.f34305g;
                        C2657Li c2657Li = c3918sn.f34306h;
                        synchronized (c4026un) {
                            C3999uD c3999uD = c4026un.f34661m;
                            if (c3999uD != null) {
                                C2518Df c2518Df7 = new C2518Df(c4026un, ut3, wt4, c2657Li);
                                c3999uD.c(new MD(0, c3999uD, c2518Df7), c4026un.f34654e);
                            }
                        }
                        final C3219fn c3219fn = (C3219fn) a64.d();
                        InterfaceC3858rh h9 = c3917sm.h();
                        c3219fn.getClass();
                        if (h9 != null) {
                            View b02 = h9.b0();
                            C2490Bl c2490Bl = c3219fn.f30884c;
                            c2490Bl.v1(b02);
                            C3110dn c3110dn = new C3110dn(h9, 1);
                            Executor executor2 = c3219fn.f30882a;
                            c2490Bl.s1(c3110dn, executor2);
                            c2490Bl.s1(new C3110dn(h9, 0), executor2);
                            C2997bj c2997bj = c3219fn.f30883b;
                            c2490Bl.s1(c2997bj, executor2);
                            c2997bj.f29552n = h9;
                            C2588Hh j02 = h9.j0();
                            if (!((Boolean) rVar3.f40119c.a(AbstractC3368ia.Ab)).booleanValue() || j02 == null) {
                                i13 = 0;
                            } else {
                                j02.c("/click");
                                InterfaceC2524Dl interfaceC2524Dl = j02.f25384D;
                                C2820Vb c2820Vb = AbstractC2935ac.f29210a;
                                C2657Li c2657Li2 = c3219fn.f30885d;
                                i13 = 0;
                                j02.b("/click", new C2871Yb(0, interfaceC2524Dl, c2657Li2));
                                j02.z(c2657Li2, null, null);
                            }
                            h9.N0("/trackActiveViewUnit", new InterfaceC2990bc() { // from class: com.google.android.gms.internal.ads.en
                                @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
                                public final void g(Object obj, Map map) {
                                    switch (i13) {
                                        case 0:
                                            C2997bj c2997bj2 = c3219fn.f30883b;
                                            c2997bj2.f29556x = true;
                                            c2997bj2.a();
                                            break;
                                        default:
                                            c3219fn.f30883b.f29556x = false;
                                            break;
                                    }
                                }
                            });
                            final int i19 = 1;
                            h9.N0("/untrackActiveViewUnit", new InterfaceC2990bc() { // from class: com.google.android.gms.internal.ads.en
                                @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
                                public final void g(Object obj, Map map) {
                                    switch (i19) {
                                        case 0:
                                            C2997bj c2997bj2 = c3219fn.f30883b;
                                            c2997bj2.f29556x = true;
                                            c2997bj2.a();
                                            break;
                                        default:
                                            c3219fn.f30883b.f29556x = false;
                                            break;
                                    }
                                }
                            });
                            h9.j0().f25399T = c3219fn.f30886e;
                        }
                        C4188xn c4188xn = (C4188xn) a65.d();
                        C4242yn c4242yn = c2750Qq.f27253e;
                        InterfaceC3858rh i20 = c3917sm.i();
                        c4188xn.getClass();
                        C4134wn c4134wn = c4242yn.f35408a;
                        C2557Fk c2557Fk2 = c4188xn.f35244b;
                        Objects.requireNonNull(c2557Fk2);
                        C3864rn c3864rn2 = new C3864rn(1, c2557Fk2);
                        C3808qk c3808qk2 = c4188xn.f35243a;
                        C2659Lk c2659Lk2 = c4188xn.f35245c;
                        C2727Pk c2727Pk2 = c4188xn.f35246d;
                        C3325hl c3325hl2 = c4188xn.f35247e;
                        C2507Cl c2507Cl = c4188xn.f35248f;
                        synchronized (c4134wn) {
                            synchronized (c4134wn) {
                                c4134wn.f33506n = c3808qk2;
                                c4134wn.f33507u = c2659Lk2;
                                c4134wn.f33508v = c2727Pk2;
                                c4134wn.f33509w = c3325hl2;
                                c4134wn.f33510x = c3864rn2;
                            }
                            if (((Boolean) rVar3.f40119c.a(AbstractC3368ia.Bb)).booleanValue() && i20 != null && i20.j0() != null) {
                                C2588Hh j032 = i20.j0();
                                C2657Li c2657Li32 = c4188xn.f35251j;
                                C2834Vp c2834Vp2 = c4188xn.i;
                                j032.y(c2657Li32, c2834Vp2, c4188xn.f35250h);
                                j032.z(c2657Li32, c2834Vp2, c4188xn.f35249g);
                            }
                            if (((Boolean) rVar3.f40119c.a(c3151ea4)).booleanValue()) {
                                com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c2750Qq.f27254f, "rendering-configure-webview-end");
                            }
                            return (C3648nm) c3006bs.d();
                        }
                        c4134wn.f35068y = c2507Cl;
                        if (((Boolean) rVar3.f40119c.a(AbstractC3368ia.Bb)).booleanValue()) {
                            C2588Hh j0322 = i20.j0();
                            C2657Li c2657Li322 = c4188xn.f35251j;
                            C2834Vp c2834Vp22 = c4188xn.i;
                            j0322.y(c2657Li322, c2834Vp22, c4188xn.f35250h);
                            j0322.z(c2657Li322, c2834Vp22, c4188xn.f35249g);
                        }
                        if (((Boolean) rVar3.f40119c.a(c3151ea4)).booleanValue()) {
                        }
                        return (C3648nm) c3006bs.d();
                    }
                };
                GD gd22 = new GD(o92, true, false);
                gd22.f25114I = new FD(gd22, callable22, this.f27250b);
                gd22.w();
                return gd22;
            }
            aVar4 = b11;
            aVar5 = aVar8;
            aVar6 = aVar3;
            Wt wt4 = wt2;
            aVar7 = b12;
            d2 = c2946an.d(optJSONObject2, ut, wt4, c4856a2, c4072vf2);
            C4856a c4856a7 = c4856a2;
            c2946an2 = c2946an;
            c4856a3 = c4856a7;
            c4072vf3 = c4072vf2;
            r12.B(58, d2);
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.we)).booleanValue()) {
                optJSONObject3 = jSONObject2.optJSONObject(com.anythink.basead.exoplayer.k.o.f8601a);
                if (optJSONObject3.has("flags")) {
                    i9 = 0;
                    while (true) {
                        if (i9 >= optJSONArray2.length()) {
                        }
                        i9++;
                        c3002bo = c3002bo;
                    }
                }
            }
            c3002bo2 = c3002bo;
            od = C3686oN.c(new Bundle());
            OD od62 = od;
            C3602mu c3602mu22 = (C3602mu) r12.f24455w;
            optJSONArray = jSONObject2.optJSONArray("custom_assets");
            if (optJSONArray == null) {
            }
            r12.B(63, A8);
            if (jSONObject2.optBoolean("enable_omid")) {
            }
            c3945tD = c3945tD2;
            r12.B(65, c3945tD);
            ArrayList arrayList222 = new ArrayList();
            final J3.a aVar922 = aVar2;
            arrayList222.add(aVar922);
            final J3.a aVar1022 = aVar;
            arrayList222.add(aVar1022);
            final J3.a aVar1122 = aVar6;
            arrayList222.add(aVar1122);
            final J3.a aVar1222 = aVar4;
            arrayList222.add(aVar1222);
            final J3.a aVar1322 = aVar7;
            arrayList222.add(aVar1322);
            final J3.a aVar1422 = aVar5;
            arrayList222.add(aVar1422);
            arrayList222.add(d2);
            final J3.a od722 = od2;
            arrayList222.add(od722);
            arrayList222.add(A8);
            final C4856a c4856a622 = c4856a3;
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31749o6)).booleanValue()) {
            }
            arrayList222.add(c3945tD);
            UB n922 = UB.n(arrayList222);
            final JSONObject jSONObject322 = jSONObject2;
            final C4072vf c4072vf622 = c4072vf3;
            final J3.a aVar1522 = d2;
            final C2518Df c2518Df522 = r12;
            Callable callable32 = new Callable() { // from class: com.google.android.gms.internal.ads.Um
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    List list;
                    JSONObject optJSONObject10;
                    C2518Df c2518Df6 = C2518Df.this;
                    J3.a aVar16 = aVar922;
                    J3.a aVar17 = aVar1022;
                    J3.a aVar18 = aVar1322;
                    J3.a aVar19 = aVar1222;
                    J3.a aVar20 = aVar1422;
                    JSONObject jSONObject4 = jSONObject322;
                    J3.a aVar21 = aVar1522;
                    J3.a aVar22 = od722;
                    J3.a aVar23 = aVar1122;
                    J3.a aVar24 = c3945tD;
                    J3.a aVar25 = A8;
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31485L2)).booleanValue()) {
                        com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, (C3002bo) c2518Df6.f24456x, "rendering-native-assets-loading-end");
                    }
                    C3917sm c3917sm = (C3917sm) aVar16.get();
                    List list2 = (List) aVar17.get();
                    synchronized (c3917sm) {
                        c3917sm.f34279e = list2;
                    }
                    InterfaceC3637nb interfaceC3637nb = (InterfaceC3637nb) aVar18.get();
                    synchronized (c3917sm) {
                        c3917sm.f34292s = interfaceC3637nb;
                    }
                    InterfaceC3637nb interfaceC3637nb2 = (InterfaceC3637nb) aVar19.get();
                    synchronized (c3917sm) {
                        c3917sm.f34293t = interfaceC3637nb2;
                    }
                    InterfaceC3421jb interfaceC3421jb = (InterfaceC3421jb) aVar20.get();
                    synchronized (c3917sm) {
                        c3917sm.f34277c = interfaceC3421jb;
                    }
                    JSONObject optJSONObject11 = jSONObject4.optJSONObject("mute");
                    if (optJSONObject11 == null) {
                        SB sb = UB.f27942u;
                        list = C3675oC.f33115x;
                    } else {
                        JSONArray optJSONArray6 = optJSONObject11.optJSONArray("reasons");
                        if (optJSONArray6 == null || optJSONArray6.length() <= 0) {
                            SB sb2 = UB.f27942u;
                            list = C3675oC.f33115x;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            for (int i13 = 0; i13 < optJSONArray6.length(); i13++) {
                                q2.L0 f6 = C2946an.f(optJSONArray6.optJSONObject(i13));
                                if (f6 != null) {
                                    arrayList3.add(f6);
                                }
                            }
                            list = UB.n(arrayList3);
                        }
                    }
                    synchronized (c3917sm) {
                        c3917sm.f34280f = list;
                    }
                    JSONObject optJSONObject12 = jSONObject4.optJSONObject("mute");
                    q2.L0 f9 = (optJSONObject12 == null || (optJSONObject10 = optJSONObject12.optJSONObject("default_reason")) == null) ? null : C2946an.f(optJSONObject10);
                    synchronized (c3917sm) {
                        c3917sm.f34281g = f9;
                    }
                    InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) aVar21.get();
                    if (interfaceC3858rh != null) {
                        synchronized (c3917sm) {
                            c3917sm.i = interfaceC3858rh;
                        }
                        View b02 = interfaceC3858rh.b0();
                        synchronized (c3917sm) {
                            c3917sm.f34288o = b02;
                        }
                        BinderC2554Fh g9 = interfaceC3858rh.g();
                        synchronized (c3917sm) {
                            c3917sm.f34276b = g9;
                        }
                    }
                    c3917sm.d().putAll((Bundle) aVar22.get());
                    InterfaceC3858rh interfaceC3858rh2 = (InterfaceC3858rh) aVar23.get();
                    if (interfaceC3858rh2 != null) {
                        synchronized (c3917sm) {
                            c3917sm.f34283j = interfaceC3858rh2;
                        }
                        View b03 = interfaceC3858rh2.b0();
                        synchronized (c3917sm) {
                            c3917sm.f34289p = b03;
                        }
                    }
                    if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31749o6)).booleanValue() || jSONObject4.optInt("template_id") == 3) {
                        InterfaceC3858rh interfaceC3858rh3 = (InterfaceC3858rh) aVar24.get();
                        if (interfaceC3858rh3 != null) {
                            synchronized (c3917sm) {
                                c3917sm.f34284k = interfaceC3858rh3;
                            }
                        }
                    } else {
                        synchronized (c3917sm) {
                            c3917sm.f34286m = aVar24;
                        }
                        C3320hg c3320hg2 = new C3320hg();
                        synchronized (c3917sm) {
                            c3917sm.f34287n = c3320hg2;
                        }
                    }
                    for (C3055cn c3055cn : (List) aVar25.get()) {
                        if (c3055cn.f29747a != 1) {
                            String str3 = c3055cn.f29748b;
                            BinderC3098db binderC3098db = c3055cn.f29750d;
                            synchronized (c3917sm) {
                                if (binderC3098db == null) {
                                    c3917sm.f34295v.remove(str3);
                                } else {
                                    c3917sm.f34295v.put(str3, binderC3098db);
                                }
                            }
                        } else {
                            c3917sm.o(c3055cn.f29748b, c3055cn.f29749c);
                        }
                    }
                    return c3917sm;
                }
            };
            final GD gd32 = new GD(n922, false, false);
            gd32.f25114I = new FD(gd32, callable32, c3157eg);
            gd32.w();
            C3675oC o922 = UB.o(new J3.a[]{b9, gd32});
            Callable callable222 = new Callable() { // from class: com.google.android.gms.internal.ads.Pq
                /* JADX WARN: Removed duplicated region for block: B:46:0x0952  */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object call() {
                    C2750Qq c2750Qq;
                    final int i13;
                    int i14 = 13;
                    int i15 = 0;
                    C2750Qq c2750Qq2 = C2750Qq.this;
                    GD gd222 = gd32;
                    J3.a aVar16 = b9;
                    C2953au c2953au2 = c2953au;
                    Ut ut2 = ut;
                    JSONObject jSONObject4 = jSONObject;
                    C4856a c4856a72 = c4856a622;
                    C4072vf c4072vf7 = c4072vf622;
                    c2750Qq2.getClass();
                    C3917sm c3917sm = (C3917sm) gd222.get();
                    C4026un c4026un = (C4026un) aVar16.get();
                    C3151ea c3151ea4 = AbstractC3368ia.f31494M2;
                    q2.r rVar3 = q2.r.f40116e;
                    if (((Boolean) rVar3.f40119c.a(c3151ea4)).booleanValue()) {
                        com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c2750Qq2.f27254f, "rendering-webview-creation-end");
                    }
                    C3105di c3105di = c2750Qq2.f27249a;
                    C3602mu c3602mu3 = new C3602mu(c2953au2, ut2, (String) null);
                    C3562m7 c3562m7 = new C3562m7(18, c3917sm);
                    C2518Df c2518Df6 = new C2518Df(jSONObject4, c4026un, c4856a72, c4072vf7, 12);
                    C3214fi c3214fi = c3105di.f30128b;
                    C3105di c3105di2 = c3105di.f30131c;
                    C4009uN a10 = C4009uN.a(new C2826Vh(c3214fi.f30772L0, 12));
                    C2675Mj c2675Mj = new C2675Mj(c3602mu3, 0);
                    C3218fm c3218fm = new C3218fm(c2518Df6, i15);
                    C2694Nl c2694Nl = new C2694Nl(C4009uN.a(new C2637Kf(c2675Mj, c3218fm, i14)), 10);
                    C4009uN a11 = C4009uN.a(new C3913si(14, c2694Nl));
                    C2860Xh c2860Xh = c3214fi.i;
                    C2945am c2945am = AbstractC3194fG.f30663X;
                    C4009uN a12 = C4009uN.a(new C2484Bf(c2860Xh, a11, c2945am, 1));
                    int i16 = 3;
                    C4009uN a13 = C4009uN.a(new C2942aj(a10, C4009uN.a(new C2941ai(c3214fi.f30805g, a12, i16)), c3214fi.f30797c, C4009uN.a(new C2758Rh(a12, a10, i16)), c3214fi.f30803f, 0));
                    C4009uN a14 = C4009uN.a(new C2758Rh(a13, a11, 5));
                    C4009uN a15 = C4009uN.a(new C3377ik(c3105di2.f30176x, c2675Mj, 0));
                    C4009uN a16 = C4009uN.a(new C2760Rj(a15, 16));
                    int i17 = AN.f23864c;
                    ArrayList arrayList3 = new ArrayList(1);
                    ArrayList arrayList4 = new ArrayList(3);
                    arrayList4.add(c3105di2.f30175w0);
                    arrayList4.add(c3105di2.f30177x0);
                    arrayList4.add(a14);
                    arrayList3.add(a16);
                    C4009uN a17 = C4009uN.a(new C3861rk(new AN(arrayList3, arrayList4), 3));
                    C4009uN a18 = C4009uN.a(AbstractC3194fG.f30662W);
                    C4009uN c4009uN = c3214fi.f30797c;
                    C4009uN a19 = C4009uN.a(new C2758Rh(a18, c4009uN, 11));
                    C2675Mj c2675Mj2 = new C2675Mj(c3602mu3, 3);
                    C2675Mj c2675Mj3 = new C2675Mj(c3602mu3, 2);
                    C2860Xh c2860Xh2 = c3214fi.f30805g;
                    C4009uN a20 = C4009uN.a(new C2877Yh(c2860Xh2, 16));
                    C4009uN a21 = C4009uN.a(AbstractC2655Lg.f26171F);
                    C4009uN a22 = C4009uN.a(new C2674Mi(c2860Xh2, c3214fi.J, a20, a21, c3214fi.f30767I0, c3214fi.f30799d));
                    C4009uN a23 = C4009uN.a(new C2674Mi(c3214fi.f30783R, c3214fi.f30781Q, c2675Mj, c2675Mj3, a22, c3105di2.f30137e));
                    C2945am c2945am2 = new C2945am(4);
                    C2945am c2945am3 = new C2945am(2);
                    C4009uN a24 = C4009uN.a(new C2758Rh(a18, c4009uN, 16));
                    C4009uN a25 = C4009uN.a(AbstractC3035cL.f29695z);
                    C2694Nl c2694Nl2 = new C2694Nl(a25, 13);
                    ArrayList arrayList5 = new ArrayList(2);
                    ArrayList arrayList6 = new ArrayList(1);
                    arrayList6.add(c3105di2.C0);
                    arrayList5.add(a24);
                    arrayList5.add(c2694Nl2);
                    C4009uN a26 = C4009uN.a(new C2484Bf(new AN(arrayList5, arrayList6), c2675Mj, c2675Mj2, 7));
                    C4009uN a27 = C4009uN.a(new C3913si(12, c2675Mj2));
                    C4009uN a28 = C4009uN.a(new C2793Ti(c3214fi.f30805g, c3214fi.f30797c, c3214fi.f30799d, c2675Mj2, c2675Mj, c3105di2.f30167s0, a23, c2945am2, c2945am3, c3214fi.f30775N, c3105di2.f30169t0, c3105di2.f30137e, c3105di2.f30079B0, a26, a27, c3105di2.f30157n0));
                    int i18 = 2;
                    C2760Rj c2760Rj = new C2760Rj(a28, i18);
                    C2760Rj c2760Rj2 = new C2760Rj(C4009uN.a(new C2637Kf(c2675Mj, c3214fi.f30800d0, i18)), 22);
                    ArrayList arrayList7 = new ArrayList(4);
                    ArrayList arrayList8 = new ArrayList(2);
                    arrayList7.add(c3105di2.f30179y0);
                    arrayList8.add(c3105di2.f30181z0);
                    arrayList8.add(c3105di2.f30077A0);
                    arrayList7.add(a19);
                    arrayList7.add(c2760Rj);
                    arrayList7.add(c2760Rj2);
                    C4009uN a29 = C4009uN.a(new C3861rk(new AN(arrayList7, arrayList8), 4));
                    C4009uN a30 = C4009uN.a(new C3107dk(c3214fi.f30805g, c3214fi.f30765H0, c3214fi.f30819o, c2675Mj2, c2675Mj, c3214fi.f30779P, c2945am));
                    C4009uN a31 = C4009uN.a(new C2760Rj(a30, 13));
                    C4009uN a32 = C4009uN.a(new C2758Rh(a18, c3214fi.f30797c, 10));
                    C4009uN a33 = C4009uN.a(new C2760Rj(C4009uN.a(new C2828Vj(c3214fi.f30757D0, c3105di2.f30134d)), 11));
                    C2760Rj c2760Rj3 = new C2760Rj(a28, 1);
                    ArrayList arrayList9 = new ArrayList(5);
                    ArrayList arrayList10 = new ArrayList(3);
                    arrayList9.add(c3105di2.f30082D0);
                    arrayList9.add(c3105di2.f30084E0);
                    arrayList10.add(c3105di2.f30086F0);
                    arrayList10.add(c3105di2.f30088G0);
                    arrayList9.add(a31);
                    arrayList9.add(a32);
                    arrayList10.add(a33);
                    arrayList9.add(c2760Rj3);
                    C4009uN a34 = C4009uN.a(new C3861rk(new AN(arrayList9, arrayList10), 0));
                    C4009uN a35 = C4009uN.a(new C2758Rh(a13, a11, 4));
                    C4009uN a36 = C4009uN.a(new C2760Rj(a30, 14));
                    C4009uN c4009uN2 = c3214fi.f30797c;
                    C4009uN a37 = C4009uN.a(new C2758Rh(a18, c4009uN2, 13));
                    C4009uN a38 = C4009uN.a(new C2760Rj(c3105di2.f30164r, 15));
                    C2826Vh c2826Vh = new C2826Vh(a26, 20);
                    C2760Rj c2760Rj4 = new C2760Rj(a28, 4);
                    C3913si c3913si = new C3913si(16, c3562m7);
                    C2694Nl c2694Nl3 = new C2694Nl(C4009uN.a(new C2484Bf(c3913si, c2694Nl, c4009uN2, 9)), 12);
                    ArrayList arrayList11 = new ArrayList(8);
                    ArrayList arrayList12 = new ArrayList(3);
                    arrayList11.add(c3105di2.f30090H0);
                    arrayList11.add(c3105di2.f30092I0);
                    arrayList12.add(c3105di2.f30093J0);
                    arrayList12.add(c3105di2.f30095K0);
                    arrayList12.add(a35);
                    arrayList11.add(a36);
                    arrayList11.add(a37);
                    arrayList11.add(a38);
                    arrayList11.add(c2826Vh);
                    arrayList11.add(c2760Rj4);
                    arrayList11.add(c2694Nl3);
                    C4009uN a39 = C4009uN.a(new C3861rk(new AN(arrayList11, arrayList12), 2));
                    C2760Rj c2760Rj5 = new C2760Rj(a28, 7);
                    ArrayList arrayList13 = new ArrayList(1);
                    ArrayList arrayList14 = new ArrayList(1);
                    arrayList14.add(c3105di2.f30097L0);
                    arrayList13.add(c2760Rj5);
                    C4009uN a40 = C4009uN.a(new C3861rk(new AN(arrayList13, arrayList14), 19));
                    C2760Rj c2760Rj6 = new C2760Rj(C4009uN.a(new C3377ik(c2675Mj, c3214fi.f30783R)), 0);
                    ArrayList arrayList15 = new ArrayList(1);
                    new ArrayList(1).add(c3105di2.f30099M0);
                    arrayList15.add(c2760Rj6);
                    C4009uN a41 = C4009uN.a(new C2758Rh(a18, c3214fi.f30797c, 17));
                    ArrayList arrayList16 = new ArrayList(1);
                    ArrayList arrayList17 = new ArrayList(1);
                    arrayList17.add(c3105di2.f30101N0);
                    arrayList16.add(a41);
                    C4009uN a42 = C4009uN.a(new C3861rk(new AN(arrayList16, arrayList17), 20));
                    C4009uN a43 = C4009uN.a(new C2760Rj(a15, 17));
                    C2760Rj c2760Rj7 = new C2760Rj(a28, 5);
                    ArrayList arrayList18 = new ArrayList(7);
                    ArrayList arrayList19 = new ArrayList(4);
                    arrayList18.add(c3105di2.f30103O0);
                    arrayList19.add(c3105di2.f30105P0);
                    arrayList18.add(c3105di2.f30107Q0);
                    arrayList18.add(c3105di2.f30109R0);
                    arrayList19.add(c3105di2.f30111S0);
                    arrayList19.add(c3105di2.f30113T0);
                    arrayList19.add(c3105di2.f30115U0);
                    arrayList18.add(c3105di2.f30117V0);
                    arrayList18.add(c3105di2.f30119W0);
                    arrayList18.add(a43);
                    arrayList18.add(c2760Rj7);
                    C4009uN a44 = C4009uN.a(new C3861rk(new AN(arrayList18, arrayList19), 5));
                    C2760Rj c2760Rj8 = new C2760Rj(C4009uN.a(new C2826Vh(a29, 19)), 9);
                    C4009uN a45 = C4009uN.a(new C2758Rh(a18, c3214fi.f30797c, 15));
                    ArrayList arrayList20 = new ArrayList(2);
                    ArrayList arrayList21 = new ArrayList(1);
                    arrayList21.add(c3105di2.f30122Y0);
                    arrayList20.add(c2760Rj8);
                    arrayList20.add(a45);
                    C4009uN a46 = C4009uN.a(new C3861rk(new AN(arrayList20, arrayList21), 9));
                    List list = Collections.EMPTY_LIST;
                    new ArrayList(1).add(c3105di2.f30124Z0);
                    C4009uN a47 = C4009uN.a(new C2760Rj(a30, 12));
                    ArrayList arrayList2222 = new ArrayList(1);
                    List list2 = Collections.EMPTY_LIST;
                    arrayList2222.add(a47);
                    C4009uN a48 = C4009uN.a(new C2758Rh(a18, c3214fi.f30797c, 12));
                    C2760Rj c2760Rj9 = new C2760Rj(a28, 3);
                    ArrayList arrayList23 = new ArrayList(2);
                    new ArrayList(1).add(c3105di2.f30127a1);
                    arrayList23.add(a48);
                    arrayList23.add(c2760Rj9);
                    C4009uN a49 = C4009uN.a(new C2760Rj(a30, 8));
                    ArrayList arrayList24 = new ArrayList(1);
                    List list3 = Collections.EMPTY_LIST;
                    arrayList24.add(a49);
                    C2675Mj c2675Mj4 = new C2675Mj(c3602mu3, 1);
                    C4184xj c4184xj = new C4184xj(c2675Mj, c2675Mj4, c3105di2.f30076A, c2675Mj3, c3105di2.f30140f);
                    ArrayList arrayList25 = new ArrayList(1);
                    ArrayList arrayList26 = new ArrayList(1);
                    arrayList26.add(c3105di2.f30133c1);
                    arrayList25.add(c3105di2.f30136d1);
                    C2726Pj c2726Pj = new C2726Pj(c2675Mj2, c2675Mj, a17, a44, c3105di2.f30130b1, c4184xj, a18, new C3861rk(new AN(arrayList25, arrayList26), 6), a40, a27, c3214fi.f30828s0);
                    C3218fm c3218fm2 = new C3218fm(c2518Df6, 1);
                    C4009uN a50 = C4009uN.a(new C2559Fm(c3218fm2, c3214fi.f30803f));
                    C4009uN a51 = C4009uN.a(new C2758Rh(a13, a11, 6));
                    List list4 = Collections.EMPTY_LIST;
                    ArrayList arrayList27 = new ArrayList(2);
                    arrayList27.add(c3105di2.f30139e1);
                    arrayList27.add(a51);
                    AN an = new AN(list4, arrayList27);
                    C4009uN c4009uN3 = c3105di2.f30176x;
                    C4009uN a52 = C4009uN.a(new C2484Bf(c4009uN3, an, c2675Mj, 8));
                    C4009uN a53 = C4009uN.a(new C3218fm(c2518Df6, 2));
                    C4009uN a54 = C4009uN.a(new C3218fm(c2518Df6, 3));
                    C2898Zl c2898Zl = c3105di2.m0;
                    C4009uN c4009uN4 = c3214fi.f30775N;
                    C2860Xh c2860Xh3 = c3214fi.i;
                    C3700ok c3700ok = c3105di2.f30134d;
                    C4009uN c4009uN5 = c3214fi.f30803f;
                    C2694Nl c2694Nl4 = new C2694Nl(C4009uN.a(new C3163em(c4009uN3, c2898Zl, c3218fm, c3218fm2, c3913si, c4009uN4, a39, a34, a42, c2675Mj, c2860Xh3, c3700ok, a13, a50, c4009uN5, a52, c3214fi.f30783R, c3105di2.f30137e, c3214fi.f30785S, a21, c3214fi.f30782Q0, a26, a53, a54, a27)), 11);
                    C4009uN a55 = C4009uN.a(new C3272gm(c2860Xh3, 0));
                    C4009uN c4009uN6 = c3214fi.f30797c;
                    C4009uN a56 = C4009uN.a(new C4121wa(a55, c4009uN6, c4009uN3, c4009uN5, 1));
                    C4009uN c4009uN7 = c3105di2.f30171u0;
                    C2843Wh c2843Wh = new C2843Wh(c4009uN7, c3218fm2, a56, c2694Nl4);
                    C2559Fm c2559Fm = new C2559Fm(c4009uN7, c3218fm2);
                    C4009uN a57 = C4009uN.a(new C3913si(15, new C3379im(c3913si, 0)));
                    C2491Bm c2491Bm = new C2491Bm(c3214fi.J, c3700ok, c2694Nl, c3913si, c2843Wh, c2559Fm, c4009uN6, a57);
                    C3006bs c3006bs = new C3006bs();
                    C4009uN a58 = C4009uN.a(new C3541ln(c2675Mj4, c3006bs, c3913si, 1));
                    C4009uN a59 = C4009uN.a(new C3541ln(c2675Mj4, c3006bs, c3913si, 0));
                    C4009uN a60 = C4009uN.a(new C2843Wh((InterfaceC4063vN) c2675Mj4, (InterfaceC4063vN) c3006bs, (InterfaceC4063vN) c3913si, c3214fi.f30819o, 8));
                    C4009uN a61 = C4009uN.a(new C2637Kf(c3006bs, c3913si, 17));
                    C2860Xh c2860Xh4 = c3214fi.f30805g;
                    C4009uN a62 = C4009uN.a(new C2843Wh(c2860Xh4, c3913si, c2491Bm, c3006bs, 7));
                    C3006bs.a(c3006bs, C4009uN.a(new C3702om(c2726Pj, c4009uN6, c3913si, c2694Nl4, c2491Bm, c2694Nl, c2898Zl, a58, a59, a60, a61, a62, new C3807qj(c2860Xh4, c3700ok, 2), c4009uN4, c2860Xh3, c2860Xh4, a57, a25, c3214fi.f30784R0)));
                    C4009uN c4009uN8 = c3105di2.f30142f1;
                    C4009uN c4009uN9 = c3105di2.f30121X0;
                    C4009uN a63 = C4009uN.a(new C2491Bm(a34, a29, c4009uN8, a46, c4009uN9, c2675Mj, c2675Mj3, a22, 1));
                    C4009uN a64 = C4009uN.a(new C2942aj(c3214fi.f30797c, a56, C4009uN.a(new C3377ik(c3105di2.f30176x, c2675Mj, 2)), a22, a27, 1));
                    C4009uN a65 = C4009uN.a(new C3483kj(a34, a29, c4009uN8, a46, c4009uN9, a42, c3214fi.f30819o, c3214fi.f30783R, c3214fi.f30779P, a22, 2));
                    if (((Boolean) rVar3.f40119c.a(c3151ea4)).booleanValue()) {
                        p2.j.f39798C.f39810k.getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        c2750Qq = c2750Qq2;
                        C3002bo c3002bo4 = c2750Qq.f27254f;
                        c3002bo4.c("rendering-ad-component-creation-end", currentTimeMillis);
                        c3002bo4.c("rendering-configure-webview-start", currentTimeMillis);
                    } else {
                        c2750Qq = c2750Qq2;
                    }
                    C4133wm c4133wm = (C4133wm) c3105di2.f30125a.f28862u;
                    AbstractC3137eE.h(c4133wm);
                    AbstractC3137eE.h(c3917sm);
                    AbstractC3137eE.h(c4026un);
                    C2685Nc c2685Nc = new C2685Nc(c4133wm, c3917sm, c4026un, C4009uN.b(a62));
                    if (((InterfaceC2514Db) c2685Nc.f26570u) != null) {
                        ((C4026un) c2685Nc.f26571v).b("/nativeAdCustomClick", c2685Nc);
                    }
                    C3918sn c3918sn = (C3918sn) a63.d();
                    C2557Fk c2557Fk = c3918sn.f34300b;
                    C3757pn c3757pn = c4026un.f34650a;
                    Objects.requireNonNull(c2557Fk);
                    C3864rn c3864rn = new C3864rn(0, c2557Fk);
                    C3808qk c3808qk = c3918sn.f34299a;
                    C2659Lk c2659Lk = c3918sn.f34301c;
                    C2727Pk c2727Pk = c3918sn.f34302d;
                    C3325hl c3325hl = c3918sn.f34303e;
                    synchronized (c3757pn) {
                        c3757pn.f33506n = c3808qk;
                        c3757pn.f33507u = c2659Lk;
                        c3757pn.f33508v = c2727Pk;
                        c3757pn.f33509w = c3325hl;
                        c3757pn.f33510x = c3864rn;
                    }
                    Ut ut3 = c3918sn.f34304f;
                    Wt wt42 = c3918sn.f34305g;
                    C2657Li c2657Li = c3918sn.f34306h;
                    synchronized (c4026un) {
                        C3999uD c3999uD = c4026un.f34661m;
                        if (c3999uD != null) {
                            C2518Df c2518Df7 = new C2518Df(c4026un, ut3, wt42, c2657Li);
                            c3999uD.c(new MD(0, c3999uD, c2518Df7), c4026un.f34654e);
                        }
                    }
                    final C3219fn c3219fn = (C3219fn) a64.d();
                    InterfaceC3858rh h9 = c3917sm.h();
                    c3219fn.getClass();
                    if (h9 != null) {
                        View b02 = h9.b0();
                        C2490Bl c2490Bl = c3219fn.f30884c;
                        c2490Bl.v1(b02);
                        C3110dn c3110dn = new C3110dn(h9, 1);
                        Executor executor2 = c3219fn.f30882a;
                        c2490Bl.s1(c3110dn, executor2);
                        c2490Bl.s1(new C3110dn(h9, 0), executor2);
                        C2997bj c2997bj = c3219fn.f30883b;
                        c2490Bl.s1(c2997bj, executor2);
                        c2997bj.f29552n = h9;
                        C2588Hh j02 = h9.j0();
                        if (!((Boolean) rVar3.f40119c.a(AbstractC3368ia.Ab)).booleanValue() || j02 == null) {
                            i13 = 0;
                        } else {
                            j02.c("/click");
                            InterfaceC2524Dl interfaceC2524Dl = j02.f25384D;
                            C2820Vb c2820Vb = AbstractC2935ac.f29210a;
                            C2657Li c2657Li2 = c3219fn.f30885d;
                            i13 = 0;
                            j02.b("/click", new C2871Yb(0, interfaceC2524Dl, c2657Li2));
                            j02.z(c2657Li2, null, null);
                        }
                        h9.N0("/trackActiveViewUnit", new InterfaceC2990bc() { // from class: com.google.android.gms.internal.ads.en
                            @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
                            public final void g(Object obj, Map map) {
                                switch (i13) {
                                    case 0:
                                        C2997bj c2997bj2 = c3219fn.f30883b;
                                        c2997bj2.f29556x = true;
                                        c2997bj2.a();
                                        break;
                                    default:
                                        c3219fn.f30883b.f29556x = false;
                                        break;
                                }
                            }
                        });
                        final int i19 = 1;
                        h9.N0("/untrackActiveViewUnit", new InterfaceC2990bc() { // from class: com.google.android.gms.internal.ads.en
                            @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
                            public final void g(Object obj, Map map) {
                                switch (i19) {
                                    case 0:
                                        C2997bj c2997bj2 = c3219fn.f30883b;
                                        c2997bj2.f29556x = true;
                                        c2997bj2.a();
                                        break;
                                    default:
                                        c3219fn.f30883b.f29556x = false;
                                        break;
                                }
                            }
                        });
                        h9.j0().f25399T = c3219fn.f30886e;
                    }
                    C4188xn c4188xn = (C4188xn) a65.d();
                    C4242yn c4242yn = c2750Qq.f27253e;
                    InterfaceC3858rh i20 = c3917sm.i();
                    c4188xn.getClass();
                    C4134wn c4134wn = c4242yn.f35408a;
                    C2557Fk c2557Fk2 = c4188xn.f35244b;
                    Objects.requireNonNull(c2557Fk2);
                    C3864rn c3864rn2 = new C3864rn(1, c2557Fk2);
                    C3808qk c3808qk2 = c4188xn.f35243a;
                    C2659Lk c2659Lk2 = c4188xn.f35245c;
                    C2727Pk c2727Pk2 = c4188xn.f35246d;
                    C3325hl c3325hl2 = c4188xn.f35247e;
                    C2507Cl c2507Cl = c4188xn.f35248f;
                    synchronized (c4134wn) {
                        synchronized (c4134wn) {
                            c4134wn.f33506n = c3808qk2;
                            c4134wn.f33507u = c2659Lk2;
                            c4134wn.f33508v = c2727Pk2;
                            c4134wn.f33509w = c3325hl2;
                            c4134wn.f33510x = c3864rn2;
                        }
                        if (((Boolean) rVar3.f40119c.a(AbstractC3368ia.Bb)).booleanValue() && i20 != null && i20.j0() != null) {
                            C2588Hh j0322 = i20.j0();
                            C2657Li c2657Li322 = c4188xn.f35251j;
                            C2834Vp c2834Vp22 = c4188xn.i;
                            j0322.y(c2657Li322, c2834Vp22, c4188xn.f35250h);
                            j0322.z(c2657Li322, c2834Vp22, c4188xn.f35249g);
                        }
                        if (((Boolean) rVar3.f40119c.a(c3151ea4)).booleanValue()) {
                            com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c2750Qq.f27254f, "rendering-configure-webview-end");
                        }
                        return (C3648nm) c3006bs.d();
                    }
                    c4134wn.f35068y = c2507Cl;
                    if (((Boolean) rVar3.f40119c.a(AbstractC3368ia.Bb)).booleanValue()) {
                        C2588Hh j03222 = i20.j0();
                        C2657Li c2657Li3222 = c4188xn.f35251j;
                        C2834Vp c2834Vp222 = c4188xn.i;
                        j03222.y(c2657Li3222, c2834Vp222, c4188xn.f35250h);
                        j03222.z(c2657Li3222, c2834Vp222, c4188xn.f35249g);
                    }
                    if (((Boolean) rVar3.f40119c.a(c3151ea4)).booleanValue()) {
                    }
                    return (C3648nm) c3006bs.d();
                }
            };
            GD gd222 = new GD(o922, true, false);
            gd222.f25114I = new FD(gd222, callable222, this.f27250b);
            gd222.w();
            return gd222;
        }
        aVar3 = OD.f26665u;
        jSONObject2 = jSONObject;
        r12 = c2518Df2;
        c3157eg = c3157eg2;
        c2946an = c2946an3;
        str = "images";
        c4856a2 = c4856a4;
        c4072vf2 = c4072vf;
        wt = wt3;
        c3002bo = c3002bo3;
        str2 = com.onesignal.inAppMessages.internal.d.HTML;
        c3261gb = c3261gb2;
        aVar = a9;
        sd = sd3;
        aVar2 = b10;
        r12.B(50, aVar3);
        J3.a b112 = c2946an.b(jSONObject2.optJSONObject("secondary_image"), c3261gb.f31024u, 51);
        r12.B(52, b112);
        J3.a b122 = c2946an.b(jSONObject2.optJSONObject("app_icon"), c3261gb.f31024u, 53);
        r12.B(54, b122);
        optJSONObject = jSONObject2.optJSONObject("attribution");
        if (optJSONObject != null) {
        }
        J3.a aVar82 = e6;
        r12.B(56, aVar82);
        String[] strArr2 = {"html_containers", "instream"};
        JSONObject z92 = p8.g.z(jSONObject2, strArr2);
        if (z92 != null) {
        }
        if (optJSONObject2 != null) {
        }
        C4856a c4856a72 = c4856a2;
        c2946an2 = c2946an;
        c4856a3 = c4856a72;
        c4072vf3 = c4072vf2;
        r12.B(58, d2);
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.we)).booleanValue()) {
        }
        c3002bo2 = c3002bo;
        od = C3686oN.c(new Bundle());
        OD od622 = od;
        C3602mu c3602mu222 = (C3602mu) r12.f24455w;
        optJSONArray = jSONObject2.optJSONArray("custom_assets");
        if (optJSONArray == null) {
        }
        r12.B(63, A8);
        if (jSONObject2.optBoolean("enable_omid")) {
        }
        c3945tD = c3945tD2;
        r12.B(65, c3945tD);
        ArrayList arrayList2222 = new ArrayList();
        final J3.a aVar9222 = aVar2;
        arrayList2222.add(aVar9222);
        final J3.a aVar10222 = aVar;
        arrayList2222.add(aVar10222);
        final J3.a aVar11222 = aVar6;
        arrayList2222.add(aVar11222);
        final J3.a aVar12222 = aVar4;
        arrayList2222.add(aVar12222);
        final J3.a aVar13222 = aVar7;
        arrayList2222.add(aVar13222);
        final J3.a aVar14222 = aVar5;
        arrayList2222.add(aVar14222);
        arrayList2222.add(d2);
        final J3.a od7222 = od2;
        arrayList2222.add(od7222);
        arrayList2222.add(A8);
        final C4856a c4856a6222 = c4856a3;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31749o6)).booleanValue()) {
        }
        arrayList2222.add(c3945tD);
        UB n9222 = UB.n(arrayList2222);
        final JSONObject jSONObject3222 = jSONObject2;
        final C4072vf c4072vf6222 = c4072vf3;
        final J3.a aVar15222 = d2;
        final C2518Df c2518Df5222 = r12;
        Callable callable322 = new Callable() { // from class: com.google.android.gms.internal.ads.Um
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list;
                JSONObject optJSONObject10;
                C2518Df c2518Df6 = C2518Df.this;
                J3.a aVar16 = aVar9222;
                J3.a aVar17 = aVar10222;
                J3.a aVar18 = aVar13222;
                J3.a aVar19 = aVar12222;
                J3.a aVar20 = aVar14222;
                JSONObject jSONObject4 = jSONObject3222;
                J3.a aVar21 = aVar15222;
                J3.a aVar22 = od7222;
                J3.a aVar23 = aVar11222;
                J3.a aVar24 = c3945tD;
                J3.a aVar25 = A8;
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31485L2)).booleanValue()) {
                    com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, (C3002bo) c2518Df6.f24456x, "rendering-native-assets-loading-end");
                }
                C3917sm c3917sm = (C3917sm) aVar16.get();
                List list2 = (List) aVar17.get();
                synchronized (c3917sm) {
                    c3917sm.f34279e = list2;
                }
                InterfaceC3637nb interfaceC3637nb = (InterfaceC3637nb) aVar18.get();
                synchronized (c3917sm) {
                    c3917sm.f34292s = interfaceC3637nb;
                }
                InterfaceC3637nb interfaceC3637nb2 = (InterfaceC3637nb) aVar19.get();
                synchronized (c3917sm) {
                    c3917sm.f34293t = interfaceC3637nb2;
                }
                InterfaceC3421jb interfaceC3421jb = (InterfaceC3421jb) aVar20.get();
                synchronized (c3917sm) {
                    c3917sm.f34277c = interfaceC3421jb;
                }
                JSONObject optJSONObject11 = jSONObject4.optJSONObject("mute");
                if (optJSONObject11 == null) {
                    SB sb = UB.f27942u;
                    list = C3675oC.f33115x;
                } else {
                    JSONArray optJSONArray6 = optJSONObject11.optJSONArray("reasons");
                    if (optJSONArray6 == null || optJSONArray6.length() <= 0) {
                        SB sb2 = UB.f27942u;
                        list = C3675oC.f33115x;
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i13 = 0; i13 < optJSONArray6.length(); i13++) {
                            q2.L0 f6 = C2946an.f(optJSONArray6.optJSONObject(i13));
                            if (f6 != null) {
                                arrayList3.add(f6);
                            }
                        }
                        list = UB.n(arrayList3);
                    }
                }
                synchronized (c3917sm) {
                    c3917sm.f34280f = list;
                }
                JSONObject optJSONObject12 = jSONObject4.optJSONObject("mute");
                q2.L0 f9 = (optJSONObject12 == null || (optJSONObject10 = optJSONObject12.optJSONObject("default_reason")) == null) ? null : C2946an.f(optJSONObject10);
                synchronized (c3917sm) {
                    c3917sm.f34281g = f9;
                }
                InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) aVar21.get();
                if (interfaceC3858rh != null) {
                    synchronized (c3917sm) {
                        c3917sm.i = interfaceC3858rh;
                    }
                    View b02 = interfaceC3858rh.b0();
                    synchronized (c3917sm) {
                        c3917sm.f34288o = b02;
                    }
                    BinderC2554Fh g9 = interfaceC3858rh.g();
                    synchronized (c3917sm) {
                        c3917sm.f34276b = g9;
                    }
                }
                c3917sm.d().putAll((Bundle) aVar22.get());
                InterfaceC3858rh interfaceC3858rh2 = (InterfaceC3858rh) aVar23.get();
                if (interfaceC3858rh2 != null) {
                    synchronized (c3917sm) {
                        c3917sm.f34283j = interfaceC3858rh2;
                    }
                    View b03 = interfaceC3858rh2.b0();
                    synchronized (c3917sm) {
                        c3917sm.f34289p = b03;
                    }
                }
                if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31749o6)).booleanValue() || jSONObject4.optInt("template_id") == 3) {
                    InterfaceC3858rh interfaceC3858rh3 = (InterfaceC3858rh) aVar24.get();
                    if (interfaceC3858rh3 != null) {
                        synchronized (c3917sm) {
                            c3917sm.f34284k = interfaceC3858rh3;
                        }
                    }
                } else {
                    synchronized (c3917sm) {
                        c3917sm.f34286m = aVar24;
                    }
                    C3320hg c3320hg2 = new C3320hg();
                    synchronized (c3917sm) {
                        c3917sm.f34287n = c3320hg2;
                    }
                }
                for (C3055cn c3055cn : (List) aVar25.get()) {
                    if (c3055cn.f29747a != 1) {
                        String str3 = c3055cn.f29748b;
                        BinderC3098db binderC3098db = c3055cn.f29750d;
                        synchronized (c3917sm) {
                            if (binderC3098db == null) {
                                c3917sm.f34295v.remove(str3);
                            } else {
                                c3917sm.f34295v.put(str3, binderC3098db);
                            }
                        }
                    } else {
                        c3917sm.o(c3055cn.f29748b, c3055cn.f29749c);
                    }
                }
                return c3917sm;
            }
        };
        final GD gd322 = new GD(n9222, false, false);
        gd322.f25114I = new FD(gd322, callable322, c3157eg);
        gd322.w();
        C3675oC o9222 = UB.o(new J3.a[]{b9, gd322});
        Callable callable2222 = new Callable() { // from class: com.google.android.gms.internal.ads.Pq
            /* JADX WARN: Removed duplicated region for block: B:46:0x0952  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object call() {
                C2750Qq c2750Qq;
                final int i13;
                int i14 = 13;
                int i15 = 0;
                C2750Qq c2750Qq2 = C2750Qq.this;
                GD gd2222 = gd322;
                J3.a aVar16 = b9;
                C2953au c2953au2 = c2953au;
                Ut ut2 = ut;
                JSONObject jSONObject4 = jSONObject;
                C4856a c4856a722 = c4856a6222;
                C4072vf c4072vf7 = c4072vf6222;
                c2750Qq2.getClass();
                C3917sm c3917sm = (C3917sm) gd2222.get();
                C4026un c4026un = (C4026un) aVar16.get();
                C3151ea c3151ea4 = AbstractC3368ia.f31494M2;
                q2.r rVar3 = q2.r.f40116e;
                if (((Boolean) rVar3.f40119c.a(c3151ea4)).booleanValue()) {
                    com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c2750Qq2.f27254f, "rendering-webview-creation-end");
                }
                C3105di c3105di = c2750Qq2.f27249a;
                C3602mu c3602mu3 = new C3602mu(c2953au2, ut2, (String) null);
                C3562m7 c3562m7 = new C3562m7(18, c3917sm);
                C2518Df c2518Df6 = new C2518Df(jSONObject4, c4026un, c4856a722, c4072vf7, 12);
                C3214fi c3214fi = c3105di.f30128b;
                C3105di c3105di2 = c3105di.f30131c;
                C4009uN a10 = C4009uN.a(new C2826Vh(c3214fi.f30772L0, 12));
                C2675Mj c2675Mj = new C2675Mj(c3602mu3, 0);
                C3218fm c3218fm = new C3218fm(c2518Df6, i15);
                C2694Nl c2694Nl = new C2694Nl(C4009uN.a(new C2637Kf(c2675Mj, c3218fm, i14)), 10);
                C4009uN a11 = C4009uN.a(new C3913si(14, c2694Nl));
                C2860Xh c2860Xh = c3214fi.i;
                C2945am c2945am = AbstractC3194fG.f30663X;
                C4009uN a12 = C4009uN.a(new C2484Bf(c2860Xh, a11, c2945am, 1));
                int i16 = 3;
                C4009uN a13 = C4009uN.a(new C2942aj(a10, C4009uN.a(new C2941ai(c3214fi.f30805g, a12, i16)), c3214fi.f30797c, C4009uN.a(new C2758Rh(a12, a10, i16)), c3214fi.f30803f, 0));
                C4009uN a14 = C4009uN.a(new C2758Rh(a13, a11, 5));
                C4009uN a15 = C4009uN.a(new C3377ik(c3105di2.f30176x, c2675Mj, 0));
                C4009uN a16 = C4009uN.a(new C2760Rj(a15, 16));
                int i17 = AN.f23864c;
                ArrayList arrayList3 = new ArrayList(1);
                ArrayList arrayList4 = new ArrayList(3);
                arrayList4.add(c3105di2.f30175w0);
                arrayList4.add(c3105di2.f30177x0);
                arrayList4.add(a14);
                arrayList3.add(a16);
                C4009uN a17 = C4009uN.a(new C3861rk(new AN(arrayList3, arrayList4), 3));
                C4009uN a18 = C4009uN.a(AbstractC3194fG.f30662W);
                C4009uN c4009uN = c3214fi.f30797c;
                C4009uN a19 = C4009uN.a(new C2758Rh(a18, c4009uN, 11));
                C2675Mj c2675Mj2 = new C2675Mj(c3602mu3, 3);
                C2675Mj c2675Mj3 = new C2675Mj(c3602mu3, 2);
                C2860Xh c2860Xh2 = c3214fi.f30805g;
                C4009uN a20 = C4009uN.a(new C2877Yh(c2860Xh2, 16));
                C4009uN a21 = C4009uN.a(AbstractC2655Lg.f26171F);
                C4009uN a22 = C4009uN.a(new C2674Mi(c2860Xh2, c3214fi.J, a20, a21, c3214fi.f30767I0, c3214fi.f30799d));
                C4009uN a23 = C4009uN.a(new C2674Mi(c3214fi.f30783R, c3214fi.f30781Q, c2675Mj, c2675Mj3, a22, c3105di2.f30137e));
                C2945am c2945am2 = new C2945am(4);
                C2945am c2945am3 = new C2945am(2);
                C4009uN a24 = C4009uN.a(new C2758Rh(a18, c4009uN, 16));
                C4009uN a25 = C4009uN.a(AbstractC3035cL.f29695z);
                C2694Nl c2694Nl2 = new C2694Nl(a25, 13);
                ArrayList arrayList5 = new ArrayList(2);
                ArrayList arrayList6 = new ArrayList(1);
                arrayList6.add(c3105di2.C0);
                arrayList5.add(a24);
                arrayList5.add(c2694Nl2);
                C4009uN a26 = C4009uN.a(new C2484Bf(new AN(arrayList5, arrayList6), c2675Mj, c2675Mj2, 7));
                C4009uN a27 = C4009uN.a(new C3913si(12, c2675Mj2));
                C4009uN a28 = C4009uN.a(new C2793Ti(c3214fi.f30805g, c3214fi.f30797c, c3214fi.f30799d, c2675Mj2, c2675Mj, c3105di2.f30167s0, a23, c2945am2, c2945am3, c3214fi.f30775N, c3105di2.f30169t0, c3105di2.f30137e, c3105di2.f30079B0, a26, a27, c3105di2.f30157n0));
                int i18 = 2;
                C2760Rj c2760Rj = new C2760Rj(a28, i18);
                C2760Rj c2760Rj2 = new C2760Rj(C4009uN.a(new C2637Kf(c2675Mj, c3214fi.f30800d0, i18)), 22);
                ArrayList arrayList7 = new ArrayList(4);
                ArrayList arrayList8 = new ArrayList(2);
                arrayList7.add(c3105di2.f30179y0);
                arrayList8.add(c3105di2.f30181z0);
                arrayList8.add(c3105di2.f30077A0);
                arrayList7.add(a19);
                arrayList7.add(c2760Rj);
                arrayList7.add(c2760Rj2);
                C4009uN a29 = C4009uN.a(new C3861rk(new AN(arrayList7, arrayList8), 4));
                C4009uN a30 = C4009uN.a(new C3107dk(c3214fi.f30805g, c3214fi.f30765H0, c3214fi.f30819o, c2675Mj2, c2675Mj, c3214fi.f30779P, c2945am));
                C4009uN a31 = C4009uN.a(new C2760Rj(a30, 13));
                C4009uN a32 = C4009uN.a(new C2758Rh(a18, c3214fi.f30797c, 10));
                C4009uN a33 = C4009uN.a(new C2760Rj(C4009uN.a(new C2828Vj(c3214fi.f30757D0, c3105di2.f30134d)), 11));
                C2760Rj c2760Rj3 = new C2760Rj(a28, 1);
                ArrayList arrayList9 = new ArrayList(5);
                ArrayList arrayList10 = new ArrayList(3);
                arrayList9.add(c3105di2.f30082D0);
                arrayList9.add(c3105di2.f30084E0);
                arrayList10.add(c3105di2.f30086F0);
                arrayList10.add(c3105di2.f30088G0);
                arrayList9.add(a31);
                arrayList9.add(a32);
                arrayList10.add(a33);
                arrayList9.add(c2760Rj3);
                C4009uN a34 = C4009uN.a(new C3861rk(new AN(arrayList9, arrayList10), 0));
                C4009uN a35 = C4009uN.a(new C2758Rh(a13, a11, 4));
                C4009uN a36 = C4009uN.a(new C2760Rj(a30, 14));
                C4009uN c4009uN2 = c3214fi.f30797c;
                C4009uN a37 = C4009uN.a(new C2758Rh(a18, c4009uN2, 13));
                C4009uN a38 = C4009uN.a(new C2760Rj(c3105di2.f30164r, 15));
                C2826Vh c2826Vh = new C2826Vh(a26, 20);
                C2760Rj c2760Rj4 = new C2760Rj(a28, 4);
                C3913si c3913si = new C3913si(16, c3562m7);
                C2694Nl c2694Nl3 = new C2694Nl(C4009uN.a(new C2484Bf(c3913si, c2694Nl, c4009uN2, 9)), 12);
                ArrayList arrayList11 = new ArrayList(8);
                ArrayList arrayList12 = new ArrayList(3);
                arrayList11.add(c3105di2.f30090H0);
                arrayList11.add(c3105di2.f30092I0);
                arrayList12.add(c3105di2.f30093J0);
                arrayList12.add(c3105di2.f30095K0);
                arrayList12.add(a35);
                arrayList11.add(a36);
                arrayList11.add(a37);
                arrayList11.add(a38);
                arrayList11.add(c2826Vh);
                arrayList11.add(c2760Rj4);
                arrayList11.add(c2694Nl3);
                C4009uN a39 = C4009uN.a(new C3861rk(new AN(arrayList11, arrayList12), 2));
                C2760Rj c2760Rj5 = new C2760Rj(a28, 7);
                ArrayList arrayList13 = new ArrayList(1);
                ArrayList arrayList14 = new ArrayList(1);
                arrayList14.add(c3105di2.f30097L0);
                arrayList13.add(c2760Rj5);
                C4009uN a40 = C4009uN.a(new C3861rk(new AN(arrayList13, arrayList14), 19));
                C2760Rj c2760Rj6 = new C2760Rj(C4009uN.a(new C3377ik(c2675Mj, c3214fi.f30783R)), 0);
                ArrayList arrayList15 = new ArrayList(1);
                new ArrayList(1).add(c3105di2.f30099M0);
                arrayList15.add(c2760Rj6);
                C4009uN a41 = C4009uN.a(new C2758Rh(a18, c3214fi.f30797c, 17));
                ArrayList arrayList16 = new ArrayList(1);
                ArrayList arrayList17 = new ArrayList(1);
                arrayList17.add(c3105di2.f30101N0);
                arrayList16.add(a41);
                C4009uN a42 = C4009uN.a(new C3861rk(new AN(arrayList16, arrayList17), 20));
                C4009uN a43 = C4009uN.a(new C2760Rj(a15, 17));
                C2760Rj c2760Rj7 = new C2760Rj(a28, 5);
                ArrayList arrayList18 = new ArrayList(7);
                ArrayList arrayList19 = new ArrayList(4);
                arrayList18.add(c3105di2.f30103O0);
                arrayList19.add(c3105di2.f30105P0);
                arrayList18.add(c3105di2.f30107Q0);
                arrayList18.add(c3105di2.f30109R0);
                arrayList19.add(c3105di2.f30111S0);
                arrayList19.add(c3105di2.f30113T0);
                arrayList19.add(c3105di2.f30115U0);
                arrayList18.add(c3105di2.f30117V0);
                arrayList18.add(c3105di2.f30119W0);
                arrayList18.add(a43);
                arrayList18.add(c2760Rj7);
                C4009uN a44 = C4009uN.a(new C3861rk(new AN(arrayList18, arrayList19), 5));
                C2760Rj c2760Rj8 = new C2760Rj(C4009uN.a(new C2826Vh(a29, 19)), 9);
                C4009uN a45 = C4009uN.a(new C2758Rh(a18, c3214fi.f30797c, 15));
                ArrayList arrayList20 = new ArrayList(2);
                ArrayList arrayList21 = new ArrayList(1);
                arrayList21.add(c3105di2.f30122Y0);
                arrayList20.add(c2760Rj8);
                arrayList20.add(a45);
                C4009uN a46 = C4009uN.a(new C3861rk(new AN(arrayList20, arrayList21), 9));
                List list = Collections.EMPTY_LIST;
                new ArrayList(1).add(c3105di2.f30124Z0);
                C4009uN a47 = C4009uN.a(new C2760Rj(a30, 12));
                ArrayList arrayList22222 = new ArrayList(1);
                List list2 = Collections.EMPTY_LIST;
                arrayList22222.add(a47);
                C4009uN a48 = C4009uN.a(new C2758Rh(a18, c3214fi.f30797c, 12));
                C2760Rj c2760Rj9 = new C2760Rj(a28, 3);
                ArrayList arrayList23 = new ArrayList(2);
                new ArrayList(1).add(c3105di2.f30127a1);
                arrayList23.add(a48);
                arrayList23.add(c2760Rj9);
                C4009uN a49 = C4009uN.a(new C2760Rj(a30, 8));
                ArrayList arrayList24 = new ArrayList(1);
                List list3 = Collections.EMPTY_LIST;
                arrayList24.add(a49);
                C2675Mj c2675Mj4 = new C2675Mj(c3602mu3, 1);
                C4184xj c4184xj = new C4184xj(c2675Mj, c2675Mj4, c3105di2.f30076A, c2675Mj3, c3105di2.f30140f);
                ArrayList arrayList25 = new ArrayList(1);
                ArrayList arrayList26 = new ArrayList(1);
                arrayList26.add(c3105di2.f30133c1);
                arrayList25.add(c3105di2.f30136d1);
                C2726Pj c2726Pj = new C2726Pj(c2675Mj2, c2675Mj, a17, a44, c3105di2.f30130b1, c4184xj, a18, new C3861rk(new AN(arrayList25, arrayList26), 6), a40, a27, c3214fi.f30828s0);
                C3218fm c3218fm2 = new C3218fm(c2518Df6, 1);
                C4009uN a50 = C4009uN.a(new C2559Fm(c3218fm2, c3214fi.f30803f));
                C4009uN a51 = C4009uN.a(new C2758Rh(a13, a11, 6));
                List list4 = Collections.EMPTY_LIST;
                ArrayList arrayList27 = new ArrayList(2);
                arrayList27.add(c3105di2.f30139e1);
                arrayList27.add(a51);
                AN an = new AN(list4, arrayList27);
                C4009uN c4009uN3 = c3105di2.f30176x;
                C4009uN a52 = C4009uN.a(new C2484Bf(c4009uN3, an, c2675Mj, 8));
                C4009uN a53 = C4009uN.a(new C3218fm(c2518Df6, 2));
                C4009uN a54 = C4009uN.a(new C3218fm(c2518Df6, 3));
                C2898Zl c2898Zl = c3105di2.m0;
                C4009uN c4009uN4 = c3214fi.f30775N;
                C2860Xh c2860Xh3 = c3214fi.i;
                C3700ok c3700ok = c3105di2.f30134d;
                C4009uN c4009uN5 = c3214fi.f30803f;
                C2694Nl c2694Nl4 = new C2694Nl(C4009uN.a(new C3163em(c4009uN3, c2898Zl, c3218fm, c3218fm2, c3913si, c4009uN4, a39, a34, a42, c2675Mj, c2860Xh3, c3700ok, a13, a50, c4009uN5, a52, c3214fi.f30783R, c3105di2.f30137e, c3214fi.f30785S, a21, c3214fi.f30782Q0, a26, a53, a54, a27)), 11);
                C4009uN a55 = C4009uN.a(new C3272gm(c2860Xh3, 0));
                C4009uN c4009uN6 = c3214fi.f30797c;
                C4009uN a56 = C4009uN.a(new C4121wa(a55, c4009uN6, c4009uN3, c4009uN5, 1));
                C4009uN c4009uN7 = c3105di2.f30171u0;
                C2843Wh c2843Wh = new C2843Wh(c4009uN7, c3218fm2, a56, c2694Nl4);
                C2559Fm c2559Fm = new C2559Fm(c4009uN7, c3218fm2);
                C4009uN a57 = C4009uN.a(new C3913si(15, new C3379im(c3913si, 0)));
                C2491Bm c2491Bm = new C2491Bm(c3214fi.J, c3700ok, c2694Nl, c3913si, c2843Wh, c2559Fm, c4009uN6, a57);
                C3006bs c3006bs = new C3006bs();
                C4009uN a58 = C4009uN.a(new C3541ln(c2675Mj4, c3006bs, c3913si, 1));
                C4009uN a59 = C4009uN.a(new C3541ln(c2675Mj4, c3006bs, c3913si, 0));
                C4009uN a60 = C4009uN.a(new C2843Wh((InterfaceC4063vN) c2675Mj4, (InterfaceC4063vN) c3006bs, (InterfaceC4063vN) c3913si, c3214fi.f30819o, 8));
                C4009uN a61 = C4009uN.a(new C2637Kf(c3006bs, c3913si, 17));
                C2860Xh c2860Xh4 = c3214fi.f30805g;
                C4009uN a62 = C4009uN.a(new C2843Wh(c2860Xh4, c3913si, c2491Bm, c3006bs, 7));
                C3006bs.a(c3006bs, C4009uN.a(new C3702om(c2726Pj, c4009uN6, c3913si, c2694Nl4, c2491Bm, c2694Nl, c2898Zl, a58, a59, a60, a61, a62, new C3807qj(c2860Xh4, c3700ok, 2), c4009uN4, c2860Xh3, c2860Xh4, a57, a25, c3214fi.f30784R0)));
                C4009uN c4009uN8 = c3105di2.f30142f1;
                C4009uN c4009uN9 = c3105di2.f30121X0;
                C4009uN a63 = C4009uN.a(new C2491Bm(a34, a29, c4009uN8, a46, c4009uN9, c2675Mj, c2675Mj3, a22, 1));
                C4009uN a64 = C4009uN.a(new C2942aj(c3214fi.f30797c, a56, C4009uN.a(new C3377ik(c3105di2.f30176x, c2675Mj, 2)), a22, a27, 1));
                C4009uN a65 = C4009uN.a(new C3483kj(a34, a29, c4009uN8, a46, c4009uN9, a42, c3214fi.f30819o, c3214fi.f30783R, c3214fi.f30779P, a22, 2));
                if (((Boolean) rVar3.f40119c.a(c3151ea4)).booleanValue()) {
                    p2.j.f39798C.f39810k.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    c2750Qq = c2750Qq2;
                    C3002bo c3002bo4 = c2750Qq.f27254f;
                    c3002bo4.c("rendering-ad-component-creation-end", currentTimeMillis);
                    c3002bo4.c("rendering-configure-webview-start", currentTimeMillis);
                } else {
                    c2750Qq = c2750Qq2;
                }
                C4133wm c4133wm = (C4133wm) c3105di2.f30125a.f28862u;
                AbstractC3137eE.h(c4133wm);
                AbstractC3137eE.h(c3917sm);
                AbstractC3137eE.h(c4026un);
                C2685Nc c2685Nc = new C2685Nc(c4133wm, c3917sm, c4026un, C4009uN.b(a62));
                if (((InterfaceC2514Db) c2685Nc.f26570u) != null) {
                    ((C4026un) c2685Nc.f26571v).b("/nativeAdCustomClick", c2685Nc);
                }
                C3918sn c3918sn = (C3918sn) a63.d();
                C2557Fk c2557Fk = c3918sn.f34300b;
                C3757pn c3757pn = c4026un.f34650a;
                Objects.requireNonNull(c2557Fk);
                C3864rn c3864rn = new C3864rn(0, c2557Fk);
                C3808qk c3808qk = c3918sn.f34299a;
                C2659Lk c2659Lk = c3918sn.f34301c;
                C2727Pk c2727Pk = c3918sn.f34302d;
                C3325hl c3325hl = c3918sn.f34303e;
                synchronized (c3757pn) {
                    c3757pn.f33506n = c3808qk;
                    c3757pn.f33507u = c2659Lk;
                    c3757pn.f33508v = c2727Pk;
                    c3757pn.f33509w = c3325hl;
                    c3757pn.f33510x = c3864rn;
                }
                Ut ut3 = c3918sn.f34304f;
                Wt wt42 = c3918sn.f34305g;
                C2657Li c2657Li = c3918sn.f34306h;
                synchronized (c4026un) {
                    C3999uD c3999uD = c4026un.f34661m;
                    if (c3999uD != null) {
                        C2518Df c2518Df7 = new C2518Df(c4026un, ut3, wt42, c2657Li);
                        c3999uD.c(new MD(0, c3999uD, c2518Df7), c4026un.f34654e);
                    }
                }
                final C3219fn c3219fn = (C3219fn) a64.d();
                InterfaceC3858rh h9 = c3917sm.h();
                c3219fn.getClass();
                if (h9 != null) {
                    View b02 = h9.b0();
                    C2490Bl c2490Bl = c3219fn.f30884c;
                    c2490Bl.v1(b02);
                    C3110dn c3110dn = new C3110dn(h9, 1);
                    Executor executor2 = c3219fn.f30882a;
                    c2490Bl.s1(c3110dn, executor2);
                    c2490Bl.s1(new C3110dn(h9, 0), executor2);
                    C2997bj c2997bj = c3219fn.f30883b;
                    c2490Bl.s1(c2997bj, executor2);
                    c2997bj.f29552n = h9;
                    C2588Hh j02 = h9.j0();
                    if (!((Boolean) rVar3.f40119c.a(AbstractC3368ia.Ab)).booleanValue() || j02 == null) {
                        i13 = 0;
                    } else {
                        j02.c("/click");
                        InterfaceC2524Dl interfaceC2524Dl = j02.f25384D;
                        C2820Vb c2820Vb = AbstractC2935ac.f29210a;
                        C2657Li c2657Li2 = c3219fn.f30885d;
                        i13 = 0;
                        j02.b("/click", new C2871Yb(0, interfaceC2524Dl, c2657Li2));
                        j02.z(c2657Li2, null, null);
                    }
                    h9.N0("/trackActiveViewUnit", new InterfaceC2990bc() { // from class: com.google.android.gms.internal.ads.en
                        @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
                        public final void g(Object obj, Map map) {
                            switch (i13) {
                                case 0:
                                    C2997bj c2997bj2 = c3219fn.f30883b;
                                    c2997bj2.f29556x = true;
                                    c2997bj2.a();
                                    break;
                                default:
                                    c3219fn.f30883b.f29556x = false;
                                    break;
                            }
                        }
                    });
                    final int i19 = 1;
                    h9.N0("/untrackActiveViewUnit", new InterfaceC2990bc() { // from class: com.google.android.gms.internal.ads.en
                        @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
                        public final void g(Object obj, Map map) {
                            switch (i19) {
                                case 0:
                                    C2997bj c2997bj2 = c3219fn.f30883b;
                                    c2997bj2.f29556x = true;
                                    c2997bj2.a();
                                    break;
                                default:
                                    c3219fn.f30883b.f29556x = false;
                                    break;
                            }
                        }
                    });
                    h9.j0().f25399T = c3219fn.f30886e;
                }
                C4188xn c4188xn = (C4188xn) a65.d();
                C4242yn c4242yn = c2750Qq.f27253e;
                InterfaceC3858rh i20 = c3917sm.i();
                c4188xn.getClass();
                C4134wn c4134wn = c4242yn.f35408a;
                C2557Fk c2557Fk2 = c4188xn.f35244b;
                Objects.requireNonNull(c2557Fk2);
                C3864rn c3864rn2 = new C3864rn(1, c2557Fk2);
                C3808qk c3808qk2 = c4188xn.f35243a;
                C2659Lk c2659Lk2 = c4188xn.f35245c;
                C2727Pk c2727Pk2 = c4188xn.f35246d;
                C3325hl c3325hl2 = c4188xn.f35247e;
                C2507Cl c2507Cl = c4188xn.f35248f;
                synchronized (c4134wn) {
                    synchronized (c4134wn) {
                        c4134wn.f33506n = c3808qk2;
                        c4134wn.f33507u = c2659Lk2;
                        c4134wn.f33508v = c2727Pk2;
                        c4134wn.f33509w = c3325hl2;
                        c4134wn.f33510x = c3864rn2;
                    }
                    if (((Boolean) rVar3.f40119c.a(AbstractC3368ia.Bb)).booleanValue() && i20 != null && i20.j0() != null) {
                        C2588Hh j03222 = i20.j0();
                        C2657Li c2657Li3222 = c4188xn.f35251j;
                        C2834Vp c2834Vp222 = c4188xn.i;
                        j03222.y(c2657Li3222, c2834Vp222, c4188xn.f35250h);
                        j03222.z(c2657Li3222, c2834Vp222, c4188xn.f35249g);
                    }
                    if (((Boolean) rVar3.f40119c.a(c3151ea4)).booleanValue()) {
                        com.anythink.basead.b.c.i.u(p2.j.f39798C.f39810k, c2750Qq.f27254f, "rendering-configure-webview-end");
                    }
                    return (C3648nm) c3006bs.d();
                }
                c4134wn.f35068y = c2507Cl;
                if (((Boolean) rVar3.f40119c.a(AbstractC3368ia.Bb)).booleanValue()) {
                    C2588Hh j032222 = i20.j0();
                    C2657Li c2657Li32222 = c4188xn.f35251j;
                    C2834Vp c2834Vp2222 = c4188xn.i;
                    j032222.y(c2657Li32222, c2834Vp2222, c4188xn.f35250h);
                    j032222.z(c2657Li32222, c2834Vp2222, c4188xn.f35249g);
                }
                if (((Boolean) rVar3.f40119c.a(c3151ea4)).booleanValue()) {
                }
                return (C3648nm) c3006bs.d();
            }
        };
        GD gd2222 = new GD(o9222, true, false);
        gd2222.f25114I = new FD(gd2222, callable2222, this.f27250b);
        gd2222.w();
        return gd2222;
    }
}
