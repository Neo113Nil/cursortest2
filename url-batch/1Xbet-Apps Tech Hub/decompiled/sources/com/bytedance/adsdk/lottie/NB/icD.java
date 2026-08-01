package com.bytedance.adsdk.lottie.NB;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: AnimatableTextPropertiesParser.java */
/* loaded from: classes.dex */
public class icD {
    public static com.bytedance.adsdk.lottie.vG.pvs.qh pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.lottie.vG.pvs.qh qhVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("a")) {
                qhVar = icD(jsonReader, sus);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return qhVar == null ? new com.bytedance.adsdk.lottie.vG.pvs.qh(null, null, null, null) : qhVar;
    }

    private static com.bytedance.adsdk.lottie.vG.pvs.qh icD(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.lottie.vG.pvs.pvs pvsVar = null;
        com.bytedance.adsdk.lottie.vG.pvs.pvs pvsVar2 = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "t":
                    icd2 = Jd.pvs(jsonReader, sus);
                    break;
                case "fc":
                    pvsVar = Jd.yiw(jsonReader, sus);
                    break;
                case "sc":
                    pvsVar2 = Jd.yiw(jsonReader, sus);
                    break;
                case "sw":
                    icd = Jd.pvs(jsonReader, sus);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.lottie.vG.pvs.qh(pvsVar, pvsVar2, icd, icd2);
    }
}
