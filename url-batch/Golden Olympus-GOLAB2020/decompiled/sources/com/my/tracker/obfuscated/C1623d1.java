package com.my.tracker.obfuscated;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import com.my.tracker.ads.AdEvent;
import com.my.tracker.miniapps.MiniAppEvent;
import com.my.tracker.obfuscated.C1631f0;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.d1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1623d1 {

    /* renamed from: a, reason: collision with root package name */
    final AtomicBoolean f21251a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    final C1712z2 f21252b;

    /* renamed from: c, reason: collision with root package name */
    final Application f21253c;

    /* renamed from: d, reason: collision with root package name */
    final C1631f0 f21254d;

    /* renamed from: e, reason: collision with root package name */
    final C1606a f21255e;

    /* renamed from: f, reason: collision with root package name */
    final C1662n f21256f;

    /* renamed from: g, reason: collision with root package name */
    final C1709z f21257g;

    /* renamed from: h, reason: collision with root package name */
    final C1687t1 f21258h;

    /* renamed from: i, reason: collision with root package name */
    final C1703x1 f21259i;

    /* renamed from: j, reason: collision with root package name */
    C1668o1 f21260j;

    /* renamed from: k, reason: collision with root package name */
    protected C1691u1 f21261k;

    /* renamed from: com.my.tracker.obfuscated.d1$a */
    final class a implements C1631f0.b {
        a() {
        }

        @Override // com.my.tracker.obfuscated.C1631f0.b
        public void a() {
            C1623d1.this.f21255e.e();
        }

        @Override // com.my.tracker.obfuscated.C1631f0.b
        public void a(String str) {
            C1623d1.this.f21256f.b(str);
        }
    }

    C1623d1(C1712z2 c1712z2, Application application) {
        this.f21252b = c1712z2;
        this.f21253c = application;
        AbstractC1708y2.c("MyTracker created, version: 3.3.2");
        C1631f0 a4 = C1631f0.a(c1712z2, new a(), application);
        this.f21254d = a4;
        C1703x1 a5 = C1703x1.a(a4, c1712z2.a(), application);
        this.f21259i = a5;
        this.f21255e = C1606a.a(a4, c1712z2, a5, application);
        this.f21256f = C1662n.a(c1712z2, application);
        this.f21257g = C1709z.a(a4);
        this.f21258h = C1687t1.a(a4, application);
        this.f21261k = C1691u1.a();
    }

    public static C1623d1 a(String str, C1712z2 c1712z2, Application application) {
        c1712z2.b(str);
        return new C1623d1(c1712z2, application);
    }

    boolean b() {
        boolean z4 = this.f21251a.get();
        boolean z5 = !z4;
        if (!z4) {
            AbstractC1708y2.b("MyTracker error: tracker hasn't been initialized");
        }
        return z5;
    }

    public void a() {
        if (b()) {
            return;
        }
        this.f21254d.a();
    }

    public void b(int i4, boolean z4) {
        if (b()) {
            return;
        }
        C1661m2.e().b(i4, z4);
    }

    public String a(Intent intent) {
        return this.f21257g.a(intent);
    }

    public void b(Map map) {
        if (b()) {
            return;
        }
        this.f21254d.d(map);
    }

    public void a(int i4) {
        if (b()) {
            return;
        }
        C1661m2.e().a(i4);
    }

    public void b(String str, String str2, Map map) {
        if (b()) {
            return;
        }
        this.f21254d.b(str, str2, map);
    }

    public void a(List list) {
        if (!this.f21251a.compareAndSet(false, true)) {
            AbstractC1708y2.a("MyTracker: tracker has already been initialized");
            return;
        }
        AbstractC1708y2.c("MyTracker is initialized with id: " + this.f21252b.g());
        AbstractC1618c1.c(this.f21253c);
        this.f21254d.d();
        AbstractC1702x0.a(this.f21252b, this.f21254d, this.f21259i, this.f21253c);
        C1675q0.a(this.f21254d, this.f21256f, this.f21253c);
        C1698w0.a(this.f21254d, this.f21256f, this.f21253c);
        C1661m2.d().a(this.f21252b, this.f21253c);
        this.f21255e.a();
        this.f21258h.a();
        if (!list.isEmpty()) {
            C1668o1 a4 = C1668o1.a(this.f21254d, this.f21253c);
            this.f21260j = a4;
            a4.a(list);
        }
        C1691u1 c1691u1 = this.f21261k;
        Application application = this.f21253c;
        final C1631f0 c1631f0 = this.f21254d;
        Objects.requireNonNull(c1631f0);
        c1691u1.a(application, new InterfaceC1685t() { // from class: com.my.tracker.obfuscated.S
            @Override // com.my.tracker.obfuscated.InterfaceC1685t
            public final void a(Object obj) {
                C1631f0.this.b((String) obj);
            }
        });
    }

    public void a(int i4, Intent intent) {
        if (b()) {
            return;
        }
        if (this.f21252b.s()) {
            this.f21258h.b(i4, intent);
        } else {
            AbstractC1708y2.a("MyTracker: autotrackingPurchase is disabled, you should enable it before using onActivityResult(*) method");
        }
    }

    public void a(int i4, List list) {
        if (b()) {
            return;
        }
        if (this.f21252b.s()) {
            this.f21258h.a(i4, list);
        } else {
            AbstractC1708y2.a("MyTracker: autotrackingPurchase is disabled, you should enable it before using onPurchasesUpdated(*) method");
        }
    }

    public void a(int i4, boolean z4) {
        if (b()) {
            return;
        }
        C1661m2.e().a(i4, z4);
    }

    public void a(AdEvent adEvent) {
        if (b()) {
            return;
        }
        this.f21254d.a(adEvent);
    }

    public void a(Object obj, String str, String str2, String str3, Map map) {
        if (b()) {
            return;
        }
        if (this.f21252b.s()) {
            AbstractC1708y2.a("MyTracker: autotrackingPurchase is enabled, you mustn't use trackAppGalleryPurchase(*) method");
        } else {
            this.f21258h.a(obj, str, str2, str3, map);
        }
    }

    public void a(String str, Map map) {
        if (b()) {
            return;
        }
        this.f21254d.a(str, map);
    }

    public void a(JSONObject jSONObject, JSONObject jSONObject2, String str, Map map) {
        if (b()) {
            return;
        }
        if (this.f21252b.s()) {
            AbstractC1708y2.a("MyTracker: autotrackingPurchase is enabled, you mustn't use trackPurchase(*) method");
        } else {
            this.f21258h.a(jSONObject, jSONObject2, str, map);
        }
    }

    public void a(Map map) {
        if (b()) {
            return;
        }
        this.f21254d.c(map);
    }

    public void a(Activity activity) {
        if (b()) {
            return;
        }
        this.f21255e.d(activity);
    }

    public void a(int i4, Map map) {
        if (b()) {
            return;
        }
        this.f21254d.a(i4, map);
    }

    public void a(String str, String str2, Map map) {
        if (b()) {
            return;
        }
        this.f21254d.a(str, str2, map);
    }

    public void a(MiniAppEvent miniAppEvent) {
        if (b()) {
            return;
        }
        this.f21254d.a(miniAppEvent);
    }
}
