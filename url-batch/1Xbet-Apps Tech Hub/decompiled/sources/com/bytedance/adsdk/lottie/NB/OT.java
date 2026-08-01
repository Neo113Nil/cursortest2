package com.bytedance.adsdk.lottie.NB;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.bytedance.adsdk.lottie.vG.vG.Jd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: LayerParser.java */
/* loaded from: classes.dex */
public class OT {
    public static com.bytedance.adsdk.lottie.vG.vG.Jd pvs(com.bytedance.adsdk.lottie.sUS sus) {
        Rect Jd = sus.Jd();
        return new com.bytedance.adsdk.lottie.vG.vG.Jd(Collections.emptyList(), sus, "__container", -1L, Jd.pvs.PRE_COMP, -1L, null, Collections.emptyList(), new com.bytedance.adsdk.lottie.vG.pvs.kj(), 0, 0, 0, 0.0f, 0.0f, Jd.width(), Jd.height(), null, null, Collections.emptyList(), Jd.icD.NONE, null, false, null, null);
    }

    public static com.bytedance.adsdk.lottie.vG.vG.Jd pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus) throws IOException {
        ArrayList arrayList;
        Jd.icD icd = Jd.icD.NONE;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        jsonReader.beginObject();
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        Jd.icD icd2 = icd;
        Jd.pvs pvsVar = null;
        String str = null;
        com.bytedance.adsdk.lottie.vG.pvs.kj kjVar = null;
        com.bytedance.adsdk.lottie.vG.pvs.Wyp wyp = null;
        com.bytedance.adsdk.lottie.vG.pvs.qh qhVar = null;
        com.bytedance.adsdk.lottie.vG.pvs.icD icd3 = null;
        com.bytedance.adsdk.lottie.vG.icD.pvs pvsVar2 = null;
        Wyp wyp2 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        long j2 = -1;
        float f5 = 1.0f;
        String str2 = "UNSET";
        String str3 = null;
        float f6 = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "parent":
                    j2 = jsonReader.nextInt();
                    break;
                case "shapes":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.bytedance.adsdk.lottie.vG.icD.vG pvs = so.pvs(jsonReader, sus);
                        if (pvs != null) {
                            arrayList3.add(pvs);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case "h":
                    f3 = (float) (jsonReader.nextDouble() * com.bytedance.adsdk.lottie.sUS.sUS.pvs());
                    break;
                case "t":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.hashCode();
                        if (nextName2.equals("a")) {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                qhVar = icD.pvs(jsonReader, sus);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        } else if (nextName2.equals("d")) {
                            wyp = Jd.sUS(jsonReader, sus);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case "w":
                    f2 = (float) (jsonReader.nextDouble() * com.bytedance.adsdk.lottie.sUS.sUS.pvs());
                    break;
                case "cl":
                    str3 = jsonReader.nextString();
                    break;
                case "ef":
                    jsonReader.beginArray();
                    ArrayList arrayList4 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName3 = jsonReader.nextName();
                            nextName3.hashCode();
                            if (nextName3.equals("nm")) {
                                arrayList4.add(jsonReader.nextString());
                            } else if (nextName3.equals("ty")) {
                                int nextInt = jsonReader.nextInt();
                                if (nextInt == 29) {
                                    pvsVar2 = NB.pvs(jsonReader, sus);
                                } else if (nextInt == 25) {
                                    wyp2 = new qh().pvs(jsonReader, sus);
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    sus.pvs("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList4)));
                    break;
                case "hd":
                    z = jsonReader.nextBoolean();
                    break;
                case "ip":
                    f6 = (float) jsonReader.nextDouble();
                    break;
                case "ks":
                    kjVar = vG.pvs(jsonReader, sus);
                    break;
                case "nm":
                    str2 = jsonReader.nextString();
                    break;
                case "op":
                    f4 = (float) jsonReader.nextDouble();
                    break;
                case "sc":
                    i3 = Color.parseColor(jsonReader.nextString());
                    break;
                case "sh":
                    i2 = (int) (jsonReader.nextInt() * com.bytedance.adsdk.lottie.sUS.sUS.pvs());
                    break;
                case "sr":
                    f5 = (float) jsonReader.nextDouble();
                    break;
                case "st":
                    f = (float) jsonReader.nextDouble();
                    break;
                case "sw":
                    i = (int) (jsonReader.nextInt() * com.bytedance.adsdk.lottie.sUS.sUS.pvs());
                    break;
                case "tm":
                    icd3 = Jd.pvs(jsonReader, sus, false);
                    break;
                case "tt":
                    int nextInt2 = jsonReader.nextInt();
                    if (nextInt2 >= Jd.icD.values().length) {
                        sus.pvs("Unsupported matte type: ".concat(String.valueOf(nextInt2)));
                        break;
                    } else {
                        icd2 = Jd.icD.values()[nextInt2];
                        int i4 = AnonymousClass1.pvs[icd2.ordinal()];
                        if (i4 == 1) {
                            sus.pvs("Unsupported matte type: Luma");
                        } else if (i4 == 2) {
                            sus.pvs("Unsupported matte type: Luma Inverted");
                        }
                        sus.pvs(1);
                        break;
                    }
                case "ty":
                    int nextInt3 = jsonReader.nextInt();
                    if (nextInt3 < Jd.pvs.UNKNOWN.ordinal()) {
                        pvsVar = Jd.pvs.values()[nextInt3];
                        break;
                    } else {
                        pvsVar = Jd.pvs.UNKNOWN;
                        break;
                    }
                case "ind":
                    j = jsonReader.nextInt();
                    break;
                case "refId":
                    str = jsonReader.nextString();
                    break;
                case "masksProperties":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList2.add(ZhG.pvs(jsonReader, sus));
                    }
                    sus.pvs(arrayList2.size());
                    jsonReader.endArray();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        ArrayList arrayList5 = new ArrayList();
        if (f6 > 0.0f) {
            arrayList = arrayList2;
            arrayList5.add(new com.bytedance.adsdk.lottie.yiw.pvs(sus, valueOf, valueOf, null, 0.0f, Float.valueOf(f6)));
        } else {
            arrayList = arrayList2;
        }
        if (f4 <= 0.0f) {
            f4 = sus.yiw();
        }
        arrayList5.add(new com.bytedance.adsdk.lottie.yiw.pvs(sus, valueOf2, valueOf2, null, f6, Float.valueOf(f4)));
        arrayList5.add(new com.bytedance.adsdk.lottie.yiw.pvs(sus, valueOf, valueOf, null, f4, Float.valueOf(Float.MAX_VALUE)));
        if (str2.endsWith(".ai") || "ai".equals(str3)) {
            sus.pvs("Convert your Illustrator layers to shape layers.");
        }
        return new com.bytedance.adsdk.lottie.vG.vG.Jd(arrayList3, sus, str2, j, pvsVar, j2, str, arrayList, kjVar, i, i2, i3, f5, f, f2, f3, wyp, qhVar, arrayList5, icd2, icd3, z, pvsVar2, wyp2);
    }

    /* compiled from: LayerParser.java */
    /* renamed from: com.bytedance.adsdk.lottie.NB.OT$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pvs;

        static {
            int[] iArr = new int[Jd.icD.values().length];
            pvs = iArr;
            try {
                iArr[Jd.icD.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pvs[Jd.icD.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
