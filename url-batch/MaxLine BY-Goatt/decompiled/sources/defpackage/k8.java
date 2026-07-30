package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.UUID;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class k8 extends o81 implements Function0 {
    public static final k8 A;
    public static final k8 B;
    public static final k8 C;
    public static final k8 D;
    public static final k8 E;
    public static final k8 F;
    public static final k8 G;
    public static final k8 H;
    public static final k8 I;
    public static final k8 J;
    public static final k8 K;
    public static final k8 L;
    public static final k8 M;
    public static final k8 N;
    public static final k8 O;
    public static final k8 P;
    public static final k8 Q;
    public static final k8 n;
    public static final k8 o;
    public static final k8 p;
    public static final k8 q;
    public static final k8 r;
    public static final k8 s;
    public static final k8 t;
    public static final k8 u;
    public static final k8 v;
    public static final k8 w;
    public static final k8 x;
    public static final k8 y;
    public static final k8 z;
    public final /* synthetic */ int m;

    static {
        int i = 0;
        n = new k8(i, 0);
        o = new k8(i, 1);
        p = new k8(i, 2);
        q = new k8(i, 3);
        r = new k8(i, 4);
        s = new k8(i, 5);
        t = new k8(i, 6);
        u = new k8(i, 7);
        v = new k8(i, 8);
        w = new k8(i, 9);
        x = new k8(i, 10);
        y = new k8(i, 11);
        z = new k8(i, 12);
        A = new k8(i, 13);
        B = new k8(i, 14);
        C = new k8(i, 15);
        D = new k8(i, 16);
        E = new k8(i, 17);
        F = new k8(i, 18);
        G = new k8(i, 19);
        H = new k8(i, 20);
        I = new k8(i, 21);
        J = new k8(i, 22);
        K = new k8(i, 23);
        L = new k8(i, 24);
        M = new k8(i, 25);
        N = new k8(i, 26);
        O = new k8(i, 27);
        P = new k8(i, 28);
        Q = new k8(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k8(int i, int i2) {
        super(i);
        this.m = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Choreographer choreographer;
        int i = 2;
        o30 o30Var = null;
        switch (this.m) {
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
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw null;
            case 5:
                return UUID.randomUUID();
            case 6:
                return "DEFAULT_TEST_TAG";
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return UUID.randomUUID();
            case 8:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    t80 t80Var = vb0.a;
                    choreographer = (Choreographer) z71.P(qh1.a, new ub(i, o30Var, 0));
                }
                xb xbVar = new xb(choreographer, j8.u(Looper.getMainLooper()));
                return f.c(xbVar, xbVar.x);
            case 9:
                return null;
            case 10:
                return hw.e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1);
            case 11:
                return Boolean.TRUE;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                return new i91(2);
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                return null;
            case 15:
                p00.b("LocalAutofillManager");
                throw null;
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                p00.b("LocalAutofillTree");
                throw null;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                p00.b("LocalClipboard");
                throw null;
            case 18:
                p00.b("LocalClipboardManager");
                throw null;
            case 19:
                return Boolean.TRUE;
            case 20:
                p00.b("LocalDensity");
                throw null;
            case 21:
                p00.b("LocalFocusManager");
                throw null;
            case 22:
                p00.b("LocalFontFamilyResolver");
                throw null;
            case 23:
                p00.b("LocalFontLoader");
                throw null;
            case 24:
                p00.b("LocalGraphicsContext");
                throw null;
            case Constants.MAX_TREE_DEPTH /* 25 */:
                p00.b("LocalHapticFeedback");
                throw null;
            case 26:
                p00.b("LocalInputManager");
                throw null;
            case 27:
                p00.b("LocalLayoutDirection");
                throw null;
            case 28:
                return null;
            default:
                return Boolean.FALSE;
        }
    }
}
