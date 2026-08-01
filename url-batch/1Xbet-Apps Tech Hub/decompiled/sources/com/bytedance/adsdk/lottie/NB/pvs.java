package com.bytedance.adsdk.lottie.NB;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: AnimatablePathValueParser.java */
/* loaded from: classes.dex */
public class pvs {
    public static com.bytedance.adsdk.lottie.vG.pvs.NB pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(dX.pvs(jsonReader, sus));
            }
            jsonReader.endArray();
            rCZ.pvs(arrayList);
        } else {
            arrayList.add(new com.bytedance.adsdk.lottie.yiw.pvs(zM.icD(jsonReader, com.bytedance.adsdk.lottie.sUS.sUS.pvs())));
        }
        return new com.bytedance.adsdk.lottie.vG.pvs.NB(arrayList);
    }

    static com.bytedance.adsdk.lottie.vG.pvs.Ju<PointF, PointF> icD(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.lottie.vG.pvs.NB nb = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd2 = null;
        boolean z = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "k":
                    nb = pvs(jsonReader, sus);
                    break;
                case "x":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        icd = Jd.pvs(jsonReader, sus);
                        break;
                    } else {
                        z = true;
                        jsonReader.skipValue();
                        break;
                    }
                case "y":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        icd2 = Jd.pvs(jsonReader, sus);
                        break;
                    } else {
                        z = true;
                        jsonReader.skipValue();
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            sus.pvs("Lottie doesn't support expressions.");
        }
        return nb != null ? nb : new com.bytedance.adsdk.lottie.vG.pvs.Mxy(icd, icd2);
    }
}
