package com.bytedance.adsdk.lottie.NB;

import android.graphics.Path;
import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* compiled from: ShapeFillParser.java */
/* loaded from: classes.dex */
class gSd {
    static com.bytedance.adsdk.lottie.vG.icD.bNS pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        com.bytedance.adsdk.lottie.vG.pvs.Jd jd = null;
        String str = null;
        com.bytedance.adsdk.lottie.vG.pvs.pvs pvsVar = null;
        boolean z = false;
        boolean z2 = false;
        int i = 1;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "fillEnabled":
                    z = jsonReader.nextBoolean();
                    break;
                case "c":
                    pvsVar = Jd.yiw(jsonReader, sus);
                    break;
                case "o":
                    jd = Jd.icD(jsonReader, sus);
                    break;
                case "r":
                    i = jsonReader.nextInt();
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
        if (jd == null) {
            jd = new com.bytedance.adsdk.lottie.vG.pvs.Jd(Collections.singletonList(new com.bytedance.adsdk.lottie.yiw.pvs(100)));
        }
        return new com.bytedance.adsdk.lottie.vG.icD.bNS(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, pvsVar, jd, z2);
    }
}
