package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class p2 extends pc0 implements Function0 {
    public static final p2 A;
    public static final p2 B;
    public static final p2 C;
    public static final p2 D;
    public static final p2 E;
    public static final p2 F;
    public static final p2 G;
    public static final p2 H;
    public static final p2 I;
    public static final p2 e;
    public static final p2 g;
    public static final p2 h;
    public static final p2 i;
    public static final p2 j;
    public static final p2 k;
    public static final p2 l;
    public static final p2 m;
    public static final p2 n;
    public static final p2 o;
    public static final p2 p;
    public static final p2 q;
    public static final p2 r;
    public static final p2 s;
    public static final p2 t;
    public static final p2 u;
    public static final p2 v;
    public static final p2 w;
    public static final p2 x;
    public static final p2 y;
    public static final p2 z;
    public final /* synthetic */ int d;

    static {
        int i2 = 0;
        e = new p2(i2, 0);
        g = new p2(i2, 1);
        h = new p2(i2, 2);
        i = new p2(i2, 3);
        j = new p2(i2, 4);
        k = new p2(i2, 5);
        l = new p2(i2, 6);
        m = new p2(i2, 7);
        n = new p2(i2, 8);
        o = new p2(i2, 9);
        p = new p2(i2, 10);
        q = new p2(i2, 11);
        r = new p2(i2, 12);
        s = new p2(i2, 13);
        t = new p2(i2, 14);
        u = new p2(i2, 15);
        v = new p2(i2, 16);
        w = new p2(i2, 17);
        x = new p2(i2, 18);
        y = new p2(i2, 19);
        z = new p2(i2, 20);
        A = new p2(i2, 21);
        B = new p2(i2, 22);
        C = new p2(i2, 23);
        D = new p2(i2, 24);
        E = new p2(i2, 25);
        F = new p2(i2, 26);
        G = new p2(i2, 27);
        H = new p2(i2, 28);
        I = new p2(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2(int i2, int i3) {
        super(i2);
        this.d = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Choreographer choreographer;
        dn dnVar = null;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return UUID.randomUUID().toString();
            case 1:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
                throw null;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw null;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    nq nqVar = ls.a;
                    choreographer = (Choreographer) uq1.R(pj0.a, new m6(2, dnVar, 0));
                }
                p6 p6Var = new p6(choreographer, Handler.createAsync(Looper.getMainLooper()));
                return e.c(p6Var, p6Var.p);
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                return Unit.a;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                return Unit.a;
            case 9:
                return Unit.a;
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case RequestError.STOP_TRACKING /* 11 */:
                return null;
            case 12:
                yl.b("LocalAutofillManager");
                throw null;
            case 13:
                yl.b("LocalAutofillTree");
                throw null;
            case 14:
                yl.b("LocalClipboard");
                throw null;
            case 15:
                yl.b("LocalClipboardManager");
                throw null;
            case 16:
                return Boolean.TRUE;
            case 17:
                yl.b("LocalDensity");
                throw null;
            case 18:
                yl.b("LocalFocusManager");
                throw null;
            case 19:
                yl.b("LocalFontFamilyResolver");
                throw null;
            case 20:
                yl.b("LocalFontLoader");
                throw null;
            case 21:
                yl.b("LocalGraphicsContext");
                throw null;
            case 22:
                yl.b("LocalHapticFeedback");
                throw null;
            case 23:
                yl.b("LocalInputManager");
                throw null;
            case 24:
                yl.b("LocalLayoutDirection");
                throw null;
            case 25:
                return null;
            case 26:
                return Boolean.FALSE;
            case 27:
            case 28:
                return null;
            default:
                yl.b("LocalTextToolbar");
                throw null;
        }
    }
}
