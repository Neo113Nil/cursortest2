package s1;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.installreferrer.api.InstallReferrerClient;
import d0.p3;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k0 extends r6.l implements q6.a {
    public static final k0 A;
    public static final k0 B;
    public static final k0 C;
    public static final k0 D;
    public static final k0 E;
    public static final k0 F;
    public static final k0 G;
    public static final k0 H;
    public static final k0 I;
    public static final k0 J;

    /* renamed from: h, reason: collision with root package name */
    public static final k0 f8252h;

    /* renamed from: i, reason: collision with root package name */
    public static final k0 f8253i;

    /* renamed from: j, reason: collision with root package name */
    public static final k0 f8254j;

    /* renamed from: k, reason: collision with root package name */
    public static final k0 f8255k;

    /* renamed from: l, reason: collision with root package name */
    public static final k0 f8256l;

    /* renamed from: m, reason: collision with root package name */
    public static final k0 f8257m;

    /* renamed from: n, reason: collision with root package name */
    public static final k0 f8258n;

    /* renamed from: o, reason: collision with root package name */
    public static final k0 f8259o;

    /* renamed from: p, reason: collision with root package name */
    public static final k0 f8260p;

    /* renamed from: q, reason: collision with root package name */
    public static final k0 f8261q;

    /* renamed from: r, reason: collision with root package name */
    public static final k0 f8262r;

    /* renamed from: s, reason: collision with root package name */
    public static final k0 f8263s;

    /* renamed from: t, reason: collision with root package name */
    public static final k0 f8264t;

    /* renamed from: u, reason: collision with root package name */
    public static final k0 f8265u;

    /* renamed from: v, reason: collision with root package name */
    public static final k0 f8266v;

    /* renamed from: w, reason: collision with root package name */
    public static final k0 f8267w;

    /* renamed from: x, reason: collision with root package name */
    public static final k0 f8268x;

    /* renamed from: y, reason: collision with root package name */
    public static final k0 f8269y;

    /* renamed from: z, reason: collision with root package name */
    public static final k0 f8270z;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8271g;

    static {
        int i7 = 0;
        f8252h = new k0(i7, 0);
        f8253i = new k0(i7, 1);
        f8254j = new k0(i7, 2);
        f8255k = new k0(i7, 3);
        f8256l = new k0(i7, 4);
        f8257m = new k0(i7, 5);
        f8258n = new k0(i7, 6);
        f8259o = new k0(i7, 7);
        f8260p = new k0(i7, 8);
        f8261q = new k0(i7, 9);
        f8262r = new k0(i7, 10);
        f8263s = new k0(i7, 11);
        f8264t = new k0(i7, 12);
        f8265u = new k0(i7, 13);
        f8266v = new k0(i7, 14);
        f8267w = new k0(i7, 15);
        f8268x = new k0(i7, 16);
        f8269y = new k0(i7, 17);
        f8270z = new k0(i7, 18);
        A = new k0(i7, 19);
        B = new k0(i7, 20);
        C = new k0(i7, 21);
        D = new k0(i7, 22);
        E = new k0(i7, 23);
        F = new k0(i7, 24);
        G = new k0(i7, 25);
        H = new k0(i7, 26);
        I = new k0(i7, 27);
        J = new k0(i7, 28);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(int i7, int i8) {
        super(i7);
        this.f8271g = i8;
    }

    @Override // q6.a
    public final Object a() {
        Choreographer choreographer;
        h6.d dVar = null;
        switch (this.f8271g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.b("LocalSavedStateRegistryOwner");
                throw null;
            case 5:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw null;
            case 6:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    j7.e eVar = c7.g0.f1696a;
                    choreographer = (Choreographer) c7.a0.s(h7.m.f4700a, new p3(2, dVar, 3));
                }
                t0 t0Var = new t0(choreographer, u3.z.f(Looper.getMainLooper()));
                return t6.a.I(t0Var, t0Var.f8431q);
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                return null;
            case q.c.f7259c /* 9 */:
                f1.b("LocalAutofillTree");
                throw null;
            case q.c.f7261e /* 10 */:
                f1.b("LocalClipboardManager");
                throw null;
            case 11:
                f1.b("LocalDensity");
                throw null;
            case 12:
                f1.b("LocalFocusManager");
                throw null;
            case 13:
                f1.b("LocalFontFamilyResolver");
                throw null;
            case 14:
                f1.b("LocalFontLoader");
                throw null;
            case q.c.f7263g /* 15 */:
                f1.b("LocalGraphicsContext");
                throw null;
            case 16:
                f1.b("LocalHapticFeedback");
                throw null;
            case 17:
                f1.b("LocalInputManager");
                throw null;
            case 18:
                f1.b("LocalLayoutDirection");
                throw null;
            case 19:
                return null;
            case 20:
                return Boolean.FALSE;
            case 21:
            case 22:
                return null;
            case 23:
                f1.b("LocalTextToolbar");
                throw null;
            case 24:
                f1.b("LocalUriHandler");
                throw null;
            case 25:
                f1.b("LocalViewConfiguration");
                throw null;
            case 26:
                f1.b("LocalWindowInfo");
                throw null;
            case 27:
                return Boolean.FALSE;
            default:
                return null;
        }
    }
}
