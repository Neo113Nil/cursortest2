package n0;

import com.google.android.gms.internal.play_billing.AbstractC0248o0;
import com.google.android.gms.internal.play_billing.P1;
import com.google.android.gms.internal.play_billing.Q1;
import com.google.android.gms.internal.play_billing.R1;
import com.google.android.gms.internal.play_billing.S1;
import com.google.android.gms.internal.play_billing.T1;
import com.google.android.gms.internal.play_billing.U1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: n0.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1133M {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f10010a = 0;

    static {
        int i3 = InterfaceC1134N.f10011w0;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + StringUtils.PROCESS_POSTFIX_DELIMITER + message;
            int i3 = AbstractC0248o0.f2894a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            AbstractC0248o0.h("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static Q1 b(int i3, int i4, C1147i c1147i) {
        try {
            P1 r3 = Q1.r();
            T1 r4 = U1.r();
            r4.e(c1147i.f10092a);
            String str = c1147i.f10093b;
            r4.d();
            U1.o((U1) r4.f2860b, str);
            r4.f(i3);
            r3.e(r4);
            r3.f(i4);
            return (Q1) r3.b();
        } catch (Exception e3) {
            AbstractC0248o0.h("BillingLogger", "Unable to create logging payload", e3);
            return null;
        }
    }

    public static Q1 c(int i3, int i4, C1147i c1147i, String str) {
        try {
            T1 r3 = U1.r();
            r3.e(c1147i.f10092a);
            String str2 = c1147i.f10093b;
            r3.d();
            U1.o((U1) r3.f2860b, str2);
            r3.f(i3);
            if (str != null) {
                r3.d();
                U1.n((U1) r3.f2860b, str);
            }
            P1 r4 = Q1.r();
            r4.e(r3);
            r4.f(i4);
            return (Q1) r4.b();
        } catch (Throwable th) {
            AbstractC0248o0.h("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static S1 d(int i3) {
        try {
            R1 q3 = S1.q();
            q3.d();
            S1.p((S1) q3.f2860b, i3);
            return (S1) q3.b();
        } catch (Exception e3) {
            AbstractC0248o0.h("BillingLogger", "Unable to create logging payload", e3);
            return null;
        }
    }
}
