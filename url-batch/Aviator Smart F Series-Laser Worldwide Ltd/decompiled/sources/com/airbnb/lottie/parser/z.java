package com.airbnb.lottie.parser;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes.dex */
class z {
    private z() {
    }

    static com.airbnb.lottie.animation.keyframe.i parse(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        return new com.airbnb.lottie.animation.keyframe.i(hVar, t.parse(jsonReader, hVar, com.airbnb.lottie.utils.j.dpScale(), a0.INSTANCE, jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT, false));
    }
}
