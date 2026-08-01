package com.bytedance.adsdk.lottie.NB;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* compiled from: CircleShapeParser.java */
/* loaded from: classes.dex */
class sUS {
    static com.bytedance.adsdk.lottie.vG.icD.icD pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus, int i) throws IOException {
        boolean z = i == 3;
        boolean z2 = false;
        String str = null;
        com.bytedance.adsdk.lottie.vG.pvs.Ju<PointF, PointF> ju = null;
        com.bytedance.adsdk.lottie.vG.pvs.sUS sus2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "d":
                    if (jsonReader.nextInt() != 3) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case "p":
                    ju = pvs.icD(jsonReader, sus);
                    break;
                case "s":
                    sus2 = Jd.vG(jsonReader, sus);
                    break;
                case "hd":
                    z2 = jsonReader.nextBoolean();
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.vG.icD.icD(str, ju, sus2, z, z2);
    }
}
