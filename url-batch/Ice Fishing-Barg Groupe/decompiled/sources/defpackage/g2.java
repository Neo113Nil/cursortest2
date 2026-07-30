package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import java.util.UUID;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class g2 extends kv0 implements ae0 {
    public static final g2 BRwzKIf41E4i;
    public static final g2 BjEWd04qc7Mw;
    public static final g2 EcgxDIVH5in8;
    public static final g2 EpkonXwzFgDB;
    public static final g2 IAToe7bXGz4N;
    public static final g2 J54yh1s3n4Aq;
    public static final g2 QrzZRwfaDlRX;
    public static final g2 RfyTYNmI9Srp;
    public static final g2 S2OOm9zPNm0h;
    public static final g2 S9EYkSpbGuxq;
    public static final g2 VhhvGxCb8gfr;
    public static final g2 XL4ISE6Oc65B;
    public static final g2 ZbWwgt3aGe7A;
    public static final g2 aF05bpZJlKEP;
    public static final g2 cpQdD2nAriOS;
    public static final g2 dgRBjINgWbAK;
    public static final g2 e6tOsSdd2EFb;
    public static final g2 gPXPFXrUH4XX;
    public static final g2 jyegZNwi31qc;
    public static final g2 kpCQ9veP6n3I;
    public static final g2 nLZGh9p8gVSu;
    public static final g2 ozEBbv0hFTAB;
    public static final g2 pnx5pC0XzaCw;
    public static final g2 r3s1LDPKFs1S;
    public static final g2 rZjpSjn4zoMv;
    public static final g2 ryVscX7ZL4Ux;
    public static final g2 tmVwIGCQF4zR;
    public static final g2 wdg6QnbFHrFF;
    public static final g2 x50lh2ztY7Y5;
    public static final g2 xfACYKDMU6Dj;
    public final /* synthetic */ int OPXfSBeufaJ8;

    static {
        int i = 0;
        wdg6QnbFHrFF = new g2(i, 0);
        dgRBjINgWbAK = new g2(i, 1);
        x50lh2ztY7Y5 = new g2(i, 2);
        cpQdD2nAriOS = new g2(i, 3);
        r3s1LDPKFs1S = new g2(i, 4);
        QrzZRwfaDlRX = new g2(i, 5);
        gPXPFXrUH4XX = new g2(i, 6);
        BRwzKIf41E4i = new g2(i, 7);
        XL4ISE6Oc65B = new g2(i, 8);
        RfyTYNmI9Srp = new g2(i, 9);
        EcgxDIVH5in8 = new g2(i, 10);
        S9EYkSpbGuxq = new g2(i, 11);
        VhhvGxCb8gfr = new g2(i, 12);
        S2OOm9zPNm0h = new g2(i, 13);
        ZbWwgt3aGe7A = new g2(i, 14);
        pnx5pC0XzaCw = new g2(i, 15);
        IAToe7bXGz4N = new g2(i, 16);
        e6tOsSdd2EFb = new g2(i, 17);
        jyegZNwi31qc = new g2(i, 18);
        aF05bpZJlKEP = new g2(i, 19);
        kpCQ9veP6n3I = new g2(i, 20);
        rZjpSjn4zoMv = new g2(i, 21);
        BjEWd04qc7Mw = new g2(i, 22);
        ozEBbv0hFTAB = new g2(i, 23);
        tmVwIGCQF4zR = new g2(i, 24);
        J54yh1s3n4Aq = new g2(i, 25);
        EpkonXwzFgDB = new g2(i, 26);
        xfACYKDMU6Dj = new g2(i, 27);
        nLZGh9p8gVSu = new g2(i, 28);
        ryVscX7ZL4Ux = new g2(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(int i, int i2) {
        super(i);
        this.OPXfSBeufaJ8 = i2;
    }

    @Override // defpackage.ae0
    public final Object PxuCJdSBwIXG() {
        Choreographer choreographer;
        int i = 2;
        bt btVar = null;
        switch (this.OPXfSBeufaJ8) {
            case 0:
                h2.PxuCJdSBwIXG("LocalConfiguration");
                throw null;
            case 1:
                h2.PxuCJdSBwIXG("LocalContext");
                throw null;
            case 2:
                h2.PxuCJdSBwIXG("LocalImageVectorCache");
                throw null;
            case 3:
                h2.PxuCJdSBwIXG("LocalResourceIdCache");
                throw null;
            case 4:
                h2.PxuCJdSBwIXG("LocalView");
                throw null;
            case 5:
                return UUID.randomUUID();
            case 6:
                return Boolean.FALSE;
            case 7:
                return "DEFAULT_TEST_TAG";
            case 8:
                return UUID.randomUUID();
            case 9:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    yw ywVar = j00.PxuCJdSBwIXG;
                    choreographer = (Choreographer) fx1.uURZJOrwXbxn(h41.PxuCJdSBwIXG, new r6(i, btVar, 0));
                }
                v6 v6Var = new v6(choreographer, ni0.r3s1LDPKFs1S(Looper.getMainLooper()));
                return f2.xfACYKDMU6Dj(v6Var, v6Var.RfyTYNmI9Srp);
            case 10:
                return new vw0(2);
            case 11:
            case 12:
                return null;
            case 13:
                eq.lS5Rgt96tfkO("LocalAutofillManager");
                throw null;
            case 14:
                eq.lS5Rgt96tfkO("LocalAutofillTree");
                throw null;
            case 15:
                eq.lS5Rgt96tfkO("LocalClipboard");
                throw null;
            case 16:
                eq.lS5Rgt96tfkO("LocalClipboardManager");
                throw null;
            case 17:
                return Boolean.TRUE;
            case 18:
                eq.lS5Rgt96tfkO("LocalDensity");
                throw null;
            case 19:
                eq.lS5Rgt96tfkO("LocalFocusManager");
                throw null;
            case 20:
                eq.lS5Rgt96tfkO("LocalFontFamilyResolver");
                throw null;
            case 21:
                eq.lS5Rgt96tfkO("LocalFontLoader");
                throw null;
            case 22:
                eq.lS5Rgt96tfkO("LocalGraphicsContext");
                throw null;
            case 23:
                eq.lS5Rgt96tfkO("LocalHapticFeedback");
                throw null;
            case 24:
                eq.lS5Rgt96tfkO("LocalInputManager");
                throw null;
            case 25:
                eq.lS5Rgt96tfkO("LocalLayoutDirection");
                throw null;
            case 26:
                return null;
            case 27:
                eq.lS5Rgt96tfkO("LocalProvidableLocaleList");
                throw null;
            case 28:
                return Boolean.FALSE;
            default:
                return null;
        }
    }
}
