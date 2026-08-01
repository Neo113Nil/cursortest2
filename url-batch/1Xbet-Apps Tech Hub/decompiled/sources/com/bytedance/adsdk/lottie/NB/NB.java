package com.bytedance.adsdk.lottie.NB;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: BlurEffectParser.java */
/* loaded from: classes.dex */
class NB {
    static com.bytedance.adsdk.lottie.vG.icD.pvs pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        com.bytedance.adsdk.lottie.vG.icD.pvs pvsVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.lottie.vG.icD.pvs icD = icD(jsonReader, sus);
                    if (icD != null) {
                        pvsVar = icD;
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        return pvsVar;
    }

    private static com.bytedance.adsdk.lottie.vG.icD.pvs icD(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.lottie.vG.icD.pvs pvsVar = null;
        while (true) {
            boolean z = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.hashCode();
                if (nextName.equals("v")) {
                    if (z) {
                        pvsVar = new com.bytedance.adsdk.lottie.vG.icD.pvs(Jd.pvs(jsonReader, sus));
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
            return pvsVar;
        }
    }
}
