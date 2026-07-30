package com.airbnb.lottie.parser;

import androidx.annotation.Nullable;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.android.exoplayer2.upstream.CmcdConfiguration;

/* loaded from: classes.dex */
class h {
    private static final JsonReader.a NAMES = JsonReader.a.of(MapBundleKey.MapObjKey.OBJ_TYPE, "d");

    private h() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00c2, code lost:
    
        if (r2.equals("gf") == false) goto L16;
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.airbnb.lottie.model.content.c parse(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        com.airbnb.lottie.model.content.c cVar;
        String str;
        jsonReader.beginObject();
        char c8 = 2;
        int i8 = 2;
        while (true) {
            cVar = null;
            if (!jsonReader.hasNext()) {
                str = null;
                break;
            }
            int selectName = jsonReader.selectName(NAMES);
            if (selectName == 0) {
                str = jsonReader.nextString();
                break;
            }
            if (selectName != 1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                i8 = jsonReader.nextInt();
            }
        }
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 3239:
                if (str.equals("el")) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case 3270:
                if (str.equals("fl")) {
                    c8 = 1;
                    break;
                }
                c8 = 65535;
                break;
            case 3295:
                break;
            case 3307:
                if (str.equals("gr")) {
                    c8 = 3;
                    break;
                }
                c8 = 65535;
                break;
            case 3308:
                if (str.equals("gs")) {
                    c8 = 4;
                    break;
                }
                c8 = 65535;
                break;
            case 3488:
                if (str.equals("mm")) {
                    c8 = 5;
                    break;
                }
                c8 = 65535;
                break;
            case 3633:
                if (str.equals("rc")) {
                    c8 = 6;
                    break;
                }
                c8 = 65535;
                break;
            case 3634:
                if (str.equals("rd")) {
                    c8 = 7;
                    break;
                }
                c8 = 65535;
                break;
            case 3646:
                if (str.equals("rp")) {
                    c8 = '\b';
                    break;
                }
                c8 = 65535;
                break;
            case 3669:
                if (str.equals("sh")) {
                    c8 = '\t';
                    break;
                }
                c8 = 65535;
                break;
            case 3679:
                if (str.equals("sr")) {
                    c8 = '\n';
                    break;
                }
                c8 = 65535;
                break;
            case 3681:
                if (str.equals(CmcdConfiguration.KEY_STREAM_TYPE)) {
                    c8 = 11;
                    break;
                }
                c8 = 65535;
                break;
            case 3705:
                if (str.equals("tm")) {
                    c8 = '\f';
                    break;
                }
                c8 = 65535;
                break;
            case 3710:
                if (str.equals("tr")) {
                    c8 = '\r';
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
                cVar = f.parse(jsonReader, hVar, i8);
                break;
            case 1:
                cVar = i0.parse(jsonReader, hVar);
                break;
            case 2:
                cVar = p.parse(jsonReader, hVar);
                break;
            case 3:
                cVar = j0.parse(jsonReader, hVar);
                break;
            case 4:
                cVar = q.parse(jsonReader, hVar);
                break;
            case 5:
                cVar = y.parse(jsonReader);
                hVar.addWarning("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                cVar = d0.parse(jsonReader, hVar);
                break;
            case 7:
                cVar = f0.parse(jsonReader, hVar);
                break;
            case '\b':
                cVar = e0.parse(jsonReader, hVar);
                break;
            case '\t':
                cVar = k0.parse(jsonReader, hVar);
                break;
            case '\n':
                cVar = c0.parse(jsonReader, hVar, i8);
                break;
            case 11:
                cVar = l0.parse(jsonReader, hVar);
                break;
            case '\f':
                cVar = m0.parse(jsonReader, hVar);
                break;
            case '\r':
                cVar = c.parse(jsonReader, hVar);
                break;
            default:
                com.airbnb.lottie.utils.f.warning("Unknown shape type " + str);
                break;
        }
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return cVar;
    }
}
