package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ff, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0493ff implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0881uf f7319a;

    public C0493ff() {
        this(new C0881uf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0803rf fromModel(C0545hf c0545hf) {
        C0803rf c0803rf = new C0803rf();
        if (!TextUtils.isEmpty(c0545hf.f7443a)) {
            c0803rf.f8235a = c0545hf.f7443a;
        }
        c0803rf.f8236b = c0545hf.f7444b.toString();
        c0803rf.f8237c = this.f7319a.fromModel(c0545hf.f7445c).intValue();
        return c0803rf;
    }

    public C0493ff(C0881uf c0881uf) {
        this.f7319a = c0881uf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0545hf toModel(C0803rf c0803rf) {
        JSONObject jSONObject;
        String str = c0803rf.f8235a;
        String str2 = c0803rf.f8236b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C0545hf(str, jSONObject, this.f7319a.toModel(Integer.valueOf(c0803rf.f8237c)));
        }
        jSONObject = new JSONObject();
        return new C0545hf(str, jSONObject, this.f7319a.toModel(Integer.valueOf(c0803rf.f8237c)));
    }
}
