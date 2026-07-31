package com.bytedance.adsdk.fs.btk;

import android.graphics.Path;
import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes6.dex */
class hgd {
    static com.bytedance.adsdk.fs.zn.fs.cn zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        com.bytedance.adsdk.fs.zn.zmn.fb fbVar = null;
        String str = null;
        com.bytedance.adsdk.fs.zn.zmn.zmn zmnVar = null;
        boolean z = false;
        boolean z2 = false;
        int i = 1;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "fillEnabled":
                    z = jsonReader.nextBoolean();
                    break;
                case "c":
                    zmnVar = fb.nps(jsonReader, npsVar);
                    break;
                case "o":
                    fbVar = fb.fs(jsonReader, npsVar);
                    break;
                case "r":
                    i = jsonReader.nextInt();
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
        if (fbVar == null) {
            fbVar = new com.bytedance.adsdk.fs.zn.zmn.fb(Collections.singletonList(new com.bytedance.adsdk.fs.nps.zmn(100)));
        }
        return new com.bytedance.adsdk.fs.zn.fs.cn(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, zmnVar, fbVar, z2);
    }
}
