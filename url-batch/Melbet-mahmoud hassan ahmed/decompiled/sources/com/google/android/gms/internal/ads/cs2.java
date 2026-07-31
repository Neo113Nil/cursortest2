package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class cs2 {

    /* renamed from: a, reason: collision with root package name */
    public final List<rr2> f3933a;

    /* renamed from: b, reason: collision with root package name */
    public final ur2 f3934b;

    /* renamed from: c, reason: collision with root package name */
    public final List<bs2> f3935c;

    cs2(JsonReader jsonReader) {
        List<rr2> emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        ur2 ur2Var = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        emptyList = new ArrayList<>();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            emptyList.add(new rr2(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        ur2Var = new ur2(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if ("name".equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = a3.a1.h(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new bs2(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
            }
            jsonReader.endArray();
        }
        this.f3935c = arrayList;
        this.f3933a = emptyList;
        this.f3934b = ur2Var == null ? new ur2(new JsonReader(new StringReader("{}"))) : ur2Var;
    }

    public static cs2 a(Reader reader) {
        try {
            try {
                return new cs2(new JsonReader(reader));
            } finally {
                v3.j.a(reader);
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e7) {
            throw new vr2("unable to parse ServerResponse", e7);
        }
    }
}
