package d2;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.appsflyer.attribution.RequestError;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i0 extends wd.p implements Function0 {
    public static final i0 A;
    public static final i0 B;
    public static final i0 C;
    public static final i0 D;
    public static final i0 E;
    public static final i0 F;
    public static final i0 G;
    public static final i0 H;
    public static final i0 I;
    public static final i0 J;
    public static final i0 K;
    public static final i0 L;
    public static final i0 M;
    public static final i0 N;
    public static final i0 O;
    public static final i0 P;
    public static final i0 Q;
    public static final i0 R;

    /* renamed from: e, reason: collision with root package name */
    public static final i0 f3419e;

    /* renamed from: i, reason: collision with root package name */
    public static final i0 f3420i;

    /* renamed from: r, reason: collision with root package name */
    public static final i0 f3421r;

    /* renamed from: s, reason: collision with root package name */
    public static final i0 f3422s;

    /* renamed from: t, reason: collision with root package name */
    public static final i0 f3423t;

    /* renamed from: u, reason: collision with root package name */
    public static final i0 f3424u;

    /* renamed from: v, reason: collision with root package name */
    public static final i0 f3425v;

    /* renamed from: w, reason: collision with root package name */
    public static final i0 f3426w;

    /* renamed from: x, reason: collision with root package name */
    public static final i0 f3427x;

    /* renamed from: y, reason: collision with root package name */
    public static final i0 f3428y;

    /* renamed from: z, reason: collision with root package name */
    public static final i0 f3429z;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3430d;

    static {
        int i3 = 0;
        f3419e = new i0(i3, 0);
        f3420i = new i0(i3, 1);
        f3421r = new i0(i3, 2);
        f3422s = new i0(i3, 3);
        f3423t = new i0(i3, 4);
        f3424u = new i0(i3, 5);
        f3425v = new i0(i3, 6);
        f3426w = new i0(i3, 7);
        f3427x = new i0(i3, 8);
        f3428y = new i0(i3, 9);
        f3429z = new i0(i3, 10);
        A = new i0(i3, 11);
        B = new i0(i3, 12);
        C = new i0(i3, 13);
        D = new i0(i3, 14);
        E = new i0(i3, 15);
        F = new i0(i3, 16);
        G = new i0(i3, 17);
        H = new i0(i3, 18);
        I = new i0(i3, 19);
        J = new i0(i3, 20);
        K = new i0(i3, 21);
        L = new i0(i3, 22);
        M = new i0(i3, 23);
        N = new i0(i3, 24);
        O = new i0(i3, 25);
        P = new i0(i3, 26);
        Q = new i0(i3, 27);
        R = new i0(i3, 28);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i3, int i10) {
        super(i3);
        this.f3430d = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Choreographer choreographer;
        ld.a aVar = null;
        switch (this.f3430d) {
            case 0:
                AndroidCompositionLocals_androidKt.a("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.a("LocalContext");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.a("LocalImageVectorCache");
                throw null;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                AndroidCompositionLocals_androidKt.a("LocalResourceIdCache");
                throw null;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                AndroidCompositionLocals_androidKt.a("LocalView");
                throw null;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    ne.e eVar = ge.k0.f4372a;
                    choreographer = (Choreographer) ge.a0.w(le.o.f5995a, new j0(2, 0, aVar));
                }
                l0 l0Var = new l0(choreographer, a.a.l(Looper.getMainLooper()));
                return kotlin.coroutines.e.c(l0Var, l0Var.f3465z);
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return null;
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                d1.b("LocalAutofillManager");
                throw null;
            case 9:
                d1.b("LocalAutofillTree");
                throw null;
            case 10:
                d1.b("LocalClipboard");
                throw null;
            case RequestError.STOP_TRACKING /* 11 */:
                d1.b("LocalClipboardManager");
                throw null;
            case 12:
                return Boolean.TRUE;
            case 13:
                d1.b("LocalDensity");
                throw null;
            case 14:
                d1.b("LocalFocusManager");
                throw null;
            case 15:
                d1.b("LocalFontFamilyResolver");
                throw null;
            case 16:
                d1.b("LocalFontLoader");
                throw null;
            case 17:
                d1.b("LocalGraphicsContext");
                throw null;
            case 18:
                d1.b("LocalHapticFeedback");
                throw null;
            case 19:
                d1.b("LocalInputManager");
                throw null;
            case 20:
                d1.b("LocalLayoutDirection");
                throw null;
            case 21:
                return null;
            case 22:
                d1.b("LocalProvidableLocaleList");
                throw null;
            case 23:
                return Boolean.FALSE;
            case 24:
            case 25:
                return null;
            case 26:
                d1.b("LocalTextToolbar");
                throw null;
            case 27:
                d1.b("LocalUriHandler");
                throw null;
            default:
                d1.b("LocalViewConfiguration");
                throw null;
        }
    }
}
