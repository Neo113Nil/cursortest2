package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i80 implements t70<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f6562a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, h80> f6563b = new HashMap();

    @Override // com.google.android.gms.internal.ads.t70
    public final void a(Object obj, Map<String, String> map) {
        String concat;
        String str = map.get("id");
        String str2 = map.get("fail");
        String str3 = map.get("fail_reason");
        String str4 = map.get("fail_stack");
        String str5 = map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str4)) {
            concat = "";
        } else {
            String valueOf = String.valueOf(str4);
            concat = valueOf.length() != 0 ? "\n".concat(valueOf) : new String("\n");
        }
        synchronized (this.f6562a) {
            h80 remove = this.f6563b.remove(str);
            if (remove == null) {
                String valueOf2 = String.valueOf(str);
                io0.g(valueOf2.length() != 0 ? "Received result for unexpected method invocation: ".concat(valueOf2) : new String("Received result for unexpected method invocation: "));
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                String valueOf3 = String.valueOf(str3);
                String valueOf4 = String.valueOf(concat);
                remove.b(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            } else {
                if (str5 == null) {
                    remove.a(null);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (a3.r1.m()) {
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        a3.r1.k(valueOf5.length() != 0 ? "Result GMSG: ".concat(valueOf5) : new String("Result GMSG: "));
                    }
                    remove.a(jSONObject);
                } catch (JSONException e7) {
                    remove.b(e7.getMessage());
                }
            }
        }
    }

    public final <EngineT extends qa0> cc3<JSONObject> b(EngineT enginet, String str, JSONObject jSONObject) {
        bp0 bp0Var = new bp0();
        y2.t.q();
        String uuid = UUID.randomUUID().toString();
        c(uuid, new g80(this, bp0Var));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            enginet.b1(str, jSONObject2);
        } catch (Exception e7) {
            bp0Var.f(e7);
        }
        return bp0Var;
    }

    public final void c(String str, h80 h80Var) {
        synchronized (this.f6562a) {
            this.f6563b.put(str, h80Var);
        }
    }
}
