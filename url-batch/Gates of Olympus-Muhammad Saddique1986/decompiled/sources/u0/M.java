package u0;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e2.InterfaceC0422a;
import h2.AbstractC0508a;
import q2.AbstractC0837y;
import r.AbstractC0856c;

/* loaded from: classes.dex */
public final class M extends f2.k implements InterfaceC0422a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9234e;

    /* renamed from: f, reason: collision with root package name */
    public static final M f9213f = new M(0, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final M f9214g = new M(0, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final M f9215h = new M(0, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final M f9216i = new M(0, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final M f9217j = new M(0, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final M f9218k = new M(0, 5);

    /* renamed from: l, reason: collision with root package name */
    public static final M f9219l = new M(0, 6);

    /* renamed from: m, reason: collision with root package name */
    public static final M f9220m = new M(0, 7);

    /* renamed from: n, reason: collision with root package name */
    public static final M f9221n = new M(0, 8);

    /* renamed from: o, reason: collision with root package name */
    public static final M f9222o = new M(0, 9);

    /* renamed from: p, reason: collision with root package name */
    public static final M f9223p = new M(0, 10);

    /* renamed from: q, reason: collision with root package name */
    public static final M f9224q = new M(0, 11);

    /* renamed from: r, reason: collision with root package name */
    public static final M f9225r = new M(0, 12);

    /* renamed from: s, reason: collision with root package name */
    public static final M f9226s = new M(0, 13);

    /* renamed from: t, reason: collision with root package name */
    public static final M f9227t = new M(0, 14);

    /* renamed from: u, reason: collision with root package name */
    public static final M f9228u = new M(0, 15);

    /* renamed from: v, reason: collision with root package name */
    public static final M f9229v = new M(0, 16);

    /* renamed from: w, reason: collision with root package name */
    public static final M f9230w = new M(0, 17);

    /* renamed from: x, reason: collision with root package name */
    public static final M f9231x = new M(0, 18);

    /* renamed from: y, reason: collision with root package name */
    public static final M f9232y = new M(0, 19);

    /* renamed from: z, reason: collision with root package name */
    public static final M f9233z = new M(0, 20);

    /* renamed from: A, reason: collision with root package name */
    public static final M f9207A = new M(0, 21);

    /* renamed from: B, reason: collision with root package name */
    public static final M f9208B = new M(0, 22);
    public static final M C = new M(0, 23);
    public static final M D = new M(0, 24);

    /* renamed from: E, reason: collision with root package name */
    public static final M f9209E = new M(0, 25);

    /* renamed from: F, reason: collision with root package name */
    public static final M f9210F = new M(0, 26);

    /* renamed from: G, reason: collision with root package name */
    public static final M f9211G = new M(0, 27);

    /* renamed from: H, reason: collision with root package name */
    public static final M f9212H = new M(0, 28);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(int i3, int i4) {
        super(i3);
        this.f9234e = i4;
    }

    @Override // e2.InterfaceC0422a
    public final Object b() {
        Choreographer choreographer;
        switch (this.f9234e) {
            case 0:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw null;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw null;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
                throw null;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                AndroidCompositionLocals_androidKt.b("LocalSavedStateRegistryOwner");
                throw null;
            case 5:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw null;
            case 6:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    x2.e eVar = q2.E.f7851a;
                    choreographer = (Choreographer) AbstractC0837y.u(v2.m.f9819a, new U(2, null));
                }
                W w2 = new W(choreographer, O2.d.G(Looper.getMainLooper()));
                return AbstractC0508a.L(w2, w2.f9289o);
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                return null;
            case AbstractC0856c.f8037c /* 9 */:
                AbstractC1101g0.b("LocalAutofillTree");
                throw null;
            case AbstractC0856c.f8039e /* 10 */:
                AbstractC1101g0.b("LocalClipboardManager");
                throw null;
            case 11:
                AbstractC1101g0.b("LocalDensity");
                throw null;
            case 12:
                AbstractC1101g0.b("LocalFocusManager");
                throw null;
            case 13:
                AbstractC1101g0.b("LocalFontFamilyResolver");
                throw null;
            case 14:
                AbstractC1101g0.b("LocalFontLoader");
                throw null;
            case AbstractC0856c.f8041g /* 15 */:
                AbstractC1101g0.b("LocalGraphicsContext");
                throw null;
            case 16:
                AbstractC1101g0.b("LocalHapticFeedback");
                throw null;
            case 17:
                AbstractC1101g0.b("LocalInputManager");
                throw null;
            case 18:
                AbstractC1101g0.b("LocalLayoutDirection");
                throw null;
            case 19:
                return null;
            case 20:
                return Boolean.FALSE;
            case 21:
            case 22:
                return null;
            case 23:
                AbstractC1101g0.b("LocalTextToolbar");
                throw null;
            case 24:
                AbstractC1101g0.b("LocalUriHandler");
                throw null;
            case 25:
                AbstractC1101g0.b("LocalViewConfiguration");
                throw null;
            case 26:
                AbstractC1101g0.b("LocalWindowInfo");
                throw null;
            case 27:
                return Boolean.FALSE;
            default:
                return null;
        }
    }
}
