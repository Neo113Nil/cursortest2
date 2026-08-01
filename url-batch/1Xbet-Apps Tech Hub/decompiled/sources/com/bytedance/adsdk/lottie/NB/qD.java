package com.bytedance.adsdk.lottie.NB;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: ShapeGroupParser.java */
/* loaded from: classes.dex */
class qD {
    static com.bytedance.adsdk.lottie.vG.icD.mnm pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "hd":
                    z = jsonReader.nextBoolean();
                    break;
                case "it":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.bytedance.adsdk.lottie.vG.icD.vG pvs = so.pvs(jsonReader, sus);
                        if (pvs != null) {
                            arrayList.add(pvs);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.vG.icD.mnm(str, arrayList, z);
    }
}
