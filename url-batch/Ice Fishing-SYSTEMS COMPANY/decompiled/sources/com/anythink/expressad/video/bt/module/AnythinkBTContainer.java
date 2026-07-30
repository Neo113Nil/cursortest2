package com.anythink.expressad.video.bt.module;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.b.c.i;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.t;
import com.anythink.core.common.e.g;
import com.anythink.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.u;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.out.k;
import com.anythink.expressad.video.bt.module.b.h;
import com.anythink.expressad.video.signal.a.c;
import com.anythink.expressad.video.signal.b;
import com.anythink.expressad.video.signal.container.AbstractJSContainer;
import com.anythink.expressad.videocommon.a;
import com.anythink.expressad.videocommon.b.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public class AnythinkBTContainer extends AbstractJSContainer implements b {

    /* renamed from: e, reason: collision with root package name */
    private static final String f21078e = "AnythinkBTContainer";

    /* renamed from: A, reason: collision with root package name */
    private LayoutInflater f21079A;

    /* renamed from: B, reason: collision with root package name */
    private Context f21080B;

    /* renamed from: C, reason: collision with root package name */
    private TextView f21081C;

    /* renamed from: D, reason: collision with root package name */
    private ImageView f21082D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f21083E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f21084F;

    /* renamed from: G, reason: collision with root package name */
    private String f21085G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f21086H;

    /* renamed from: I, reason: collision with root package name */
    private List<d> f21087I;
    private List<c> J;

    /* renamed from: K, reason: collision with root package name */
    private com.anythink.expressad.video.bt.module.a.a f21088K;

    /* renamed from: L, reason: collision with root package name */
    private h f21089L;

    /* renamed from: M, reason: collision with root package name */
    private h f21090M;

    /* renamed from: N, reason: collision with root package name */
    private com.anythink.expressad.video.bt.module.a.b f21091N;

    /* renamed from: O, reason: collision with root package name */
    private String f21092O;

    /* renamed from: P, reason: collision with root package name */
    private String f21093P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f21094Q;

    /* renamed from: R, reason: collision with root package name */
    private int f21095R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f21096S;

    /* renamed from: T, reason: collision with root package name */
    private int f21097T;

    /* renamed from: U, reason: collision with root package name */
    private String f21098U;

    /* renamed from: V, reason: collision with root package name */
    private com.anythink.expressad.video.dynview.f.d f21099V;

    /* renamed from: W, reason: collision with root package name */
    private com.anythink.expressad.video.a.a f21100W;

    /* renamed from: a, reason: collision with root package name */
    d f21101a;

    /* renamed from: f, reason: collision with root package name */
    private int f21102f;

    /* renamed from: g, reason: collision with root package name */
    private int f21103g;

    /* renamed from: h, reason: collision with root package name */
    private FrameLayout f21104h;
    private AnythinkBTLayout i;

    /* renamed from: j, reason: collision with root package name */
    private WindVaneWebView f21105j;

    public class a extends c.a {
        private a() {
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void a() {
            super.a();
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.out.q.c
        public final void b(k kVar, String str) {
            super.b(kVar, str);
            u.b();
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void d() {
            super.d();
        }

        public /* synthetic */ a(AnythinkBTContainer anythinkBTContainer, byte b9) {
            this();
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.out.q.c
        public final void a(d dVar, String str) {
            super.a(dVar, str);
            FrameLayout unused = AnythinkBTContainer.this.f21104h;
            u.a();
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.out.q.c
        public final void a(k kVar, String str) {
            super.a(kVar, str);
            u.b();
            if (kVar == null || !(kVar instanceof d)) {
                return;
            }
            try {
                d dVar = (d) kVar;
                String optString = new JSONObject(AnythinkBTContainer.this.getJSVideoModule().getCurrentProgress()).optString(g.a.f13106C, "");
                if (dVar.R() == 3 && dVar.D() == 2 && optString.equals(j.e.f12593a) && ((AbstractJSContainer) AnythinkBTContainer.this).f22304l != null) {
                    if (!AnythinkBTContainer.this.f21084F) {
                        ((AbstractJSContainer) AnythinkBTContainer.this).f22304l.finish();
                    } else {
                        AnythinkBTContainer.this.onAdClose();
                    }
                }
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void a(d dVar, boolean z8) {
            super.a(dVar, z8);
            AnythinkBTContainer.this.f21090M.a(dVar);
        }

        @Override // com.anythink.expressad.video.signal.a.c.a, com.anythink.expressad.video.signal.c.a
        public final void a(int i, String str) {
            super.a(i, str);
        }
    }

    public AnythinkBTContainer(Context context) {
        super(context);
        this.f21102f = 0;
        this.f21103g = 1;
        this.f21083E = false;
        this.f21084F = true;
        this.f21086H = false;
        this.f21095R = 1;
        init(context);
    }

    private static void e() {
    }

    private static boolean f() {
        return true;
    }

    private static int g() {
        return 1;
    }

    public void addNativeCloseButtonWhenWebViewCrash() {
        try {
            ImageView imageView = new ImageView(t.b().g());
            int b9 = v.b(t.b().g(), 48.0f);
            int b10 = v.b(t.b().g(), 20.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b9, b9);
            layoutParams.setMargins(b10, b10, b10, b10);
            layoutParams.gravity = 5;
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(com.anythink.expressad.foundation.h.k.a(t.b().g(), "anythink_reward_close", com.anythink.expressad.foundation.h.k.f19790c));
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTContainer.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AnythinkBTContainer.this.onAdClose();
                }
            });
            addView(imageView);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void appendSubView(AnythinkBTContainer anythinkBTContainer, ATTempContainer aTTempContainer, JSONObject jSONObject) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (jSONObject != null) {
                Context g9 = t.b().g();
                int optInt = jSONObject.optInt("left", -999);
                int optInt2 = jSONObject.optInt("top", -999);
                int optInt3 = jSONObject.optInt("right", -999);
                int optInt4 = jSONObject.optInt("bottom", -999);
                if (optInt != -999 && g9 != null) {
                    layoutParams.leftMargin = v.b(g9, optInt);
                }
                if (optInt2 != -999 && g9 != null) {
                    layoutParams.topMargin = v.b(g9, optInt2);
                }
                if (optInt3 != -999 && g9 != null) {
                    layoutParams.rightMargin = v.b(g9, optInt3);
                }
                if (optInt4 != -999 && g9 != null) {
                    layoutParams.bottomMargin = v.b(g9, optInt4);
                }
                int optInt5 = jSONObject.optInt("width");
                int optInt6 = jSONObject.optInt("height");
                if (optInt5 > 0) {
                    layoutParams.width = optInt5;
                }
                if (optInt6 > 0) {
                    layoutParams.height = optInt6;
                }
            }
            anythinkBTContainer.addView(aTTempContainer, layoutParams);
            aTTempContainer.setActivity(this.f22304l);
            aTTempContainer.setMute(this.f22311s);
            aTTempContainer.setBidCampaign(this.f21083E);
            aTTempContainer.setIV(this.f22312t);
            aTTempContainer.setBigOffer(this.f21084F);
            aTTempContainer.setIVRewardEnable(this.f22314v, this.f22315w, this.f22316x);
            aTTempContainer.setShowRewardListener(this.f21090M);
            aTTempContainer.setCampaignDownLoadTask(d(aTTempContainer.getCampaign()));
            aTTempContainer.setAnythinkTempCallback(d());
            aTTempContainer.setH5Cbp(getJSCommon().e());
            aTTempContainer.setWebViewFront(getJSCommon().f());
            aTTempContainer.init(this.f21080B);
            aTTempContainer.onCreate();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f21105j != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", this.f21102f);
                jSONObject2.put("id", this.f21085G);
                jSONObject2.put("eventName", str);
                jSONObject2.put("data", jSONObject);
                com.anythink.expressad.atsignalcommon.windvane.h.a();
                com.anythink.core.express.d.a.a((WebView) this.f21105j, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                com.anythink.expressad.video.bt.a.c.a();
                com.anythink.expressad.video.bt.a.c.a((WebView) this.f21105j, "broadcast", this.f21085G);
            }
        }
    }

    @Override // com.anythink.expressad.video.signal.d
    public void click(int i, String str) {
    }

    public int findID(String str) {
        return com.anythink.expressad.foundation.h.k.a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return com.anythink.expressad.foundation.h.k.a(getContext(), str, "layout");
    }

    @Override // com.anythink.expressad.video.signal.d
    public void handlerH5Exception(int i, String str) {
    }

    public void init(Context context) {
        this.f21080B = context;
        this.f21079A = LayoutInflater.from(context);
    }

    public boolean isNativeKilledCallback(d dVar) {
        if (getJSCommon().e() != 1 && dVar != null) {
            if (dVar.n() == 1) {
                com.anythink.expressad.videocommon.e.d dVar2 = this.f22307o;
                if (dVar2 != null) {
                    if (dVar2.M() == 1) {
                        dVar.o(1);
                        return true;
                    }
                    dVar.o(0);
                    return false;
                }
            } else {
                if (dVar.B()) {
                    dVar.o(0);
                    return false;
                }
                int a9 = this.f22307o.a();
                dVar.o(a9);
                if (a9 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public void onAdClose() {
        Activity activity = this.f22304l;
        if (activity != null) {
            activity.finish();
        }
    }

    public void onBackPressed() {
        try {
            LinkedHashMap<String, View> b9 = com.anythink.expressad.video.bt.a.c.a().b(this.f22305m, this.f21093P);
            if (b9 == null || b9.size() <= 0) {
                return;
            }
            for (View view : b9.values()) {
                if (view instanceof ATTempContainer) {
                    ((ATTempContainer) view).onBackPressed();
                } else if (view instanceof AnythinkBTWebView) {
                    ((AnythinkBTWebView) view).onBackPressed();
                } else if (view instanceof AnythinkBTLayout) {
                    ((AnythinkBTLayout) view).onBackPressed();
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        try {
            LinkedHashMap<String, View> b9 = com.anythink.expressad.video.bt.a.c.a().b(this.f22305m, this.f21093P);
            if (b9 == null || b9.size() <= 0) {
                return;
            }
            for (View view : b9.values()) {
                if (view instanceof ATTempContainer) {
                    ((ATTempContainer) view).onConfigurationChanged(configuration);
                } else if (view instanceof AnythinkBTWebView) {
                    ((AnythinkBTWebView) view).onConfigurationChanged(configuration);
                } else if (view instanceof AnythinkBTLayout) {
                    ((AnythinkBTLayout) view).onConfigurationChanged(configuration);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void onCreate() {
        String str;
        WindVaneWebView windVaneWebView;
        d dVar;
        try {
            int findLayout = findLayout("anythink_bt_container");
            if (findLayout < 0) {
                a("anythink_bt_container layout null");
                return;
            }
            FrameLayout frameLayout = (FrameLayout) this.f21079A.inflate(findLayout, this);
            this.f21104h = frameLayout;
            if (frameLayout == null) {
                a("ViewIds null");
                return;
            }
            this.f21093P = "";
            List<d> list = this.f21087I;
            byte b9 = 0;
            if (list == null || list.size() <= 0) {
                str = "";
            } else {
                d dVar2 = this.f21087I.get(0);
                str = dVar2.at();
                this.f21093P = dVar2.aa();
            }
            a.C0141a a9 = com.anythink.expressad.videocommon.a.a(this.f22305m + "_" + this.f21093P + "_" + str);
            RelativeLayout.LayoutParams layoutParams = null;
            if (a9 != null) {
                this.f21085G = a9.b();
                a9.a("");
                windVaneWebView = a9.a();
            } else {
                windVaneWebView = null;
            }
            this.f21105j = windVaneWebView;
            com.anythink.expressad.videocommon.a.b(this.f22305m + "_" + this.f21093P + "_" + str);
            WindVaneWebView windVaneWebView2 = this.f21105j;
            if (windVaneWebView2 == null) {
                List<d> list2 = this.f21087I;
                if (list2 == null || list2.size() <= 0 || (dVar = this.f21087I.get(0)) == null || !dVar.j()) {
                    a("big template webview is null");
                    return;
                }
                Context context = this.f21080B;
                if (this.f21099V == null) {
                    a("ChoiceOneCallback is null");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(com.anythink.expressad.video.dynview.a.a.f21242F, this.f21099V);
                com.anythink.expressad.video.dynview.b.a();
                com.anythink.expressad.video.dynview.b.a(context, this.f21087I, new AnonymousClass2(), hashMap);
                return;
            }
            com.anythink.expressad.video.signal.factory.b bVar = new com.anythink.expressad.video.signal.factory.b(this.f22304l, this, windVaneWebView2);
            registerJsFactory(bVar);
            this.f21105j.setApiManagerJSFactory(bVar);
            if (this.f21105j.getParent() != null) {
                a("preload template webview is null or load error");
                return;
            }
            if (this.f21105j.getObject() instanceof com.anythink.expressad.video.signal.a.j) {
                bVar.a((com.anythink.expressad.video.signal.a.j) this.f21105j.getObject());
                if (this.f21105j != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(com.anythink.expressad.foundation.g.a.cl, v.c(getContext()));
                    try {
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("name", this.f22309q.a());
                            jSONObject2.put("amount", this.f22309q.b());
                            jSONObject2.put("id", this.f22310r);
                            jSONObject.put("userId", this.f22308p);
                            jSONObject.put("reward", jSONObject2);
                            jSONObject.put("playVideoMute", this.f22311s);
                            jSONObject.put("extra", this.f21098U);
                        } catch (JSONException e6) {
                            e6.getMessage();
                        }
                    } catch (Exception e9) {
                        e9.getMessage();
                    }
                    this.f21090M = new com.anythink.expressad.video.bt.module.b.d(d(), "");
                    getJSNotifyProxy().a(jSONObject.toString());
                    getJSCommon().h();
                    getJSCommon().a(new a(this, b9));
                }
                ((com.anythink.expressad.video.signal.a.c) getJSCommon()).f21951s.a();
            }
            this.f21105j.setBackgroundColor(0);
            LinkedHashMap<String, View> b10 = com.anythink.expressad.video.bt.a.c.a().b(this.f22305m, this.f21093P);
            if (b10 == null || !b10.containsKey(this.f21085G)) {
                a("big template webviewLayout is null");
                return;
            }
            View view = b10.get(this.f21085G);
            if (view instanceof AnythinkBTLayout) {
                AnythinkBTLayout anythinkBTLayout = (AnythinkBTLayout) view;
                this.i = anythinkBTLayout;
                anythinkBTLayout.addView(this.f21105j, 0, new FrameLayout.LayoutParams(-1, -1));
                com.anythink.expressad.foundation.f.b.a().a(this.f22305m + "_1", new com.anythink.expressad.foundation.f.a() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTContainer.1
                    @Override // com.anythink.expressad.foundation.f.a
                    public final void a() {
                        String str2;
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            if (t.b().g() != null) {
                                jSONObject3.put("status", 1);
                            }
                            str2 = jSONObject3.toString();
                        } catch (Throwable th) {
                            String unused = AnythinkBTContainer.f21078e;
                            th.getMessage();
                            str2 = "";
                        }
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f21105j, BaseAbsFeedBackForH5.f18198b, i.n(2, str2));
                    }

                    @Override // com.anythink.expressad.foundation.f.a
                    public final void b() {
                        String str2;
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            if (t.b().g() != null) {
                                jSONObject3.put("status", 2);
                            }
                            str2 = jSONObject3.toString();
                        } catch (Throwable th) {
                            String unused = AnythinkBTContainer.f21078e;
                            th.getMessage();
                            str2 = "";
                        }
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f21105j, BaseAbsFeedBackForH5.f18198b, i.n(2, str2));
                    }

                    @Override // com.anythink.expressad.foundation.f.a
                    public final void c() {
                        String str2;
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            if (t.b().g() != null) {
                                jSONObject3.put("status", 2);
                            }
                            str2 = jSONObject3.toString();
                        } catch (Throwable th) {
                            String unused = AnythinkBTContainer.f21078e;
                            th.getMessage();
                            str2 = "";
                        }
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f21105j, BaseAbsFeedBackForH5.f18198b, i.n(2, str2));
                    }
                });
                com.anythink.expressad.foundation.f.b.a().c(this.f22305m + "_2");
                View b11 = com.anythink.expressad.foundation.f.b.a().b(this.f22305m + "_1");
                if (com.anythink.expressad.foundation.f.b.a().b() && b11 != null) {
                    try {
                        layoutParams = (RelativeLayout.LayoutParams) b11.getLayoutParams();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    if (layoutParams == null) {
                        layoutParams = new RelativeLayout.LayoutParams(com.anythink.expressad.foundation.f.b.f19205a, com.anythink.expressad.foundation.f.b.f19206b);
                    }
                    layoutParams.topMargin = v.b(t.b().g(), 10.0f);
                    layoutParams.leftMargin = v.b(t.b().g(), 10.0f);
                    b11.setLayoutParams(layoutParams);
                    ViewGroup viewGroup = (ViewGroup) b11.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(b11);
                    }
                    this.i.addView(b11);
                }
                this.i.setTag(this.f21085G);
                b10.put(this.f21085G, this.i);
                Iterator<View> it = b10.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    View next = it.next();
                    if (next instanceof AnythinkBTRootLayout) {
                        AnythinkBTRootLayout anythinkBTRootLayout = (AnythinkBTRootLayout) next;
                        this.f21092O = anythinkBTRootLayout.getInstanceId();
                        this.f21104h.addView(anythinkBTRootLayout, new FrameLayout.LayoutParams(-1, -1));
                        break;
                    }
                }
                b10.remove(this.f21092O);
                b10.put(this.f21092O, this);
            }
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.a(this.f22305m, this.f22311s);
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.a(this.f21085G, this.f21093P);
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.a(this.f21092O, this.f21093P);
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.a(this.f22305m + "_" + this.f21093P, this.f22304l);
            List<d> list3 = this.f21087I;
            if (list3 == null || list3.size() <= 0) {
                return;
            }
            a(this.f22307o, this.f21087I.get(0));
        } catch (Throwable th) {
            a("onCreate exception ".concat(String.valueOf(th)));
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onDestroy() {
        if (this.f21086H) {
            return;
        }
        this.f21086H = true;
        super.onDestroy();
        com.anythink.expressad.video.bt.a.c.a();
        com.anythink.expressad.video.bt.a.c.d(this.f22305m + "_" + this.f21093P);
        try {
            WindVaneWebView windVaneWebView = this.f21105j;
            if (windVaneWebView != null) {
                ViewGroup viewGroup = (ViewGroup) windVaneWebView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.f21105j.clearWebView();
                this.f21105j.release();
            }
            if (this.f21091N != null) {
                this.f21091N = null;
            }
            if (this.f21088K != null) {
                this.f21088K = null;
            }
            if (this.f21080B != null) {
                this.f21080B = null;
            }
            List<d> list = this.f21087I;
            if (list != null && list.size() > 0) {
                for (d dVar : this.f21087I) {
                    if (dVar != null && dVar.N() != null) {
                        com.anythink.expressad.videocommon.a.b(this.f22305m + "_" + dVar.aa() + "_" + dVar.N().e());
                    }
                }
                com.anythink.expressad.video.dynview.b.a.a().b();
            }
            com.anythink.expressad.video.bt.a.c.a().c(this.f22305m, this.f21093P);
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.f(this.f21085G);
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.g(this.f22305m);
            com.anythink.expressad.video.bt.a.c.a().b(this.f22305m, this.f21093P).remove(this.f21085G);
            com.anythink.expressad.video.bt.a.c.a().b(this.f22305m, this.f21093P).remove(this.f21092O);
            com.anythink.expressad.video.bt.a.c.a().b(this.f22305m, this.f21093P).clear();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onPause() {
        d dVar;
        com.anythink.expressad.video.dynview.e.a aVar;
        super.onPause();
        List<d> list = this.f21087I;
        if (list != null && list.size() > 0 && (dVar = this.f21087I.get(0)) != null && dVar.j() && (aVar = com.anythink.expressad.video.dynview.b.a.a().f21294a) != null) {
            aVar.b();
        }
        try {
            LinkedHashMap<String, View> b9 = com.anythink.expressad.video.bt.a.c.a().b(this.f22305m, this.f21093P);
            if (b9 == null || b9.size() <= 0) {
                return;
            }
            for (View view : b9.values()) {
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).onPause();
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onResume() {
        d dVar;
        com.anythink.expressad.video.dynview.e.a aVar;
        super.onResume();
        List<d> list = this.f21087I;
        if (list != null && list.size() > 0 && (dVar = this.f21087I.get(0)) != null && dVar.j() && (aVar = com.anythink.expressad.video.dynview.b.a.a().f21294a) != null) {
            aVar.a();
        }
        if (com.anythink.expressad.foundation.f.b.f19207c) {
            return;
        }
        try {
            LinkedHashMap<String, View> b9 = com.anythink.expressad.video.bt.a.c.a().b(this.f22305m, this.f21093P);
            if (b9 == null || b9.size() <= 0) {
                return;
            }
            for (View view : b9.values()) {
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).onResume(this.f21100W);
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public void onStop() {
        d dVar;
        super.onStop();
        List<d> list = this.f21087I;
        if (list != null && list.size() > 0 && (dVar = this.f21087I.get(0)) != null && dVar.j()) {
            com.anythink.expressad.video.dynview.b.a.a().b();
        }
        try {
            LinkedHashMap<String, View> b9 = com.anythink.expressad.video.bt.a.c.a().b(this.f22305m, this.f21093P);
            if (b9 == null || b9.size() <= 0) {
                return;
            }
            for (View view : b9.values()) {
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).onStop();
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.b
    public void reactDeveloper(Object obj, String str) {
        int i;
        if (this.f21088K == null || TextUtils.isEmpty(str)) {
            AbstractJSContainer.a(obj, "listener is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("type");
            int optInt2 = jSONObject.optInt("hit");
            String optString = jSONObject.optString("unitId", getUnitId());
            jSONObject.optString(com.anythink.expressad.a.f17800z, getPlacementId());
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            d dVar = this.f21087I.get(0);
            boolean z8 = true;
            if (optInt == 1) {
                boolean optBoolean = optJSONObject.optBoolean("expired");
                if (dVar != null) {
                    if (optBoolean) {
                        dVar.g(1);
                    } else {
                        dVar.g(0);
                    }
                }
                this.f21094Q = isNativeKilledCallback(dVar);
            }
            switch (optInt) {
                case 1:
                    this.f21088K.a();
                    break;
                case 2:
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("error");
                    String optString2 = optJSONObject2 != null ? optJSONObject2.optString(com.anythink.expressad.foundation.g.a.f19251q) : "";
                    if (TextUtils.isEmpty(optString2)) {
                        optString2 = optJSONObject.optString("error");
                    }
                    if (!this.f21094Q && optInt2 != this.f21095R) {
                        this.f21088K.a(optString2);
                        break;
                    }
                    break;
                case 3:
                    this.f21088K.b();
                    break;
                case 4:
                    this.f21088K.c();
                    break;
                case 5:
                    com.anythink.expressad.video.bt.module.a.a aVar = this.f21088K;
                    d dVar2 = this.f21101a;
                    if (dVar2 != null) {
                        dVar = dVar2;
                    }
                    aVar.a(dVar);
                    break;
                case 6:
                    if (optJSONObject.optInt("convert") != 1) {
                        z8 = false;
                    }
                    JSONObject optJSONObject3 = optJSONObject.optJSONObject("reward");
                    d b9 = d.b(optJSONObject.optJSONObject("campaign"));
                    com.anythink.expressad.videocommon.c.c a9 = com.anythink.expressad.videocommon.c.c.a(optJSONObject3);
                    if (a9 == null) {
                        a9 = this.f22309q;
                    }
                    String optString3 = optJSONObject.optString("extra");
                    if (!TextUtils.isEmpty(optString3)) {
                        this.f21098U = optString3;
                    }
                    if (!this.f21094Q && optInt2 != this.f21095R) {
                        if (this.f22312t && ((i = this.f22314v) == com.anythink.expressad.foundation.g.a.cv || i == com.anythink.expressad.foundation.g.a.cw)) {
                            this.f21088K.a(this.f21096S, this.f21097T);
                        }
                        if (!z8) {
                            a9.a(0);
                        }
                        this.f21088K.a(z8, a9);
                        if (!this.f22312t && z8) {
                            if (b9 == null) {
                                com.anythink.expressad.video.module.b.a.a(dVar, a9, optString, this.f22308p, this.f21098U);
                                break;
                            } else {
                                com.anythink.expressad.video.module.b.a.a(b9, a9, optString, this.f22308p, this.f21098U);
                                break;
                            }
                        }
                    }
                    break;
            }
            a(obj);
        } catch (JSONException e6) {
            AbstractJSContainer.a(obj, e6.getMessage());
            e6.getMessage();
        }
    }

    @Override // com.anythink.expressad.video.signal.b
    public void reportUrls(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int optInt = jSONObject.optInt("type");
                String optString = jSONObject.optString("url");
                StringBuilder sb = new StringBuilder();
                sb.append(n.k());
                String a9 = v.a(optString, "&tun=", sb.toString());
                int optInt2 = jSONObject.optInt("report");
                boolean z8 = true;
                if (optInt2 == 0) {
                    Context g9 = t.b().g();
                    List<d> list = this.f21087I;
                    d dVar = list != null ? list.get(0) : null;
                    if (optInt == 0) {
                        z8 = false;
                    }
                    com.anythink.expressad.b.a.a(g9, dVar, "", a9, z8);
                } else {
                    Context g10 = t.b().g();
                    List<d> list2 = this.f21087I;
                    com.anythink.expressad.b.a.a(g10, list2 != null ? list2.get(0) : null, "", a9, false, optInt != 0, optInt2);
                }
            }
            com.anythink.expressad.atsignalcommon.windvane.h.a().a(obj, Base64.encodeToString("".getBytes(), 2));
        } catch (Throwable unused) {
        }
    }

    public void setBTContainerCallback(com.anythink.expressad.video.bt.module.a.a aVar) {
        this.f21088K = aVar;
    }

    public void setCampaignDownLoadTasks(List<com.anythink.expressad.videocommon.b.c> list) {
        this.J = list;
    }

    public void setCampaigns(List<d> list) {
        this.f21087I = list;
    }

    public void setChoiceOneCallback(com.anythink.expressad.video.dynview.f.d dVar) {
        this.f21099V = dVar;
    }

    public void setDeveloperExtraData(String str) {
        this.f21098U = str;
    }

    public void setJSFactory(com.anythink.expressad.video.signal.factory.b bVar) {
        this.f22318z = bVar;
    }

    public void setNotchPadding(int i, int i4, int i9, int i10, int i11) {
        TextView textView;
        FrameLayout.LayoutParams layoutParams;
        int i12 = i11;
        try {
            String a9 = com.anythink.expressad.foundation.h.i.a(i, i4, i9, i10, i11);
            WindVaneWebView windVaneWebView = this.f21105j;
            if (windVaneWebView != null && (windVaneWebView.getObject() instanceof com.anythink.expressad.video.signal.a.j) && !TextUtils.isEmpty(a9)) {
                ((com.anythink.expressad.video.signal.a.j) this.f21105j.getObject()).b(a9);
                com.anythink.expressad.atsignalcommon.windvane.h.a();
                com.anythink.core.express.d.a.a((WebView) this.f21105j, "oncutoutfetched", Base64.encodeToString(a9.getBytes(), 0));
            }
            List<d> list = this.f21087I;
            if (list != null && list.size() > 0) {
                try {
                    if (this.f21087I.get(0).j() && (textView = this.f21081C) != null && (layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams()) != null) {
                        if (i4 > 0) {
                            layoutParams.leftMargin = i4;
                        }
                        if (i9 > 0) {
                            layoutParams.rightMargin = i9;
                        }
                        if (i10 > 0) {
                            layoutParams.topMargin = i10;
                        }
                        if (i12 > 0) {
                            layoutParams.bottomMargin = i12;
                        }
                        this.f21081C.setLayoutParams(layoutParams);
                        if (this.f21082D != null) {
                            try {
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.f21082D.getLayoutParams());
                                layoutParams2.leftMargin = layoutParams.rightMargin;
                                layoutParams2.topMargin = layoutParams.topMargin;
                                this.f21082D.setLayoutParams(layoutParams2);
                            } catch (Exception e6) {
                                e6.printStackTrace();
                            }
                        }
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            com.anythink.expressad.video.bt.a.c.a();
            com.anythink.expressad.video.bt.a.c.a(i, i4, i9, i10, i11);
            LinkedHashMap<String, View> b9 = com.anythink.expressad.video.bt.a.c.a().b(this.f22305m, this.f21093P);
            if (b9 == null || b9.size() <= 0) {
                return;
            }
            for (View view : b9.values()) {
                if (view instanceof AnythinkBTVideoView) {
                    ((AnythinkBTVideoView) view).setNotchPadding(i4, i9, i10, i12);
                }
                if (view instanceof ATTempContainer) {
                    ((ATTempContainer) view).setNotchPadding(i, i4, i9, i10, i12);
                }
                if ((view instanceof WindVaneWebView) && !TextUtils.isEmpty(a9)) {
                    com.anythink.expressad.atsignalcommon.windvane.h.a().a(view, "oncutoutfetched", Base64.encodeToString(a9.getBytes(), 0));
                }
                i12 = i11;
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public void setShowRewardVideoListener(h hVar) {
        this.f21089L = hVar;
    }

    public void setSoundListener(com.anythink.expressad.video.a.a aVar) {
        this.f21100W = aVar;
    }

    private WindVaneWebView b(String str) {
        a.C0141a a9 = com.anythink.expressad.videocommon.a.a(str);
        if (a9 == null) {
            return null;
        }
        this.f21085G = a9.b();
        a9.a("");
        return a9.a();
    }

    private com.anythink.expressad.video.bt.module.a.b d() {
        if (this.f21091N == null) {
            this.f21091N = new com.anythink.expressad.video.bt.module.a.b() { // from class: com.anythink.expressad.video.bt.module.AnythinkBTContainer.3
                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a() {
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void b(String str) {
                    if (AnythinkBTContainer.this.f21105j != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("convert", true);
                            jSONObject2.put(com.anythink.expressad.a.f17800z, ((AbstractJSContainer) AnythinkBTContainer.this).f22306n);
                            jSONObject2.put("unitId", ((AbstractJSContainer) AnythinkBTContainer.this).f22305m);
                            jSONObject.put("data", jSONObject2);
                            String unused = AnythinkBTContainer.f21078e;
                            jSONObject.toString();
                        } catch (JSONException e6) {
                            String unused2 = AnythinkBTContainer.f21078e;
                            e6.getMessage();
                        }
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f21105j, "onSubPlayTemplateViewPlayCompleted", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void c(String str) {
                    if (AnythinkBTContainer.this.f21105j != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(com.anythink.expressad.a.f17800z, ((AbstractJSContainer) AnythinkBTContainer.this).f22306n);
                            jSONObject2.put("unitId", ((AbstractJSContainer) AnythinkBTContainer.this).f22305m);
                            jSONObject.put("data", jSONObject2);
                            String unused = AnythinkBTContainer.f21078e;
                            jSONObject.toString();
                        } catch (JSONException e6) {
                            String unused2 = AnythinkBTContainer.f21078e;
                            e6.getMessage();
                        }
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f21105j, "onSubPlayTemplateViewEndcardShowSuccess", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a(String str) {
                    if (AnythinkBTContainer.this.f21105j != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(com.anythink.expressad.a.f17800z, ((AbstractJSContainer) AnythinkBTContainer.this).f22306n);
                            jSONObject2.put("unitId", ((AbstractJSContainer) AnythinkBTContainer.this).f22305m);
                            jSONObject.put("data", jSONObject2);
                            String unused = AnythinkBTContainer.f21078e;
                            jSONObject.toString();
                        } catch (JSONException e6) {
                            String unused2 = AnythinkBTContainer.f21078e;
                            e6.getMessage();
                        }
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f21105j, "onSubPlayTemplateViewPlayStart", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a(String str, boolean z8, com.anythink.expressad.videocommon.c.c cVar) {
                    if (AnythinkBTContainer.this.f21105j != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            if (cVar != null) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("name", cVar.a());
                                jSONObject3.put("amount", cVar.b());
                                jSONObject2.put("reward", jSONObject3);
                            }
                            jSONObject2.put("isComplete", z8);
                            jSONObject2.put("convert", z8 ? 1 : 2);
                            jSONObject.put("data", jSONObject2);
                            String unused = AnythinkBTContainer.f21078e;
                            jSONObject.toString();
                        } catch (JSONException e6) {
                            String unused2 = AnythinkBTContainer.f21078e;
                            e6.getMessage();
                        }
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f21105j, "onSubPlayTemplateViewCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f21105j, "onSubPlayTemplateViewDismissed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a(boolean z8, int i) {
                    AnythinkBTContainer.this.f21096S = z8;
                    AnythinkBTContainer.this.f21097T = i;
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a(String str, String str2) {
                    if (AnythinkBTContainer.this.f21105j != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(com.anythink.expressad.a.f17800z, ((AbstractJSContainer) AnythinkBTContainer.this).f22306n);
                            jSONObject2.put("unitId", ((AbstractJSContainer) AnythinkBTContainer.this).f22305m);
                            jSONObject2.put("error", str2);
                            jSONObject.put("data", jSONObject2);
                            String unused = AnythinkBTContainer.f21078e;
                            jSONObject.toString();
                        } catch (JSONException e6) {
                            String unused2 = AnythinkBTContainer.f21078e;
                            e6.getMessage();
                        }
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f21105j, "onSubPlayTemplateViewPlayFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                @Override // com.anythink.expressad.video.bt.module.a.b
                public final void a(String str, d dVar) {
                    AnythinkBTContainer anythinkBTContainer = AnythinkBTContainer.this;
                    anythinkBTContainer.f21101a = dVar;
                    if (anythinkBTContainer.f21105j != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(com.anythink.expressad.a.f17800z, ((AbstractJSContainer) AnythinkBTContainer.this).f22306n);
                            jSONObject2.put("unitId", ((AbstractJSContainer) AnythinkBTContainer.this).f22305m);
                            jSONObject.put("data", jSONObject2);
                            String unused = AnythinkBTContainer.f21078e;
                            jSONObject.toString();
                        } catch (JSONException e6) {
                            String unused2 = AnythinkBTContainer.f21078e;
                            e6.getMessage();
                        }
                        com.anythink.expressad.atsignalcommon.windvane.h.a();
                        com.anythink.core.express.d.a.a((WebView) AnythinkBTContainer.this.f21105j, "onSubPlayTemplateViewClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }
            };
        }
        return this.f21091N;
    }

    private boolean h() {
        try {
            com.anythink.expressad.videocommon.e.d dVar = this.f22307o;
            if (dVar == null) {
                return false;
            }
            double L8 = dVar.L();
            if (L8 == 1.0d) {
                return false;
            }
            return new Random().nextDouble() > L8;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static void i() {
        u.b();
    }

    private com.anythink.expressad.videocommon.b.c d(d dVar) {
        List<com.anythink.expressad.videocommon.b.c> list = this.J;
        if (list == null || dVar == null) {
            return null;
        }
        for (com.anythink.expressad.videocommon.b.c cVar : list) {
            if (cVar.n().bh().equals(dVar.bh())) {
                return cVar;
            }
        }
        return null;
    }

    private void a(Context context) {
        if (this.f21099V == null) {
            a("ChoiceOneCallback is null");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.anythink.expressad.video.dynview.a.a.f21242F, this.f21099V);
        com.anythink.expressad.video.dynview.b.a();
        com.anythink.expressad.video.dynview.b.a(context, this.f21087I, new AnonymousClass2(), hashMap);
    }

    public AnythinkBTContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21102f = 0;
        this.f21103g = 1;
        this.f21083E = false;
        this.f21084F = true;
        this.f21086H = false;
        this.f21095R = 1;
        init(context);
    }

    @Override // com.anythink.expressad.video.signal.container.AbstractJSContainer
    public final void a(String str) {
        h hVar = this.f21089L;
        if (hVar != null) {
            hVar.a(str);
        }
        super.a(str);
    }

    public final void a(d dVar) {
        if (dVar != null) {
            try {
                List<String> d2 = dVar.d();
                if (d2 == null || d2.size() <= 0) {
                    return;
                }
                Iterator<String> it = d2.iterator();
                while (it.hasNext()) {
                    com.anythink.expressad.b.a.a(t.b().g(), dVar, this.f22305m, it.next(), true);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    private boolean a(boolean z8) {
        com.anythink.expressad.videocommon.e.d dVar;
        try {
            dVar = this.f22307o;
        } catch (Throwable unused) {
        }
        if (dVar == null) {
            return false;
        }
        int K8 = dVar.K();
        if (K8 == 1) {
            return z8;
        }
        if (K8 == 2) {
            return z8 && h();
        }
        if (K8 != 3) {
            return false;
        }
        return h();
    }

    private void a(int i, int i4, int i9, int i10) {
        TextView textView;
        FrameLayout.LayoutParams layoutParams;
        List<d> list = this.f21087I;
        if (list == null || list.size() <= 0) {
            return;
        }
        try {
            if (this.f21087I.get(0).j() && (textView = this.f21081C) != null && (layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams()) != null) {
                if (i > 0) {
                    layoutParams.leftMargin = i;
                }
                if (i9 > 0) {
                    layoutParams.rightMargin = i9;
                }
                if (i4 > 0) {
                    layoutParams.topMargin = i4;
                }
                if (i10 > 0) {
                    layoutParams.bottomMargin = i10;
                }
                this.f21081C.setLayoutParams(layoutParams);
                if (this.f21082D != null) {
                    try {
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.f21082D.getLayoutParams());
                        layoutParams2.leftMargin = layoutParams.rightMargin;
                        layoutParams2.topMargin = layoutParams.topMargin;
                        this.f21082D.setLayoutParams(layoutParams2);
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* renamed from: com.anythink.expressad.video.bt.module.AnythinkBTContainer$2, reason: invalid class name */
    public class AnonymousClass2 implements com.anythink.expressad.video.dynview.f.h {
        public AnonymousClass2() {
        }

        @Override // com.anythink.expressad.video.dynview.f.h
        public final void a(com.anythink.expressad.video.dynview.a aVar) {
            d dVar;
            String sb;
            if (AnythinkBTContainer.this.f21104h == null || aVar.a() == null) {
                AnythinkBTContainer.this.a("nativeview is null");
                return;
            }
            AnythinkBTContainer.this.f21104h.removeAllViews();
            AnythinkBTContainer.this.f21104h.addView(aVar.a());
            AnythinkBTContainer anythinkBTContainer = AnythinkBTContainer.this;
            anythinkBTContainer.f21081C = (TextView) anythinkBTContainer.findViewById(anythinkBTContainer.findID("anythink_choice_one_countdown_tv"));
            AnythinkBTContainer anythinkBTContainer2 = AnythinkBTContainer.this;
            anythinkBTContainer2.f21082D = (ImageView) anythinkBTContainer2.findViewById(anythinkBTContainer2.findID("anythink_iv_link"));
            if (AnythinkBTContainer.this.f21088K != null) {
                AnythinkBTContainer.this.f21088K.a();
            }
            if (AnythinkBTContainer.this.f21087I == null || AnythinkBTContainer.this.f21087I.size() <= 0 || (dVar = (d) AnythinkBTContainer.this.f21087I.get(0)) == null) {
                return;
            }
            String ak = dVar.ak();
            com.anythink.expressad.videocommon.e.d a9 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), ((AbstractJSContainer) AnythinkBTContainer.this).f22305m);
            int M8 = a9 != null ? a9.M() : 1;
            if (dVar.n() == 1) {
                StringBuilder c4 = AbstractC5088e.c(ak, "&to=1&cbt=");
                c4.append(dVar.aB());
                c4.append("&tmorl=");
                c4.append(M8);
                sb = c4.toString();
            } else {
                StringBuilder c9 = AbstractC5088e.c(ak, "&to=0&cbt=");
                c9.append(dVar.aB());
                c9.append("&tmorl=");
                c9.append(M8);
                sb = c9.toString();
            }
            com.anythink.expressad.b.a.a(t.b().g(), dVar, ((AbstractJSContainer) AnythinkBTContainer.this).f22305m, sb, false, true, com.anythink.expressad.b.b.a.f18315j);
            f.f19284h.put(dVar.ak(), Long.valueOf(System.currentTimeMillis()));
            AnythinkBTContainer.this.a(dVar);
        }

        @Override // com.anythink.expressad.video.dynview.f.h
        public final void a(com.anythink.expressad.video.dynview.c.b bVar) {
            String str;
            if (bVar != null) {
                str = "errorCode:" + bVar.a() + "Msg:" + bVar.b();
            } else {
                str = "";
            }
            AnythinkBTContainer.this.a("nativeview is null".concat(String.valueOf(str)));
        }
    }
}
