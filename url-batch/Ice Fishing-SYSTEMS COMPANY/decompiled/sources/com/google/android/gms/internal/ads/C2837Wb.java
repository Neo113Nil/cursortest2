package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;
import u2.C5107a;
import w2.InterfaceC5154b;
import y2.InterfaceC5250b;

/* renamed from: com.google.android.gms.internal.ads.Wb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2837Wb implements InterfaceC3373ig, InterfaceC3426jg, InterfaceC2821Vc, InterfaceC2838Wc, InterfaceC5154b, InterfaceC5250b, InterfaceC2466Ae, R0, LD {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ C2837Wb f28395u = new C2837Wb(3);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ C2837Wb f28396v = new C2837Wb(7);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ C2837Wb f28397w = new C2837Wb(24);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ C2837Wb f28398x = new C2837Wb(25);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28399n;

    public /* synthetic */ C2837Wb(int i) {
        this.f28399n = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.wh] */
    public static final InterfaceC3858rh g(final S0.s sVar, final W2.b bVar, final Context context, final C3348i7 c3348i7, final C2914a9 c2914a9, final C4175xa c4175xa, final C3165eo c3165eo, final BinderC2949aq binderC2949aq, final C3761pr c3761pr, final Ut ut, final Wt wt, final C3280gu c3280gu, final String str, final C5107a c5107a, final boolean z8, final boolean z9) {
        AbstractC3368ia.a(context);
        try {
            ?? r02 = new InterfaceC3404jB() { // from class: com.google.android.gms.internal.ads.wh
                @Override // com.google.android.gms.internal.ads.InterfaceC3404jB
                public final Object a() {
                    W2.b bVar2 = bVar;
                    String str2 = str;
                    boolean z10 = z8;
                    boolean z11 = z9;
                    BinderC2949aq binderC2949aq2 = binderC2949aq;
                    C3165eo c3165eo2 = c3165eo;
                    C3761pr c3761pr2 = c3761pr;
                    S0.s sVar2 = sVar;
                    C2914a9 c2914a92 = c2914a9;
                    Ut ut2 = ut;
                    Wt wt2 = wt;
                    C3280gu c3280gu2 = c3280gu;
                    C3348i7 c3348i72 = c3348i7;
                    C4175xa c4175xa2 = c4175xa;
                    C5107a c5107a2 = c5107a;
                    Context context2 = context;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = ViewTreeObserverOnGlobalLayoutListenerC2520Dh.f24460I0;
                        C2707Oh c2707Oh = new C2707Oh(context2);
                        c2707Oh.setBaseContext(context2);
                        C2486Bh c2486Bh = new C2486Bh(new ViewTreeObserverOnGlobalLayoutListenerC2520Dh(c2707Oh, bVar2, str2, z10, c3348i72, c4175xa2, c5107a2, c3761pr2, sVar2, c2914a92, ut2, wt2, c3280gu2), c3165eo2);
                        c2486Bh.setWebViewClient(p2.j.f39798C.f39806f.y(c2486Bh, c2914a92, z11, binderC2949aq2));
                        c2486Bh.setWebChromeClient(new C3805qh(c2486Bh));
                        return c2486Bh;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object a9 = r02.a();
                StrictMode.setThreadPolicy(threadPolicy);
                return (InterfaceC3858rh) a9;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (Throwable th2) {
            throw new C4290zh("Webview initialization failed.", th2);
        }
    }

    public static final void h(String str, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.getString(i));
            }
            Collections.unmodifiableList(arrayList);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3373ig, com.google.android.gms.internal.ads.InterfaceC3152eb, com.google.android.gms.internal.ads.Kr
    /* renamed from: a */
    public void mo0a() {
        int i = this.f28399n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3426jg
    /* renamed from: b */
    public void mo5b(Object obj) {
        switch (this.f28399n) {
            case 4:
                t2.C.k("Ending javascript session.");
                C2804Uc c2804Uc = (C2804Uc) ((InterfaceC2787Tc) obj);
                HashSet hashSet = c2804Uc.f28044u;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
                    t2.C.k("Unregistering eventhandler: ".concat(String.valueOf(((InterfaceC2990bc) simpleEntry.getValue()).toString())));
                    c2804Uc.f28043n.e((String) simpleEntry.getKey(), (InterfaceC2990bc) simpleEntry.getValue());
                }
                hashSet.clear();
                break;
            default:
                AbstractC3212fg.f30743f.execute(new RunnableC2702Oc((C2634Kc) obj, 2));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2821Vc
    public /* synthetic */ Object c(JSONObject jSONObject) {
        switch (this.f28399n) {
            case 6:
                return jSONObject;
            default:
                return new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2838Wc
    public /* bridge */ /* synthetic */ JSONObject l(Object obj) {
        return (JSONObject) obj;
    }

    @Override // com.google.android.gms.internal.ads.R0
    public O0[] a() {
        switch (this.f28399n) {
            case 24:
                AtomicInteger atomicInteger = C3267gh.f31034N;
                return new O0[]{new S2(), new C3773q2()};
            default:
                AtomicInteger atomicInteger2 = C3267gh.f31034N;
                return new O0[]{new S2(), new C3773q2(), new N2(InterfaceC3720p3.m0, 32, C3675oC.f33115x)};
        }
    }

    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l, reason: collision with other method in class */
    public /* synthetic */ void mo7l(Object obj) {
        ((AbstractC2539Ej) obj).m();
    }

    private final /* synthetic */ void i() {
    }

    private final void j() {
    }

    @Override // com.google.android.gms.internal.ads.LD
    public void q(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2466Ae
    public void e(String str, Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2466Ae
    public void f(Throwable th, String str, float f6) {
    }
}
