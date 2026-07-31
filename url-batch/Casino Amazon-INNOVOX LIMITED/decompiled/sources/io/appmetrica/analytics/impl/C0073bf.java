package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.bf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0073bf implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0456qf f1183a;

    public C0073bf() {
        this(new C0456qf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0381nf fromModel(C0125df c0125df) {
        C0381nf c0381nf = new C0381nf();
        if (!TextUtils.isEmpty(c0125df.f1217a)) {
            c0381nf.f1396a = c0125df.f1217a;
        }
        c0381nf.b = c0125df.b.toString();
        c0381nf.c = this.f1183a.fromModel(c0125df.c).intValue();
        return c0381nf;
    }

    public C0073bf(C0456qf c0456qf) {
        this.f1183a = c0456qf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0125df toModel(C0381nf c0381nf) {
        JSONObject jSONObject;
        String str = c0381nf.f1396a;
        String str2 = c0381nf.b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C0125df(str, jSONObject, this.f1183a.toModel(Integer.valueOf(c0381nf.c)));
        }
        jSONObject = new JSONObject();
        return new C0125df(str, jSONObject, this.f1183a.toModel(Integer.valueOf(c0381nf.c)));
    }
}
