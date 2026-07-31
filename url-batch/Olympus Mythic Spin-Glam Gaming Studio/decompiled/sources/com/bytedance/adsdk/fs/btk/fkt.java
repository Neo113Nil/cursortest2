package com.bytedance.adsdk.fs.btk;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class fkt implements vlj<com.bytedance.adsdk.fs.zn.fs.rt> {
    public static final fkt zmn = new fkt();

    private fkt() {
    }

    @Override // com.bytedance.adsdk.fs.btk.vlj
    /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.fs.zn.fs.rt fs(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List<PointF> list = null;
        boolean z = false;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "c":
                    z = jsonReader.nextBoolean();
                    break;
                case "i":
                    list2 = kw.zmn(jsonReader, f);
                    break;
                case "o":
                    list3 = kw.zmn(jsonReader, f);
                    break;
                case "v":
                    list = kw.zmn(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (jsonReader.peek() == JsonToken.END_ARRAY) {
            jsonReader.endArray();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (list.isEmpty()) {
            return new com.bytedance.adsdk.fs.zn.fs.rt(new PointF(), false, Collections.emptyList());
        }
        int size = list.size();
        PointF pointF = list.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = list.get(i);
            int i2 = i - 1;
            arrayList.add(new com.bytedance.adsdk.fs.zn.zmn(com.bytedance.adsdk.fs.hhw.btk.zmn(list.get(i2), list3.get(i2)), com.bytedance.adsdk.fs.hhw.btk.zmn(pointF2, list2.get(i)), pointF2));
        }
        if (z) {
            PointF pointF3 = list.get(0);
            int i3 = size - 1;
            arrayList.add(new com.bytedance.adsdk.fs.zn.zmn(com.bytedance.adsdk.fs.hhw.btk.zmn(list.get(i3), list3.get(i3)), com.bytedance.adsdk.fs.hhw.btk.zmn(pointF3, list2.get(0)), pointF3));
        }
        return new com.bytedance.adsdk.fs.zn.fs.rt(pointF, z, arrayList);
    }
}
