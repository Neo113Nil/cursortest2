package com.bytedance.adsdk.lottie.NB;

import android.graphics.Path;
import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* compiled from: GradientFillParser.java */
/* loaded from: classes.dex */
class mnm {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static com.bytedance.adsdk.lottie.vG.icD.NB pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        char c;
        com.bytedance.adsdk.lottie.vG.pvs.Jd jd = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        com.bytedance.adsdk.lottie.vG.icD.yiw yiwVar = null;
        com.bytedance.adsdk.lottie.vG.pvs.vG vGVar = null;
        com.bytedance.adsdk.lottie.vG.pvs.sUS sus2 = null;
        com.bytedance.adsdk.lottie.vG.pvs.sUS sus3 = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            int i = -1;
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals("e")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 103:
                    if (nextName.equals("g")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 114:
                    if (nextName.equals("r")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    sus3 = Jd.vG(jsonReader, sus);
                    break;
                case 1:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.hashCode();
                        if (nextName2.equals("k")) {
                            vGVar = Jd.pvs(jsonReader, sus, i);
                        } else if (nextName2.equals("p")) {
                            i = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 2:
                    jd = Jd.icD(jsonReader, sus);
                    break;
                case 3:
                    fillType = jsonReader.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 4:
                    sus2 = Jd.vG(jsonReader, sus);
                    break;
                case 5:
                    yiwVar = jsonReader.nextInt() == 1 ? com.bytedance.adsdk.lottie.vG.icD.yiw.LINEAR : com.bytedance.adsdk.lottie.vG.icD.yiw.RADIAL;
                    break;
                case 6:
                    z = jsonReader.nextBoolean();
                    break;
                case 7:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.vG.icD.NB(str, yiwVar, fillType, vGVar, jd == null ? new com.bytedance.adsdk.lottie.vG.pvs.Jd(Collections.singletonList(new com.bytedance.adsdk.lottie.yiw.pvs(100))) : jd, sus2, sus3, null, null, z);
    }
}
