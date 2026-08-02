package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.wf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0933wf implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0881uf f8572a = new C0881uf();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0778qf fromModel(C0907vf c0907vf) {
        C0778qf c0778qf = new C0778qf();
        if (!TextUtils.isEmpty(c0907vf.f8517a)) {
            c0778qf.f8164a = c0907vf.f8517a;
        }
        c0778qf.f8165b = c0907vf.f8518b.toString();
        c0778qf.f8166c = c0907vf.f8519c;
        c0778qf.f8167d = c0907vf.f8520d;
        c0778qf.f8168e = this.f8572a.fromModel(c0907vf.f8521e).intValue();
        return c0778qf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0907vf toModel(C0778qf c0778qf) {
        JSONObject jSONObject;
        String str = c0778qf.f8164a;
        String str2 = c0778qf.f8165b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C0907vf(str, jSONObject, c0778qf.f8166c, c0778qf.f8167d, this.f8572a.toModel(Integer.valueOf(c0778qf.f8168e)));
        }
        jSONObject = new JSONObject();
        return new C0907vf(str, jSONObject, c0778qf.f8166c, c0778qf.f8167d, this.f8572a.toModel(Integer.valueOf(c0778qf.f8168e)));
    }
}
