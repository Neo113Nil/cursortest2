package com.baidu.ar;

import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wb {

    /* renamed from: a, reason: collision with root package name */
    public String f3623a;

    /* renamed from: b, reason: collision with root package name */
    public int f3624b;

    /* renamed from: c, reason: collision with root package name */
    public String f3625c;

    public static wb a(String str) {
        wb wbVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            wb wbVar2 = new wb();
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("action")) {
                    wbVar2.b(jSONObject.getString("action"));
                }
                if (jSONObject.has("code")) {
                    wbVar2.a(jSONObject.getInt("code"));
                }
                if (jSONObject.has("message")) {
                    wbVar2.d(jSONObject.getString("message"));
                }
                if (jSONObject.has("requestId")) {
                    wbVar2.e(jSONObject.getString("requestId"));
                }
                if (jSONObject.has(TtmlNode.TAG_BODY)) {
                    wbVar2.c(jSONObject.getString(TtmlNode.TAG_BODY));
                }
                return wbVar2;
            } catch (Exception e8) {
                e = e8;
                wbVar = wbVar2;
                e.printStackTrace();
                return wbVar;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    public String b() {
        return this.f3625c;
    }

    public int c() {
        return this.f3624b;
    }

    public void d(String str) {
    }

    public void e(String str) {
    }

    public String a() {
        return this.f3623a;
    }

    public void b(String str) {
        this.f3623a = str;
    }

    public void c(String str) {
        this.f3625c = str;
    }

    public boolean d() {
        return c() == 0;
    }

    public void a(int i8) {
        this.f3624b = i8;
    }
}
