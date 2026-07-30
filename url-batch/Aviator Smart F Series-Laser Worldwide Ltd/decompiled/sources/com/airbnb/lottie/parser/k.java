package com.airbnb.lottie.parser;

import androidx.annotation.Nullable;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* loaded from: classes.dex */
public class k {
    private static final JsonReader.a DROP_SHADOW_EFFECT_NAMES = JsonReader.a.of("ef");
    private static final JsonReader.a INNER_EFFECT_NAMES = JsonReader.a.of("nm", "v");
    private com.airbnb.lottie.model.animatable.a color;
    private com.airbnb.lottie.model.animatable.b direction;
    private com.airbnb.lottie.model.animatable.b distance;
    private com.airbnb.lottie.model.animatable.b opacity;
    private com.airbnb.lottie.model.animatable.b radius;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0052, code lost:
    
        if (r0.equals("Opacity") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void maybeParseInnerEffect(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(INNER_EFFECT_NAMES);
            if (selectName != 0) {
                char c8 = 1;
                if (selectName == 1) {
                    str.hashCode();
                    switch (str.hashCode()) {
                        case 353103893:
                            if (str.equals("Distance")) {
                                c8 = 0;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 397447147:
                            break;
                        case 1041377119:
                            if (str.equals("Direction")) {
                                c8 = 2;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 1379387491:
                            if (str.equals("Shadow Color")) {
                                c8 = 3;
                                break;
                            }
                            c8 = 65535;
                            break;
                        case 1383710113:
                            if (str.equals("Softness")) {
                                c8 = 4;
                                break;
                            }
                            c8 = 65535;
                            break;
                        default:
                            c8 = 65535;
                            break;
                    }
                    switch (c8) {
                        case 0:
                            this.distance = d.parseFloat(jsonReader, hVar);
                            break;
                        case 1:
                            this.opacity = d.parseFloat(jsonReader, hVar, false);
                            break;
                        case 2:
                            this.direction = d.parseFloat(jsonReader, hVar, false);
                            break;
                        case 3:
                            this.color = d.parseColor(jsonReader, hVar);
                            break;
                        case 4:
                            this.radius = d.parseFloat(jsonReader, hVar);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                } else {
                    jsonReader.skipName();
                    jsonReader.skipValue();
                }
            } else {
                str = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
    }

    @Nullable
    j parse(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        com.airbnb.lottie.model.animatable.b bVar;
        com.airbnb.lottie.model.animatable.b bVar2;
        com.airbnb.lottie.model.animatable.b bVar3;
        com.airbnb.lottie.model.animatable.b bVar4;
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(DROP_SHADOW_EFFECT_NAMES) != 0) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    maybeParseInnerEffect(jsonReader, hVar);
                }
                jsonReader.endArray();
            }
        }
        com.airbnb.lottie.model.animatable.a aVar = this.color;
        if (aVar == null || (bVar = this.opacity) == null || (bVar2 = this.direction) == null || (bVar3 = this.distance) == null || (bVar4 = this.radius) == null) {
            return null;
        }
        return new j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
