package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes.dex */
public class b0 implements n0 {
    public static final b0 INSTANCE = new b0();

    private b0() {
    }

    @Override // com.airbnb.lottie.parser.n0
    public PointF parse(JsonReader jsonReader, float f8) {
        JsonReader.Token peek = jsonReader.peek();
        if (peek == JsonReader.Token.BEGIN_ARRAY) {
            return s.jsonToPoint(jsonReader, f8);
        }
        if (peek == JsonReader.Token.BEGIN_OBJECT) {
            return s.jsonToPoint(jsonReader, f8);
        }
        if (peek == JsonReader.Token.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f8, ((float) jsonReader.nextDouble()) * f8);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + peek);
    }
}
