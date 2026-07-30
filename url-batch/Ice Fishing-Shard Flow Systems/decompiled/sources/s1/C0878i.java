package s1;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import t1.AbstractBinderC0914a;
import t1.C0912I;
import t1.InterfaceC0919f;

/* renamed from: s1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0878i extends AbstractC0887r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7664b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7665c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7666d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0878i(C0880k c0880k, InterfaceC0886q interfaceC0886q, q1.b bVar) {
        super(interfaceC0886q);
        this.f7665c = bVar;
        this.f7666d = c0880k;
    }

    @Override // s1.AbstractC0887r
    public final void a() {
        InterfaceC0919f c0912i;
        int i2 = this.f7664b;
        Object obj = this.f7666d;
        Object obj2 = this.f7665c;
        switch (i2) {
            case 0:
                ((C0880k) obj).f7669l.j((q1.b) obj2);
                break;
            default:
                C0883n c0883n = (C0883n) obj2;
                I1.h hVar = (I1.h) obj;
                if (c0883n.m(0)) {
                    q1.b bVar = hVar.f1275e;
                    if (!bVar.b()) {
                        if (c0883n.f7687t && !bVar.a()) {
                            c0883n.g();
                            c0883n.d();
                            break;
                        } else {
                            c0883n.j(bVar);
                            break;
                        }
                    } else {
                        t1.r rVar = hVar.f1276i;
                        t1.u.f(rVar);
                        q1.b bVar2 = rVar.f7991i;
                        if (!bVar2.b()) {
                            Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar2)), new Exception());
                            c0883n.j(bVar2);
                            break;
                        } else {
                            c0883n.f7689v = true;
                            IBinder iBinder = rVar.f7990e;
                            if (iBinder == null) {
                                c0912i = null;
                            } else {
                                int i5 = AbstractBinderC0914a.f7923f;
                                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                                c0912i = queryLocalInterface instanceof InterfaceC0919f ? (InterfaceC0919f) queryLocalInterface : new C0912I(iBinder);
                            }
                            t1.u.f(c0912i);
                            c0883n.f7690w = c0912i;
                            c0883n.f7691x = rVar.f7992l;
                            c0883n.f7692y = rVar.f7993m;
                            c0883n.d();
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0878i(BinderC0881l binderC0881l, C0883n c0883n, C0883n c0883n2, I1.h hVar) {
        super(c0883n);
        this.f7665c = c0883n2;
        this.f7666d = hVar;
    }
}
