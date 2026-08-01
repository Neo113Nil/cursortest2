package com.bytedance.adsdk.lottie.NB;

import android.util.JsonReader;
import com.bytedance.adsdk.lottie.vG.icD.zM;
import java.io.IOException;

/* compiled from: ShapeTrimPathParser.java */
/* loaded from: classes.dex */
class jhZ {
    static com.bytedance.adsdk.lottie.vG.icD.zM pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        String str = null;
        zM.pvs pvsVar = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd2 = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd3 = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "e":
                    icd2 = Jd.pvs(jsonReader, sus, false);
                    break;
                case "m":
                    pvsVar = zM.pvs.pvs(jsonReader.nextInt());
                    break;
                case "o":
                    icd3 = Jd.pvs(jsonReader, sus, false);
                    break;
                case "s":
                    icd = Jd.pvs(jsonReader, sus, false);
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
        return new com.bytedance.adsdk.lottie.vG.icD.zM(str, pvsVar, icd, icd2, icd3, z);
    }
}
