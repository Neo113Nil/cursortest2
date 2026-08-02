package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class F implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final String f9888a = "request_state";

    /* renamed from: b, reason: collision with root package name */
    public final String f9889b = "type";

    /* renamed from: c, reason: collision with root package name */
    public final String f9890c = "last_attempt";

    /* renamed from: d, reason: collision with root package name */
    public final String f9891d = "prev_attempt_result";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [d3.q] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String fromModel(List<E> list) {
        ?? r22;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        String str = this.f9888a;
        if (list != null) {
            r22 = new ArrayList(d3.k.Y(list));
            for (E e4 : list) {
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put(this.f9889b, e4.f9885a);
                    jSONObject.put(this.f9890c, e4.f9886b);
                    jSONObject.put(this.f9891d, z.a(e4.f9887c));
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                r22.add(jSONObject);
            }
        } else {
            r22 = d3.q.f8333a;
        }
        jSONObject2.put(str, new JSONArray((Collection) r22));
        return jSONObject2.toString();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<E> toModel(String str) {
        JSONArray optJSONArray;
        E e4;
        int i4;
        try {
            ArrayList arrayList = new ArrayList();
            if (str == null || (optJSONArray = new JSONObject(str).optJSONArray(this.f9888a)) == null) {
                return arrayList;
            }
            int length = optJSONArray.length();
            for (int i5 = 0; i5 < length; i5++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i5);
                if (optJSONObject != null) {
                    try {
                        String string = optJSONObject.getString(this.f9889b);
                        long j4 = optJSONObject.getLong(this.f9890c);
                        String string2 = optJSONObject.getString(this.f9891d);
                        int[] b4 = A.b(4);
                        int length2 = b4.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= length2) {
                                i4 = 0;
                                break;
                            }
                            i4 = b4[i6];
                            if (kotlin.jvm.internal.i.a(z.a(i4), string2)) {
                                break;
                            }
                            i6++;
                        }
                        if (i4 == 0) {
                            i4 = 1;
                        }
                        e4 = new E(string, j4, i4);
                    } catch (Throwable unused) {
                        e4 = null;
                    }
                    if (e4 != null) {
                        arrayList.add(e4);
                    }
                }
            }
            return arrayList;
        } catch (Throwable unused2) {
            return d3.q.f8333a;
        }
    }
}
