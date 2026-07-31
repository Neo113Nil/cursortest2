package T0;

import U0.AbstractBinderC0210a;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* renamed from: T0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177l extends w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2309b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2310c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2311d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0177l(C0179n c0179n, v vVar, R0.a aVar) {
        super(vVar);
        this.f2311d = c0179n;
        this.f2310c = aVar;
    }

    @Override // T0.w
    public final void a() {
        U0.f d7;
        int i7 = this.f2309b;
        Object obj = this.f2311d;
        Object obj2 = this.f2310c;
        switch (i7) {
            case 0:
                ((C0179n) obj).f2314i.e((R0.a) obj2);
                break;
            default:
                r rVar = (r) obj2;
                i1.g gVar = (i1.g) obj;
                if (rVar.k(0)) {
                    R0.a aVar = gVar.f4427g;
                    if (!aVar.b()) {
                        if (rVar.f2331q && !aVar.a()) {
                            rVar.a();
                            rVar.i();
                            break;
                        } else {
                            rVar.e(aVar);
                            break;
                        }
                    } else {
                        U0.p pVar = gVar.f4428h;
                        U0.t.f(pVar);
                        R0.a aVar2 = pVar.f2570h;
                        if (!aVar2.b()) {
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(aVar2)), new Exception());
                            rVar.e(aVar2);
                            break;
                        } else {
                            rVar.f2333s = true;
                            IBinder iBinder = pVar.f2569g;
                            if (iBinder == null) {
                                d7 = null;
                            } else {
                                int i8 = AbstractBinderC0210a.f2507d;
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                                d7 = queryLocalInterface instanceof U0.f ? (U0.f) queryLocalInterface : new U0.D(iBinder);
                            }
                            U0.t.f(d7);
                            rVar.f2334t = d7;
                            rVar.f2335u = pVar.f2571i;
                            rVar.f2336v = pVar.f2572j;
                            rVar.i();
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0177l(r rVar, r rVar2, i1.g gVar) {
        super(rVar);
        this.f2310c = rVar2;
        this.f2311d = gVar;
    }
}
