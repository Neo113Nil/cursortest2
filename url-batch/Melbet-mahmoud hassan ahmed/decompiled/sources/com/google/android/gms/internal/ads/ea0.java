package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class ea0 {
    public static void a(fa0 fa0Var, String str, Map map) {
        try {
            fa0Var.s(str, y2.t.q().N(map));
        } catch (JSONException unused) {
            io0.g("Could not convert parameters to JSON.");
        }
    }

    public static void b(fa0 fa0Var, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        io0.b(sb2.length() != 0 ? "Dispatching AFMA event: ".concat(sb2) : new String("Dispatching AFMA event: "));
        fa0Var.b(sb.toString());
    }

    public static void c(fa0 fa0Var, String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        fa0Var.b(sb.toString());
    }

    public static void d(fa0 fa0Var, String str, JSONObject jSONObject) {
        fa0Var.a(str, jSONObject.toString());
    }
}
