package com.anythink.core.common.m;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.h.ax;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m extends s {

    /* renamed from: f, reason: collision with root package name */
    private static final String f14835f = "m";

    /* renamed from: a, reason: collision with root package name */
    JSONObject f14836a;

    public m(Context context, ax axVar) {
        super(context, axVar);
        this.f14836a = axVar.a();
    }

    @Override // com.anythink.core.common.m.s, com.anythink.core.common.m.a
    public final Object a(Object obj) {
        try {
            if (!(obj instanceof JSONObject)) {
                return null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            if (((s) this).f14876c != null) {
                jSONObject.put(s.f14868b, new JSONObject(((s) this).f14876c));
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.anythink.core.common.m.s, com.anythink.core.common.m.a
    public final void b(AdError adError) {
    }

    @Override // com.anythink.core.common.m.s, com.anythink.core.common.m.a
    public final JSONObject e() {
        JSONObject e6 = super.e();
        try {
            e6.put("m_data", this.f14836a);
        } catch (JSONException unused) {
        }
        return e6;
    }

    @Override // com.anythink.core.common.m.s, com.anythink.core.common.m.a
    public final String b() {
        com.anythink.core.common.i.a();
        return com.anythink.core.common.i.k();
    }
}
