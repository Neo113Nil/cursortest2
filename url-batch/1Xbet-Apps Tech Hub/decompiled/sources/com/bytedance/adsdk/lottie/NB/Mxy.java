package com.bytedance.adsdk.lottie.NB;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.lottie.vG.icD;
import java.io.IOException;

/* compiled from: DocumentDataParser.java */
/* loaded from: classes.dex */
public class Mxy implements SE<com.bytedance.adsdk.lottie.vG.icD> {
    public static final Mxy pvs = new Mxy();

    private Mxy() {
    }

    @Override // com.bytedance.adsdk.lottie.NB.SE
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.lottie.vG.icD icD(JsonReader jsonReader, float f) throws IOException {
        icD.pvs pvsVar = icD.pvs.CENTER;
        jsonReader.beginObject();
        icD.pvs pvsVar2 = pvsVar;
        String str = null;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "f":
                    str2 = jsonReader.nextString();
                    break;
                case "j":
                    int nextInt = jsonReader.nextInt();
                    if (nextInt > icD.pvs.CENTER.ordinal() || nextInt < 0) {
                        pvsVar2 = icD.pvs.CENTER;
                        break;
                    } else {
                        pvsVar2 = icD.pvs.values()[nextInt];
                        break;
                    }
                    break;
                case "s":
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case "t":
                    str = jsonReader.nextString();
                    break;
                case "fc":
                    i2 = zM.pvs(jsonReader);
                    break;
                case "lh":
                    f3 = (float) jsonReader.nextDouble();
                    break;
                case "ls":
                    f4 = (float) jsonReader.nextDouble();
                    break;
                case "of":
                    z = jsonReader.nextBoolean();
                    break;
                case "ps":
                    jsonReader.beginArray();
                    PointF pointF3 = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.endArray();
                    pointF = pointF3;
                    break;
                case "sc":
                    i3 = zM.pvs(jsonReader);
                    break;
                case "sw":
                    f5 = (float) jsonReader.nextDouble();
                    break;
                case "sz":
                    jsonReader.beginArray();
                    PointF pointF4 = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.endArray();
                    pointF2 = pointF4;
                    break;
                case "tr":
                    i = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.lottie.vG.icD(str, str2, f2, pvsVar2, i, f3, f4, i2, i3, f5, z, pointF, pointF2);
    }
}
