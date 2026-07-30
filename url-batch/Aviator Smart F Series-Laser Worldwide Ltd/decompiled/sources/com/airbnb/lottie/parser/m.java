package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;

/* loaded from: classes.dex */
class m {
    private static final JsonReader.a NAMES = JsonReader.a.of("ch", "size", "w", TtmlNode.TAG_STYLE, "fFamily", "data");
    private static final JsonReader.a DATA_NAMES = JsonReader.a.of("shapes");

    private m() {
    }

    static com.airbnb.lottie.model.c parse(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        double d8 = 0.0d;
        String str = null;
        String str2 = null;
        double d9 = 0.0d;
        char c8 = 0;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(NAMES);
            if (selectName == 0) {
                c8 = jsonReader.nextString().charAt(0);
            } else if (selectName == 1) {
                d9 = jsonReader.nextDouble();
            } else if (selectName == 2) {
                d8 = jsonReader.nextDouble();
            } else if (selectName == 3) {
                str = jsonReader.nextString();
            } else if (selectName == 4) {
                str2 = jsonReader.nextString();
            } else if (selectName != 5) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    if (jsonReader.selectName(DATA_NAMES) != 0) {
                        jsonReader.skipName();
                        jsonReader.skipValue();
                    } else {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add((com.airbnb.lottie.model.content.l) h.parse(jsonReader, hVar));
                        }
                        jsonReader.endArray();
                    }
                }
                jsonReader.endObject();
            }
        }
        jsonReader.endObject();
        return new com.airbnb.lottie.model.c(arrayList, c8, d9, d8, str, str2);
    }
}
