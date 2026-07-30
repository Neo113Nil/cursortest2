package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class o implements n0 {
    private int colorPoints;

    public o(int i8) {
        this.colorPoints = i8;
    }

    private com.airbnb.lottie.model.content.d addOpacityStopsToGradientIfNeeded(com.airbnb.lottie.model.content.d dVar, List<Float> list) {
        int i8 = this.colorPoints * 4;
        if (list.size() <= i8) {
            return dVar;
        }
        float[] positions = dVar.getPositions();
        int[] colors = dVar.getColors();
        int size = (list.size() - i8) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i9 = 0;
        while (i8 < list.size()) {
            if (i8 % 2 == 0) {
                fArr[i9] = list.get(i8).floatValue();
            } else {
                fArr2[i9] = list.get(i8).floatValue();
                i9++;
            }
            i8++;
        }
        float[] mergeUniqueElements = mergeUniqueElements(dVar.getPositions(), fArr);
        int length = mergeUniqueElements.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            float f8 = mergeUniqueElements[i10];
            int binarySearch = Arrays.binarySearch(positions, f8);
            int binarySearch2 = Arrays.binarySearch(fArr, f8);
            if (binarySearch < 0 || binarySearch2 > 0) {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                iArr[i10] = getColorInBetweenColorStops(f8, fArr2[binarySearch2], positions, colors);
            } else {
                iArr[i10] = getColorInBetweenOpacityStops(f8, colors[binarySearch], fArr, fArr2);
            }
        }
        return new com.airbnb.lottie.model.content.d(mergeUniqueElements, iArr);
    }

    private int getColorInBetweenColorStops(float f8, float f9, float[] fArr, int[] iArr) {
        if (iArr.length < 2 || f8 == fArr[0]) {
            return iArr[0];
        }
        for (int i8 = 1; i8 < fArr.length; i8++) {
            float f10 = fArr[i8];
            if (f10 >= f8 || i8 == fArr.length - 1) {
                int i9 = i8 - 1;
                float f11 = fArr[i9];
                float f12 = (f8 - f11) / (f10 - f11);
                int i10 = iArr[i8];
                int i11 = iArr[i9];
                return Color.argb((int) (f9 * 255.0f), com.airbnb.lottie.utils.i.lerp(Color.red(i11), Color.red(i10), f12), com.airbnb.lottie.utils.i.lerp(Color.green(i11), Color.green(i10), f12), com.airbnb.lottie.utils.i.lerp(Color.blue(i11), Color.blue(i10), f12));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    private int getColorInBetweenOpacityStops(float f8, int i8, float[] fArr, float[] fArr2) {
        float lerp;
        if (fArr2.length < 2 || f8 <= fArr[0]) {
            return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i8), Color.green(i8), Color.blue(i8));
        }
        for (int i9 = 1; i9 < fArr.length; i9++) {
            float f9 = fArr[i9];
            if (f9 >= f8 || i9 == fArr.length - 1) {
                if (f9 <= f8) {
                    lerp = fArr2[i9];
                } else {
                    int i10 = i9 - 1;
                    float f10 = fArr[i10];
                    lerp = com.airbnb.lottie.utils.i.lerp(fArr2[i10], fArr2[i9], (f8 - f10) / (f9 - f10));
                }
                return Color.argb((int) (lerp * 255.0f), Color.red(i8), Color.green(i8), Color.blue(i8));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    protected static float[] mergeUniqueElements(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            float f8 = i9 < fArr.length ? fArr[i9] : Float.NaN;
            float f9 = i10 < fArr2.length ? fArr2[i10] : Float.NaN;
            if (Float.isNaN(f9) || f8 < f9) {
                fArr3[i11] = f8;
                i9++;
            } else if (Float.isNaN(f8) || f9 < f8) {
                fArr3[i11] = f9;
                i10++;
            } else {
                fArr3[i11] = f8;
                i9++;
                i10++;
                i8++;
            }
        }
        return i8 == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i8);
    }

    @Override // com.airbnb.lottie.parser.n0
    public com.airbnb.lottie.model.content.d parse(JsonReader jsonReader, float f8) {
        ArrayList arrayList = new ArrayList();
        boolean z7 = jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY;
        if (z7) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (arrayList.size() == 4 && arrayList.get(0).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.colorPoints = 2;
        }
        if (z7) {
            jsonReader.endArray();
        }
        if (this.colorPoints == -1) {
            this.colorPoints = arrayList.size() / 4;
        }
        int i8 = this.colorPoints;
        float[] fArr = new float[i8];
        int[] iArr = new int[i8];
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.colorPoints * 4; i11++) {
            int i12 = i11 / 4;
            double floatValue = arrayList.get(i11).floatValue();
            int i13 = i11 % 4;
            if (i13 == 0) {
                if (i12 > 0) {
                    float f9 = (float) floatValue;
                    if (fArr[i12 - 1] >= f9) {
                        fArr[i12] = f9 + 0.01f;
                    }
                }
                fArr[i12] = (float) floatValue;
            } else if (i13 == 1) {
                i9 = (int) (floatValue * 255.0d);
            } else if (i13 == 2) {
                i10 = (int) (floatValue * 255.0d);
            } else if (i13 == 3) {
                iArr[i12] = Color.argb(255, i9, i10, (int) (floatValue * 255.0d));
            }
        }
        return addOpacityStopsToGradientIfNeeded(new com.airbnb.lottie.model.content.d(fArr, iArr), arrayList);
    }
}
