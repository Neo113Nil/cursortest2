package com.airbnb.lottie.parser;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class w {
    private static final JsonReader.a NAMES = JsonReader.a.of("w", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "ip", "op", com.moyoung.dafit.module.common.utils.u.LANGUAGE_FR, "v", "layers", "assets", "fonts", "chars", "markers");
    static JsonReader.a ASSETS_NAMES = JsonReader.a.of("id", "layers", "w", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "p", "u");
    private static final JsonReader.a FONT_NAMES = JsonReader.a.of("list");
    private static final JsonReader.a MARKER_NAMES = JsonReader.a.of("cm", "tm", "dr");

    public static com.airbnb.lottie.h parse(JsonReader jsonReader) {
        HashMap hashMap;
        ArrayList arrayList;
        JsonReader jsonReader2 = jsonReader;
        float dpScale = com.airbnb.lottie.utils.j.dpScale();
        LongSparseArray<Layer> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        SparseArrayCompat<com.airbnb.lottie.model.c> sparseArrayCompat = new SparseArrayCompat<>();
        com.airbnb.lottie.h hVar = new com.airbnb.lottie.h();
        jsonReader.beginObject();
        int i8 = 0;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        int i9 = 0;
        while (jsonReader.hasNext()) {
            switch (jsonReader2.selectName(NAMES)) {
                case 0:
                    i8 = jsonReader.nextInt();
                    continue;
                case 1:
                    i9 = jsonReader.nextInt();
                    continue;
                case 2:
                    f8 = (float) jsonReader.nextDouble();
                    continue;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f9 = ((float) jsonReader.nextDouble()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f10 = (float) jsonReader.nextDouble();
                    break;
                case 5:
                    String[] split = jsonReader.nextString().split("\\.");
                    if (com.airbnb.lottie.utils.j.isAtLeastVersion(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        break;
                    } else {
                        hVar.addWarning("Lottie only supports bodymovin >= 4.4.0");
                        continue;
                    }
                case 6:
                    parseLayers(jsonReader2, hVar, arrayList2, longSparseArray);
                    continue;
                case 7:
                    parseAssets(jsonReader2, hVar, hashMap2, hashMap3);
                    continue;
                case 8:
                    parseFonts(jsonReader2, hashMap4);
                    continue;
                case 9:
                    parseChars(jsonReader2, hVar, sparseArrayCompat);
                    continue;
                case 10:
                    parseMarkers(jsonReader2, arrayList3);
                    continue;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    continue;
            }
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            jsonReader2 = jsonReader;
        }
        hVar.init(new Rect(0, 0, (int) (i8 * dpScale), (int) (i9 * dpScale)), f8, f9, f10, arrayList2, longSparseArray, hashMap2, hashMap3, sparseArrayCompat, hashMap4, arrayList3);
        return hVar;
    }

    private static void parseAssets(JsonReader jsonReader, com.airbnb.lottie.h hVar, Map<String, List<Layer>> map, Map<String, com.airbnb.lottie.j0> map2) {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i8 = 0;
            int i9 = 0;
            while (jsonReader.hasNext()) {
                int selectName = jsonReader.selectName(ASSETS_NAMES);
                if (selectName == 0) {
                    str = jsonReader.nextString();
                } else if (selectName == 1) {
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        Layer parse = v.parse(jsonReader, hVar);
                        longSparseArray.put(parse.getId(), parse);
                        arrayList.add(parse);
                    }
                    jsonReader.endArray();
                } else if (selectName == 2) {
                    i8 = jsonReader.nextInt();
                } else if (selectName == 3) {
                    i9 = jsonReader.nextInt();
                } else if (selectName == 4) {
                    str2 = jsonReader.nextString();
                } else if (selectName != 5) {
                    jsonReader.skipName();
                    jsonReader.skipValue();
                } else {
                    str3 = jsonReader.nextString();
                }
            }
            jsonReader.endObject();
            if (str2 != null) {
                com.airbnb.lottie.j0 j0Var = new com.airbnb.lottie.j0(i8, i9, str, str2, str3);
                map2.put(j0Var.getId(), j0Var);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.endArray();
    }

    private static void parseChars(JsonReader jsonReader, com.airbnb.lottie.h hVar, SparseArrayCompat<com.airbnb.lottie.model.c> sparseArrayCompat) {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.airbnb.lottie.model.c parse = m.parse(jsonReader, hVar);
            sparseArrayCompat.put(parse.hashCode(), parse);
        }
        jsonReader.endArray();
    }

    private static void parseFonts(JsonReader jsonReader, Map<String, com.airbnb.lottie.model.b> map) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(FONT_NAMES) != 0) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.airbnb.lottie.model.b parse = n.parse(jsonReader);
                    map.put(parse.getName(), parse);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    private static void parseLayers(JsonReader jsonReader, com.airbnb.lottie.h hVar, List<Layer> list, LongSparseArray<Layer> longSparseArray) {
        jsonReader.beginArray();
        int i8 = 0;
        while (jsonReader.hasNext()) {
            Layer parse = v.parse(jsonReader, hVar);
            if (parse.getLayerType() == Layer.LayerType.IMAGE) {
                i8++;
            }
            list.add(parse);
            longSparseArray.put(parse.getId(), parse);
            if (i8 > 4) {
                com.airbnb.lottie.utils.f.warning("You have " + i8 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.endArray();
    }

    private static void parseMarkers(JsonReader jsonReader, List<com.airbnb.lottie.model.g> list) {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            float f8 = 0.0f;
            String str = null;
            float f9 = 0.0f;
            while (jsonReader.hasNext()) {
                int selectName = jsonReader.selectName(MARKER_NAMES);
                if (selectName == 0) {
                    str = jsonReader.nextString();
                } else if (selectName == 1) {
                    f8 = (float) jsonReader.nextDouble();
                } else if (selectName != 2) {
                    jsonReader.skipName();
                    jsonReader.skipValue();
                } else {
                    f9 = (float) jsonReader.nextDouble();
                }
            }
            jsonReader.endObject();
            list.add(new com.airbnb.lottie.model.g(str, f8, f9));
        }
        jsonReader.endArray();
    }
}
