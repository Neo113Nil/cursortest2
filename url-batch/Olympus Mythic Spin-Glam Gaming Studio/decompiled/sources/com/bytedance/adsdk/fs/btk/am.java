package com.bytedance.adsdk.fs.btk;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.fs.zn.fs.iv;
import java.io.IOException;

/* loaded from: classes3.dex */
class am {
    static com.bytedance.adsdk.fs.zn.fs.iv zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar, int i) throws IOException {
        boolean z = false;
        boolean z2 = i == 3;
        String str = null;
        iv.zmn zmnVar = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar = null;
        com.bytedance.adsdk.fs.zn.zmn.mw<PointF, PointF> mwVar = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar2 = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar3 = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar4 = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar5 = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar6 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "d":
                    if (jsonReader.nextInt() != 3) {
                        z2 = false;
                        break;
                    } else {
                        z2 = true;
                        break;
                    }
                case "p":
                    mwVar = zmn.fs(jsonReader, npsVar);
                    break;
                case "r":
                    fsVar2 = fb.zmn(jsonReader, npsVar, false);
                    break;
                case "hd":
                    z = jsonReader.nextBoolean();
                    break;
                case "ir":
                    fsVar3 = fb.zmn(jsonReader, npsVar);
                    break;
                case "is":
                    fsVar5 = fb.zmn(jsonReader, npsVar, false);
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                case "or":
                    fsVar4 = fb.zmn(jsonReader, npsVar);
                    break;
                case "os":
                    fsVar6 = fb.zmn(jsonReader, npsVar, false);
                    break;
                case "pt":
                    fsVar = fb.zmn(jsonReader, npsVar, false);
                    break;
                case "sy":
                    zmnVar = iv.zmn.zmn(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.fs.zn.fs.iv(str, zmnVar, fsVar, mwVar, fsVar2, fsVar3, fsVar4, fsVar5, fsVar6, z, z2);
    }
}
