package com.bytedance.adsdk.fs.btk;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* loaded from: classes.dex */
public class zak implements vlj<PointF> {
    public static final zak zmn = new zak();

    private zak() {
    }

    @Override // com.bytedance.adsdk.fs.btk.vlj
    /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
    public PointF fs(JsonReader jsonReader, float f) throws IOException {
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.BEGIN_ARRAY) {
            return kw.fs(jsonReader, f);
        }
        if (peek == JsonToken.BEGIN_OBJECT) {
            return kw.fs(jsonReader, f);
        }
        if (peek == JsonToken.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(String.valueOf(peek)));
    }
}
