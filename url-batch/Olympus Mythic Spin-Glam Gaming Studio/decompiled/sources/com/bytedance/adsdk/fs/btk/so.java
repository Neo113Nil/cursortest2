package com.bytedance.adsdk.fs.btk;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes4.dex */
class so {
    static com.bytedance.adsdk.fs.zn.fs.klz zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        String str = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar2 = null;
        com.bytedance.adsdk.fs.zn.zmn.klz klzVar = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "c":
                    fsVar = fb.zmn(jsonReader, npsVar, false);
                    break;
                case "o":
                    fsVar2 = fb.zmn(jsonReader, npsVar, false);
                    break;
                case "hd":
                    z = jsonReader.nextBoolean();
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                case "tr":
                    klzVar = zn.zmn(jsonReader, npsVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.fs.zn.fs.klz(str, fsVar, fsVar2, klzVar, z);
    }
}
