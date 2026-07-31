package com.bytedance.adsdk.fs.btk;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes3.dex */
public class fs {
    public static com.bytedance.adsdk.fs.zn.zmn.rc zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.fs.zn.zmn.rc rcVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("a")) {
                rcVar = fs(jsonReader, npsVar);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return rcVar == null ? new com.bytedance.adsdk.fs.zn.zmn.rc(null, null, null, null) : rcVar;
    }

    private static com.bytedance.adsdk.fs.zn.zmn.rc fs(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.fs.zn.zmn.zmn zmnVar = null;
        com.bytedance.adsdk.fs.zn.zmn.zmn zmnVar2 = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "t":
                    fsVar2 = fb.zmn(jsonReader, npsVar);
                    break;
                case "fc":
                    zmnVar = fb.nps(jsonReader, npsVar);
                    break;
                case "sc":
                    zmnVar2 = fb.nps(jsonReader, npsVar);
                    break;
                case "sw":
                    fsVar = fb.zmn(jsonReader, npsVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.fs.zn.zmn.rc(zmnVar, zmnVar2, fsVar, fsVar2);
    }
}
