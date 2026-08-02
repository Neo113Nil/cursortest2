package n0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.play_billing.AbstractBinderC0223g;
import com.google.android.gms.internal.play_billing.AbstractC0248o0;
import com.google.android.gms.internal.play_billing.C0220f;
import com.google.android.gms.internal.play_billing.InterfaceC0226h;
import com.google.android.gms.internal.play_billing.S1;
import java.util.Objects;

/* renamed from: n0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC1129I implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1130J f10004a;

    public /* synthetic */ ServiceConnectionC1129I(C1130J c1130j) {
        this.f10004a = c1130j;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0226h c0220f;
        AbstractC0248o0.f("BillingClientTesting", "Billing Override Service connected.");
        C1130J c1130j = this.f10004a;
        int i3 = AbstractBinderC0223g.f2861c;
        if (iBinder == null) {
            c0220f = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
            c0220f = queryLocalInterface instanceof InterfaceC0226h ? (InterfaceC0226h) queryLocalInterface : new C0220f(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 1);
        }
        c1130j.f10007H = c0220f;
        this.f10004a.f10006G = 2;
        C1130J c1130j2 = this.f10004a;
        c1130j2.getClass();
        S1 d3 = AbstractC1133M.d(26);
        Objects.requireNonNull(d3, "ApiSuccess should not be null");
        c1130j2.f10070g.x(d3);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC0248o0.g("BillingClientTesting", "Billing Override Service disconnected.");
        this.f10004a.f10007H = null;
        this.f10004a.f10006G = 0;
    }
}
