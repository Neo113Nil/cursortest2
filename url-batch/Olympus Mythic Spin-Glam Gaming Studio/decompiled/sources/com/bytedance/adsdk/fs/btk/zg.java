package com.bytedance.adsdk.fs.btk;

import android.util.JsonReader;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.b;
import java.io.IOException;

/* loaded from: classes14.dex */
class zg {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00cb, code lost:
    
        if (r2.equals("gf") == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static com.bytedance.adsdk.fs.zn.fs.zn zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        com.bytedance.adsdk.fs.zn.fs.zn znVar;
        String str;
        jsonReader.beginObject();
        char c = 2;
        int i = 2;
        while (true) {
            znVar = null;
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
                if (str.equals(DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT)) {
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
                if (str.equals(b.JSON_KEY_SH)) {
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
                znVar = hhw.zmn(jsonReader, npsVar, i);
                break;
            case 1:
                znVar = hgd.zmn(jsonReader, npsVar);
                break;
            case 2:
                znVar = cyb.zmn(jsonReader, npsVar);
                break;
            case 3:
                znVar = nu.zmn(jsonReader, npsVar);
                break;
            case 4:
                znVar = olo.zmn(jsonReader, npsVar);
                break;
            case 5:
                znVar = bjh.zmn(jsonReader);
                npsVar.zmn("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                znVar = yj.zmn(jsonReader, npsVar);
                break;
            case 7:
                znVar = ev.zmn(jsonReader, npsVar);
                break;
            case '\b':
                znVar = so.zmn(jsonReader, npsVar);
                break;
            case '\t':
                znVar = ww.zmn(jsonReader, npsVar);
                break;
            case '\n':
                znVar = am.zmn(jsonReader, npsVar, i);
                break;
            case 11:
                znVar = oub.zmn(jsonReader, npsVar);
                break;
            case '\f':
                znVar = jy.zmn(jsonReader, npsVar);
                break;
            case '\r':
                znVar = zn.zmn(jsonReader, npsVar);
                break;
        }
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return znVar;
    }
}
