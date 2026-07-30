package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes.dex */
public class r implements n0 {
    public static final r INSTANCE = new r();

    private r() {
    }

    @Override // com.airbnb.lottie.parser.n0
    public Integer parse(JsonReader jsonReader, float f8) {
        return Integer.valueOf(Math.round(s.valueFromObject(jsonReader) * f8));
    }
}
