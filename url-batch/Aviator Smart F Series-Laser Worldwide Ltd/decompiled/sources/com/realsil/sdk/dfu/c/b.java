package com.realsil.sdk.dfu.c;

import com.baidu.ar.base.MsgField;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.material.internal.ViewUtils;
import com.realsil.sdk.dfu.image.BinIndicator;
import java.util.ArrayList;
import okio.z0;

/* loaded from: classes4.dex */
public abstract class b extends com.realsil.sdk.dfu.d.c {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f15708a;

    static {
        ArrayList arrayList = new ArrayList();
        f15708a = arrayList;
        arrayList.add(new BinIndicator(0, "SOCV Config File", "", 257, true, 3));
        arrayList.add(new BinIndicator(1, "System Config", "", 256, true, 3));
        arrayList.add(new BinIndicator(2, "OTA Header", "", 2048, true, 516));
        arrayList.add(new BinIndicator(3, "Secure Boot Loader", "", 1792, true, 3));
        arrayList.add(new BinIndicator(4, "ROM Patch", "", 512, true, 3));
        arrayList.add(new BinIndicator(5, "App", "", ViewUtils.EDGE_TO_EDGE_FLAGS, true, 3));
        arrayList.add(new BinIndicator(6, "APP Data1 File", "", MsgField.MSG_ON_DOWNLOAD_RES_ERROR, false, 3));
        arrayList.add(new BinIndicator(7, "APP Data2 File", "", 2306, false, 3));
        arrayList.add(new BinIndicator(8, "APP Data3 File", "", 2307, false, 3));
        arrayList.add(new BinIndicator(9, "APP Data4 File", "", 2308, false, 3));
        arrayList.add(new BinIndicator(10, "APP Data5 File", "", 2309, false, 3));
        arrayList.add(new BinIndicator(11, "APP Data6 File", "", 2310, false, 3));
        arrayList.add(new BinIndicator(12, "Upper Stack", "", 2560, true, 3));
        arrayList.add(new BinIndicator(13, "Stack Patch", "", 515, true, 3));
        arrayList.add(new BinIndicator(14, "User Data 1", "", WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, 61441, true, 3, false));
        arrayList.add(new BinIndicator(15, "User Data 2", "", z0.REPLACEMENT_CODE_POINT, 61442, true, 3, false));
    }

    public static BinIndicator a(int i8) {
        ArrayList arrayList = f15708a;
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
        ArrayList arrayList = f15708a;
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
        ArrayList arrayList = f15708a;
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
