package n1;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import o1.AbstractBinderC1363a;
import o1.C1362G;
import o1.InterfaceC1369g;

/* renamed from: n1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1330q extends z {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11408b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11409c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11410d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1330q(C1331r c1331r, InterfaceC1338y interfaceC1338y, l1.b bVar) {
        super(interfaceC1338y);
        this.f11410d = c1331r;
        this.f11409c = bVar;
    }

    @Override // n1.z
    public final void a() {
        InterfaceC1369g c1362g;
        Object obj = this.f11410d;
        Object obj2 = this.f11409c;
        switch (this.f11408b) {
            case 0:
                ((C1331r) obj).f11412d.e((l1.b) obj2);
                break;
            default:
                C1334u c1334u = (C1334u) obj2;
                if (c1334u.i(0)) {
                    G1.g gVar = (G1.g) obj;
                    l1.b bVar = gVar.f925b;
                    if (!bVar.b()) {
                        if (c1334u.f11427l && !bVar.a()) {
                            c1334u.a();
                            c1334u.h();
                            break;
                        } else {
                            c1334u.e(bVar);
                            break;
                        }
                    } else {
                        o1.q qVar = gVar.f926c;
                        o1.u.g(qVar);
                        l1.b bVar2 = qVar.f11591c;
                        if (!bVar2.b()) {
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar2)), new Exception());
                            c1334u.e(bVar2);
                            break;
                        } else {
                            c1334u.f11429n = true;
                            IBinder iBinder = qVar.f11590b;
                            if (iBinder == null) {
                                c1362g = null;
                            } else {
                                int i2 = AbstractBinderC1363a.f11525e;
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                                c1362g = queryLocalInterface instanceof InterfaceC1369g ? (InterfaceC1369g) queryLocalInterface : new C1362G(iBinder);
                            }
                            o1.u.g(c1362g);
                            c1334u.f11430o = c1362g;
                            c1334u.f11431p = qVar.f11592d;
                            c1334u.f11432q = qVar.f11593e;
                            c1334u.h();
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1330q(C1334u c1334u, C1334u c1334u2, G1.g gVar) {
        super(c1334u);
        this.f11409c = c1334u2;
        this.f11410d = gVar;
    }
}
