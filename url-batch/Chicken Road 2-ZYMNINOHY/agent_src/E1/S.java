package E1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.play_billing.AbstractBinderC0319h;
import com.google.android.gms.internal.play_billing.AbstractC0352w;
import com.google.android.gms.internal.play_billing.C0316g;
import com.google.android.gms.internal.play_billing.InterfaceC0322i;

/* loaded from: classes.dex */
public final class S implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T f521a;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0322i c0316g;
        AbstractC0352w.g("BillingClientTesting", "Billing Override Service connected.");
        T t4 = this.f521a;
        int i4 = AbstractBinderC0319h.f5955b;
        if (iBinder == null) {
            c0316g = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
            c0316g = queryLocalInterface instanceof InterfaceC0322i ? (InterfaceC0322i) queryLocalInterface : new C0316g(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 0);
        }
        t4.f524J = c0316g;
        t4.f523I = 2;
        t4.R(26);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC0352w.h("BillingClientTesting", "Billing Override Service disconnected.");
        T t4 = this.f521a;
        t4.f524J = null;
        t4.f523I = 0;
    }
}
