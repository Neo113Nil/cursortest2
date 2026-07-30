package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes.dex */
public class a0 implements n0 {
    public static final a0 INSTANCE = new a0();

    private a0() {
    }

    @Override // com.airbnb.lottie.parser.n0
    public PointF parse(JsonReader jsonReader, float f8) {
        return s.jsonToPoint(jsonReader, f8);
    }
}
