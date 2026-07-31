package com.bytedance.adsdk.fs.btk;

import android.util.JsonReader;
import com.bytedance.adsdk.fs.zn.fs.kgc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes4.dex */
class oub {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static com.bytedance.adsdk.fs.zn.fs.kgc zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        char c;
        String str;
        char c2;
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        String str2 = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar = null;
        com.bytedance.adsdk.fs.zn.zmn.zmn zmnVar = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar2 = null;
        kgc.zmn zmnVar2 = null;
        kgc.fs fsVar3 = null;
        boolean z = false;
        com.bytedance.adsdk.fs.zn.zmn.fb fbVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
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
                case JSON_ENCODE_ERROR_VALUE:
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
                    zmnVar = fb.nps(jsonReader, npsVar);
                    break;
                case 1:
                    str = str2;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        com.bytedance.adsdk.fs.zn.zmn.fs fsVar4 = null;
                        String str3 = null;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.hashCode();
                            if (nextName2.equals("n")) {
                                str3 = jsonReader.nextString();
                            } else if (nextName2.equals("v")) {
                                fsVar4 = fb.zmn(jsonReader, npsVar);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        str3.hashCode();
                        switch (str3.hashCode()) {
                            case 100:
                                if (str3.equals("d")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 103:
                                if (str3.equals("g")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 111:
                                if (str3.equals("o")) {
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
                                npsVar.zmn(true);
                                arrayList.add(fsVar4);
                                break;
                            case 2:
                                fsVar = fsVar4;
                                break;
                        }
                    }
                    jsonReader.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                        str2 = str;
                        break;
                    }
                    str2 = str;
                    break;
                case 2:
                    fbVar = fb.fs(jsonReader, npsVar);
                    break;
                case 3:
                    fsVar2 = fb.zmn(jsonReader, npsVar);
                    break;
                case 4:
                    z = jsonReader.nextBoolean();
                    break;
                case 5:
                    str = str2;
                    zmnVar2 = kgc.zmn.values()[jsonReader.nextInt() - 1];
                    str2 = str;
                    break;
                case 6:
                    str = str2;
                    fsVar3 = kgc.fs.values()[jsonReader.nextInt() - 1];
                    str2 = str;
                    break;
                case 7:
                    str = str2;
                    f = (float) jsonReader.nextDouble();
                    str2 = str;
                    break;
                case '\b':
                    str2 = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    str = str2;
                    str2 = str;
                    break;
            }
        }
        return new com.bytedance.adsdk.fs.zn.fs.kgc(str2, fsVar, arrayList, zmnVar, fbVar == null ? new com.bytedance.adsdk.fs.zn.zmn.fb(Collections.singletonList(new com.bytedance.adsdk.fs.nps.zmn(100))) : fbVar, fsVar2, zmnVar2, fsVar3, f, z);
    }
}
