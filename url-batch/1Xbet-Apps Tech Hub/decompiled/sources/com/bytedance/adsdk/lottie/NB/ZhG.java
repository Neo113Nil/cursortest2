package com.bytedance.adsdk.lottie.NB;

import android.util.JsonReader;
import com.bytedance.adsdk.lottie.vG.icD.so;
import java.io.IOException;

/* compiled from: MaskParser.java */
/* loaded from: classes.dex */
class ZhG {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if (r0.equals("s") == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.bytedance.adsdk.lottie.vG.icD.so pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        boolean z;
        jsonReader.beginObject();
        so.pvs pvsVar = null;
        com.bytedance.adsdk.lottie.vG.pvs.so soVar = null;
        com.bytedance.adsdk.lottie.vG.pvs.Jd jd = null;
        boolean z2 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 3;
            switch (nextName.hashCode()) {
                case 111:
                    if (nextName.equals("o")) {
                        z = false;
                        break;
                    }
                    z = -1;
                    break;
                case 3588:
                    if (nextName.equals("pt")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                case 104433:
                    if (nextName.equals("inv")) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                case 3357091:
                    if (nextName.equals("mode")) {
                        z = 3;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            switch (z) {
                case false:
                    jd = Jd.icD(jsonReader, sus);
                    break;
                case true:
                    soVar = Jd.NB(jsonReader, sus);
                    break;
                case true:
                    z2 = jsonReader.nextBoolean();
                    break;
                case true:
                    String nextString = jsonReader.nextString();
                    nextString.hashCode();
                    switch (nextString.hashCode()) {
                        case 97:
                            if (nextString.equals("a")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 105:
                            if (nextString.equals("i")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 110:
                            if (nextString.equals("n")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 115:
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            pvsVar = so.pvs.MASK_MODE_ADD;
                            break;
                        case 1:
                            sus.pvs("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            pvsVar = so.pvs.MASK_MODE_INTERSECT;
                            break;
                        case 2:
                            pvsVar = so.pvs.MASK_MODE_NONE;
                            break;
                        case 3:
                            pvsVar = so.pvs.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            pvsVar = so.pvs.MASK_MODE_ADD;
                            break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.lottie.vG.icD.so(pvsVar, soVar, jd, z2);
    }
}
