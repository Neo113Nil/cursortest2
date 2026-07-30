package defpackage;

import android.graphics.PathMeasure;
import android.os.Handler;
import android.os.Looper;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class o00 extends o81 implements Function0 {
    public static final o00 A;
    public static final o00 B;
    public static final o00 C;
    public static final o00 D;
    public static final o00 E;
    public static final o00 F;
    public static final o00 G;
    public static final o00 H;
    public static final o00 I;
    public static final o00 J;
    public static final o00 K;
    public static final o00 L;
    public static final o00 M;
    public static final o00 N;
    public static final o00 O;
    public static final o00 P;
    public static final o00 Q;
    public static final o00 n;
    public static final o00 o;
    public static final o00 p;
    public static final o00 q;
    public static final o00 r;
    public static final o00 s;
    public static final o00 t;
    public static final o00 u;
    public static final o00 v;
    public static final o00 w;
    public static final o00 x;
    public static final o00 y;
    public static final o00 z;
    public final /* synthetic */ int m;

    static {
        int i = 0;
        n = new o00(i, 0);
        o = new o00(i, 1);
        p = new o00(i, 2);
        q = new o00(i, 3);
        r = new o00(i, 4);
        s = new o00(i, 5);
        t = new o00(i, 6);
        u = new o00(i, 7);
        v = new o00(i, 8);
        w = new o00(i, 9);
        x = new o00(i, 10);
        y = new o00(i, 11);
        z = new o00(i, 12);
        A = new o00(i, 13);
        B = new o00(i, 14);
        C = new o00(i, 15);
        D = new o00(i, 16);
        E = new o00(i, 17);
        F = new o00(i, 18);
        G = new o00(i, 19);
        H = new o00(i, 20);
        I = new o00(i, 21);
        J = new o00(i, 22);
        K = new o00(i, 23);
        L = new o00(i, 24);
        M = new o00(i, 25);
        N = new o00(i, 26);
        O = new o00(i, 27);
        P = new o00(i, 28);
        Q = new o00(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o00(int i, int i2) {
        super(i);
        this.m = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.m) {
            case 0:
            case 1:
                return null;
            case 2:
                p00.b("LocalTextToolbar");
                throw null;
            case 3:
                p00.b("LocalUriHandler");
                throw null;
            case 4:
                p00.b("LocalViewConfiguration");
                throw null;
            case 5:
                p00.b("LocalWindowInfo");
                throw null;
            case 6:
                return new aw(aw.b);
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return Boolean.TRUE;
            case 8:
                return new Handler(Looper.getMainLooper());
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return w70.a;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                return Boolean.FALSE;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                return Boolean.TRUE;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                return new pc0(48.0f);
            case 15:
                return new i91(3);
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                return Boolean.FALSE;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                return new nx1();
            case 18:
                return new pa(new PathMeasure());
            case 19:
            case 20:
                return null;
            case 21:
                return new va2();
            case 22:
                return Boolean.FALSE;
            case 23:
                return cx.c;
            case 24:
                return null;
            case Constants.MAX_TREE_DEPTH /* 25 */:
                return new jk2();
            case 26:
                return new pc0(0.0f);
            case 27:
                return p13.a;
            case 28:
                return lw2.b;
            default:
                hn2 hn2Var = new hn2(cv2.t);
                hn2Var.d();
                return hn2Var;
        }
    }
}
