package com.bytedance.adsdk.lottie.NB;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.lottie.vG.icD.Wyp;
import java.io.IOException;

/* compiled from: PolystarShapeParser.java */
/* loaded from: classes.dex */
class ae {
    static com.bytedance.adsdk.lottie.vG.icD.Wyp pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus, int i) throws IOException {
        boolean z = false;
        boolean z2 = i == 3;
        String str = null;
        Wyp.pvs pvsVar = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd = null;
        com.bytedance.adsdk.lottie.vG.pvs.Ju<PointF, PointF> ju = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd2 = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd3 = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd4 = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd5 = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd6 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "d":
                    if (jsonReader.nextInt() != 3) {
                        z2 = false;
                        break;
                    } else {
                        z2 = true;
                        break;
                    }
                case "p":
                    ju = pvs.icD(jsonReader, sus);
                    break;
                case "r":
                    icd2 = Jd.pvs(jsonReader, sus, false);
                    break;
                case "hd":
                    z = jsonReader.nextBoolean();
                    break;
                case "ir":
                    icd3 = Jd.pvs(jsonReader, sus);
                    break;
                case "is":
                    icd5 = Jd.pvs(jsonReader, sus, false);
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                case "or":
                    icd4 = Jd.pvs(jsonReader, sus);
                    break;
                case "os":
                    icd6 = Jd.pvs(jsonReader, sus, false);
                    break;
                case "pt":
                    icd = Jd.pvs(jsonReader, sus, false);
                    break;
                case "sy":
                    pvsVar = Wyp.pvs.pvs(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.vG.icD.Wyp(str, pvsVar, icd, ju, icd2, icd3, icd4, icd5, icd6, z, z2);
    }
}
