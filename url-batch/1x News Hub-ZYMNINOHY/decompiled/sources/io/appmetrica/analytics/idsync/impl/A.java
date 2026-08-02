package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class A implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final String f5616a = "request_state";

    /* renamed from: b, reason: collision with root package name */
    public final String f5617b = "type";

    /* renamed from: c, reason: collision with root package name */
    public final String f5618c = "last_attempt";

    /* renamed from: d, reason: collision with root package name */
    public final String f5619d = "prev_attempt_result";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [c2.m] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String fromModel(List<z> list) {
        ?? r22;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        String str = this.f5616a;
        if (list != null) {
            r22 = new ArrayList(c2.g.N(list));
            for (z zVar : list) {
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put(this.f5617b, zVar.f5687a);
                    jSONObject.put(this.f5618c, zVar.f5688b);
                    jSONObject.put(this.f5619d, u.a(zVar.f5689c));
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                r22.add(jSONObject);
            }
        } else {
            r22 = c2.m.f2637a;
        }
        jSONObject2.put(str, new JSONArray((Collection) r22));
        return jSONObject2.toString();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<z> toModel(String str) {
        JSONArray optJSONArray;
        z zVar;
        int i3;
        try {
            ArrayList arrayList = new ArrayList();
            if (str == null || (optJSONArray = new JSONObject(str).optJSONArray(this.f5616a)) == null) {
                return arrayList;
            }
            int length = optJSONArray.length();
            for (int i4 = 0; i4 < length; i4++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i4);
                if (optJSONObject != null) {
                    try {
                        String string = optJSONObject.getString(this.f5617b);
                        long j3 = optJSONObject.getLong(this.f5618c);
                        String string2 = optJSONObject.getString(this.f5619d);
                        int[] b3 = v.b(4);
                        int length2 = b3.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length2) {
                                i3 = 0;
                                break;
                            }
                            i3 = b3[i5];
                            if (kotlin.jvm.internal.j.a(u.a(i3), string2)) {
                                break;
                            }
                            i5++;
                        }
                        if (i3 == 0) {
                            i3 = 1;
                        }
                        zVar = new z(string, j3, i3);
                    } catch (Throwable unused) {
                        zVar = null;
                    }
                    if (zVar != null) {
                        arrayList.add(zVar);
                    }
                }
            }
            return arrayList;
        } catch (Throwable unused2) {
            return c2.m.f2637a;
        }
    }
}
