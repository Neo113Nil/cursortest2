package com.airbnb.lottie.parser;

import android.graphics.Color;
import android.graphics.Rect;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.CmcdConfiguration;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class v {
    private static final JsonReader.a NAMES = JsonReader.a.of("nm", "ind", "refId", MapBundleKey.MapObjKey.OBJ_TYPE, "parent", "sw", "sh", "sc", "ks", TtmlNode.TAG_TT, "masksProperties", "shapes", "t", "ef", "sr", CmcdConfiguration.KEY_STREAM_TYPE, "w", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "ip", "op", "tm", "cl", "hd");
    private static final JsonReader.a TEXT_NAMES = JsonReader.a.of("d", "a");
    private static final JsonReader.a EFFECTS_NAMES = JsonReader.a.of(MapBundleKey.MapObjKey.OBJ_TYPE, "nm");

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType = iArr;
            try {
                iArr[Layer.MatteType.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType[Layer.MatteType.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private v() {
    }

    public static Layer parse(com.airbnb.lottie.h hVar) {
        Rect bounds = hVar.getBounds();
        return new Layer(Collections.emptyList(), hVar, "__container", -1L, Layer.LayerType.PRE_COMP, -1L, null, Collections.emptyList(), new com.airbnb.lottie.model.animatable.l(), 0, 0, 0, 0.0f, 0.0f, bounds.width(), bounds.height(), null, null, Collections.emptyList(), Layer.MatteType.NONE, null, false, null, null);
    }

    public static Layer parse(JsonReader jsonReader, com.airbnb.lottie.h hVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Layer.MatteType matteType = Layer.MatteType.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        jsonReader.beginObject();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        Layer.MatteType matteType2 = matteType;
        String str = "UNSET";
        Layer.LayerType layerType = null;
        String str2 = null;
        com.airbnb.lottie.model.animatable.l lVar = null;
        com.airbnb.lottie.model.animatable.j jVar = null;
        com.airbnb.lottie.model.animatable.k kVar = null;
        com.airbnb.lottie.model.animatable.b bVar = null;
        com.airbnb.lottie.model.content.a aVar = null;
        j jVar2 = null;
        long j8 = 0;
        long j9 = -1;
        float f8 = 0.0f;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        float f9 = 1.0f;
        float f10 = 0.0f;
        int i11 = 0;
        int i12 = 0;
        boolean z7 = false;
        float f11 = 0.0f;
        String str3 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    j8 = jsonReader.nextInt();
                    break;
                case 2:
                    str2 = jsonReader.nextString();
                    break;
                case 3:
                    int nextInt = jsonReader.nextInt();
                    layerType = Layer.LayerType.UNKNOWN;
                    if (nextInt >= layerType.ordinal()) {
                        break;
                    } else {
                        layerType = Layer.LayerType.values()[nextInt];
                        break;
                    }
                case 4:
                    j9 = jsonReader.nextInt();
                    break;
                case 5:
                    i8 = (int) (jsonReader.nextInt() * com.airbnb.lottie.utils.j.dpScale());
                    break;
                case 6:
                    i9 = (int) (jsonReader.nextInt() * com.airbnb.lottie.utils.j.dpScale());
                    break;
                case 7:
                    i10 = Color.parseColor(jsonReader.nextString());
                    break;
                case 8:
                    lVar = c.parse(jsonReader, hVar);
                    break;
                case 9:
                    int nextInt2 = jsonReader.nextInt();
                    if (nextInt2 >= Layer.MatteType.values().length) {
                        hVar.addWarning("Unsupported matte type: " + nextInt2);
                        break;
                    } else {
                        matteType2 = Layer.MatteType.values()[nextInt2];
                        int i13 = a.$SwitchMap$com$airbnb$lottie$model$layer$Layer$MatteType[matteType2.ordinal()];
                        if (i13 == 1) {
                            hVar.addWarning("Unsupported matte type: Luma");
                        } else if (i13 == 2) {
                            hVar.addWarning("Unsupported matte type: Luma Inverted");
                        }
                        hVar.incrementMatteOrMaskCount(1);
                        break;
                    }
                case 10:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList3.add(x.parse(jsonReader, hVar));
                    }
                    hVar.incrementMatteOrMaskCount(arrayList3.size());
                    jsonReader.endArray();
                    break;
                case 11:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.airbnb.lottie.model.content.c parse = h.parse(jsonReader, hVar);
                        if (parse != null) {
                            arrayList4.add(parse);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case 12:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        int selectName = jsonReader.selectName(TEXT_NAMES);
                        if (selectName == 0) {
                            jVar = d.parseDocumentData(jsonReader, hVar);
                        } else if (selectName != 1) {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        } else {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                kVar = b.parse(jsonReader, hVar);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 13:
                    jsonReader.beginArray();
                    ArrayList arrayList5 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            int selectName2 = jsonReader.selectName(EFFECTS_NAMES);
                            if (selectName2 == 0) {
                                int nextInt3 = jsonReader.nextInt();
                                if (nextInt3 == 29) {
                                    aVar = e.parse(jsonReader, hVar);
                                } else if (nextInt3 == 25) {
                                    jVar2 = new k().parse(jsonReader, hVar);
                                }
                            } else if (selectName2 != 1) {
                                jsonReader.skipName();
                                jsonReader.skipValue();
                            } else {
                                arrayList5.add(jsonReader.nextString());
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    hVar.addWarning("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    break;
                case 14:
                    f9 = (float) jsonReader.nextDouble();
                    break;
                case 15:
                    f10 = (float) jsonReader.nextDouble();
                    break;
                case 16:
                    i11 = (int) (jsonReader.nextInt() * com.airbnb.lottie.utils.j.dpScale());
                    break;
                case 17:
                    i12 = (int) (jsonReader.nextInt() * com.airbnb.lottie.utils.j.dpScale());
                    break;
                case 18:
                    f8 = (float) jsonReader.nextDouble();
                    break;
                case 19:
                    f11 = (float) jsonReader.nextDouble();
                    break;
                case 20:
                    bVar = d.parseFloat(jsonReader, hVar, false);
                    break;
                case 21:
                    str3 = jsonReader.nextString();
                    break;
                case 22:
                    z7 = jsonReader.nextBoolean();
                    break;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        ArrayList arrayList6 = new ArrayList();
        if (f8 > 0.0f) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new com.airbnb.lottie.value.a(hVar, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f8)));
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
        }
        if (f11 <= 0.0f) {
            f11 = hVar.getEndFrame();
        }
        arrayList2.add(new com.airbnb.lottie.value.a(hVar, valueOf, valueOf, null, f8, Float.valueOf(f11)));
        arrayList2.add(new com.airbnb.lottie.value.a(hVar, valueOf2, valueOf2, null, f11, Float.valueOf(Float.MAX_VALUE)));
        if (str.endsWith(".ai") || "ai".equals(str3)) {
            hVar.addWarning("Convert your Illustrator layers to shape layers.");
        }
        return new Layer(arrayList4, hVar, str, j8, layerType, j9, str2, arrayList, lVar, i8, i9, i10, f9, f10, i11, i12, jVar, kVar, arrayList2, matteType2, bVar, z7, aVar, jVar2);
    }
}
