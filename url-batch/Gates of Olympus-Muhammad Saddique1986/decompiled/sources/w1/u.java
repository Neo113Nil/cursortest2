package w1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class u implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f9906a;

    public u(v vVar) {
        this.f9906a = vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [w1.n] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m mVar;
        f2.j.f(componentName, "name");
        f2.j.f(iBinder, "service");
        int i3 = w.f9916d;
        IInterface queryLocalInterface = iBinder.queryLocalInterface(n.f9882b);
        if (queryLocalInterface == null || !(queryLocalInterface instanceof n)) {
            m mVar2 = new m();
            mVar2.f9881c = iBinder;
            mVar = mVar2;
        } else {
            mVar = (n) queryLocalInterface;
        }
        v vVar = this.f9906a;
        vVar.f9911e = mVar;
        vVar.f9908b.execute(vVar.f9914h);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        f2.j.f(componentName, "name");
        v vVar = this.f9906a;
        vVar.f9908b.execute(vVar.f9915i);
        vVar.f9911e = null;
    }
}
