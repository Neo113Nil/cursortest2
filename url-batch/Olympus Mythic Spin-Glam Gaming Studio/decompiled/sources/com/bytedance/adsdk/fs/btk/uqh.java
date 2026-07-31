package com.bytedance.adsdk.fs.btk;

import android.util.JsonReader;
import com.bytedance.adsdk.fs.zn.fs.zg;
import com.ironsource.X3;
import java.io.IOException;

/* loaded from: classes8.dex */
class uqh {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static com.bytedance.adsdk.fs.zn.fs.zg zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        boolean z;
        boolean z2;
        jsonReader.beginObject();
        zg.zmn zmnVar = null;
        com.bytedance.adsdk.fs.zn.zmn.zg zgVar = null;
        com.bytedance.adsdk.fs.zn.zmn.fb fbVar = null;
        boolean z3 = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
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
                    if (nextName.equals(X3.a.t)) {
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
                    fbVar = fb.fs(jsonReader, npsVar);
                    break;
                case true:
                    zgVar = fb.btk(jsonReader, npsVar);
                    break;
                case true:
                    z3 = jsonReader.nextBoolean();
                    break;
                case true:
                    String nextString = jsonReader.nextString();
                    nextString.hashCode();
                    switch (nextString.hashCode()) {
                        case 97:
                            if (nextString.equals("a")) {
                                z2 = false;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 105:
                            if (nextString.equals("i")) {
                                z2 = true;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 110:
                            if (nextString.equals("n")) {
                                z2 = 2;
                                break;
                            }
                            z2 = -1;
                            break;
                        case 115:
                            if (nextString.equals("s")) {
                                z2 = 3;
                                break;
                            }
                            z2 = -1;
                            break;
                        default:
                            z2 = -1;
                            break;
                    }
                    switch (z2) {
                        case false:
                            zmnVar = zg.zmn.MASK_MODE_ADD;
                            break;
                        case true:
                            npsVar.zmn("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            zmnVar = zg.zmn.MASK_MODE_INTERSECT;
                            break;
                        case true:
                            zmnVar = zg.zmn.MASK_MODE_NONE;
                            break;
                        case true:
                            zmnVar = zg.zmn.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            zmnVar = zg.zmn.MASK_MODE_ADD;
                            break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.fs.zn.fs.zg(zmnVar, zgVar, fbVar, z3);
    }
}
