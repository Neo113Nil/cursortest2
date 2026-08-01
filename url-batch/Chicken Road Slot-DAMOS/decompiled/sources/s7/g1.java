package s7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.s5;
import com.google.android.gms.internal.measurement.t5;
import com.google.android.gms.internal.measurement.u5;
import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g1 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final String f8704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f8705b;

    public g1(h1 h1Var, String str) {
        Objects.requireNonNull(h1Var);
        this.f8705b = h1Var;
        this.f8704a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        h1 h1Var = this.f8705b;
        if (iBinder == null) {
            v0 v0Var = h1Var.f8724e.f8937t;
            q1.l(v0Var);
            v0Var.f9053w.a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i3 = t5.f2810d;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            u5 s5Var = queryLocalInterface instanceof u5 ? (u5) queryLocalInterface : new s5(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 0);
            q1 q1Var = h1Var.f8724e;
            v0 v0Var2 = q1Var.f8937t;
            q1.l(v0Var2);
            v0Var2.B.a("Install Referrer Service connected");
            o1 o1Var = q1Var.f8938u;
            q1.l(o1Var);
            o1Var.B(new f8.j0(this, s5Var, this));
        } catch (RuntimeException e2) {
            v0 v0Var3 = h1Var.f8724e.f8937t;
            q1.l(v0Var3);
            v0Var3.f9053w.b(e2, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        v0 v0Var = this.f8705b.f8724e.f8937t;
        q1.l(v0Var);
        v0Var.B.a("Install Referrer Service disconnected");
    }
}
