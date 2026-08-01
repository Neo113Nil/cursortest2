package com.bytedance.adsdk.lottie.NB;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: ShapePathParser.java */
/* loaded from: classes.dex */
class od {
    static com.bytedance.adsdk.lottie.vG.icD.vA pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        String str = null;
        com.bytedance.adsdk.lottie.vG.pvs.so soVar = null;
        int i = 0;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "hd":
                    z = jsonReader.nextBoolean();
                    break;
                case "ks":
                    soVar = Jd.NB(jsonReader, sus);
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                case "ind":
                    i = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.vG.icD.vA(str, i, soVar, z);
    }
}
