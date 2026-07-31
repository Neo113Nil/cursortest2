package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class co1 {

    /* renamed from: a, reason: collision with root package name */
    private final et1 f3902a;

    /* renamed from: b, reason: collision with root package name */
    private final rr1 f3903b;

    /* renamed from: c, reason: collision with root package name */
    private final l31 f3904c;

    /* renamed from: d, reason: collision with root package name */
    private final zm1 f3905d;

    public co1(et1 et1Var, rr1 rr1Var, l31 l31Var, zm1 zm1Var) {
        this.f3902a = et1Var;
        this.f3903b = rr1Var;
        this.f3904c = l31Var;
        this.f3905d = zm1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a() {
        eu0 a7 = this.f3902a.a(pv.h(), null, null);
        ((View) a7).setVisibility(8);
        a7.G0("/sendMessageToSdk", new t70() { // from class: com.google.android.gms.internal.ads.wn1
            @Override // com.google.android.gms.internal.ads.t70
            public final void a(Object obj, Map map) {
                co1.this.b((eu0) obj, map);
            }
        });
        a7.G0("/adMuted", new t70() { // from class: com.google.android.gms.internal.ads.xn1
            @Override // com.google.android.gms.internal.ads.t70
            public final void a(Object obj, Map map) {
                co1.this.c((eu0) obj, map);
            }
        });
        this.f3903b.j(new WeakReference(a7), "/loadHtml", new t70() { // from class: com.google.android.gms.internal.ads.yn1
            @Override // com.google.android.gms.internal.ads.t70
            public final void a(Object obj, final Map map) {
                final co1 co1Var = co1.this;
                eu0 eu0Var = (eu0) obj;
                eu0Var.E0().f1(new rv0() { // from class: com.google.android.gms.internal.ads.bo1
                    @Override // com.google.android.gms.internal.ads.rv0
                    public final void c(boolean z6) {
                        co1.this.d(map, z6);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    eu0Var.loadData(str, "text/html", "UTF-8");
                } else {
                    eu0Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.f3903b.j(new WeakReference(a7), "/showOverlay", new t70() { // from class: com.google.android.gms.internal.ads.zn1
            @Override // com.google.android.gms.internal.ads.t70
            public final void a(Object obj, Map map) {
                co1.this.e((eu0) obj, map);
            }
        });
        this.f3903b.j(new WeakReference(a7), "/hideOverlay", new t70() { // from class: com.google.android.gms.internal.ads.ao1
            @Override // com.google.android.gms.internal.ads.t70
            public final void a(Object obj, Map map) {
                co1.this.f((eu0) obj, map);
            }
        });
        return (View) a7;
    }

    final /* synthetic */ void b(eu0 eu0Var, Map map) {
        this.f3903b.g("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void c(eu0 eu0Var, Map map) {
        this.f3905d.d();
    }

    final /* synthetic */ void d(Map map, boolean z6) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.f3903b.g("sendMessageToNativeJs", hashMap);
    }

    final /* synthetic */ void e(eu0 eu0Var, Map map) {
        io0.f("Showing native ads overlay.");
        eu0Var.c0().setVisibility(0);
        this.f3904c.d(true);
    }

    final /* synthetic */ void f(eu0 eu0Var, Map map) {
        io0.f("Hiding native ads overlay.");
        eu0Var.c0().setVisibility(8);
        this.f3904c.d(false);
    }
}
