package com.bytedance.adsdk.lottie.NB;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* compiled from: ScaleXYParser.java */
/* loaded from: classes.dex */
public class cRf implements SE<com.bytedance.adsdk.lottie.yiw.vG> {
    public static final cRf pvs = new cRf();

    private cRf() {
    }

    @Override // com.bytedance.adsdk.lottie.NB.SE
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.lottie.yiw.vG icD(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.endArray();
        }
        return new com.bytedance.adsdk.lottie.yiw.vG((nextDouble / 100.0f) * f, (nextDouble2 / 100.0f) * f);
    }
}
