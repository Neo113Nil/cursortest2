package w0;

import T.C0089g;
import T.C0096n;
import T.C0097o;
import T.Q;
import T.T;
import T.d0;
import T.e0;
import W.AbstractC0108a;
import W.AbstractC0110c;
import W.J;
import W.RunnableC0114g;
import a.AbstractC0124a;
import a0.AbstractC0135a;
import a0.C0136b;
import a0.C0137c;
import a0.C0138d;
import a0.m0;
import a0.o0;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.flutter.plugin.platform.PlatformPlugin;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import q0.C1353B;
import q0.b0;
import v2.I;
import v2.a0;

/* loaded from: classes.dex */
public final class k extends j0.r {

    /* renamed from: G1, reason: collision with root package name */
    public static final int[] f15811G1 = {1920, 1600, 1440, PlatformPlugin.DEFAULT_SYSTEM_UI, 960, 854, 640, 540, 480};

    /* renamed from: H1, reason: collision with root package name */
    public static boolean f15812H1;

    /* renamed from: I1, reason: collision with root package name */
    public static boolean f15813I1;

    /* renamed from: A1, reason: collision with root package name */
    public j f15814A1;

    /* renamed from: B1, reason: collision with root package name */
    public t f15815B1;

    /* renamed from: C1, reason: collision with root package name */
    public long f15816C1;
    public long D1;

    /* renamed from: E1, reason: collision with root package name */
    public boolean f15817E1;
    public int F1;

    /* renamed from: O0, reason: collision with root package name */
    public final Context f15818O0;

    /* renamed from: P0, reason: collision with root package name */
    public final boolean f15819P0;

    /* renamed from: Q0, reason: collision with root package name */
    public final c0.q f15820Q0;

    /* renamed from: R0, reason: collision with root package name */
    public final int f15821R0;

    /* renamed from: S0, reason: collision with root package name */
    public final boolean f15822S0;

    /* renamed from: T0, reason: collision with root package name */
    public final u f15823T0;
    public final S0.b U0;

    /* renamed from: V0, reason: collision with root package name */
    public final long f15824V0;

    /* renamed from: W0, reason: collision with root package name */
    public final v f15825W0;

    /* renamed from: X0, reason: collision with root package name */
    public final PriorityQueue f15826X0;

    /* renamed from: Y0, reason: collision with root package name */
    public A0.c f15827Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public boolean f15828Z0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f15829a1;

    /* renamed from: b1, reason: collision with root package name */
    public InterfaceC1493H f15830b1;

    /* renamed from: c1, reason: collision with root package name */
    public boolean f15831c1;

    /* renamed from: d1, reason: collision with root package name */
    public int f15832d1;

    /* renamed from: e1, reason: collision with root package name */
    public List f15833e1;

    /* renamed from: f1, reason: collision with root package name */
    public Surface f15834f1;

    /* renamed from: g1, reason: collision with root package name */
    public m f15835g1;
    public W.v h1;

    /* renamed from: i1, reason: collision with root package name */
    public boolean f15836i1;

    /* renamed from: j1, reason: collision with root package name */
    public int f15837j1;

    /* renamed from: k1, reason: collision with root package name */
    public int f15838k1;

    /* renamed from: l1, reason: collision with root package name */
    public long f15839l1;

    /* renamed from: m1, reason: collision with root package name */
    public int f15840m1;

    /* renamed from: n1, reason: collision with root package name */
    public int f15841n1;

    /* renamed from: o1, reason: collision with root package name */
    public int f15842o1;

    /* renamed from: p1, reason: collision with root package name */
    public o0 f15843p1;

    /* renamed from: q1, reason: collision with root package name */
    public long f15844q1;

    /* renamed from: r1, reason: collision with root package name */
    public boolean f15845r1;

    /* renamed from: s1, reason: collision with root package name */
    public long f15846s1;

    /* renamed from: t1, reason: collision with root package name */
    public int f15847t1;

    /* renamed from: u1, reason: collision with root package name */
    public long f15848u1;

    /* renamed from: v1, reason: collision with root package name */
    public e0 f15849v1;

    /* renamed from: w1, reason: collision with root package name */
    public e0 f15850w1;

    /* renamed from: x1, reason: collision with root package name */
    public int f15851x1;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f15852y1;

    /* renamed from: z1, reason: collision with root package name */
    public int f15853z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(i iVar) {
        super(r0.getApplicationContext(), 2, iVar.f15804c, 30.0f);
        Context context = iVar.f15802a;
        Context applicationContext = context.getApplicationContext();
        this.f15818O0 = applicationContext;
        this.f15821R0 = iVar.f15808g;
        this.f15830b1 = null;
        this.f15820Q0 = new c0.q(iVar.f15806e, iVar.f15807f, 1);
        this.f15819P0 = this.f15830b1 == null;
        this.f15823T0 = new u(applicationContext, this, iVar.f15805d);
        this.U0 = new S0.b();
        this.f15822S0 = "NVIDIA".equals(Build.MANUFACTURER);
        this.h1 = W.v.f3354c;
        this.f15837j1 = 1;
        this.f15838k1 = 0;
        this.f15849v1 = e0.f2775d;
        this.f15853z1 = 0;
        this.f15850w1 = null;
        this.f15851x1 = -1000;
        this.f15816C1 = -9223372036854775807L;
        this.D1 = -9223372036854775807L;
        this.f15826X0 = new PriorityQueue();
        this.f15824V0 = -9223372036854775807L;
        this.f15825W0 = null;
        this.f15843p1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0736, code lost:
    
        if (r0.equals("ELUGA_Ray_X") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x08b7, code lost:
    
        if (r13.equals("JSN-L21") == false) goto L664;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean D0(String str) {
        boolean z;
        boolean z4;
        boolean z5 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (k.class) {
            try {
                if (!f15812H1) {
                    int i4 = Build.VERSION.SDK_INT;
                    char c4 = 28;
                    if (i4 <= 28) {
                        String str2 = Build.DEVICE;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -1339091551:
                                if (str2.equals("dangal")) {
                                    z4 = false;
                                    break;
                                }
                                z4 = -1;
                                break;
                            case -1220081023:
                                if (str2.equals("dangalFHD")) {
                                    z4 = true;
                                    break;
                                }
                                z4 = -1;
                                break;
                            case -1220066608:
                                if (str2.equals("dangalUHD")) {
                                    z4 = 2;
                                    break;
                                }
                                z4 = -1;
                                break;
                            case -1012436106:
                                if (str2.equals("oneday")) {
                                    z4 = 3;
                                    break;
                                }
                                z4 = -1;
                                break;
                            case -760312546:
                                if (str2.equals("aquaman")) {
                                    z4 = 4;
                                    break;
                                }
                                z4 = -1;
                                break;
                            case -64886864:
                                if (str2.equals("magnolia")) {
                                    z4 = 5;
                                    break;
                                }
                                z4 = -1;
                                break;
                            case 3415681:
                                if (str2.equals("once")) {
                                    z4 = 6;
                                    break;
                                }
                                z4 = -1;
                                break;
                            case 825323514:
                                if (str2.equals("machuca")) {
                                    z4 = 7;
                                    break;
                                }
                                z4 = -1;
                                break;
                            default:
                                z4 = -1;
                                break;
                        }
                        switch (z4) {
                            case false:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                                z5 = true;
                                break;
                        }
                        f15813I1 = z5;
                        f15812H1 = true;
                    }
                    if (i4 > 27 || !"HWEML".equals(Build.DEVICE)) {
                        String str3 = Build.MODEL;
                        str3.getClass();
                        switch (str3.hashCode()) {
                            case -349662828:
                                if (str3.equals("AFTJMST12")) {
                                    z = false;
                                    break;
                                }
                                z = -1;
                                break;
                            case -321033677:
                                if (str3.equals("AFTKMST12")) {
                                    z = true;
                                    break;
                                }
                                z = -1;
                                break;
                            case 2006354:
                                if (str3.equals("AFTA")) {
                                    z = 2;
                                    break;
                                }
                                z = -1;
                                break;
                            case 2006367:
                                if (str3.equals("AFTN")) {
                                    z = 3;
                                    break;
                                }
                                z = -1;
                                break;
                            case 2006371:
                                if (str3.equals("AFTR")) {
                                    z = 4;
                                    break;
                                }
                                z = -1;
                                break;
                            case 1785421873:
                                if (str3.equals("AFTEU011")) {
                                    z = 5;
                                    break;
                                }
                                z = -1;
                                break;
                            case 1785421876:
                                if (str3.equals("AFTEU014")) {
                                    z = 6;
                                    break;
                                }
                                z = -1;
                                break;
                            case 1798172390:
                                if (str3.equals("AFTSO001")) {
                                    z = 7;
                                    break;
                                }
                                z = -1;
                                break;
                            case 2119412532:
                                if (str3.equals("AFTEUFF014")) {
                                    z = 8;
                                    break;
                                }
                                z = -1;
                                break;
                            default:
                                z = -1;
                                break;
                        }
                        switch (z) {
                            default:
                                if (i4 <= 26) {
                                    String str4 = Build.DEVICE;
                                    str4.getClass();
                                    switch (str4.hashCode()) {
                                        case -2144781245:
                                            if (str4.equals("GIONEE_SWW1609")) {
                                                c4 = 0;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -2144781185:
                                            if (str4.equals("GIONEE_SWW1627")) {
                                                c4 = 1;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -2144781160:
                                            if (str4.equals("GIONEE_SWW1631")) {
                                                c4 = 2;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -2097309513:
                                            if (str4.equals("K50a40")) {
                                                c4 = 3;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -2022874474:
                                            if (str4.equals("CP8676_I02")) {
                                                c4 = 4;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1978993182:
                                            if (str4.equals("NX541J")) {
                                                c4 = 5;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1978990237:
                                            if (str4.equals("NX573J")) {
                                                c4 = 6;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1936688988:
                                            if (str4.equals("PGN528")) {
                                                c4 = 7;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1936688066:
                                            if (str4.equals("PGN610")) {
                                                c4 = '\b';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1936688065:
                                            if (str4.equals("PGN611")) {
                                                c4 = '\t';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1931988508:
                                            if (str4.equals("AquaPowerM")) {
                                                c4 = '\n';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1885099851:
                                            if (str4.equals("RAIJIN")) {
                                                c4 = 11;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1696512866:
                                            if (str4.equals("XT1663")) {
                                                c4 = '\f';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1680025915:
                                            if (str4.equals("ComioS1")) {
                                                c4 = '\r';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1615810839:
                                            if (str4.equals("Phantom6")) {
                                                c4 = 14;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1600724499:
                                            if (str4.equals("pacificrim")) {
                                                c4 = 15;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1554255044:
                                            if (str4.equals("vernee_M5")) {
                                                c4 = 16;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1481772737:
                                            if (str4.equals("panell_dl")) {
                                                c4 = 17;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1481772730:
                                            if (str4.equals("panell_ds")) {
                                                c4 = 18;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1481772729:
                                            if (str4.equals("panell_dt")) {
                                                c4 = 19;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1320080169:
                                            if (str4.equals("GiONEE_GBL7319")) {
                                                c4 = 20;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1217592143:
                                            if (str4.equals("BRAVIA_ATV2")) {
                                                c4 = 21;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1180384755:
                                            if (str4.equals("iris60")) {
                                                c4 = 22;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1139198265:
                                            if (str4.equals("Slate_Pro")) {
                                                c4 = 23;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -1052835013:
                                            if (str4.equals("namath")) {
                                                c4 = 24;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -993250464:
                                            if (str4.equals("A10-70F")) {
                                                c4 = 25;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -993250458:
                                            if (str4.equals("A10-70L")) {
                                                c4 = 26;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -965403638:
                                            if (str4.equals("s905x018")) {
                                                c4 = 27;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -958336948:
                                            break;
                                        case -879245230:
                                            if (str4.equals("tcl_eu")) {
                                                c4 = 29;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -842500323:
                                            if (str4.equals("nicklaus_f")) {
                                                c4 = 30;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -821392978:
                                            if (str4.equals("A7000-a")) {
                                                c4 = 31;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -797483286:
                                            if (str4.equals("SVP-DTV15")) {
                                                c4 = ' ';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -794946968:
                                            if (str4.equals("watson")) {
                                                c4 = '!';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -788334647:
                                            if (str4.equals("whyred")) {
                                                c4 = '\"';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -782144577:
                                            if (str4.equals("OnePlus5T")) {
                                                c4 = '#';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -575125681:
                                            if (str4.equals("GiONEE_CBL7513")) {
                                                c4 = '$';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -521118391:
                                            if (str4.equals("GIONEE_GBL7360")) {
                                                c4 = '%';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -430914369:
                                            if (str4.equals("Pixi4-7_3G")) {
                                                c4 = '&';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -290434366:
                                            if (str4.equals("taido_row")) {
                                                c4 = '\'';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -282781963:
                                            if (str4.equals("BLACK-1X")) {
                                                c4 = '(';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -277133239:
                                            if (str4.equals("Z12_PRO")) {
                                                c4 = ')';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -173639913:
                                            if (str4.equals("ELUGA_A3_Pro")) {
                                                c4 = '*';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case -56598463:
                                            if (str4.equals("woods_fn")) {
                                                c4 = '+';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2126:
                                            if (str4.equals("C1")) {
                                                c4 = ',';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2564:
                                            if (str4.equals("Q5")) {
                                                c4 = '-';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2715:
                                            if (str4.equals("V1")) {
                                                c4 = '.';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2719:
                                            if (str4.equals("V5")) {
                                                c4 = IOUtils.DIR_SEPARATOR_UNIX;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 3091:
                                            if (str4.equals("b5")) {
                                                c4 = '0';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 3483:
                                            if (str4.equals("mh")) {
                                                c4 = '1';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 73405:
                                            if (str4.equals("JGZ")) {
                                                c4 = '2';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 75537:
                                            if (str4.equals("M04")) {
                                                c4 = '3';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 75739:
                                            if (str4.equals("M5c")) {
                                                c4 = '4';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 76779:
                                            if (str4.equals("MX6")) {
                                                c4 = '5';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 78669:
                                            if (str4.equals("P85")) {
                                                c4 = '6';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 79305:
                                            if (str4.equals("PLE")) {
                                                c4 = '7';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 80618:
                                            if (str4.equals("QX1")) {
                                                c4 = '8';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 88274:
                                            if (str4.equals("Z80")) {
                                                c4 = '9';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 98846:
                                            if (str4.equals("cv1")) {
                                                c4 = ':';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 98848:
                                            if (str4.equals("cv3")) {
                                                c4 = ';';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 99329:
                                            if (str4.equals("deb")) {
                                                c4 = '<';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 101481:
                                            if (str4.equals("flo")) {
                                                c4 = '=';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1513190:
                                            if (str4.equals("1601")) {
                                                c4 = '>';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1514184:
                                            if (str4.equals("1713")) {
                                                c4 = '?';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1514185:
                                            if (str4.equals("1714")) {
                                                c4 = '@';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2133089:
                                            if (str4.equals("F01H")) {
                                                c4 = 'A';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2133091:
                                            if (str4.equals("F01J")) {
                                                c4 = 'B';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2133120:
                                            if (str4.equals("F02H")) {
                                                c4 = 'C';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2133151:
                                            if (str4.equals("F03H")) {
                                                c4 = 'D';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2133182:
                                            if (str4.equals("F04H")) {
                                                c4 = 'E';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2133184:
                                            if (str4.equals("F04J")) {
                                                c4 = 'F';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2436959:
                                            if (str4.equals("P681")) {
                                                c4 = 'G';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2463773:
                                            if (str4.equals("Q350")) {
                                                c4 = 'H';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2464648:
                                            if (str4.equals("Q427")) {
                                                c4 = 'I';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2689555:
                                            if (str4.equals("XE2X")) {
                                                c4 = 'J';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 3154429:
                                            if (str4.equals("fugu")) {
                                                c4 = 'K';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 3284551:
                                            if (str4.equals("kate")) {
                                                c4 = 'L';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 3351335:
                                            if (str4.equals("mido")) {
                                                c4 = 'M';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 3386211:
                                            if (str4.equals("p212")) {
                                                c4 = 'N';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 41325051:
                                            if (str4.equals("MEIZU_M5")) {
                                                c4 = 'O';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 51349633:
                                            if (str4.equals("601LV")) {
                                                c4 = 'P';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 51350594:
                                            if (str4.equals("602LV")) {
                                                c4 = 'Q';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 55178625:
                                            if (str4.equals("Aura_Note_2")) {
                                                c4 = 'R';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 61542055:
                                            if (str4.equals("A1601")) {
                                                c4 = 'S';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 65355429:
                                            if (str4.equals("E5643")) {
                                                c4 = 'T';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 66214468:
                                            if (str4.equals("F3111")) {
                                                c4 = 'U';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 66214470:
                                            if (str4.equals("F3113")) {
                                                c4 = 'V';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 66214473:
                                            if (str4.equals("F3116")) {
                                                c4 = 'W';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 66215429:
                                            if (str4.equals("F3211")) {
                                                c4 = 'X';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 66215431:
                                            if (str4.equals("F3213")) {
                                                c4 = 'Y';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 66215433:
                                            if (str4.equals("F3215")) {
                                                c4 = 'Z';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 66216390:
                                            if (str4.equals("F3311")) {
                                                c4 = '[';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 76402249:
                                            if (str4.equals("PRO7S")) {
                                                c4 = IOUtils.DIR_SEPARATOR_WINDOWS;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 76404105:
                                            if (str4.equals("Q4260")) {
                                                c4 = ']';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 76404911:
                                            if (str4.equals("Q4310")) {
                                                c4 = '^';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 80963634:
                                            if (str4.equals("V23GB")) {
                                                c4 = '_';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 82882791:
                                            if (str4.equals("X3_HK")) {
                                                c4 = '`';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 98715550:
                                            if (str4.equals("i9031")) {
                                                c4 = 'a';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 101370885:
                                            if (str4.equals("l5460")) {
                                                c4 = 'b';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 102844228:
                                            if (str4.equals("le_x6")) {
                                                c4 = 'c';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 165221241:
                                            if (str4.equals("A2016a40")) {
                                                c4 = 'd';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 182191441:
                                            if (str4.equals("CPY83_I00")) {
                                                c4 = 'e';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 245388979:
                                            if (str4.equals("marino_f")) {
                                                c4 = 'f';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 287431619:
                                            if (str4.equals("griffin")) {
                                                c4 = 'g';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 307593612:
                                            if (str4.equals("A7010a48")) {
                                                c4 = 'h';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 308517133:
                                            if (str4.equals("A7020a48")) {
                                                c4 = 'i';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 316215098:
                                            if (str4.equals("TB3-730F")) {
                                                c4 = 'j';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 316215116:
                                            if (str4.equals("TB3-730X")) {
                                                c4 = 'k';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 316246811:
                                            if (str4.equals("TB3-850F")) {
                                                c4 = 'l';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 316246818:
                                            if (str4.equals("TB3-850M")) {
                                                c4 = 'm';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 407160593:
                                            if (str4.equals("Pixi5-10_4G")) {
                                                c4 = 'n';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 507412548:
                                            if (str4.equals("QM16XE_U")) {
                                                c4 = 'o';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 793982701:
                                            if (str4.equals("GIONEE_WBL5708")) {
                                                c4 = 'p';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 794038622:
                                            if (str4.equals("GIONEE_WBL7365")) {
                                                c4 = 'q';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 794040393:
                                            if (str4.equals("GIONEE_WBL7519")) {
                                                c4 = 'r';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 835649806:
                                            if (str4.equals("manning")) {
                                                c4 = 's';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 917340916:
                                            if (str4.equals("A7000plus")) {
                                                c4 = 't';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 958008161:
                                            if (str4.equals("j2xlteins")) {
                                                c4 = 'u';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1060579533:
                                            if (str4.equals("panell_d")) {
                                                c4 = 'v';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1150207623:
                                            if (str4.equals("LS-5017")) {
                                                c4 = 'w';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1176899427:
                                            if (str4.equals("itel_S41")) {
                                                c4 = 'x';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1280332038:
                                            if (str4.equals("hwALE-H")) {
                                                c4 = 'y';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1306947716:
                                            if (str4.equals("EverStar_S")) {
                                                c4 = 'z';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1349174697:
                                            if (str4.equals("htc_e56ml_dtul")) {
                                                c4 = '{';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1522194893:
                                            if (str4.equals("woods_f")) {
                                                c4 = '|';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1691543273:
                                            if (str4.equals("CPH1609")) {
                                                c4 = '}';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1691544261:
                                            if (str4.equals("CPH1715")) {
                                                c4 = '~';
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1709443163:
                                            if (str4.equals("iball8735_9806")) {
                                                c4 = 127;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1865889110:
                                            if (str4.equals("santoni")) {
                                                c4 = 128;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1906253259:
                                            if (str4.equals("PB2-670M")) {
                                                c4 = 129;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 1977196784:
                                            if (str4.equals("Infinix-X572")) {
                                                c4 = 130;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2006372676:
                                            if (str4.equals("BRAVIA_ATV3_4K")) {
                                                c4 = 131;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2019281702:
                                            if (str4.equals("DM-01K")) {
                                                c4 = 132;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2029784656:
                                            if (str4.equals("HWBLN-H")) {
                                                c4 = 133;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2030379515:
                                            if (str4.equals("HWCAM-H")) {
                                                c4 = 134;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2033393791:
                                            if (str4.equals("ASUS_X00AD_2")) {
                                                c4 = 135;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2047190025:
                                            if (str4.equals("ELUGA_Note")) {
                                                c4 = 136;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2047252157:
                                            if (str4.equals("ELUGA_Prim")) {
                                                c4 = 137;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2048319463:
                                            if (str4.equals("HWVNS-H")) {
                                                c4 = 138;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 2048855701:
                                            if (str4.equals("HWWAS-H")) {
                                                c4 = 139;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        default:
                                            c4 = 65535;
                                            break;
                                    }
                                    switch (c4) {
                                    }
                                }
                                break;
                            case false:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                            case true:
                                break;
                        }
                        f15813I1 = z5;
                        f15812H1 = true;
                    }
                    z5 = true;
                    f15813I1 = z5;
                    f15812H1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f15813I1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (r3.equals("video/av01") == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int E0(j0.o oVar, C0097o c0097o) {
        int i4 = c0097o.f2874u;
        int i5 = c0097o.v;
        if (i4 != -1 && i5 != -1) {
            String str = c0097o.n;
            str.getClass();
            char c4 = 1;
            if ("video/dolby-vision".equals(str)) {
                Pair c5 = AbstractC0110c.c(c0097o);
                if (c5 != null) {
                    int intValue = ((Integer) c5.first).intValue();
                    if (intValue == 512 || intValue == 1 || intValue == 2) {
                        str = "video/avc";
                    } else if (intValue == 1024) {
                        str = "video/av01";
                    }
                }
                str = "video/hevc";
            }
            switch (str.hashCode()) {
                case -1664118616:
                    if (str.equals("video/3gpp")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -1662735862:
                    break;
                case -1662541442:
                    if (str.equals("video/hevc")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1187890754:
                    if (str.equals("video/mp4v-es")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1331836730:
                    if (str.equals("video/avc")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1599127256:
                    if (str.equals("video/x-vnd.on2.vp8")) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1599127257:
                    if (str.equals("video/x-vnd.on2.vp9")) {
                        c4 = 6;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case 0:
                case 1:
                case 3:
                case 5:
                    return ((i4 * i5) * 3) / 4;
                case 2:
                    return Math.max(2097152, ((i4 * i5) * 3) / 4);
                case 4:
                    String str2 = Build.MODEL;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(Build.MANUFACTURER) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !oVar.f13771f)))) {
                        return ((J.g(i5, 16) * J.g(i4, 16)) * 768) / 4;
                    }
                    break;
                case 6:
                    return ((i4 * i5) * 3) / 8;
            }
        }
        return -1;
    }

    public static List F0(Context context, j0.j jVar, C0097o c0097o, boolean z, boolean z4) {
        String str = c0097o.n;
        if (str == null) {
            return a0.f15605e;
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !AbstractC0347t0.i(context)) {
            String c4 = j0.w.c(c0097o);
            List b4 = c4 == null ? a0.f15605e : jVar.b(c4, z, z4);
            if (!b4.isEmpty()) {
                return b4;
            }
        }
        return j0.w.g(jVar, c0097o, z, z4);
    }

    public static int G0(j0.o oVar, C0097o c0097o) {
        int i4 = c0097o.o;
        List list = c0097o.f2870q;
        if (i4 == -1) {
            return E0(oVar, c0097o);
        }
        int size = list.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i5 += ((byte[]) list.get(i6)).length;
        }
        return c0097o.o + i5;
    }

    @Override // j0.r, a0.AbstractC0135a
    public final void C(float f4, float f5) {
        super.C(f4, f5);
        InterfaceC1493H interfaceC1493H = this.f15830b1;
        if (interfaceC1493H != null) {
            interfaceC1493H.j(f4);
        } else {
            this.f15823T0.h(f4);
        }
        v vVar = this.f15825W0;
        if (vVar != null) {
            vVar.c(f4);
        }
    }

    @Override // a0.AbstractC0135a
    public final boolean F(long j4) {
        if (this.f13843q0 == -9223372036854775807L || j4 < this.f15844q1) {
            return false;
        }
        long j5 = this.f13800F0;
        return j5 == -9223372036854775807L || j4 > j5;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Surface H0(j0.o oVar) {
        boolean z;
        l lVar;
        InterfaceC1493H interfaceC1493H = this.f15830b1;
        if (interfaceC1493H != null) {
            return interfaceC1493H.a();
        }
        Surface surface = this.f15834f1;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && oVar.f13773h) {
            return null;
        }
        AbstractC0124a.t(P0(oVar));
        m mVar = this.f15835g1;
        if (mVar != null && mVar.f15861a != oVar.f13771f && mVar != null) {
            mVar.release();
            this.f15835g1 = null;
        }
        if (this.f15835g1 == null) {
            Context context = this.f15818O0;
            boolean z4 = oVar.f13771f;
            boolean z5 = false;
            if (!z4) {
                int i4 = m.f15859d;
            } else if (!m.b(context)) {
                z = false;
                AbstractC0124a.t(z);
                lVar = new l("ExoPlayer:PlaceholderSurface");
                int i5 = !z4 ? m.f15859d : 0;
                lVar.start();
                Handler handler = new Handler(lVar.getLooper(), lVar);
                lVar.f15855b = handler;
                lVar.f15854a = new RunnableC0114g(handler);
                synchronized (lVar) {
                    lVar.f15855b.obtainMessage(1, i5, 0).sendToTarget();
                    while (lVar.f15858e == null && lVar.f15857d == null && lVar.f15856c == null) {
                        try {
                            lVar.wait();
                        } catch (InterruptedException unused) {
                            z5 = true;
                        }
                    }
                }
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                RuntimeException runtimeException = lVar.f15857d;
                if (runtimeException != null) {
                    throw runtimeException;
                }
                Error error = lVar.f15856c;
                if (error != null) {
                    throw error;
                }
                m mVar2 = lVar.f15858e;
                mVar2.getClass();
                this.f15835g1 = mVar2;
            }
            z = true;
            AbstractC0124a.t(z);
            lVar = new l("ExoPlayer:PlaceholderSurface");
            if (!z4) {
            }
            lVar.start();
            Handler handler2 = new Handler(lVar.getLooper(), lVar);
            lVar.f15855b = handler2;
            lVar.f15854a = new RunnableC0114g(handler2);
            synchronized (lVar) {
            }
        }
        return this.f15835g1;
    }

    @Override // j0.r
    public final C0138d I(j0.o oVar, C0097o c0097o, C0097o c0097o2) {
        int i4;
        C0138d b4 = oVar.b(c0097o, c0097o2);
        int i5 = b4.f4084e;
        A0.c cVar = this.f15827Y0;
        cVar.getClass();
        if (c0097o2.f2874u > cVar.f9a || c0097o2.v > cVar.f10b) {
            i5 |= 256;
        }
        if (G0(oVar, c0097o2) > cVar.f11c) {
            i5 |= 64;
        }
        if (this.f15838k1 != Integer.MIN_VALUE) {
            float f4 = c0097o.f2877y;
            if (f4 != -1.0f) {
                float f5 = c0097o2.f2877y;
                if (f5 != -1.0f && Math.abs(f5 - f4) > 1.0f && ((i4 = Build.VERSION.SDK_INT) < 30 || (i4 == 30 && Build.MODEL.startsWith("MiTV")))) {
                    i5 |= 65536;
                }
            }
        }
        int i6 = i5;
        return new C0138d(oVar.f13766a, c0097o, c0097o2, i6 != 0 ? 0 : b4.f4083d, i6);
    }

    public final boolean I0(j0.o oVar) {
        if (this.f15830b1 != null) {
            return true;
        }
        Surface surface = this.f15834f1;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && oVar.f13773h) || P0(oVar);
        }
        return true;
    }

    @Override // j0.r
    public final j0.n J(IllegalStateException illegalStateException, j0.o oVar) {
        Surface surface = this.f15834f1;
        C1499f c1499f = new C1499f(illegalStateException, oVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return c1499f;
    }

    public final boolean J0(Z.f fVar) {
        if (l() || fVar.g(536870912)) {
            return true;
        }
        long j4 = this.D1;
        return j4 == -9223372036854775807L || j4 - (fVar.f3783g - this.f13798E0.f13785c) <= 100000;
    }

    public final void K0() {
        if (this.f15840m1 > 0) {
            this.f4043g.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j4 = elapsedRealtime - this.f15839l1;
            int i4 = this.f15840m1;
            c0.q qVar = this.f15820Q0;
            Handler handler = qVar.f5600a;
            if (handler != null) {
                handler.post(new RunnableC1488C(qVar, i4, j4));
            }
            this.f15840m1 = 0;
            this.f15839l1 = elapsedRealtime;
        }
    }

    public final void L0() {
        j0.l lVar;
        if (this.f15852y1 && (lVar = this.f13814N) != null) {
            this.f15814A1 = new j(this, lVar);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                lVar.b(bundle);
            }
        }
    }

    public final void M0(j0.l lVar, int i4, long j4) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        lVar.k(i4, j4);
        Trace.endSection();
        this.f13796D0.f4070e++;
        this.f15841n1 = 0;
        if (this.f15830b1 == null) {
            e0 e0Var = this.f15849v1;
            boolean equals = e0Var.equals(e0.f2775d);
            c0.q qVar = this.f15820Q0;
            if (!equals && !e0Var.equals(this.f15850w1)) {
                this.f15850w1 = e0Var;
                qVar.b(e0Var);
            }
            u uVar = this.f15823T0;
            boolean z = uVar.f15900e != 3;
            uVar.f15900e = 3;
            uVar.f15907l.getClass();
            uVar.f15902g = J.M(SystemClock.elapsedRealtime());
            if (!z || (surface = this.f15834f1) == null) {
                return;
            }
            Handler handler = qVar.f5600a;
            if (handler != null) {
                handler.post(new RunnableC1489D(qVar, surface, SystemClock.elapsedRealtime()));
            }
            this.f15836i1 = true;
        }
    }

    public final void N0(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.f15834f1;
        c0.q qVar = this.f15820Q0;
        if (surface2 == surface) {
            if (surface != null) {
                e0 e0Var = this.f15850w1;
                if (e0Var != null) {
                    qVar.b(e0Var);
                }
                Surface surface3 = this.f15834f1;
                if (surface3 == null || !this.f15836i1 || (handler = qVar.f5600a) == null) {
                    return;
                }
                handler.post(new RunnableC1489D(qVar, surface3, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.f15834f1 = surface;
        InterfaceC1493H interfaceC1493H = this.f15830b1;
        u uVar = this.f15823T0;
        if (interfaceC1493H == null) {
            uVar.g(surface);
        }
        this.f15836i1 = false;
        int i4 = this.f4044h;
        j0.l lVar = this.f13814N;
        if (lVar != null && this.f15830b1 == null) {
            j0.o oVar = this.f13821U;
            oVar.getClass();
            if (!I0(oVar) || this.f15828Z0) {
                n0();
                X();
            } else {
                Surface H02 = H0(oVar);
                if (H02 != null) {
                    lVar.s(H02);
                } else {
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new IllegalStateException();
                    }
                    lVar.h();
                }
            }
        }
        if (surface != null) {
            e0 e0Var2 = this.f15850w1;
            if (e0Var2 != null) {
                qVar.b(e0Var2);
            }
        } else {
            this.f15850w1 = null;
            InterfaceC1493H interfaceC1493H2 = this.f15830b1;
            if (interfaceC1493H2 != null) {
                interfaceC1493H2.k();
            }
        }
        if (i4 == 2) {
            InterfaceC1493H interfaceC1493H3 = this.f15830b1;
            if (interfaceC1493H3 != null) {
                interfaceC1493H3.r(true);
            } else {
                uVar.c(true);
            }
        }
        L0();
    }

    @Override // j0.r
    public final int O(Z.f fVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.f15843p1 == null && !this.f15852y1) || fVar.f3783g >= this.f4048l || J0(fVar)) ? 0 : 32;
        }
        return 0;
    }

    public final boolean O0(long j4, long j5, boolean z, boolean z4) {
        if (this.f15830b1 != null && this.f15819P0) {
            j5 -= -this.f15816C1;
        }
        if (j4 < -500000 && !z) {
            b0 b0Var = this.f4045i;
            b0Var.getClass();
            int k4 = b0Var.k(j5 - this.f4047k);
            if (k4 != 0) {
                this.f15844q1 = j5;
                PriorityQueue priorityQueue = this.f15826X0;
                if (z4) {
                    C0137c c0137c = this.f13796D0;
                    int i4 = c0137c.f4069d + k4;
                    c0137c.f4069d = i4;
                    c0137c.f4071f += this.f15842o1;
                    c0137c.f4069d = priorityQueue.size() + i4;
                } else {
                    this.f13796D0.f4075j++;
                    R0(priorityQueue.size() + k4, this.f15842o1);
                }
                if (this.f13814N != null) {
                    if (x0()) {
                        n0();
                        X();
                    } else if (v0()) {
                        M();
                    } else {
                        this.f13806I0 = true;
                    }
                }
                InterfaceC1493H interfaceC1493H = this.f15830b1;
                if (interfaceC1493H != null) {
                    interfaceC1493H.l(false);
                }
                return true;
            }
        }
        return false;
    }

    @Override // j0.r
    public final float P(float f4, C0097o c0097o, C0097o[] c0097oArr) {
        j0.o oVar;
        float f5 = -1.0f;
        for (C0097o c0097o2 : c0097oArr) {
            float f6 = c0097o2.f2877y;
            if (f6 != -1.0f) {
                f5 = Math.max(f5, f6);
            }
        }
        float f7 = f5 == -1.0f ? -1.0f : f5 * f4;
        if (this.f15843p1 == null || (oVar = this.f13821U) == null) {
            return f7;
        }
        int i4 = c0097o.f2874u;
        int i5 = c0097o.v;
        float f8 = -3.4028235E38f;
        if (oVar.f13774i) {
            float f9 = oVar.f13777l;
            if (f9 != -3.4028235E38f && oVar.f13775j == i4 && oVar.f13776k == i5) {
                f8 = f9;
            } else {
                float f10 = 1024.0f;
                if (!oVar.g(i4, i5, 1024.0f)) {
                    f8 = 0.0f;
                    while (true) {
                        float f11 = f10 - f8;
                        if (Math.abs(f11) <= 5.0f) {
                            break;
                        }
                        float f12 = (f11 / 2.0f) + f8;
                        if (oVar.g(i4, i5, f12)) {
                            f8 = f12;
                        } else {
                            f10 = f12;
                        }
                    }
                } else {
                    f8 = 1024.0f;
                }
                oVar.f13777l = f8;
                oVar.f13775j = i4;
                oVar.f13776k = i5;
            }
        }
        return f7 != -1.0f ? Math.max(f7, f8) : f8;
    }

    public final boolean P0(j0.o oVar) {
        if (this.f15852y1 || D0(oVar.f13766a)) {
            return false;
        }
        return !oVar.f13771f || m.b(this.f15818O0);
    }

    @Override // j0.r
    public final ArrayList Q(j0.j jVar, C0097o c0097o, boolean z) {
        boolean z4 = this.f15852y1;
        Context context = this.f15818O0;
        List F02 = F0(context, jVar, c0097o, z, z4);
        HashMap hashMap = j0.w.f13856a;
        ArrayList arrayList = new ArrayList(F02);
        Collections.sort(arrayList, new j0.s(new R1.k(context, 6, c0097o)));
        return arrayList;
    }

    public final void Q0(j0.l lVar, int i4) {
        Trace.beginSection("skipVideoBuffer");
        lVar.f(i4);
        Trace.endSection();
        this.f13796D0.f4071f++;
    }

    public final void R0(int i4, int i5) {
        C0137c c0137c = this.f13796D0;
        c0137c.f4073h += i4;
        int i6 = i4 + i5;
        c0137c.f4072g += i6;
        this.f15840m1 += i6;
        int i7 = this.f15841n1 + i6;
        this.f15841n1 = i7;
        c0137c.f4074i = Math.max(i7, c0137c.f4074i);
        int i8 = this.f15821R0;
        if (i8 <= 0 || this.f15840m1 < i8) {
            return;
        }
        K0();
    }

    public final void S0(C1353B c1353b) {
        T t4 = this.f4050p;
        if (t4.p()) {
            this.D1 = -9223372036854775807L;
            return;
        }
        int b4 = t4.b(c1353b.f14812a);
        if (b4 == -1) {
            this.D1 = -9223372036854775807L;
        } else {
            this.D1 = t4.f(b4, new Q(), false).f2684d;
        }
    }

    @Override // j0.r
    public final L1.h T(j0.o oVar, C0097o c0097o, MediaCrypto mediaCrypto, float f4) {
        C0089g c0089g;
        int i4;
        A0.c cVar;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i5;
        int i6;
        char c4;
        boolean z;
        Pair c5;
        int E02;
        String str = oVar.f13768c;
        C0097o[] c0097oArr = this.f4046j;
        c0097oArr.getClass();
        int i7 = c0097o.f2874u;
        float f5 = c0097o.f2877y;
        C0089g c0089g2 = c0097o.f2844D;
        int i8 = c0097o.v;
        int G02 = G0(oVar, c0097o);
        if (c0097oArr.length == 1) {
            if (G02 != -1 && (E02 = E0(oVar, c0097o)) != -1) {
                G02 = Math.min((int) (G02 * 1.5f), E02);
            }
            cVar = new A0.c(i7, i8, G02);
            c0089g = c0089g2;
            i4 = i8;
        } else {
            int length = c0097oArr.length;
            int i9 = i7;
            int i10 = i8;
            int i11 = 0;
            boolean z4 = false;
            while (i11 < length) {
                C0097o c0097o2 = c0097oArr[i11];
                C0097o[] c0097oArr2 = c0097oArr;
                if (c0089g2 != null && c0097o2.f2844D == null) {
                    C0096n a3 = c0097o2.a();
                    a3.f2808C = c0089g2;
                    c0097o2 = new C0097o(a3);
                }
                C0138d b4 = oVar.b(c0097o, c0097o2);
                int i12 = length;
                int i13 = c0097o2.v;
                if (b4.f4083d != 0) {
                    int i14 = c0097o2.f2874u;
                    i6 = i11;
                    c4 = 65535;
                    z4 |= i14 == -1 || i13 == -1;
                    i9 = Math.max(i9, i14);
                    i10 = Math.max(i10, i13);
                    G02 = Math.max(G02, G0(oVar, c0097o2));
                } else {
                    i6 = i11;
                    c4 = 65535;
                }
                length = i12;
                i11 = i6 + 1;
                c0097oArr = c0097oArr2;
            }
            if (z4) {
                AbstractC0108a.s("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i9 + "x" + i10);
                boolean z5 = i8 > i7;
                int i15 = z5 ? i8 : i7;
                boolean z6 = z5;
                int i16 = z5 ? i7 : i8;
                float f6 = i16 / i15;
                int i17 = 0;
                while (true) {
                    c0089g = c0089g2;
                    if (i17 >= 9) {
                        break;
                    }
                    int i18 = f15811G1[i17];
                    int i19 = i17;
                    int i20 = (int) (i18 * f6);
                    if (i18 <= i15 || i20 <= i16) {
                        break;
                    }
                    if (!z6) {
                        i20 = i18;
                    }
                    if (!z6) {
                        i18 = i20;
                    }
                    int i21 = i16;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.f13769d;
                    if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        i5 = i15;
                        point = null;
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        i5 = i15;
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        point = new Point(J.g(i20, widthAlignment) * widthAlignment, J.g(i18, heightAlignment) * heightAlignment);
                    }
                    if (point != null) {
                        i4 = i8;
                        if (oVar.g(point.x, point.y, f5)) {
                            break;
                        }
                    } else {
                        i4 = i8;
                    }
                    i17 = i19 + 1;
                    i8 = i4;
                    c0089g2 = c0089g;
                    i16 = i21;
                    i15 = i5;
                }
                i4 = i8;
                point = null;
                if (point != null) {
                    i9 = Math.max(i9, point.x);
                    i10 = Math.max(i10, point.y);
                    C0096n a4 = c0097o.a();
                    a4.f2836t = i9;
                    a4.f2837u = i10;
                    G02 = Math.max(G02, E0(oVar, new C0097o(a4)));
                    AbstractC0108a.s("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i9 + "x" + i10);
                }
            } else {
                c0089g = c0089g2;
                i4 = i8;
            }
            cVar = new A0.c(i9, i10, G02);
        }
        this.f15827Y0 = cVar;
        int i22 = this.f15852y1 ? this.f15853z1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i7);
        mediaFormat.setInteger("height", i4);
        AbstractC0108a.r(mediaFormat, c0097o.f2870q);
        if (f5 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f5);
        }
        AbstractC0108a.n(mediaFormat, "rotation-degrees", c0097o.z);
        if (c0089g != null) {
            C0089g c0089g3 = c0089g;
            AbstractC0108a.n(mediaFormat, "color-transfer", c0089g3.f2787c);
            AbstractC0108a.n(mediaFormat, "color-standard", c0089g3.f2785a);
            AbstractC0108a.n(mediaFormat, "color-range", c0089g3.f2786b);
            byte[] bArr = c0089g3.f2788d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c0097o.n) && (c5 = AbstractC0110c.c(c0097o)) != null) {
            AbstractC0108a.n(mediaFormat, "profile", ((Integer) c5.first).intValue());
        }
        mediaFormat.setInteger("max-width", cVar.f9a);
        mediaFormat.setInteger("max-height", cVar.f10b);
        AbstractC0108a.n(mediaFormat, "max-input-size", cVar.f11c);
        mediaFormat.setInteger("priority", 0);
        if (f4 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f4);
        }
        if (this.f15822S0) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i22 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i22);
        }
        if (Build.VERSION.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f15851x1));
        }
        G(mediaFormat);
        Surface H02 = H0(oVar);
        if (this.f15830b1 != null && !J.I(this.f15818O0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new L1.h(oVar, mediaFormat, c0097o, H02, mediaCrypto, null);
    }

    public final void T0(long j4) {
        C0137c c0137c = this.f13796D0;
        c0137c.f4076k += j4;
        c0137c.f4077l++;
        this.f15846s1 += j4;
        this.f15847t1++;
    }

    @Override // j0.r
    public final void U(Z.f fVar) {
        if (this.f15829a1) {
            ByteBuffer byteBuffer = fVar.f3784h;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b4 = byteBuffer.get();
                short s4 = byteBuffer.getShort();
                short s5 = byteBuffer.getShort();
                byte b5 = byteBuffer.get();
                byte b6 = byteBuffer.get();
                byteBuffer.position(0);
                if (b4 == -75 && s4 == 60 && s5 == 1 && b5 == 4) {
                    if (b6 == 0 || b6 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        j0.l lVar = this.f13814N;
                        lVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        lVar.b(bundle);
                    }
                }
            }
        }
    }

    @Override // j0.r
    public final boolean Z(C0097o c0097o) {
        InterfaceC1493H interfaceC1493H = this.f15830b1;
        if (interfaceC1493H == null || interfaceC1493H.v()) {
            return true;
        }
        try {
            return this.f15830b1.u(c0097o);
        } catch (C1492G e4) {
            throw g(e4, c0097o, false, 7000);
        }
    }

    @Override // j0.r
    public final void a0(Exception exc) {
        AbstractC0108a.f("MediaCodecVideoRenderer", "Video codec error", exc);
        c0.q qVar = this.f15820Q0;
        Handler handler = qVar.f5600a;
        if (handler != null) {
            handler.post(new RunnableC1488C(qVar, exc, 1));
        }
    }

    @Override // j0.r
    public final void b0(long j4, long j5, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        c0.q qVar = this.f15820Q0;
        Handler handler = qVar.f5600a;
        if (handler != null) {
            str2 = str;
            handler.post(new RunnableC1488C(qVar, str2, j4, j5));
        } else {
            str2 = str;
        }
        this.f15828Z0 = D0(str2);
        j0.o oVar = this.f13821U;
        oVar.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(oVar.f13767b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.f13769d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i4].profile == 16384) {
                    z = true;
                    break;
                }
                i4++;
            }
        }
        this.f15829a1 = z;
        L0();
    }

    @Override // j0.r, a0.AbstractC0135a, a0.i0
    public final void c(int i4, Object obj) {
        if (i4 == 1) {
            N0(obj);
            return;
        }
        if (i4 == 7) {
            obj.getClass();
            t tVar = (t) obj;
            this.f15815B1 = tVar;
            InterfaceC1493H interfaceC1493H = this.f15830b1;
            if (interfaceC1493H != null) {
                interfaceC1493H.n(tVar);
                return;
            }
            return;
        }
        if (i4 == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.f15853z1 != intValue) {
                this.f15853z1 = intValue;
                if (this.f15852y1) {
                    n0();
                    return;
                }
                return;
            }
            return;
        }
        if (i4 == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.f15837j1 = intValue2;
            j0.l lVar = this.f13814N;
            if (lVar != null) {
                lVar.o(intValue2);
                return;
            }
            return;
        }
        if (i4 == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.f15838k1 = intValue3;
            InterfaceC1493H interfaceC1493H2 = this.f15830b1;
            if (interfaceC1493H2 != null) {
                interfaceC1493H2.i(intValue3);
                return;
            }
            C1486A c1486a = this.f15823T0.f15897b;
            if (c1486a.f15746j == intValue3) {
                return;
            }
            c1486a.f15746j = intValue3;
            c1486a.d(true);
            return;
        }
        if (i4 == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(d0.f2774a)) {
                InterfaceC1493H interfaceC1493H3 = this.f15830b1;
                if (interfaceC1493H3 == null || !interfaceC1493H3.v()) {
                    return;
                }
                this.f15830b1.t();
                return;
            }
            this.f15833e1 = list;
            InterfaceC1493H interfaceC1493H4 = this.f15830b1;
            if (interfaceC1493H4 != null) {
                interfaceC1493H4.m(list);
                return;
            }
            return;
        }
        if (i4 == 14) {
            obj.getClass();
            W.v vVar = (W.v) obj;
            if (vVar.f3355a == 0 || vVar.f3356b == 0) {
                return;
            }
            this.h1 = vVar;
            InterfaceC1493H interfaceC1493H5 = this.f15830b1;
            if (interfaceC1493H5 != null) {
                Surface surface = this.f15834f1;
                surface.getClass();
                interfaceC1493H5.e(surface, vVar);
                return;
            }
            return;
        }
        switch (i4) {
            case 16:
                obj.getClass();
                this.f15851x1 = ((Integer) obj).intValue();
                j0.l lVar2 = this.f13814N;
                if (lVar2 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.f15851x1));
                    lVar2.b(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.f15834f1;
                N0(null);
                obj.getClass();
                ((k) obj).c(1, surface2);
                break;
            case 18:
                boolean z = this.f15843p1 != null;
                o0 o0Var = (o0) obj;
                this.f15843p1 = o0Var;
                if (z != (o0Var != null)) {
                    A0(this.f13815O);
                    break;
                }
                break;
            default:
                super.c(i4, obj);
                break;
        }
    }

    @Override // j0.r
    public final void c0(C0136b c0136b) {
        c0.q qVar = this.f15820Q0;
        Handler handler = qVar.f5600a;
        if (handler != null) {
            handler.post(new g0.p(qVar, 15, c0136b));
        }
    }

    @Override // j0.r
    public final void d0(String str) {
        c0.q qVar = this.f15820Q0;
        Handler handler = qVar.f5600a;
        if (handler != null) {
            handler.post(new RunnableC1488C(qVar, str, 2));
        }
    }

    @Override // j0.r
    public final C0138d e0(l2.e eVar) {
        C0138d e02 = super.e0(eVar);
        C0097o c0097o = (C0097o) eVar.f14271c;
        c0097o.getClass();
        c0.q qVar = this.f15820Q0;
        Handler handler = qVar.f5600a;
        if (handler != null) {
            handler.post(new g0.p(qVar, c0097o, e02, 17));
        }
        v vVar = this.f15825W0;
        if (vVar != null) {
            vVar.b();
        }
        return e02;
    }

    @Override // j0.r
    public final void f0(C0097o c0097o, MediaFormat mediaFormat) {
        int integer;
        int i4;
        j0.l lVar = this.f13814N;
        if (lVar != null) {
            lVar.o(this.f15837j1);
        }
        if (this.f15852y1) {
            i4 = c0097o.f2874u;
            integer = c0097o.v;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i4 = integer2;
        }
        float f4 = c0097o.f2841A;
        int i5 = c0097o.z;
        if (i5 == 90 || i5 == 270) {
            f4 = 1.0f / f4;
            int i6 = integer;
            integer = i4;
            i4 = i6;
        }
        this.f15849v1 = new e0(f4, i4, integer);
        InterfaceC1493H interfaceC1493H = this.f15830b1;
        if (interfaceC1493H == null || !this.f15817E1) {
            this.f15823T0.f(c0097o.f2877y);
        } else {
            C0096n a3 = c0097o.a();
            a3.f2836t = i4;
            a3.f2837u = integer;
            a3.z = f4;
            C0097o c0097o2 = new C0097o(a3);
            int i7 = this.f15832d1;
            List list = this.f15833e1;
            if (list == null) {
                v2.G g4 = I.f15571b;
                list = a0.f15605e;
            }
            interfaceC1493H.g(c0097o2, this.f13798E0.f13784b, i7, list);
            this.f15832d1 = 2;
        }
        this.f15817E1 = false;
    }

    @Override // a0.AbstractC0135a
    public final void h() {
        InterfaceC1493H interfaceC1493H = this.f15830b1;
        if (interfaceC1493H == null) {
            u uVar = this.f15823T0;
            if (uVar.f15900e == 0) {
                uVar.f15900e = 1;
                return;
            }
            return;
        }
        int i4 = this.f15832d1;
        if (i4 == 0 || i4 == 1) {
            this.f15832d1 = 0;
        } else {
            interfaceC1493H.w();
        }
    }

    @Override // j0.r
    public final void h0(long j4) {
        super.h0(j4);
        if (this.f15852y1) {
            return;
        }
        this.f15842o1--;
    }

    @Override // j0.r
    public final void i0() {
        InterfaceC1493H interfaceC1493H = this.f15830b1;
        if (interfaceC1493H != null) {
            interfaceC1493H.h();
            if (this.f15816C1 == -9223372036854775807L) {
                this.f15816C1 = this.f13798E0.f13784b;
            }
            this.f15830b1.f(-this.f15816C1);
        } else {
            this.f15823T0.e(2);
        }
        this.f15817E1 = true;
        L0();
    }

    @Override // j0.r
    public final void j0(Z.f fVar) {
        this.F1 = 0;
        int O4 = O(fVar);
        if ((Build.VERSION.SDK_INT < 34 || (O4 & 32) == 0) && !this.f15852y1) {
            this.f15842o1++;
        }
    }

    @Override // a0.AbstractC0135a
    public final String k() {
        return "MediaCodecVideoRenderer";
    }

    @Override // j0.r
    public final boolean l0(long j4, long j5, j0.l lVar, ByteBuffer byteBuffer, int i4, int i5, int i6, long j6, boolean z, boolean z4, C0097o c0097o) {
        int i7;
        lVar.getClass();
        long j7 = j6 - this.f13798E0.f13785c;
        int i8 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f15826X0;
            Long l4 = (Long) priorityQueue.peek();
            if (l4 == null || l4.longValue() >= j6) {
                break;
            }
            i8++;
            priorityQueue.poll();
        }
        R0(i8, 0);
        InterfaceC1493H interfaceC1493H = this.f15830b1;
        if (interfaceC1493H != null) {
            if (!z || z4) {
                return interfaceC1493H.q(j6, new C1501h(this, lVar, i4, j7));
            }
            Q0(lVar, i4);
            return true;
        }
        int a3 = this.f15823T0.a(j6, j4, j5, this.f13798E0.f13784b, z, z4, this.U0);
        S0.b bVar = this.U0;
        v vVar = this.f15825W0;
        if (vVar != null && a3 != 5 && a3 != 4) {
            vVar.a(j6, bVar.f2396a);
        }
        if (a3 == 0) {
            this.f4043g.getClass();
            long nanoTime = System.nanoTime();
            t tVar = this.f15815B1;
            if (tVar != null) {
                tVar.a(j7, nanoTime, c0097o, this.f13816P);
            }
            M0(lVar, i4, nanoTime);
            T0(bVar.f2396a);
            return true;
        }
        if (a3 == 1) {
            long j8 = bVar.f2397b;
            long j9 = bVar.f2396a;
            if (j8 == this.f15848u1) {
                Q0(lVar, i4);
            } else {
                t tVar2 = this.f15815B1;
                if (tVar2 != null) {
                    i7 = i4;
                    tVar2.a(j7, j8, c0097o, this.f13816P);
                } else {
                    i7 = i4;
                }
                M0(lVar, i7, j8);
            }
            T0(j9);
            this.f15848u1 = j8;
            return true;
        }
        if (a3 == 2) {
            Trace.beginSection("dropVideoBuffer");
            lVar.f(i4);
            Trace.endSection();
            R0(0, 1);
            T0(bVar.f2396a);
            return true;
        }
        if (a3 == 3) {
            Q0(lVar, i4);
            T0(bVar.f2396a);
            return true;
        }
        if (a3 == 4 || a3 == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(a3));
    }

    @Override // a0.AbstractC0135a
    public final boolean m() {
        if (!this.f13846s0) {
            return false;
        }
        InterfaceC1493H interfaceC1493H = this.f15830b1;
        return interfaceC1493H == null || interfaceC1493H.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() < r7.f13828b0) goto L18;
     */
    @Override // a0.AbstractC0135a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o() {
        boolean isReady;
        boolean z = false;
        if (this.f13797E != null) {
            if (l()) {
                isReady = this.n;
            } else {
                b0 b0Var = this.f4045i;
                b0Var.getClass();
                isReady = b0Var.isReady();
            }
            if (!isReady) {
                if (!(this.f13830d0 >= 0)) {
                    if (this.f13828b0 != -9223372036854775807L) {
                        this.f4043g.getClass();
                    }
                }
            }
            z = true;
        }
        InterfaceC1493H interfaceC1493H = this.f15830b1;
        if (interfaceC1493H != null) {
            return interfaceC1493H.s(z);
        }
        if (z && (this.f13814N == null || this.f15852y1)) {
            return true;
        }
        return this.f15823T0.b(z);
    }

    @Override // j0.r
    public final void o0() {
        InterfaceC1493H interfaceC1493H = this.f15830b1;
        if (interfaceC1493H != null) {
            interfaceC1493H.h();
        }
    }

    @Override // j0.r, a0.AbstractC0135a
    public final void p() {
        c0.q qVar = this.f15820Q0;
        this.f15850w1 = null;
        this.D1 = -9223372036854775807L;
        L0();
        this.f15836i1 = false;
        this.f15814A1 = null;
        this.f15845r1 = true;
        try {
            super.p();
            C0137c c0137c = this.f13796D0;
            qVar.getClass();
            synchronized (c0137c) {
            }
            Handler handler = qVar.f5600a;
            if (handler != null) {
                handler.post(new g0.p(qVar, 18, c0137c));
            }
            qVar.b(e0.f2775d);
        } catch (Throwable th) {
            C0137c c0137c2 = this.f13796D0;
            qVar.getClass();
            synchronized (c0137c2) {
                Handler handler2 = qVar.f5600a;
                if (handler2 != null) {
                    handler2.post(new g0.p(qVar, 18, c0137c2));
                }
                qVar.b(e0.f2775d);
                throw th;
            }
        }
    }

    @Override // a0.AbstractC0135a
    public final void q(boolean z, boolean z4) {
        InterfaceC1493H interfaceC1493H;
        this.f13796D0 = new C0137c();
        m0 m0Var = this.f4040d;
        m0Var.getClass();
        boolean z5 = m0Var.f4196b;
        AbstractC0124a.t((z5 && this.f15853z1 == 0) ? false : true);
        if (this.f15852y1 != z5) {
            this.f15852y1 = z5;
            n0();
        }
        C0137c c0137c = this.f13796D0;
        c0.q qVar = this.f15820Q0;
        Handler handler = qVar.f5600a;
        if (handler != null) {
            handler.post(new RunnableC1488C(qVar, c0137c, 5));
        }
        boolean z6 = this.f15831c1;
        u uVar = this.f15823T0;
        if (!z6) {
            if (this.f15833e1 != null && this.f15830b1 == null) {
                n nVar = new n(this.f15818O0, uVar);
                nVar.f15867d = true;
                long j4 = this.f15824V0;
                nVar.f15870g = j4 != -9223372036854775807L ? -j4 : -9223372036854775807L;
                W.D d4 = this.f4043g;
                d4.getClass();
                nVar.f15868e = d4;
                AbstractC0124a.t(!nVar.f15869f);
                if (nVar.f15866c == null) {
                    nVar.f15866c = new q();
                }
                s sVar = new s(nVar);
                nVar.f15869f = true;
                if (1 >= sVar.f15895q) {
                    sVar.f15895q = 1;
                }
                SparseArray sparseArray = sVar.f15883c;
                if (J.l(sparseArray, 0)) {
                    interfaceC1493H = (InterfaceC1493H) sparseArray.get(0);
                } else {
                    o oVar = new o(sVar, sVar.f15881a);
                    sVar.f15887g.add(oVar);
                    sparseArray.put(0, oVar);
                    interfaceC1493H = oVar;
                }
                this.f15830b1 = interfaceC1493H;
            }
            this.f15831c1 = true;
        }
        InterfaceC1493H interfaceC1493H2 = this.f15830b1;
        if (interfaceC1493H2 == null) {
            W.D d5 = this.f4043g;
            d5.getClass();
            uVar.f15907l = d5;
            uVar.e(!z4 ? 1 : 0);
            return;
        }
        interfaceC1493H2.p(new C1500g(this));
        t tVar = this.f15815B1;
        if (tVar != null) {
            this.f15830b1.n(tVar);
        }
        if (this.f15834f1 != null && !this.h1.equals(W.v.f3354c)) {
            this.f15830b1.e(this.f15834f1, this.h1);
        }
        this.f15830b1.i(this.f15838k1);
        this.f15830b1.j(this.L);
        List list = this.f15833e1;
        if (list != null) {
            this.f15830b1.m(list);
        }
        this.f15832d1 = !z4 ? 1 : 0;
        this.f13804H0 = true;
    }

    @Override // j0.r
    public final void q0() {
        super.q0();
        this.f15826X0.clear();
        this.f15842o1 = 0;
        this.F1 = 0;
        this.f15845r1 = false;
    }

    @Override // j0.r, a0.AbstractC0135a
    public final void r(long j4, boolean z, boolean z4) {
        InterfaceC1493H interfaceC1493H = this.f15830b1;
        if (interfaceC1493H != null && !z) {
            interfaceC1493H.l(true);
        }
        if (z4) {
            this.f15844q1 = j4;
        }
        super.r(j4, z, z4);
        InterfaceC1493H interfaceC1493H2 = this.f15830b1;
        u uVar = this.f15823T0;
        if (interfaceC1493H2 == null) {
            uVar.f15897b.b();
            uVar.f15903h = -9223372036854775807L;
            uVar.f15901f = -9223372036854775807L;
            uVar.f15900e = Math.min(uVar.f15900e, 1);
            uVar.f15904i = -9223372036854775807L;
        }
        v vVar = this.f15825W0;
        if (vVar != null) {
            vVar.b();
        }
        if (z) {
            InterfaceC1493H interfaceC1493H3 = this.f15830b1;
            if (interfaceC1493H3 != null) {
                interfaceC1493H3.r(false);
            } else {
                uVar.c(false);
            }
        }
        L0();
        this.f15841n1 = 0;
    }

    @Override // a0.AbstractC0135a
    public final void s() {
        InterfaceC1493H interfaceC1493H = this.f15830b1;
        if (interfaceC1493H == null || !this.f15819P0) {
            return;
        }
        interfaceC1493H.release();
    }

    @Override // a0.AbstractC0135a
    public final void t() {
        try {
            try {
                this.f13833g0 = false;
                p0();
                n0();
                e0.t tVar = this.f13803H;
                if (tVar != null) {
                    tVar.H(null);
                }
                this.f13803H = null;
            } catch (Throwable th) {
                e0.t tVar2 = this.f13803H;
                if (tVar2 != null) {
                    tVar2.H(null);
                }
                this.f13803H = null;
                throw th;
            }
        } finally {
            this.f15831c1 = false;
            this.f15816C1 = -9223372036854775807L;
            m mVar = this.f15835g1;
            if (mVar != null) {
                mVar.release();
                this.f15835g1 = null;
            }
        }
    }

    @Override // a0.AbstractC0135a
    public final void u() {
        this.f15840m1 = 0;
        this.f4043g.getClass();
        this.f15839l1 = SystemClock.elapsedRealtime();
        this.f15846s1 = 0L;
        this.f15847t1 = 0;
        InterfaceC1493H interfaceC1493H = this.f15830b1;
        if (interfaceC1493H != null) {
            interfaceC1493H.d();
        } else {
            this.f15823T0.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    @Override // j0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u0(Z.f fVar) {
        boolean z;
        boolean z4 = false;
        if (!J0(fVar)) {
            boolean z5 = fVar.f3783g < this.f4048l;
            v vVar = this.f15825W0;
            if (vVar != null) {
                long j4 = vVar.f15909a == -9223372036854775807L ? -9223372036854775807L : (long) (((r2 - r6) * vVar.f15911c) + vVar.f15910b);
                if (j4 != -9223372036854775807L && j4 < this.f15824V0) {
                    z = true;
                    if ((!z5 || z) && !fVar.g(268435456)) {
                        if (fVar.g(67108864)) {
                            fVar.h();
                            z4 = true;
                        }
                        if (z4) {
                            if (z5) {
                                this.f13796D0.f4069d++;
                            } else {
                                this.f15826X0.add(Long.valueOf(fVar.f3783g));
                                this.F1++;
                            }
                        }
                        return z4;
                    }
                }
            }
            z = false;
            if (!z5) {
            }
            if (fVar.g(67108864)) {
            }
            if (z4) {
            }
            return z4;
        }
        return false;
    }

    @Override // a0.AbstractC0135a
    public final void v() {
        K0();
        int i4 = this.f15847t1;
        if (i4 != 0) {
            long j4 = this.f15846s1;
            c0.q qVar = this.f15820Q0;
            Handler handler = qVar.f5600a;
            if (handler != null) {
                handler.post(new RunnableC1488C(qVar, j4, i4));
            }
            this.f15846s1 = 0L;
            this.f15847t1 = 0;
        }
        InterfaceC1493H interfaceC1493H = this.f15830b1;
        if (interfaceC1493H != null) {
            interfaceC1493H.c();
        } else {
            u uVar = this.f15823T0;
            uVar.f15899d = false;
            uVar.f15904i = -9223372036854775807L;
            C1486A c1486a = uVar.f15897b;
            c1486a.f15740d = false;
            w wVar = c1486a.f15739c;
            if (wVar != null) {
                wVar.b();
            }
            c1486a.a();
        }
        v vVar = this.f15825W0;
        if (vVar != null) {
            vVar.b();
        }
    }

    @Override // j0.r
    public final boolean v0() {
        boolean z;
        C0097o c0097o = this.f13815O;
        long j4 = this.D1;
        if (j4 != -9223372036854775807L) {
            if (this.f13808J0 + 1 + j4 <= Long.MAX_VALUE - (this.f13798E0.f13785c + j4)) {
                z = false;
                return this.f15843p1 == null || this.f15845r1 || this.f15852y1 || (c0097o != null && c0097o.f2869p > 0) || z || this.f13798E0.f13787e != -9223372036854775807L;
            }
        }
        z = true;
        if (this.f15843p1 == null) {
        }
    }

    @Override // j0.r, a0.AbstractC0135a
    public final void w(C0097o[] c0097oArr, long j4, long j5, C1353B c1353b) {
        super.w(c0097oArr, j4, j5, c1353b);
        S0(c1353b);
        v vVar = this.f15825W0;
        if (vVar != null) {
            vVar.b();
        }
    }

    @Override // j0.r
    public final boolean w0(j0.o oVar) {
        return I0(oVar);
    }

    @Override // a0.AbstractC0135a
    public final void x() {
        C1353B c1353b = this.f4051q;
        if (c1353b != null) {
            S0(c1353b);
        }
    }

    @Override // j0.r
    public final boolean x0() {
        j0.o oVar = this.f13821U;
        if (this.f15830b1 != null && oVar != null) {
            String str = oVar.f13766a;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.x0();
    }

    @Override // j0.r, a0.AbstractC0135a
    public final void z(long j4, long j5) {
        InterfaceC1493H interfaceC1493H = this.f15830b1;
        if (interfaceC1493H != null) {
            try {
                interfaceC1493H.o(j4, j5);
            } catch (C1492G e4) {
                throw g(e4, e4.f15772a, false, 7001);
            }
        }
        super.z(j4, j5);
    }

    @Override // j0.r
    public final int z0(j0.j jVar, C0097o c0097o) {
        boolean z;
        int i4 = 0;
        if (!T.F.m(c0097o.n)) {
            return AbstractC0135a.f(0, 0, 0, 0);
        }
        boolean z4 = c0097o.f2871r != null;
        Context context = this.f15818O0;
        List F02 = F0(context, jVar, c0097o, z4, false);
        if (z4 && F02.isEmpty()) {
            F02 = F0(context, jVar, c0097o, false, false);
        }
        if (F02.isEmpty()) {
            return AbstractC0135a.f(1, 0, 0, 0);
        }
        int i5 = c0097o.f2854O;
        if (i5 != 0 && i5 != 2) {
            return AbstractC0135a.f(2, 0, 0, 0);
        }
        j0.o oVar = (j0.o) F02.get(0);
        boolean e4 = oVar.e(context, c0097o);
        if (!e4) {
            for (int i6 = 1; i6 < F02.size(); i6++) {
                j0.o oVar2 = (j0.o) F02.get(i6);
                if (oVar2.e(context, c0097o)) {
                    z = false;
                    e4 = true;
                    oVar = oVar2;
                    break;
                }
            }
        }
        z = true;
        int i7 = e4 ? 4 : 3;
        int i8 = oVar.f(c0097o) ? 16 : 8;
        int i9 = oVar.f13772g ? 64 : 0;
        int i10 = z ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(c0097o.n) && !AbstractC0347t0.i(context)) {
            i10 = 256;
        }
        if (e4) {
            List F03 = F0(context, jVar, c0097o, z4, true);
            if (!F03.isEmpty()) {
                HashMap hashMap = j0.w.f13856a;
                ArrayList arrayList = new ArrayList(F03);
                Collections.sort(arrayList, new j0.s(new R1.k(context, 6, c0097o)));
                j0.o oVar3 = (j0.o) arrayList.get(0);
                if (oVar3.e(context, c0097o) && oVar3.f(c0097o)) {
                    i4 = 32;
                }
            }
        }
        return i7 | i8 | i4 | i9 | i10;
    }
}
