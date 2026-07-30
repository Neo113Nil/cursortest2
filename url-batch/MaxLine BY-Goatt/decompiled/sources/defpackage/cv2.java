package defpackage;

import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cv2 extends o81 implements Function1 {
    public static final cv2 A;
    public static final cv2 B;
    public static final cv2 C;
    public static final cv2 D;
    public static final cv2 E;
    public static final cv2 F;
    public static final cv2 G;
    public static final cv2 H;
    public static final cv2 I;
    public static final cv2 J;
    public static final cv2 K;
    public static final cv2 L;
    public static final cv2 M;
    public static final cv2 n;
    public static final cv2 o;
    public static final cv2 p;
    public static final cv2 q;
    public static final cv2 r;
    public static final cv2 s;
    public static final cv2 t;
    public static final cv2 u;
    public static final cv2 v;
    public static final cv2 w;
    public static final cv2 x;
    public static final cv2 y;
    public static final cv2 z;
    public final /* synthetic */ int m;

    static {
        int i = 1;
        n = new cv2(i, 0);
        o = new cv2(i, 1);
        p = new cv2(i, 2);
        q = new cv2(i, 3);
        r = new cv2(i, 4);
        s = new cv2(i, 5);
        t = new cv2(i, 6);
        u = new cv2(i, 7);
        v = new cv2(i, 8);
        w = new cv2(i, 9);
        x = new cv2(i, 10);
        y = new cv2(i, 11);
        z = new cv2(i, 12);
        A = new cv2(i, 13);
        B = new cv2(i, 14);
        C = new cv2(i, 15);
        D = new cv2(i, 16);
        E = new cv2(i, 17);
        F = new cv2(i, 18);
        G = new cv2(i, 19);
        H = new cv2(i, 20);
        I = new cv2(i, 21);
        J = new cv2(i, 22);
        K = new cv2(i, 23);
        L = new cv2(i, 24);
        M = new cv2(i, 25);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv2(c82 c82Var) {
        super(1);
        this.m = 27;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.m) {
            case 0:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                ww1 ww1Var = ((Boolean) obj2).booleanValue() ? ww1.m : ww1.n;
                Object obj3 = list.get(0);
                obj3.getClass();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                int i = ((b11) obj).a;
                break;
            case 4:
                break;
            case 5:
                int i2 = ((b11) obj).a;
                break;
            case 6:
                ((Function0) obj).invoke();
                break;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                tg2 tg2Var = (tg2) obj;
                long j = tg2Var.r;
                ((hn2) jz2.a.getValue()).c(tg2Var, u, tg2Var.s);
                long j2 = tg2Var.r;
                if (j != j2) {
                    kg2 kg2Var = tg2Var.z;
                    if (kg2Var != null) {
                        kg2Var.g = j2;
                        if (kg2Var.b == null) {
                            kg2Var.h = si1.c((1.0d - kg2Var.e.a(0)) * tg2Var.r);
                        }
                    } else if (j2 != 0) {
                        tg2Var.F();
                    }
                }
                break;
            case 8:
                long j3 = ((rc0) obj).a;
                break;
            case 9:
                float f = ((pd) obj).a;
                break;
            case 10:
                break;
            case 11:
                break;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                break;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                break;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                long j4 = ((s31) obj).a;
                break;
            case 15:
                pd pdVar = (pd) obj;
                break;
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                long j5 = ((x31) obj).a;
                break;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                pd pdVar2 = (pd) obj;
                int round = Math.round(pdVar2.a);
                if (round < 0) {
                    round = 0;
                }
                int round2 = Math.round(pdVar2.b);
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                long j6 = ((au1) obj).a;
                break;
            case 21:
                pd pdVar3 = (pd) obj;
                break;
            case 22:
                w72 w72Var = (w72) obj;
                break;
            case 23:
                rd rdVar = (rd) obj;
                break;
            case 24:
                long j7 = ((ql2) obj).a;
                break;
            case Constants.MAX_TREE_DEPTH /* 25 */:
                pd pdVar4 = (pd) obj;
                break;
            case 26:
                break;
            case 27:
                ((p22) obj).getClass();
                break;
            case 28:
                ((Number) obj).intValue();
                break;
            default:
                op1 op1Var = ((cp1) ((zc) obj).c()).n;
                op1Var.getClass();
                int i3 = op1.u;
                for (op1 op1Var2 : aj2.c((dz) op1Var, bl0.K)) {
                }
                break;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cv2(int i, int i2) {
        super(i);
        this.m = i2;
    }
}
