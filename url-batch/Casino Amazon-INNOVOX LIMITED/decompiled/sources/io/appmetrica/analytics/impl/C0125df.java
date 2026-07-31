package io.appmetrica.analytics.impl;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.df, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0125df {

    /* renamed from: a, reason: collision with root package name */
    public final String f1217a;
    public final JSONObject b;
    public final T7 c;

    public C0125df(String str, JSONObject jSONObject, T7 t7) {
        this.f1217a = str;
        this.b = jSONObject;
        this.c = t7;
    }

    public final String toString() {
        return "Candidate{trackingId='" + this.f1217a + "', additionalParams=" + this.b + ", source=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}
