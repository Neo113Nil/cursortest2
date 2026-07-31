package com.bytedance.adsdk.fs.btk;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes4.dex */
class yj {
    static com.bytedance.adsdk.fs.zn.fs.rc zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        String str = null;
        com.bytedance.adsdk.fs.zn.zmn.mw<PointF, PointF> mwVar = null;
        com.bytedance.adsdk.fs.zn.zmn.hhw hhwVar = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "p":
                    mwVar = zmn.fs(jsonReader, npsVar);
                    break;
                case "r":
                    fsVar = fb.zmn(jsonReader, npsVar);
                    break;
                case "s":
                    hhwVar = fb.zn(jsonReader, npsVar);
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
        return new com.bytedance.adsdk.fs.zn.fs.rc(str, mwVar, hhwVar, fsVar, z);
    }
}
