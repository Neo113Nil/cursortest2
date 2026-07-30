package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import java.io.File;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class y3 extends pc0 implements Function1 {
    public static final y3 A;
    public static final y3 B;
    public static final y3 C;
    public static final y3 D;
    public static final y3 E;
    public static final y3 F;
    public static final y3 G;
    public static final y3 H;
    public static final y3 I;
    public static final y3 e;
    public static final y3 g;
    public static final y3 h;
    public static final y3 i;
    public static final y3 j;
    public static final y3 k;
    public static final y3 l;
    public static final y3 m;
    public static final y3 n;
    public static final y3 o;
    public static final y3 p;
    public static final y3 q;
    public static final y3 r;
    public static final y3 s;
    public static final y3 t;
    public static final y3 u;
    public static final y3 v;
    public static final y3 w;
    public static final y3 x;
    public static final y3 y;
    public static final y3 z;
    public final /* synthetic */ int d;

    static {
        int i2 = 1;
        e = new y3(i2, 0);
        g = new y3(i2, 1);
        h = new y3(i2, 2);
        i = new y3(i2, 3);
        j = new y3(i2, 4);
        k = new y3(i2, 5);
        l = new y3(i2, 6);
        m = new y3(i2, 7);
        n = new y3(i2, 8);
        o = new y3(i2, 9);
        p = new y3(i2, 10);
        q = new y3(i2, 11);
        r = new y3(i2, 12);
        s = new y3(i2, 13);
        t = new y3(i2, 14);
        u = new y3(i2, 15);
        v = new y3(i2, 16);
        w = new y3(i2, 17);
        x = new y3(i2, 18);
        y = new y3(i2, 19);
        z = new y3(i2, 20);
        A = new y3(i2, 21);
        B = new y3(i2, 22);
        C = new y3(i2, 23);
        D = new y3(i2, 24);
        E = new y3(i2, 25);
        F = new y3(i2, 26);
        G = new y3(i2, 27);
        H = new y3(i2, 28);
        I = new y3(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y3(int i2, int i3) {
        super(i2);
        this.d = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String valueOf;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Boolean.TRUE;
            case 1:
                return Boolean.valueOf(((l81) obj).k().d.c(p81.y));
            case 2:
                kw0 kw0Var = (kw0) obj;
                zl zlVar = AndroidCompositionLocals_androidKt.a;
                kw0Var.getClass();
                m90.I(kw0Var, zlVar);
                return ((Context) m90.I(kw0Var, AndroidCompositionLocals_androidKt.b)).getResources();
            case 3:
                return Boolean.valueOf(((l81) obj).k().d.c(p81.y));
            case 4:
                c7 c7Var = (c7) obj;
                c7Var.getHandler().post(new q2(c7Var.v, 3));
                return Unit.a;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                return Unit.a;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                return Unit.a;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                return Unit.a;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                ((Number) obj).longValue();
                return Unit.a;
            case 9:
                yk ykVar = (yk) obj;
                jd0 jd0Var = ykVar instanceof jd0 ? (jd0) ykVar : null;
                if (jd0Var == null || !jd0Var.U) {
                    return Unit.a;
                }
                af.i(ykVar, "Apply is called on deactivated node ");
                return null;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return Boolean.valueOf(!(((yl0) obj) instanceof al));
            case RequestError.STOP_TRACKING /* 11 */:
                return Boolean.valueOf(la0.x(obj));
            case 12:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                return new ua1(absolutePath);
            case 13:
                return Unit.a;
            case 14:
                return Unit.a;
            case 15:
                return Unit.a;
            case 16:
                bx0 bx0Var = (bx0) obj;
                if (bx0Var.t()) {
                    ej0 ej0Var = bx0Var.e;
                    if (!ej0Var.o) {
                        Function1 d = bx0Var.d.d();
                        vn0 vn0Var = ej0Var.r;
                        if (d != null) {
                            ej0Var.f0(bx0Var, 9223372034707292159L, 0L);
                            ej0Var.k = d;
                        } else if (vn0Var != null) {
                            Object[] objArr = vn0Var.c;
                            long[] jArr = vn0Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i2 = 0;
                                while (true) {
                                    long j2 = jArr[i2];
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                                        for (int i4 = 0; i4 < i3; i4++) {
                                            if ((255 & j2) < 128) {
                                                ej0Var.w0((wn0) objArr[(i2 << 3) + i4]);
                                            }
                                            j2 >>= 8;
                                        }
                                        if (i3 != 8) {
                                        }
                                    }
                                    if (i2 != length) {
                                        i2++;
                                    }
                                }
                            }
                            vn0Var.a();
                        }
                    }
                }
                return Unit.a;
            case 17:
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
                return "  " + ((hy0) entry.getKey()).a + " = " + valueOf;
            case 18:
                du0 du0Var = ((qp0) obj).P;
                if (du0Var != null) {
                    ((n50) du0Var).c();
                }
                return Unit.a;
            case 19:
                qp0 qp0Var = (qp0) obj;
                jd0 jd0Var2 = qp0Var.s;
                try {
                    if (qp0Var.t()) {
                        qp0Var.f1(true);
                    }
                    return Unit.a;
                } catch (Throwable th) {
                    jd0Var2.W(th);
                    throw null;
                }
            case 20:
                vq0 vq0Var = (vq0) obj;
                if (vq0Var.t()) {
                    vq0Var.d.B();
                }
                return Unit.a;
            case 21:
                jd0 jd0Var3 = (jd0) obj;
                if (jd0Var3.F()) {
                    jd0Var3.S(false);
                }
                return Unit.a;
            case 22:
                jd0 jd0Var4 = (jd0) obj;
                if (jd0Var4.F()) {
                    jd0Var4.S(false);
                }
                return Unit.a;
            case 23:
                jd0 jd0Var5 = (jd0) obj;
                if (jd0Var5.F()) {
                    jd0Var5.Q(false);
                }
                return Unit.a;
            case 24:
                jd0 jd0Var6 = (jd0) obj;
                if (jd0Var6.F()) {
                    jd0Var6.Q(false);
                }
                return Unit.a;
            case 25:
                jd0 jd0Var7 = (jd0) obj;
                if (jd0Var7.F()) {
                    jd0.R(jd0Var7, false, 7);
                }
                return Unit.a;
            case 26:
                jd0 jd0Var8 = (jd0) obj;
                if (jd0Var8.F()) {
                    jd0.T(jd0Var8, false, 7);
                }
                return Unit.a;
            case 27:
                jd0 jd0Var9 = (jd0) obj;
                if (jd0Var9.F()) {
                    jd0Var9.D();
                }
                return Unit.a;
            case 28:
                return Unit.a;
            default:
                ((Context) obj).getClass();
                return nv.d;
        }
    }
}
