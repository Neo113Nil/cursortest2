package com.bytedance.adsdk.fs.btk;

import android.util.JsonReader;
import com.bytedance.adsdk.fs.zn.fs.kw;
import java.io.IOException;

/* loaded from: classes5.dex */
class jy {
    static com.bytedance.adsdk.fs.zn.fs.kw zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        String str = null;
        kw.zmn zmnVar = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar2 = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar3 = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "e":
                    fsVar2 = fb.zmn(jsonReader, npsVar, false);
                    break;
                case "m":
                    zmnVar = kw.zmn.zmn(jsonReader.nextInt());
                    break;
                case "o":
                    fsVar3 = fb.zmn(jsonReader, npsVar, false);
                    break;
                case "s":
                    fsVar = fb.zmn(jsonReader, npsVar, false);
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
        return new com.bytedance.adsdk.fs.zn.fs.kw(str, zmnVar, fsVar, fsVar2, fsVar3, z);
    }
}
