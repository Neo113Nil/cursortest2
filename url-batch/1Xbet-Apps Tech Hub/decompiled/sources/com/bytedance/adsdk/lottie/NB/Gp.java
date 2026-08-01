package com.bytedance.adsdk.lottie.NB;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* compiled from: PointFParser.java */
/* loaded from: classes.dex */
public class Gp implements SE<PointF> {
    public static final Gp pvs = new Gp();

    private Gp() {
    }

    @Override // com.bytedance.adsdk.lottie.NB.SE
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public PointF icD(JsonReader jsonReader, float f) throws IOException {
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.BEGIN_ARRAY) {
            return zM.icD(jsonReader, f);
        }
        if (peek == JsonToken.BEGIN_OBJECT) {
            return zM.icD(jsonReader, f);
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
