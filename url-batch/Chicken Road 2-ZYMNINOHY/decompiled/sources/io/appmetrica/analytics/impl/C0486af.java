package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.af, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0486af implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0874pf f11437a;

    public C0486af() {
        this(new C0874pf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0796mf fromModel(C0538cf c0538cf) {
        C0796mf c0796mf = new C0796mf();
        if (!TextUtils.isEmpty(c0538cf.f11612a)) {
            c0796mf.f12358a = c0538cf.f11612a;
        }
        c0796mf.f12359b = c0538cf.f11613b.toString();
        c0796mf.f12360c = this.f11437a.fromModel(c0538cf.f11614c).intValue();
        return c0796mf;
    }

    public C0486af(C0874pf c0874pf) {
        this.f11437a = c0874pf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0538cf toModel(C0796mf c0796mf) {
        JSONObject jSONObject;
        String str = c0796mf.f12358a;
        String str2 = c0796mf.f12359b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C0538cf(str, jSONObject, this.f11437a.toModel(Integer.valueOf(c0796mf.f12360c)));
        }
        jSONObject = new JSONObject();
        return new C0538cf(str, jSONObject, this.f11437a.toModel(Integer.valueOf(c0796mf.f12360c)));
    }
}
