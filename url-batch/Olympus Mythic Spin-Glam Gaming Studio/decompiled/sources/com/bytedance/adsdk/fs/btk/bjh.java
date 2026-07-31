package com.bytedance.adsdk.fs.btk;

import android.util.JsonReader;
import com.bytedance.adsdk.fs.zn.fs.bvs;
import java.io.IOException;

/* loaded from: classes4.dex */
class bjh {
    static com.bytedance.adsdk.fs.zn.fs.bvs zmn(JsonReader jsonReader) throws IOException {
        String str = null;
        bvs.zmn zmnVar = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "hd":
                    z = jsonReader.nextBoolean();
                    break;
                case "mm":
                    zmnVar = bvs.zmn.zmn(jsonReader.nextInt());
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.fs.zn.fs.bvs(str, zmnVar, z);
    }
}
