package com.moat.analytics.mobile.tjy;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.tapjoy.TJAdUnitConstants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
class bi implements bh, m {

    /* renamed from: a, reason: collision with root package name */
    private View f7265a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f7266b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7267c;

    /* renamed from: d, reason: collision with root package name */
    private final l f7268d;
    private final a e;
    private final ap f;
    private com.moat.analytics.mobile.tjy.base.functional.a g;

    bi(View view, WebView webView, boolean z, a aVar, ap apVar) {
        this(view, webView, z, new n(webView.getContext(), apVar), aVar, apVar);
    }

    bi(View view, WebView webView, boolean z, l lVar, a aVar, ap apVar) {
        com.moat.analytics.mobile.tjy.base.asserts.a.a(view);
        com.moat.analytics.mobile.tjy.base.asserts.a.a(webView);
        com.moat.analytics.mobile.tjy.base.asserts.a.a(aVar);
        com.moat.analytics.mobile.tjy.base.asserts.a.a(lVar);
        if (apVar.b()) {
            Log.d("MoatViewTracker", "In initialization method.");
        }
        this.e = aVar;
        this.f7265a = view;
        this.f7266b = webView;
        this.f7267c = z;
        this.f7268d = lVar;
        this.f = apVar;
        this.g = com.moat.analytics.mobile.tjy.base.functional.a.a();
    }

    private static String a(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right - rect.left;
        int i4 = rect.bottom - rect.top;
        StringBuilder sb = new StringBuilder("{\"x\":");
        sb.append(i);
        sb.append(',');
        sb.append('\"');
        sb.append("y\":");
        sb.append(i2);
        sb.append(',');
        sb.append('\"');
        sb.append("w\":");
        sb.append(i3);
        sb.append(',');
        sb.append('\"');
        sb.append("h\":");
        sb.append(i4);
        sb.append('}');
        return String.valueOf(sb);
    }

    private static String a(Map map, boolean z) {
        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (sb.length() > 1) {
                sb.append(',');
            }
            sb.append('\"');
            sb.append(str);
            sb.append('\"');
            sb.append(':');
            if (z) {
                sb.append('\"');
                sb.append(str2);
                sb.append('\"');
            } else {
                sb.append(str2);
            }
        }
        sb.append("}");
        return String.valueOf(sb);
    }

    private void a(Map map, String str, Rect rect) {
        map.put(str, a(b(rect)));
    }

    private Rect b(Rect rect) {
        float f = j().density;
        if (f == 0.0f) {
            return rect;
        }
        return new Rect(Math.round(rect.left / f), Math.round(rect.top / f), Math.round(rect.right / f), Math.round(rect.bottom / f));
    }

    private Rect c(Rect rect) {
        Rect k = k();
        if (!this.f7265a.getGlobalVisibleRect(k)) {
            k = k();
        }
        k.left = Math.min(Math.max(0, k.left), rect.right);
        k.right = Math.min(Math.max(0, k.right), rect.right);
        k.top = Math.min(Math.max(0, k.top), rect.bottom);
        k.bottom = Math.min(Math.max(0, k.bottom), rect.bottom);
        return k;
    }

    private String g() {
        String charSequence;
        if (this.g.c()) {
            return (String) this.g.b();
        }
        String str = "_unknown_";
        try {
            Context context = this.f7266b.getContext();
            charSequence = context.getPackageManager().getApplicationLabel(context.getApplicationContext().getApplicationInfo()).toString();
        } catch (Exception e) {
            e = e;
        }
        try {
            this.g = com.moat.analytics.mobile.tjy.base.functional.a.a(charSequence);
            return charSequence;
        } catch (Exception e2) {
            e = e2;
            str = charSequence;
            com.moat.analytics.mobile.tjy.base.exception.a.a(e);
            return str;
        }
    }

    private boolean h() {
        return this.f7265a.isShown() && !this.e.a();
    }

    private Rect i() {
        DisplayMetrics j = j();
        return new Rect(0, 0, j.widthPixels, j.heightPixels);
    }

    private DisplayMetrics j() {
        return this.f7265a.getContext().getResources().getDisplayMetrics();
    }

    private Rect k() {
        return new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.moat.analytics.mobile.tjy.m
    public String a() {
        HashMap hashMap = new HashMap();
        try {
            Rect i = i();
            Rect c2 = c(i);
            Rect e = e();
            a(hashMap, "screen", i);
            a(hashMap, TJAdUnitConstants.String.VISIBLE, c2);
            a(hashMap, "maybe", c2);
            a(hashMap, Promotion.ACTION_VIEW, e);
            hashMap.put("inFocus", String.valueOf(h() ? 1 : 0));
            DisplayMetrics j = j();
            StringBuilder sb = new StringBuilder();
            sb.append(j.density);
            hashMap.put("dr", sb.toString());
            return a(hashMap, false);
        } catch (Exception unused) {
            return "{}";
        }
    }

    @Override // com.moat.analytics.mobile.tjy.bh
    public void a(View view) {
        String str;
        if (this.f.b()) {
            StringBuilder sb = new StringBuilder("changing view to ");
            if (view != null) {
                str = view.getClass().getSimpleName() + "@" + view.hashCode();
            } else {
                str = "null";
            }
            sb.append(str);
            Log.d("MoatViewTracker", sb.toString());
        }
        this.f7265a = view;
    }

    @Override // com.moat.analytics.mobile.tjy.m
    public String b() {
        try {
            return a(f(), true);
        } catch (Exception unused) {
            return "{}";
        }
    }

    @Override // com.moat.analytics.mobile.tjy.bh
    public boolean c() {
        if (this.f.b()) {
            Log.d("MoatViewTracker", "Attempting bridge installation.");
        }
        boolean a2 = this.f7268d.a(this.f7266b, this);
        if (this.f.b()) {
            StringBuilder sb = new StringBuilder("Bridge ");
            sb.append(a2 ? "" : "not ");
            sb.append("installed.");
            Log.d("MoatViewTracker", sb.toString());
        }
        return a2;
    }

    @Override // com.moat.analytics.mobile.tjy.bh
    public void d() {
        this.f7268d.a();
    }

    @Override // com.moat.analytics.mobile.tjy.bh
    public Rect e() {
        int[] iArr = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f7265a.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, this.f7265a.getWidth() + i, this.f7265a.getHeight() + i2);
    }

    public Map f() {
        HashMap hashMap = new HashMap();
        String g = g();
        String num = Integer.toString(Build.VERSION.SDK_INT);
        String str = this.f7267c ? "1" : "0";
        hashMap.put("versionHash", "8ace5ca5da6b9adb3c0f055aad4a98c2aedf4bd7");
        hashMap.put("appName", g);
        hashMap.put(FavaDiagnosticsEntity.EXTRA_NAMESPACE, "TJY");
        hashMap.put("version", "1.7.10");
        hashMap.put("deviceOS", num);
        hashMap.put("isNative", str);
        return hashMap;
    }
}
