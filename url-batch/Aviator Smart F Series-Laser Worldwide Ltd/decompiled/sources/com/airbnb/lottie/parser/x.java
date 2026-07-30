package com.airbnb.lottie.parser;

import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;

/* loaded from: classes.dex */
class x {
    private x() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if (r0.equals("s") == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static Mask parse(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        char c8;
        jsonReader.beginObject();
        Mask.MaskMode maskMode = null;
        com.airbnb.lottie.model.animatable.h hVar2 = null;
        com.airbnb.lottie.model.animatable.d dVar = null;
        boolean z7 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c9 = 3;
            switch (nextName.hashCode()) {
                case 111:
                    if (nextName.equals("o")) {
                        c8 = 0;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 3588:
                    if (nextName.equals(com.moyoung.dafit.module.common.utils.u.LANGUAGE_PT)) {
                        c8 = 1;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 104433:
                    if (nextName.equals("inv")) {
                        c8 = 2;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 3357091:
                    if (nextName.equals("mode")) {
                        c8 = 3;
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
                    dVar = d.parseInteger(jsonReader, hVar);
                    break;
                case 1:
                    hVar2 = d.parseShapeData(jsonReader, hVar);
                    break;
                case 2:
                    z7 = jsonReader.nextBoolean();
                    break;
                case 3:
                    String nextString = jsonReader.nextString();
                    nextString.hashCode();
                    switch (nextString.hashCode()) {
                        case 97:
                            if (nextString.equals("a")) {
                                c9 = 0;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 105:
                            if (nextString.equals(CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT)) {
                                c9 = 1;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 110:
                            if (nextString.equals("n")) {
                                c9 = 2;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 115:
                            break;
                        default:
                            c9 = 65535;
                            break;
                    }
                    switch (c9) {
                        case 0:
                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                            break;
                        case 1:
                            hVar.addWarning("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            maskMode = Mask.MaskMode.MASK_MODE_INTERSECT;
                            break;
                        case 2:
                            maskMode = Mask.MaskMode.MASK_MODE_NONE;
                            break;
                        case 3:
                            maskMode = Mask.MaskMode.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            com.airbnb.lottie.utils.f.warning("Unknown mask mode " + nextName + ". Defaulting to Add.");
                            maskMode = Mask.MaskMode.MASK_MODE_ADD;
                            break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new Mask(maskMode, hVar2, dVar, z7);
    }
}
