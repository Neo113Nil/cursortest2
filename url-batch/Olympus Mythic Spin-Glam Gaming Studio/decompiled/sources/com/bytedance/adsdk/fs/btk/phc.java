package com.bytedance.adsdk.fs.btk;

import android.util.JsonReader;
import android.util.JsonToken;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
class phc {
    static <T> List<com.bytedance.adsdk.fs.nps.zmn<T>> zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar, float f, vlj<T> vljVar, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            npsVar.zmn("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals(CampaignEx.JSON_KEY_AD_K)) {
                if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                    jsonReader.beginArray();
                    if (jsonReader.peek() == JsonToken.NUMBER) {
                        arrayList.add(iqz.zmn(jsonReader, npsVar, f, vljVar, false, z));
                    } else {
                        while (jsonReader.hasNext()) {
                            arrayList.add(iqz.zmn(jsonReader, npsVar, f, vljVar, true, z));
                        }
                    }
                    jsonReader.endArray();
                } else {
                    arrayList.add(iqz.zmn(jsonReader, npsVar, f, vljVar, false, z));
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        zmn(arrayList);
        return arrayList;
    }

    public static <T> void zmn(List<? extends com.bytedance.adsdk.fs.nps.zmn<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            com.bytedance.adsdk.fs.nps.zmn<T> zmnVar = list.get(i2);
            i2++;
            com.bytedance.adsdk.fs.nps.zmn<T> zmnVar2 = list.get(i2);
            zmnVar.nps = Float.valueOf(zmnVar2.hhw);
            if (zmnVar.fs == null && (t = zmnVar2.zmn) != null) {
                zmnVar.fs = t;
                if (zmnVar instanceof com.bytedance.adsdk.fs.zmn.fs.bvs) {
                    ((com.bytedance.adsdk.fs.zmn.fs.bvs) zmnVar).zmn();
                }
            }
        }
        com.bytedance.adsdk.fs.nps.zmn<T> zmnVar3 = list.get(i);
        if ((zmnVar3.zmn == null || zmnVar3.fs == null) && list.size() > 1) {
            list.remove(zmnVar3);
        }
    }
}
