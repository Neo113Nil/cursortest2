package com.bytedance.adsdk.fs.btk;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: classes14.dex */
class iqz {
    private static SparseArray<WeakReference<Interpolator>> fs;
    private static final Interpolator zmn = new LinearInterpolator();

    iqz() {
    }

    private static SparseArray<WeakReference<Interpolator>> zmn() {
        if (fs == null) {
            fs = new SparseArray<>();
        }
        return fs;
    }

    private static WeakReference<Interpolator> zmn(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (iqz.class) {
            weakReference = zmn().get(i);
        }
        return weakReference;
    }

    private static void zmn(int i, WeakReference<Interpolator> weakReference) {
        synchronized (iqz.class) {
            fs.put(i, weakReference);
        }
    }

    static <T> com.bytedance.adsdk.fs.nps.zmn<T> zmn(JsonReader jsonReader, com.bytedance.adsdk.fs.nps npsVar, float f, vlj<T> vljVar, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return fs(npsVar, jsonReader, f, vljVar);
        }
        if (z) {
            return zmn(npsVar, jsonReader, f, vljVar);
        }
        return zmn(jsonReader, f, vljVar);
    }

    private static <T> com.bytedance.adsdk.fs.nps.zmn<T> zmn(com.bytedance.adsdk.fs.nps npsVar, JsonReader jsonReader, float f, vlj<T> vljVar) throws IOException {
        Interpolator zmn2;
        jsonReader.beginObject();
        PointF pointF = null;
        T t = null;
        T t2 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f2 = 0.0f;
        boolean z = false;
        PointF pointF4 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "e":
                    t = vljVar.fs(jsonReader, f);
                    break;
                case "h":
                    if (jsonReader.nextInt() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case "i":
                    pointF4 = kw.fs(jsonReader, 1.0f);
                    break;
                case "o":
                    pointF = kw.fs(jsonReader, 1.0f);
                    break;
                case "s":
                    t2 = vljVar.fs(jsonReader, f);
                    break;
                case "t":
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case "ti":
                    pointF3 = kw.fs(jsonReader, f);
                    break;
                case "to":
                    pointF2 = kw.fs(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            t = t2;
        } else if (pointF != null && pointF4 != null) {
            zmn2 = zmn(pointF, pointF4);
            com.bytedance.adsdk.fs.nps.zmn<T> zmnVar = new com.bytedance.adsdk.fs.nps.zmn<>(npsVar, t2, t, zmn2, f2, null);
            zmnVar.zg = pointF2;
            zmnVar.bvs = pointF3;
            return zmnVar;
        }
        zmn2 = zmn;
        com.bytedance.adsdk.fs.nps.zmn<T> zmnVar2 = new com.bytedance.adsdk.fs.nps.zmn<>(npsVar, t2, t, zmn2, f2, null);
        zmnVar2.zg = pointF2;
        zmnVar2.bvs = pointF3;
        return zmnVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x02b4 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static <T> com.bytedance.adsdk.fs.nps.zmn<T> fs(com.bytedance.adsdk.fs.nps npsVar, JsonReader jsonReader, float f, vlj<T> vljVar) throws IOException {
        Interpolator zmn2;
        Interpolator zmn3;
        T t;
        Interpolator interpolator;
        com.bytedance.adsdk.fs.nps.zmn<T> zmnVar;
        PointF pointF;
        String str;
        T t2;
        String str2;
        String str3;
        PointF pointF2;
        T t3;
        String str4 = VastAttributes.VERTICAL_POSITION;
        String str5 = VastAttributes.HORIZONTAL_POSITION;
        jsonReader.beginObject();
        PointF pointF3 = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        boolean z = false;
        PointF pointF6 = null;
        PointF pointF7 = null;
        PointF pointF8 = null;
        T t4 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        float f2 = 0.0f;
        T t5 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 101:
                    pointF = pointF5;
                    if (nextName.equals(EidRequestBuilder.REQUEST_FIELD_EMAIL)) {
                        c = 0;
                        break;
                    }
                    break;
                case 104:
                    pointF = pointF5;
                    if (nextName.equals("h")) {
                        c = 1;
                        break;
                    }
                    break;
                case 105:
                    pointF = pointF5;
                    if (nextName.equals("i")) {
                        c = 2;
                        break;
                    }
                    break;
                case 111:
                    pointF = pointF5;
                    if (nextName.equals("o")) {
                        c = 3;
                        break;
                    }
                    break;
                case 115:
                    pointF = pointF5;
                    if (nextName.equals("s")) {
                        c = 4;
                        break;
                    }
                    break;
                case 116:
                    pointF = pointF5;
                    if (nextName.equals("t")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3701:
                    pointF = pointF5;
                    if (nextName.equals("ti")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3707:
                    pointF = pointF5;
                    if (nextName.equals("to")) {
                        c = 7;
                        break;
                    }
                    break;
                default:
                    pointF = pointF5;
                    break;
            }
            switch (c) {
                case 0:
                    str = str4;
                    t2 = t4;
                    t5 = vljVar.fs(jsonReader, f);
                    pointF5 = pointF;
                    t4 = t2;
                    str4 = str;
                    break;
                case 1:
                    String str6 = str4;
                    String str7 = str5;
                    PointF pointF11 = pointF4;
                    T t6 = t4;
                    PointF pointF12 = pointF9;
                    PointF pointF13 = pointF3;
                    z = jsonReader.nextInt() == 1;
                    pointF9 = pointF12;
                    pointF3 = pointF13;
                    pointF4 = pointF11;
                    pointF5 = pointF;
                    t4 = t6;
                    str4 = str6;
                    str5 = str7;
                    break;
                case 2:
                    PointF pointF14 = pointF4;
                    t2 = t4;
                    PointF pointF15 = pointF3;
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float f3 = 0.0f;
                        float f4 = 0.0f;
                        float f5 = 0.0f;
                        float f6 = 0.0f;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.hashCode();
                            if (nextName2.equals(str5)) {
                                str2 = str4;
                                str3 = str5;
                                JsonToken peek = jsonReader.peek();
                                JsonToken jsonToken = JsonToken.NUMBER;
                                if (peek == jsonToken) {
                                    f5 = (float) jsonReader.nextDouble();
                                    f3 = f5;
                                } else {
                                    jsonReader.beginArray();
                                    PointF pointF16 = pointF9;
                                    f3 = (float) jsonReader.nextDouble();
                                    f5 = jsonReader.peek() == jsonToken ? (float) jsonReader.nextDouble() : f3;
                                    jsonReader.endArray();
                                    pointF9 = pointF16;
                                }
                            } else if (nextName2.equals(str4)) {
                                JsonToken peek2 = jsonReader.peek();
                                JsonToken jsonToken2 = JsonToken.NUMBER;
                                if (peek2 == jsonToken2) {
                                    str2 = str4;
                                    str3 = str5;
                                    f6 = (float) jsonReader.nextDouble();
                                    f4 = f6;
                                } else {
                                    str2 = str4;
                                    str3 = str5;
                                    jsonReader.beginArray();
                                    f4 = (float) jsonReader.nextDouble();
                                    f6 = jsonReader.peek() == jsonToken2 ? (float) jsonReader.nextDouble() : f4;
                                    jsonReader.endArray();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            str4 = str2;
                            str5 = str3;
                        }
                        str = str4;
                        pointF10 = new PointF(f3, f4);
                        pointF3 = new PointF(f5, f6);
                        jsonReader.endObject();
                    } else {
                        str = str4;
                        pointF7 = kw.fs(jsonReader, f);
                        pointF3 = pointF15;
                    }
                    pointF4 = pointF14;
                    pointF5 = pointF;
                    t4 = t2;
                    str4 = str;
                    break;
                case 3:
                    PointF pointF17 = pointF4;
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float f7 = 0.0f;
                        float f8 = 0.0f;
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        while (jsonReader.hasNext()) {
                            PointF pointF18 = pointF17;
                            String nextName3 = jsonReader.nextName();
                            nextName3.hashCode();
                            if (nextName3.equals(str5)) {
                                T t7 = t4;
                                JsonToken peek3 = jsonReader.peek();
                                JsonToken jsonToken3 = JsonToken.NUMBER;
                                if (peek3 == jsonToken3) {
                                    f9 = (float) jsonReader.nextDouble();
                                    t4 = t7;
                                    f7 = f9;
                                } else {
                                    jsonReader.beginArray();
                                    PointF pointF19 = pointF3;
                                    f7 = (float) jsonReader.nextDouble();
                                    f9 = jsonReader.peek() == jsonToken3 ? (float) jsonReader.nextDouble() : f7;
                                    jsonReader.endArray();
                                    pointF3 = pointF19;
                                    pointF17 = pointF18;
                                    t4 = t7;
                                }
                            } else if (nextName3.equals(str4)) {
                                JsonToken peek4 = jsonReader.peek();
                                JsonToken jsonToken4 = JsonToken.NUMBER;
                                if (peek4 == jsonToken4) {
                                    f10 = (float) jsonReader.nextDouble();
                                    t4 = t4;
                                    f8 = f10;
                                } else {
                                    T t8 = t4;
                                    jsonReader.beginArray();
                                    float nextDouble = (float) jsonReader.nextDouble();
                                    if (jsonReader.peek() == jsonToken4) {
                                        f8 = nextDouble;
                                        f10 = (float) jsonReader.nextDouble();
                                    } else {
                                        f8 = nextDouble;
                                        f10 = f8;
                                    }
                                    jsonReader.endArray();
                                    t4 = t8;
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            pointF17 = pointF18;
                        }
                        pointF2 = pointF17;
                        t3 = t4;
                        PointF pointF20 = pointF3;
                        PointF pointF21 = new PointF(f7, f8);
                        PointF pointF22 = new PointF(f9, f10);
                        jsonReader.endObject();
                        pointF8 = pointF21;
                        pointF9 = pointF22;
                        pointF3 = pointF20;
                    } else {
                        pointF2 = pointF17;
                        t3 = t4;
                        pointF6 = kw.fs(jsonReader, f);
                    }
                    pointF4 = pointF2;
                    pointF5 = pointF;
                    t4 = t3;
                    break;
                case 4:
                    t4 = vljVar.fs(jsonReader, f);
                    pointF5 = pointF;
                    break;
                case 5:
                    f2 = (float) jsonReader.nextDouble();
                    pointF5 = pointF;
                    pointF4 = pointF4;
                    break;
                case 6:
                    pointF5 = kw.fs(jsonReader, f);
                    break;
                case 7:
                    pointF4 = kw.fs(jsonReader, f);
                    pointF5 = pointF;
                    break;
                default:
                    jsonReader.skipValue();
                    pointF5 = pointF;
                    break;
            }
        }
        PointF pointF23 = pointF4;
        PointF pointF24 = pointF5;
        T t9 = t4;
        PointF pointF25 = pointF9;
        PointF pointF26 = pointF3;
        jsonReader.endObject();
        if (z) {
            t5 = t9;
        } else {
            if (pointF6 != null && pointF7 != null) {
                interpolator = zmn(pointF6, pointF7);
                t = t5;
                zmn2 = null;
                zmn3 = null;
                if (zmn2 == null) {
                }
                zmnVar = new com.bytedance.adsdk.fs.nps.zmn<>(npsVar, t9, t, interpolator, f2, null);
                zmnVar.zg = pointF23;
                zmnVar.bvs = pointF24;
                return zmnVar;
            }
            if (pointF8 != null && pointF25 != null && pointF10 != null && pointF26 != null) {
                zmn2 = zmn(pointF8, pointF10);
                zmn3 = zmn(pointF25, pointF26);
                t = t5;
                interpolator = null;
                if (zmn2 == null && zmn3 != null) {
                    zmnVar = new com.bytedance.adsdk.fs.nps.zmn<>(npsVar, t9, t, zmn2, zmn3, f2, null);
                } else {
                    zmnVar = new com.bytedance.adsdk.fs.nps.zmn<>(npsVar, t9, t, interpolator, f2, null);
                }
                zmnVar.zg = pointF23;
                zmnVar.bvs = pointF24;
                return zmnVar;
            }
        }
        interpolator = zmn;
        t = t5;
        zmn2 = null;
        zmn3 = null;
        if (zmn2 == null) {
        }
        zmnVar = new com.bytedance.adsdk.fs.nps.zmn<>(npsVar, t9, t, interpolator, f2, null);
        zmnVar.zg = pointF23;
        zmnVar.bvs = pointF24;
        return zmnVar;
    }

    private static Interpolator zmn(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = com.bytedance.adsdk.fs.hhw.btk.fs(pointF.x, -1.0f, 1.0f);
        pointF.y = com.bytedance.adsdk.fs.hhw.btk.fs(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.bytedance.adsdk.fs.hhw.btk.fs(pointF2.x, -1.0f, 1.0f);
        float fs2 = com.bytedance.adsdk.fs.hhw.btk.fs(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fs2;
        int zmn2 = com.bytedance.adsdk.fs.hhw.hhw.zmn(pointF.x, pointF.y, pointF2.x, fs2);
        WeakReference<Interpolator> zmn3 = com.bytedance.adsdk.fs.btk.zmn() ? null : zmn(zmn2);
        Interpolator interpolator = zmn3 != null ? zmn3.get() : null;
        if (zmn3 == null || interpolator == null) {
            try {
                linearInterpolator = com.bytedance.adsdk.fs.olo.zmn(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    linearInterpolator = com.bytedance.adsdk.fs.olo.zmn(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            if (!com.bytedance.adsdk.fs.btk.zmn()) {
                try {
                    zmn(zmn2, (WeakReference<Interpolator>) new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator;
    }

    private static <T> com.bytedance.adsdk.fs.nps.zmn<T> zmn(JsonReader jsonReader, float f, vlj<T> vljVar) throws IOException {
        return new com.bytedance.adsdk.fs.nps.zmn<>(vljVar.fs(jsonReader, f));
    }
}
