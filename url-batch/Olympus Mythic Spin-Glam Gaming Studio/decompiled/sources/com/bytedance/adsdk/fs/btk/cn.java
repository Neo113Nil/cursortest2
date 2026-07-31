package com.bytedance.adsdk.fs.btk;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class cn implements vlj<com.bytedance.adsdk.fs.zn.fs.fb> {
    private int zmn;

    public cn(int i) {
        this.zmn = i;
    }

    @Override // com.bytedance.adsdk.fs.btk.vlj
    /* renamed from: zmn, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.fs.zn.fs.fb fs(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
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
            this.zmn = 2;
        }
        if (z) {
            jsonReader.endArray();
        }
        if (this.zmn == -1) {
            this.zmn = arrayList.size() / 4;
        }
        int i = this.zmn;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zmn * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = arrayList.get(i4).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                if (i5 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i5 - 1] >= f2) {
                        fArr[i5] = f2 + 0.01f;
                    }
                }
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        return zmn(new com.bytedance.adsdk.fs.zn.fs.fb(fArr, iArr), arrayList);
    }

    private com.bytedance.adsdk.fs.zn.fs.fb zmn(com.bytedance.adsdk.fs.zn.fs.fb fbVar, List<Float> list) {
        int i = this.zmn * 4;
        if (list.size() <= i) {
            return fbVar;
        }
        float[] zmn = fbVar.zmn();
        int[] fs = fbVar.fs();
        int size = (list.size() - i) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                fArr[i2] = list.get(i).floatValue();
            } else {
                fArr2[i2] = list.get(i).floatValue();
                i2++;
            }
            i++;
        }
        float[] zmn2 = zmn(fbVar.zmn(), fArr);
        int length = zmn2.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            float f = zmn2[i3];
            int binarySearch = Arrays.binarySearch(zmn, f);
            int binarySearch2 = Arrays.binarySearch(fArr, f);
            if (binarySearch < 0 || binarySearch2 > 0) {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                iArr[i3] = zmn(f, fArr2[binarySearch2], zmn, fs);
            } else {
                iArr[i3] = zmn(f, fs[binarySearch], fArr, fArr2);
            }
        }
        return new com.bytedance.adsdk.fs.zn.fs.fb(zmn2, iArr);
    }

    int zmn(float f, float f2, float[] fArr, int[] iArr) {
        if (iArr.length < 2 || f == fArr[0]) {
            return iArr[0];
        }
        for (int i = 1; i < fArr.length; i++) {
            float f3 = fArr[i];
            if (f3 >= f || i == fArr.length - 1) {
                int i2 = i - 1;
                float f4 = fArr[i2];
                float f5 = (f - f4) / (f3 - f4);
                int i3 = iArr[i];
                int i4 = iArr[i2];
                return Color.argb((int) (f2 * 255.0f), com.bytedance.adsdk.fs.hhw.fs.zmn(f5, Color.red(i4), Color.red(i3)), com.bytedance.adsdk.fs.hhw.fs.zmn(f5, Color.green(i4), Color.green(i3)), com.bytedance.adsdk.fs.hhw.fs.zmn(f5, Color.blue(i4), Color.blue(i3)));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    private int zmn(float f, int i, float[] fArr, float[] fArr2) {
        float zmn;
        if (fArr2.length < 2 || f <= fArr[0]) {
            return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
        }
        for (int i2 = 1; i2 < fArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 >= f || i2 == fArr.length - 1) {
                if (f2 <= f) {
                    zmn = fArr2[i2];
                } else {
                    int i3 = i2 - 1;
                    float f3 = fArr[i3];
                    zmn = com.bytedance.adsdk.fs.hhw.btk.zmn(fArr2[i3], fArr2[i2], (f - f3) / (f2 - f3));
                }
                return Color.argb((int) (zmn * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    protected static float[] zmn(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            float f = i2 < fArr.length ? fArr[i2] : Float.NaN;
            float f2 = i3 < fArr2.length ? fArr2[i3] : Float.NaN;
            if (Float.isNaN(f2) || f < f2) {
                fArr3[i4] = f;
                i2++;
            } else if (Float.isNaN(f) || f2 < f) {
                fArr3[i4] = f2;
                i3++;
            } else {
                fArr3[i4] = f;
                i2++;
                i3++;
                i++;
            }
        }
        return i == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i);
    }
}
