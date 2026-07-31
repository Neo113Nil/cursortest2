package com.bytedance.adsdk.fs.btk;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* loaded from: classes4.dex */
public class tf implements vlj<com.bytedance.adsdk.fs.nps.zn> {
    public static final tf zmn = new tf();

    private tf() {
    }

    @Override // com.bytedance.adsdk.fs.btk.vlj
    /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.fs.nps.zn fs(JsonReader jsonReader, float f) throws IOException {
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
        return new com.bytedance.adsdk.fs.nps.zn((nextDouble / 100.0f) * f, (nextDouble2 / 100.0f) * f);
    }
}
