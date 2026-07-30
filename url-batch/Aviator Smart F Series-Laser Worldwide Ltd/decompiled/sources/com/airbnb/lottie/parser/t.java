package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class t {
    private static final float MAX_CP_VALUE = 100.0f;
    private static SparseArrayCompat<WeakReference<Interpolator>> pathInterpolatorCache;
    private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    static JsonReader.a NAMES = JsonReader.a.of("t", "s", "e", "o", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, CmcdHeadersFactory.STREAMING_FORMAT_HLS, TypedValues.TransitionType.S_TO, "ti");
    static JsonReader.a INTERPOLATOR_NAMES = JsonReader.a.of("x", "y");

    t() {
    }

    @Nullable
    private static WeakReference<Interpolator> getInterpolator(int i8) {
        WeakReference<Interpolator> weakReference;
        synchronized (t.class) {
            weakReference = pathInterpolatorCache().get(i8);
        }
        return weakReference;
    }

    private static Interpolator interpolatorFor(PointF pointF, PointF pointF2) {
        Interpolator create;
        pointF.x = com.airbnb.lottie.utils.i.clamp(pointF.x, -1.0f, 1.0f);
        pointF.y = com.airbnb.lottie.utils.i.clamp(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.airbnb.lottie.utils.i.clamp(pointF2.x, -1.0f, 1.0f);
        float clamp = com.airbnb.lottie.utils.i.clamp(pointF2.y, -100.0f, 100.0f);
        pointF2.y = clamp;
        int hashFor = com.airbnb.lottie.utils.j.hashFor(pointF.x, pointF.y, pointF2.x, clamp);
        WeakReference<Interpolator> interpolator = getInterpolator(hashFor);
        Interpolator interpolator2 = interpolator != null ? interpolator.get() : null;
        if (interpolator == null || interpolator2 == null) {
            try {
                create = PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e8) {
                create = "The Path cannot loop back on itself.".equals(e8.getMessage()) ? PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            interpolator2 = create;
            try {
                putInterpolator(hashFor, new WeakReference(interpolator2));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator2;
    }

    static <T> com.airbnb.lottie.value.a parse(JsonReader jsonReader, com.airbnb.lottie.h hVar, float f8, n0 n0Var, boolean z7, boolean z8) {
        return (z7 && z8) ? parseMultiDimensionalKeyframe(hVar, jsonReader, f8, n0Var) : z7 ? parseKeyframe(hVar, jsonReader, f8, n0Var) : parseStaticValue(jsonReader, f8, n0Var);
    }

    private static <T> com.airbnb.lottie.value.a parseKeyframe(com.airbnb.lottie.h hVar, JsonReader jsonReader, float f8, n0 n0Var) {
        Interpolator interpolatorFor;
        Object obj;
        jsonReader.beginObject();
        PointF pointF = null;
        PointF pointF2 = null;
        Object obj2 = null;
        Object obj3 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z7 = false;
        float f9 = 0.0f;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    f9 = (float) jsonReader.nextDouble();
                    break;
                case 1:
                    obj3 = n0Var.parse(jsonReader, f8);
                    break;
                case 2:
                    obj2 = n0Var.parse(jsonReader, f8);
                    break;
                case 3:
                    pointF = s.jsonToPoint(jsonReader, 1.0f);
                    break;
                case 4:
                    pointF2 = s.jsonToPoint(jsonReader, 1.0f);
                    break;
                case 5:
                    if (jsonReader.nextInt() != 1) {
                        z7 = false;
                        break;
                    } else {
                        z7 = true;
                        break;
                    }
                case 6:
                    pointF3 = s.jsonToPoint(jsonReader, f8);
                    break;
                case 7:
                    pointF4 = s.jsonToPoint(jsonReader, f8);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z7) {
            interpolatorFor = LINEAR_INTERPOLATOR;
            obj = obj3;
        } else {
            interpolatorFor = (pointF == null || pointF2 == null) ? LINEAR_INTERPOLATOR : interpolatorFor(pointF, pointF2);
            obj = obj2;
        }
        com.airbnb.lottie.value.a aVar = new com.airbnb.lottie.value.a(hVar, obj3, obj, interpolatorFor, f9, null);
        aVar.pathCp1 = pointF3;
        aVar.pathCp2 = pointF4;
        return aVar;
    }

    private static <T> com.airbnb.lottie.value.a parseMultiDimensionalKeyframe(com.airbnb.lottie.h hVar, JsonReader jsonReader, float f8, n0 n0Var) {
        Interpolator interpolator;
        Interpolator interpolatorFor;
        Interpolator interpolatorFor2;
        Object obj;
        PointF pointF;
        com.airbnb.lottie.value.a aVar;
        PointF pointF2;
        float f9;
        PointF pointF3;
        jsonReader.beginObject();
        PointF pointF4 = null;
        boolean z7 = false;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        Object obj2 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        float f10 = 0.0f;
        PointF pointF11 = null;
        Object obj3 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(NAMES)) {
                case 0:
                    pointF2 = pointF4;
                    f10 = (float) jsonReader.nextDouble();
                    pointF4 = pointF2;
                    break;
                case 1:
                    pointF2 = pointF4;
                    obj2 = n0Var.parse(jsonReader, f8);
                    pointF4 = pointF2;
                    break;
                case 2:
                    pointF2 = pointF4;
                    obj3 = n0Var.parse(jsonReader, f8);
                    pointF4 = pointF2;
                    break;
                case 3:
                    pointF2 = pointF4;
                    f9 = f10;
                    PointF pointF12 = pointF11;
                    if (jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float f11 = 0.0f;
                        float f12 = 0.0f;
                        float f13 = 0.0f;
                        float f14 = 0.0f;
                        while (jsonReader.hasNext()) {
                            int selectName = jsonReader.selectName(INTERPOLATOR_NAMES);
                            if (selectName == 0) {
                                JsonReader.Token peek = jsonReader.peek();
                                JsonReader.Token token = JsonReader.Token.NUMBER;
                                if (peek == token) {
                                    f13 = (float) jsonReader.nextDouble();
                                    f11 = f13;
                                } else {
                                    jsonReader.beginArray();
                                    f11 = (float) jsonReader.nextDouble();
                                    f13 = jsonReader.peek() == token ? (float) jsonReader.nextDouble() : f11;
                                    jsonReader.endArray();
                                }
                            } else if (selectName != 1) {
                                jsonReader.skipValue();
                            } else {
                                JsonReader.Token peek2 = jsonReader.peek();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (peek2 == token2) {
                                    f14 = (float) jsonReader.nextDouble();
                                    f12 = f14;
                                } else {
                                    jsonReader.beginArray();
                                    f12 = (float) jsonReader.nextDouble();
                                    f14 = jsonReader.peek() == token2 ? (float) jsonReader.nextDouble() : f12;
                                    jsonReader.endArray();
                                }
                            }
                        }
                        PointF pointF13 = new PointF(f11, f12);
                        PointF pointF14 = new PointF(f13, f14);
                        jsonReader.endObject();
                        pointF8 = pointF14;
                        pointF7 = pointF13;
                        pointF11 = pointF12;
                        f10 = f9;
                        pointF4 = pointF2;
                        break;
                    } else {
                        pointF5 = s.jsonToPoint(jsonReader, f8);
                        f10 = f9;
                        pointF11 = pointF12;
                        pointF4 = pointF2;
                    }
                case 4:
                    if (jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float f15 = 0.0f;
                        float f16 = 0.0f;
                        float f17 = 0.0f;
                        float f18 = 0.0f;
                        while (jsonReader.hasNext()) {
                            PointF pointF15 = pointF11;
                            int selectName2 = jsonReader.selectName(INTERPOLATOR_NAMES);
                            if (selectName2 != 0) {
                                pointF3 = pointF4;
                                if (selectName2 != 1) {
                                    jsonReader.skipValue();
                                } else {
                                    JsonReader.Token peek3 = jsonReader.peek();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (peek3 == token3) {
                                        f18 = (float) jsonReader.nextDouble();
                                        f10 = f10;
                                        f16 = f18;
                                    } else {
                                        float f19 = f10;
                                        jsonReader.beginArray();
                                        float nextDouble = (float) jsonReader.nextDouble();
                                        float nextDouble2 = jsonReader.peek() == token3 ? (float) jsonReader.nextDouble() : nextDouble;
                                        jsonReader.endArray();
                                        f10 = f19;
                                        pointF11 = pointF15;
                                        pointF4 = pointF3;
                                        f18 = nextDouble2;
                                        f16 = nextDouble;
                                    }
                                }
                            } else {
                                pointF3 = pointF4;
                                float f20 = f10;
                                JsonReader.Token peek4 = jsonReader.peek();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (peek4 == token4) {
                                    f17 = (float) jsonReader.nextDouble();
                                    f10 = f20;
                                    f15 = f17;
                                } else {
                                    jsonReader.beginArray();
                                    f15 = (float) jsonReader.nextDouble();
                                    f17 = jsonReader.peek() == token4 ? (float) jsonReader.nextDouble() : f15;
                                    jsonReader.endArray();
                                    f10 = f20;
                                }
                            }
                            pointF11 = pointF15;
                            pointF4 = pointF3;
                        }
                        pointF2 = pointF4;
                        f9 = f10;
                        PointF pointF16 = new PointF(f15, f16);
                        PointF pointF17 = new PointF(f17, f18);
                        jsonReader.endObject();
                        pointF10 = pointF17;
                        pointF9 = pointF16;
                        f10 = f9;
                        pointF4 = pointF2;
                        break;
                    } else {
                        pointF2 = pointF4;
                        pointF6 = s.jsonToPoint(jsonReader, f8);
                        pointF4 = pointF2;
                    }
                case 5:
                    if (jsonReader.nextInt() != 1) {
                        z7 = false;
                        break;
                    } else {
                        z7 = true;
                        break;
                    }
                case 6:
                    pointF11 = s.jsonToPoint(jsonReader, f8);
                    break;
                case 7:
                    pointF4 = s.jsonToPoint(jsonReader, f8);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        PointF pointF18 = pointF4;
        float f21 = f10;
        PointF pointF19 = pointF11;
        jsonReader.endObject();
        if (z7) {
            interpolator = LINEAR_INTERPOLATOR;
            obj = obj2;
        } else {
            if (pointF5 != null && pointF6 != null) {
                interpolator = interpolatorFor(pointF5, pointF6);
            } else {
                if (pointF7 != null && pointF8 != null && pointF9 != null && pointF10 != null) {
                    interpolatorFor = interpolatorFor(pointF7, pointF9);
                    interpolatorFor2 = interpolatorFor(pointF8, pointF10);
                    obj = obj3;
                    interpolator = null;
                    if (interpolatorFor != null || interpolatorFor2 == null) {
                        pointF = pointF19;
                        aVar = new com.airbnb.lottie.value.a(hVar, obj2, obj, interpolator, f21, null);
                    } else {
                        pointF = pointF19;
                        aVar = new com.airbnb.lottie.value.a(hVar, obj2, obj, interpolatorFor, interpolatorFor2, f21, null);
                    }
                    aVar.pathCp1 = pointF;
                    aVar.pathCp2 = pointF18;
                    return aVar;
                }
                interpolator = LINEAR_INTERPOLATOR;
            }
            obj = obj3;
        }
        interpolatorFor = null;
        interpolatorFor2 = null;
        if (interpolatorFor != null) {
        }
        pointF = pointF19;
        aVar = new com.airbnb.lottie.value.a(hVar, obj2, obj, interpolator, f21, null);
        aVar.pathCp1 = pointF;
        aVar.pathCp2 = pointF18;
        return aVar;
    }

    private static <T> com.airbnb.lottie.value.a parseStaticValue(JsonReader jsonReader, float f8, n0 n0Var) {
        return new com.airbnb.lottie.value.a(n0Var.parse(jsonReader, f8));
    }

    private static SparseArrayCompat<WeakReference<Interpolator>> pathInterpolatorCache() {
        if (pathInterpolatorCache == null) {
            pathInterpolatorCache = new SparseArrayCompat<>();
        }
        return pathInterpolatorCache;
    }

    private static void putInterpolator(int i8, WeakReference<Interpolator> weakReference) {
        synchronized (t.class) {
            pathInterpolatorCache.put(i8, weakReference);
        }
    }
}
