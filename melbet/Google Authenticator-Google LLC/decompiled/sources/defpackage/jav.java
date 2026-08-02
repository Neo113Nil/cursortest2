package defpackage;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jav {
    public static String a(String str) {
        return "cn_".concat(String.valueOf(str));
    }

    public static void b(String str, String str2, Object... objArr) {
        if (f(str, 3)) {
            r(str2, q(objArr), objArr);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        Log.e(a(str), str2, th);
    }

    public static void d(String str, String str2, Object... objArr) {
        if (f(str, 2)) {
            r(str2, q(objArr), objArr);
        }
    }

    public static void e(String str, String str2) {
        Log.w(a(str), str2);
    }

    public static boolean f(String str, int i) {
        return Log.isLoggable(str, i);
    }

    public static int g(int i) {
        switch (i) {
            case -1:
                return 1;
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return 14;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return 15;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 16;
            case 15:
                return 17;
            case 16:
                return 18;
            case 17:
                return 19;
            default:
                return 0;
        }
    }

    public static int h(int i) {
        if (i == 99) {
            return 100;
        }
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return 13;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return 14;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            default:
                return 0;
        }
    }

    public static final Object i(ddi ddiVar, kqj kqjVar) {
        if (!ddiVar.e()) {
            kuw kuwVar = new kuw(ixe.d(kqjVar), 1);
            kuwVar.y();
            ddiVar.h(blz.a, new lee(kuwVar));
            return kuwVar.l();
        }
        Exception c = ddiVar.c();
        if (c != null) {
            throw c;
        }
        if (((ddm) ddiVar).c) {
            throw new CancellationException(a.ab(ddiVar, "Task ", " was cancelled normally."));
        }
        return ddiVar.d();
    }

    public static final Object j(lcy lcyVar, boolean z, Object obj, krx krxVar) {
        Object kveVar;
        Object C;
        try {
            if (krxVar instanceof kqu) {
                ksy.b(krxVar, 2);
                kveVar = krxVar.a(obj, lcyVar);
            } else {
                kveVar = ixe.b(krxVar, obj, lcyVar);
            }
        } catch (kvw e) {
            Throwable th = e.a;
            lcyVar.Q(new kve(th, false));
            kqj kqjVar = lcyVar.c;
            if (kvo.b && (kqjVar instanceof kqx)) {
                throw lda.a(th, (kqx) kqjVar);
            }
            throw th;
        } catch (Throwable th2) {
            kveVar = new kve(th2, false);
        }
        kqp kqpVar = kqp.a;
        if (kveVar == kqpVar || (C = lcyVar.C(kveVar)) == kxc.c) {
            return kqpVar;
        }
        lcyVar.m();
        if (!(C instanceof kve)) {
            return kxc.b(C);
        }
        if (!z) {
            Throwable th3 = ((kve) C).b;
            if ((th3 instanceof kxw) && ((kxw) th3).a == lcyVar) {
                if (!(kveVar instanceof kve)) {
                    return kveVar;
                }
                Throwable th4 = ((kve) kveVar).b;
                kqj kqjVar2 = lcyVar.c;
                if (!kvo.b) {
                    throw th4;
                }
                if (kqjVar2 instanceof kqx) {
                    throw lda.a(th4, (kqx) kqjVar2);
                }
                throw th4;
            }
        }
        Throwable th5 = ((kve) C).b;
        kqj kqjVar3 = lcyVar.c;
        if (!kvo.b) {
            throw th5;
        }
        if (kqjVar3 instanceof kqx) {
            throw lda.a(th5, (kqx) kqjVar3);
        }
        throw th5;
    }

    public static final void k(kqj kqjVar, kqj kqjVar2) {
        try {
            lcd.a(ixe.d(kqjVar), kow.a);
        } catch (Throwable th) {
            s(kqjVar2, th);
        }
    }

    public static final void l(krx krxVar, Object obj, kqj kqjVar) {
        try {
            lcd.a(ixe.d(ixe.c(krxVar, obj, kqjVar)), kow.a);
        } catch (Throwable th) {
            s(kqjVar, th);
        }
    }

    public static final boolean m(String str, boolean z) {
        String a = ldc.a(str);
        return a != null ? Boolean.parseBoolean(a) : z;
    }

    public static final int n(String str, int i, int i2) {
        return (int) o(str, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long o(String str, long j, long j2) {
        int i;
        Long valueOf;
        String a = ldc.a(str);
        if (a == null) {
            return j;
        }
        int length = a.length();
        if (length != 0) {
            boolean z = false;
            char charAt = a.charAt(0);
            long j3 = -9223372036854775807L;
            if (charAt < '0') {
                i = 1;
                if (length != 1) {
                    if (charAt != '+') {
                        if (charAt == '-') {
                            j3 = Long.MIN_VALUE;
                            z = true;
                        }
                    }
                }
            } else {
                i = 0;
            }
            long j4 = -256204778801521550L;
            long j5 = 0;
            long j6 = -256204778801521550L;
            while (i < length) {
                int digit = Character.digit((int) a.charAt(i), 10);
                if (digit >= 0) {
                    if (j5 < j6) {
                        if (j6 == j4) {
                            j6 = -922337203685477580L;
                            if (j5 < -922337203685477580L) {
                            }
                        }
                    }
                    long j7 = j5 * 10;
                    long j8 = digit;
                    if (j7 >= j3 + j8) {
                        j5 = j7 - j8;
                        i++;
                        j4 = -256204778801521550L;
                    }
                }
            }
            valueOf = z ? Long.valueOf(j5) : Long.valueOf(-j5);
            if (valueOf != null) {
                throw new IllegalStateException("System property '" + str + "' has unrecognized value '" + a + "'");
            }
            long longValue = valueOf.longValue();
            if (longValue >= 1 && longValue <= j2) {
                return longValue;
            }
            throw new IllegalStateException("System property '" + str + "' should be in range 1.." + j2 + ", but is '" + longValue + "'");
        }
        valueOf = null;
        if (valueOf != null) {
        }
    }

    public static final long p(long j, int i) {
        return (j & (-1073741824)) | i;
    }

    private static Throwable q(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        Object obj = objArr[0];
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        return null;
    }

    private static void r(String str, Throwable th, Object[] objArr) {
        if (th != null || objArr.length <= 0) {
            return;
        }
        String.format(Locale.US, str, objArr);
    }

    private static final void s(kqj kqjVar, Throwable th) {
        if (th instanceof kvw) {
            th = ((kvw) th).a;
        }
        kqjVar.ca(ixc.X(th));
        throw th;
    }
}
