package com.realsil.sdk.dfu.d;

import com.google.android.exoplayer2.audio.WavUtil;
import com.realsil.sdk.dfu.image.BinIndicator;
import okio.z0;

/* loaded from: classes4.dex */
public abstract class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public static final BinIndicator f15719a = new BinIndicator.Builder(1, "System Config", "", -1, 256, false).otaSupported(true).commonImage(true).bankSupported(false).version(true, 1).build();

    /* renamed from: b, reason: collision with root package name */
    public static final BinIndicator f15720b = new BinIndicator.Builder(14, "Boot Patch", "", 10127, 2561, false).otaSupported(true).commonImage(false).bankSupported(true).version(true, 3).build();

    /* renamed from: c, reason: collision with root package name */
    public static final BinIndicator f15721c = new BinIndicator.Builder(17, "Platform Ext", "", 10145, 517, false).otaSupported(true).commonImage(true).bankSupported(false).version(false, 3).build();

    /* renamed from: d, reason: collision with root package name */
    public static final BinIndicator f15722d = new BinIndicator.Builder(18, "Low Stack Ext", "", 10146, 518, false).otaSupported(true).commonImage(true).bankSupported(false).version(false, 1).build();

    /* renamed from: e, reason: collision with root package name */
    public static final BinIndicator f15723e = new BinIndicator.Builder(19, "Upper stack", "", 10147, 519, false).otaSupported(true).commonImage(true).bankSupported(false).version(false, 3).build();

    /* renamed from: f, reason: collision with root package name */
    public static final BinIndicator f15724f = new BinIndicator.Builder(24, "Voice Prompt Data", "", 10148, 520, false).otaSupported(true).commonImage(true).bankSupported(false).version(false, 2).build();

    /* renamed from: g, reason: collision with root package name */
    public static final BinIndicator f15725g = new BinIndicator.Builder(15, "Backup Data 1", "", -1, 2816, false).otaSupported(false).version(false, 1).build();

    /* renamed from: h, reason: collision with root package name */
    public static final BinIndicator f15726h = new BinIndicator.Builder(16, "Backup Data 2", "", -1, 2817, false).otaSupported(false).version(false, 1).build();

    /* renamed from: i, reason: collision with root package name */
    public static final BinIndicator f15727i = new BinIndicator.Builder(25, "User Data 1", "", WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, 61441, false).otaSupported(true).commonImage(true).bankSupported(false).version(false, 1).build();

    /* renamed from: j, reason: collision with root package name */
    public static final BinIndicator f15728j = new BinIndicator.Builder(26, "User Data 2", "", z0.REPLACEMENT_CODE_POINT, 61442, false).otaSupported(true).commonImage(true).bankSupported(false).version(false, 1).build();

    /* renamed from: k, reason: collision with root package name */
    public static final BinIndicator f15729k = new BinIndicator.Builder(27, "User Data 3", "", 65532, 61443, false).otaSupported(true).commonImage(true).bankSupported(false).version(false, 1).build();

    /* renamed from: l, reason: collision with root package name */
    public static final BinIndicator f15730l = new BinIndicator.Builder(28, "User Data 4", "", 65531, 61444, false).otaSupported(true).commonImage(true).bankSupported(false).version(false, 1).build();

    /* renamed from: m, reason: collision with root package name */
    public static final BinIndicator f15731m = new BinIndicator.Builder(29, "User Data 5", "", 65530, 61445, false).otaSupported(true).commonImage(true).bankSupported(false).version(false, 1).build();

    /* renamed from: n, reason: collision with root package name */
    public static final BinIndicator f15732n = new BinIndicator.Builder(30, "User Data 6", "", 65529, 61446, false).otaSupported(true).commonImage(true).bankSupported(false).version(false, 1).build();

    /* renamed from: o, reason: collision with root package name */
    public static final BinIndicator f15733o = new BinIndicator.Builder(31, "User Data 7", "", 65528, 61447, false).otaSupported(true).commonImage(true).bankSupported(false).version(false, 1).build();

    /* renamed from: p, reason: collision with root package name */
    public static final BinIndicator f15734p = new BinIndicator.Builder(32, "User Data 8", "", 65527, 61448, false).otaSupported(true).commonImage(true).bankSupported(false).version(false, 1).build();

    public static boolean a(int i8) {
        return i8 == 5 || i8 == 4 || i8 == 3 || i8 == 2 || i8 == 7 || i8 == 6;
    }

    public static boolean b(int i8) {
        return i8 == 10148 || i8 == 65534 || i8 == 65533 || i8 == 65532 || i8 == 65531 || i8 == 65530 || i8 == 65529 || i8 == 65528 || i8 == 65527;
    }

    public static boolean c(int i8) {
        return i8 == 10132 || i8 == 10133 || i8 == 10134 || i8 == 10135 || i8 == 10136 || i8 == 10137 || i8 == 10138 || i8 == 10139;
    }
}
