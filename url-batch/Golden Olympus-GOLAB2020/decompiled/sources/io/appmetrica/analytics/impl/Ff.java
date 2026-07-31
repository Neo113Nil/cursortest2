package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Ff implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Df f37537a = new Df();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3145zf fromModel(@NonNull Ef ef) {
        C3145zf c3145zf = new C3145zf();
        if (!TextUtils.isEmpty(ef.f37445a)) {
            c3145zf.f40379a = ef.f37445a;
        }
        c3145zf.f40380b = ef.f37446b.toString();
        c3145zf.f40381c = ef.f37447c;
        c3145zf.f40382d = ef.f37448d;
        c3145zf.f40383e = this.f37537a.fromModel(ef.f37449e).intValue();
        return c3145zf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ef toModel(@NonNull C3145zf c3145zf) {
        JSONObject jSONObject;
        String str = c3145zf.f40379a;
        String str2 = c3145zf.f40380b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new Ef(str, jSONObject, c3145zf.f40381c, c3145zf.f40382d, this.f37537a.toModel(Integer.valueOf(c3145zf.f40383e)));
        }
        jSONObject = new JSONObject();
        return new Ef(str, jSONObject, c3145zf.f40381c, c3145zf.f40382d, this.f37537a.toModel(Integer.valueOf(c3145zf.f40383e)));
    }
}
