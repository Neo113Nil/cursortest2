package com.bytedance.adsdk.lottie.NB;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: FontParser.java */
/* loaded from: classes.dex */
class IP {
    static com.bytedance.adsdk.lottie.vG.vG pvs(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        float f = 0.0f;
        String str3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "fFamily":
                    str = jsonReader.nextString();
                    break;
                case "ascent":
                    f = (float) jsonReader.nextDouble();
                    break;
                case "fStyle":
                    str2 = jsonReader.nextString();
                    break;
                case "fName":
                    str3 = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.lottie.vG.vG(str, str3, str2, f);
    }
}
