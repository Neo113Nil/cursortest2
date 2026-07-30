package defpackage;

import android.content.Context;
import android.text.Spanned;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.encoders.json.BuildConfig;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class mh2 {
    public static int A(Object obj, yo3 yo3Var, byte[] bArr, int i, int i2, tn0 tn0Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = u(i4, bArr, i3, tn0Var);
            i4 = tn0Var.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            ch2.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i6 = tn0Var.c + 1;
        tn0Var.c = i6;
        if (i6 >= 100) {
            ch2.m("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i7 = i5 + i4;
        yo3Var.h(obj, bArr, i5, i7, tn0Var);
        tn0Var.c--;
        tn0Var.d = obj;
        return i7;
    }

    public static int B(Object obj, yo3 yo3Var, byte[] bArr, int i, int i2, int i3, tn0 tn0Var) {
        oo3 oo3Var = (oo3) yo3Var;
        int i4 = tn0Var.c + 1;
        tn0Var.c = i4;
        if (i4 >= 100) {
            ch2.m("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int s = oo3Var.s(obj, bArr, i, i2, i3, tn0Var);
        tn0Var.c--;
        tn0Var.d = obj;
        return s;
    }

    public static int C(int i, byte[] bArr, int i2, int i3, rn3 rn3Var, tn0 tn0Var) {
        kn3 kn3Var = (kn3) rn3Var;
        int t = t(bArr, i2, tn0Var);
        kn3Var.d(tn0Var.a);
        while (t < i3) {
            int t2 = t(bArr, t, tn0Var);
            if (i != tn0Var.a) {
                break;
            }
            t = t(bArr, t2, tn0Var);
            kn3Var.d(tn0Var.a);
        }
        return t;
    }

    public static int D(byte[] bArr, int i, rn3 rn3Var, tn0 tn0Var) {
        kn3 kn3Var = (kn3) rn3Var;
        int t = t(bArr, i, tn0Var);
        int i2 = tn0Var.a + t;
        while (t < i2) {
            t = t(bArr, t, tn0Var);
            kn3Var.d(tn0Var.a);
        }
        if (t == i2) {
            return t;
        }
        ch2.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int E(yo3 yo3Var, int i, byte[] bArr, int i2, int i3, rn3 rn3Var, tn0 tn0Var) {
        in3 zza = yo3Var.zza();
        yo3 yo3Var2 = yo3Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        tn0 tn0Var2 = tn0Var;
        int A = A(zza, yo3Var2, bArr2, i2, i4, tn0Var2);
        yo3Var2.a(zza);
        tn0Var2.d = zza;
        rn3Var.add(zza);
        while (A < i4) {
            tn0 tn0Var3 = tn0Var2;
            int i5 = i4;
            int t = t(bArr2, A, tn0Var3);
            if (i != tn0Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            yo3 yo3Var3 = yo3Var2;
            in3 zza2 = yo3Var3.zza();
            A = A(zza2, yo3Var3, bArr3, t, i5, tn0Var3);
            yo3Var2 = yo3Var3;
            bArr2 = bArr3;
            i4 = i5;
            tn0Var2 = tn0Var3;
            yo3Var2.a(zza2);
            tn0Var2.d = zza2;
            rn3Var.add(zza2);
        }
        return A;
    }

    public static int F(int i, byte[] bArr, int i2, int i3, jp3 jp3Var, tn0 tn0Var) {
        if ((i >>> 3) == 0) {
            ch2.m("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int v = v(bArr, i2, tn0Var);
            jp3Var.d(i, Long.valueOf(tn0Var.b));
            return v;
        }
        if (i4 == 1) {
            jp3Var.d(i, Long.valueOf(x(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int t = t(bArr, i2, tn0Var);
            int i5 = tn0Var.a;
            if (i5 < 0) {
                ch2.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - t) {
                ch2.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                jp3Var.d(i, im3.o);
            } else {
                jp3Var.d(i, im3.d(bArr, t, i5));
            }
            return t + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                jp3Var.d(i, Integer.valueOf(w(i2, bArr)));
                return i2 + 4;
            }
            ch2.m("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        jp3 a = jp3.a();
        int i7 = tn0Var.c + 1;
        tn0Var.c = i7;
        if (i7 >= 100) {
            ch2.m("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int t2 = t(bArr, i2, tn0Var);
            int i9 = tn0Var.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = t2;
                break;
            }
            i2 = F(i9, bArr, t2, i3, a, tn0Var);
            i8 = i9;
        }
        tn0Var.c--;
        if (i2 > i3 || i8 != i6) {
            ch2.m("Failed to parse the message.");
            return 0;
        }
        jp3Var.d(i, a);
        return i2;
    }

    public static int G(int i, byte[] bArr, int i2, int i3, tn0 tn0Var) {
        if ((i >>> 3) == 0) {
            ch2.m("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return v(bArr, i2, tn0Var);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return t(bArr, i2, tn0Var) + tn0Var.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            ch2.m("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = t(bArr, i2, tn0Var);
            i6 = tn0Var.a;
            if (i6 == i5) {
                break;
            }
            i2 = G(i6, bArr, i2, i3, tn0Var);
        }
        if (i2 <= i3 && i6 == i5) {
            return i2;
        }
        ch2.m("Failed to parse the message.");
        return 0;
    }

    public static final void a(Object obj, vl1 vl1Var, a00 a00Var) {
        nj njVar = p20.a;
        a00Var.Y(1451072229);
        zd zdVar = kj.F;
        ao aoVar = qb2.t;
        u30 u30Var = s03.e;
        b72 b72Var = (b72) a00Var.j(lf1.a);
        if (b72Var == null) {
            Context context = (Context) a00Var.j(AndroidCompositionLocals_androidKt.b);
            b72 b72Var2 = qb2.I;
            if (b72Var2 == null) {
                synchronized (qb2.H) {
                    b72Var2 = qb2.I;
                    if (b72Var2 == null) {
                        context.getApplicationContext();
                        b72Var = z71.l(context);
                        qb2.I = b72Var;
                    }
                }
            }
            b72Var = b72Var2;
        }
        a00Var.Y(2032051394);
        yj1.b(new mj(obj, u30Var, b72Var), vl1Var, zdVar, aoVar, njVar, a00Var, 1572912, 0);
        a00Var.q(false);
        a00Var.q(false);
    }

    public static final long b(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final boolean c(w72 w72Var, w72 w72Var2, w72 w72Var3, int i) {
        float f;
        float f2;
        boolean d = d(i, w72Var3, w72Var);
        float f3 = w72Var3.b;
        float f4 = w72Var3.d;
        float f5 = w72Var3.a;
        float f6 = w72Var3.c;
        float f7 = w72Var.d;
        float f8 = w72Var.b;
        float f9 = w72Var.c;
        float f10 = w72Var.a;
        if (!d && d(i, w72Var2, w72Var)) {
            if (i == 3) {
                if (f10 < f6) {
                    return true;
                }
            } else if (i == 4) {
                if (f9 > f5) {
                    return true;
                }
            } else if (i == 5) {
                if (f8 < f4) {
                    return true;
                }
            } else if (i != 6) {
                lh.g("This function should only be used for 2-D focus search");
            } else if (f7 > f3) {
                return true;
            }
            if (i == 3 || i == 4) {
                return true;
            }
            if (i == 3) {
                f = f10 - w72Var2.c;
            } else if (i == 4) {
                f = w72Var2.a - f9;
            } else if (i == 5) {
                f = f8 - w72Var2.d;
            } else {
                if (i != 6) {
                    lh.g("This function should only be used for 2-D focus search");
                    return false;
                }
                f = w72Var2.b - f7;
            }
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (i == 3) {
                f2 = f10 - f5;
            } else if (i == 4) {
                f2 = f6 - f9;
            } else if (i == 5) {
                f2 = f8 - f3;
            } else {
                if (i != 6) {
                    lh.g("This function should only be used for 2-D focus search");
                    return false;
                }
                f2 = f4 - f7;
            }
            if (f2 < 1.0f) {
                f2 = 1.0f;
            }
            if (f < f2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(int i, w72 w72Var, w72 w72Var2) {
        if (i == 3 || i == 4) {
            if (w72Var.d > w72Var2.b && w72Var.b < w72Var2.d) {
                return true;
            }
        } else {
            if (i != 5 && i != 6) {
                lh.g("This function should only be used for 2-D focus search");
                return false;
            }
            if (w72Var.c > w72Var2.a && w72Var.a < w72Var2.c) {
                return true;
            }
        }
        return false;
    }

    public static final void e(yo0 yo0Var, eo1 eo1Var) {
        if (!yo0Var.m.z) {
            h21.b("visitChildren called on an unattached node");
        }
        eo1 eo1Var2 = new eo1(new ul1[16]);
        ul1 ul1Var = yo0Var.m;
        ul1 ul1Var2 = ul1Var.r;
        if (ul1Var2 == null) {
            s03.b(eo1Var2, ul1Var);
        } else {
            eo1Var2.b(ul1Var2);
        }
        while (true) {
            int i = eo1Var2.o;
            if (i == 0) {
                return;
            }
            ul1 ul1Var3 = (ul1) eo1Var2.l(i - 1);
            if ((ul1Var3.p & 1024) == 0) {
                s03.b(eo1Var2, ul1Var3);
            } else {
                while (true) {
                    if (ul1Var3 == null) {
                        break;
                    }
                    if ((ul1Var3.o & 1024) != 0) {
                        eo1 eo1Var3 = null;
                        while (ul1Var3 != null) {
                            if (ul1Var3 instanceof yo0) {
                                yo0 yo0Var2 = (yo0) ul1Var3;
                                if (yo0Var2.z && !s03.J(yo0Var2).Y) {
                                    if (yo0Var2.H0().a) {
                                        eo1Var.b(yo0Var2);
                                    } else {
                                        e(yo0Var2, eo1Var);
                                    }
                                }
                            } else if ((ul1Var3.o & 1024) != 0 && (ul1Var3 instanceof p90)) {
                                int i2 = 0;
                                for (ul1 ul1Var4 = ((p90) ul1Var3).B; ul1Var4 != null; ul1Var4 = ul1Var4.r) {
                                    if ((ul1Var4.o & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            ul1Var3 = ul1Var4;
                                        } else {
                                            if (eo1Var3 == null) {
                                                eo1Var3 = new eo1(new ul1[16]);
                                            }
                                            if (ul1Var3 != null) {
                                                eo1Var3.b(ul1Var3);
                                                ul1Var3 = null;
                                            }
                                            eo1Var3.b(ul1Var4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            ul1Var3 = s03.c(eo1Var3);
                        }
                    } else {
                        ul1Var3 = ul1Var3.r;
                    }
                }
            }
        }
    }

    public static String f(er erVar) {
        StringBuilder sb = new StringBuilder(erVar.size());
        for (int i = 0; i < erVar.size(); i++) {
            byte a = erVar.a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
                    case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                        sb.append("\\f");
                        break;
                    case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                        sb.append("\\r");
                        break;
                    default:
                        if (a < 32 || a > 126) {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final yo0 g(eo1 eo1Var, w72 w72Var, int i) {
        w72 f;
        yo0 yo0Var = null;
        if (i == 3) {
            f = w72Var.f((w72Var.c - w72Var.a) + 1.0f, 0.0f);
        } else if (i == 4) {
            f = w72Var.f(-((w72Var.c - w72Var.a) + 1.0f), 0.0f);
        } else if (i == 5) {
            f = w72Var.f(0.0f, (w72Var.d - w72Var.b) + 1.0f);
        } else {
            if (i != 6) {
                lh.g("This function should only be used for 2-D focus search");
                return null;
            }
            f = w72Var.f(0.0f, -((w72Var.d - w72Var.b) + 1.0f));
        }
        Object[] objArr = eo1Var.m;
        int i2 = eo1Var.o;
        for (int i3 = 0; i3 < i2; i3++) {
            yo0 yo0Var2 = (yo0) objArr[i3];
            if (j8.K(yo0Var2)) {
                w72 B = j8.B(yo0Var2);
                if (l(B, f, w72Var, i)) {
                    yo0Var = yo0Var2;
                    f = B;
                }
            }
        }
        return yo0Var;
    }

    public static final boolean h(yo0 yo0Var, int i, Function1 function1) {
        w72 w72Var;
        eo1 eo1Var = new eo1(new yo0[16]);
        e(yo0Var, eo1Var);
        int i2 = eo1Var.o;
        if (i2 <= 1) {
            yo0 yo0Var2 = (yo0) (i2 == 0 ? null : eo1Var.m[0]);
            if (yo0Var2 != null) {
                return ((Boolean) function1.invoke(yo0Var2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                w72 B = j8.B(yo0Var);
                float f = B.a;
                float f2 = B.b;
                w72Var = new w72(f, f2, f, f2);
            } else {
                if (i != 3 && i != 5) {
                    lh.g("This function should only be used for 2-D focus search");
                    return false;
                }
                w72 B2 = j8.B(yo0Var);
                float f3 = B2.c;
                float f4 = B2.d;
                w72Var = new w72(f3, f4, f3, f4);
            }
            yo0 g = g(eo1Var, w72Var, i);
            if (g != null) {
                return ((Boolean) function1.invoke(g)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean i(int i, oc ocVar, yo0 yo0Var, w72 w72Var) {
        if (o(i, ocVar, yo0Var, w72Var)) {
            return true;
        }
        Boolean bool = (Boolean) j8.V(yo0Var, i, new pw(((po0) ((t7) s03.K(yo0Var)).getFocusOwner()).h, yo0Var, w72Var, i, ocVar, 2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final k92 j(bw2 bw2Var, int i) {
        aw2 aw2Var = bw2Var.a;
        if (aw2Var.a.n.length() != 0) {
            int e = bw2Var.e(i);
            if ((i != 0 && e == bw2Var.e(i - 1)) || (i != aw2Var.a.n.length() && e == bw2Var.e(i + 1))) {
                return bw2Var.a(i);
            }
        }
        return bw2Var.i(i);
    }

    public static final boolean k(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final boolean l(w72 w72Var, w72 w72Var2, w72 w72Var3, int i) {
        if (!m(i, w72Var, w72Var3)) {
            return false;
        }
        if (m(i, w72Var2, w72Var3) && !c(w72Var3, w72Var, w72Var2, i)) {
            return !c(w72Var3, w72Var2, w72Var, i) && n(i, w72Var3, w72Var) < n(i, w72Var3, w72Var2);
        }
        return true;
    }

    public static final boolean m(int i, w72 w72Var, w72 w72Var2) {
        float f = w72Var.b;
        float f2 = w72Var.d;
        float f3 = w72Var.a;
        float f4 = w72Var.c;
        if (i == 3) {
            float f5 = w72Var2.c;
            float f6 = w72Var2.a;
            if ((f5 > f4 || f6 >= f4) && f6 > f3) {
                return true;
            }
        } else if (i == 4) {
            float f7 = w72Var2.a;
            float f8 = w72Var2.c;
            if ((f7 < f3 || f8 <= f3) && f8 < f4) {
                return true;
            }
        } else if (i == 5) {
            float f9 = w72Var2.d;
            float f10 = w72Var2.b;
            if ((f9 > f2 || f10 >= f2) && f10 > f) {
                return true;
            }
        } else {
            if (i != 6) {
                lh.g("This function should only be used for 2-D focus search");
                return false;
            }
            float f11 = w72Var2.b;
            float f12 = w72Var2.d;
            if ((f11 < f || f12 <= f) && f12 < f2) {
                return true;
            }
        }
        return false;
    }

    public static final long n(int i, w72 w72Var, w72 w72Var2) {
        float f;
        float f2;
        float f3 = w72Var2.b;
        float f4 = w72Var2.d;
        float f5 = w72Var2.a;
        float f6 = w72Var2.c;
        if (i == 3) {
            f = w72Var.a - f6;
        } else if (i == 4) {
            f = f5 - w72Var.c;
        } else if (i == 5) {
            f = w72Var.b - f4;
        } else {
            if (i != 6) {
                lh.g("This function should only be used for 2-D focus search");
                return 0L;
            }
            f = f3 - w72Var.d;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        long j = (long) f;
        if (i == 3 || i == 4) {
            float f7 = w72Var.b;
            f2 = (((w72Var.d - f7) / 2.0f) + f7) - (((f4 - f3) / 2.0f) + f3);
        } else {
            if (i != 5 && i != 6) {
                lh.g("This function should only be used for 2-D focus search");
                return 0L;
            }
            float f8 = w72Var.a;
            f2 = (((w72Var.c - f8) / 2.0f) + f8) - (((f6 - f5) / 2.0f) + f5);
        }
        long j2 = (long) f2;
        return (j2 * j2) + (13 * j * j);
    }

    public static final boolean o(int i, oc ocVar, yo0 yo0Var, w72 w72Var) {
        yo0 g;
        eo1 eo1Var = new eo1(new yo0[16]);
        if (!yo0Var.m.z) {
            h21.b("visitChildren called on an unattached node");
        }
        eo1 eo1Var2 = new eo1(new ul1[16]);
        ul1 ul1Var = yo0Var.m;
        ul1 ul1Var2 = ul1Var.r;
        if (ul1Var2 == null) {
            s03.b(eo1Var2, ul1Var);
        } else {
            eo1Var2.b(ul1Var2);
        }
        while (true) {
            int i2 = eo1Var2.o;
            if (i2 == 0) {
                break;
            }
            ul1 ul1Var3 = (ul1) eo1Var2.l(i2 - 1);
            if ((ul1Var3.p & 1024) == 0) {
                s03.b(eo1Var2, ul1Var3);
            } else {
                while (true) {
                    if (ul1Var3 == null) {
                        break;
                    }
                    if ((ul1Var3.o & 1024) != 0) {
                        eo1 eo1Var3 = null;
                        while (ul1Var3 != null) {
                            if (ul1Var3 instanceof yo0) {
                                yo0 yo0Var2 = (yo0) ul1Var3;
                                if (yo0Var2.z) {
                                    eo1Var.b(yo0Var2);
                                }
                            } else if ((ul1Var3.o & 1024) != 0 && (ul1Var3 instanceof p90)) {
                                int i3 = 0;
                                for (ul1 ul1Var4 = ((p90) ul1Var3).B; ul1Var4 != null; ul1Var4 = ul1Var4.r) {
                                    if ((ul1Var4.o & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            ul1Var3 = ul1Var4;
                                        } else {
                                            if (eo1Var3 == null) {
                                                eo1Var3 = new eo1(new ul1[16]);
                                            }
                                            if (ul1Var3 != null) {
                                                eo1Var3.b(ul1Var3);
                                                ul1Var3 = null;
                                            }
                                            eo1Var3.b(ul1Var4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            ul1Var3 = s03.c(eo1Var3);
                        }
                    } else {
                        ul1Var3 = ul1Var3.r;
                    }
                }
            }
        }
        while (eo1Var.o != 0 && (g = g(eo1Var, w72Var, i)) != null) {
            if (g.H0().a) {
                return ((Boolean) ocVar.invoke(g)).booleanValue();
            }
            if (i(i, ocVar, g, w72Var)) {
                return true;
            }
            eo1Var.k(g);
        }
        return false;
    }

    public static final long p(String str, long j, long j2, long j3) {
        String str2;
        int i = hs2.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long g = b.g(str2);
        if (g == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = g.longValue();
        if (j2 <= longValue && longValue <= j3) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
    }

    public static int q(String str, int i, int i2) {
        return (int) p(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final f31 r(z21 z21Var) {
        return new f31(z21Var.a, z21Var.b, z21Var.c, z21Var.d);
    }

    public static final Boolean s(int i, oc ocVar, yo0 yo0Var, w72 w72Var) {
        int ordinal = yo0Var.I0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                yo0 C = j8.C(yo0Var);
                if (C == null) {
                    lh.g("ActiveParent must have a focusedChild");
                    return null;
                }
                int ordinal2 = C.I0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean s = s(i, ocVar, C, w72Var);
                        if (!Intrinsics.b(s, Boolean.FALSE)) {
                            return s;
                        }
                        if (w72Var == null) {
                            if (C.I0() != xo0.n) {
                                lh.g("Searching for active node in inactive hierarchy");
                                return null;
                            }
                            yo0 A = j8.A(C);
                            if (A == null) {
                                lh.g("ActiveParent must have a focusedChild");
                                return null;
                            }
                            w72Var = j8.B(A);
                        }
                        return Boolean.valueOf(i(i, ocVar, yo0Var, w72Var));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            a.b();
                            return null;
                        }
                        lh.g("ActiveParent must have a focusedChild");
                        return null;
                    }
                }
                if (w72Var == null) {
                    w72Var = j8.B(C);
                }
                return Boolean.valueOf(i(i, ocVar, yo0Var, w72Var));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return yo0Var.H0().a ? (Boolean) ocVar.invoke(yo0Var) : w72Var == null ? Boolean.valueOf(h(yo0Var, i, ocVar)) : Boolean.valueOf(o(i, ocVar, yo0Var, w72Var));
                }
                a.b();
                return null;
            }
        }
        return Boolean.valueOf(h(yo0Var, i, ocVar));
    }

    public static int t(byte[] bArr, int i, tn0 tn0Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return u(b, bArr, i2, tn0Var);
        }
        tn0Var.a = b;
        return i2;
    }

    public static int u(int i, byte[] bArr, int i2, tn0 tn0Var) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            tn0Var.a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            tn0Var.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            tn0Var.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            tn0Var.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                tn0Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int v(byte[] bArr, int i, tn0 tn0Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            tn0Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        tn0Var.b = j2;
        return i3;
    }

    public static int w(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static long x(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static int y(byte[] bArr, int i, tn0 tn0Var) {
        int t = t(bArr, i, tn0Var);
        int i2 = tn0Var.a;
        if (i2 < 0) {
            ch2.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 == 0) {
            tn0Var.d = BuildConfig.FLAVOR;
            return t;
        }
        int i3 = wp3.a;
        int length = bArr.length;
        if ((((length - t) - i2) | t | i2) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(t), Integer.valueOf(i2)));
        }
        int i4 = t + i2;
        char[] cArr = new char[i2];
        int i5 = 0;
        while (t < i4) {
            byte b = bArr[t];
            if (b < 0) {
                break;
            }
            t++;
            cArr[i5] = (char) b;
            i5++;
        }
        while (t < i4) {
            int i6 = t + 1;
            byte b2 = bArr[t];
            if (b2 >= 0) {
                cArr[i5] = (char) b2;
                i5++;
                t = i6;
                while (t < i4) {
                    byte b3 = bArr[t];
                    if (b3 >= 0) {
                        t++;
                        cArr[i5] = (char) b3;
                        i5++;
                    }
                }
            } else {
                if (b2 >= -32) {
                    if (b2 >= -16) {
                        if (i6 >= i4 - 2) {
                            ch2.m("Protocol message had invalid UTF-8.");
                            return 0;
                        }
                        byte b4 = bArr[i6];
                        int i7 = t + 3;
                        byte b5 = bArr[t + 2];
                        t += 4;
                        byte b6 = bArr[i7];
                        if (!ci2.n(b4)) {
                            if ((((b4 + 112) + (b2 << 28)) >> 30) == 0 && !ci2.n(b5) && !ci2.n(b6)) {
                                int i8 = ((b4 & 63) << 12) | ((b2 & 7) << 18) | ((b5 & 63) << 6) | (b6 & 63);
                                cArr[i5] = (char) ((i8 >>> 10) + 55232);
                                cArr[i5 + 1] = (char) ((i8 & 1023) + 56320);
                                i5 += 2;
                            }
                        }
                        ch2.m("Protocol message had invalid UTF-8.");
                        return 0;
                    }
                    if (i6 >= i4 - 1) {
                        ch2.m("Protocol message had invalid UTF-8.");
                        return 0;
                    }
                    int i9 = i5 + 1;
                    int i10 = t + 2;
                    byte b7 = bArr[i6];
                    t += 3;
                    byte b8 = bArr[i10];
                    if (!ci2.n(b7)) {
                        if (b2 == -32) {
                            if (b7 >= -96) {
                                b2 = -32;
                            }
                        }
                        if (b2 == -19) {
                            if (b7 < -96) {
                                b2 = -19;
                            }
                        }
                        if (!ci2.n(b8)) {
                            cArr[i5] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                            i5 = i9;
                        }
                    }
                    ch2.m("Protocol message had invalid UTF-8.");
                    return 0;
                }
                if (i6 >= i4) {
                    ch2.m("Protocol message had invalid UTF-8.");
                    return 0;
                }
                int i11 = i5 + 1;
                t += 2;
                byte b9 = bArr[i6];
                if (b2 < -62 || ci2.n(b9)) {
                    ch2.m("Protocol message had invalid UTF-8.");
                    return 0;
                }
                cArr[i5] = (char) ((b9 & 63) | ((b2 & 31) << 6));
                i5 = i11;
            }
        }
        tn0Var.d = new String(cArr, 0, i5);
        return i4;
    }

    public static int z(byte[] bArr, int i, tn0 tn0Var) {
        int t = t(bArr, i, tn0Var);
        int i2 = tn0Var.a;
        if (i2 < 0) {
            ch2.m("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - t) {
            ch2.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            tn0Var.d = im3.o;
            return t;
        }
        tn0Var.d = im3.d(bArr, t, i2);
        return t + i2;
    }
}
