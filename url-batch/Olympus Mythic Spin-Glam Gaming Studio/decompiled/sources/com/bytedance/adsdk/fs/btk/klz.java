package com.bytedance.adsdk.fs.btk;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes5.dex */
public class klz implements vlj<Float> {
    public static final klz zmn = new klz();

    private klz() {
    }

    @Override // com.bytedance.adsdk.fs.btk.vlj
    /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
    public Float fs(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(kw.fs(jsonReader) * f);
    }
}
