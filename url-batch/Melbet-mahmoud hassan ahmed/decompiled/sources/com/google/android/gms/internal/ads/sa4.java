package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class sa4 extends b44 {

    /* renamed from: l1, reason: collision with root package name */
    private static final int[] f11751l1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: m1, reason: collision with root package name */
    private static boolean f11752m1;

    /* renamed from: n1, reason: collision with root package name */
    private static boolean f11753n1;
    private final Context G0;
    private final bb4 H0;
    private final mb4 I0;
    private final boolean J0;
    private ra4 K0;
    private boolean L0;
    private boolean M0;
    private Surface N0;
    private na4 O0;
    private boolean P0;
    private int Q0;
    private boolean R0;
    private boolean S0;
    private boolean T0;
    private long U0;
    private long V0;
    private long W0;
    private int X0;
    private int Y0;
    private int Z0;

    /* renamed from: a1, reason: collision with root package name */
    private long f11754a1;

    /* renamed from: b1, reason: collision with root package name */
    private long f11755b1;

    /* renamed from: c1, reason: collision with root package name */
    private long f11756c1;

    /* renamed from: d1, reason: collision with root package name */
    private int f11757d1;

    /* renamed from: e1, reason: collision with root package name */
    private int f11758e1;

    /* renamed from: f1, reason: collision with root package name */
    private int f11759f1;

    /* renamed from: g1, reason: collision with root package name */
    private int f11760g1;

    /* renamed from: h1, reason: collision with root package name */
    private float f11761h1;

    /* renamed from: i1, reason: collision with root package name */
    private ry0 f11762i1;

    /* renamed from: j1, reason: collision with root package name */
    private int f11763j1;

    /* renamed from: k1, reason: collision with root package name */
    private ta4 f11764k1;

    public sa4(Context context, w34 w34Var, d44 d44Var, long j7, boolean z6, Handler handler, nb4 nb4Var, int i7) {
        super(2, w34Var, d44Var, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.G0 = applicationContext;
        this.H0 = new bb4(applicationContext);
        this.I0 = new mb4(handler, nb4Var);
        this.J0 = "NVIDIA".equals(n13.f8867c);
        this.V0 = -9223372036854775807L;
        this.f11758e1 = -1;
        this.f11759f1 = -1;
        this.f11761h1 = -1.0f;
        this.Q0 = 1;
        this.f11763j1 = 0;
        this.f11762i1 = null;
    }

    protected static int H0(z34 z34Var, c0 c0Var) {
        if (c0Var.f3661m == -1) {
            return I0(z34Var, c0Var);
        }
        int size = c0Var.f3662n.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += c0Var.f3662n.get(i8).length;
        }
        return c0Var.f3661m + i7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int I0(z34 z34Var, c0 c0Var) {
        char c7;
        int i7;
        int intValue;
        int i8 = c0Var.f3665q;
        int i9 = c0Var.f3666r;
        if (i8 == -1 || i9 == -1) {
            return -1;
        }
        String str = c0Var.f3660l;
        int i10 = 2;
        if ("video/dolby-vision".equals(str)) {
            Pair<Integer, Integer> b7 = q44.b(c0Var);
            str = (b7 == null || !((intValue = ((Integer) b7.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : "video/avc";
        }
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c7 = 5;
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        if (c7 != 0 && c7 != 1) {
            if (c7 == 2) {
                String str2 = n13.f8868d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(n13.f8867c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && z34Var.f14936f)))) {
                    return -1;
                }
                i7 = n13.K(i8, 16) * n13.K(i9, 16) * 256;
            } else if (c7 != 3) {
                if (c7 != 4 && c7 != 5) {
                    return -1;
                }
                i7 = i8 * i9;
                i10 = 4;
            }
            return (i7 * 3) / (i10 + i10);
        }
        i7 = i8 * i9;
        return (i7 * 3) / (i10 + i10);
    }

    private static List<z34> J0(d44 d44Var, c0 c0Var, boolean z6, boolean z7) {
        Pair<Integer, Integer> b7;
        String str;
        String str2 = c0Var.f3660l;
        if (str2 == null) {
            return Collections.emptyList();
        }
        List<z34> f7 = q44.f(q44.e(str2, z6, z7), c0Var);
        if ("video/dolby-vision".equals(str2) && (b7 = q44.b(c0Var)) != null) {
            int intValue = ((Integer) b7.first).intValue();
            if (intValue != 16 && intValue != 256) {
                str = intValue == 512 ? "video/avc" : "video/hevc";
            }
            f7.addAll(q44.e(str, z6, z7));
        }
        return Collections.unmodifiableList(f7);
    }

    private final void K0() {
        int i7 = this.f11758e1;
        if (i7 == -1) {
            if (this.f11759f1 == -1) {
                return;
            } else {
                i7 = -1;
            }
        }
        ry0 ry0Var = this.f11762i1;
        if (ry0Var != null && ry0Var.f11567a == i7 && ry0Var.f11568b == this.f11759f1 && ry0Var.f11569c == this.f11760g1 && ry0Var.f11570d == this.f11761h1) {
            return;
        }
        ry0 ry0Var2 = new ry0(i7, this.f11759f1, this.f11760g1, this.f11761h1);
        this.f11762i1 = ry0Var2;
        this.I0.t(ry0Var2);
    }

    private final void L0() {
        ry0 ry0Var = this.f11762i1;
        if (ry0Var != null) {
            this.I0.t(ry0Var);
        }
    }

    private final void M0() {
        Surface surface = this.N0;
        na4 na4Var = this.O0;
        if (surface == na4Var) {
            this.N0 = null;
        }
        na4Var.release();
        this.O0 = null;
    }

    private static boolean N0(long j7) {
        return j7 < -30000;
    }

    private final boolean O0(z34 z34Var) {
        return n13.f8865a >= 23 && !U0(z34Var.f14931a) && (!z34Var.f14936f || na4.c(this.G0));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0351, code lost:
    
        if (r1.equals("602LV") != false) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x074d, code lost:
    
        if (r7 != 2) goto L491;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static final boolean U0(String str) {
        char c7;
        boolean z6 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (sa4.class) {
            if (!f11752m1) {
                int i7 = n13.f8865a;
                char c8 = 4;
                char c9 = 65535;
                if (i7 <= 28) {
                    String str2 = n13.f8866b;
                    switch (str2.hashCode()) {
                        case -1339091551:
                            if (str2.equals("dangal")) {
                                c7 = 0;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -1220081023:
                            if (str2.equals("dangalFHD")) {
                                c7 = 2;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -1220066608:
                            if (str2.equals("dangalUHD")) {
                                c7 = 1;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -1012436106:
                            if (str2.equals("oneday")) {
                                c7 = 6;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -64886864:
                            if (str2.equals("magnolia")) {
                                c7 = 3;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 3415681:
                            if (str2.equals("once")) {
                                c7 = 5;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 825323514:
                            if (str2.equals("machuca")) {
                                c7 = 4;
                                break;
                            }
                            c7 = 65535;
                            break;
                        default:
                            c7 = 65535;
                            break;
                    }
                    switch (c7) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            z6 = true;
                            break;
                    }
                    f11753n1 = z6;
                    f11752m1 = true;
                }
                if (i7 > 27 || !"HWEML".equals(n13.f8866b)) {
                    if (i7 <= 26) {
                        String str3 = n13.f8866b;
                        switch (str3.hashCode()) {
                            case -2144781245:
                                if (str3.equals("GIONEE_SWW1609")) {
                                    c8 = '6';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -2144781185:
                                if (str3.equals("GIONEE_SWW1627")) {
                                    c8 = '7';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -2144781160:
                                if (str3.equals("GIONEE_SWW1631")) {
                                    c8 = '8';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -2097309513:
                                if (str3.equals("K50a40")) {
                                    c8 = 'J';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -2022874474:
                                if (str3.equals("CP8676_I02")) {
                                    c8 = 22;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -1978993182:
                                if (str3.equals("NX541J")) {
                                    c8 = 'Y';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -1978990237:
                                if (str3.equals("NX573J")) {
                                    c8 = 'Z';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -1936688988:
                                if (str3.equals("PGN528")) {
                                    c8 = 'e';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -1936688066:
                                if (str3.equals("PGN610")) {
                                    c8 = 'f';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -1936688065:
                                if (str3.equals("PGN611")) {
                                    c8 = 'g';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -1931988508:
                                if (str3.equals("AquaPowerM")) {
                                    c8 = '\r';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -1885099851:
                                if (str3.equals("RAIJIN")) {
                                    c8 = 't';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -1696512866:
                                if (str3.equals("XT1663")) {
                                    c8 = 137;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -1680025915:
                                if (str3.equals("ComioS1")) {
                                    c8 = 21;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -1615810839:
                                if (str3.equals("Phantom6")) {
                                    c8 = 'h';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -1600724499:
                                if (str3.equals("pacificrim")) {
                                    c8 = '_';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -1554255044:
                                if (str3.equals("vernee_M5")) {
                                    c8 = 130;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -1481772737:
                                if (str3.equals("panell_dl")) {
                                    c8 = 'a';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -1481772730:
                                if (str3.equals("panell_ds")) {
                                    c8 = 'b';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -1481772729:
                                if (str3.equals("panell_dt")) {
                                    c8 = 'c';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -1320080169:
                                if (str3.equals("GiONEE_GBL7319")) {
                                    c8 = '4';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -1217592143:
                                if (str3.equals("BRAVIA_ATV2")) {
                                    c8 = 18;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -1180384755:
                                if (str3.equals("iris60")) {
                                    c8 = 'F';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -1139198265:
                                if (str3.equals("Slate_Pro")) {
                                    c8 = 'v';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -1052835013:
                                if (str3.equals("namath")) {
                                    c8 = 'W';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -993250464:
                                if (str3.equals("A10-70F")) {
                                    c8 = 5;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -993250458:
                                if (str3.equals("A10-70L")) {
                                    c8 = 6;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -965403638:
                                if (str3.equals("s905x018")) {
                                    c8 = 'x';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -958336948:
                                if (str3.equals("ELUGA_Ray_X")) {
                                    c8 = '\"';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -879245230:
                                if (str3.equals("tcl_eu")) {
                                    c8 = '~';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -842500323:
                                if (str3.equals("nicklaus_f")) {
                                    c8 = 'X';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -821392978:
                                if (str3.equals("A7000-a")) {
                                    c8 = '\t';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -797483286:
                                if (str3.equals("SVP-DTV15")) {
                                    c8 = 'w';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -794946968:
                                if (str3.equals("watson")) {
                                    c8 = 131;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -788334647:
                                if (str3.equals("whyred")) {
                                    c8 = 132;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -782144577:
                                if (str3.equals("OnePlus5T")) {
                                    c8 = '[';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -575125681:
                                if (str3.equals("GiONEE_CBL7513")) {
                                    c8 = '3';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -521118391:
                                if (str3.equals("GIONEE_GBL7360")) {
                                    c8 = '5';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -430914369:
                                if (str3.equals("Pixi4-7_3G")) {
                                    c8 = 'i';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -290434366:
                                if (str3.equals("taido_row")) {
                                    c8 = 'y';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -282781963:
                                if (str3.equals("BLACK-1X")) {
                                    c8 = 17;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -277133239:
                                if (str3.equals("Z12_PRO")) {
                                    c8 = 138;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -173639913:
                                if (str3.equals("ELUGA_A3_Pro")) {
                                    c8 = 31;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case -56598463:
                                if (str3.equals("woods_fn")) {
                                    c8 = 134;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2126:
                                if (str3.equals("C1")) {
                                    c8 = 20;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2564:
                                if (str3.equals("Q5")) {
                                    c8 = 'q';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2715:
                                if (str3.equals("V1")) {
                                    c8 = 127;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2719:
                                if (str3.equals("V5")) {
                                    c8 = 129;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 3091:
                                if (str3.equals("b5")) {
                                    c8 = 16;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 3483:
                                if (str3.equals("mh")) {
                                    c8 = 'T';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 73405:
                                if (str3.equals("JGZ")) {
                                    c8 = 'I';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 75537:
                                if (str3.equals("M04")) {
                                    c8 = 'O';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 75739:
                                if (str3.equals("M5c")) {
                                    c8 = 'P';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 76779:
                                if (str3.equals("MX6")) {
                                    c8 = 'V';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 78669:
                                if (str3.equals("P85")) {
                                    c8 = '^';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 79305:
                                if (str3.equals("PLE")) {
                                    c8 = 'k';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 80618:
                                if (str3.equals("QX1")) {
                                    c8 = 's';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 88274:
                                if (str3.equals("Z80")) {
                                    c8 = 139;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 98846:
                                if (str3.equals("cv1")) {
                                    c8 = 26;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 98848:
                                if (str3.equals("cv3")) {
                                    c8 = 27;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 99329:
                                if (str3.equals("deb")) {
                                    c8 = 28;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 101481:
                                if (str3.equals("flo")) {
                                    c8 = '1';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 1513190:
                                if (str3.equals("1601")) {
                                    c8 = 0;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 1514184:
                                if (str3.equals("1713")) {
                                    c8 = 1;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 1514185:
                                if (str3.equals("1714")) {
                                    c8 = 2;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2133089:
                                if (str3.equals("F01H")) {
                                    c8 = '$';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2133091:
                                if (str3.equals("F01J")) {
                                    c8 = '%';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2133120:
                                if (str3.equals("F02H")) {
                                    c8 = '&';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2133151:
                                if (str3.equals("F03H")) {
                                    c8 = '\'';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2133182:
                                if (str3.equals("F04H")) {
                                    c8 = '(';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2133184:
                                if (str3.equals("F04J")) {
                                    c8 = ')';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2436959:
                                if (str3.equals("P681")) {
                                    c8 = ']';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2463773:
                                if (str3.equals("Q350")) {
                                    c8 = 'm';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2464648:
                                if (str3.equals("Q427")) {
                                    c8 = 'o';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2689555:
                                if (str3.equals("XE2X")) {
                                    c8 = 136;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 3154429:
                                if (str3.equals("fugu")) {
                                    c8 = '2';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 3284551:
                                if (str3.equals("kate")) {
                                    c8 = 'K';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 3351335:
                                if (str3.equals("mido")) {
                                    c8 = 'U';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 3386211:
                                if (str3.equals("p212")) {
                                    c8 = '\\';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 41325051:
                                if (str3.equals("MEIZU_M5")) {
                                    c8 = 'S';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 51349633:
                                if (str3.equals("601LV")) {
                                    c8 = 3;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 51350594:
                                break;
                            case 55178625:
                                if (str3.equals("Aura_Note_2")) {
                                    c8 = 15;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 61542055:
                                if (str3.equals("A1601")) {
                                    c8 = 7;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 65355429:
                                if (str3.equals("E5643")) {
                                    c8 = 30;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 66214468:
                                if (str3.equals("F3111")) {
                                    c8 = '*';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 66214470:
                                if (str3.equals("F3113")) {
                                    c8 = '+';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 66214473:
                                if (str3.equals("F3116")) {
                                    c8 = ',';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 66215429:
                                if (str3.equals("F3211")) {
                                    c8 = '-';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 66215431:
                                if (str3.equals("F3213")) {
                                    c8 = '.';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 66215433:
                                if (str3.equals("F3215")) {
                                    c8 = '/';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 66216390:
                                if (str3.equals("F3311")) {
                                    c8 = '0';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 76402249:
                                if (str3.equals("PRO7S")) {
                                    c8 = 'l';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 76404105:
                                if (str3.equals("Q4260")) {
                                    c8 = 'n';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 76404911:
                                if (str3.equals("Q4310")) {
                                    c8 = 'p';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 80963634:
                                if (str3.equals("V23GB")) {
                                    c8 = 128;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 82882791:
                                if (str3.equals("X3_HK")) {
                                    c8 = 135;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 98715550:
                                if (str3.equals("i9031")) {
                                    c8 = 'C';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 101370885:
                                if (str3.equals("l5460")) {
                                    c8 = 'L';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 102844228:
                                if (str3.equals("le_x6")) {
                                    c8 = 'M';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 165221241:
                                if (str3.equals("A2016a40")) {
                                    c8 = '\b';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 182191441:
                                if (str3.equals("CPY83_I00")) {
                                    c8 = 25;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 245388979:
                                if (str3.equals("marino_f")) {
                                    c8 = 'R';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 287431619:
                                if (str3.equals("griffin")) {
                                    c8 = '<';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 307593612:
                                if (str3.equals("A7010a48")) {
                                    c8 = 11;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 308517133:
                                if (str3.equals("A7020a48")) {
                                    c8 = '\f';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 316215098:
                                if (str3.equals("TB3-730F")) {
                                    c8 = 'z';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 316215116:
                                if (str3.equals("TB3-730X")) {
                                    c8 = '{';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 316246811:
                                if (str3.equals("TB3-850F")) {
                                    c8 = '|';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 316246818:
                                if (str3.equals("TB3-850M")) {
                                    c8 = '}';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 407160593:
                                if (str3.equals("Pixi5-10_4G")) {
                                    c8 = 'j';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 507412548:
                                if (str3.equals("QM16XE_U")) {
                                    c8 = 'r';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 793982701:
                                if (str3.equals("GIONEE_WBL5708")) {
                                    c8 = '9';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 794038622:
                                if (str3.equals("GIONEE_WBL7365")) {
                                    c8 = ':';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 794040393:
                                if (str3.equals("GIONEE_WBL7519")) {
                                    c8 = ';';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 835649806:
                                if (str3.equals("manning")) {
                                    c8 = 'Q';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 917340916:
                                if (str3.equals("A7000plus")) {
                                    c8 = '\n';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 958008161:
                                if (str3.equals("j2xlteins")) {
                                    c8 = 'H';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 1060579533:
                                if (str3.equals("panell_d")) {
                                    c8 = '`';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 1150207623:
                                if (str3.equals("LS-5017")) {
                                    c8 = 'N';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 1176899427:
                                if (str3.equals("itel_S41")) {
                                    c8 = 'G';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 1280332038:
                                if (str3.equals("hwALE-H")) {
                                    c8 = '>';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 1306947716:
                                if (str3.equals("EverStar_S")) {
                                    c8 = '#';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 1349174697:
                                if (str3.equals("htc_e56ml_dtul")) {
                                    c8 = '=';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 1522194893:
                                if (str3.equals("woods_f")) {
                                    c8 = 133;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 1691543273:
                                if (str3.equals("CPH1609")) {
                                    c8 = 23;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 1691544261:
                                if (str3.equals("CPH1715")) {
                                    c8 = 24;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 1709443163:
                                if (str3.equals("iball8735_9806")) {
                                    c8 = 'D';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 1865889110:
                                if (str3.equals("santoni")) {
                                    c8 = 'u';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 1906253259:
                                if (str3.equals("PB2-670M")) {
                                    c8 = 'd';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 1977196784:
                                if (str3.equals("Infinix-X572")) {
                                    c8 = 'E';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2006372676:
                                if (str3.equals("BRAVIA_ATV3_4K")) {
                                    c8 = 19;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2019281702:
                                if (str3.equals("DM-01K")) {
                                    c8 = 29;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2029784656:
                                if (str3.equals("HWBLN-H")) {
                                    c8 = '?';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2030379515:
                                if (str3.equals("HWCAM-H")) {
                                    c8 = '@';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2033393791:
                                if (str3.equals("ASUS_X00AD_2")) {
                                    c8 = 14;
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2047190025:
                                if (str3.equals("ELUGA_Note")) {
                                    c8 = ' ';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2047252157:
                                if (str3.equals("ELUGA_Prim")) {
                                    c8 = '!';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2048319463:
                                if (str3.equals("HWVNS-H")) {
                                    c8 = 'A';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            case 2048855701:
                                if (str3.equals("HWWAS-H")) {
                                    c8 = 'B';
                                    break;
                                }
                                c8 = 65535;
                                break;
                            default:
                                c8 = 65535;
                                break;
                        }
                        switch (c8) {
                            default:
                                String str4 = n13.f8868d;
                                int hashCode = str4.hashCode();
                                if (hashCode != -594534941) {
                                    if (hashCode != 2006354) {
                                        if (hashCode == 2006367 && str4.equals("AFTN")) {
                                            c9 = 1;
                                        }
                                    } else if (str4.equals("AFTA")) {
                                        c9 = 0;
                                    }
                                } else if (str4.equals("JSN-L21")) {
                                    c9 = 2;
                                }
                                if (c9 != 0) {
                                    if (c9 != 1) {
                                    }
                                }
                                break;
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case c4.w0.f2149o /* 7 */:
                            case c4.w0.f2150p /* 8 */:
                            case '\t':
                            case '\n':
                            case 11:
                            case '\f':
                            case '\r':
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case ' ':
                            case '!':
                            case '\"':
                            case '#':
                            case '$':
                            case '%':
                            case '&':
                            case '\'':
                            case '(':
                            case ')':
                            case '*':
                            case '+':
                            case ',':
                            case '-':
                            case '.':
                            case '/':
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                            case ':':
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                            case '?':
                            case '@':
                            case 'A':
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'E':
                            case 'F':
                            case 'G':
                            case 'H':
                            case 'I':
                            case 'J':
                            case 'K':
                            case 'L':
                            case 'M':
                            case 'N':
                            case 'O':
                            case 'P':
                            case 'Q':
                            case 'R':
                            case 'S':
                            case 'T':
                            case 'U':
                            case 'V':
                            case 'W':
                            case 'X':
                            case 'Y':
                            case 'Z':
                            case '[':
                            case '\\':
                            case ']':
                            case '^':
                            case '_':
                            case '`':
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                            case 'g':
                            case 'h':
                            case 'i':
                            case 'j':
                            case 'k':
                            case 'l':
                            case 'm':
                            case 'n':
                            case 'o':
                            case 'p':
                            case 'q':
                            case 'r':
                            case 's':
                            case 't':
                            case 'u':
                            case 'v':
                            case 'w':
                            case 'x':
                            case 'y':
                            case 'z':
                            case '{':
                            case '|':
                            case '}':
                            case '~':
                            case 127:
                            case 128:
                            case 129:
                            case 130:
                            case 131:
                            case 132:
                            case 133:
                            case 134:
                            case 135:
                            case 136:
                            case 137:
                            case 138:
                            case 139:
                                break;
                        }
                    }
                    f11753n1 = z6;
                    f11752m1 = true;
                }
                z6 = true;
                f11753n1 = z6;
                f11752m1 = true;
            }
        }
        return f11753n1;
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final boolean A0(z34 z34Var) {
        return this.N0 != null || O0(z34Var);
    }

    @Override // com.google.android.gms.internal.ads.b44, com.google.android.gms.internal.ads.bc3
    protected final void B() {
        this.f11762i1 = null;
        this.R0 = false;
        int i7 = n13.f8865a;
        this.P0 = false;
        this.H0.c();
        try {
            super.B();
        } finally {
            this.I0.c(this.f3246z0);
        }
    }

    @Override // com.google.android.gms.internal.ads.b44, com.google.android.gms.internal.ads.bc3
    protected final void D(boolean z6, boolean z7) {
        super.D(z6, z7);
        z();
        this.I0.e(this.f3246z0);
        this.H0.d();
        this.S0 = z7;
        this.T0 = false;
    }

    @Override // com.google.android.gms.internal.ads.b44, com.google.android.gms.internal.ads.bc3
    protected final void E(long j7, boolean z6) {
        super.E(j7, z6);
        this.R0 = false;
        int i7 = n13.f8865a;
        this.H0.h();
        this.f11754a1 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
        this.Y0 = 0;
        this.V0 = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.b44, com.google.android.gms.internal.ads.bc3
    @TargetApi(17)
    protected final void F() {
        try {
            super.F();
            if (this.O0 != null) {
                M0();
            }
        } catch (Throwable th) {
            if (this.O0 != null) {
                M0();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.bc3
    protected final void H() {
        this.X0 = 0;
        this.W0 = SystemClock.elapsedRealtime();
        this.f11755b1 = SystemClock.elapsedRealtime() * 1000;
        this.f11756c1 = 0L;
        this.f11757d1 = 0;
        this.H0.i();
    }

    @Override // com.google.android.gms.internal.ads.bc3
    protected final void I() {
        this.V0 = -9223372036854775807L;
        if (this.X0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.I0.d(this.X0, elapsedRealtime - this.W0);
            this.X0 = 0;
            this.W0 = elapsedRealtime;
        }
        int i7 = this.f11757d1;
        if (i7 != 0) {
            this.I0.r(this.f11756c1, i7);
            this.f11756c1 = 0L;
            this.f11757d1 = 0;
        }
        this.H0.j();
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final float N(float f7, c0 c0Var, c0[] c0VarArr) {
        float f8 = -1.0f;
        for (c0 c0Var2 : c0VarArr) {
            float f9 = c0Var2.f3667s;
            if (f9 != -1.0f) {
                f8 = Math.max(f8, f9);
            }
        }
        if (f8 == -1.0f) {
            return -1.0f;
        }
        return f8 * f7;
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final int O(d44 d44Var, c0 c0Var) {
        int i7 = 0;
        if (!dy.h(c0Var.f3660l)) {
            return 0;
        }
        boolean z6 = c0Var.f3663o != null;
        List<z34> J0 = J0(d44Var, c0Var, z6, false);
        if (z6 && J0.isEmpty()) {
            J0 = J0(d44Var, c0Var, false, false);
        }
        if (J0.isEmpty()) {
            return 1;
        }
        if (!b44.B0(c0Var)) {
            return 2;
        }
        z34 z34Var = J0.get(0);
        boolean d7 = z34Var.d(c0Var);
        int i8 = true != z34Var.e(c0Var) ? 8 : 16;
        if (d7) {
            List<z34> J02 = J0(d44Var, c0Var, z6, true);
            if (!J02.isEmpty()) {
                z34 z34Var2 = J02.get(0);
                if (z34Var2.d(c0Var) && z34Var2.e(c0Var)) {
                    i7 = 32;
                }
            }
        }
        return (true != d7 ? 3 : 4) | i8 | i7;
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final de3 P(z34 z34Var, c0 c0Var, c0 c0Var2) {
        int i7;
        int i8;
        de3 b7 = z34Var.b(c0Var, c0Var2);
        int i9 = b7.f4190e;
        int i10 = c0Var2.f3665q;
        ra4 ra4Var = this.K0;
        if (i10 > ra4Var.f11095a || c0Var2.f3666r > ra4Var.f11096b) {
            i9 |= 256;
        }
        if (H0(z34Var, c0Var2) > this.K0.f11097c) {
            i9 |= 64;
        }
        String str = z34Var.f14931a;
        if (i9 != 0) {
            i8 = i9;
            i7 = 0;
        } else {
            i7 = b7.f4189d;
            i8 = 0;
        }
        return new de3(str, c0Var, c0Var2, i7, i8);
    }

    protected final void P0(x34 x34Var, int i7, long j7) {
        K0();
        lz2.a("releaseOutputBuffer");
        x34Var.d(i7, true);
        lz2.b();
        this.f11755b1 = SystemClock.elapsedRealtime() * 1000;
        this.f3246z0.f3811e++;
        this.Y0 = 0;
        S();
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final de3 Q(cx3 cx3Var) {
        de3 Q = super.Q(cx3Var);
        this.I0.f(cx3Var.f3980a, Q);
        return Q;
    }

    protected final void Q0(x34 x34Var, int i7, long j7, long j8) {
        K0();
        lz2.a("releaseOutputBuffer");
        x34Var.i(i7, j8);
        lz2.b();
        this.f11755b1 = SystemClock.elapsedRealtime() * 1000;
        this.f3246z0.f3811e++;
        this.Y0 = 0;
        S();
    }

    protected final void R0(x34 x34Var, int i7, long j7) {
        lz2.a("skipVideoBuffer");
        x34Var.d(i7, false);
        lz2.b();
        this.f3246z0.f3812f++;
    }

    final void S() {
        this.T0 = true;
        if (this.R0) {
            return;
        }
        this.R0 = true;
        this.I0.q(this.N0);
        this.P0 = true;
    }

    protected final void S0(int i7) {
        cd3 cd3Var = this.f3246z0;
        cd3Var.f3813g += i7;
        this.X0 += i7;
        int i8 = this.Y0 + i7;
        this.Y0 = i8;
        cd3Var.f3814h = Math.max(i8, cd3Var.f3814h);
    }

    @Override // com.google.android.gms.internal.ads.b44
    @TargetApi(17)
    protected final v34 T(z34 z34Var, c0 c0Var, MediaCrypto mediaCrypto, float f7) {
        String str;
        ra4 ra4Var;
        String str2;
        String str3;
        Point point;
        Pair<Integer, Integer> b7;
        int I0;
        na4 na4Var = this.O0;
        if (na4Var != null && na4Var.f9009f != z34Var.f14936f) {
            M0();
        }
        String str4 = z34Var.f14933c;
        c0[] t6 = t();
        int i7 = c0Var.f3665q;
        int i8 = c0Var.f3666r;
        int H0 = H0(z34Var, c0Var);
        int length = t6.length;
        if (length == 1) {
            if (H0 != -1 && (I0 = I0(z34Var, c0Var)) != -1) {
                H0 = Math.min((int) (H0 * 1.5f), I0);
            }
            ra4Var = new ra4(i7, i8, H0);
            str = str4;
        } else {
            boolean z6 = false;
            for (int i9 = 0; i9 < length; i9++) {
                c0 c0Var2 = t6[i9];
                if (c0Var.f3672x != null && c0Var2.f3672x == null) {
                    bf4 b8 = c0Var2.b();
                    b8.g0(c0Var.f3672x);
                    c0Var2 = b8.y();
                }
                if (z34Var.b(c0Var, c0Var2).f4189d != 0) {
                    int i10 = c0Var2.f3665q;
                    z6 |= i10 == -1 || c0Var2.f3666r == -1;
                    i7 = Math.max(i7, i10);
                    i8 = Math.max(i8, c0Var2.f3666r);
                    H0 = Math.max(H0, H0(z34Var, c0Var2));
                }
            }
            if (z6) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i7);
                String str5 = "x";
                sb.append("x");
                sb.append(i8);
                String str6 = "MediaCodecVideoRenderer";
                Log.w("MediaCodecVideoRenderer", sb.toString());
                int i11 = c0Var.f3666r;
                int i12 = c0Var.f3665q;
                int i13 = i11 > i12 ? i11 : i12;
                int i14 = i11 <= i12 ? i11 : i12;
                float f8 = i14 / i13;
                int[] iArr = f11751l1;
                str = str4;
                int i15 = 0;
                while (i15 < 9) {
                    int i16 = iArr[i15];
                    int[] iArr2 = iArr;
                    int i17 = (int) (i16 * f8);
                    if (i16 <= i13 || i17 <= i14) {
                        break;
                    }
                    int i18 = i13;
                    int i19 = i14;
                    if (n13.f8865a >= 21) {
                        int i20 = i11 <= i12 ? i16 : i17;
                        if (i11 <= i12) {
                            i16 = i17;
                        }
                        point = z34Var.a(i20, i16);
                        str2 = str5;
                        str3 = str6;
                        if (z34Var.f(point.x, point.y, c0Var.f3667s)) {
                            break;
                        }
                        i15++;
                        iArr = iArr2;
                        i13 = i18;
                        i14 = i19;
                        str5 = str2;
                        str6 = str3;
                    } else {
                        str2 = str5;
                        str3 = str6;
                        try {
                            int K = n13.K(i16, 16) * 16;
                            int K2 = n13.K(i17, 16) * 16;
                            if (K * K2 <= q44.a()) {
                                int i21 = i11 <= i12 ? K : K2;
                                if (i11 <= i12) {
                                    K = K2;
                                }
                                point = new Point(i21, K);
                            } else {
                                i15++;
                                iArr = iArr2;
                                i13 = i18;
                                i14 = i19;
                                str5 = str2;
                                str6 = str3;
                            }
                        } catch (k44 unused) {
                        }
                    }
                }
                str2 = str5;
                str3 = str6;
                point = null;
                if (point != null) {
                    i7 = Math.max(i7, point.x);
                    i8 = Math.max(i8, point.y);
                    bf4 b9 = c0Var.b();
                    b9.x(i7);
                    b9.f(i8);
                    H0 = Math.max(H0, I0(z34Var, b9.y()));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i7);
                    sb2.append(str2);
                    sb2.append(i8);
                    Log.w(str3, sb2.toString());
                }
            } else {
                str = str4;
            }
            ra4Var = new ra4(i7, i8, H0);
        }
        this.K0 = ra4Var;
        boolean z7 = this.J0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", c0Var.f3665q);
        mediaFormat.setInteger("height", c0Var.f3666r);
        qe2.b(mediaFormat, c0Var.f3662n);
        float f9 = c0Var.f3667s;
        if (f9 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f9);
        }
        qe2.a(mediaFormat, "rotation-degrees", c0Var.f3668t);
        p14 p14Var = c0Var.f3672x;
        if (p14Var != null) {
            qe2.a(mediaFormat, "color-transfer", p14Var.f9997c);
            qe2.a(mediaFormat, "color-standard", p14Var.f9995a);
            qe2.a(mediaFormat, "color-range", p14Var.f9996b);
            byte[] bArr = p14Var.f9998d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c0Var.f3660l) && (b7 = q44.b(c0Var)) != null) {
            qe2.a(mediaFormat, "profile", ((Integer) b7.first).intValue());
        }
        mediaFormat.setInteger("max-width", ra4Var.f11095a);
        mediaFormat.setInteger("max-height", ra4Var.f11096b);
        qe2.a(mediaFormat, "max-input-size", ra4Var.f11097c);
        if (n13.f8865a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f7 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f7);
            }
        }
        if (z7) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (this.N0 == null) {
            if (!O0(z34Var)) {
                throw new IllegalStateException();
            }
            if (this.O0 == null) {
                this.O0 = na4.a(this.G0, z34Var.f14936f);
            }
            this.N0 = this.O0;
        }
        return v34.b(z34Var, mediaFormat, c0Var, this.N0, null);
    }

    protected final void T0(long j7) {
        cd3 cd3Var = this.f3246z0;
        cd3Var.f3816j += j7;
        cd3Var.f3817k++;
        this.f11756c1 += j7;
        this.f11757d1++;
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final List<z34> U(d44 d44Var, c0 c0Var, boolean z6) {
        return J0(d44Var, c0Var, false, false);
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final void V(Exception exc) {
        oc2.a("MediaCodecVideoRenderer", "Video codec error", exc);
        this.I0.s(exc);
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final void W(String str, long j7, long j8) {
        this.I0.a(str, j7, j8);
        this.L0 = U0(str);
        z34 r02 = r0();
        Objects.requireNonNull(r02);
        boolean z6 = false;
        if (n13.f8865a >= 29 && "video/x-vnd.on2.vp9".equals(r02.f14932b)) {
            MediaCodecInfo.CodecProfileLevel[] g7 = r02.g();
            int length = g7.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (g7[i7].profile == 16384) {
                    z6 = true;
                    break;
                }
                i7++;
            }
        }
        this.M0 = z6;
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final void X(String str) {
        this.I0.b(str);
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final void Y(c0 c0Var, MediaFormat mediaFormat) {
        x34 p02 = p0();
        if (p02 != null) {
            p02.a(this.Q0);
        }
        Objects.requireNonNull(mediaFormat);
        boolean z6 = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z6 = true;
        }
        this.f11758e1 = z6 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer = z6 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.f11759f1 = integer;
        float f7 = c0Var.f3669u;
        this.f11761h1 = f7;
        if (n13.f8865a >= 21) {
            int i7 = c0Var.f3668t;
            if (i7 == 90 || i7 == 270) {
                int i8 = this.f11758e1;
                this.f11758e1 = integer;
                this.f11759f1 = i8;
                this.f11761h1 = 1.0f / f7;
            }
        } else {
            this.f11760g1 = c0Var.f3668t;
        }
        this.H0.e(c0Var.f3667s);
    }

    @Override // com.google.android.gms.internal.ads.b44, com.google.android.gms.internal.ads.xx3
    public final boolean f0() {
        na4 na4Var;
        if (super.f0() && (this.R0 || (((na4Var = this.O0) != null && this.N0 == na4Var) || p0() == null))) {
            this.V0 = -9223372036854775807L;
            return true;
        }
        if (this.V0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.V0) {
            return true;
        }
        this.V0 = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final void i0() {
        this.R0 = false;
        int i7 = n13.f8865a;
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final void j0(z51 z51Var) {
        this.Z0++;
        int i7 = n13.f8865a;
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final boolean l0(long j7, long j8, x34 x34Var, ByteBuffer byteBuffer, int i7, int i8, int i9, long j9, boolean z6, boolean z7, c0 c0Var) {
        boolean z8;
        int x6;
        Objects.requireNonNull(x34Var);
        if (this.U0 == -9223372036854775807L) {
            this.U0 = j7;
        }
        if (j9 != this.f11754a1) {
            this.H0.f(j9);
            this.f11754a1 = j9;
        }
        long o02 = o0();
        long j10 = j9 - o02;
        if (z6 && !z7) {
            R0(x34Var, i7, j10);
            return true;
        }
        float n02 = n0();
        int q7 = q();
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        double d7 = j9 - j7;
        double d8 = n02;
        Double.isNaN(d7);
        Double.isNaN(d8);
        long j11 = (long) (d7 / d8);
        if (q7 == 2) {
            j11 -= elapsedRealtime - j8;
        }
        if (this.N0 == this.O0) {
            if (!N0(j11)) {
                return false;
            }
            R0(x34Var, i7, j10);
            T0(j11);
            return true;
        }
        long j12 = elapsedRealtime - this.f11755b1;
        boolean z9 = this.T0 ? !this.R0 : q7 == 2 || this.S0;
        if (this.V0 == -9223372036854775807L && j7 >= o02 && (z9 || (q7 == 2 && N0(j11) && j12 > 100000))) {
            long nanoTime = System.nanoTime();
            if (n13.f8865a >= 21) {
                Q0(x34Var, i7, j10, nanoTime);
            } else {
                P0(x34Var, i7, j10);
            }
            T0(j11);
            return true;
        }
        if (q7 != 2 || j7 == this.U0) {
            return false;
        }
        long nanoTime2 = System.nanoTime();
        long a7 = this.H0.a((j11 * 1000) + nanoTime2);
        long j13 = (a7 - nanoTime2) / 1000;
        long j14 = this.V0;
        if (j13 < -500000 && !z7 && (x6 = x(j7)) != 0) {
            cd3 cd3Var = this.f3246z0;
            cd3Var.f3815i++;
            int i10 = this.Z0 + x6;
            if (j14 != -9223372036854775807L) {
                cd3Var.f3812f += i10;
            } else {
                S0(i10);
            }
            y0();
            return false;
        }
        if (N0(j13) && !z7) {
            if (j14 != -9223372036854775807L) {
                R0(x34Var, i7, j10);
                z8 = true;
            } else {
                lz2.a("dropVideoBuffer");
                x34Var.d(i7, false);
                lz2.b();
                z8 = true;
                S0(1);
            }
            T0(j13);
            return z8;
        }
        if (n13.f8865a >= 21) {
            if (j13 >= 50000) {
                return false;
            }
            Q0(x34Var, i7, j10, a7);
            T0(j13);
            return true;
        }
        if (j13 >= 30000) {
            return false;
        }
        if (j13 > 11000) {
            try {
                Thread.sleep(((-10000) + j13) / 1000);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        P0(x34Var, i7, j10);
        T0(j13);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.view.Surface] */
    @Override // com.google.android.gms.internal.ads.bc3, com.google.android.gms.internal.ads.tx3
    public final void m(int i7, Object obj) {
        if (i7 != 1) {
            if (i7 == 7) {
                this.f11764k1 = (ta4) obj;
                return;
            }
            if (i7 == 10) {
                int intValue = ((Integer) obj).intValue();
                if (this.f11763j1 != intValue) {
                    this.f11763j1 = intValue;
                    return;
                }
                return;
            }
            if (i7 != 4) {
                if (i7 != 5) {
                    return;
                }
                this.H0.l(((Integer) obj).intValue());
                return;
            } else {
                this.Q0 = ((Integer) obj).intValue();
                x34 p02 = p0();
                if (p02 != null) {
                    p02.a(this.Q0);
                    return;
                }
                return;
            }
        }
        na4 na4Var = obj instanceof Surface ? (Surface) obj : null;
        if (na4Var == null) {
            na4 na4Var2 = this.O0;
            if (na4Var2 != null) {
                na4Var = na4Var2;
            } else {
                z34 r02 = r0();
                if (r02 != null && O0(r02)) {
                    na4Var = na4.a(this.G0, r02.f14936f);
                    this.O0 = na4Var;
                }
            }
        }
        if (this.N0 == na4Var) {
            if (na4Var == null || na4Var == this.O0) {
                return;
            }
            L0();
            if (this.P0) {
                this.I0.q(this.N0);
                return;
            }
            return;
        }
        this.N0 = na4Var;
        this.H0.k(na4Var);
        this.P0 = false;
        int q7 = q();
        x34 p03 = p0();
        if (p03 != null) {
            if (n13.f8865a < 23 || na4Var == null || this.L0) {
                v0();
                t0();
            } else {
                p03.e(na4Var);
            }
        }
        if (na4Var == null || na4Var == this.O0) {
            this.f11762i1 = null;
            this.R0 = false;
            int i8 = n13.f8865a;
        } else {
            L0();
            this.R0 = false;
            int i9 = n13.f8865a;
            if (q7 == 2) {
                this.V0 = -9223372036854775807L;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.b44, com.google.android.gms.internal.ads.bc3, com.google.android.gms.internal.ads.xx3
    public final void n(float f7, float f8) {
        super.n(f7, f8);
        this.H0.g(f7);
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final y34 q0(Throwable th, z34 z34Var) {
        return new qa4(th, z34Var, this.N0);
    }

    @Override // com.google.android.gms.internal.ads.b44
    @TargetApi(29)
    protected final void s0(z51 z51Var) {
        if (this.M0) {
            ByteBuffer byteBuffer = z51Var.f14955f;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b7 = byteBuffer.get();
                short s7 = byteBuffer.getShort();
                short s8 = byteBuffer.getShort();
                byte b8 = byteBuffer.get();
                byte b9 = byteBuffer.get();
                byteBuffer.position(0);
                if (b7 == -75 && s7 == 60 && s8 == 1 && b8 == 4 && b9 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    x34 p02 = p0();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    p02.S(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final void u0(long j7) {
        super.u0(j7);
        this.Z0--;
    }

    @Override // com.google.android.gms.internal.ads.xx3, com.google.android.gms.internal.ads.yx3
    public final String v() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.b44
    protected final void w0() {
        super.w0();
        this.Z0 = 0;
    }
}
