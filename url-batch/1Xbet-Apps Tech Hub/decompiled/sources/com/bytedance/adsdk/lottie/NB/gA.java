package com.bytedance.adsdk.lottie.NB;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* compiled from: RectangleShapeParser.java */
/* loaded from: classes.dex */
class gA {
    static com.bytedance.adsdk.lottie.vG.icD.qh pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        String str = null;
        com.bytedance.adsdk.lottie.vG.pvs.Ju<PointF, PointF> ju = null;
        com.bytedance.adsdk.lottie.vG.pvs.sUS sus2 = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "p":
                    ju = pvs.icD(jsonReader, sus);
                    break;
                case "r":
                    icd = Jd.pvs(jsonReader, sus);
                    break;
                case "s":
                    sus2 = Jd.vG(jsonReader, sus);
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
        return new com.bytedance.adsdk.lottie.vG.icD.qh(str, ju, sus2, icd, z);
    }
}
