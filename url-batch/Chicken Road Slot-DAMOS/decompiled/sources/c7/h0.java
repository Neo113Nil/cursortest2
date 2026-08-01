package c7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f1923a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f1924b;

    public h0(f fVar, int i3) {
        this.f1924b = fVar;
        this.f1923a = i3;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i3;
        int i10;
        f fVar = this.f1924b;
        if (iBinder == null) {
            synchronized (fVar.f1887l) {
                i3 = fVar.f1894s;
            }
            if (i3 == 3) {
                fVar.A = true;
                i10 = 5;
            } else {
                i10 = 4;
            }
            f0 f0Var = fVar.f1886k;
            f0Var.sendMessage(f0Var.obtainMessage(i10, fVar.C.get(), 16));
            return;
        }
        synchronized (fVar.f1888m) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                fVar.f1889n = (queryLocalInterface == null || !(queryLocalInterface instanceof y)) ? new y(iBinder) : (y) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar2 = this.f1924b;
        int i11 = this.f1923a;
        fVar2.getClass();
        j0 j0Var = new j0(fVar2, 0, null);
        f0 f0Var2 = fVar2.f1886k;
        f0Var2.sendMessage(f0Var2.obtainMessage(7, i11, -1, j0Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        f fVar = this.f1924b;
        synchronized (fVar.f1888m) {
            fVar.f1889n = null;
        }
        f fVar2 = this.f1924b;
        int i3 = this.f1923a;
        f0 f0Var = fVar2.f1886k;
        f0Var.sendMessage(f0Var.obtainMessage(6, i3, 1));
    }
}
