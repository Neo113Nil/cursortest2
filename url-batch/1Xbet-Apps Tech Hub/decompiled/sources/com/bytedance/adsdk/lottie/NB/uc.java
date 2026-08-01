package com.bytedance.adsdk.lottie.NB;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* compiled from: KeyframeParser.java */
/* loaded from: classes.dex */
class uc {
    private static SparseArray<WeakReference<Interpolator>> icD;
    private static final Interpolator pvs = new LinearInterpolator();

    uc() {
    }

    private static SparseArray<WeakReference<Interpolator>> pvs() {
        if (icD == null) {
            icD = new SparseArray<>();
        }
        return icD;
    }

    private static WeakReference<Interpolator> pvs(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (uc.class) {
            weakReference = pvs().get(i);
        }
        return weakReference;
    }

    private static void pvs(int i, WeakReference<Interpolator> weakReference) {
        synchronized (uc.class) {
            icD.put(i, weakReference);
        }
    }

    static <T> com.bytedance.adsdk.lottie.yiw.pvs<T> pvs(JsonReader jsonReader, com.bytedance.adsdk.lottie.sUS sus, float f, SE<T> se, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return icD(sus, jsonReader, f, se);
        }
        if (z) {
            return pvs(sus, jsonReader, f, se);
        }
        return pvs(jsonReader, f, se);
    }

    private static <T> com.bytedance.adsdk.lottie.yiw.pvs<T> pvs(com.bytedance.adsdk.lottie.sUS sus, JsonReader jsonReader, float f, SE<T> se) throws IOException {
        Interpolator pvs2;
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
                    t = se.icD(jsonReader, f);
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
                    pointF4 = zM.icD(jsonReader, 1.0f);
                    break;
                case "o":
                    pointF = zM.icD(jsonReader, 1.0f);
                    break;
                case "s":
                    t2 = se.icD(jsonReader, f);
                    break;
                case "t":
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case "ti":
                    pointF3 = zM.icD(jsonReader, f);
                    break;
                case "to":
                    pointF2 = zM.icD(jsonReader, f);
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
            pvs2 = pvs(pointF, pointF4);
            com.bytedance.adsdk.lottie.yiw.pvs<T> pvsVar = new com.bytedance.adsdk.lottie.yiw.pvs<>(sus, t2, t, pvs2, f2, null);
            pvsVar.so = pointF2;
            pvsVar.Mxy = pointF3;
            return pvsVar;
        }
        pvs2 = pvs;
        com.bytedance.adsdk.lottie.yiw.pvs<T> pvsVar2 = new com.bytedance.adsdk.lottie.yiw.pvs<>(sus, t2, t, pvs2, f2, null);
        pvsVar2.so = pointF2;
        pvsVar2.Mxy = pointF3;
        return pvsVar2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0262 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static <T> com.bytedance.adsdk.lottie.yiw.pvs<T> icD(com.bytedance.adsdk.lottie.sUS sus, JsonReader jsonReader, float f, SE<T> se) throws IOException {
        Interpolator pvs2;
        Interpolator pvs3;
        T t;
        Interpolator interpolator;
        PointF pointF;
        com.bytedance.adsdk.lottie.yiw.pvs<T> pvsVar;
        float f2;
        PointF pointF2;
        PointF pointF3;
        T t2;
        String str;
        String str2;
        T t3;
        jsonReader.beginObject();
        PointF pointF4 = null;
        boolean z = false;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        T t4 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        float f3 = 0.0f;
        PointF pointF11 = null;
        T t5 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals("e")) {
                        c = 0;
                        break;
                    }
                    break;
                case 104:
                    if (nextName.equals("h")) {
                        c = 1;
                        break;
                    }
                    break;
                case 105:
                    if (nextName.equals("i")) {
                        c = 2;
                        break;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c = 3;
                        break;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        c = 4;
                        break;
                    }
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3701:
                    if (nextName.equals("ti")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3707:
                    if (nextName.equals(TypedValues.TransitionType.S_TO)) {
                        c = 7;
                        break;
                    }
                    break;
            }
            String str3 = "y";
            String str4 = "x";
            switch (c) {
                case 0:
                    f2 = f3;
                    t5 = se.icD(jsonReader, f);
                    f3 = f2;
                    break;
                case 1:
                    pointF2 = pointF4;
                    f2 = f3;
                    pointF3 = pointF11;
                    t2 = t4;
                    z = jsonReader.nextInt() == 1;
                    t4 = t2;
                    pointF11 = pointF3;
                    pointF4 = pointF2;
                    f3 = f2;
                    break;
                case 2:
                    pointF2 = pointF4;
                    f2 = f3;
                    pointF3 = pointF11;
                    t2 = t4;
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float f4 = 0.0f;
                        float f5 = 0.0f;
                        float f6 = 0.0f;
                        float f7 = 0.0f;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            nextName2.hashCode();
                            if (nextName2.equals(str4)) {
                                str = str3;
                                str2 = str4;
                                if (jsonReader.peek() == JsonToken.NUMBER) {
                                    f6 = (float) jsonReader.nextDouble();
                                    f4 = f6;
                                } else {
                                    jsonReader.beginArray();
                                    f4 = (float) jsonReader.nextDouble();
                                    f6 = jsonReader.peek() == JsonToken.NUMBER ? (float) jsonReader.nextDouble() : f4;
                                    jsonReader.endArray();
                                }
                            } else if (nextName2.equals(str3)) {
                                if (jsonReader.peek() == JsonToken.NUMBER) {
                                    str = str3;
                                    str2 = str4;
                                    f7 = (float) jsonReader.nextDouble();
                                    f5 = f7;
                                } else {
                                    str = str3;
                                    str2 = str4;
                                    jsonReader.beginArray();
                                    f5 = (float) jsonReader.nextDouble();
                                    f7 = jsonReader.peek() == JsonToken.NUMBER ? (float) jsonReader.nextDouble() : f5;
                                    jsonReader.endArray();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            str3 = str;
                            str4 = str2;
                        }
                        PointF pointF12 = new PointF(f4, f5);
                        PointF pointF13 = new PointF(f6, f7);
                        jsonReader.endObject();
                        pointF10 = pointF13;
                        pointF9 = pointF12;
                    } else {
                        pointF6 = zM.icD(jsonReader, f);
                    }
                    t4 = t2;
                    pointF11 = pointF3;
                    pointF4 = pointF2;
                    f3 = f2;
                    break;
                case 3:
                    pointF3 = pointF11;
                    pointF2 = pointF4;
                    if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float f8 = 0.0f;
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        while (jsonReader.hasNext()) {
                            float f12 = f3;
                            String nextName3 = jsonReader.nextName();
                            nextName3.hashCode();
                            if (nextName3.equals("x")) {
                                if (jsonReader.peek() == JsonToken.NUMBER) {
                                    t3 = t4;
                                    f10 = (float) jsonReader.nextDouble();
                                    f8 = f10;
                                } else {
                                    t3 = t4;
                                    jsonReader.beginArray();
                                    f8 = (float) jsonReader.nextDouble();
                                    f10 = jsonReader.peek() == JsonToken.NUMBER ? (float) jsonReader.nextDouble() : f8;
                                    jsonReader.endArray();
                                }
                                t4 = t3;
                            } else if (nextName3.equals("y")) {
                                if (jsonReader.peek() == JsonToken.NUMBER) {
                                    f11 = (float) jsonReader.nextDouble();
                                    f9 = f11;
                                } else {
                                    jsonReader.beginArray();
                                    f9 = (float) jsonReader.nextDouble();
                                    f11 = jsonReader.peek() == JsonToken.NUMBER ? (float) jsonReader.nextDouble() : f9;
                                    jsonReader.endArray();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            f3 = f12;
                        }
                        f2 = f3;
                        PointF pointF14 = new PointF(f8, f9);
                        PointF pointF15 = new PointF(f10, f11);
                        jsonReader.endObject();
                        pointF8 = pointF15;
                        pointF7 = pointF14;
                    } else {
                        f2 = f3;
                        pointF5 = zM.icD(jsonReader, f);
                    }
                    pointF11 = pointF3;
                    pointF4 = pointF2;
                    f3 = f2;
                    break;
                case 4:
                    t4 = se.icD(jsonReader, f);
                    break;
                case 5:
                    f3 = (float) jsonReader.nextDouble();
                    break;
                case 6:
                    pointF4 = zM.icD(jsonReader, f);
                    break;
                case 7:
                    pointF11 = zM.icD(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        PointF pointF16 = pointF4;
        float f13 = f3;
        PointF pointF17 = pointF11;
        T t6 = t4;
        jsonReader.endObject();
        if (z) {
            t5 = t6;
        } else {
            if (pointF5 != null && pointF6 != null) {
                interpolator = pvs(pointF5, pointF6);
                t = t5;
                pvs2 = null;
                pvs3 = null;
                if (pvs2 == null) {
                }
                pointF = pointF17;
                pvsVar = new com.bytedance.adsdk.lottie.yiw.pvs<>(sus, t6, t, interpolator, f13, null);
                pvsVar.so = pointF;
                pvsVar.Mxy = pointF16;
                return pvsVar;
            }
            if (pointF7 != null && pointF8 != null && pointF9 != null && pointF10 != null) {
                pvs2 = pvs(pointF7, pointF9);
                pvs3 = pvs(pointF8, pointF10);
                t = t5;
                interpolator = null;
                if (pvs2 == null && pvs3 != null) {
                    pointF = pointF17;
                    pvsVar = new com.bytedance.adsdk.lottie.yiw.pvs<>(sus, t6, t, pvs2, pvs3, f13, null);
                } else {
                    pointF = pointF17;
                    pvsVar = new com.bytedance.adsdk.lottie.yiw.pvs<>(sus, t6, t, interpolator, f13, null);
                }
                pvsVar.so = pointF;
                pvsVar.Mxy = pointF16;
                return pvsVar;
            }
        }
        interpolator = pvs;
        t = t5;
        pvs2 = null;
        pvs3 = null;
        if (pvs2 == null) {
        }
        pointF = pointF17;
        pvsVar = new com.bytedance.adsdk.lottie.yiw.pvs<>(sus, t6, t, interpolator, f13, null);
        pvsVar.so = pointF;
        pvsVar.Mxy = pointF16;
        return pvsVar;
    }

    private static Interpolator pvs(PointF pointF, PointF pointF2) {
        Interpolator linearInterpolator;
        pointF.x = com.bytedance.adsdk.lottie.sUS.NB.icD(pointF.x, -1.0f, 1.0f);
        pointF.y = com.bytedance.adsdk.lottie.sUS.NB.icD(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.bytedance.adsdk.lottie.sUS.NB.icD(pointF2.x, -1.0f, 1.0f);
        pointF2.y = com.bytedance.adsdk.lottie.sUS.NB.icD(pointF2.y, -100.0f, 100.0f);
        int pvs2 = com.bytedance.adsdk.lottie.sUS.sUS.pvs(pointF.x, pointF.y, pointF2.x, pointF2.y);
        WeakReference<Interpolator> pvs3 = com.bytedance.adsdk.lottie.NB.pvs() ? null : pvs(pvs2);
        Interpolator interpolator = pvs3 != null ? pvs3.get() : null;
        if (pvs3 == null || interpolator == null) {
            try {
                linearInterpolator = com.bytedance.adsdk.lottie.mnm.pvs(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    linearInterpolator = com.bytedance.adsdk.lottie.mnm.pvs(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            if (!com.bytedance.adsdk.lottie.NB.pvs()) {
                try {
                    pvs(pvs2, (WeakReference<Interpolator>) new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator;
    }

    private static <T> com.bytedance.adsdk.lottie.yiw.pvs<T> pvs(JsonReader jsonReader, float f, SE<T> se) throws IOException {
        return new com.bytedance.adsdk.lottie.yiw.pvs<>(se.icD(jsonReader, f));
    }
}
