package com.bytedance.adsdk.fs.btk;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes5.dex */
class btk {
    static com.bytedance.adsdk.fs.zn.fs.zmn zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        com.bytedance.adsdk.fs.zn.fs.zmn zmnVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.fs.zn.fs.zmn fs = fs(jsonReader, npsVar);
                    if (fs != null) {
                        zmnVar = fs;
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        return zmnVar;
    }

    private static com.bytedance.adsdk.fs.zn.fs.zmn fs(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.fs.zn.fs.zmn zmnVar = null;
        while (true) {
            boolean z = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.hashCode();
                if (nextName.equals("v")) {
                    if (z) {
                        zmnVar = new com.bytedance.adsdk.fs.zn.fs.zmn(fb.zmn(jsonReader, npsVar));
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (nextName.equals("ty")) {
                    if (jsonReader.nextInt() == 0) {
                        z = true;
                    }
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            return zmnVar;
        }
    }
}
