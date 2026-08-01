package com.bytedance.adsdk.lottie.NB;

import android.util.JsonReader;
import com.bytedance.adsdk.lottie.vG.icD.Mxy;
import java.io.IOException;

/* compiled from: MergePathsParser.java */
/* loaded from: classes.dex */
class dyT {
    static com.bytedance.adsdk.lottie.vG.icD.Mxy pvs(JsonReader jsonReader) throws IOException {
        String str = null;
        Mxy.pvs pvsVar = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "hd":
                    z = jsonReader.nextBoolean();
                    break;
                case "mm":
                    pvsVar = Mxy.pvs.pvs(jsonReader.nextInt());
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.lottie.vG.icD.Mxy(str, pvsVar, z);
    }
}
