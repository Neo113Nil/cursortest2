package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.b9;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class y9 {

    /* renamed from: c, reason: collision with root package name */
    private static final String f20406c = "y9";

    /* renamed from: d, reason: collision with root package name */
    private static final String f20407d = "setSharedSignal";

    /* renamed from: e, reason: collision with root package name */
    private static final String f20408e = "getSharedSignal";

    /* renamed from: f, reason: collision with root package name */
    private static final String f20409f = "functionName";

    /* renamed from: g, reason: collision with root package name */
    private static final String f20410g = "functionParams";

    /* renamed from: h, reason: collision with root package name */
    private static final String f20411h = "success";

    /* renamed from: i, reason: collision with root package name */
    private static final String f20412i = "fail";

    /* renamed from: a, reason: collision with root package name */
    private final Context f20413a;

    /* renamed from: b, reason: collision with root package name */
    x9 f20414b;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        String f20415a;

        /* renamed from: b, reason: collision with root package name */
        JSONObject f20416b;

        /* renamed from: c, reason: collision with root package name */
        String f20417c;

        /* renamed from: d, reason: collision with root package name */
        String f20418d;

        private a() {
        }

        public static a a(JSONObject jSONObject) {
            a aVar = new a();
            aVar.f20415a = jSONObject.optString("functionName");
            aVar.f20416b = jSONObject.optJSONObject("functionParams");
            aVar.f20417c = jSONObject.optString("success");
            aVar.f20418d = jSONObject.optString("fail");
            return aVar;
        }
    }

    public y9(Context context, x9 x9Var) {
        this.f20413a = context;
        this.f20414b = x9Var;
    }

    private a a(String str) {
        return a.a(new JSONObject(str));
    }

    private void b(Context context, a aVar, sk skVar) {
        gr grVar = new gr();
        JSONObject jSONObject = aVar.f20416b;
        this.f20414b.a(context, w9.a(jSONObject.optString("source")), jSONObject.optString(b9.h.f15463W), jSONObject.optString("data"));
        skVar.a(true, aVar.f20417c, grVar);
    }

    private void a(Context context, a aVar, sk skVar) {
        gr grVar = new gr();
        JSONObject jSONObject = aVar.f20416b;
        grVar.b("data", this.f20414b.a(context, w9.a(jSONObject.optString("source")), jSONObject.optString(b9.h.f15463W)));
        skVar.a(true, aVar.f20417c, grVar);
    }

    private void a(a aVar, sk skVar, Exception exc) {
        o9.d().a(exc);
        String message = exc.getMessage();
        Logger.i(f20406c, aVar.f20415a + " exception " + message);
        gr grVar = new gr();
        if (TextUtils.isEmpty(message)) {
            message = "Unknown error";
        }
        grVar.b("error", message);
        skVar.a(false, aVar.f20418d, grVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e A[Catch: Exception -> 0x0020, TRY_LEAVE, TryCatch #0 {Exception -> 0x0020, blocks: (B:3:0x0004, B:11:0x0031, B:14:0x0037, B:15:0x004d, B:16:0x004e, B:18:0x0016, B:21:0x0022), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(String str, sk skVar) {
        char c4;
        a a4 = a(str);
        try {
            String str2 = a4.f20415a;
            int hashCode = str2.hashCode();
            if (hashCode != 576059875) {
                if (hashCode == 1486812399 && str2.equals(f20407d)) {
                    c4 = 0;
                    if (c4 != 0) {
                        b(this.f20413a, a4, skVar);
                        return;
                    } else {
                        if (c4 == 1) {
                            a(this.f20413a, a4, skVar);
                            return;
                        }
                        throw new UnsupportedOperationException("unsupported API: " + str);
                    }
                }
                c4 = 65535;
                if (c4 != 0) {
                }
            } else {
                if (str2.equals(f20408e)) {
                    c4 = 1;
                    if (c4 != 0) {
                    }
                }
                c4 = 65535;
                if (c4 != 0) {
                }
            }
        } catch (Exception e4) {
            a(a4, skVar, e4);
        }
    }
}
