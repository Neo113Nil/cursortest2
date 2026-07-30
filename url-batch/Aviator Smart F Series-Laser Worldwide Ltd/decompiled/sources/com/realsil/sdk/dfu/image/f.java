package com.realsil.sdk.dfu.image;

import com.baidu.ar.base.MsgField;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.material.internal.ViewUtils;
import com.realsil.sdk.dfu.image.BinIndicator;
import java.util.ArrayList;
import okio.z0;

/* loaded from: classes4.dex */
public abstract class f extends com.realsil.sdk.dfu.d.d {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f15850a;

    /* renamed from: b, reason: collision with root package name */
    public static final BinIndicator f15851b;

    /* renamed from: c, reason: collision with root package name */
    public static final BinIndicator f15852c;

    /* renamed from: d, reason: collision with root package name */
    public static final BinIndicator f15853d;

    /* renamed from: e, reason: collision with root package name */
    public static final BinIndicator f15854e;

    /* renamed from: f, reason: collision with root package name */
    public static final BinIndicator f15855f;

    /* renamed from: g, reason: collision with root package name */
    public static final BinIndicator f15856g;

    /* renamed from: h, reason: collision with root package name */
    public static final BinIndicator f15857h;

    /* renamed from: i, reason: collision with root package name */
    public static final BinIndicator f15858i;

    static {
        BinIndicator build = new BinIndicator.Builder(127, "User Data 1", "", WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, 61441, false).otaSupported(true).commonImage(true).bankSupported(false).version(false, 3).build();
        f15851b = build;
        BinIndicator build2 = new BinIndicator.Builder(126, "User Data 2", "", z0.REPLACEMENT_CODE_POINT, 61442, false).otaSupported(true).commonImage(true).bankSupported(false).version(false, 3).build();
        f15852c = build2;
        BinIndicator build3 = new BinIndicator.Builder(125, "User Data 3", "", 65532, 61443, false).otaSupported(true).commonImage(true).bankSupported(false).version(false, 3).build();
        f15853d = build3;
        BinIndicator build4 = new BinIndicator.Builder(124, "User Data 4", "", 65531, 61444, false).otaSupported(true).commonImage(true).bankSupported(false).version(false, 3).build();
        f15854e = build4;
        BinIndicator build5 = new BinIndicator.Builder(123, "User Data 5", "", 65530, 61445, false).otaSupported(true).commonImage(true).bankSupported(false).version(false, 3).build();
        f15855f = build5;
        BinIndicator build6 = new BinIndicator.Builder(122, "User Data 6", "", 65529, 61446, false).otaSupported(true).commonImage(true).bankSupported(false).version(false, 3).build();
        f15856g = build6;
        BinIndicator build7 = new BinIndicator.Builder(121, "User Data 7", "", 65528, 61447, false).otaSupported(true).commonImage(true).bankSupported(false).version(false, 3).build();
        f15857h = build7;
        BinIndicator build8 = new BinIndicator.Builder(120, "User Data 8", "", 65527, 61448, false).otaSupported(true).commonImage(true).bankSupported(false).version(false, 3).build();
        f15858i = build8;
        ArrayList arrayList = new ArrayList();
        f15850a = arrayList;
        arrayList.add(new BinIndicator.Builder(1, "OEM Config File", "", 14238, 256, false).otaSupported(false).version(false, 3).build());
        arrayList.add(new BinIndicator.Builder(0, "SOCV Config", "", 14237, 257, false).otaSupported(false).version(false, 3).build());
        arrayList.add(new BinIndicator.Builder(2, "Boot Patch", "", 14239, 2817, false).otaSupported(true).version(true, 3).build());
        arrayList.add(new BinIndicator.Builder(16, "MP RF TEST", "", 10130, 513, false).otaSupported(false).version(false, 3).build());
        arrayList.add(new BinIndicator.Builder(32, "OTA Header", "", 14240, 2048, false).version(true, 1).build());
        arrayList.add(new BinIndicator(33, "Secure Patch", "", 14241, 1792, true, 3, false));
        arrayList.add(new BinIndicator(34, "Secure App", "", 14242, 769, true, 3, false));
        arrayList.add(new BinIndicator(35, "Secure App Data", "", 14243, 1041, true, 3, false));
        arrayList.add(new BinIndicator.Builder(39, "BT Low Stack Patch Image", "", 14246, 515, false).version(true, 3).build());
        arrayList.add(new BinIndicator.Builder(40, "Non-secure Patch", "", 14247, 512, false).version(true, 3).build());
        arrayList.add(new BinIndicator(41, "Upper stack", "", 14248, 2560, true, 3, false));
        arrayList.add(new BinIndicator(42, "App", "", 14249, ViewUtils.EDGE_TO_EDGE_FLAGS, true, 3, false));
        arrayList.add(new BinIndicator(43, "App Config File", "", 14250, 1024, true, 517, false));
        arrayList.add(new BinIndicator(47, "App Data 1", "", 14254, MsgField.MSG_ON_DOWNLOAD_RES_ERROR, true, 3, false));
        arrayList.add(new BinIndicator(48, "App Data 2", "", 14255, 2306, true, 3, false));
        arrayList.add(new BinIndicator(49, "App Data 3", "", 14256, 2307, true, 3, false));
        arrayList.add(new BinIndicator(50, "App Data 4", "", 14257, 2308, true, 3, false));
        arrayList.add(new BinIndicator(51, "App Data 5", "", 14258, 2309, true, 3, false));
        arrayList.add(new BinIndicator(52, "App Data 6", "", 14259, 2310, true, 3, false));
        arrayList.add(build);
        arrayList.add(build2);
        arrayList.add(build3);
        arrayList.add(build4);
        arrayList.add(build5);
        arrayList.add(build6);
        arrayList.add(build7);
        arrayList.add(build8);
    }

    public static BinIndicator a(int i8) {
        ArrayList arrayList = f15850a;
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
        ArrayList arrayList = f15850a;
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
        ArrayList arrayList = f15850a;
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

    public static boolean d(int i8) {
        return i8 == 127 || i8 == 126 || i8 == 125 || i8 == 124 || i8 == 123 || i8 == 122 || i8 == 121 || i8 == 120;
    }
}
