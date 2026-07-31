package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zb0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f15061a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final wb0<JSONObject> f15062b = new yb0();

    /* renamed from: c, reason: collision with root package name */
    public static final tb0<InputStream> f15063c = new tb0() { // from class: com.google.android.gms.internal.ads.xb0
        @Override // com.google.android.gms.internal.ads.tb0
        public final Object b(JSONObject jSONObject) {
            return zb0.a(jSONObject);
        }
    };

    static /* synthetic */ InputStream a(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f15061a));
    }
}
