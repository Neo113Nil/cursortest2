package com.bytedance.adsdk.lottie.NB;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: RoundedCornersParser.java */
/* loaded from: classes.dex */
public class Pj {
    static com.bytedance.adsdk.lottie.vG.icD.Ju pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        String str = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "r":
                    icd = Jd.pvs(jsonReader, sus, true);
                    break;
                case "hd":
                    z = jsonReader.nextBoolean();
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (z) {
            return null;
        }
        return new com.bytedance.adsdk.lottie.vG.icD.Ju(str, icd);
    }
}
