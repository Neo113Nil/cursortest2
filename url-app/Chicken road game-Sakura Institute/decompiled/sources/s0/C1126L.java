package s0;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.appsflyer.attribution.RequestError;
import kotlin.jvm.functions.Function0;
import q.AbstractC1024c;

/* renamed from: s0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1126L extends M2.p implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10097d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1126L f10078e = new C1126L(0, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final C1126L f10079i = new C1126L(0, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final C1126L f10080j = new C1126L(0, 2);

    /* renamed from: k, reason: collision with root package name */
    public static final C1126L f10081k = new C1126L(0, 3);

    /* renamed from: l, reason: collision with root package name */
    public static final C1126L f10082l = new C1126L(0, 4);

    /* renamed from: m, reason: collision with root package name */
    public static final C1126L f10083m = new C1126L(0, 5);

    /* renamed from: n, reason: collision with root package name */
    public static final C1126L f10084n = new C1126L(0, 6);

    /* renamed from: o, reason: collision with root package name */
    public static final C1126L f10085o = new C1126L(0, 7);

    /* renamed from: p, reason: collision with root package name */
    public static final C1126L f10086p = new C1126L(0, 8);

    /* renamed from: q, reason: collision with root package name */
    public static final C1126L f10087q = new C1126L(0, 9);

    /* renamed from: r, reason: collision with root package name */
    public static final C1126L f10088r = new C1126L(0, 10);

    /* renamed from: s, reason: collision with root package name */
    public static final C1126L f10089s = new C1126L(0, 11);

    /* renamed from: t, reason: collision with root package name */
    public static final C1126L f10090t = new C1126L(0, 12);

    /* renamed from: u, reason: collision with root package name */
    public static final C1126L f10091u = new C1126L(0, 13);

    /* renamed from: v, reason: collision with root package name */
    public static final C1126L f10092v = new C1126L(0, 14);

    /* renamed from: w, reason: collision with root package name */
    public static final C1126L f10093w = new C1126L(0, 15);

    /* renamed from: x, reason: collision with root package name */
    public static final C1126L f10094x = new C1126L(0, 16);

    /* renamed from: y, reason: collision with root package name */
    public static final C1126L f10095y = new C1126L(0, 17);

    /* renamed from: z, reason: collision with root package name */
    public static final C1126L f10096z = new C1126L(0, 18);

    /* renamed from: A, reason: collision with root package name */
    public static final C1126L f10069A = new C1126L(0, 19);
    public static final C1126L B = new C1126L(0, 20);

    /* renamed from: C, reason: collision with root package name */
    public static final C1126L f10070C = new C1126L(0, 21);

    /* renamed from: D, reason: collision with root package name */
    public static final C1126L f10071D = new C1126L(0, 22);

    /* renamed from: E, reason: collision with root package name */
    public static final C1126L f10072E = new C1126L(0, 23);

    /* renamed from: F, reason: collision with root package name */
    public static final C1126L f10073F = new C1126L(0, 24);

    /* renamed from: G, reason: collision with root package name */
    public static final C1126L f10074G = new C1126L(0, 25);

    /* renamed from: H, reason: collision with root package name */
    public static final C1126L f10075H = new C1126L(0, 26);

    /* renamed from: I, reason: collision with root package name */
    public static final C1126L f10076I = new C1126L(0, 27);

    /* renamed from: J, reason: collision with root package name */
    public static final C1126L f10077J = new C1126L(0, 28);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1126L(int i2, int i4) {
        super(i2);
        this.f10097d = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Choreographer choreographer;
        switch (this.f10097d) {
            case 0:
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
                    d3.e eVar = W2.J.f4225a;
                    choreographer = (Choreographer) W2.B.n(b3.m.f5679a, new T(2, null));
                }
                V v4 = new V(choreographer, j0.c.t(Looper.getMainLooper()));
                return kotlin.coroutines.f.c(v4.f10150r, v4);
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                return null;
            case AbstractC1024c.f9242c /* 9 */:
                AbstractC1144g0.b("LocalAutofillTree");
                throw null;
            case 10:
                AbstractC1144g0.b("LocalClipboardManager");
                throw null;
            case RequestError.STOP_TRACKING /* 11 */:
                AbstractC1144g0.b("LocalDensity");
                throw null;
            case 12:
                AbstractC1144g0.b("LocalFocusManager");
                throw null;
            case 13:
                AbstractC1144g0.b("LocalFontFamilyResolver");
                throw null;
            case 14:
                AbstractC1144g0.b("LocalFontLoader");
                throw null;
            case AbstractC1024c.f9246g /* 15 */:
                AbstractC1144g0.b("LocalGraphicsContext");
                throw null;
            case 16:
                AbstractC1144g0.b("LocalHapticFeedback");
                throw null;
            case 17:
                AbstractC1144g0.b("LocalInputManager");
                throw null;
            case 18:
                AbstractC1144g0.b("LocalLayoutDirection");
                throw null;
            case 19:
                return null;
            case 20:
                return Boolean.FALSE;
            case 21:
            case 22:
                return null;
            case 23:
                AbstractC1144g0.b("LocalTextToolbar");
                throw null;
            case 24:
                AbstractC1144g0.b("LocalUriHandler");
                throw null;
            case 25:
                AbstractC1144g0.b("LocalViewConfiguration");
                throw null;
            case 26:
                AbstractC1144g0.b("LocalWindowInfo");
                throw null;
            case 27:
                return Boolean.FALSE;
            default:
                return null;
        }
    }
}
