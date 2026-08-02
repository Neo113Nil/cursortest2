package n0;

import android.os.Parcel;
import com.google.android.gms.internal.play_billing.AbstractC0217e;
import com.google.android.gms.internal.play_billing.AbstractC0248o0;
import com.google.android.gms.internal.play_billing.C0220f;
import com.google.android.gms.internal.play_billing.InterfaceC0226h;
import com.google.android.gms.internal.play_billing.r2;
import com.google.android.gms.internal.play_billing.s2;
import com.google.android.gms.internal.play_billing.t2;
import com.google.android.gms.internal.play_billing.u2;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: n0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1125E {

    /* renamed from: a, reason: collision with root package name */
    public int f9994a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9995b;

    public /* synthetic */ C1125E(int i3, Object obj) {
        this.f9995b = obj;
        this.f9994a = i3;
    }

    public void a(s2 s2Var) {
        String str;
        C1130J c1130j = (C1130J) this.f9995b;
        int i3 = this.f9994a;
        c1130j.getClass();
        try {
            if (c1130j.f10007H == null) {
                throw null;
            }
            InterfaceC0226h interfaceC0226h = c1130j.f10007H;
            String packageName = c1130j.f10005F.getPackageName();
            switch (i3) {
                case 2:
                    str = "LAUNCH_BILLING_FLOW";
                    break;
                case 3:
                    str = "ACKNOWLEDGE_PURCHASE";
                    break;
                case 4:
                    str = "CONSUME_ASYNC";
                    break;
                case 5:
                    str = "IS_FEATURE_SUPPORTED";
                    break;
                case 6:
                    str = "START_CONNECTION";
                    break;
                case 7:
                    str = "QUERY_PRODUCT_DETAILS_ASYNC";
                    break;
                default:
                    str = "QUERY_SKU_DETAILS_ASYNC";
                    break;
            }
            BinderC1127G binderC1127G = new BinderC1127G(s2Var);
            C0220f c0220f = (C0220f) interfaceC0226h;
            Parcel a3 = c0220f.a();
            a3.writeString(packageName);
            a3.writeString(str);
            int i4 = AbstractC0217e.f2850a;
            a3.writeStrongBinder(binderC1127G);
            c0220f.c(a3, 1);
        } catch (Exception e3) {
            c1130j.Q(107, 28, AbstractC1135O.f10016E);
            AbstractC0248o0.h("BillingClientTesting", "An error occurred while retrieving billing override.", e3);
            s2Var.f2928d = true;
            u2 u2Var = s2Var.f2926b;
            if (u2Var != null) {
                t2 t2Var = u2Var.f2941b;
                t2Var.getClass();
                if (r2.f.v(t2Var, null, 0)) {
                    r2.c(t2Var);
                    s2Var.f2925a = null;
                    s2Var.f2926b = null;
                    s2Var.f2927c = null;
                }
            }
        }
    }

    public C1125E(K0.b bVar, int i3) {
        N0.r.c(bVar);
        this.f9995b = bVar;
        this.f9994a = i3;
    }

    public C1125E(int i3, E1.F[] fArr) {
        this.f9994a = i3;
        this.f9995b = fArr;
    }

    public C1125E(int i3) {
        if (i3 > 0) {
            this.f9995b = new Object[i3];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public C1125E() {
        this.f9994a = 1;
        this.f9995b = Collections.singletonList(null);
    }

    public C1125E(ArrayList arrayList) {
        this.f9994a = 0;
        this.f9995b = arrayList;
    }
}
