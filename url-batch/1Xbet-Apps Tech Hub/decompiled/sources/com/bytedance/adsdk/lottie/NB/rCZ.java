package com.bytedance.adsdk.lottie.NB;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: KeyframesParser.java */
/* loaded from: classes.dex */
class rCZ {
    static <T> List<com.bytedance.adsdk.lottie.yiw.pvs<T>> pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus, float f, SE<T> se, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            sus.pvs("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("k")) {
                if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                    jsonReader.beginArray();
                    if (jsonReader.peek() == JsonToken.NUMBER) {
                        arrayList.add(uc.pvs(jsonReader, sus, f, se, false, z));
                    } else {
                        while (jsonReader.hasNext()) {
                            arrayList.add(uc.pvs(jsonReader, sus, f, se, true, z));
                        }
                    }
                    jsonReader.endArray();
                } else {
                    arrayList.add(uc.pvs(jsonReader, sus, f, se, false, z));
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        pvs(arrayList);
        return arrayList;
    }

    public static <T> void pvs(List<? extends com.bytedance.adsdk.lottie.yiw.pvs<T>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            com.bytedance.adsdk.lottie.yiw.pvs<T> pvsVar = list.get(i2);
            i2++;
            com.bytedance.adsdk.lottie.yiw.pvs<T> pvsVar2 = list.get(i2);
            pvsVar.yiw = Float.valueOf(pvsVar2.sUS);
            if (pvsVar.icD == null && pvsVar2.pvs != null) {
                pvsVar.icD = pvsVar2.pvs;
                if (pvsVar instanceof com.bytedance.adsdk.lottie.pvs.icD.Mxy) {
                    ((com.bytedance.adsdk.lottie.pvs.icD.Mxy) pvsVar).pvs();
                }
            }
        }
        com.bytedance.adsdk.lottie.yiw.pvs<T> pvsVar3 = list.get(i);
        if ((pvsVar3.pvs == null || pvsVar3.icD == null) && list.size() > 1) {
            list.remove(pvsVar3);
        }
    }
}
