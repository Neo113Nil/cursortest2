package com.bytedance.adsdk.lottie.NB;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: ContentModelParser.java */
/* loaded from: classes.dex */
class so {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ce, code lost:
    
        if (r2.equals("gf") == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.bytedance.adsdk.lottie.vG.icD.vG pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        com.bytedance.adsdk.lottie.vG.icD.vG vGVar;
        String str;
        jsonReader.beginObject();
        char c = 2;
        int i = 2;
        while (true) {
            vGVar = null;
            if (!jsonReader.hasNext()) {
                str = null;
                break;
            }
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("d")) {
                if (nextName.equals("ty")) {
                    str = jsonReader.nextString();
                    break;
                }
                jsonReader.skipValue();
            } else {
                i = jsonReader.nextInt();
            }
        }
        if (str == null) {
            return null;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case 3239:
                if (str.equals("el")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3270:
                if (str.equals("fl")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3295:
                break;
            case 3307:
                if (str.equals("gr")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3308:
                if (str.equals("gs")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3488:
                if (str.equals("mm")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3633:
                if (str.equals("rc")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3634:
                if (str.equals("rd")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 3646:
                if (str.equals("rp")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 3669:
                if (str.equals("sh")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 3679:
                if (str.equals("sr")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 3681:
                if (str.equals("st")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 3705:
                if (str.equals("tm")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 3710:
                if (str.equals("tr")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                vGVar = sUS.pvs(jsonReader, sus, i);
                break;
            case 1:
                vGVar = gSd.pvs(jsonReader, sus);
                break;
            case 2:
                vGVar = mnm.pvs(jsonReader, sus);
                break;
            case 3:
                vGVar = qD.pvs(jsonReader, sus);
                break;
            case 4:
                vGVar = vA.pvs(jsonReader, sus);
                break;
            case 5:
                vGVar = dyT.pvs(jsonReader);
                sus.pvs("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                vGVar = gA.pvs(jsonReader, sus);
                break;
            case 7:
                vGVar = Pj.pvs(jsonReader, sus);
                break;
            case '\b':
                vGVar = jlb.pvs(jsonReader, sus);
                break;
            case '\t':
                vGVar = od.pvs(jsonReader, sus);
                break;
            case '\n':
                vGVar = ae.pvs(jsonReader, sus, i);
                break;
            case 11:
                vGVar = OhP.pvs(jsonReader, sus);
                break;
            case '\f':
                vGVar = jhZ.pvs(jsonReader, sus);
                break;
            case '\r':
                vGVar = vG.pvs(jsonReader, sus);
                break;
        }
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return vGVar;
    }
}
