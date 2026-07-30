package com.anythink.core.common.m;

import android.content.Context;
import com.anythink.core.api.AdError;
import com.anythink.core.common.h.aq;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u extends a {

    /* renamed from: a, reason: collision with root package name */
    aq f14891a;

    /* renamed from: b, reason: collision with root package name */
    boolean f14892b = true;

    public u(aq aqVar) {
        this.f14891a = aqVar;
    }

    @Override // com.anythink.core.common.m.a
    public final Object a(Object obj) {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final void b(AdError adError) {
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, String> c() {
        String str = this.f14891a.f13697c;
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    @Override // com.anythink.core.common.m.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] d() {
        JSONObject jSONObject;
        String str = this.f14891a.f13697c;
        boolean z8 = str != null && str.contains(com.anythink.expressad.foundation.g.f.g.b.f19499d);
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject(this.f14891a.f13699e);
        } catch (Exception e6) {
            e = e6;
        }
        try {
            if (this.f14892b) {
                jSONObject.put(e.f14785T, 1);
            }
        } catch (Exception e9) {
            e = e9;
            jSONObject2 = jSONObject;
            e.printStackTrace();
            jSONObject = jSONObject2;
            if (!z8) {
            }
        }
        return !z8 ? jSONObject != null ? a.b(jSONObject.toString()) : new byte[0] : jSONObject != null ? jSONObject.toString().getBytes() : new byte[0];
    }

    @Override // com.anythink.core.common.m.a
    public final String h() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final Context i() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final String j() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final Map<String, Object> k() {
        return null;
    }

    @Override // com.anythink.core.common.m.a
    public final boolean p() {
        return true;
    }

    public final void s() {
        this.f14892b = false;
    }

    public final aq t() {
        return this.f14891a;
    }

    @Override // com.anythink.core.common.m.a
    public final void a(AdError adError) {
    }

    @Override // com.anythink.core.common.m.a
    public final String b() {
        return this.f14891a.f13698d;
    }

    @Override // com.anythink.core.common.m.a
    public final int a() {
        return this.f14891a.f13696b;
    }
}
