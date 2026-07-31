package com.bytedance.adsdk.fs.btk;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes4.dex */
class ww {
    static com.bytedance.adsdk.fs.zn.fs.olo zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        String str = null;
        com.bytedance.adsdk.fs.zn.zmn.zg zgVar = null;
        int i = 0;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "hd":
                    z = jsonReader.nextBoolean();
                    break;
                case "ks":
                    zgVar = fb.btk(jsonReader, npsVar);
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                case "ind":
                    i = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.fs.zn.fs.olo(str, i, zgVar, z);
    }
}
