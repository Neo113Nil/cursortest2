package com.realsil.sdk.dfu.image;

import com.baidu.ar.base.MsgField;
import com.google.android.material.internal.ViewUtils;
import com.realsil.sdk.dfu.image.BinIndicator;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class a extends com.realsil.sdk.dfu.d.a {

    /* renamed from: q, reason: collision with root package name */
    public static final ArrayList f15845q;

    static {
        ArrayList arrayList = new ArrayList();
        f15845q = arrayList;
        arrayList.add(com.realsil.sdk.dfu.d.a.f15719a);
        arrayList.add(new BinIndicator(0, "SOCV Config File", "", 257, false, 1));
        arrayList.add(new BinIndicator(2, "OTA Header", "", 10128, 2048, true, 1, false));
        arrayList.add(new BinIndicator(3, "Secure Boot Loader", "", 10129, 1792, true, 3, false));
        arrayList.add(new BinIndicator(4, "ROM Patch", "", 10130, 512, true, 3, false));
        arrayList.add(new BinIndicator(5, "App", "", 10131, ViewUtils.EDGE_TO_EDGE_FLAGS, true, 5, false));
        arrayList.add(new BinIndicator(6, "DSP System", "", 10132, 1280, true, 515, false));
        arrayList.add(new BinIndicator(7, "DSP App", "", 10133, 1538, true, 515, false));
        arrayList.add(new BinIndicator(8, "DSP Config", "", 10135, 1040, true, 514, true));
        arrayList.add(new BinIndicator(9, "App Config", "", 10134, 1024, true, 2, true));
        arrayList.add(new BinIndicator(10, "Ext Image 0", "", 10136, MsgField.MSG_ON_DOWNLOAD_RES_SUCCESS, false, 1, true));
        arrayList.add(new BinIndicator(11, "Ext Image 1", "", 10137, MsgField.MSG_ON_DOWNLOAD_RES_ERROR, false, 1, false));
        arrayList.add(new BinIndicator(12, "Ext Image 2", "", 10138, 2306, false, 1, false));
        arrayList.add(new BinIndicator(13, "Ext Image 3", "", 10139, 2307, false, 1, false));
        arrayList.add(new BinIndicator(17, "Sys Patch", "", 10140, 513, false, 3, false));
        arrayList.add(new BinIndicator(18, "Stack Patch", "", 10141, 514, false, 3, false));
        arrayList.add(new BinIndicator(20, "Framework", "", 10143, 516, false, 1, false));
        arrayList.add(new BinIndicator.Builder(14, "Factory Image", "", 10127, 2560, false).otaSupported(false).version(false, 1).build());
        arrayList.add(com.realsil.sdk.dfu.d.a.f15725g);
        arrayList.add(com.realsil.sdk.dfu.d.a.f15726h);
        arrayList.add(com.realsil.sdk.dfu.d.a.f15721c);
        arrayList.add(com.realsil.sdk.dfu.d.a.f15722d);
        arrayList.add(com.realsil.sdk.dfu.d.a.f15723e);
        arrayList.add(com.realsil.sdk.dfu.d.a.f15724f);
        arrayList.add(com.realsil.sdk.dfu.d.a.f15727i);
        arrayList.add(com.realsil.sdk.dfu.d.a.f15728j);
        arrayList.add(com.realsil.sdk.dfu.d.a.f15729k);
        arrayList.add(com.realsil.sdk.dfu.d.a.f15730l);
        arrayList.add(com.realsil.sdk.dfu.d.a.f15731m);
        arrayList.add(com.realsil.sdk.dfu.d.a.f15732n);
        arrayList.add(com.realsil.sdk.dfu.d.a.f15733o);
        arrayList.add(com.realsil.sdk.dfu.d.a.f15734p);
    }

    public static BinIndicator d(int i8) {
        ArrayList arrayList = f15845q;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            BinIndicator binIndicator = (BinIndicator) obj;
            if (binIndicator.subBinId == i8) {
                return binIndicator;
            }
        }
        return null;
    }

    public static BinIndicator e(int i8) {
        ArrayList arrayList = f15845q;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            BinIndicator binIndicator = (BinIndicator) obj;
            if (binIndicator.imageId == i8) {
                return binIndicator;
            }
        }
        return null;
    }

    public static boolean f(int i8) {
        return i8 == 24 || i8 == 25 || i8 == 26 || i8 == 27 || i8 == 28 || i8 == 29 || i8 == 30 || i8 == 31 || i8 == 32;
    }
}
