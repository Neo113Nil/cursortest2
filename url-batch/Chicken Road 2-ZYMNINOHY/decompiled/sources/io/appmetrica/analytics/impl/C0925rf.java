package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.rf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0925rf implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0874pf f12659a = new C0874pf();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0770lf fromModel(C0900qf c0900qf) {
        C0770lf c0770lf = new C0770lf();
        if (!TextUtils.isEmpty(c0900qf.f12616a)) {
            c0770lf.f12293a = c0900qf.f12616a;
        }
        c0770lf.f12294b = c0900qf.f12617b.toString();
        c0770lf.f12295c = c0900qf.f12618c;
        c0770lf.f12296d = c0900qf.f12619d;
        c0770lf.f12297e = this.f12659a.fromModel(c0900qf.f12620e).intValue();
        return c0770lf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0900qf toModel(C0770lf c0770lf) {
        JSONObject jSONObject;
        String str = c0770lf.f12293a;
        String str2 = c0770lf.f12294b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C0900qf(str, jSONObject, c0770lf.f12295c, c0770lf.f12296d, this.f12659a.toModel(Integer.valueOf(c0770lf.f12297e)));
        }
        jSONObject = new JSONObject();
        return new C0900qf(str, jSONObject, c0770lf.f12295c, c0770lf.f12296d, this.f12659a.toModel(Integer.valueOf(c0770lf.f12297e)));
    }
}
