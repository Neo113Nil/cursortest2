package com.bytedance.adsdk.fs.btk;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes4.dex */
public class rc {
    private com.bytedance.adsdk.fs.zn.zmn.fs btk;
    private com.bytedance.adsdk.fs.zn.zmn.fs fb;
    private com.bytedance.adsdk.fs.zn.zmn.fs fs;
    private com.bytedance.adsdk.fs.zn.zmn.zmn zmn;
    private com.bytedance.adsdk.fs.zn.zmn.fs zn;

    iv zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar2;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar3;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar4;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    fs(jsonReader, npsVar);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        com.bytedance.adsdk.fs.zn.zmn.zmn zmnVar = this.zmn;
        if (zmnVar == null || (fsVar = this.fs) == null || (fsVar2 = this.zn) == null || (fsVar3 = this.fb) == null || (fsVar4 = this.btk) == null) {
            return null;
        }
        return new iv(zmnVar, fsVar, fsVar2, fsVar3, fsVar4);
    }

    private void fs(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("v")) {
                str.hashCode();
                switch (str) {
                    case "Distance":
                        this.fb = fb.zmn(jsonReader, npsVar);
                        break;
                    case "Opacity":
                        this.fs = fb.zmn(jsonReader, npsVar, false);
                        break;
                    case "Direction":
                        this.zn = fb.zmn(jsonReader, npsVar, false);
                        break;
                    case "Shadow Color":
                        this.zmn = fb.nps(jsonReader, npsVar);
                        break;
                    case "Softness":
                        this.btk = fb.zmn(jsonReader, npsVar);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            } else if (nextName.equals("nm")) {
                str = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }
}
