package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class qm0 {

    /* renamed from: a, reason: collision with root package name */
    static qm0 f10753a;

    public static synchronized qm0 d(Context context) {
        synchronized (qm0.class) {
            qm0 qm0Var = f10753a;
            if (qm0Var != null) {
                return qm0Var;
            }
            Context applicationContext = context.getApplicationContext();
            m10.c(applicationContext);
            a3.t1 h7 = y2.t.p().h();
            h7.T(applicationContext);
            ul0 ul0Var = new ul0(null);
            ul0Var.b(applicationContext);
            ul0Var.c(y2.t.a());
            ul0Var.a(h7);
            ul0Var.d(y2.t.o());
            qm0 e7 = ul0Var.e();
            f10753a = e7;
            e7.a().a();
            f10753a.b().c();
            um0 c7 = f10753a.c();
            if (((Boolean) sw.c().b(m10.f8241l0)).booleanValue()) {
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject((String) sw.c().b(m10.f8257n0));
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        HashSet hashSet = new HashSet();
                        JSONArray optJSONArray = jSONObject.optJSONArray(next);
                        if (optJSONArray != null) {
                            for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                                String optString = optJSONArray.optString(i7);
                                if (optString != null) {
                                    hashSet.add(optString);
                                }
                            }
                            hashMap.put(next, hashSet);
                        }
                    }
                    Iterator it = hashMap.keySet().iterator();
                    while (it.hasNext()) {
                        c7.c((String) it.next());
                    }
                    c7.d(new sm0(c7, hashMap));
                } catch (JSONException e8) {
                    io0.c("Failed to parse listening list", e8);
                }
            }
            return f10753a;
        }
    }

    abstract nl0 a();

    abstract rl0 b();

    abstract um0 c();
}
