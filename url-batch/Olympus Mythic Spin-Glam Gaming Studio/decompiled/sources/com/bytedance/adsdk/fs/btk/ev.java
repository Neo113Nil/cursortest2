package com.bytedance.adsdk.fs.btk;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes3.dex */
public class ev {
    static com.bytedance.adsdk.fs.zn.fs.mw zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        String str = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "r":
                    fsVar = fb.zmn(jsonReader, npsVar, true);
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
        if (z) {
            return null;
        }
        return new com.bytedance.adsdk.fs.zn.fs.mw(str, fsVar);
    }
}
