package com.bytedance.adsdk.fs.btk;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* loaded from: classes4.dex */
class rp {
    static com.bytedance.adsdk.fs.zmn.fs.bvs zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar) throws IOException {
        return new com.bytedance.adsdk.fs.zmn.fs.bvs(npsVar, iqz.zmn(jsonReader, npsVar, com.bytedance.adsdk.fs.hhw.hhw.zmn(), kjb.zmn, jsonReader.peek() == JsonToken.BEGIN_OBJECT, false));
    }
}
