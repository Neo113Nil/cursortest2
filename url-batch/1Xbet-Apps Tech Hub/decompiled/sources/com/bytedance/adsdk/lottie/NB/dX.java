package com.bytedance.adsdk.lottie.NB;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* compiled from: PathKeyframeParser.java */
/* loaded from: classes.dex */
class dX {
    static com.bytedance.adsdk.lottie.pvs.icD.Mxy pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        return new com.bytedance.adsdk.lottie.pvs.icD.Mxy(sus, uc.pvs(jsonReader, sus, com.bytedance.adsdk.lottie.sUS.sUS.pvs(), CvL.pvs, jsonReader.peek() == JsonToken.BEGIN_OBJECT, false));
    }
}
