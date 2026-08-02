package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.td, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0975td {

    /* renamed from: a, reason: collision with root package name */
    public final List f12779a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12780b;

    public C0975td(List list, long j4) {
        this.f12779a = list;
        this.f12780b = j4;
    }

    public final String a() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            List<C0510bd> list = this.f12779a;
            ArrayList arrayList = new ArrayList(d3.k.Y(list));
            for (C0510bd c0510bd : list) {
                c0510bd.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("moduleName", c0510bd.f11534a);
                    jSONObject.put("loaded", c0510bd.f11535b);
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                arrayList.add(jSONObject);
            }
            jSONObject2.put("modulesStatus", new JSONArray((Collection) arrayList));
            jSONObject2.put("lastSendTime", this.f12780b);
            return jSONObject2.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0975td)) {
            return false;
        }
        C0975td c0975td = (C0975td) obj;
        return kotlin.jvm.internal.i.a(this.f12779a, c0975td.f12779a) && this.f12780b == c0975td.f12780b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12780b) + (this.f12779a.hashCode() * 31);
    }

    public final String toString() {
        return "ModulesStatus(modulesStatus=" + this.f12779a + ", lastSendTime=" + this.f12780b + ')';
    }
}
