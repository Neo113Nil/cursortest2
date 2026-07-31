package com.bytedance.adsdk.fs.btk;

import android.util.JsonReader;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public class fb {
    public static com.bytedance.adsdk.fs.zn.zmn.fs zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        return zmn(jsonReader, npsVar, true);
    }

    public static com.bytedance.adsdk.fs.zn.zmn.fs zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar, boolean z) throws IOException {
        return new com.bytedance.adsdk.fs.zn.zmn.fs(zmn(jsonReader, z ? com.bytedance.adsdk.fs.hhw.hhw.zmn() : 1.0f, npsVar, klz.zmn));
    }

    static com.bytedance.adsdk.fs.zn.zmn.fb fs(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        return new com.bytedance.adsdk.fs.zn.zmn.fb(zmn(jsonReader, npsVar, kgc.zmn));
    }

    static com.bytedance.adsdk.fs.zn.zmn.hhw zn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        return new com.bytedance.adsdk.fs.zn.zmn.hhw(phc.zmn(jsonReader, npsVar, com.bytedance.adsdk.fs.hhw.hhw.zmn(), zak.zmn, true));
    }

    static com.bytedance.adsdk.fs.zn.zmn.nps fb(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        return new com.bytedance.adsdk.fs.zn.zmn.nps(zmn(jsonReader, npsVar, tf.zmn));
    }

    static com.bytedance.adsdk.fs.zn.zmn.zg btk(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        return new com.bytedance.adsdk.fs.zn.zmn.zg(zmn(jsonReader, com.bytedance.adsdk.fs.hhw.hhw.zmn(), npsVar, fkt.zmn));
    }

    static com.bytedance.adsdk.fs.zn.zmn.iv hhw(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        return new com.bytedance.adsdk.fs.zn.zmn.iv(zmn(jsonReader, com.bytedance.adsdk.fs.hhw.hhw.zmn(), npsVar, bvs.zmn));
    }

    static com.bytedance.adsdk.fs.zn.zmn.zmn nps(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        return new com.bytedance.adsdk.fs.zn.zmn.zmn(zmn(jsonReader, npsVar, nps.zmn));
    }

    static com.bytedance.adsdk.fs.zn.zmn.zn zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar, int i) throws IOException {
        return new com.bytedance.adsdk.fs.zn.zmn.zn(zmn(jsonReader, npsVar, new cn(i)));
    }

    private static <T> List<com.bytedance.adsdk.fs.nps.zmn<T>> zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar, vlj<T> vljVar) throws IOException {
        return phc.zmn(jsonReader, npsVar, 1.0f, vljVar, false);
    }

    private static <T> List<com.bytedance.adsdk.fs.nps.zmn<T>> zmn(JsonReader jsonReader, float f, com.bytedance.adsdk.fs.nps npsVar, vlj<T> vljVar) throws IOException {
        return phc.zmn(jsonReader, npsVar, f, vljVar, false);
    }
}
