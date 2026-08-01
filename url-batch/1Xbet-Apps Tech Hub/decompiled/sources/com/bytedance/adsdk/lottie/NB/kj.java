package com.bytedance.adsdk.lottie.NB;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: FloatParser.java */
/* loaded from: classes.dex */
public class kj implements SE<Float> {
    public static final kj pvs = new kj();

    private kj() {
    }

    @Override // com.bytedance.adsdk.lottie.NB.SE
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public Float icD(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(zM.icD(jsonReader) * f);
    }
}
