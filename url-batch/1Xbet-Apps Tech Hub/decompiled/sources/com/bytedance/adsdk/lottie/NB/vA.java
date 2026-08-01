package com.bytedance.adsdk.lottie.NB;

import android.util.JsonReader;
import com.bytedance.adsdk.lottie.vG.icD.cR;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: GradientStrokeParser.java */
/* loaded from: classes.dex */
class vA {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static com.bytedance.adsdk.lottie.vG.icD.sUS pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        char c;
        cR.pvs pvsVar;
        cR.icD icd;
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        String str = null;
        com.bytedance.adsdk.lottie.vG.icD.yiw yiwVar = null;
        com.bytedance.adsdk.lottie.vG.pvs.vG vGVar = null;
        com.bytedance.adsdk.lottie.vG.pvs.sUS sus2 = null;
        com.bytedance.adsdk.lottie.vG.pvs.sUS sus3 = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd2 = null;
        cR.pvs pvsVar2 = null;
        cR.icD icd3 = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd4 = null;
        boolean z = false;
        com.bytedance.adsdk.lottie.vG.pvs.Jd jd = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            boolean z2 = z;
            com.bytedance.adsdk.lottie.vG.pvs.icD icd5 = icd4;
            float f2 = f;
            switch (nextName.hashCode()) {
                case 100:
                    if (nextName.equals("d")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 101:
                    if (nextName.equals("e")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 103:
                    if (nextName.equals("g")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 119:
                    if (nextName.equals("w")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 3447:
                    if (nextName.equals("lc")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 3454:
                    if (nextName.equals("lj")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 3487:
                    if (nextName.equals("ml")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = 11;
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
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String str2 = null;
                        com.bytedance.adsdk.lottie.vG.pvs.icD icd6 = null;
                        while (jsonReader.hasNext()) {
                            cR.icD icd7 = icd3;
                            String nextName2 = jsonReader.nextName();
                            nextName2.hashCode();
                            cR.pvs pvsVar3 = pvsVar2;
                            if (nextName2.equals("n")) {
                                str2 = jsonReader.nextString();
                            } else if (nextName2.equals("v")) {
                                icd6 = Jd.pvs(jsonReader, sus);
                            } else {
                                jsonReader.skipValue();
                            }
                            icd3 = icd7;
                            pvsVar2 = pvsVar3;
                        }
                        cR.pvs pvsVar4 = pvsVar2;
                        cR.icD icd8 = icd3;
                        jsonReader.endObject();
                        if (str2.equals("o")) {
                            icd5 = icd6;
                            icd3 = icd8;
                            pvsVar2 = pvsVar4;
                        } else {
                            if (str2.equals("d") || str2.equals("g")) {
                                sus.pvs(true);
                                arrayList.add(icd6);
                            }
                            icd3 = icd8;
                            pvsVar2 = pvsVar4;
                        }
                    }
                    pvsVar = pvsVar2;
                    icd = icd3;
                    jsonReader.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                        z = z2;
                        icd4 = icd5;
                        icd3 = icd;
                        f = f2;
                        pvsVar2 = pvsVar;
                        break;
                    } else {
                        icd4 = icd5;
                        z = z2;
                        icd3 = icd;
                        f = f2;
                        pvsVar2 = pvsVar;
                    }
                    break;
                case 1:
                    sus3 = Jd.vG(jsonReader, sus);
                    z = z2;
                    icd4 = icd5;
                    f = f2;
                    break;
                case 2:
                    jsonReader.beginObject();
                    int i = -1;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.hashCode();
                        if (nextName3.equals("k")) {
                            vGVar = Jd.pvs(jsonReader, sus, i);
                        } else if (nextName3.equals("p")) {
                            i = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    z = z2;
                    icd4 = icd5;
                    f = f2;
                    break;
                case 3:
                    jd = Jd.icD(jsonReader, sus);
                    z = z2;
                    icd4 = icd5;
                    f = f2;
                    break;
                case 4:
                    sus2 = Jd.vG(jsonReader, sus);
                    z = z2;
                    icd4 = icd5;
                    f = f2;
                    break;
                case 5:
                    yiwVar = jsonReader.nextInt() == 1 ? com.bytedance.adsdk.lottie.vG.icD.yiw.LINEAR : com.bytedance.adsdk.lottie.vG.icD.yiw.RADIAL;
                    z = z2;
                    icd4 = icd5;
                    f = f2;
                    break;
                case 6:
                    icd2 = Jd.pvs(jsonReader, sus);
                    z = z2;
                    icd4 = icd5;
                    f = f2;
                    break;
                case 7:
                    z = jsonReader.nextBoolean();
                    icd4 = icd5;
                    f = f2;
                    break;
                case '\b':
                    pvsVar2 = cR.pvs.values()[jsonReader.nextInt() - 1];
                    z = z2;
                    icd4 = icd5;
                    f = f2;
                    break;
                case '\t':
                    icd3 = cR.icD.values()[jsonReader.nextInt() - 1];
                    z = z2;
                    icd4 = icd5;
                    f = f2;
                    break;
                case '\n':
                    f = (float) jsonReader.nextDouble();
                    z = z2;
                    icd4 = icd5;
                    break;
                case 11:
                    str = jsonReader.nextString();
                    z = z2;
                    icd4 = icd5;
                    f = f2;
                    break;
                default:
                    jsonReader.skipValue();
                    pvsVar = pvsVar2;
                    icd = icd3;
                    icd4 = icd5;
                    z = z2;
                    icd3 = icd;
                    f = f2;
                    pvsVar2 = pvsVar;
                    break;
            }
        }
        cR.pvs pvsVar5 = pvsVar2;
        cR.icD icd9 = icd3;
        float f3 = f;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd10 = icd4;
        boolean z3 = z;
        if (jd == null) {
            jd = new com.bytedance.adsdk.lottie.vG.pvs.Jd(Collections.singletonList(new com.bytedance.adsdk.lottie.yiw.pvs(100)));
        }
        return new com.bytedance.adsdk.lottie.vG.icD.sUS(str, yiwVar, vGVar, jd, sus2, sus3, icd2, pvsVar5, icd9, f3, arrayList, icd10, z3);
    }
}
