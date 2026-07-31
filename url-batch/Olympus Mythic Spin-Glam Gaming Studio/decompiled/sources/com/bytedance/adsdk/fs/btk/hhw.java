package com.bytedance.adsdk.fs.btk;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes6.dex */
class hhw {
    static com.bytedance.adsdk.fs.zn.fs.fs zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar, int i) throws IOException {
        boolean z = i == 3;
        boolean z2 = false;
        String str = null;
        com.bytedance.adsdk.fs.zn.zmn.mw<PointF, PointF> mwVar = null;
        com.bytedance.adsdk.fs.zn.zmn.hhw hhwVar = null;
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
                    mwVar = zmn.fs(jsonReader, npsVar);
                    break;
                case "s":
                    hhwVar = fb.zn(jsonReader, npsVar);
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
        return new com.bytedance.adsdk.fs.zn.fs.fs(str, mwVar, hhwVar, z, z2);
    }
}
