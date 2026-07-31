package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.ch;
import com.ironsource.gr;
import com.ironsource.nw;
import com.ironsource.o9;
import com.ironsource.sk;
import com.ironsource.xg;
import com.ironsource.yv;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1557a implements xg {

    /* renamed from: d, reason: collision with root package name */
    private static final String f19122d = "loadWithUrl";

    /* renamed from: e, reason: collision with root package name */
    private static final String f19123e = "sendMessage";

    /* renamed from: f, reason: collision with root package name */
    public static final String f19124f = "removeAdView";

    /* renamed from: g, reason: collision with root package name */
    public static final String f19125g = "webviewAction";

    /* renamed from: h, reason: collision with root package name */
    public static final String f19126h = "handleGetViewVisibility";

    /* renamed from: i, reason: collision with root package name */
    private static final String f19127i = "functionName";

    /* renamed from: j, reason: collision with root package name */
    private static final String f19128j = "functionParams";

    /* renamed from: k, reason: collision with root package name */
    private static final String f19129k = "success";

    /* renamed from: l, reason: collision with root package name */
    private static final String f19130l = "fail";

    /* renamed from: m, reason: collision with root package name */
    public static final String f19131m = "errMsg";

    /* renamed from: n, reason: collision with root package name */
    private static final String f19132n = "%s | unsupported AdViews API";

    /* renamed from: a, reason: collision with root package name */
    private nw f19133a;

    /* renamed from: b, reason: collision with root package name */
    private ch f19134b = ch.a();

    /* renamed from: c, reason: collision with root package name */
    private Context f19135c;

    /* renamed from: com.ironsource.sdk.controller.a$b */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        String f19136a;

        /* renamed from: b, reason: collision with root package name */
        JSONObject f19137b;

        /* renamed from: c, reason: collision with root package name */
        String f19138c;

        /* renamed from: d, reason: collision with root package name */
        String f19139d;

        private b() {
        }
    }

    public C1557a(Context context) {
        this.f19135c = context;
    }

    private b a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        b bVar = new b();
        bVar.f19136a = jSONObject.optString("functionName");
        bVar.f19137b = jSONObject.optJSONObject("functionParams");
        bVar.f19138c = jSONObject.optString("success");
        bVar.f19139d = jSONObject.optString("fail");
        return bVar;
    }

    public void a(nw nwVar) {
        this.f19133a = nwVar;
    }

    void a(String str, sk skVar) {
        C1557a c1557a;
        char c4;
        b a4 = a(str);
        gr grVar = new gr();
        try {
            String str2 = a4.f19136a;
            switch (str2.hashCode()) {
                case -1384357108:
                    if (str2.equals(f19124f)) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 691453791:
                    if (str2.equals("sendMessage")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 842351363:
                    if (str2.equals("loadWithUrl")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1182065477:
                    if (str2.equals("handleGetViewVisibility")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1491535759:
                    if (str2.equals(f19125g)) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            if (c4 == 0) {
                c1557a = this;
                try {
                    this.f19134b.a(c1557a, a4.f19137b, this.f19135c, a4.f19138c, a4.f19139d);
                    return;
                } catch (Exception e4) {
                    e = e4;
                    o9.d().a(e);
                    grVar.b("errMsg", e.getMessage());
                    String c5 = c1557a.f19134b.c(a4.f19137b);
                    if (!TextUtils.isEmpty(c5)) {
                        grVar.b("adViewId", c5);
                    }
                    skVar.a(false, a4.f19139d, grVar);
                    return;
                }
            }
            if (c4 == 1) {
                this.f19134b.d(a4.f19137b, a4.f19138c, a4.f19139d);
                return;
            }
            if (c4 == 2) {
                this.f19134b.c(a4.f19137b, a4.f19138c, a4.f19139d);
            } else if (c4 == 3) {
                this.f19134b.a(a4.f19137b, a4.f19138c, a4.f19139d);
            } else {
                if (c4 != 4) {
                    throw new IllegalArgumentException(String.format(f19132n, a4.f19136a));
                }
                this.f19134b.b(a4.f19137b, a4.f19138c, a4.f19139d);
            }
        } catch (Exception e5) {
            e = e5;
            c1557a = this;
        }
    }

    @Override // com.ironsource.xg
    public void a(String str, String str2, String str3) {
        a(str, yv.a(str2, str3));
    }

    @Override // com.ironsource.xg
    public void a(String str, JSONObject jSONObject) {
        if (this.f19133a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f19133a.a(str, jSONObject);
    }
}
