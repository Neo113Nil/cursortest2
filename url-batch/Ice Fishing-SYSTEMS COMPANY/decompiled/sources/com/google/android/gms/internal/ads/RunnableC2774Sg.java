package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Sg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2774Sg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27580n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f27581u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f27582v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f27583w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f27584x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f27585y;

    public /* synthetic */ RunnableC2774Sg(C2518Df c2518Df, Throwable th, Av av, String str, t2.w wVar) {
        this.f27582v = c2518Df;
        this.f27583w = th;
        this.f27584x = av;
        this.f27581u = str;
        this.f27585y = wVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        char c4;
        String str;
        Object obj = this.f27581u;
        Object obj2 = this.f27585y;
        Object obj3 = this.f27584x;
        Object obj4 = this.f27583w;
        Object obj5 = this.f27582v;
        switch (this.f27580n) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put("event", "precacheCanceled");
                hashMap.put("src", (String) obj);
                String str2 = (String) obj5;
                if (!TextUtils.isEmpty(str2)) {
                    hashMap.put("cachedSrc", str2);
                }
                String str3 = (String) obj4;
                switch (str3.hashCode()) {
                    case -1947652542:
                        if (str3.equals("interrupted")) {
                            c4 = 3;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1396664534:
                        if (str3.equals("badUrl")) {
                            c4 = '\b';
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1347010958:
                        if (str3.equals("inProgress")) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -918817863:
                        if (str3.equals("downloadTimeout")) {
                            c4 = '\t';
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -659376217:
                        if (str3.equals("contentLengthMissing")) {
                            c4 = 0;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -642208130:
                        if (str3.equals("playerFailed")) {
                            c4 = 5;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -354048396:
                        if (str3.equals("sizeExceeded")) {
                            c4 = 11;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -32082395:
                        if (str3.equals("externalAbort")) {
                            c4 = '\n';
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 3387234:
                        if (str3.equals("noop")) {
                            c4 = 4;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 96784904:
                        if (str3.equals("error")) {
                            c4 = 1;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 580119100:
                        if (str3.equals("expireFailed")) {
                            c4 = 6;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 725497484:
                        if (str3.equals("noCacheDir")) {
                            c4 = 7;
                            break;
                        }
                        c4 = 65535;
                        break;
                    default:
                        c4 = 65535;
                        break;
                }
                switch (c4) {
                    case 6:
                    case 7:
                        str = "io";
                        break;
                    case '\b':
                    case '\t':
                        str = "network";
                        break;
                    case '\n':
                    case 11:
                        str = "policy";
                        break;
                    default:
                        str = "internal";
                        break;
                }
                hashMap.put("type", str);
                hashMap.put("reason", str3);
                String str4 = (String) obj3;
                if (!TextUtils.isEmpty(str4)) {
                    hashMap.put("message", str4);
                }
                ((AbstractC2791Tg) obj2).n(hashMap);
                return;
            case 1:
                Throwable th = (Throwable) obj4;
                C2518Df c2518Df = (C2518Df) obj5;
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Jb)).booleanValue()) {
                    C4287ze.c(((C2657Li) c2518Df.f24456x).f26190a).e("AttributionReporting.registerSourceAndPingClickUrl", th);
                } else {
                    C4287ze.a(((C2657Li) c2518Df.f24456x).f26190a).e("AttributionReportingSampled.registerSourceAndPingClickUrl", th);
                }
                ((Av) obj3).b((String) obj, (t2.w) obj2, null, null);
                return;
            case 2:
                String str5 = (String) obj;
                BinderC4297zo binderC4297zo = (BinderC4297zo) obj4;
                C3656nu c3656nu = (C3656nu) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                C2527Do c2527Do = (C2527Do) obj5;
                c2527Do.getClass();
                try {
                    try {
                        if (Objects.equals(str5, "com.google.ads.mediation.admob.AdMobAdapter")) {
                            binderC4297zo.c();
                            return;
                        }
                        Context context = (Context) c2527Do.f24561g.get();
                        if (context == null) {
                            context = c2527Do.f24560f;
                        }
                        try {
                            c3656nu.f33064a.X1(new V2.b(context), binderC4297zo, arrayList);
                            return;
                        } catch (Throwable th2) {
                            throw new C3334hu(th2);
                        }
                    } catch (RemoteException e6) {
                        int i = t2.C.f40822b;
                        u2.i.d("", e6);
                        return;
                    }
                } catch (RemoteException e9) {
                    throw new B0.c(e9);
                } catch (C3334hu unused) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 74);
                    sb.append("Failed to initialize adapter. ");
                    sb.append(str5);
                    sb.append(" does not implement the initialize() method.");
                    binderC4297zo.G3(sb.toString());
                    return;
                }
            case 3:
                Sz sz = (Sz) obj;
                Context context2 = (Context) obj4;
                View view = (View) obj3;
                HashMap hashMap2 = (HashMap) obj5;
                hashMap2.putAll(sz.f27667e.b(context2, view));
                sz.h(hashMap2);
                hashMap2.put("f", "v");
                hashMap2.put("ctx", context2);
                hashMap2.put(com.anythink.expressad.a.f17754C, view);
                hashMap2.put("act", (Activity) obj2);
                hashMap2.put("bds", null);
                return;
            default:
                Sz sz2 = (Sz) obj5;
                HashMap hashMap3 = (HashMap) obj4;
                hashMap3.putAll(sz2.f27667e.c());
                sz2.h(hashMap3);
                hashMap3.put("f", "c");
                hashMap3.put("ctx", (Context) obj3);
                hashMap3.put(com.anythink.expressad.a.f17754C, (View) obj2);
                hashMap3.put("act", null);
                hashMap3.put("bds", (String) obj);
                return;
        }
    }

    public /* synthetic */ RunnableC2774Sg(C2527Do c2527Do, String str, BinderC4297zo binderC4297zo, C3656nu c3656nu, ArrayList arrayList) {
        this.f27582v = c2527Do;
        this.f27581u = str;
        this.f27583w = binderC4297zo;
        this.f27584x = c3656nu;
        this.f27585y = arrayList;
    }

    public /* synthetic */ RunnableC2774Sg(Sz sz, HashMap hashMap, Context context, View view, Activity activity) {
        this.f27581u = sz;
        this.f27582v = hashMap;
        this.f27583w = context;
        this.f27584x = view;
        this.f27585y = activity;
    }

    public /* synthetic */ RunnableC2774Sg(Sz sz, HashMap hashMap, Context context, View view, String str) {
        this.f27582v = sz;
        this.f27583w = hashMap;
        this.f27584x = context;
        this.f27585y = view;
        this.f27581u = str;
    }

    public RunnableC2774Sg(AbstractC2791Tg abstractC2791Tg, String str, String str2, String str3, String str4) {
        this.f27581u = str;
        this.f27582v = str2;
        this.f27583w = str3;
        this.f27584x = str4;
        Objects.requireNonNull(abstractC2791Tg);
        this.f27585y = abstractC2791Tg;
    }
}
