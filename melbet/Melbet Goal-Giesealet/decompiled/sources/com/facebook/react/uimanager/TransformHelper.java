package com.facebook.react.uimanager;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.ReactNativeJNISoLoader;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TransformHelper.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0007J:\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J2\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0007J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\bH\u0002J$\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0002J3\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u001dH\u0083 R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/uimanager/TransformHelper;", "", "<init>", "()V", "helperMatrix", "Ljava/lang/ThreadLocal;", "", "convertToRadians", "", "transformMap", "Lcom/facebook/react/bridge/ReadableMap;", "key", "", "processTransform", "", "transforms", "Lcom/facebook/react/bridge/ReadableArray;", "result", "viewWidth", "", "viewHeight", ViewProps.TRANSFORM_ORIGIN, "allowPercentageResolution", "", "parseTranslateValue", "stringValue", TypedValues.Custom.S_DIMENSION, "getTranslateForTransformOrigin", "nativeProcessTransform", "Lcom/facebook/react/bridge/NativeArray;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TransformHelper {
    public static final TransformHelper INSTANCE = new TransformHelper();
    private static final ThreadLocal<double[]> helperMatrix;

    /* compiled from: TransformHelper.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    private static final native void nativeProcessTransform(NativeArray transforms, double[] result, float viewWidth, float viewHeight, NativeArray transformOrigin);

    private TransformHelper() {
    }

    static {
        ReactNativeJNISoLoader.staticInit();
        helperMatrix = new ThreadLocal<double[]>() { // from class: com.facebook.react.uimanager.TransformHelper$helperMatrix$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            public double[] initialValue() {
                return new double[16];
            }
        };
    }

    private final double convertToRadians(ReadableMap transformMap, String key) {
        double d;
        boolean z = true;
        if (transformMap.getType(key) == ReadableType.String) {
            String string = transformMap.getString(key);
            Intrinsics.checkNotNull(string);
            if (StringsKt.endsWith$default(string, "rad", false, 2, (Object) null)) {
                string = StringsKt.dropLast(string, 3);
            } else if (StringsKt.endsWith$default(string, "deg", false, 2, (Object) null)) {
                string = StringsKt.dropLast(string, 3);
                z = false;
            }
            d = Double.parseDouble(string);
        } else {
            d = transformMap.getDouble(key);
        }
        return z ? d : MatrixMathHelper.degreesToRadians(d);
    }

    @Deprecated(message = "Use processTransform(ReadableArray, DoubleArray, Float, Float, ReadableArray) instead", replaceWith = @ReplaceWith(expression = "processTransform(...)", imports = {}))
    @JvmStatic
    public static final void processTransform(ReadableArray transforms, double[] result) {
        Intrinsics.checkNotNullParameter(transforms, "transforms");
        Intrinsics.checkNotNullParameter(result, "result");
        processTransform(transforms, result, 0.0f, 0.0f, null);
    }

    @Deprecated(message = "Use processTransform(ReadableArray, DoubleArray, Float, Float, ReadableArray) instead", replaceWith = @ReplaceWith(expression = "processTransform(...)", imports = {}))
    @JvmStatic
    public static final void processTransform(ReadableArray transforms, double[] result, float viewWidth, float viewHeight, ReadableArray transformOrigin, boolean allowPercentageResolution) {
        Intrinsics.checkNotNullParameter(transforms, "transforms");
        Intrinsics.checkNotNullParameter(result, "result");
        processTransform(transforms, result, viewWidth, viewHeight, transformOrigin);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01db, code lost:
    
        if (r11.equals("rotate") == false) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void processTransform(ReadableArray transforms, double[] result, float viewWidth, float viewHeight, ReadableArray transformOrigin) {
        int i;
        int i2;
        int i3;
        char c;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        Intrinsics.checkNotNullParameter(transforms, "transforms");
        Intrinsics.checkNotNullParameter(result, "result");
        if (transforms instanceof NativeArray) {
            if (transformOrigin == 0 ? true : transformOrigin instanceof NativeArray) {
                nativeProcessTransform((NativeArray) transforms, result, viewWidth, viewHeight, (NativeArray) transformOrigin);
                return;
            }
        }
        double[] dArr = helperMatrix.get();
        Intrinsics.checkNotNull(dArr);
        double[] dArr2 = dArr;
        MatrixMathHelper.resetIdentityMatrix(result);
        double[] translateForTransformOrigin = INSTANCE.getTranslateForTransformOrigin(viewWidth, viewHeight, transformOrigin);
        int i4 = 0;
        if (translateForTransformOrigin != null) {
            MatrixMathHelper.resetIdentityMatrix(dArr2);
            MatrixMathHelper.applyTranslate3D(dArr2, translateForTransformOrigin[0], translateForTransformOrigin[1], translateForTransformOrigin[2]);
            MatrixMathHelper.multiplyInto(result, result, dArr2);
        }
        char c2 = 16;
        if (transforms.size() == 16 && transforms.getType(0) == ReadableType.Number) {
            MatrixMathHelper.resetIdentityMatrix(dArr2);
            int size = transforms.size();
            for (int i5 = 0; i5 < size; i5++) {
                dArr2[i5] = transforms.getDouble(i5);
            }
            MatrixMathHelper.multiplyInto(result, result, dArr2);
        } else {
            int size2 = transforms.size();
            int i6 = 0;
            while (i6 < size2) {
                ReadableMap map = transforms.getMap(i6);
                Intrinsics.checkNotNull(map);
                String nextKey = map.keySetIterator().nextKey();
                MatrixMathHelper.resetIdentityMatrix(dArr2);
                switch (nextKey.hashCode()) {
                    case -1721943862:
                        i = size2;
                        i2 = i4;
                        i3 = i6;
                        c = c2;
                        if (nextKey.equals(ViewProps.TRANSLATE_X)) {
                            if (map.getType(nextKey) == ReadableType.String) {
                                TransformHelper transformHelper = INSTANCE;
                                String string = map.getString(nextKey);
                                Intrinsics.checkNotNull(string);
                                d = transformHelper.parseTranslateValue(string, viewWidth);
                            } else {
                                d = map.getDouble(nextKey);
                            }
                            MatrixMathHelper.applyTranslate2D(dArr2, d, 0.0d);
                            break;
                        }
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case -1721943861:
                        i = size2;
                        i2 = i4;
                        i3 = i6;
                        c = c2;
                        if (nextKey.equals(ViewProps.TRANSLATE_Y)) {
                            if (map.getType(nextKey) == ReadableType.String) {
                                TransformHelper transformHelper2 = INSTANCE;
                                String string2 = map.getString(nextKey);
                                Intrinsics.checkNotNull(string2);
                                d2 = transformHelper2.parseTranslateValue(string2, viewHeight);
                            } else {
                                d2 = map.getDouble(nextKey);
                            }
                            MatrixMathHelper.applyTranslate2D(dArr2, 0.0d, d2);
                            break;
                        }
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case -1081239615:
                        i = size2;
                        i2 = i4;
                        i3 = i6;
                        if (nextKey.equals("matrix")) {
                            ReadableArray array = map.getArray(nextKey);
                            Intrinsics.checkNotNull(array);
                            c = 16;
                            for (int i7 = i2; i7 < 16; i7++) {
                                dArr2[i7] = array.getDouble(i7);
                            }
                            break;
                        }
                        c = 16;
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case -925180581:
                        i = size2;
                        i2 = i4;
                        i3 = i6;
                        break;
                    case -908189618:
                        i = size2;
                        i2 = i4;
                        i3 = i6;
                        if (nextKey.equals("scaleX")) {
                            MatrixMathHelper.applyScaleX(dArr2, map.getDouble(nextKey));
                            c = 16;
                            break;
                        }
                        c = 16;
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case -908189617:
                        i = size2;
                        i2 = i4;
                        i3 = i6;
                        if (nextKey.equals("scaleY")) {
                            MatrixMathHelper.applyScaleY(dArr2, map.getDouble(nextKey));
                            c = 16;
                            break;
                        }
                        c = 16;
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case 109250890:
                        i = size2;
                        i2 = i4;
                        i3 = i6;
                        if (nextKey.equals("scale")) {
                            double d7 = map.getDouble(nextKey);
                            MatrixMathHelper.applyScaleX(dArr2, d7);
                            MatrixMathHelper.applyScaleY(dArr2, d7);
                            c = 16;
                            break;
                        }
                        c = 16;
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case 109493390:
                        i = size2;
                        i2 = i4;
                        i3 = i6;
                        if (nextKey.equals("skewX")) {
                            MatrixMathHelper.applySkewX(dArr2, INSTANCE.convertToRadians(map, nextKey));
                            c = 16;
                            break;
                        }
                        c = 16;
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case 109493391:
                        i = size2;
                        i2 = i4;
                        i3 = i6;
                        if (nextKey.equals("skewY")) {
                            MatrixMathHelper.applySkewY(dArr2, INSTANCE.convertToRadians(map, nextKey));
                            c = 16;
                            break;
                        }
                        c = 16;
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case 207960636:
                        i = size2;
                        i2 = i4;
                        i3 = i6;
                        if (nextKey.equals("perspective")) {
                            MatrixMathHelper.applyPerspective(dArr2, map.getDouble(nextKey));
                            c = 16;
                            break;
                        }
                        c = 16;
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case 1052832078:
                        if (nextKey.equals("translate")) {
                            ReadableArray array2 = map.getArray(nextKey);
                            Intrinsics.checkNotNull(array2);
                            if (array2.getType(i4) == ReadableType.String) {
                                TransformHelper transformHelper3 = INSTANCE;
                                String string3 = array2.getString(i4);
                                Intrinsics.checkNotNull(string3);
                                d3 = transformHelper3.parseTranslateValue(string3, viewWidth);
                            } else {
                                d3 = array2.getDouble(i4);
                            }
                            if (array2.getType(1) == ReadableType.String) {
                                TransformHelper transformHelper4 = INSTANCE;
                                String string4 = array2.getString(1);
                                Intrinsics.checkNotNull(string4);
                                i2 = i4;
                                d4 = transformHelper4.parseTranslateValue(string4, viewHeight);
                            } else {
                                i2 = i4;
                                d4 = array2.getDouble(1);
                            }
                            if (array2.size() > 2) {
                                double d8 = d4;
                                d6 = array2.getDouble(2);
                                d5 = d8;
                            } else {
                                d5 = d4;
                                d6 = 0.0d;
                            }
                            i3 = i6;
                            double d9 = d3;
                            i = size2;
                            MatrixMathHelper.applyTranslate3D(dArr2, d9, d5, d6);
                            c = 16;
                            break;
                        }
                        i = size2;
                        i2 = i4;
                        i3 = i6;
                        c = c2;
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case 1384173149:
                        if (nextKey.equals("rotateX")) {
                            MatrixMathHelper.applyRotateX(dArr2, INSTANCE.convertToRadians(map, nextKey));
                            i = size2;
                            i2 = i4;
                            i3 = i6;
                            c = c2;
                            break;
                        }
                        i = size2;
                        i2 = i4;
                        i3 = i6;
                        c = c2;
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case 1384173150:
                        if (nextKey.equals("rotateY")) {
                            MatrixMathHelper.applyRotateY(dArr2, INSTANCE.convertToRadians(map, nextKey));
                            i = size2;
                            i2 = i4;
                            i3 = i6;
                            c = c2;
                            break;
                        }
                        i = size2;
                        i2 = i4;
                        i3 = i6;
                        c = c2;
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    case 1384173151:
                        if (nextKey.equals("rotateZ")) {
                            i = size2;
                            i2 = i4;
                            i3 = i6;
                            MatrixMathHelper.applyRotateZ(dArr2, INSTANCE.convertToRadians(map, nextKey));
                            c = 16;
                            break;
                        }
                        i = size2;
                        i2 = i4;
                        i3 = i6;
                        c = c2;
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                    default:
                        i = size2;
                        i2 = i4;
                        i3 = i6;
                        c = c2;
                        FLog.w(ReactConstants.TAG, "Unsupported transform type: " + nextKey);
                        break;
                }
                MatrixMathHelper.multiplyInto(result, result, dArr2);
                int i8 = i3 + 1;
                size2 = i;
                c2 = c;
                i4 = i2;
                i6 = i8;
            }
        }
        int i9 = i4;
        if (translateForTransformOrigin != null) {
            MatrixMathHelper.resetIdentityMatrix(dArr2);
            MatrixMathHelper.applyTranslate3D(dArr2, -translateForTransformOrigin[i9], -translateForTransformOrigin[1], -translateForTransformOrigin[2]);
            MatrixMathHelper.multiplyInto(result, result, dArr2);
        }
    }

    private final double parseTranslateValue(String stringValue, double dimension) {
        try {
            if (StringsKt.endsWith$default(stringValue, "%", false, 2, (Object) null)) {
                return (Double.parseDouble(StringsKt.dropLast(stringValue, 1)) * dimension) / 100.0d;
            }
            return Double.parseDouble(stringValue);
        } catch (NumberFormatException unused) {
            FLog.w(ReactConstants.TAG, "Invalid translate value: " + stringValue);
            return 0.0d;
        }
    }

    private final double[] getTranslateForTransformOrigin(float viewWidth, float viewHeight, ReadableArray transformOrigin) {
        boolean z;
        int i;
        if (transformOrigin == null || (viewHeight == 0.0f && viewWidth == 0.0f)) {
            return null;
        }
        double d = viewWidth / 2.0d;
        double d2 = viewHeight / 2.0d;
        double[] dArr = new double[3];
        boolean z2 = false;
        dArr[0] = d;
        int i2 = 1;
        dArr[1] = d2;
        dArr[2] = 0.0d;
        int min = Math.min(transformOrigin.size(), 3);
        int i3 = 0;
        while (i3 < min) {
            int i4 = WhenMappings.$EnumSwitchMapping$0[transformOrigin.getType(i3).ordinal()];
            if (i4 != i2) {
                if (i4 == 2) {
                    String string = transformOrigin.getString(i3);
                    Intrinsics.checkNotNull(string);
                    if (StringsKt.endsWith$default(string, "%", z2, 2, (Object) null)) {
                        double parseDouble = Double.parseDouble(StringsKt.dropLast(string, i2));
                        z = z2;
                        i = i2;
                        dArr[i3] = ((i3 == 0 ? viewWidth : viewHeight) * parseDouble) / 100.0d;
                    }
                }
                z = z2;
                i = i2;
            } else {
                z = z2;
                i = i2;
                dArr[i3] = transformOrigin.getDouble(i3);
            }
            i3++;
            z2 = z;
            i2 = i;
        }
        boolean z3 = z2;
        int i5 = i2;
        double d3 = (-d) + dArr[z3 ? 1 : 0];
        double d4 = (-d2) + dArr[i5];
        double d5 = dArr[2];
        double[] dArr2 = new double[3];
        dArr2[z3 ? 1 : 0] = d3;
        dArr2[i5] = d4;
        dArr2[2] = d5;
        return dArr2;
    }
}
