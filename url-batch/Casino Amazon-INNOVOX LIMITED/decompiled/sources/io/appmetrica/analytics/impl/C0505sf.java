package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.sf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0505sf implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0456qf f1485a = new C0456qf();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0356mf fromModel(C0480rf c0480rf) {
        C0356mf c0356mf = new C0356mf();
        if (!TextUtils.isEmpty(c0480rf.f1468a)) {
            c0356mf.f1377a = c0480rf.f1468a;
        }
        c0356mf.b = c0480rf.b.toString();
        c0356mf.c = c0480rf.c;
        c0356mf.d = c0480rf.d;
        c0356mf.e = this.f1485a.fromModel(c0480rf.e).intValue();
        return c0356mf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0480rf toModel(C0356mf c0356mf) {
        JSONObject jSONObject;
        String str = c0356mf.f1377a;
        String str2 = c0356mf.b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C0480rf(str, jSONObject, c0356mf.c, c0356mf.d, this.f1485a.toModel(Integer.valueOf(c0356mf.e)));
        }
        jSONObject = new JSONObject();
        return new C0480rf(str, jSONObject, c0356mf.c, c0356mf.d, this.f1485a.toModel(Integer.valueOf(c0356mf.e)));
    }
}
