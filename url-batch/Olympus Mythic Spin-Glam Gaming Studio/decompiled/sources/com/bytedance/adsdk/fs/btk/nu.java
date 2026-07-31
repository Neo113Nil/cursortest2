package com.bytedance.adsdk.fs.btk;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes5.dex */
class nu {
    static com.bytedance.adsdk.fs.zn.fs.cyb zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "hd":
                    z = jsonReader.nextBoolean();
                    break;
                case "it":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.bytedance.adsdk.fs.zn.fs.zn zmn = zg.zmn(jsonReader, npsVar);
                        if (zmn != null) {
                            arrayList.add(zmn);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.fs.zn.fs.cyb(str, arrayList, z);
    }
}
