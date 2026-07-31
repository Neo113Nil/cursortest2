package com.bytedance.adsdk.fs.btk;

import android.graphics.Path;
import android.util.JsonReader;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import java.io.IOException;
import java.util.Collections;

/* loaded from: classes6.dex */
class cyb {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static com.bytedance.adsdk.fs.zn.fs.btk zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        char c;
        com.bytedance.adsdk.fs.zn.zmn.fb fbVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        com.bytedance.adsdk.fs.zn.fs.nps npsVar2 = null;
        com.bytedance.adsdk.fs.zn.zmn.zn znVar = null;
        com.bytedance.adsdk.fs.zn.zmn.hhw hhwVar = null;
        com.bytedance.adsdk.fs.zn.zmn.hhw hhwVar2 = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals(EidRequestBuilder.REQUEST_FIELD_EMAIL)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 103:
                    if (nextName.equals("g")) {
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
                case 114:
                    if (nextName.equals("r")) {
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
                case 3324:
                    if (nextName.equals("hd")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = 7;
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
                    hhwVar2 = fb.zn(jsonReader, npsVar);
                    break;
                case 1:
                    jsonReader.beginObject();
                    int i = -1;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.hashCode();
                        if (nextName2.equals(CampaignEx.JSON_KEY_AD_K)) {
                            znVar = fb.zmn(jsonReader, npsVar, i);
                        } else if (nextName2.equals("p")) {
                            i = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 2:
                    fbVar = fb.fs(jsonReader, npsVar);
                    break;
                case 3:
                    fillType = jsonReader.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 4:
                    hhwVar = fb.zn(jsonReader, npsVar);
                    break;
                case 5:
                    npsVar2 = jsonReader.nextInt() == 1 ? com.bytedance.adsdk.fs.zn.fs.nps.LINEAR : com.bytedance.adsdk.fs.zn.fs.nps.RADIAL;
                    break;
                case 6:
                    z = jsonReader.nextBoolean();
                    break;
                case 7:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.fs.zn.fs.btk(str, npsVar2, fillType, znVar, fbVar == null ? new com.bytedance.adsdk.fs.zn.zmn.fb(Collections.singletonList(new com.bytedance.adsdk.fs.nps.zmn(100))) : fbVar, hhwVar, hhwVar2, null, null, z);
    }
}
