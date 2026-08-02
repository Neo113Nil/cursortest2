package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Ad {

    /* renamed from: a, reason: collision with root package name */
    public final List f5751a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5752b;

    public Ad(List list, long j3) {
        this.f5751a = list;
        this.f5752b = j3;
    }

    public final String a() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            List<C0569id> list = this.f5751a;
            ArrayList arrayList = new ArrayList(c2.g.N(list));
            for (C0569id c0569id : list) {
                c0569id.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("moduleName", c0569id.f7563a);
                    jSONObject.put("loaded", c0569id.f7564b);
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                arrayList.add(jSONObject);
            }
            jSONObject2.put("modulesStatus", new JSONArray((Collection) arrayList));
            jSONObject2.put("lastSendTime", this.f5752b);
            return jSONObject2.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ad)) {
            return false;
        }
        Ad ad = (Ad) obj;
        return kotlin.jvm.internal.j.a(this.f5751a, ad.f5751a) && this.f5752b == ad.f5752b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5752b) + (this.f5751a.hashCode() * 31);
    }

    public final String toString() {
        return "ModulesStatus(modulesStatus=" + this.f5751a + ", lastSendTime=" + this.f5752b + ')';
    }
}
