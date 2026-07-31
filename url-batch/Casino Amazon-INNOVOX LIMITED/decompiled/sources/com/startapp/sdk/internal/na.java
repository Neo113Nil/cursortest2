package com.startapp.sdk.internal;

import android.util.JsonReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class na {
    public static ArrayList a(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(b(jsonReader));
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static Object b(JsonReader jsonReader) {
        switch (ma.f334a[jsonReader.peek().ordinal()]) {
            case 1:
                return a(jsonReader);
            case 2:
                HashMap hashMap = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    hashMap.put(jsonReader.nextName(), b(jsonReader));
                }
                jsonReader.endObject();
                return hashMap;
            case 3:
                return jsonReader.nextString();
            case 4:
                return new BigDecimal(jsonReader.nextString());
            case 5:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 6:
                jsonReader.nextNull();
                return null;
            default:
                throw new IOException(String.valueOf(jsonReader.peek()));
        }
    }
}
