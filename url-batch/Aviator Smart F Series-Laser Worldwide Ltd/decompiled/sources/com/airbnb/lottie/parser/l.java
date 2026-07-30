package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes.dex */
public class l implements n0 {
    public static final l INSTANCE = new l();

    private l() {
    }

    @Override // com.airbnb.lottie.parser.n0
    public Float parse(JsonReader jsonReader, float f8) {
        return Float.valueOf(s.valueFromObject(jsonReader) * f8);
    }
}
