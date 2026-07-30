package com.baidu.location.e;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class d {
    public static int a(ArrayList<ArrayList<Float>> arrayList) {
        int i8 = 0;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ArrayList<Float> arrayList2 = arrayList.get(i9);
            if (arrayList2 != null && arrayList2.size() > 2 && arrayList2.get(2).floatValue() > 0.0f) {
                i8++;
            }
        }
        return i8;
    }

    public static int b(ArrayList<ArrayList<Float>> arrayList) {
        int i8 = 0;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ArrayList<Float> arrayList2 = arrayList.get(i9);
            if (arrayList2 != null && arrayList2.size() > 2 && arrayList2.get(2).floatValue() >= 15.0f) {
                i8++;
            }
        }
        return i8;
    }

    public static int c(ArrayList<ArrayList<Float>> arrayList) {
        int i8 = 0;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ArrayList<Float> arrayList2 = arrayList.get(i9);
            if (arrayList2 != null && arrayList2.size() > 2 && arrayList2.get(2).floatValue() >= 20.0f) {
                i8++;
            }
        }
        return i8;
    }

    public static int d(ArrayList<ArrayList<Float>> arrayList) {
        float f8 = 0.0f;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            ArrayList<Float> arrayList2 = arrayList.get(i8);
            if (arrayList2 != null && arrayList2.size() > 2 && arrayList2.get(2).floatValue() > 0.0f) {
                f8 += arrayList2.get(2).floatValue();
            }
        }
        return Math.round(f8);
    }

    public static int e(ArrayList<ArrayList<Float>> arrayList) {
        return Math.round(d(arrayList) / a(arrayList));
    }

    public static int f(ArrayList<ArrayList<Float>> arrayList) {
        float f8 = 0.0f;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            ArrayList<Float> arrayList2 = arrayList.get(i8);
            if (arrayList2 != null && arrayList2.size() > 2 && arrayList2.get(2).floatValue() > 0.0f) {
                f8 += arrayList2.get(2).floatValue() * arrayList2.get(1).floatValue();
            }
        }
        return Math.round(f8);
    }

    public static int g(ArrayList<ArrayList<Float>> arrayList) {
        return Math.round(f(arrayList) / a(arrayList));
    }

    public static int h(ArrayList<ArrayList<Float>> arrayList) {
        int i8;
        int[] iArr = new int[37];
        int i9 = 0;
        int i10 = 0;
        while (true) {
            try {
                if (i10 >= arrayList.size()) {
                    break;
                }
                ArrayList<Float> arrayList2 = arrayList.get(i10);
                if (arrayList2 != null && arrayList2.size() > 0 && arrayList2.get(0).floatValue() < 360.0d) {
                    int ceil = (int) Math.ceil(arrayList2.get(0).floatValue() / 10.0f);
                    iArr[ceil] = iArr[ceil] + 1;
                }
                i10++;
            } catch (Exception unused) {
                return 0;
            }
        }
        for (i8 = 1; i8 <= 36; i8++) {
            if (iArr[i8] > 0) {
                i9++;
            }
        }
        return Math.round((i9 / 36.0f) * 1000.0f);
    }
}
