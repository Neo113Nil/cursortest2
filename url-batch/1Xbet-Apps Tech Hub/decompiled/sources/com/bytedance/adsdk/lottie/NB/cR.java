package com.bytedance.adsdk.lottie.NB;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: IntegerParser.java */
/* loaded from: classes.dex */
public class cR implements SE<Integer> {
    public static final cR pvs = new cR();

    private cR() {
    }

    @Override // com.bytedance.adsdk.lottie.NB.SE
    /* renamed from: pvs, reason: merged with bridge method [inline-methods] */
    public Integer icD(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(zM.icD(jsonReader) * f));
    }
}
