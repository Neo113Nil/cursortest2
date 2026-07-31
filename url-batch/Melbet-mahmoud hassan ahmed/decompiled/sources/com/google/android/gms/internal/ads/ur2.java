package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonToken;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ur2 {

    /* renamed from: a, reason: collision with root package name */
    public final List<String> f12946a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12947b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12948c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12949d;

    /* renamed from: e, reason: collision with root package name */
    public final int f12950e;

    /* renamed from: f, reason: collision with root package name */
    public final long f12951f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12952g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12953h;

    /* renamed from: i, reason: collision with root package name */
    public final tr2 f12954i;

    ur2(JsonReader jsonReader) {
        List<String> emptyList = Collections.emptyList();
        jsonReader.beginObject();
        int i7 = 0;
        String str = "";
        long j7 = 0;
        tr2 tr2Var = null;
        boolean z6 = false;
        String str2 = str;
        String str3 = str2;
        int i8 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = a3.a1.d(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i7 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str3 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z6 = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i8 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j7 = jsonReader.nextLong();
            } else {
                if (((Boolean) sw.c().b(m10.f8175c6)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    tr2Var = new tr2(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
        }
        jsonReader.endObject();
        this.f12946a = emptyList;
        this.f12948c = i7;
        this.f12947b = str2;
        this.f12949d = str3;
        this.f12950e = i8;
        this.f12951f = j7;
        this.f12954i = tr2Var;
        this.f12952g = z6;
        this.f12953h = str;
    }
}
