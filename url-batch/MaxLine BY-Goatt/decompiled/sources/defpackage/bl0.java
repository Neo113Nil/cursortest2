package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bl0 extends o81 implements Function1 {
    public static final bl0 A;
    public static final bl0 B;
    public static final bl0 C;
    public static final bl0 D;
    public static final bl0 E;
    public static final bl0 F;
    public static final bl0 G;
    public static final bl0 H;
    public static final bl0 I;
    public static final bl0 J;
    public static final bl0 K;
    public static final bl0 L;
    public static final bl0 M;
    public static final bl0 N;
    public static final bl0 O;
    public static final bl0 P;
    public static final bl0 Q;
    public static final bl0 n;
    public static final bl0 o;
    public static final bl0 p;
    public static final bl0 q;
    public static final bl0 r;
    public static final bl0 s;
    public static final bl0 t;
    public static final bl0 u;
    public static final bl0 v;
    public static final bl0 w;
    public static final bl0 x;
    public static final bl0 y;
    public static final bl0 z;
    public final /* synthetic */ int m;

    static {
        int i = 1;
        n = new bl0(i, 0);
        o = new bl0(i, 1);
        p = new bl0(i, 2);
        q = new bl0(i, 3);
        r = new bl0(i, 4);
        s = new bl0(i, 5);
        t = new bl0(i, 6);
        u = new bl0(i, 7);
        v = new bl0(i, 8);
        w = new bl0(i, 9);
        x = new bl0(i, 10);
        y = new bl0(i, 11);
        z = new bl0(i, 12);
        A = new bl0(i, 13);
        B = new bl0(i, 14);
        C = new bl0(i, 15);
        D = new bl0(i, 16);
        E = new bl0(i, 17);
        F = new bl0(i, 18);
        G = new bl0(i, 19);
        H = new bl0(i, 20);
        I = new bl0(i, 21);
        J = new bl0(i, 22);
        K = new bl0(i, 23);
        L = new bl0(i, 24);
        M = new bl0(i, 25);
        N = new bl0(i, 26);
        O = new bl0(i, 27);
        P = new bl0(i, 28);
        Q = new bl0(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bl0(int i, int i2) {
        super(i);
        this.m = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String valueOf;
        switch (this.m) {
            case 0:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                yd0.H((yd0) obj, aw.f, 0L, 126);
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                List list = (List) obj;
                break;
            case 11:
                ((Number) obj).intValue();
                break;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                ((Number) obj).intValue();
                break;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                break;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                break;
            case 15:
                int i = ((b11) obj).a;
                break;
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                p12 p12Var = (p12) obj;
                if (p12Var.E()) {
                    qg1 qg1Var = p12Var.n;
                    if (!qg1Var.w) {
                        Function1 d = p12Var.m.d();
                        tn1 tn1Var = qg1Var.z;
                        if (d != null) {
                            qg1Var.o0(p12Var, 9223372034707292159L, 0L);
                            qg1Var.s = d;
                        } else if (tn1Var != null) {
                            Object[] objArr = tn1Var.c;
                            long[] jArr = tn1Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i2 = 0;
                                while (true) {
                                    long j = jArr[i2];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                                        for (int i4 = 0; i4 < i3; i4++) {
                                            if ((255 & j) < 128) {
                                                qg1Var.D0((un1) objArr[(i2 << 3) + i4]);
                                            }
                                            j >>= 8;
                                        }
                                        if (i3 != 8) {
                                        }
                                    }
                                    if (i2 != length) {
                                        i2++;
                                    }
                                }
                            }
                            tn1Var.a();
                        }
                    }
                }
                break;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                ((Number) obj).longValue();
                break;
            case 18:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) "[");
                    int i5 = 0;
                    for (byte b : (byte[]) value) {
                        i5++;
                        if (i5 > 1) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) String.valueOf((int) b));
                    }
                    sb.append((CharSequence) "]");
                    valueOf = sb.toString();
                } else {
                    valueOf = String.valueOf(entry.getValue());
                }
                break;
            case 19:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    break;
                }
                break;
            case 20:
                op1 op1Var = (op1) obj;
                op1Var.getClass();
                rp1 rp1Var = op1Var.n;
                if (rp1Var != null && rp1Var.w == op1Var.r) {
                    break;
                }
                break;
            case 21:
                op1 op1Var2 = (op1) obj;
                op1Var2.getClass();
                rp1 rp1Var2 = op1Var2.n;
                if (rp1Var2 != null && rp1Var2.w == op1Var2.r) {
                    break;
                }
                break;
            case 22:
                op1 op1Var3 = (op1) obj;
                op1Var3.getClass();
                break;
            case 23:
                op1 op1Var4 = (op1) obj;
                op1Var4.getClass();
                break;
            case 24:
                op1 op1Var5 = (op1) obj;
                op1Var5.getClass();
                if (op1Var5 instanceof rp1) {
                    rp1 rp1Var3 = (rp1) op1Var5;
                    break;
                }
                break;
            case Constants.MAX_TREE_DEPTH /* 25 */:
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
            default:
                qx1 qx1Var = ((ks1) obj).U;
                if (qx1Var != null) {
                    ((fw0) qx1Var).c();
                }
                break;
        }
        return Unit.a;
    }
}
