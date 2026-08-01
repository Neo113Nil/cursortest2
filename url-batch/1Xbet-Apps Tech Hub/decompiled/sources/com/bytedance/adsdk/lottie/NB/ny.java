package com.bytedance.adsdk.lottie.NB;

import android.graphics.Rect;
import android.util.JsonReader;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.bytedance.adsdk.lottie.vG.vG.Jd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LottieCompositionParser.java */
/* loaded from: classes.dex */
public class ny {
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x00f0. Please report as an issue. */
    public static com.bytedance.adsdk.lottie.sUS pvs(JsonReader jsonReader) throws IOException {
        float f;
        char c;
        HashMap hashMap;
        ArrayList arrayList;
        float pvs = com.bytedance.adsdk.lottie.sUS.sUS.pvs();
        LongSparseArray<com.bytedance.adsdk.lottie.vG.vG.Jd> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        SparseArray<com.bytedance.adsdk.lottie.vG.Jd> sparseArray = new SparseArray<>();
        com.bytedance.adsdk.lottie.sUS sus = new com.bytedance.adsdk.lottie.sUS();
        jsonReader.beginObject();
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c2 = 65535;
            switch (nextName.hashCode()) {
                case -1408207997:
                    f = f4;
                    if (nextName.equals("assets")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1109732030:
                    f = f4;
                    if (nextName.equals("layers")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 104:
                    f = f4;
                    if (nextName.equals("h")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 118:
                    f = f4;
                    if (nextName.equals("v")) {
                        c = 3;
                        c2 = c;
                        break;
                    }
                    break;
                case 119:
                    f = f4;
                    if (nextName.equals("w")) {
                        c = 4;
                        c2 = c;
                        break;
                    }
                    break;
                case 3276:
                    f = f4;
                    if (nextName.equals("fr")) {
                        c = 5;
                        c2 = c;
                        break;
                    }
                    break;
                case 3367:
                    f = f4;
                    if (nextName.equals("ip")) {
                        c = 6;
                        c2 = c;
                        break;
                    }
                    break;
                case 3553:
                    f = f4;
                    if (nextName.equals("op")) {
                        c = 7;
                        c2 = c;
                        break;
                    }
                    break;
                case 94623709:
                    f = f4;
                    if (nextName.equals("chars")) {
                        c = '\b';
                        c2 = c;
                        break;
                    }
                    break;
                case 97615364:
                    f = f4;
                    if (nextName.equals("fonts")) {
                        c = '\t';
                        c2 = c;
                        break;
                    }
                    break;
                case 839250809:
                    f = f4;
                    if (nextName.equals("markers")) {
                        c = '\n';
                        c2 = c;
                        break;
                    }
                    break;
                default:
                    f = f4;
                    break;
            }
            switch (c2) {
                case 0:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    pvs(jsonReader, sus, hashMap2, hashMap3);
                    f4 = f;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 1:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    pvs(jsonReader, sus, arrayList2, longSparseArray);
                    f4 = f;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 2:
                    i2 = jsonReader.nextInt();
                    f4 = f;
                    break;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    String[] split = jsonReader.nextString().split("\\.");
                    if (!com.bytedance.adsdk.lottie.sUS.sUS.pvs(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        sus.pvs("Lottie only supports bodymovin >= 4.4.0");
                    }
                    f4 = f;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 4:
                    i = jsonReader.nextInt();
                    f4 = f;
                    break;
                case 5:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f4 = (float) jsonReader.nextDouble();
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case 6:
                    f2 = (float) jsonReader.nextDouble();
                    f4 = f;
                    break;
                case 7:
                    f3 = ((float) jsonReader.nextDouble()) - 0.01f;
                    f4 = f;
                    break;
                case '\b':
                    pvs(jsonReader, sus, sparseArray);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f4 = f;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case '\t':
                    pvs(jsonReader, hashMap4);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f4 = f;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                case '\n':
                    pvs(jsonReader, arrayList3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f4 = f;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
                default:
                    jsonReader.skipValue();
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f4 = f;
                    hashMap4 = hashMap;
                    arrayList3 = arrayList;
                    break;
            }
        }
        jsonReader.endObject();
        sus.pvs(new Rect(0, 0, (int) (i * pvs), (int) (i2 * pvs)), f2, f3, f4, arrayList2, longSparseArray, hashMap2, hashMap3, sparseArray, hashMap4, arrayList3);
        return sus;
    }

    private static void pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus, List<com.bytedance.adsdk.lottie.vG.vG.Jd> list, LongSparseArray<com.bytedance.adsdk.lottie.vG.vG.Jd> longSparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.lottie.vG.vG.Jd pvs = OT.pvs(jsonReader, sus);
            pvs.qh();
            Jd.pvs pvsVar = Jd.pvs.IMAGE;
            list.add(pvs);
            longSparseArray.put(pvs.NB(), pvs);
        }
        jsonReader.endArray();
    }

    private static void pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus, Map<String, List<com.bytedance.adsdk.lottie.vG.vG.Jd>> map, Map<String, com.bytedance.adsdk.lottie.Mxy> map2) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.beginObject();
            int i = 0;
            int i2 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.hashCode();
                switch (nextName) {
                    case "layers":
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            com.bytedance.adsdk.lottie.vG.vG.Jd pvs = OT.pvs(jsonReader, sus);
                            longSparseArray.put(pvs.NB(), pvs);
                            arrayList.add(pvs);
                        }
                        jsonReader.endArray();
                        break;
                    case "h":
                        i2 = jsonReader.nextInt();
                        break;
                    case "p":
                        str2 = jsonReader.nextString();
                        break;
                    case "u":
                        str3 = jsonReader.nextString();
                        break;
                    case "w":
                        i = jsonReader.nextInt();
                        break;
                    case "id":
                        str = jsonReader.nextString();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            if (str2 != null) {
                com.bytedance.adsdk.lottie.Mxy mxy = new com.bytedance.adsdk.lottie.Mxy(i, i2, str, str2, str3);
                map2.put(mxy.vG(), mxy);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.endArray();
    }

    private static void pvs(JsonReader jsonReader, Map<String, com.bytedance.adsdk.lottie.vG.vG> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("list")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.lottie.vG.vG pvs = IP.pvs(jsonReader);
                    map.put(pvs.icD(), pvs);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    private static void pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus, SparseArray<com.bytedance.adsdk.lottie.vG.Jd> sparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.lottie.vG.Jd pvs = Ju.pvs(jsonReader, sus);
            sparseArray.put(pvs.hashCode(), pvs);
        }
        jsonReader.endArray();
    }

    private static void pvs(JsonReader jsonReader, List<com.bytedance.adsdk.lottie.vG.sUS> list) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            float f = 0.0f;
            String str = null;
            float f2 = 0.0f;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.hashCode();
                switch (nextName) {
                    case "cm":
                        str = jsonReader.nextString();
                        break;
                    case "dr":
                        f2 = (float) jsonReader.nextDouble();
                        break;
                    case "tm":
                        f = (float) jsonReader.nextDouble();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            list.add(new com.bytedance.adsdk.lottie.vG.sUS(str, f, f2));
        }
        jsonReader.endArray();
    }
}
