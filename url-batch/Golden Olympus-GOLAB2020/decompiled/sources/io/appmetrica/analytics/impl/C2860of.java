package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.of, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2860of implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Df f39574a;

    public C2860of() {
        this(new Df());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Af fromModel(@NonNull C2912qf c2912qf) {
        Af af = new Af();
        if (!TextUtils.isEmpty(c2912qf.f39659a)) {
            af.f37180a = c2912qf.f39659a;
        }
        af.f37181b = c2912qf.f39660b.toString();
        af.f37182c = this.f39574a.fromModel(c2912qf.f39661c).intValue();
        return af;
    }

    public C2860of(Df df) {
        this.f39574a = df;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2912qf toModel(@NonNull Af af) {
        JSONObject jSONObject;
        String str = af.f37180a;
        String str2 = af.f37181b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C2912qf(str, jSONObject, this.f39574a.toModel(Integer.valueOf(af.f37182c)));
        }
        jSONObject = new JSONObject();
        return new C2912qf(str, jSONObject, this.f39574a.toModel(Integer.valueOf(af.f37182c)));
    }
}
