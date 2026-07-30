package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes.dex */
public class g0 implements n0 {
    public static final g0 INSTANCE = new g0();

    private g0() {
    }

    @Override // com.airbnb.lottie.parser.n0
    public com.airbnb.lottie.value.d parse(JsonReader jsonReader, float f8) {
        boolean z7 = jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY;
        if (z7) {
            jsonReader.beginArray();
        }
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z7) {
            jsonReader.endArray();
        }
        return new com.airbnb.lottie.value.d((nextDouble / 100.0f) * f8, (nextDouble2 / 100.0f) * f8);
    }
}
