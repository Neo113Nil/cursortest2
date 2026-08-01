package com.bytedance.adsdk.lottie.NB;

import android.util.JsonReader;
import java.io.IOException;
import java.util.List;

/* compiled from: AnimatableValueParser.java */
/* loaded from: classes.dex */
public class Jd {
    public static com.bytedance.adsdk.lottie.vG.pvs.icD pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        return pvs(jsonReader, sus, true);
    }

    public static com.bytedance.adsdk.lottie.vG.pvs.icD pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus, boolean z) throws IOException {
        return new com.bytedance.adsdk.lottie.vG.pvs.icD(pvs(jsonReader, z ? com.bytedance.adsdk.lottie.sUS.sUS.pvs() : 1.0f, sus, kj.pvs));
    }

    static com.bytedance.adsdk.lottie.vG.pvs.Jd icD(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        return new com.bytedance.adsdk.lottie.vG.pvs.Jd(pvs(jsonReader, sus, cR.pvs));
    }

    static com.bytedance.adsdk.lottie.vG.pvs.sUS vG(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        return new com.bytedance.adsdk.lottie.vG.pvs.sUS(rCZ.pvs(jsonReader, sus, com.bytedance.adsdk.lottie.sUS.sUS.pvs(), Gp.pvs, true));
    }

    static com.bytedance.adsdk.lottie.vG.pvs.yiw Jd(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        return new com.bytedance.adsdk.lottie.vG.pvs.yiw(pvs(jsonReader, sus, cRf.pvs));
    }

    static com.bytedance.adsdk.lottie.vG.pvs.so NB(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        return new com.bytedance.adsdk.lottie.vG.pvs.so(pvs(jsonReader, com.bytedance.adsdk.lottie.sUS.sUS.pvs(), sus, sP.pvs));
    }

    static com.bytedance.adsdk.lottie.vG.pvs.Wyp sUS(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        return new com.bytedance.adsdk.lottie.vG.pvs.Wyp(pvs(jsonReader, com.bytedance.adsdk.lottie.sUS.sUS.pvs(), sus, Mxy.pvs));
    }

    static com.bytedance.adsdk.lottie.vG.pvs.pvs yiw(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        return new com.bytedance.adsdk.lottie.vG.pvs.pvs(pvs(jsonReader, sus, yiw.pvs));
    }

    static com.bytedance.adsdk.lottie.vG.pvs.vG pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus, int i) throws IOException {
        return new com.bytedance.adsdk.lottie.vG.pvs.vG(pvs(jsonReader, sus, new bNS(i)));
    }

    private static <T> List<com.bytedance.adsdk.lottie.yiw.pvs<T>> pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus, SE<T> se) throws IOException {
        return rCZ.pvs(jsonReader, sus, 1.0f, se, false);
    }

    private static <T> List<com.bytedance.adsdk.lottie.yiw.pvs<T>> pvs(JsonReader jsonReader, float f, com.bytedance.adsdk.lottie.sUS sus, SE<T> se) throws IOException {
        return rCZ.pvs(jsonReader, sus, f, se, false);
    }
}
