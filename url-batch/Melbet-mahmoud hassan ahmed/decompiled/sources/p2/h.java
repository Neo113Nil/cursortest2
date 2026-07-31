package p2;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import c4.w0;
import i1.l;
import i1.v;
import java.nio.ByteBuffer;
import java.util.List;
import o2.j0;
import o2.m0;
import p2.x;
import r0.f3;
import r0.s1;
import r0.t1;

/* loaded from: classes.dex */
public class h extends i1.o {

    /* renamed from: u1, reason: collision with root package name */
    private static final int[] f20010u1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: v1, reason: collision with root package name */
    private static boolean f20011v1;

    /* renamed from: w1, reason: collision with root package name */
    private static boolean f20012w1;
    private final Context L0;
    private final l M0;
    private final x.a N0;
    private final long O0;
    private final int P0;
    private final boolean Q0;
    private a R0;
    private boolean S0;
    private boolean T0;
    private Surface U0;
    private i V0;
    private boolean W0;
    private int X0;
    private boolean Y0;
    private boolean Z0;

    /* renamed from: a1, reason: collision with root package name */
    private boolean f20013a1;

    /* renamed from: b1, reason: collision with root package name */
    private long f20014b1;

    /* renamed from: c1, reason: collision with root package name */
    private long f20015c1;

    /* renamed from: d1, reason: collision with root package name */
    private long f20016d1;

    /* renamed from: e1, reason: collision with root package name */
    private int f20017e1;

    /* renamed from: f1, reason: collision with root package name */
    private int f20018f1;

    /* renamed from: g1, reason: collision with root package name */
    private int f20019g1;

    /* renamed from: h1, reason: collision with root package name */
    private long f20020h1;

    /* renamed from: i1, reason: collision with root package name */
    private long f20021i1;

    /* renamed from: j1, reason: collision with root package name */
    private long f20022j1;

    /* renamed from: k1, reason: collision with root package name */
    private int f20023k1;

    /* renamed from: l1, reason: collision with root package name */
    private int f20024l1;

    /* renamed from: m1, reason: collision with root package name */
    private int f20025m1;

    /* renamed from: n1, reason: collision with root package name */
    private int f20026n1;

    /* renamed from: o1, reason: collision with root package name */
    private float f20027o1;

    /* renamed from: p1, reason: collision with root package name */
    private z f20028p1;

    /* renamed from: q1, reason: collision with root package name */
    private boolean f20029q1;

    /* renamed from: r1, reason: collision with root package name */
    private int f20030r1;

    /* renamed from: s1, reason: collision with root package name */
    b f20031s1;

    /* renamed from: t1, reason: collision with root package name */
    private j f20032t1;

    protected static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f20033a;

        /* renamed from: b, reason: collision with root package name */
        public final int f20034b;

        /* renamed from: c, reason: collision with root package name */
        public final int f20035c;

        public a(int i7, int i8, int i9) {
            this.f20033a = i7;
            this.f20034b = i8;
            this.f20035c = i9;
        }
    }

    private final class b implements l.c, Handler.Callback {

        /* renamed from: f, reason: collision with root package name */
        private final Handler f20036f;

        public b(i1.l lVar) {
            Handler x6 = m0.x(this);
            this.f20036f = x6;
            lVar.g(this, x6);
        }

        private void b(long j7) {
            h hVar = h.this;
            if (this != hVar.f20031s1) {
                return;
            }
            if (j7 == Long.MAX_VALUE) {
                hVar.S1();
                return;
            }
            try {
                hVar.R1(j7);
            } catch (r0.r e7) {
                h.this.h1(e7);
            }
        }

        @Override // i1.l.c
        public void a(i1.l lVar, long j7, long j8) {
            if (m0.f19752a >= 30) {
                b(j7);
            } else {
                this.f20036f.sendMessageAtFrontOfQueue(Message.obtain(this.f20036f, 0, (int) (j7 >> 32), (int) j7));
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(m0.V0(message.arg1, message.arg2));
            return true;
        }
    }

    public h(Context context, l.b bVar, i1.q qVar, long j7, boolean z6, Handler handler, x xVar, int i7) {
        this(context, bVar, qVar, j7, z6, handler, xVar, i7, 30.0f);
    }

    public h(Context context, l.b bVar, i1.q qVar, long j7, boolean z6, Handler handler, x xVar, int i7, float f7) {
        super(2, bVar, qVar, z6, f7);
        this.O0 = j7;
        this.P0 = i7;
        Context applicationContext = context.getApplicationContext();
        this.L0 = applicationContext;
        this.M0 = new l(applicationContext);
        this.N0 = new x.a(handler, xVar);
        this.Q0 = y1();
        this.f20015c1 = -9223372036854775807L;
        this.f20024l1 = -1;
        this.f20025m1 = -1;
        this.f20027o1 = -1.0f;
        this.X0 = 1;
        this.f20030r1 = 0;
        v1();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x07d0, code lost:
    
        if (r0.equals("PGN528") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x083e, code lost:
    
        if (r0.equals("AFTN") == false) goto L614;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean A1() {
        char c7;
        int i7 = m0.f19752a;
        char c8 = 7;
        char c9 = 2;
        if (i7 <= 28) {
            String str = m0.f19753b;
            str.hashCode();
            switch (str.hashCode()) {
                case -1339091551:
                    if (str.equals("dangal")) {
                        c7 = 0;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1220081023:
                    if (str.equals("dangalFHD")) {
                        c7 = 1;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1220066608:
                    if (str.equals("dangalUHD")) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -1012436106:
                    if (str.equals("oneday")) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -760312546:
                    if (str.equals("aquaman")) {
                        c7 = 4;
                        break;
                    }
                    c7 = 65535;
                    break;
                case -64886864:
                    if (str.equals("magnolia")) {
                        c7 = 5;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 3415681:
                    if (str.equals("once")) {
                        c7 = 6;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 825323514:
                    if (str.equals("machuca")) {
                        c7 = 7;
                        break;
                    }
                    c7 = 65535;
                    break;
                default:
                    c7 = 65535;
                    break;
            }
            switch (c7) {
            }
            return true;
        }
        if (i7 <= 27 && "HWEML".equals(m0.f19753b)) {
            return true;
        }
        if (i7 <= 26) {
            String str2 = m0.f19753b;
            str2.hashCode();
            switch (str2.hashCode()) {
                case -2144781245:
                    if (str2.equals("GIONEE_SWW1609")) {
                        c8 = 0;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -2144781185:
                    if (str2.equals("GIONEE_SWW1627")) {
                        c8 = 1;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -2144781160:
                    if (str2.equals("GIONEE_SWW1631")) {
                        c8 = 2;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -2097309513:
                    if (str2.equals("K50a40")) {
                        c8 = 3;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -2022874474:
                    if (str2.equals("CP8676_I02")) {
                        c8 = 4;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1978993182:
                    if (str2.equals("NX541J")) {
                        c8 = 5;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1978990237:
                    if (str2.equals("NX573J")) {
                        c8 = 6;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1936688988:
                    break;
                case -1936688066:
                    if (str2.equals("PGN610")) {
                        c8 = '\b';
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1936688065:
                    if (str2.equals("PGN611")) {
                        c8 = '\t';
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1931988508:
                    if (str2.equals("AquaPowerM")) {
                        c8 = '\n';
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1885099851:
                    if (str2.equals("RAIJIN")) {
                        c8 = 11;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1696512866:
                    if (str2.equals("XT1663")) {
                        c8 = '\f';
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1680025915:
                    if (str2.equals("ComioS1")) {
                        c8 = '\r';
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1615810839:
                    if (str2.equals("Phantom6")) {
                        c8 = 14;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1600724499:
                    if (str2.equals("pacificrim")) {
                        c8 = 15;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1554255044:
                    if (str2.equals("vernee_M5")) {
                        c8 = 16;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1481772737:
                    if (str2.equals("panell_dl")) {
                        c8 = 17;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1481772730:
                    if (str2.equals("panell_ds")) {
                        c8 = 18;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1481772729:
                    if (str2.equals("panell_dt")) {
                        c8 = 19;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1320080169:
                    if (str2.equals("GiONEE_GBL7319")) {
                        c8 = 20;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1217592143:
                    if (str2.equals("BRAVIA_ATV2")) {
                        c8 = 21;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1180384755:
                    if (str2.equals("iris60")) {
                        c8 = 22;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1139198265:
                    if (str2.equals("Slate_Pro")) {
                        c8 = 23;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -1052835013:
                    if (str2.equals("namath")) {
                        c8 = 24;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -993250464:
                    if (str2.equals("A10-70F")) {
                        c8 = 25;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -993250458:
                    if (str2.equals("A10-70L")) {
                        c8 = 26;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -965403638:
                    if (str2.equals("s905x018")) {
                        c8 = 27;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -958336948:
                    if (str2.equals("ELUGA_Ray_X")) {
                        c8 = 28;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -879245230:
                    if (str2.equals("tcl_eu")) {
                        c8 = 29;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -842500323:
                    if (str2.equals("nicklaus_f")) {
                        c8 = 30;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -821392978:
                    if (str2.equals("A7000-a")) {
                        c8 = 31;
                        break;
                    }
                    c8 = 65535;
                    break;
                case -797483286:
                    if (str2.equals("SVP-DTV15")) {
                        c8 = ' ';
                        break;
                    }
                    c8 = 65535;
                    break;
                case -794946968:
                    if (str2.equals("watson")) {
                        c8 = '!';
                        break;
                    }
                    c8 = 65535;
                    break;
                case -788334647:
                    if (str2.equals("whyred")) {
                        c8 = '\"';
                        break;
                    }
                    c8 = 65535;
                    break;
                case -782144577:
                    if (str2.equals("OnePlus5T")) {
                        c8 = '#';
                        break;
                    }
                    c8 = 65535;
                    break;
                case -575125681:
                    if (str2.equals("GiONEE_CBL7513")) {
                        c8 = '$';
                        break;
                    }
                    c8 = 65535;
                    break;
                case -521118391:
                    if (str2.equals("GIONEE_GBL7360")) {
                        c8 = '%';
                        break;
                    }
                    c8 = 65535;
                    break;
                case -430914369:
                    if (str2.equals("Pixi4-7_3G")) {
                        c8 = '&';
                        break;
                    }
                    c8 = 65535;
                    break;
                case -290434366:
                    if (str2.equals("taido_row")) {
                        c8 = '\'';
                        break;
                    }
                    c8 = 65535;
                    break;
                case -282781963:
                    if (str2.equals("BLACK-1X")) {
                        c8 = '(';
                        break;
                    }
                    c8 = 65535;
                    break;
                case -277133239:
                    if (str2.equals("Z12_PRO")) {
                        c8 = ')';
                        break;
                    }
                    c8 = 65535;
                    break;
                case -173639913:
                    if (str2.equals("ELUGA_A3_Pro")) {
                        c8 = '*';
                        break;
                    }
                    c8 = 65535;
                    break;
                case -56598463:
                    if (str2.equals("woods_fn")) {
                        c8 = '+';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 2126:
                    if (str2.equals("C1")) {
                        c8 = ',';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 2564:
                    if (str2.equals("Q5")) {
                        c8 = '-';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 2715:
                    if (str2.equals("V1")) {
                        c8 = '.';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 2719:
                    if (str2.equals("V5")) {
                        c8 = '/';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 3091:
                    if (str2.equals("b5")) {
                        c8 = '0';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 3483:
                    if (str2.equals("mh")) {
                        c8 = '1';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 73405:
                    if (str2.equals("JGZ")) {
                        c8 = '2';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 75537:
                    if (str2.equals("M04")) {
                        c8 = '3';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 75739:
                    if (str2.equals("M5c")) {
                        c8 = '4';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 76779:
                    if (str2.equals("MX6")) {
                        c8 = '5';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 78669:
                    if (str2.equals("P85")) {
                        c8 = '6';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 79305:
                    if (str2.equals("PLE")) {
                        c8 = '7';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 80618:
                    if (str2.equals("QX1")) {
                        c8 = '8';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 88274:
                    if (str2.equals("Z80")) {
                        c8 = '9';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 98846:
                    if (str2.equals("cv1")) {
                        c8 = ':';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 98848:
                    if (str2.equals("cv3")) {
                        c8 = ';';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 99329:
                    if (str2.equals("deb")) {
                        c8 = '<';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 101481:
                    if (str2.equals("flo")) {
                        c8 = '=';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1513190:
                    if (str2.equals("1601")) {
                        c8 = '>';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1514184:
                    if (str2.equals("1713")) {
                        c8 = '?';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1514185:
                    if (str2.equals("1714")) {
                        c8 = '@';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 2133089:
                    if (str2.equals("F01H")) {
                        c8 = 'A';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 2133091:
                    if (str2.equals("F01J")) {
                        c8 = 'B';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 2133120:
                    if (str2.equals("F02H")) {
                        c8 = 'C';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 2133151:
                    if (str2.equals("F03H")) {
                        c8 = 'D';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 2133182:
                    if (str2.equals("F04H")) {
                        c8 = 'E';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 2133184:
                    if (str2.equals("F04J")) {
                        c8 = 'F';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 2436959:
                    if (str2.equals("P681")) {
                        c8 = 'G';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 2463773:
                    if (str2.equals("Q350")) {
                        c8 = 'H';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 2464648:
                    if (str2.equals("Q427")) {
                        c8 = 'I';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 2689555:
                    if (str2.equals("XE2X")) {
                        c8 = 'J';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 3154429:
                    if (str2.equals("fugu")) {
                        c8 = 'K';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 3284551:
                    if (str2.equals("kate")) {
                        c8 = 'L';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 3351335:
                    if (str2.equals("mido")) {
                        c8 = 'M';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 3386211:
                    if (str2.equals("p212")) {
                        c8 = 'N';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 41325051:
                    if (str2.equals("MEIZU_M5")) {
                        c8 = 'O';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 51349633:
                    if (str2.equals("601LV")) {
                        c8 = 'P';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 51350594:
                    if (str2.equals("602LV")) {
                        c8 = 'Q';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 55178625:
                    if (str2.equals("Aura_Note_2")) {
                        c8 = 'R';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 61542055:
                    if (str2.equals("A1601")) {
                        c8 = 'S';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 65355429:
                    if (str2.equals("E5643")) {
                        c8 = 'T';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 66214468:
                    if (str2.equals("F3111")) {
                        c8 = 'U';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 66214470:
                    if (str2.equals("F3113")) {
                        c8 = 'V';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 66214473:
                    if (str2.equals("F3116")) {
                        c8 = 'W';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 66215429:
                    if (str2.equals("F3211")) {
                        c8 = 'X';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 66215431:
                    if (str2.equals("F3213")) {
                        c8 = 'Y';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 66215433:
                    if (str2.equals("F3215")) {
                        c8 = 'Z';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 66216390:
                    if (str2.equals("F3311")) {
                        c8 = '[';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 76402249:
                    if (str2.equals("PRO7S")) {
                        c8 = '\\';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 76404105:
                    if (str2.equals("Q4260")) {
                        c8 = ']';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 76404911:
                    if (str2.equals("Q4310")) {
                        c8 = '^';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 80963634:
                    if (str2.equals("V23GB")) {
                        c8 = '_';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 82882791:
                    if (str2.equals("X3_HK")) {
                        c8 = '`';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 98715550:
                    if (str2.equals("i9031")) {
                        c8 = 'a';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 101370885:
                    if (str2.equals("l5460")) {
                        c8 = 'b';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 102844228:
                    if (str2.equals("le_x6")) {
                        c8 = 'c';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 165221241:
                    if (str2.equals("A2016a40")) {
                        c8 = 'd';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 182191441:
                    if (str2.equals("CPY83_I00")) {
                        c8 = 'e';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 245388979:
                    if (str2.equals("marino_f")) {
                        c8 = 'f';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 287431619:
                    if (str2.equals("griffin")) {
                        c8 = 'g';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 307593612:
                    if (str2.equals("A7010a48")) {
                        c8 = 'h';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 308517133:
                    if (str2.equals("A7020a48")) {
                        c8 = 'i';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 316215098:
                    if (str2.equals("TB3-730F")) {
                        c8 = 'j';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 316215116:
                    if (str2.equals("TB3-730X")) {
                        c8 = 'k';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 316246811:
                    if (str2.equals("TB3-850F")) {
                        c8 = 'l';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 316246818:
                    if (str2.equals("TB3-850M")) {
                        c8 = 'm';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 407160593:
                    if (str2.equals("Pixi5-10_4G")) {
                        c8 = 'n';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 507412548:
                    if (str2.equals("QM16XE_U")) {
                        c8 = 'o';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 793982701:
                    if (str2.equals("GIONEE_WBL5708")) {
                        c8 = 'p';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 794038622:
                    if (str2.equals("GIONEE_WBL7365")) {
                        c8 = 'q';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 794040393:
                    if (str2.equals("GIONEE_WBL7519")) {
                        c8 = 'r';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 835649806:
                    if (str2.equals("manning")) {
                        c8 = 's';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 917340916:
                    if (str2.equals("A7000plus")) {
                        c8 = 't';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 958008161:
                    if (str2.equals("j2xlteins")) {
                        c8 = 'u';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1060579533:
                    if (str2.equals("panell_d")) {
                        c8 = 'v';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1150207623:
                    if (str2.equals("LS-5017")) {
                        c8 = 'w';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1176899427:
                    if (str2.equals("itel_S41")) {
                        c8 = 'x';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1280332038:
                    if (str2.equals("hwALE-H")) {
                        c8 = 'y';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1306947716:
                    if (str2.equals("EverStar_S")) {
                        c8 = 'z';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1349174697:
                    if (str2.equals("htc_e56ml_dtul")) {
                        c8 = '{';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1522194893:
                    if (str2.equals("woods_f")) {
                        c8 = '|';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1691543273:
                    if (str2.equals("CPH1609")) {
                        c8 = '}';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1691544261:
                    if (str2.equals("CPH1715")) {
                        c8 = '~';
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1709443163:
                    if (str2.equals("iball8735_9806")) {
                        c8 = 127;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1865889110:
                    if (str2.equals("santoni")) {
                        c8 = 128;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1906253259:
                    if (str2.equals("PB2-670M")) {
                        c8 = 129;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 1977196784:
                    if (str2.equals("Infinix-X572")) {
                        c8 = 130;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 2006372676:
                    if (str2.equals("BRAVIA_ATV3_4K")) {
                        c8 = 131;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 2019281702:
                    if (str2.equals("DM-01K")) {
                        c8 = 132;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 2029784656:
                    if (str2.equals("HWBLN-H")) {
                        c8 = 133;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 2030379515:
                    if (str2.equals("HWCAM-H")) {
                        c8 = 134;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 2033393791:
                    if (str2.equals("ASUS_X00AD_2")) {
                        c8 = 135;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 2047190025:
                    if (str2.equals("ELUGA_Note")) {
                        c8 = 136;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 2047252157:
                    if (str2.equals("ELUGA_Prim")) {
                        c8 = 137;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 2048319463:
                    if (str2.equals("HWVNS-H")) {
                        c8 = 138;
                        break;
                    }
                    c8 = 65535;
                    break;
                case 2048855701:
                    if (str2.equals("HWWAS-H")) {
                        c8 = 139;
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
                    String str3 = m0.f19755d;
                    str3.hashCode();
                    switch (str3.hashCode()) {
                        case -594534941:
                            if (str3.equals("JSN-L21")) {
                                c9 = 0;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2006354:
                            if (str3.equals("AFTA")) {
                                c9 = 1;
                                break;
                            }
                            c9 = 65535;
                            break;
                        case 2006367:
                            break;
                        default:
                            c9 = 65535;
                            break;
                    }
                    switch (c9) {
                    }
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case w0.f2149o /* 7 */:
                case w0.f2150p /* 8 */:
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
                    return true;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007b, code lost:
    
        if (r3.equals("video/av01") == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int B1(i1.n nVar, s1 s1Var) {
        int i7;
        int intValue;
        int i8 = s1Var.f20961v;
        int i9 = s1Var.f20962w;
        if (i8 == -1 || i9 == -1) {
            return -1;
        }
        String str = s1Var.f20956q;
        char c7 = 1;
        if ("video/dolby-vision".equals(str)) {
            Pair<Integer, Integer> q7 = i1.v.q(s1Var);
            str = (q7 == null || !((intValue = ((Integer) q7.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.hashCode();
        int i10 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case -1662735862:
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c7 = 5;
                    break;
                }
                c7 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c7 = 6;
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
            case 3:
            case 5:
                i7 = i8 * i9;
                i10 = 2;
                break;
            case 2:
            case 6:
                i7 = i8 * i9;
                break;
            case 4:
                String str2 = m0.f19755d;
                if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(m0.f19754c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !nVar.f16955g)))) {
                    i7 = m0.l(i8, 16) * m0.l(i9, 16) * 16 * 16;
                    i10 = 2;
                    break;
                }
                break;
        }
        return -1;
    }

    private static Point C1(i1.n nVar, s1 s1Var) {
        int i7 = s1Var.f20962w;
        int i8 = s1Var.f20961v;
        boolean z6 = i7 > i8;
        int i9 = z6 ? i7 : i8;
        if (z6) {
            i7 = i8;
        }
        float f7 = i7 / i9;
        for (int i10 : f20010u1) {
            int i11 = (int) (i10 * f7);
            if (i10 <= i9 || i11 <= i7) {
                break;
            }
            if (m0.f19752a >= 21) {
                int i12 = z6 ? i11 : i10;
                if (!z6) {
                    i10 = i11;
                }
                Point b7 = nVar.b(i12, i10);
                if (nVar.u(b7.x, b7.y, s1Var.f20963x)) {
                    return b7;
                }
            } else {
                try {
                    int l7 = m0.l(i10, 16) * 16;
                    int l8 = m0.l(i11, 16) * 16;
                    if (l7 * l8 <= i1.v.N()) {
                        int i13 = z6 ? l8 : l7;
                        if (!z6) {
                            l7 = l8;
                        }
                        return new Point(i13, l7);
                    }
                } catch (v.c unused) {
                }
            }
        }
        return null;
    }

    private static List<i1.n> E1(i1.q qVar, s1 s1Var, boolean z6, boolean z7) {
        String str = s1Var.f20956q;
        if (str == null) {
            return m4.q.x();
        }
        List<i1.n> a7 = qVar.a(str, z6, z7);
        String m7 = i1.v.m(s1Var);
        if (m7 == null) {
            return m4.q.t(a7);
        }
        return m4.q.r().g(a7).g(qVar.a(m7, z6, z7)).h();
    }

    protected static int F1(i1.n nVar, s1 s1Var) {
        if (s1Var.f20957r == -1) {
            return B1(nVar, s1Var);
        }
        int size = s1Var.f20958s.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += s1Var.f20958s.get(i8).length;
        }
        return s1Var.f20957r + i7;
    }

    private static boolean H1(long j7) {
        return j7 < -30000;
    }

    private static boolean I1(long j7) {
        return j7 < -500000;
    }

    private void K1() {
        if (this.f20017e1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.N0.n(this.f20017e1, elapsedRealtime - this.f20016d1);
            this.f20017e1 = 0;
            this.f20016d1 = elapsedRealtime;
        }
    }

    private void M1() {
        int i7 = this.f20023k1;
        if (i7 != 0) {
            this.N0.B(this.f20022j1, i7);
            this.f20022j1 = 0L;
            this.f20023k1 = 0;
        }
    }

    private void N1() {
        int i7 = this.f20024l1;
        if (i7 == -1 && this.f20025m1 == -1) {
            return;
        }
        z zVar = this.f20028p1;
        if (zVar != null && zVar.f20106f == i7 && zVar.f20107g == this.f20025m1 && zVar.f20108h == this.f20026n1 && zVar.f20109i == this.f20027o1) {
            return;
        }
        z zVar2 = new z(this.f20024l1, this.f20025m1, this.f20026n1, this.f20027o1);
        this.f20028p1 = zVar2;
        this.N0.D(zVar2);
    }

    private void O1() {
        if (this.W0) {
            this.N0.A(this.U0);
        }
    }

    private void P1() {
        z zVar = this.f20028p1;
        if (zVar != null) {
            this.N0.D(zVar);
        }
    }

    private void Q1(long j7, long j8, s1 s1Var) {
        j jVar = this.f20032t1;
        if (jVar != null) {
            jVar.d(j7, j8, s1Var, w0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S1() {
        g1();
    }

    private void T1() {
        Surface surface = this.U0;
        i iVar = this.V0;
        if (surface == iVar) {
            this.U0 = null;
        }
        iVar.release();
        this.V0 = null;
    }

    private static void W1(i1.l lVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        lVar.l(bundle);
    }

    private void X1() {
        this.f20015c1 = this.O0 > 0 ? SystemClock.elapsedRealtime() + this.O0 : -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [i1.o, p2.h, r0.f] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.Surface] */
    private void Y1(Object obj) {
        i iVar = obj instanceof Surface ? (Surface) obj : null;
        if (iVar == null) {
            i iVar2 = this.V0;
            if (iVar2 != null) {
                iVar = iVar2;
            } else {
                i1.n t02 = t0();
                if (t02 != null && d2(t02)) {
                    iVar = i.g(this.L0, t02.f16955g);
                    this.V0 = iVar;
                }
            }
        }
        if (this.U0 == iVar) {
            if (iVar == null || iVar == this.V0) {
                return;
            }
            P1();
            O1();
            return;
        }
        this.U0 = iVar;
        this.M0.m(iVar);
        this.W0 = false;
        int state = getState();
        i1.l s02 = s0();
        if (s02 != null) {
            if (m0.f19752a < 23 || iVar == null || this.S0) {
                Z0();
                K0();
            } else {
                Z1(s02, iVar);
            }
        }
        if (iVar == null || iVar == this.V0) {
            v1();
            u1();
            return;
        }
        P1();
        u1();
        if (state == 2) {
            X1();
        }
    }

    private boolean d2(i1.n nVar) {
        return m0.f19752a >= 23 && !this.f20029q1 && !w1(nVar.f16949a) && (!nVar.f16955g || i.c(this.L0));
    }

    private void u1() {
        i1.l s02;
        this.Y0 = false;
        if (m0.f19752a < 23 || !this.f20029q1 || (s02 = s0()) == null) {
            return;
        }
        this.f20031s1 = new b(s02);
    }

    private void v1() {
        this.f20028p1 = null;
    }

    private static void x1(MediaFormat mediaFormat, int i7) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i7);
    }

    private static boolean y1() {
        return "NVIDIA".equals(m0.f19754c);
    }

    @Override // i1.o, r0.f, r0.e3
    public void A(float f7, float f8) {
        super.A(f7, f8);
        this.M0.i(f7);
    }

    @Override // i1.o
    @TargetApi(29)
    protected void C0(u0.g gVar) {
        if (this.T0) {
            ByteBuffer byteBuffer = (ByteBuffer) o2.a.e(gVar.f22414k);
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
                    W1(s0(), bArr);
                }
            }
        }
    }

    protected a D1(i1.n nVar, s1 s1Var, s1[] s1VarArr) {
        int B1;
        int i7 = s1Var.f20961v;
        int i8 = s1Var.f20962w;
        int F1 = F1(nVar, s1Var);
        if (s1VarArr.length == 1) {
            if (F1 != -1 && (B1 = B1(nVar, s1Var)) != -1) {
                F1 = Math.min((int) (F1 * 1.5f), B1);
            }
            return new a(i7, i8, F1);
        }
        int length = s1VarArr.length;
        boolean z6 = false;
        for (int i9 = 0; i9 < length; i9++) {
            s1 s1Var2 = s1VarArr[i9];
            if (s1Var.C != null && s1Var2.C == null) {
                s1Var2 = s1Var2.b().J(s1Var.C).E();
            }
            if (nVar.e(s1Var, s1Var2).f22424d != 0) {
                int i10 = s1Var2.f20961v;
                z6 |= i10 == -1 || s1Var2.f20962w == -1;
                i7 = Math.max(i7, i10);
                i8 = Math.max(i8, s1Var2.f20962w);
                F1 = Math.max(F1, F1(nVar, s1Var2));
            }
        }
        if (z6) {
            o2.r.i("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i7 + "x" + i8);
            Point C1 = C1(nVar, s1Var);
            if (C1 != null) {
                i7 = Math.max(i7, C1.x);
                i8 = Math.max(i8, C1.y);
                F1 = Math.max(F1, B1(nVar, s1Var.b().j0(i7).Q(i8).E()));
                o2.r.i("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i7 + "x" + i8);
            }
        }
        return new a(i7, i8, F1);
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    protected MediaFormat G1(s1 s1Var, String str, a aVar, float f7, boolean z6, int i7) {
        Pair<Integer, Integer> q7;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", s1Var.f20961v);
        mediaFormat.setInteger("height", s1Var.f20962w);
        o2.u.e(mediaFormat, s1Var.f20958s);
        o2.u.c(mediaFormat, "frame-rate", s1Var.f20963x);
        o2.u.d(mediaFormat, "rotation-degrees", s1Var.f20964y);
        o2.u.b(mediaFormat, s1Var.C);
        if ("video/dolby-vision".equals(s1Var.f20956q) && (q7 = i1.v.q(s1Var)) != null) {
            o2.u.d(mediaFormat, "profile", ((Integer) q7.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f20033a);
        mediaFormat.setInteger("max-height", aVar.f20034b);
        o2.u.d(mediaFormat, "max-input-size", aVar.f20035c);
        if (m0.f19752a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f7 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f7);
            }
        }
        if (z6) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i7 != 0) {
            x1(mediaFormat, i7);
        }
        return mediaFormat;
    }

    protected boolean J1(long j7, boolean z6) {
        int T = T(j7);
        if (T == 0) {
            return false;
        }
        if (z6) {
            u0.e eVar = this.G0;
            eVar.f22401d += T;
            eVar.f22403f += this.f20019g1;
        } else {
            this.G0.f22407j++;
            f2(T, this.f20019g1);
        }
        p0();
        return true;
    }

    @Override // i1.o, r0.f
    protected void K() {
        v1();
        u1();
        this.W0 = false;
        this.f20031s1 = null;
        try {
            super.K();
        } finally {
            this.N0.m(this.G0);
        }
    }

    @Override // i1.o, r0.f
    protected void L(boolean z6, boolean z7) {
        super.L(z6, z7);
        boolean z8 = E().f20677a;
        o2.a.f((z8 && this.f20030r1 == 0) ? false : true);
        if (this.f20029q1 != z8) {
            this.f20029q1 = z8;
            Z0();
        }
        this.N0.o(this.G0);
        this.Z0 = z7;
        this.f20013a1 = false;
    }

    void L1() {
        this.f20013a1 = true;
        if (this.Y0) {
            return;
        }
        this.Y0 = true;
        this.N0.A(this.U0);
        this.W0 = true;
    }

    @Override // i1.o, r0.f
    protected void M(long j7, boolean z6) {
        super.M(j7, z6);
        u1();
        this.M0.j();
        this.f20020h1 = -9223372036854775807L;
        this.f20014b1 = -9223372036854775807L;
        this.f20018f1 = 0;
        if (z6) {
            X1();
        } else {
            this.f20015c1 = -9223372036854775807L;
        }
    }

    @Override // i1.o
    protected void M0(Exception exc) {
        o2.r.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.N0.C(exc);
    }

    @Override // i1.o, r0.f
    @TargetApi(17)
    protected void N() {
        try {
            super.N();
        } finally {
            if (this.V0 != null) {
                T1();
            }
        }
    }

    @Override // i1.o
    protected void N0(String str, l.a aVar, long j7, long j8) {
        this.N0.k(str, j7, j8);
        this.S0 = w1(str);
        this.T0 = ((i1.n) o2.a.e(t0())).n();
        if (m0.f19752a < 23 || !this.f20029q1) {
            return;
        }
        this.f20031s1 = new b((i1.l) o2.a.e(s0()));
    }

    @Override // i1.o, r0.f
    protected void O() {
        super.O();
        this.f20017e1 = 0;
        this.f20016d1 = SystemClock.elapsedRealtime();
        this.f20021i1 = SystemClock.elapsedRealtime() * 1000;
        this.f20022j1 = 0L;
        this.f20023k1 = 0;
        this.M0.k();
    }

    @Override // i1.o
    protected void O0(String str) {
        this.N0.l(str);
    }

    @Override // i1.o, r0.f
    protected void P() {
        this.f20015c1 = -9223372036854775807L;
        K1();
        M1();
        this.M0.l();
        super.P();
    }

    @Override // i1.o
    protected u0.i P0(t1 t1Var) {
        u0.i P0 = super.P0(t1Var);
        this.N0.p(t1Var.f21040b, P0);
        return P0;
    }

    @Override // i1.o
    protected void Q0(s1 s1Var, MediaFormat mediaFormat) {
        i1.l s02 = s0();
        if (s02 != null) {
            s02.e(this.X0);
        }
        if (this.f20029q1) {
            this.f20024l1 = s1Var.f20961v;
            this.f20025m1 = s1Var.f20962w;
        } else {
            o2.a.e(mediaFormat);
            boolean z6 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.f20024l1 = z6 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.f20025m1 = z6 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f7 = s1Var.f20965z;
        this.f20027o1 = f7;
        if (m0.f19752a >= 21) {
            int i7 = s1Var.f20964y;
            if (i7 == 90 || i7 == 270) {
                int i8 = this.f20024l1;
                this.f20024l1 = this.f20025m1;
                this.f20025m1 = i8;
                this.f20027o1 = 1.0f / f7;
            }
        } else {
            this.f20026n1 = s1Var.f20964y;
        }
        this.M0.g(s1Var.f20963x);
    }

    @Override // i1.o
    protected void R0(long j7) {
        super.R0(j7);
        if (this.f20029q1) {
            return;
        }
        this.f20019g1--;
    }

    protected void R1(long j7) {
        r1(j7);
        N1();
        this.G0.f22402e++;
        L1();
        R0(j7);
    }

    @Override // i1.o
    protected void S0() {
        super.S0();
        u1();
    }

    @Override // i1.o
    protected void T0(u0.g gVar) {
        boolean z6 = this.f20029q1;
        if (!z6) {
            this.f20019g1++;
        }
        if (m0.f19752a >= 23 || !z6) {
            return;
        }
        R1(gVar.f22413j);
    }

    protected void U1(i1.l lVar, int i7, long j7) {
        N1();
        j0.a("releaseOutputBuffer");
        lVar.d(i7, true);
        j0.c();
        this.f20021i1 = SystemClock.elapsedRealtime() * 1000;
        this.G0.f22402e++;
        this.f20018f1 = 0;
        L1();
    }

    @Override // i1.o
    protected boolean V0(long j7, long j8, i1.l lVar, ByteBuffer byteBuffer, int i7, int i8, int i9, long j9, boolean z6, boolean z7, s1 s1Var) {
        long j10;
        boolean z8;
        h hVar;
        i1.l lVar2;
        int i10;
        long j11;
        long j12;
        o2.a.e(lVar);
        if (this.f20014b1 == -9223372036854775807L) {
            this.f20014b1 = j7;
        }
        if (j9 != this.f20020h1) {
            this.M0.h(j9);
            this.f20020h1 = j9;
        }
        long A0 = A0();
        long j13 = j9 - A0;
        if (z6 && !z7) {
            e2(lVar, i7, j13);
            return true;
        }
        double B0 = B0();
        boolean z9 = getState() == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        double d7 = j9 - j7;
        Double.isNaN(d7);
        Double.isNaN(B0);
        long j14 = (long) (d7 / B0);
        if (z9) {
            j14 -= elapsedRealtime - j8;
        }
        if (this.U0 == this.V0) {
            if (!H1(j14)) {
                return false;
            }
            e2(lVar, i7, j13);
            g2(j14);
            return true;
        }
        long j15 = elapsedRealtime - this.f20021i1;
        if (this.f20013a1 ? this.Y0 : !(z9 || this.Z0)) {
            j10 = j15;
            z8 = false;
        } else {
            j10 = j15;
            z8 = true;
        }
        if (!(this.f20015c1 == -9223372036854775807L && j7 >= A0 && (z8 || (z9 && c2(j14, j10))))) {
            if (z9 && j7 != this.f20014b1) {
                long nanoTime = System.nanoTime();
                long b7 = this.M0.b((j14 * 1000) + nanoTime);
                long j16 = (b7 - nanoTime) / 1000;
                boolean z10 = this.f20015c1 != -9223372036854775807L;
                if (a2(j16, j8, z7) && J1(j7, z10)) {
                    return false;
                }
                if (b2(j16, j8, z7)) {
                    if (z10) {
                        e2(lVar, i7, j13);
                    } else {
                        z1(lVar, i7, j13);
                    }
                    j14 = j16;
                } else {
                    j14 = j16;
                    if (m0.f19752a >= 21) {
                        if (j14 < 50000) {
                            hVar = this;
                            hVar.Q1(j13, b7, s1Var);
                            lVar2 = lVar;
                            i10 = i7;
                            j11 = j13;
                            j12 = b7;
                            hVar.V1(lVar2, i10, j11, j12);
                        }
                    } else if (j14 < 30000) {
                        if (j14 > 11000) {
                            try {
                                Thread.sleep((j14 - 10000) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        Q1(j13, b7, s1Var);
                        U1(lVar, i7, j13);
                    }
                }
            }
            return false;
        }
        long nanoTime2 = System.nanoTime();
        Q1(j13, nanoTime2, s1Var);
        if (m0.f19752a >= 21) {
            hVar = this;
            lVar2 = lVar;
            i10 = i7;
            j11 = j13;
            j12 = nanoTime2;
            hVar.V1(lVar2, i10, j11, j12);
        }
        U1(lVar, i7, j13);
        g2(j14);
        return true;
    }

    protected void V1(i1.l lVar, int i7, long j7, long j8) {
        N1();
        j0.a("releaseOutputBuffer");
        lVar.n(i7, j8);
        j0.c();
        this.f20021i1 = SystemClock.elapsedRealtime() * 1000;
        this.G0.f22402e++;
        this.f20018f1 = 0;
        L1();
    }

    @Override // i1.o
    protected u0.i W(i1.n nVar, s1 s1Var, s1 s1Var2) {
        u0.i e7 = nVar.e(s1Var, s1Var2);
        int i7 = e7.f22425e;
        int i8 = s1Var2.f20961v;
        a aVar = this.R0;
        if (i8 > aVar.f20033a || s1Var2.f20962w > aVar.f20034b) {
            i7 |= 256;
        }
        if (F1(nVar, s1Var2) > this.R0.f20035c) {
            i7 |= 64;
        }
        int i9 = i7;
        return new u0.i(nVar.f16949a, s1Var, s1Var2, i9 != 0 ? 0 : e7.f22424d, i9);
    }

    protected void Z1(i1.l lVar, Surface surface) {
        lVar.j(surface);
    }

    protected boolean a2(long j7, long j8, boolean z6) {
        return I1(j7) && !z6;
    }

    @Override // i1.o
    protected void b1() {
        super.b1();
        this.f20019g1 = 0;
    }

    protected boolean b2(long j7, long j8, boolean z6) {
        return H1(j7) && !z6;
    }

    protected boolean c2(long j7, long j8) {
        return H1(j7) && j8 > 100000;
    }

    protected void e2(i1.l lVar, int i7, long j7) {
        j0.a("skipVideoBuffer");
        lVar.d(i7, false);
        j0.c();
        this.G0.f22403f++;
    }

    protected void f2(int i7, int i8) {
        u0.e eVar = this.G0;
        eVar.f22405h += i7;
        int i9 = i7 + i8;
        eVar.f22404g += i9;
        this.f20017e1 += i9;
        int i10 = this.f20018f1 + i9;
        this.f20018f1 = i10;
        eVar.f22406i = Math.max(i10, eVar.f22406i);
        int i11 = this.P0;
        if (i11 <= 0 || this.f20017e1 < i11) {
            return;
        }
        K1();
    }

    @Override // i1.o
    protected i1.m g0(Throwable th, i1.n nVar) {
        return new g(th, nVar, this.U0);
    }

    protected void g2(long j7) {
        this.G0.a(j7);
        this.f20022j1 += j7;
        this.f20023k1++;
    }

    @Override // r0.e3, r0.g3
    public String h() {
        return "MediaCodecVideoRenderer";
    }

    @Override // i1.o, r0.e3
    public boolean i() {
        i iVar;
        if (super.i() && (this.Y0 || (((iVar = this.V0) != null && this.U0 == iVar) || s0() == null || this.f20029q1))) {
            this.f20015c1 = -9223372036854775807L;
            return true;
        }
        if (this.f20015c1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f20015c1) {
            return true;
        }
        this.f20015c1 = -9223372036854775807L;
        return false;
    }

    @Override // i1.o
    protected boolean k1(i1.n nVar) {
        return this.U0 != null || d2(nVar);
    }

    @Override // i1.o
    protected int n1(i1.q qVar, s1 s1Var) {
        boolean z6;
        int i7 = 0;
        if (!o2.v.s(s1Var.f20956q)) {
            return f3.a(0);
        }
        boolean z7 = s1Var.f20959t != null;
        List<i1.n> E1 = E1(qVar, s1Var, z7, false);
        if (z7 && E1.isEmpty()) {
            E1 = E1(qVar, s1Var, false, false);
        }
        if (E1.isEmpty()) {
            return f3.a(1);
        }
        if (!i1.o.o1(s1Var)) {
            return f3.a(2);
        }
        i1.n nVar = E1.get(0);
        boolean m7 = nVar.m(s1Var);
        if (!m7) {
            for (int i8 = 1; i8 < E1.size(); i8++) {
                i1.n nVar2 = E1.get(i8);
                if (nVar2.m(s1Var)) {
                    nVar = nVar2;
                    z6 = false;
                    m7 = true;
                    break;
                }
            }
        }
        z6 = true;
        int i9 = m7 ? 4 : 3;
        int i10 = nVar.p(s1Var) ? 16 : 8;
        int i11 = nVar.f16956h ? 64 : 0;
        int i12 = z6 ? 128 : 0;
        if (m7) {
            List<i1.n> E12 = E1(qVar, s1Var, z7, true);
            if (!E12.isEmpty()) {
                i1.n nVar3 = i1.v.u(E12, s1Var).get(0);
                if (nVar3.m(s1Var) && nVar3.p(s1Var)) {
                    i7 = 32;
                }
            }
        }
        return f3.c(i9, i10, i7, i11, i12);
    }

    @Override // r0.f, r0.z2.b
    public void p(int i7, Object obj) {
        if (i7 == 1) {
            Y1(obj);
            return;
        }
        if (i7 == 7) {
            this.f20032t1 = (j) obj;
            return;
        }
        if (i7 == 10) {
            int intValue = ((Integer) obj).intValue();
            if (this.f20030r1 != intValue) {
                this.f20030r1 = intValue;
                if (this.f20029q1) {
                    Z0();
                    return;
                }
                return;
            }
            return;
        }
        if (i7 != 4) {
            if (i7 != 5) {
                super.p(i7, obj);
                return;
            } else {
                this.M0.o(((Integer) obj).intValue());
                return;
            }
        }
        this.X0 = ((Integer) obj).intValue();
        i1.l s02 = s0();
        if (s02 != null) {
            s02.e(this.X0);
        }
    }

    @Override // i1.o
    protected boolean u0() {
        return this.f20029q1 && m0.f19752a < 23;
    }

    @Override // i1.o
    protected float v0(float f7, s1 s1Var, s1[] s1VarArr) {
        float f8 = -1.0f;
        for (s1 s1Var2 : s1VarArr) {
            float f9 = s1Var2.f20963x;
            if (f9 != -1.0f) {
                f8 = Math.max(f8, f9);
            }
        }
        if (f8 == -1.0f) {
            return -1.0f;
        }
        return f8 * f7;
    }

    protected boolean w1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (h.class) {
            if (!f20011v1) {
                f20012w1 = A1();
                f20011v1 = true;
            }
        }
        return f20012w1;
    }

    @Override // i1.o
    protected List<i1.n> x0(i1.q qVar, s1 s1Var, boolean z6) {
        return i1.v.u(E1(qVar, s1Var, z6, this.f20029q1), s1Var);
    }

    @Override // i1.o
    @TargetApi(17)
    protected l.a z0(i1.n nVar, s1 s1Var, MediaCrypto mediaCrypto, float f7) {
        i iVar = this.V0;
        if (iVar != null && iVar.f20040f != nVar.f16955g) {
            T1();
        }
        String str = nVar.f16951c;
        a D1 = D1(nVar, s1Var, I());
        this.R0 = D1;
        MediaFormat G1 = G1(s1Var, str, D1, f7, this.Q0, this.f20029q1 ? this.f20030r1 : 0);
        if (this.U0 == null) {
            if (!d2(nVar)) {
                throw new IllegalStateException();
            }
            if (this.V0 == null) {
                this.V0 = i.g(this.L0, nVar.f16955g);
            }
            this.U0 = this.V0;
        }
        return l.a.b(nVar, G1, s1Var, this.U0, mediaCrypto);
    }

    protected void z1(i1.l lVar, int i7, long j7) {
        j0.a("dropVideoBuffer");
        lVar.d(i7, false);
        j0.c();
        f2(0, 1);
    }
}
