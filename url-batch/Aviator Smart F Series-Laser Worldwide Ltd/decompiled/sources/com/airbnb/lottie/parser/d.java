package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.List;

/* loaded from: classes.dex */
public class d {
    private d() {
    }

    private static <T> List<com.airbnb.lottie.value.a> parse(JsonReader jsonReader, com.airbnb.lottie.h hVar, n0 n0Var) {
        return u.parse(jsonReader, hVar, 1.0f, n0Var, false);
    }

    static com.airbnb.lottie.model.animatable.a parseColor(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        return new com.airbnb.lottie.model.animatable.a(parse(jsonReader, hVar, g.INSTANCE));
    }

    static com.airbnb.lottie.model.animatable.j parseDocumentData(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        return new com.airbnb.lottie.model.animatable.j(parse(jsonReader, hVar, i.INSTANCE));
    }

    public static com.airbnb.lottie.model.animatable.b parseFloat(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        return parseFloat(jsonReader, hVar, true);
    }

    static com.airbnb.lottie.model.animatable.c parseGradientColor(JsonReader jsonReader, com.airbnb.lottie.h hVar, int i8) {
        return new com.airbnb.lottie.model.animatable.c(parse(jsonReader, hVar, new o(i8)));
    }

    static com.airbnb.lottie.model.animatable.d parseInteger(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        return new com.airbnb.lottie.model.animatable.d(parse(jsonReader, hVar, r.INSTANCE));
    }

    static com.airbnb.lottie.model.animatable.f parsePoint(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        return new com.airbnb.lottie.model.animatable.f(u.parse(jsonReader, hVar, com.airbnb.lottie.utils.j.dpScale(), b0.INSTANCE, true));
    }

    static com.airbnb.lottie.model.animatable.g parseScale(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        return new com.airbnb.lottie.model.animatable.g(parse(jsonReader, hVar, g0.INSTANCE));
    }

    static com.airbnb.lottie.model.animatable.h parseShapeData(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        return new com.airbnb.lottie.model.animatable.h(parse(jsonReader, com.airbnb.lottie.utils.j.dpScale(), hVar, h0.INSTANCE));
    }

    private static <T> List<com.airbnb.lottie.value.a> parse(JsonReader jsonReader, float f8, com.airbnb.lottie.h hVar, n0 n0Var) {
        return u.parse(jsonReader, hVar, f8, n0Var, false);
    }

    public static com.airbnb.lottie.model.animatable.b parseFloat(JsonReader jsonReader, com.airbnb.lottie.h hVar, boolean z7) {
        return new com.airbnb.lottie.model.animatable.b(parse(jsonReader, z7 ? com.airbnb.lottie.utils.j.dpScale() : 1.0f, hVar, l.INSTANCE));
    }
}
