package com.anythink.expressad.advanced.c;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.anythink.basead.b.c.i;
import com.anythink.core.common.d.t;
import com.anythink.expressad.advanced.js.NativeAdvancedJSBridgeImpl;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.anythink.expressad.advanced.view.ATNativeAdvancedView;
import com.anythink.expressad.advanced.view.ATNativeAdvancedWebview;
import com.anythink.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.aa;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.l;
import com.anythink.expressad.foundation.h.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    protected com.anythink.expressad.foundation.d.d f17891a;

    /* renamed from: b, reason: collision with root package name */
    protected ATNativeAdvancedView f17892b;

    /* renamed from: c, reason: collision with root package name */
    protected com.anythink.expressad.advanced.d.d f17893c;

    /* renamed from: d, reason: collision with root package name */
    protected com.anythink.expressad.b.a f17894d;

    /* renamed from: e, reason: collision with root package name */
    protected String f17895e;

    /* renamed from: h, reason: collision with root package name */
    private com.anythink.expressad.advanced.d.c f17898h;
    private boolean i;

    /* renamed from: k, reason: collision with root package name */
    private ImageView f17900k;

    /* renamed from: l, reason: collision with root package name */
    private String f17901l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f17902m;

    /* renamed from: g, reason: collision with root package name */
    private String f17897g = "NativeAdvancedShowManager";

    /* renamed from: j, reason: collision with root package name */
    private int f17899j = -1;

    /* renamed from: n, reason: collision with root package name */
    private View.OnClickListener f17903n = new View.OnClickListener() { // from class: com.anythink.expressad.advanced.c.a.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (a.this.i) {
                a.b(a.this);
            }
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public Handler f17896f = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.advanced.c.a.2
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            com.anythink.expressad.foundation.d.d dVar;
            ATNativeAdvancedView aTNativeAdvancedView;
            super.handleMessage(message);
            if (message.what == 2 && (dVar = a.this.f17891a) != null && dVar.aA() && (aTNativeAdvancedView = a.this.f17892b) != null) {
                aTNativeAdvancedView.getAdvancedNativeWebview();
            }
        }
    };

    /* renamed from: o, reason: collision with root package name */
    private com.anythink.expressad.advanced.d.a f17904o = new com.anythink.expressad.advanced.d.a() { // from class: com.anythink.expressad.advanced.c.a.3
        @Override // com.anythink.expressad.advanced.d.a
        public final void a(int i) {
            a.this.f17899j = i;
            ATNativeAdvancedView aTNativeAdvancedView = a.this.f17892b;
            if (aTNativeAdvancedView != null) {
                aTNativeAdvancedView.changeCloseBtnState(i);
            }
        }

        @Override // com.anythink.expressad.advanced.d.a
        public final void b() {
        }

        @Override // com.anythink.expressad.advanced.d.a
        public final void c() {
            String unused = a.this.f17897g;
        }

        @Override // com.anythink.expressad.advanced.d.a
        public final void d() {
        }

        @Override // com.anythink.expressad.advanced.d.a
        public final void e() {
            a.b(a.this);
        }

        @Override // com.anythink.expressad.advanced.d.a
        public final void a() {
            ATNativeAdvancedView aTNativeAdvancedView = a.this.f17892b;
            if (aTNativeAdvancedView != null) {
                aTNativeAdvancedView.setVisibility(8);
            }
            a.b(a.this);
        }

        @Override // com.anythink.expressad.advanced.d.a
        public final void a(com.anythink.expressad.foundation.d.d dVar) {
            a.this.a(dVar);
        }

        @Override // com.anythink.expressad.advanced.d.a
        public final void a(boolean z8) {
            a aVar = a.this;
            if (aVar.f17893c != null) {
                aVar.f17902m = z8;
            }
        }

        @Override // com.anythink.expressad.advanced.d.a
        public final void a(String str) {
            try {
                if (a.this.f17893c != null) {
                    if (TextUtils.isEmpty(str)) {
                        a aVar = a.this;
                        aVar.f17893c.a(aVar.f17891a);
                    } else {
                        com.anythink.expressad.foundation.d.d b9 = com.anythink.expressad.foundation.d.d.b(com.anythink.expressad.foundation.d.d.a(a.this.f17891a));
                        b9.p(str);
                        a.this.a(b9);
                    }
                }
            } catch (Exception e6) {
                String unused = a.this.f17897g;
                e6.getMessage();
            }
        }
    };

    public a(Context context, String str, String str2) {
        this.f17895e = str2;
        this.f17901l = str;
        if (this.f17900k == null) {
            ImageView imageView = new ImageView(context);
            this.f17900k = imageView;
            imageView.setPadding(v.b(context, 2.0f), v.b(context, 2.0f), v.b(context, 2.0f), v.b(context, 2.0f));
            Context g9 = t.b().g();
            this.f17900k.setScaleType(ImageView.ScaleType.FIT_XY);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f17900k.getLayoutParams();
            this.f17900k.setLayoutParams(layoutParams == null ? new RelativeLayout.LayoutParams(v.b(g9, 29.0f), v.b(g9, 16.0f)) : layoutParams);
            this.f17900k.setImageResource(k.a(g9, "anythink_native_advanced_close_icon", k.f19790c));
        }
    }

    private void f() {
        Context g9 = t.b().g();
        this.f17900k.setScaleType(ImageView.ScaleType.FIT_XY);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f17900k.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(v.b(g9, 29.0f), v.b(g9, 16.0f));
        }
        this.f17900k.setLayoutParams(layoutParams);
        this.f17900k.setImageResource(k.a(g9, "anythink_native_advanced_close_icon", k.f19790c));
    }

    private String g() {
        ArrayList arrayList = new ArrayList();
        com.anythink.expressad.foundation.d.d dVar = this.f17891a;
        if (dVar != null) {
            arrayList.add(dVar);
        }
        return l.a(arrayList);
    }

    private void h() {
        if (this.f17891a.W()) {
            return;
        }
        this.f17891a.c(true);
        com.anythink.expressad.foundation.d.d dVar = this.f17891a;
        if (!dVar.t()) {
            Context g9 = t.b().g();
            String str = this.f17895e;
            com.anythink.expressad.foundation.b.a.c().b(g9);
            if (!TextUtils.isEmpty(dVar.ai())) {
                com.anythink.expressad.b.a.a(g9, dVar, str, dVar.ai(), false, true, com.anythink.expressad.b.b.a.i);
            }
            if (!TextUtils.isEmpty(str) && dVar.M() != null && dVar.M().o() != null) {
                com.anythink.expressad.b.a.a(g9, dVar, str, dVar.M().o(), false);
            }
            dVar.c(true);
            f.a(this.f17895e, dVar, f.f19283g);
            b(dVar, t.b().g(), this.f17895e);
            a(dVar, t.b().g(), this.f17895e);
        }
        com.anythink.expressad.advanced.d.d dVar2 = this.f17893c;
        if (dVar2 != null) {
            dVar2.a();
        }
    }

    private static void i() {
    }

    private void j() {
        com.anythink.expressad.advanced.d.d dVar = this.f17893c;
        if (dVar != null) {
            dVar.c();
            this.f17893c = null;
        }
    }

    private static /* synthetic */ void k() {
    }

    public void a(com.anythink.expressad.foundation.d.d dVar) {
    }

    public final com.anythink.expressad.advanced.d.a b() {
        return this.f17904o;
    }

    public final void d() {
        ATNativeAdvancedWebview advancedNativeWebview;
        if (this.f17892b == null || com.anythink.expressad.foundation.f.b.f19207c || (advancedNativeWebview = this.f17892b.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestroyed()) {
            return;
        }
        NativeAdvancedJsUtils.sendEventToH5(advancedNativeWebview, NativeAdvancedJsUtils.f18051b, "");
    }

    public final void e() {
        ATNativeAdvancedWebview advancedNativeWebview;
        ATNativeAdvancedView aTNativeAdvancedView = this.f17892b;
        if (aTNativeAdvancedView == null || (advancedNativeWebview = aTNativeAdvancedView.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestroyed()) {
            return;
        }
        h.a();
        com.anythink.core.express.d.a.a((WebView) advancedNativeWebview, NativeAdvancedJsUtils.f18050a, "");
    }

    private void b(com.anythink.expressad.foundation.d.d dVar) {
        com.anythink.expressad.foundation.d.d dVar2;
        if (dVar.t()) {
            return;
        }
        Context g9 = t.b().g();
        String str = this.f17895e;
        com.anythink.expressad.foundation.b.a.c().b(g9);
        if (TextUtils.isEmpty(dVar.ai())) {
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            com.anythink.expressad.b.a.a(g9, dVar2, str, dVar.ai(), false, true, com.anythink.expressad.b.b.a.i);
        }
        if (!TextUtils.isEmpty(str) && dVar2.M() != null && dVar2.M().o() != null) {
            com.anythink.expressad.b.a.a(g9, dVar2, str, dVar2.M().o(), false);
        }
        dVar2.c(true);
        f.a(this.f17895e, dVar2, f.f19283g);
        b(dVar2, t.b().g(), this.f17895e);
        a(dVar2, t.b().g(), this.f17895e);
    }

    private static void c(com.anythink.expressad.foundation.d.d dVar, Context context, String str) {
        com.anythink.expressad.foundation.d.d dVar2;
        Context context2;
        String str2;
        com.anythink.expressad.foundation.b.a.c().b(context);
        if (TextUtils.isEmpty(dVar.ai())) {
            dVar2 = dVar;
            context2 = context;
            str2 = str;
        } else {
            dVar2 = dVar;
            context2 = context;
            str2 = str;
            com.anythink.expressad.b.a.a(context2, dVar2, str2, dVar.ai(), false, true, com.anythink.expressad.b.b.a.i);
        }
        if (TextUtils.isEmpty(str2) || dVar2.M() == null || dVar2.M().o() == null) {
            return;
        }
        com.anythink.expressad.b.a.a(context2, dVar2, str2, dVar2.M().o(), false);
    }

    public final void a(com.anythink.expressad.advanced.d.c cVar) {
        this.f17898h = cVar;
    }

    public final void a(com.anythink.expressad.advanced.d.d dVar) {
        this.f17893c = dVar;
    }

    public final String a() {
        com.anythink.expressad.foundation.d.d dVar = this.f17891a;
        if (dVar != null && dVar.aa() != null) {
            return this.f17891a.aa();
        }
        return "";
    }

    public final void c() {
        if (this.f17893c != null) {
            this.f17893c = null;
        }
        if (this.f17904o != null) {
            this.f17904o = null;
        }
        if (this.f17903n != null) {
            this.f17903n = null;
        }
        ATNativeAdvancedView aTNativeAdvancedView = this.f17892b;
        if (aTNativeAdvancedView != null) {
            aTNativeAdvancedView.destroy();
        }
        if (this.f17898h != null) {
            this.f17898h = null;
        }
        com.anythink.expressad.foundation.f.b.a().c(this.f17895e);
    }

    public final void a(final com.anythink.expressad.foundation.d.d dVar, final ATNativeAdvancedView aTNativeAdvancedView, boolean z8) {
        View b9;
        RelativeLayout.LayoutParams layoutParams;
        if (aTNativeAdvancedView == null) {
            return;
        }
        com.anythink.expressad.foundation.f.b.a().a(this.f17895e, new com.anythink.expressad.foundation.f.a() { // from class: com.anythink.expressad.advanced.c.a.4
            @Override // com.anythink.expressad.foundation.f.a
            public final void a() {
                String str;
                a.this.e();
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (t.b().g() != null) {
                        jSONObject.put("status", 1);
                    }
                    str = jSONObject.toString();
                } catch (Throwable th) {
                    String unused = a.this.f17897g;
                    th.getMessage();
                    str = "";
                }
                com.anythink.core.express.d.a.a((WebView) aTNativeAdvancedView.getAdvancedNativeWebview(), BaseAbsFeedBackForH5.f18198b, i.n(2, str));
            }

            @Override // com.anythink.expressad.foundation.f.a
            public final void b() {
                String str;
                a.this.d();
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (t.b().g() != null) {
                        jSONObject.put("status", 2);
                    }
                    str = jSONObject.toString();
                } catch (Throwable th) {
                    String unused = a.this.f17897g;
                    th.getMessage();
                    str = "";
                }
                com.anythink.core.express.d.a.a((WebView) aTNativeAdvancedView.getAdvancedNativeWebview(), BaseAbsFeedBackForH5.f18198b, i.n(2, str));
            }

            @Override // com.anythink.expressad.foundation.f.a
            public final void c() {
                String str;
                a.this.d();
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (t.b().g() != null) {
                        jSONObject.put("status", 2);
                    }
                    str = jSONObject.toString();
                } catch (Throwable th) {
                    String unused = a.this.f17897g;
                    th.getMessage();
                    str = "";
                }
                com.anythink.core.express.d.a.a((WebView) aTNativeAdvancedView.getAdvancedNativeWebview(), BaseAbsFeedBackForH5.f18198b, i.n(2, str));
            }
        });
        if (dVar.I() && com.anythink.expressad.foundation.f.b.a().b() && (b9 = com.anythink.expressad.foundation.f.b.a().b(this.f17895e)) != null) {
            try {
                layoutParams = (RelativeLayout.LayoutParams) b9.getLayoutParams();
            } catch (Exception e6) {
                e6.printStackTrace();
                layoutParams = null;
            }
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(com.anythink.expressad.foundation.f.b.f19205a, com.anythink.expressad.foundation.f.b.f19206b);
            }
            layoutParams.addRule(12);
            ViewGroup viewGroup = (ViewGroup) b9.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(b9);
            }
            aTNativeAdvancedView.addView(b9, layoutParams);
        }
        this.i = this.i;
        this.f17891a = dVar;
        this.f17892b = aTNativeAdvancedView;
        NativeAdvancedJSBridgeImpl advancedNativeJSBridgeImpl = aTNativeAdvancedView.getAdvancedNativeJSBridgeImpl();
        NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl = advancedNativeJSBridgeImpl;
        if (advancedNativeJSBridgeImpl == null) {
            NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl2 = new NativeAdvancedJSBridgeImpl(aTNativeAdvancedView.getContext(), this.f17901l, this.f17895e);
            ArrayList arrayList = new ArrayList();
            arrayList.add(dVar);
            nativeAdvancedJSBridgeImpl2.setCampaignList(arrayList);
            nativeAdvancedJSBridgeImpl = nativeAdvancedJSBridgeImpl2;
        }
        nativeAdvancedJSBridgeImpl.setAllowSkip(this.i ? 1 : 0);
        nativeAdvancedJSBridgeImpl.setNativeAdvancedBridgeListener(this.f17904o);
        aTNativeAdvancedView.setAdvancedNativeJSBridgeImpl(nativeAdvancedJSBridgeImpl);
        if (dVar.t() || !this.i) {
            this.f17900k.setVisibility(8);
        }
        ImageView imageView = this.f17900k;
        if (imageView != null) {
            imageView.setOnClickListener(this.f17903n);
        }
        aTNativeAdvancedView.setCloseView(this.f17900k);
        if (aTNativeAdvancedView.getVisibility() != 0) {
            aTNativeAdvancedView.setVisibility(0);
        }
        boolean a9 = aa.a(aTNativeAdvancedView.getAdvancedNativeWebview(), 0);
        com.anythink.expressad.advanced.d.c cVar = this.f17898h;
        if (cVar == null || a9 || cVar.c() == null || this.f17898h.c().getAlpha() < 0.5f || this.f17898h.c().getVisibility() != 0 || this.f17902m) {
            if (z8) {
                aTNativeAdvancedView.postDelayed(new Runnable() { // from class: com.anythink.expressad.advanced.c.a.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.a(dVar, aTNativeAdvancedView, false);
                    }
                }, 200L);
                return;
            }
            return;
        }
        aTNativeAdvancedView.show();
        com.anythink.expressad.foundation.b.a.c().b(aTNativeAdvancedView.getContext());
        dVar.l(this.f17895e);
        com.anythink.expressad.foundation.f.b.a().a(this.f17895e, dVar);
        com.anythink.expressad.foundation.d.d dVar2 = this.f17891a;
        if (dVar2 != null && dVar2.aA()) {
            aTNativeAdvancedView.getAdvancedNativeWebview();
            try {
                com.anythink.expressad.advanced.a.a.c(dVar.aa());
            } catch (Throwable th) {
                th.getMessage();
                com.anythink.expressad.foundation.d.d dVar3 = this.f17891a;
                if (dVar3 != null) {
                    dVar3.aa();
                    this.f17891a.ac();
                    this.f17891a.bh();
                }
            }
        }
        if (!this.f17891a.W()) {
            this.f17891a.c(true);
            com.anythink.expressad.foundation.d.d dVar4 = this.f17891a;
            if (!dVar4.t()) {
                Context g9 = t.b().g();
                String str = this.f17895e;
                com.anythink.expressad.foundation.b.a.c().b(g9);
                if (!TextUtils.isEmpty(dVar4.ai())) {
                    com.anythink.expressad.b.a.a(g9, dVar4, str, dVar4.ai(), false, true, com.anythink.expressad.b.b.a.i);
                }
                if (!TextUtils.isEmpty(str) && dVar4.M() != null && dVar4.M().o() != null) {
                    com.anythink.expressad.b.a.a(g9, dVar4, str, dVar4.M().o(), false);
                }
                dVar4.c(true);
                f.a(this.f17895e, dVar4, f.f19283g);
                b(dVar4, t.b().g(), this.f17895e);
                a(dVar4, t.b().g(), this.f17895e);
            }
            com.anythink.expressad.advanced.d.d dVar5 = this.f17893c;
            if (dVar5 != null) {
                dVar5.a();
            }
        }
        int i = this.f17899j;
        if (i != -1) {
            aTNativeAdvancedView.changeCloseBtnState(i);
        }
        com.anythink.expressad.advanced.a.a.c(dVar.aa());
        this.f17896f.sendEmptyMessageDelayed(2, 1000L);
    }

    private static void b(com.anythink.expressad.foundation.d.d dVar, Context context, String str) {
        if (dVar != null) {
            try {
                if (TextUtils.isEmpty(dVar.ak())) {
                    return;
                }
                com.anythink.expressad.b.a.a(context, dVar, str, dVar.ak(), false, true, com.anythink.expressad.b.b.a.f18315j);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    public static /* synthetic */ void b(a aVar) {
        com.anythink.expressad.advanced.d.d dVar = aVar.f17893c;
        if (dVar != null) {
            dVar.c();
            aVar.f17893c = null;
        }
    }

    public final void a(boolean z8) {
        this.i = z8;
    }

    private void a(View view) {
        if (view != null) {
            view.setOnClickListener(this.f17903n);
        }
    }

    private static void a(com.anythink.expressad.foundation.d.d dVar, Context context, String str) {
        if (dVar != null) {
            try {
                List<String> d2 = dVar.d();
                if (d2 == null || d2.size() <= 0) {
                    return;
                }
                Iterator<String> it = d2.iterator();
                while (it.hasNext()) {
                    com.anythink.expressad.b.a.a(context, dVar, str, it.next(), true);
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }
}
