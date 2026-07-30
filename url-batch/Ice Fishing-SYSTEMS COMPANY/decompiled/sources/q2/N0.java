package q2;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.InterfaceC3529lb;
import k2.InterfaceC4644o;

/* loaded from: classes.dex */
public final class N0 implements InterfaceC4644o {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3529lb f39975a;

    /* renamed from: b, reason: collision with root package name */
    public final k2.v f39976b = new k2.v();

    public N0(InterfaceC3529lb interfaceC3529lb) {
        this.f39975a = interfaceC3529lb;
    }

    public final k2.v a() {
        k2.v vVar = this.f39976b;
        try {
            InterfaceC3529lb interfaceC3529lb = this.f39975a;
            if (interfaceC3529lb.h() != null) {
                vVar.b(interfaceC3529lb.h());
                return vVar;
            }
        } catch (RemoteException e6) {
            u2.i.d("Exception occurred while getting video controller", e6);
        }
        return vVar;
    }

    public final boolean b() {
        try {
            return this.f39975a.j();
        } catch (RemoteException e6) {
            u2.i.d("", e6);
            return false;
        }
    }
}
