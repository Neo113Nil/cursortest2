package com.bytedance.adsdk.lottie.NB;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: RepeaterParser.java */
/* loaded from: classes.dex */
class jlb {
    static com.bytedance.adsdk.lottie.vG.icD.kj pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        String str = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd2 = null;
        com.bytedance.adsdk.lottie.vG.pvs.kj kjVar = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "c":
                    icd = Jd.pvs(jsonReader, sus, false);
                    break;
                case "o":
                    icd2 = Jd.pvs(jsonReader, sus, false);
                    break;
                case "hd":
                    z = jsonReader.nextBoolean();
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                case "tr":
                    kjVar = vG.pvs(jsonReader, sus);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.vG.icD.kj(str, icd, icd2, kjVar, z);
    }
}
