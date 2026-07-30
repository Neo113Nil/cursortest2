package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.baidu.ar.sa;

/* loaded from: classes.dex */
public class c {
    private static final JsonReader.a NAMES = JsonReader.a.of("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", sa.f3204e);
    private static final JsonReader.a ANIMATABLE_NAMES = JsonReader.a.of(com.baidu.ar.k.f2621r);

    private c() {
    }

    private static boolean isAnchorPointIdentity(com.airbnb.lottie.model.animatable.e eVar) {
        return eVar == null || (eVar.isStatic() && ((PointF) eVar.getKeyframes().get(0).startValue).equals(0.0f, 0.0f));
    }

    private static boolean isPositionIdentity(com.airbnb.lottie.model.animatable.m mVar) {
        return mVar == null || (!(mVar instanceof com.airbnb.lottie.model.animatable.i) && mVar.isStatic() && ((PointF) mVar.getKeyframes().get(0).startValue).equals(0.0f, 0.0f));
    }

    private static boolean isRotationIdentity(com.airbnb.lottie.model.animatable.b bVar) {
        return bVar == null || (bVar.isStatic() && ((Float) ((com.airbnb.lottie.value.a) bVar.getKeyframes().get(0)).startValue).floatValue() == 0.0f);
    }

    private static boolean isScaleIdentity(com.airbnb.lottie.model.animatable.g gVar) {
        return gVar == null || (gVar.isStatic() && ((com.airbnb.lottie.value.d) ((com.airbnb.lottie.value.a) gVar.getKeyframes().get(0)).startValue).equals(1.0f, 1.0f));
    }

    private static boolean isSkewAngleIdentity(com.airbnb.lottie.model.animatable.b bVar) {
        return bVar == null || (bVar.isStatic() && ((Float) ((com.airbnb.lottie.value.a) bVar.getKeyframes().get(0)).startValue).floatValue() == 0.0f);
    }

    private static boolean isSkewIdentity(com.airbnb.lottie.model.animatable.b bVar) {
        return bVar == null || (bVar.isStatic() && ((Float) ((com.airbnb.lottie.value.a) bVar.getKeyframes().get(0)).startValue).floatValue() == 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.airbnb.lottie.model.animatable.l parse(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        com.airbnb.lottie.model.animatable.b parseFloat;
        boolean z7 = false;
        boolean z8 = jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT;
        if (z8) {
            jsonReader.beginObject();
        }
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.animatable.e eVar = null;
        com.airbnb.lottie.model.animatable.m mVar = null;
        com.airbnb.lottie.model.animatable.g gVar = null;
        com.airbnb.lottie.model.animatable.b bVar2 = null;
        com.airbnb.lottie.model.animatable.b bVar3 = null;
        com.airbnb.lottie.model.animatable.d dVar = null;
        com.airbnb.lottie.model.animatable.b bVar4 = null;
        com.airbnb.lottie.model.animatable.b bVar5 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.selectName(ANIMATABLE_NAMES) != 0) {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        } else {
                            eVar = a.parse(jsonReader, hVar);
                        }
                    }
                    jsonReader.endObject();
                    z7 = false;
                    break;
                case 1:
                    mVar = a.parseSplitPath(jsonReader, hVar);
                    z7 = false;
                    break;
                case 2:
                    gVar = d.parseScale(jsonReader, hVar);
                    z7 = false;
                    break;
                case 3:
                    hVar.addWarning("Lottie doesn't support 3D layers.");
                    parseFloat = d.parseFloat(jsonReader, hVar, z7);
                    if (!parseFloat.getKeyframes().isEmpty()) {
                        parseFloat.getKeyframes().add(new com.airbnb.lottie.value.a(hVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(hVar.getEndFrame())));
                    } else if (((com.airbnb.lottie.value.a) parseFloat.getKeyframes().get(0)).startValue == null) {
                        parseFloat.getKeyframes().set(0, new com.airbnb.lottie.value.a(hVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(hVar.getEndFrame())));
                        bVar = parseFloat;
                        z7 = false;
                        break;
                    }
                    bVar = parseFloat;
                    z7 = false;
                case 4:
                    parseFloat = d.parseFloat(jsonReader, hVar, z7);
                    if (!parseFloat.getKeyframes().isEmpty()) {
                    }
                    bVar = parseFloat;
                    z7 = false;
                    break;
                case 5:
                    dVar = d.parseInteger(jsonReader, hVar);
                    break;
                case 6:
                    bVar4 = d.parseFloat(jsonReader, hVar, z7);
                    break;
                case 7:
                    bVar5 = d.parseFloat(jsonReader, hVar, z7);
                    break;
                case 8:
                    bVar2 = d.parseFloat(jsonReader, hVar, z7);
                    break;
                case 9:
                    bVar3 = d.parseFloat(jsonReader, hVar, z7);
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
            }
        }
        if (z8) {
            jsonReader.endObject();
        }
        com.airbnb.lottie.model.animatable.e eVar2 = isAnchorPointIdentity(eVar) ? null : eVar;
        com.airbnb.lottie.model.animatable.m mVar2 = isPositionIdentity(mVar) ? null : mVar;
        com.airbnb.lottie.model.animatable.b bVar6 = isRotationIdentity(bVar) ? null : bVar;
        if (isScaleIdentity(gVar)) {
            gVar = null;
        }
        return new com.airbnb.lottie.model.animatable.l(eVar2, mVar2, gVar, bVar6, dVar, bVar4, bVar5, isSkewIdentity(bVar2) ? null : bVar2, isSkewAngleIdentity(bVar3) ? null : bVar3);
    }
}
