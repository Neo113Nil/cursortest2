package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class u {
    static JsonReader.a NAMES = JsonReader.a.of(com.baidu.ar.k.f2621r);

    private u() {
    }

    static <T> List<com.airbnb.lottie.value.a> parse(JsonReader jsonReader, com.airbnb.lottie.h hVar, float f8, n0 n0Var, boolean z7) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonReader.Token.STRING) {
            hVar.addWarning("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(NAMES) != 0) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonReader.Token.NUMBER) {
                    arrayList.add(t.parse(jsonReader, hVar, f8, n0Var, false, z7));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(t.parse(jsonReader, hVar, f8, n0Var, true, z7));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(t.parse(jsonReader, hVar, f8, n0Var, false, z7));
            }
        }
        jsonReader.endObject();
        setEndFrames(arrayList);
        return arrayList;
    }

    public static <T> void setEndFrames(List<? extends com.airbnb.lottie.value.a> list) {
        int i8;
        Object obj;
        int size = list.size();
        int i9 = 0;
        while (true) {
            i8 = size - 1;
            if (i9 >= i8) {
                break;
            }
            com.airbnb.lottie.value.a aVar = list.get(i9);
            i9++;
            com.airbnb.lottie.value.a aVar2 = list.get(i9);
            aVar.endFrame = Float.valueOf(aVar2.startFrame);
            if (aVar.endValue == null && (obj = aVar2.startValue) != null) {
                aVar.endValue = obj;
                if (aVar instanceof com.airbnb.lottie.animation.keyframe.i) {
                    ((com.airbnb.lottie.animation.keyframe.i) aVar).createPath();
                }
            }
        }
        com.airbnb.lottie.value.a aVar3 = list.get(i8);
        if ((aVar3.startValue == null || aVar3.endValue == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
