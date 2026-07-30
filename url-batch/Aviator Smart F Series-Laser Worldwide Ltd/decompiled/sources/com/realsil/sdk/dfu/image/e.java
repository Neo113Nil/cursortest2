package com.realsil.sdk.dfu.image;

import com.baidu.ar.base.MsgField;
import com.google.android.material.internal.ViewUtils;
import com.realsil.sdk.dfu.image.BinIndicator;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class e extends com.realsil.sdk.dfu.d.d {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f15849a;

    static {
        ArrayList arrayList = new ArrayList();
        f15849a = arrayList;
        arrayList.add(new BinIndicator.Builder(1, "OEM Config File", "", 14238, 256, false).otaSupported(false).version(true, 3).build());
        arrayList.add(new BinIndicator.Builder(0, "SOCV Config", "", 14237, 257, false).otaSupported(false).version(true, 3).build());
        arrayList.add(new BinIndicator.Builder(2, "Boot Patch", "", 14239, 2817, false).otaSupported(false).version(true, 3).build());
        arrayList.add(new BinIndicator.Builder(16, "MP RF TEST", "", -1, 513, false).otaSupported(false).version(true, 3).build());
        arrayList.add(new BinIndicator.Builder(32, "OTA Header", "", 14240, 2048, false).version(true, 1).build());
        arrayList.add(new BinIndicator(33, "Secure Patch", "", 14241, 1792, true, 3, false));
        arrayList.add(new BinIndicator(34, "Secure App", "", 14242, 769, true, 3, false));
        arrayList.add(new BinIndicator(35, "Secure App Data", "", 14243, 1041, true, 3, false));
        arrayList.add(new BinIndicator.Builder(36, "PMC Patch Image", "", 14244, 514, false).version(true, 1).build());
        arrayList.add(new BinIndicator.Builder(37, "BT System Patch Image", "", 14245, 516, false).version(true, 1).build());
        arrayList.add(new BinIndicator.Builder(39, "BT Low Stack Patch Image", "", 14246, 515, false).version(true, 1).build());
        arrayList.add(new BinIndicator.Builder(40, "Non-secure Patch", "", 14247, 512, false).version(true, 3).build());
        arrayList.add(new BinIndicator(41, "Upper stack", "", 14248, 2560, true, 3, false));
        arrayList.add(new BinIndicator(42, "App", "", 14249, ViewUtils.EDGE_TO_EDGE_FLAGS, true, 3, false));
        arrayList.add(new BinIndicator.Builder(43, "App Config Data", "", 14250, 1024, false).version(true, 1).build());
        arrayList.add(new BinIndicator.Builder(44, "DSP Patch", "", 14251, 1280, false).version(true, 1).build());
        arrayList.add(new BinIndicator.Builder(45, "DSP App", "", 14252, 1538, false).version(true, 1).build());
        arrayList.add(new BinIndicator.Builder(46, "DSP Data", "", 14253, 1040, false).version(true, 1).build());
        arrayList.add(new BinIndicator(47, "App Data 1", "", 14254, MsgField.MSG_ON_DOWNLOAD_RES_ERROR, true, 3, false));
        arrayList.add(new BinIndicator(48, "App Data 2", "", 14255, 2306, true, 3, false));
        arrayList.add(new BinIndicator(49, "App Data 3", "", 14256, 2307, true, 3, false));
        arrayList.add(new BinIndicator(50, "App Data 4", "", 14257, 2308, true, 3, false));
        arrayList.add(new BinIndicator(51, "App Data 5", "", 14258, 2309, true, 3, false));
        arrayList.add(new BinIndicator(52, "App Data 6", "", 14259, 2310, true, 3, false));
    }

    public static BinIndicator a(int i8) {
        ArrayList arrayList = f15849a;
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

    public static BinIndicator b(int i8) {
        ArrayList arrayList = f15849a;
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

    public static BinIndicator c(int i8) {
        ArrayList arrayList = f15849a;
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
}
