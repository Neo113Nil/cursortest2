package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class h0 implements n0 {
    public static final h0 INSTANCE = new h0();
    private static final JsonReader.a NAMES = JsonReader.a.of("c", "v", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "o");

    private h0() {
    }

    @Override // com.airbnb.lottie.parser.n0
    public com.airbnb.lottie.model.content.j parse(JsonReader jsonReader, float f8) {
        if (jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z7 = false;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(NAMES);
            if (selectName == 0) {
                z7 = jsonReader.nextBoolean();
            } else if (selectName == 1) {
                list = s.jsonToPoints(jsonReader, f8);
            } else if (selectName == 2) {
                list2 = s.jsonToPoints(jsonReader, f8);
            } else if (selectName != 3) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                list3 = s.jsonToPoints(jsonReader, f8);
            }
        }
        jsonReader.endObject();
        if (jsonReader.peek() == JsonReader.Token.END_ARRAY) {
            jsonReader.endArray();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (list.isEmpty()) {
            return new com.airbnb.lottie.model.content.j(new PointF(), false, Collections.emptyList());
        }
        int size = list.size();
        PointF pointF = list.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i8 = 1; i8 < size; i8++) {
            PointF pointF2 = list.get(i8);
            int i9 = i8 - 1;
            arrayList.add(new com.airbnb.lottie.model.a(com.airbnb.lottie.utils.i.addPoints(list.get(i9), list3.get(i9)), com.airbnb.lottie.utils.i.addPoints(pointF2, list2.get(i8)), pointF2));
        }
        if (z7) {
            PointF pointF3 = list.get(0);
            int i10 = size - 1;
            arrayList.add(new com.airbnb.lottie.model.a(com.airbnb.lottie.utils.i.addPoints(list.get(i10), list3.get(i10)), com.airbnb.lottie.utils.i.addPoints(pointF3, list2.get(0)), pointF3));
        }
        return new com.airbnb.lottie.model.content.j(pointF, z7, arrayList);
    }
}
