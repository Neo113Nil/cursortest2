package n0;

import android.os.Parcel;
import com.google.android.gms.internal.play_billing.AbstractC0217e;
import com.google.android.gms.internal.play_billing.r2;
import com.google.android.gms.internal.play_billing.s2;
import com.google.android.gms.internal.play_billing.t2;
import com.google.android.gms.internal.play_billing.u2;

/* renamed from: n0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1127G extends X0.a {

    /* renamed from: c, reason: collision with root package name */
    public final s2 f10000c;

    public BinderC1127G(s2 s2Var) {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback", 2);
        this.f10000c = s2Var;
    }

    @Override // X0.a
    public final boolean e(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        AbstractC0217e.b(parcel);
        Integer valueOf = Integer.valueOf(readInt);
        s2 s2Var = this.f10000c;
        s2Var.f2928d = true;
        u2 u2Var = s2Var.f2926b;
        if (u2Var != null) {
            t2 t2Var = u2Var.f2941b;
            t2Var.getClass();
            if (r2.f.v(t2Var, null, valueOf)) {
                r2.c(t2Var);
                s2Var.f2925a = null;
                s2Var.f2926b = null;
                s2Var.f2927c = null;
            }
        }
        return true;
    }
}
