package E1;

import com.google.android.gms.internal.play_billing.AbstractC0352w;
import com.google.android.gms.internal.play_billing.C0312e1;
import com.google.android.gms.internal.play_billing.C0315f1;
import com.google.android.gms.internal.play_billing.C0318g1;
import com.google.android.gms.internal.play_billing.C0321h1;
import com.google.android.gms.internal.play_billing.C0324i1;
import com.google.android.gms.internal.play_billing.C0327j1;
import com.google.android.gms.internal.play_billing.l1;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public abstract /* synthetic */ class U {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f526a = 0;

    static {
        int i4 = V.f527t0;
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
            int i4 = AbstractC0352w.f6025a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            AbstractC0352w.i("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static C0315f1 b(int i4, int i5, C0037m c0037m, String str, l1 l1Var) {
        try {
            C0324i1 s4 = C0327j1.s();
            int i6 = c0037m.f633a;
            s4.c();
            C0327j1.r((C0327j1) s4.f6024b, i6);
            String str2 = c0037m.f635c;
            s4.c();
            C0327j1.o((C0327j1) s4.f6024b, str2);
            int i7 = c0037m.f634b;
            if (i7 != 0) {
                s4.c();
                C0327j1.p((C0327j1) s4.f6024b, i7);
            }
            if (i4 != 0) {
                s4.d(i4);
            }
            if (str != null) {
                s4.c();
                C0327j1.n((C0327j1) s4.f6024b, str);
            }
            C0312e1 v = C0315f1.v();
            v.d(s4);
            v.f(i5);
            if (!l1Var.equals(l1.BROADCAST_ACTION_UNSPECIFIED)) {
                v.c();
                C0315f1.p((C0315f1) v.f6024b, l1Var);
            }
            return (C0315f1) v.a();
        } catch (Throwable th) {
            AbstractC0352w.i("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static C0321h1 c(int i4, l1 l1Var) {
        try {
            C0318g1 t4 = C0321h1.t();
            t4.c();
            C0321h1.s((C0321h1) t4.f6024b, i4);
            if (!l1Var.equals(l1.BROADCAST_ACTION_UNSPECIFIED)) {
                t4.c();
                C0321h1.o((C0321h1) t4.f6024b, l1Var);
            }
            return (C0321h1) t4.a();
        } catch (Exception e4) {
            AbstractC0352w.i("BillingLogger", "Unable to create logging payload", e4);
            return null;
        }
    }
}
