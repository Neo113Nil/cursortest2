package com.bytedance.adsdk.lottie.NB;

import android.util.JsonReader;
import com.bytedance.adsdk.lottie.vG.icD.cR;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: ShapeStrokeParser.java */
/* loaded from: classes.dex */
class OhP {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static com.bytedance.adsdk.lottie.vG.icD.cR pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        char c;
        char c2;
        int i;
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        String str = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd = null;
        com.bytedance.adsdk.lottie.vG.pvs.pvs pvsVar = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd2 = null;
        cR.pvs pvsVar2 = null;
        cR.icD icd3 = null;
        boolean z = false;
        com.bytedance.adsdk.lottie.vG.pvs.Jd jd = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            int i2 = 1;
            switch (nextName.hashCode()) {
                case 99:
                    if (nextName.equals("c")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 100:
                    if (nextName.equals("d")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 119:
                    if (nextName.equals("w")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3447:
                    if (nextName.equals("lc")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3454:
                    if (nextName.equals("lj")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3487:
                    if (nextName.equals("ml")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = '\b';
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
                    pvsVar = Jd.yiw(jsonReader, sus);
                    continue;
                case 1:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String str2 = null;
                        com.bytedance.adsdk.lottie.vG.pvs.icD icd4 = null;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.hashCode();
                            if (nextName2.equals("n")) {
                                str2 = jsonReader.nextString();
                            } else if (nextName2.equals("v")) {
                                icd4 = Jd.pvs(jsonReader, sus);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        str2.hashCode();
                        switch (str2.hashCode()) {
                            case 100:
                                if (str2.equals("d")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 103:
                                if (str2.equals("g")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 111:
                                if (str2.equals("o")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                            case 1:
                                i = 1;
                                sus.pvs(true);
                                arrayList.add(icd4);
                                i2 = i;
                                break;
                            case 2:
                                icd = icd4;
                                i2 = 1;
                                break;
                            default:
                                i = 1;
                                i2 = i;
                                break;
                        }
                    }
                    int i3 = i2;
                    jsonReader.endArray();
                    if (arrayList.size() != i3) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                        break;
                    }
                case 2:
                    jd = Jd.icD(jsonReader, sus);
                    continue;
                case 3:
                    icd2 = Jd.pvs(jsonReader, sus);
                    continue;
                case 4:
                    z = jsonReader.nextBoolean();
                    continue;
                case 5:
                    pvsVar2 = cR.pvs.values()[jsonReader.nextInt() - 1];
                    continue;
                case 6:
                    icd3 = cR.icD.values()[jsonReader.nextInt() - 1];
                    continue;
                case 7:
                    f = (float) jsonReader.nextDouble();
                    continue;
                case '\b':
                    str = jsonReader.nextString();
                    continue;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (jd == null) {
            jd = new com.bytedance.adsdk.lottie.vG.pvs.Jd(Collections.singletonList(new com.bytedance.adsdk.lottie.yiw.pvs(100)));
        }
        return new com.bytedance.adsdk.lottie.vG.icD.cR(str, icd, arrayList, pvsVar, jd, icd2, pvsVar2, icd3, f, z);
    }
}
