package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Wv {

    /* renamed from: a, reason: collision with root package name */
    public final A3 f28526a;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC3712ow f28529d;

    /* renamed from: g, reason: collision with root package name */
    public final String f28532g;

    /* renamed from: b, reason: collision with root package name */
    public final C3496kw f28527b = new C3496kw();

    /* renamed from: e, reason: collision with root package name */
    public boolean f28530e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28531f = false;

    /* renamed from: c, reason: collision with root package name */
    public Bw f28528c = new Bw(null);

    public Wv(Zw zw, A3 a32, String str) {
        this.f28526a = a32;
        this.f28532g = str;
        Vv vv = Vv.HTML;
        Vv vv2 = (Vv) a32.f23813z;
        if (vv2 == vv || vv2 == Vv.JAVASCRIPT) {
            C3766pw c3766pw = new C3766pw(str);
            WebView webView = (WebView) a32.f23808u;
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            c3766pw.f33235b = new Bw(webView);
            this.f28529d = c3766pw;
        } else {
            this.f28529d = new C3927sw(str, Collections.unmodifiableMap((HashMap) a32.f23810w));
        }
        this.f28529d.a();
        C3282gw.f31116c.f31117a.add(this);
        AbstractC3712ow abstractC3712ow = this.f28529d;
        T2 t22 = T2.f27692z;
        WebView c4 = abstractC3712ow.c();
        JSONObject jSONObject = new JSONObject();
        AbstractC3981tw.b(jSONObject, "impressionOwner", (EnumC3010bw) zw.f29111u);
        AbstractC3981tw.b(jSONObject, "mediaEventsOwner", (EnumC3010bw) zw.f29112v);
        AbstractC3981tw.b(jSONObject, "creativeType", (Xv) zw.f29113w);
        AbstractC3981tw.b(jSONObject, "impressionType", (Zv) zw.f29114x);
        AbstractC3981tw.b(jSONObject, "isolateVerificationScripts", Boolean.valueOf(zw.f29110n));
        t22.C(c4, "init", jSONObject, abstractC3712ow.f33234a);
    }

    public final void a() {
        if (this.f28530e || this.f28529d == null) {
            return;
        }
        this.f28530e = true;
        ArrayList arrayList = C3282gw.f31116c.f31118b;
        boolean z8 = arrayList.size() > 0;
        arrayList.add(this);
        if (!z8) {
            C3604mw a9 = C3604mw.a();
            a9.getClass();
            C3228fw c3228fw = C3228fw.f30921w;
            c3228fw.f32027v = a9;
            c3228fw.f32025n = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z9 = runningAppProcessInfo.importance == 100 || c3228fw.a();
            c3228fw.f32026u = z9;
            c3228fw.b(z9);
            C4197xw.f35273g.getClass();
            C4197xw.b();
            C3118dw c3118dw = a9.f32779b;
            c3118dw.getClass();
            c3118dw.f30260f.submit(new RunnableC3376ij(c3118dw));
            c3118dw.f30256b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, c3118dw);
        }
        float f6 = C3604mw.a().f32778a;
        AbstractC3712ow abstractC3712ow = this.f28529d;
        T2.f27692z.C(abstractC3712ow.c(), "setDeviceVolume", Float.valueOf(f6), abstractC3712ow.f33234a);
        AbstractC3712ow abstractC3712ow2 = this.f28529d;
        Date date = (Date) C3173ew.f30553e.f30556c;
        abstractC3712ow2.f(date != null ? (Date) date.clone() : null);
        this.f28529d.d(this, this.f28526a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(View view) {
        if (this.f28531f || ((View) this.f28528c.get()) == view) {
            return;
        }
        this.f28528c = new Bw(view);
        AbstractC3712ow abstractC3712ow = this.f28529d;
        abstractC3712ow.getClass();
        abstractC3712ow.f33236c = System.nanoTime();
        abstractC3712ow.f33237d = 1;
        Collection<Wv> unmodifiableCollection = Collections.unmodifiableCollection(C3282gw.f31116c.f31117a);
        if (unmodifiableCollection == null || unmodifiableCollection.isEmpty()) {
            return;
        }
        for (Wv wv : unmodifiableCollection) {
            if (wv != this && ((View) wv.f28528c.get()) == view) {
                wv.f28528c.clear();
            }
        }
    }

    public final void c() {
        if (this.f28531f) {
            return;
        }
        this.f28528c.clear();
        if (!this.f28531f) {
            this.f28527b.f32487a.clear();
        }
        this.f28531f = true;
        AbstractC3712ow abstractC3712ow = this.f28529d;
        T2.f27692z.C(abstractC3712ow.c(), "finishSession", abstractC3712ow.f33234a);
        C3282gw c3282gw = C3282gw.f31116c;
        ArrayList arrayList = c3282gw.f31117a;
        ArrayList arrayList2 = c3282gw.f31118b;
        boolean z8 = arrayList2.size() > 0;
        arrayList.remove(this);
        arrayList2.remove(this);
        if (z8 && arrayList2.size() <= 0) {
            C3604mw a9 = C3604mw.a();
            a9.getClass();
            C4197xw c4197xw = C4197xw.f35273g;
            c4197xw.getClass();
            Handler handler = C4197xw.i;
            if (handler != null) {
                handler.removeCallbacks(C4197xw.f35276k);
                C4197xw.i = null;
            }
            c4197xw.f35277a.clear();
            C4197xw.f35274h.post(new RunnableC3873rw(c4197xw));
            C3228fw c3228fw = C3228fw.f30921w;
            c3228fw.f32025n = false;
            c3228fw.f32027v = null;
            C3118dw c3118dw = a9.f32779b;
            c3118dw.f30256b.getContentResolver().unregisterContentObserver(c3118dw);
        }
        this.f28529d.b();
        this.f28529d = null;
    }
}
