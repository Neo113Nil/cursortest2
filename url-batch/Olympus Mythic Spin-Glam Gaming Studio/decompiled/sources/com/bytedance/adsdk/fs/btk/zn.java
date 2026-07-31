package com.bytedance.adsdk.fs.btk;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;

/* loaded from: classes14.dex */
public class zn {
    public static com.bytedance.adsdk.fs.zn.zmn.klz zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        boolean z = jsonReader.peek() == JsonToken.BEGIN_OBJECT;
        if (z) {
            jsonReader.beginObject();
        }
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar = null;
        com.bytedance.adsdk.fs.zn.zmn.btk btkVar = null;
        com.bytedance.adsdk.fs.zn.zmn.mw<PointF, PointF> mwVar = null;
        com.bytedance.adsdk.fs.zn.zmn.nps npsVar2 = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar2 = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar3 = null;
        com.bytedance.adsdk.fs.zn.zmn.fb fbVar = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar4 = null;
        com.bytedance.adsdk.fs.zn.zmn.fs fsVar5 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "a":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.hashCode();
                        if (nextName2.equals(CampaignEx.JSON_KEY_AD_K)) {
                            btkVar = zmn.zmn(jsonReader, npsVar);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    continue;
                case "o":
                    fbVar = fb.fs(jsonReader, npsVar);
                    continue;
                case "p":
                    mwVar = zmn.fs(jsonReader, npsVar);
                    continue;
                case "r":
                    break;
                case "s":
                    npsVar2 = fb.fb(jsonReader, npsVar);
                    continue;
                case "eo":
                    fsVar5 = fb.zmn(jsonReader, npsVar, false);
                    continue;
                case "rz":
                    npsVar.zmn("Lottie doesn't support 3D layers.");
                    break;
                case "sa":
                    fsVar3 = fb.zmn(jsonReader, npsVar, false);
                    continue;
                case "sk":
                    fsVar2 = fb.zmn(jsonReader, npsVar, false);
                    continue;
                case "so":
                    fsVar4 = fb.zmn(jsonReader, npsVar, false);
                    continue;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            com.bytedance.adsdk.fs.zn.zmn.fs zmn = fb.zmn(jsonReader, npsVar, false);
            if (zmn.zn().isEmpty()) {
                zmn.zn().add(new com.bytedance.adsdk.fs.nps.zmn(npsVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(npsVar.nps())));
            } else if (((com.bytedance.adsdk.fs.nps.zmn) zmn.zn().get(0)).zmn == 0) {
                zmn.zn().set(0, new com.bytedance.adsdk.fs.nps.zmn(npsVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(npsVar.nps())));
            }
            fsVar = zmn;
        }
        if (z) {
            jsonReader.endObject();
        }
        com.bytedance.adsdk.fs.zn.zmn.btk btkVar2 = zmn(btkVar) ? null : btkVar;
        if (zmn(mwVar)) {
            mwVar = null;
        }
        return new com.bytedance.adsdk.fs.zn.zmn.klz(btkVar2, mwVar, zmn(npsVar2) ? null : npsVar2, zmn(fsVar) ? null : fsVar, fbVar, fsVar4, fsVar5, fs(fsVar2) ? null : fsVar2, zn(fsVar3) ? null : fsVar3);
    }

    private static boolean zmn(com.bytedance.adsdk.fs.zn.zmn.btk btkVar) {
        if (btkVar != null) {
            return btkVar.fs() && btkVar.zn().get(0).zmn.equals(0.0f, 0.0f);
        }
        return true;
    }

    private static boolean zmn(com.bytedance.adsdk.fs.zn.zmn.mw<PointF, PointF> mwVar) {
        if (mwVar != null) {
            return !(mwVar instanceof com.bytedance.adsdk.fs.zn.zmn.bvs) && mwVar.fs() && mwVar.zn().get(0).zmn.equals(0.0f, 0.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zmn(com.bytedance.adsdk.fs.zn.zmn.fs fsVar) {
        if (fsVar != null) {
            return fsVar.fs() && ((Float) ((com.bytedance.adsdk.fs.nps.zmn) fsVar.zn().get(0)).zmn).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zmn(com.bytedance.adsdk.fs.zn.zmn.nps npsVar) {
        if (npsVar != null) {
            return npsVar.fs() && ((com.bytedance.adsdk.fs.nps.zn) ((com.bytedance.adsdk.fs.nps.zmn) npsVar.zn().get(0)).zmn).fs(1.0f, 1.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean fs(com.bytedance.adsdk.fs.zn.zmn.fs fsVar) {
        if (fsVar != null) {
            return fsVar.fs() && ((Float) ((com.bytedance.adsdk.fs.nps.zmn) fsVar.zn().get(0)).zmn).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zn(com.bytedance.adsdk.fs.zn.zmn.fs fsVar) {
        if (fsVar != null) {
            return fsVar.fs() && ((Float) ((com.bytedance.adsdk.fs.nps.zmn) fsVar.zn().get(0)).zmn).floatValue() == 0.0f;
        }
        return true;
    }
}
