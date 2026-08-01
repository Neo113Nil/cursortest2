package com.bytedance.adsdk.lottie.NB;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: DropShadowEffectParser.java */
/* loaded from: classes.dex */
public class qh {
    private com.bytedance.adsdk.lottie.vG.pvs.icD Jd;
    private com.bytedance.adsdk.lottie.vG.pvs.icD NB;
    private com.bytedance.adsdk.lottie.vG.pvs.icD icD;
    private com.bytedance.adsdk.lottie.vG.pvs.pvs pvs;
    private com.bytedance.adsdk.lottie.vG.pvs.icD vG;

    Wyp pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    icD(jsonReader, sus);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        if (this.pvs == null || this.icD == null || this.vG == null || this.Jd == null || this.NB == null) {
            return null;
        }
        return new Wyp(this.pvs, this.icD, this.vG, this.Jd, this.NB);
    }

    private void icD(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("v")) {
                str.hashCode();
                switch (str) {
                    case "Distance":
                        this.Jd = Jd.pvs(jsonReader, sus);
                        break;
                    case "Opacity":
                        this.icD = Jd.pvs(jsonReader, sus, false);
                        break;
                    case "Direction":
                        this.vG = Jd.pvs(jsonReader, sus, false);
                        break;
                    case "Shadow Color":
                        this.pvs = Jd.yiw(jsonReader, sus);
                        break;
                    case "Softness":
                        this.NB = Jd.pvs(jsonReader, sus);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            } else if (nextName.equals("nm")) {
                str = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }
}
