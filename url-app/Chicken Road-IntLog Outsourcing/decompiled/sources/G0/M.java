package G0;

import com.google.android.gms.internal.play_billing.AbstractC0357o0;
import com.google.android.gms.internal.play_billing.P1;
import com.google.android.gms.internal.play_billing.Q1;
import com.google.android.gms.internal.play_billing.R1;
import com.google.android.gms.internal.play_billing.S1;
import com.google.android.gms.internal.play_billing.T1;
import com.google.android.gms.internal.play_billing.U1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public abstract /* synthetic */ class M {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f765a = 0;

    static {
        int i2 = N.N;
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
            int i2 = AbstractC0357o0.f5220a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            AbstractC0357o0.h("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static Q1 b(int i2, int i3, C0060j c0060j) {
        try {
            P1 r5 = Q1.r();
            T1 r6 = U1.r();
            r6.e(c0060j.f862a);
            String str = c0060j.f863b;
            r6.d();
            U1.o((U1) r6.f5183b, str);
            r6.f(i2);
            r5.e(r6);
            r5.f(i3);
            return (Q1) r5.b();
        } catch (Exception e3) {
            AbstractC0357o0.h("BillingLogger", "Unable to create logging payload", e3);
            return null;
        }
    }

    public static Q1 c(int i2, int i3, C0060j c0060j, String str) {
        try {
            T1 r5 = U1.r();
            r5.e(c0060j.f862a);
            String str2 = c0060j.f863b;
            r5.d();
            U1.o((U1) r5.f5183b, str2);
            r5.f(i2);
            if (str != null) {
                r5.d();
                U1.n((U1) r5.f5183b, str);
            }
            P1 r6 = Q1.r();
            r6.e(r5);
            r6.f(i3);
            return (Q1) r6.b();
        } catch (Throwable th) {
            AbstractC0357o0.h("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static S1 d(int i2) {
        try {
            R1 q5 = S1.q();
            q5.d();
            S1.p((S1) q5.f5183b, i2);
            return (S1) q5.b();
        } catch (Exception e3) {
            AbstractC0357o0.h("BillingLogger", "Unable to create logging payload", e3);
            return null;
        }
    }
}
