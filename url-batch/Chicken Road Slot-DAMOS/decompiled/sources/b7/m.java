package b7;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m extends x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1313b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1314c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1315d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, w wVar, z6.b bVar) {
        super(wVar);
        this.f1314c = bVar;
        this.f1315d = oVar;
    }

    @Override // b7.x
    public final void a() {
        c7.j q0Var;
        int i3 = this.f1313b;
        Object obj = this.f1315d;
        Object obj2 = this.f1314c;
        switch (i3) {
            case 0:
                ((o) obj).f1323r.k((z6.b) obj2);
                break;
            default:
                s sVar = (s) obj2;
                u7.e eVar = (u7.e) obj;
                if (sVar.m(0)) {
                    z6.b bVar = eVar.f9680e;
                    if (!bVar.c()) {
                        if (sVar.f1355z && !bVar.b()) {
                            sVar.j();
                            sVar.c();
                            break;
                        } else {
                            sVar.k(bVar);
                            break;
                        }
                    } else {
                        c7.w wVar = eVar.f9681i;
                        c7.c0.g(wVar);
                        z6.b bVar2 = wVar.f1996i;
                        if (!bVar2.c()) {
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar2)), new Exception());
                            sVar.k(bVar2);
                            break;
                        } else {
                            sVar.B = true;
                            IBinder iBinder = wVar.f1995e;
                            if (iBinder == null) {
                                q0Var = null;
                            } else {
                                int i10 = c7.a.f1870e;
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                                q0Var = queryLocalInterface instanceof c7.j ? (c7.j) queryLocalInterface : new c7.q0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                            }
                            c7.c0.g(q0Var);
                            sVar.C = q0Var;
                            sVar.D = wVar.f1997r;
                            sVar.E = wVar.f1998s;
                            sVar.c();
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, s sVar, s sVar2, u7.e eVar) {
        super(sVar);
        this.f1314c = sVar2;
        this.f1315d = eVar;
    }
}
