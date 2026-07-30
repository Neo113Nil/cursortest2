package Q0;

import B2.D;
import J0.s;
import N1.p;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C2892Zf;
import com.google.android.gms.internal.ads.C3562m7;
import com.google.android.gms.internal.ads.C3781qA;
import com.google.android.gms.internal.ads.Gv;
import com.google.android.gms.internal.ads.Mv;
import java.util.Objects;
import q2.r;

/* loaded from: classes.dex */
public final class h extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2707a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2708b;

    public /* synthetic */ h(int i, Object obj) {
        this.f2707a = i;
        this.f2708b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f2707a) {
            case 1:
                p.f().post(new D(1, this, true));
                break;
            case 2:
            default:
                super.onAvailable(network);
                break;
            case 3:
                ((C2892Zf) this.f2708b).f29026p.set(true);
                break;
            case 4:
                Gv gv = (Gv) this.f2708b;
                gv.getClass();
                if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.f31409C)).booleanValue()) {
                    gv.a(true);
                    break;
                }
                break;
            case 5:
                ((Mv) this.f2708b).b(true);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
        switch (this.f2707a) {
            case 0:
                kotlin.jvm.internal.h.e(network, "network");
                kotlin.jvm.internal.h.e(capabilities, "capabilities");
                s.d().a(j.f2711a, "Network capabilities changed: " + capabilities);
                i iVar = (i) this.f2708b;
                iVar.c(j.a(iVar.f2709f));
                return;
            case 2:
                synchronized (C3562m7.class) {
                    ((C3562m7) this.f2708b).f32668u = capabilities;
                }
                return;
            case 6:
                C3781qA c3781qA = (C3781qA) this.f2708b;
                synchronized (c3781qA) {
                    c3781qA.f33664c = capabilities;
                }
                return;
            default:
                super.onCapabilitiesChanged(network, capabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f2707a) {
            case 0:
                kotlin.jvm.internal.h.e(network, "network");
                s.d().a(j.f2711a, "Network connection lost");
                i iVar = (i) this.f2708b;
                iVar.c(j.a(iVar.f2709f));
                return;
            case 1:
                p.f().post(new D(1, this, false));
                return;
            case 2:
                synchronized (C3562m7.class) {
                    ((C3562m7) this.f2708b).f32668u = null;
                }
                return;
            case 3:
                ((C2892Zf) this.f2708b).f29026p.set(false);
                return;
            case 4:
                Gv gv = (Gv) this.f2708b;
                gv.getClass();
                if (((Boolean) r.f40116e.f40119c.a(AbstractC3368ia.f31409C)).booleanValue()) {
                    gv.a(false);
                    return;
                }
                return;
            case 5:
                ((Mv) this.f2708b).b(false);
                return;
            default:
                C3781qA c3781qA = (C3781qA) this.f2708b;
                synchronized (c3781qA) {
                    c3781qA.f33664c = null;
                }
                return;
        }
    }

    public h(C2892Zf c2892Zf) {
        this.f2707a = 3;
        Objects.requireNonNull(c2892Zf);
        this.f2708b = c2892Zf;
    }

    public h(Gv gv) {
        this.f2707a = 4;
        Objects.requireNonNull(gv);
        this.f2708b = gv;
    }

    public h(Mv mv) {
        this.f2707a = 5;
        Objects.requireNonNull(mv);
        this.f2708b = mv;
    }

    public h(C3781qA c3781qA) {
        this.f2707a = 6;
        Objects.requireNonNull(c3781qA);
        this.f2708b = c3781qA;
    }
}
