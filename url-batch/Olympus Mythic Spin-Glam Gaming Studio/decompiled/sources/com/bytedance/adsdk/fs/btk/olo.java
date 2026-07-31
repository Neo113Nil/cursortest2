package com.bytedance.adsdk.fs.btk;

import android.util.JsonReader;
import com.bytedance.adsdk.fs.zn.fs.kgc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes4.dex */
class olo {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static com.bytedance.adsdk.fs.zn.fs.hhw zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        int i;
        com.bytedance.adsdk.fs.zn.fs.nps npsVar2;
        int i2;
        int i3;
        int i4 = 1;
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        String str = null;
        com.bytedance.adsdk.fs.zn.fs.nps npsVar3 = null;
        com.bytedance.adsdk.fs.zn.zmn.zn znVar = null;
        com.bytedance.adsdk.fs.zn.zmn.hhw hhwVar = null;
        com.bytedance.adsdk.fs.zn.zmn.hhw hhwVar2 = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar = null;
        kgc.zmn zmnVar = null;
        kgc.fs fsVar2 = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar3 = null;
        boolean z = false;
        com.bytedance.adsdk.fs.zn.zmn.fb fbVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 100:
                    if (nextName.equals("d")) {
                        i = 0;
                        break;
                    }
                    i = -1;
                    break;
                case 101:
                    if (nextName.equals(EidRequestBuilder.REQUEST_FIELD_EMAIL)) {
                        i = i4;
                        break;
                    }
                    i = -1;
                    break;
                case 103:
                    if (nextName.equals("g")) {
                        i = 2;
                        break;
                    }
                    i = -1;
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        i = 3;
                        break;
                    }
                    i = -1;
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        i = 4;
                        break;
                    }
                    i = -1;
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        i = 5;
                        break;
                    }
                    i = -1;
                    break;
                case JSON_ENCODE_ERROR_VALUE:
                    if (nextName.equals("w")) {
                        i = 6;
                        break;
                    }
                    i = -1;
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        i = 7;
                        break;
                    }
                    i = -1;
                    break;
                case 3447:
                    if (nextName.equals("lc")) {
                        i = 8;
                        break;
                    }
                    i = -1;
                    break;
                case 3454:
                    if (nextName.equals("lj")) {
                        i = 9;
                        break;
                    }
                    i = -1;
                    break;
                case 3487:
                    if (nextName.equals("ml")) {
                        i = 10;
                        break;
                    }
                    i = -1;
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        i = 11;
                        break;
                    }
                    i = -1;
                    break;
                default:
                    i = -1;
                    break;
            }
            switch (i) {
                case 0:
                    npsVar2 = npsVar3;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        com.bytedance.adsdk.fs.zn.zmn.fs fsVar4 = null;
                        String str2 = null;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.hashCode();
                            if (nextName2.equals("n")) {
                                str2 = jsonReader.nextString();
                            } else if (nextName2.equals("v")) {
                                fsVar4 = fb.zmn(jsonReader, npsVar);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        if (str2.equals("o")) {
                            fsVar3 = fsVar4;
                            i4 = 1;
                        } else {
                            if (str2.equals("d") || str2.equals("g")) {
                                i3 = 1;
                                npsVar.zmn(true);
                                arrayList.add(fsVar4);
                            } else {
                                i3 = 1;
                            }
                            i4 = i3;
                        }
                    }
                    i2 = i4;
                    jsonReader.endArray();
                    if (arrayList.size() == i2) {
                        arrayList.add(arrayList.get(0));
                        i4 = i2;
                        npsVar3 = npsVar2;
                        break;
                    }
                    i4 = i2;
                    npsVar3 = npsVar2;
                    break;
                case 1:
                    hhwVar2 = fb.zn(jsonReader, npsVar);
                    break;
                case 2:
                    npsVar2 = npsVar3;
                    jsonReader.beginObject();
                    int i5 = -1;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.hashCode();
                        if (nextName3.equals(CampaignEx.JSON_KEY_AD_K)) {
                            znVar = fb.zmn(jsonReader, npsVar, i5);
                        } else if (nextName3.equals("p")) {
                            i5 = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    npsVar3 = npsVar2;
                    break;
                case 3:
                    fbVar = fb.fs(jsonReader, npsVar);
                    break;
                case 4:
                    hhwVar = fb.zn(jsonReader, npsVar);
                    break;
                case 5:
                    npsVar3 = jsonReader.nextInt() == i4 ? com.bytedance.adsdk.fs.zn.fs.nps.LINEAR : com.bytedance.adsdk.fs.zn.fs.nps.RADIAL;
                    break;
                case 6:
                    fsVar = fb.zmn(jsonReader, npsVar);
                    break;
                case 7:
                    z = jsonReader.nextBoolean();
                    break;
                case 8:
                    zmnVar = kgc.zmn.values()[jsonReader.nextInt() - i4];
                    break;
                case 9:
                    fsVar2 = kgc.fs.values()[jsonReader.nextInt() - i4];
                    break;
                case 10:
                    npsVar2 = npsVar3;
                    f = (float) jsonReader.nextDouble();
                    npsVar3 = npsVar2;
                    break;
                case 11:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    i2 = i4;
                    npsVar2 = npsVar3;
                    i4 = i2;
                    npsVar3 = npsVar2;
                    break;
            }
        }
        return new com.bytedance.adsdk.fs.zn.fs.hhw(str, npsVar3, znVar, fbVar == null ? new com.bytedance.adsdk.fs.zn.zmn.fb(Collections.singletonList(new com.bytedance.adsdk.fs.nps.zmn(100))) : fbVar, hhwVar, hhwVar2, fsVar, zmnVar, fsVar2, f, arrayList, fsVar3, z);
    }
}
