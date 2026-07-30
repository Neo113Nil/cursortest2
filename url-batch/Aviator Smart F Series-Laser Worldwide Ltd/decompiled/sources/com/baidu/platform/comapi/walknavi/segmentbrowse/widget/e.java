package com.baidu.platform.comapi.walknavi.segmentbrowse.widget;

import android.os.Bundle;
import com.baidu.ar.util.SystemInfoUtil;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static int f10305a;

    public static void a(int i8) {
        f10305a = i8;
    }

    public static ArrayList<c> a(Bundle bundle, String str) {
        com.baidu.platform.comapi.h.g.a.a("yang11", "GuideUtility.getGuideText from--->" + str);
        ArrayList<c> a8 = a(bundle, false);
        a8.addAll(a(bundle));
        ArrayList<c> arrayList = new ArrayList<>();
        if (a8.size() > 0) {
            arrayList.add(a8.get(0));
            if (a8.size() >= 2) {
                c cVar = a8.get(1);
                for (int i8 = 2; i8 < a8.size(); i8++) {
                    cVar = c.a(cVar, a8.get(i8));
                }
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList<c> a(Bundle bundle, boolean z7) {
        int i8;
        int i9;
        com.baidu.platform.comapi.h.g.a.a("yang11", "GuideUtility.getGuideLineText--->" + bundle.toString());
        ArrayList<c> arrayList = new ArrayList<>();
        String string = bundle.getString("usGuideText");
        int[] intArray = bundle.getIntArray("unIdx");
        int[] intArray2 = bundle.getIntArray("unWordCnt");
        int[] intArray3 = bundle.getIntArray("unLineNo");
        bundle.getBooleanArray("bHighLight");
        int[] intArray4 = bundle.getIntArray("enWordType");
        if (string.contains("@")) {
            string = string.replace("@", "...");
        }
        if (intArray.length == 0) {
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i8 = 1;
            if (i10 >= intArray3.length) {
                break;
            }
            int i13 = intArray2[i10];
            i12 += i13;
            if (i11 != intArray3[i10]) {
                hashMap.put(Integer.valueOf(i11), Integer.valueOf(i12 - i13));
                i11++;
                i12 = intArray2[i10];
            }
            if (i10 == intArray3.length - 1) {
                hashMap.put(Integer.valueOf(i11), Integer.valueOf(i12));
            }
            i10++;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = hashMap.size();
        int i14 = 0;
        while (i14 < size) {
            int intValue = ((Integer) hashMap.get(Integer.valueOf(i14))).intValue();
            char[] cArr = new char[intValue];
            int[] iArr = new int[intValue];
            int i15 = 0;
            while (i15 < intValue) {
                if (i14 <= 0) {
                    i9 = i15;
                } else if (i14 > i8) {
                    i9 = ((Integer) hashMap.get(Integer.valueOf(i14 - 1))).intValue() + i15 + ((Integer) hashMap.get(Integer.valueOf(i14 - 2))).intValue();
                } else {
                    i9 = ((Integer) hashMap.get(Integer.valueOf(i14 - 1))).intValue() + i15;
                }
                if (i9 < string.length()) {
                    cArr[i15] = string.charAt(i9);
                }
                int i16 = 0;
                while (true) {
                    if (i16 >= intArray.length) {
                        break;
                    }
                    if (i16 != intArray.length - i8) {
                        int i17 = i16 + 1;
                        if (i9 >= intArray[i17]) {
                            i16 = i17;
                            i8 = 1;
                        } else if (intArray4 != null) {
                            iArr[i15] = intArray4[i16];
                        }
                    } else if (intArray4 != null) {
                        iArr[i15] = intArray4[i16];
                    }
                }
                i15++;
                i8 = 1;
            }
            arrayList2.add(new c(cArr, iArr));
            i14++;
            i8 = 1;
        }
        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
            arrayList.add(arrayList2.get(i18));
        }
        if (arrayList.size() >= 1 && ((c) arrayList.get(0)).f10297c != null && ((c) arrayList.get(0)).f10297c.length == 0) {
            arrayList.remove(0);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList<c> a(Bundle bundle) {
        int i8;
        int i9;
        String str;
        int intValue;
        int i10;
        com.baidu.platform.comapi.h.g.a.c("GuideUtility.getGuideLineText", "" + bundle.toString());
        ArrayList<c> arrayList = new ArrayList<>();
        try {
            bundle.getInt("updatetype");
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        if (bundle.getInt("POIIsPassingPOI") == 0) {
            return arrayList;
        }
        String string = bundle.getString("usPOIGuideText");
        int[] intArray = bundle.getIntArray("unPOIIdx");
        int[] intArray2 = bundle.getIntArray("unPOIWordCnt");
        int[] intArray3 = bundle.getIntArray("unPOILineNo");
        boolean[] booleanArray = bundle.getBooleanArray("bPOIHighLight");
        a(intArray, intArray2, intArray3, booleanArray);
        if (string.contains("@")) {
            string = string.replace("@", "...");
        }
        if (intArray.length == 0) {
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i8 = 1;
            if (i11 >= intArray3.length) {
                break;
            }
            int i14 = intArray2[i11];
            i13 += i14;
            if (i12 != intArray3[i11]) {
                hashMap.put(Integer.valueOf(i12), Integer.valueOf(i13 - i14));
                i12++;
                i13 = intArray2[i11];
            }
            if (i11 == intArray3.length - 1) {
                hashMap.put(Integer.valueOf(i12), Integer.valueOf(i13));
            }
            i11++;
        }
        com.baidu.platform.comapi.h.g.a.a("yang11", "poi segNumMap size:" + hashMap.size());
        for (int i15 = 0; i15 < hashMap.size(); i15++) {
            com.baidu.platform.comapi.h.g.a.a("yang11", i15 + "==" + hashMap.get(Integer.valueOf(i15)));
        }
        ArrayList arrayList2 = new ArrayList();
        int size = hashMap.size();
        int i16 = 0;
        while (i16 < size) {
            int intValue2 = ((Integer) hashMap.get(Integer.valueOf(i16))).intValue();
            char[] cArr = new char[intValue2];
            int[] iArr = new int[intValue2];
            int[] iArr2 = new int[intValue2];
            int i17 = 0;
            while (i17 < intValue2) {
                if (i16 > 0) {
                    if (i16 > i8) {
                        i10 = ((Integer) hashMap.get(Integer.valueOf(i16 - 1))).intValue() + i17;
                        intValue = ((Integer) hashMap.get(Integer.valueOf(i16 - 2))).intValue();
                    } else {
                        intValue = ((Integer) hashMap.get(Integer.valueOf(i16 - 1))).intValue();
                        i10 = i17;
                    }
                    i9 = i10 + intValue;
                } else {
                    i9 = i17;
                }
                if (i9 < string.length()) {
                    cArr[i17] = string.charAt(i9);
                }
                iArr2[i17] = 1;
                HashMap hashMap2 = hashMap;
                int i18 = 0;
                while (true) {
                    if (i18 >= intArray.length) {
                        break;
                    }
                    if (i18 == intArray.length - 1) {
                        if (booleanArray[i18]) {
                            iArr[i17] = 1;
                        } else {
                            iArr[i17] = 0;
                        }
                    } else {
                        int i19 = i18 + 1;
                        str = string;
                        if (i9 >= intArray[i19]) {
                            i18 = i19;
                            string = str;
                        } else if (booleanArray[i18]) {
                            iArr[i17] = 1;
                        } else {
                            iArr[i17] = 0;
                        }
                    }
                }
                str = string;
                i17++;
                hashMap = hashMap2;
                string = str;
                i8 = 1;
            }
            arrayList2.add(new c(cArr, iArr, iArr2));
            i16++;
            hashMap = hashMap;
            string = string;
            i8 = 1;
        }
        a((ArrayList<c>) arrayList2);
        for (int i20 = 0; i20 < arrayList2.size(); i20++) {
            arrayList.add(arrayList2.get(i20));
        }
        for (int i21 = 0; i21 < arrayList.size(); i21++) {
            com.baidu.platform.comapi.h.g.a.a("yang11", "poi line:" + i21 + String.valueOf(((c) arrayList.get(i21)).f10297c));
        }
        return arrayList;
    }

    private static void a(ArrayList<c> arrayList) {
        if (arrayList.size() >= 1) {
            c a8 = c.a(arrayList.get(0), arrayList.get(1));
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.add(0, a8);
            if (arrayList.get(0).f10297c.length > f10305a) {
                com.baidu.platform.comapi.h.g.a.a("yang11", "poi enter new branch2!!!");
                c cVar = arrayList.get(0);
                c cVar2 = arrayList.size() >= 2 ? arrayList.get(1) : null;
                c a9 = c.a(arrayList.get(0), f10305a);
                c b8 = c.b(arrayList.get(0), f10305a);
                com.baidu.platform.comapi.h.g.a.a("yang11", "headSecondText:" + String.valueOf(a9.f10297c));
                com.baidu.platform.comapi.h.g.a.a("yang11", "tailSecondText:" + String.valueOf(b8.f10297c));
                if (arrayList.size() >= 2) {
                    b8 = c.a(b8, arrayList.get(1));
                }
                arrayList.remove(cVar);
                if (cVar2 != null) {
                    arrayList.remove(cVar2);
                }
                arrayList.add(a9);
                arrayList.add(b8);
            }
        }
    }

    private static void a(int[] iArr, int[] iArr2, int[] iArr3, boolean[] zArr) {
        String str = "";
        String str2 = "";
        for (int i8 : iArr) {
            str2 = str2 + i8 + SystemInfoUtil.COMMA;
        }
        String str3 = "";
        for (int i9 : iArr2) {
            str3 = str3 + i9 + SystemInfoUtil.COMMA;
        }
        String str4 = "";
        for (int i10 : iArr3) {
            str4 = str4 + i10 + SystemInfoUtil.COMMA;
        }
        for (boolean z7 : zArr) {
            str = str + z7 + SystemInfoUtil.COMMA;
        }
        com.baidu.platform.comapi.h.g.a.a("yang11", "unIdxString:" + str2);
        com.baidu.platform.comapi.h.g.a.a("yang11", "unWordCntString:" + str3);
        com.baidu.platform.comapi.h.g.a.a("yang11", "unLineNoString:" + str4);
        com.baidu.platform.comapi.h.g.a.a("yang11", "highLightString:" + str);
    }
}
