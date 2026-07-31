package com.bytedance.adsdk.fs.btk;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public class zmn {
    public static com.bytedance.adsdk.fs.zn.zmn.btk zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(rp.zmn(jsonReader, npsVar));
            }
            jsonReader.endArray();
            phc.zmn(arrayList);
        } else {
            arrayList.add(new com.bytedance.adsdk.fs.nps.zmn(kw.fs(jsonReader, com.bytedance.adsdk.fs.hhw.hhw.zmn())));
        }
        return new com.bytedance.adsdk.fs.zn.zmn.btk(arrayList);
    }

    static com.bytedance.adsdk.fs.zn.zmn.mw<PointF, PointF> fs(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.fs.zn.zmn.btk btkVar = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar2 = null;
        boolean z = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "k":
                    btkVar = zmn(jsonReader, npsVar);
                    break;
                case "x":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        fsVar = fb.zmn(jsonReader, npsVar);
                        break;
                    } else {
                        z = true;
                        jsonReader.skipValue();
                        break;
                    }
                case "y":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        fsVar2 = fb.zmn(jsonReader, npsVar);
                        break;
                    } else {
                        z = true;
                        jsonReader.skipValue();
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            npsVar.zmn("Lottie doesn't support expressions.");
        }
        return btkVar != null ? btkVar : new com.bytedance.adsdk.fs.zn.zmn.bvs(fsVar, fsVar2);
    }
}
