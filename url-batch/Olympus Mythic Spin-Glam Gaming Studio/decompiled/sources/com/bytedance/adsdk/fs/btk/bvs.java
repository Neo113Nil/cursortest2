package com.bytedance.adsdk.fs.btk;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.fs.zn.fs;
import java.io.IOException;

/* loaded from: classes5.dex */
public class bvs implements vlj<com.bytedance.adsdk.fs.zn.fs> {
    public static final bvs zmn = new bvs();

    private bvs() {
    }

    @Override // com.bytedance.adsdk.fs.btk.vlj
    /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.fs.zn.fs fs(JsonReader jsonReader, float f) throws IOException {
        fs.zmn zmnVar = fs.zmn.CENTER;
        jsonReader.beginObject();
        fs.zmn zmnVar2 = zmnVar;
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
                    zmnVar2 = fs.zmn.CENTER;
                    if (nextInt <= zmnVar2.ordinal() && nextInt >= 0) {
                        zmnVar2 = fs.zmn.values()[nextInt];
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
                    i2 = kw.zmn(jsonReader);
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
                    i3 = kw.zmn(jsonReader);
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
        return new com.bytedance.adsdk.fs.zn.fs(str, str2, f2, zmnVar2, i, f3, f4, i2, i3, f5, z, pointF, pointF2);
    }
}
