package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ud, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0553ud {

    /* renamed from: a, reason: collision with root package name */
    public final List f1515a;
    public final long b;

    public C0553ud(List list, long j) {
        this.f1515a = list;
        this.b = j;
    }

    public final String a() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            List<C0097cd> list = this.f1515a;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (C0097cd c0097cd : list) {
                c0097cd.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("moduleName", c0097cd.f1197a);
                    jSONObject.put("loaded", c0097cd.b);
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                arrayList.add(jSONObject);
            }
            jSONObject2.put("modulesStatus", new JSONArray((Collection) arrayList));
            jSONObject2.put("lastSendTime", this.b);
            return jSONObject2.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0553ud)) {
            return false;
        }
        C0553ud c0553ud = (C0553ud) obj;
        return Intrinsics.areEqual(this.f1515a, c0553ud.f1515a) && this.b == c0553ud.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.f1515a.hashCode() * 31);
    }

    public final String toString() {
        return "ModulesStatus(modulesStatus=" + this.f1515a + ", lastSendTime=" + this.b + ')';
    }
}
