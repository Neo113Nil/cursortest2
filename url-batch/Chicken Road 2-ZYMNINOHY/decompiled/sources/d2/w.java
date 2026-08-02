package d2;

import a2.C0162b;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class w extends p {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f8306g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f8307h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.google.android.gms.common.internal.a aVar, int i4, IBinder iBinder, Bundle bundle) {
        super(aVar, i4, bundle);
        this.f8307h = aVar;
        this.f8306g = iBinder;
    }

    @Override // d2.p
    public final void a(C0162b c0162b) {
        h hVar = this.f8307h.o;
        if (hVar != null) {
            ((b2.h) hVar.f8268a).c(c0162b);
        }
        System.currentTimeMillis();
    }

    @Override // d2.p
    public final boolean b() {
        IBinder iBinder = this.f8306g;
        try {
            s.c(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            com.google.android.gms.common.internal.a aVar = this.f8307h;
            if (!aVar.r().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + aVar.r() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface n = aVar.n(iBinder);
            if (n == null || !(com.google.android.gms.common.internal.a.v(aVar, 2, 4, n) || com.google.android.gms.common.internal.a.v(aVar, 3, 4, n))) {
                return false;
            }
            aVar.f5794s = null;
            h hVar = aVar.n;
            if (hVar == null) {
                return true;
            }
            ((b2.g) hVar.f8268a).b();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
