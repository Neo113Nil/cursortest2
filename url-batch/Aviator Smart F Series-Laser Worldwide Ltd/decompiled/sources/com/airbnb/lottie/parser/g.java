package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes.dex */
public class g implements n0 {
    public static final g INSTANCE = new g();

    private g() {
    }

    @Override // com.airbnb.lottie.parser.n0
    public Integer parse(JsonReader jsonReader, float f8) {
        boolean z7 = jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY;
        if (z7) {
            jsonReader.beginArray();
        }
        double nextDouble = jsonReader.nextDouble();
        double nextDouble2 = jsonReader.nextDouble();
        double nextDouble3 = jsonReader.nextDouble();
        double nextDouble4 = jsonReader.peek() == JsonReader.Token.NUMBER ? jsonReader.nextDouble() : 1.0d;
        if (z7) {
            jsonReader.endArray();
        }
        if (nextDouble <= 1.0d && nextDouble2 <= 1.0d && nextDouble3 <= 1.0d) {
            nextDouble *= 255.0d;
            nextDouble2 *= 255.0d;
            nextDouble3 *= 255.0d;
            if (nextDouble4 <= 1.0d) {
                nextDouble4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) nextDouble4, (int) nextDouble, (int) nextDouble2, (int) nextDouble3));
    }
}
