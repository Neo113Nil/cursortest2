package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class o3 extends o81 implements Function1 {
    public static final o3 A;
    public static final o3 B;
    public static final o3 C;
    public static final o3 D;
    public static final o3 E;
    public static final o3 F;
    public static final o3 G;
    public static final o3 H;
    public static final o3 I;
    public static final o3 J;
    public static final o3 K;
    public static final o3 L;
    public static final o3 M;
    public static final o3 N;
    public static final o3 O;
    public static final o3 P;
    public static final o3 Q;
    public static final o3 n;
    public static final o3 o;
    public static final o3 p;
    public static final o3 q;
    public static final o3 r;
    public static final o3 s;
    public static final o3 t;
    public static final o3 u;
    public static final o3 v;
    public static final o3 w;
    public static final o3 x;
    public static final o3 y;
    public static final o3 z;
    public final /* synthetic */ int m;

    static {
        int i = 1;
        n = new o3(i, 0);
        o = new o3(i, 1);
        p = new o3(i, 2);
        q = new o3(i, 3);
        r = new o3(i, 4);
        s = new o3(i, 5);
        t = new o3(i, 6);
        u = new o3(i, 7);
        v = new o3(i, 8);
        w = new o3(i, 9);
        x = new o3(i, 10);
        y = new o3(i, 11);
        z = new o3(i, 12);
        A = new o3(i, 13);
        B = new o3(i, 14);
        C = new o3(i, 15);
        D = new o3(i, 16);
        E = new o3(i, 17);
        F = new o3(i, 18);
        G = new o3(i, 19);
        H = new o3(i, 20);
        I = new o3(i, 21);
        J = new o3(i, 22);
        K = new o3(i, 23);
        L = new o3(i, 24);
        M = new o3(i, 25);
        N = new o3(i, 26);
        O = new o3(i, 27);
        P = new o3(i, 28);
        Q = new o3(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3(int i, int i2) {
        super(i);
        this.m = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.m) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 1:
                return Unit.a;
            case 2:
                return Boolean.TRUE;
            case 3:
                return Boolean.FALSE;
            case 4:
                v02 v02Var = (v02) obj;
                r00 r00Var = AndroidCompositionLocals_androidKt.a;
                v02Var.getClass();
                ll3.P(v02Var, r00Var);
                return ((Context) ll3.P(v02Var, AndroidCompositionLocals_androidKt.b)).getResources();
            case 5:
                t71[] t71VarArr = ii2.a;
                ji2 ji2Var = gi2.w;
                Unit unit = Unit.a;
                ((sh2) obj).d(ji2Var, unit);
                return unit;
            case 6:
                ((Number) obj).longValue();
                return Unit.a;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Number) obj).longValue();
                return Unit.a;
            case 8:
                return Unit.a;
            case 9:
                t71[] t71VarArr2 = ii2.a;
                ji2 ji2Var2 = gi2.v;
                Unit unit2 = Unit.a;
                ((sh2) obj).d(ji2Var2, unit2);
                return unit2;
            case 10:
                return Unit.a;
            case 11:
                ((fn) obj).I0();
                return Unit.a;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                return Unit.a;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                ((k91) obj).a();
                return Unit.a;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                return Unit.a;
            case 15:
                return Unit.a;
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                v02 v02Var2 = (v02) obj;
                bp2 bp2Var = AndroidCompositionLocals_androidKt.b;
                v02Var2.getClass();
                if (((Context) ll3.P(v02Var2, bp2Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return yp.b;
                }
                wp.a.getClass();
                return vp.c;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                ii2.b((sh2) obj, 0);
                return Unit.a;
            case 18:
                long a = aw.a(((aw) obj).a, kw.x);
                return new rd(aw.d(a), aw.h(a), aw.g(a), aw.e(a));
            case 19:
                ((Number) obj).longValue();
                return Unit.a;
            case 20:
                return Boolean.valueOf(!(((tl1) obj) instanceof rz));
            case 21:
                return Unit.a;
            case 22:
                float[] fArr = ((ti1) obj).a;
                return Unit.a;
            case 23:
                float[] fArr2 = ((ti1) obj).a;
                return Unit.a;
            case 24:
                List list = (List) obj;
                Object obj2 = list.get(0);
                obj2.getClass();
                int intValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                obj3.getClass();
                return new q80(intValue, ((Float) obj3).floatValue(), new p80(0, list));
            case Constants.MAX_TREE_DEPTH /* 25 */:
                return Boolean.valueOf(ap.r(obj));
            case 26:
                return Unit.a;
            case 27:
                long j = ((wy2) obj).a;
                return new pd(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            case 28:
                pd pdVar = (pd) obj;
                float f = pdVar.a;
                float f2 = pdVar.b;
                return new wy2((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            default:
                return bd3.G(7, null);
        }
    }
}
