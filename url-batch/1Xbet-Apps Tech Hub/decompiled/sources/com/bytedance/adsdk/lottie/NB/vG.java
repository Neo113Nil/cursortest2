package com.bytedance.adsdk.lottie.NB;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* compiled from: AnimatableTransformParser.java */
/* loaded from: classes.dex */
public class vG {
    public static com.bytedance.adsdk.lottie.vG.pvs.kj pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        boolean z = jsonReader.peek() == JsonToken.BEGIN_OBJECT;
        if (z) {
            jsonReader.beginObject();
        }
        com.bytedance.adsdk.lottie.vG.pvs.icD icd = null;
        com.bytedance.adsdk.lottie.vG.pvs.NB nb = null;
        com.bytedance.adsdk.lottie.vG.pvs.Ju<PointF, PointF> ju = null;
        com.bytedance.adsdk.lottie.vG.pvs.yiw yiwVar = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd2 = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd3 = null;
        com.bytedance.adsdk.lottie.vG.pvs.Jd jd = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd4 = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd5 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "a":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.hashCode();
                        if (nextName2.equals("k")) {
                            nb = pvs.pvs(jsonReader, sus);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    continue;
                case "o":
                    jd = Jd.icD(jsonReader, sus);
                    continue;
                case "p":
                    ju = pvs.icD(jsonReader, sus);
                    continue;
                case "r":
                    break;
                case "s":
                    yiwVar = Jd.Jd(jsonReader, sus);
                    continue;
                case "eo":
                    icd5 = Jd.pvs(jsonReader, sus, false);
                    continue;
                case "rz":
                    sus.pvs("Lottie doesn't support 3D layers.");
                    break;
                case "sa":
                    icd3 = Jd.pvs(jsonReader, sus, false);
                    continue;
                case "sk":
                    icd2 = Jd.pvs(jsonReader, sus, false);
                    continue;
                case "so":
                    icd4 = Jd.pvs(jsonReader, sus, false);
                    continue;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            com.bytedance.adsdk.lottie.vG.pvs.icD pvs = Jd.pvs(jsonReader, sus, false);
            if (pvs.vG().isEmpty()) {
                pvs.vG().add(new com.bytedance.adsdk.lottie.yiw.pvs(sus, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(sus.yiw())));
            } else if (((com.bytedance.adsdk.lottie.yiw.pvs) pvs.vG().get(0)).pvs == 0) {
                pvs.vG().set(0, new com.bytedance.adsdk.lottie.yiw.pvs(sus, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(sus.yiw())));
            }
            icd = pvs;
        }
        if (z) {
            jsonReader.endObject();
        }
        if (pvs(nb)) {
            nb = null;
        }
        return new com.bytedance.adsdk.lottie.vG.pvs.kj(nb, pvs(ju) ? null : ju, pvs(yiwVar) ? null : yiwVar, pvs(icd) ? null : icd, jd, icd4, icd5, icD(icd2) ? null : icd2, vG(icd3) ? null : icd3);
    }

    private static boolean pvs(com.bytedance.adsdk.lottie.vG.pvs.NB nb) {
        if (nb != null) {
            return nb.icD() && nb.vG().get(0).pvs.equals(0.0f, 0.0f);
        }
        return true;
    }

    private static boolean pvs(com.bytedance.adsdk.lottie.vG.pvs.Ju<PointF, PointF> ju) {
        if (ju != null) {
            return !(ju instanceof com.bytedance.adsdk.lottie.vG.pvs.Mxy) && ju.icD() && ju.vG().get(0).pvs.equals(0.0f, 0.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean pvs(com.bytedance.adsdk.lottie.vG.pvs.icD icd) {
        if (icd != null) {
            return icd.icD() && ((Float) ((com.bytedance.adsdk.lottie.yiw.pvs) icd.vG().get(0)).pvs).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean pvs(com.bytedance.adsdk.lottie.vG.pvs.yiw yiwVar) {
        if (yiwVar != null) {
            return yiwVar.icD() && ((com.bytedance.adsdk.lottie.yiw.vG) ((com.bytedance.adsdk.lottie.yiw.pvs) yiwVar.vG().get(0)).pvs).icD(1.0f, 1.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean icD(com.bytedance.adsdk.lottie.vG.pvs.icD icd) {
        if (icd != null) {
            return icd.icD() && ((Float) ((com.bytedance.adsdk.lottie.yiw.pvs) icd.vG().get(0)).pvs).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean vG(com.bytedance.adsdk.lottie.vG.pvs.icD icd) {
        if (icd != null) {
            return icd.icD() && ((Float) ((com.bytedance.adsdk.lottie.yiw.pvs) icd.vG().get(0)).pvs).floatValue() == 0.0f;
        }
        return true;
    }
}
