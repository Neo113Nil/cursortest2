package com.bytedance.adsdk.fs.btk;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes5.dex */
class mw {
    static com.bytedance.adsdk.fs.zn.fb zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        double d = 0.0d;
        String str = null;
        String str2 = null;
        char c = 0;
        double d2 = 0.0d;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "fFamily":
                    str2 = jsonReader.nextString();
                    break;
                case "w":
                    d = jsonReader.nextDouble();
                    break;
                case "ch":
                    c = jsonReader.nextString().charAt(0);
                    break;
                case "data":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if ("shapes".equals(jsonReader.nextName())) {
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                arrayList.add((com.bytedance.adsdk.fs.zn.fs.cyb) zg.zmn(jsonReader, npsVar));
                            }
                            jsonReader.endArray();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case "size":
                    d2 = jsonReader.nextDouble();
                    break;
                case "style":
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.fs.zn.fb(arrayList, c, d2, d, str, str2);
    }
}
