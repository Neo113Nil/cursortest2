package k2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC2598Ia;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import q2.F0;
import q2.InterfaceC4876D;
import q2.f1;
import u2.AbstractC5108b;

/* renamed from: k2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4634e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f38702a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4876D f38703b;

    public C4634e(Context context, InterfaceC4876D interfaceC4876D) {
        this.f38702a = context;
        this.f38703b = interfaceC4876D;
    }

    public final void a(F0 f02) {
        Context context = this.f38702a;
        AbstractC3368ia.a(context);
        if (((Boolean) AbstractC2598Ia.f25568c.r()).booleanValue()) {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Cc)).booleanValue()) {
                AbstractC5108b.f41223b.execute(new h3.l(this, f02, 2, false));
                return;
            }
        }
        try {
            this.f38703b.f0(f1.a(context, f02));
        } catch (RemoteException e6) {
            u2.i.d("Failed to load ad.", e6);
        }
    }
}
