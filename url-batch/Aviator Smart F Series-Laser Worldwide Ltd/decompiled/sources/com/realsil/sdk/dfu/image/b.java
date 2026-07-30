package com.realsil.sdk.dfu.image;

import com.baidu.ar.base.MsgField;
import com.google.android.material.internal.ViewUtils;
import com.realsil.sdk.dfu.image.BinIndicator;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class b extends com.realsil.sdk.dfu.d.a {

    /* renamed from: q, reason: collision with root package name */
    public static final ArrayList f15846q;

    static {
        ArrayList arrayList = new ArrayList();
        f15846q = arrayList;
        arrayList.add(com.realsil.sdk.dfu.d.a.f15719a);
        arrayList.add(new BinIndicator.Builder(0, "SOCV Config File", "", -1, 257, false).otaSupported(true).bankSupported(false).version(false, 1).build());
        arrayList.add(new BinIndicator.Builder(2, "OTA Header", "", 10128, 2048, false).otaSupported(true).bankSupported(false).version(true, 1).build());
        arrayList.add(new BinIndicator.Builder(3, "Secure Boot Loader", "", 10129, 1792, false).otaSupported(true).bankSupported(false).version(true, 3).build());
        arrayList.add(new BinIndicator.Builder(4, "ROM Patch", "", 10130, 512, false).otaSupported(true).bankSupported(false).version(true, 3).build());
        arrayList.add(new BinIndicator.Builder(5, "App", "", 10131, ViewUtils.EDGE_TO_EDGE_FLAGS, false).otaSupported(true).bankSupported(false).version(true, 5).build());
        arrayList.add(new BinIndicator.Builder(6, "DSP System", "", 10132, 1280, false).otaSupported(true).bankSupported(false).version(true, 515).build());
        arrayList.add(new BinIndicator.Builder(7, "DSP App", "", 10133, 1538, false).otaSupported(true).bankSupported(false).version(true, 515).build());
        arrayList.add(new BinIndicator.Builder(8, "DSP Config", "", 10135, 1040, true).otaSupported(true).bankSupported(false).version(true, 516).build());
        arrayList.add(new BinIndicator.Builder(9, "App Config", "", 10134, 1024, true).otaSupported(true).bankSupported(false).version(true, 2).build());
        arrayList.add(new BinIndicator.Builder(10, "Ext Image 0", "", 10136, MsgField.MSG_ON_DOWNLOAD_RES_SUCCESS, false).otaSupported(true).bankSupported(false).version(false, 1).build());
        arrayList.add(new BinIndicator.Builder(11, "Ext Image 1", "", 10137, MsgField.MSG_ON_DOWNLOAD_RES_ERROR, false).otaSupported(true).bankSupported(false).version(false, 1).build());
        arrayList.add(new BinIndicator.Builder(12, "Ext Image 2", "", 10138, 2306, false).otaSupported(true).bankSupported(false).version(false, 1).build());
        arrayList.add(new BinIndicator.Builder(13, "Ext Image 3", "", 10139, 2307, false).otaSupported(true).bankSupported(false).version(false, 1).build());
        arrayList.add(new BinIndicator.Builder(17, "Sys Patch", "", 10140, 513, false).otaSupported(true).bankSupported(false).version(false, 3).build());
        arrayList.add(new BinIndicator.Builder(18, "Stack Patch", "", 10141, 514, false).otaSupported(true).bankSupported(false).version(false, 3).build());
        arrayList.add(new BinIndicator.Builder(19, "Upper Stack", "", 10147, 519, false).otaSupported(true).bankSupported(false).version(false, 1).build());
        arrayList.add(new BinIndicator.Builder(20, "Framework", "", 10143, 516, false).otaSupported(true).bankSupported(false).version(false, 1).build());
        arrayList.add(com.realsil.sdk.dfu.d.a.f15720b);
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
        ArrayList arrayList = f15846q;
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
        ArrayList arrayList = f15846q;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            BinIndicator binIndicator = (BinIndicator) obj;
            if (binIndicator.bitNumber == i8) {
                return binIndicator;
            }
        }
        return null;
    }

    public static BinIndicator f(int i8) {
        ArrayList arrayList = f15846q;
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

    public static boolean g(int i8) {
        return i8 == 24 || i8 == 25 || i8 == 26 || i8 == 27 || i8 == 28 || i8 == 29 || i8 == 30 || i8 == 31 || i8 == 32;
    }
}
