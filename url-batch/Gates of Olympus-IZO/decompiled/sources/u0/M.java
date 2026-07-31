package u0;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f.AbstractC0382a;
import h1.C0438i;
import k2.AbstractC0552y;

/* loaded from: classes.dex */
public final class M extends Z1.j implements Y1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8212e;

    /* renamed from: f, reason: collision with root package name */
    public static final M f8192f = new M(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final M f8193g = new M(0, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final M f8194h = new M(0, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final M f8195i = new M(0, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final M f8196j = new M(0, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final M f8197k = new M(0, 5);

    /* renamed from: l, reason: collision with root package name */
    public static final M f8198l = new M(0, 6);

    /* renamed from: m, reason: collision with root package name */
    public static final M f8199m = new M(0, 7);

    /* renamed from: n, reason: collision with root package name */
    public static final M f8200n = new M(0, 8);

    /* renamed from: o, reason: collision with root package name */
    public static final M f8201o = new M(0, 9);
    public static final M p = new M(0, 10);

    /* renamed from: q, reason: collision with root package name */
    public static final M f8202q = new M(0, 11);

    /* renamed from: r, reason: collision with root package name */
    public static final M f8203r = new M(0, 12);

    /* renamed from: s, reason: collision with root package name */
    public static final M f8204s = new M(0, 13);

    /* renamed from: t, reason: collision with root package name */
    public static final M f8205t = new M(0, 14);

    /* renamed from: u, reason: collision with root package name */
    public static final M f8206u = new M(0, 15);

    /* renamed from: v, reason: collision with root package name */
    public static final M f8207v = new M(0, 16);

    /* renamed from: w, reason: collision with root package name */
    public static final M f8208w = new M(0, 17);

    /* renamed from: x, reason: collision with root package name */
    public static final M f8209x = new M(0, 18);

    /* renamed from: y, reason: collision with root package name */
    public static final M f8210y = new M(0, 19);

    /* renamed from: z, reason: collision with root package name */
    public static final M f8211z = new M(0, 20);

    /* renamed from: A, reason: collision with root package name */
    public static final M f8188A = new M(0, 21);
    public static final M B = new M(0, 22);
    public static final M C = new M(0, 23);
    public static final M D = new M(0, 24);

    /* renamed from: E, reason: collision with root package name */
    public static final M f8189E = new M(0, 25);

    /* renamed from: F, reason: collision with root package name */
    public static final M f8190F = new M(0, 26);

    /* renamed from: G, reason: collision with root package name */
    public static final M f8191G = new M(0, 27);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(int i3, int i4) {
        super(i3);
        this.f8212e = i4;
    }

    @Override // Y1.a
    public final Object b() {
        Choreographer choreographer;
        switch (this.f8212e) {
            case 0:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw null;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw null;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
                throw null;
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                AndroidCompositionLocals_androidKt.b("LocalSavedStateRegistryOwner");
                throw null;
            case 5:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw null;
            case 6:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    r2.e eVar = k2.E.f5312a;
                    choreographer = (Choreographer) AbstractC0552y.t(p2.n.f6799a, new P(2, null));
                }
                S s3 = new S(choreographer, M1.B.v(Looper.getMainLooper()));
                return I2.l.M(s3, s3.f8244o);
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                return null;
            case AbstractC0382a.f4777a /* 9 */:
                AbstractC0963b0.b("LocalAutofillTree");
                throw null;
            case AbstractC0382a.f4779c /* 10 */:
                AbstractC0963b0.b("LocalClipboardManager");
                throw null;
            case 11:
                AbstractC0963b0.b("LocalDensity");
                throw null;
            case 12:
                AbstractC0963b0.b("LocalFocusManager");
                throw null;
            case 13:
                AbstractC0963b0.b("LocalFontFamilyResolver");
                throw null;
            case 14:
                AbstractC0963b0.b("LocalFontLoader");
                throw null;
            case AbstractC0382a.f4781e /* 15 */:
                AbstractC0963b0.b("LocalGraphicsContext");
                throw null;
            case 16:
                AbstractC0963b0.b("LocalHapticFeedback");
                throw null;
            case 17:
                AbstractC0963b0.b("LocalInputManager");
                throw null;
            case 18:
                AbstractC0963b0.b("LocalLayoutDirection");
                throw null;
            case 19:
                return null;
            case 20:
                return Boolean.FALSE;
            case 21:
            case 22:
                return null;
            case 23:
                AbstractC0963b0.b("LocalTextToolbar");
                throw null;
            case 24:
                AbstractC0963b0.b("LocalUriHandler");
                throw null;
            case 25:
                AbstractC0963b0.b("LocalViewConfiguration");
                throw null;
            case 26:
                AbstractC0963b0.b("LocalWindowInfo");
                throw null;
            default:
                return Boolean.FALSE;
        }
    }
}
