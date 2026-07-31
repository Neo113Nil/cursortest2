package com.bytedance.adsdk.fs.btk;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes4.dex */
public class kgc implements vlj<Integer> {
    public static final kgc zmn = new kgc();

    private kgc() {
    }

    @Override // com.bytedance.adsdk.fs.btk.vlj
    /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
    public Integer fs(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(kw.fs(jsonReader) * f));
    }
}
