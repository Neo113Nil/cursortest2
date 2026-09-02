package E1;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.internal.play_billing.AbstractC0352w;
import com.google.android.gms.internal.play_billing.C0298a;
import com.google.android.gms.internal.play_billing.InterfaceC0304c;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class G implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f493a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0029e f494b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f495c;

    public /* synthetic */ G(C0029e c0029e, Object obj, int i4) {
        this.f493a = i4;
        this.f494b = c0029e;
        this.f495c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        InterfaceC0304c interfaceC0304c;
        InterfaceC0304c interfaceC0304c2;
        InterfaceC0304c interfaceC0304c3;
        switch (this.f493a) {
            case 0:
                C0029e c0029e = this.f494b;
                io.flutter.plugins.inapppurchase.f fVar = (io.flutter.plugins.inapppurchase.f) this.f495c;
                c0029e.getClass();
                try {
                    if (!c0029e.x()) {
                        AbstractC0352w.h("BillingClient", "Service disconnected.");
                        C0037m c0037m = W.f542j;
                        c0029e.J(2, 13, c0037m);
                        fVar.e(c0037m, null);
                    } else if (c0029e.v) {
                        synchronized (c0029e.f594a) {
                            interfaceC0304c = c0029e.f602i;
                        }
                        if (interfaceC0304c == null) {
                            c0029e.o(fVar, W.f542j, 107, null);
                        } else {
                            String packageName = c0029e.f600g.getPackageName();
                            String str = c0029e.f596c;
                            String str2 = c0029e.f597d;
                            long longValue = c0029e.f592F.longValue();
                            int i4 = AbstractC0352w.f6025a;
                            Bundle bundle = new Bundle();
                            AbstractC0352w.b(bundle, str, str2, longValue);
                            ((C0298a) interfaceC0304c).n(packageName, bundle, new L(fVar, c0029e.f601h, c0029e.f606m, (byte) 0));
                        }
                    } else {
                        AbstractC0352w.h("BillingClient", "Current client doesn't support get billing config.");
                        C0037m c0037m2 = W.f553x;
                        c0029e.J(32, 13, c0037m2);
                        fVar.e(c0037m2, null);
                    }
                } catch (DeadObjectException e4) {
                    c0029e.o(fVar, W.f542j, 62, e4);
                } catch (Exception e5) {
                    c0029e.o(fVar, W.f540h, 62, e5);
                }
                return null;
            case 1:
                C0029e c0029e2 = this.f494b;
                io.flutter.plugins.inapppurchase.f fVar2 = (io.flutter.plugins.inapppurchase.f) this.f495c;
                c0029e2.getClass();
                try {
                    if (!c0029e2.x()) {
                        c0029e2.n(fVar2, W.f542j, 2, null);
                    } else if (c0029e2.f615y) {
                        synchronized (c0029e2.f594a) {
                            interfaceC0304c2 = c0029e2.f602i;
                        }
                        if (interfaceC0304c2 == null) {
                            c0029e2.n(fVar2, W.f542j, 107, null);
                        } else {
                            String packageName2 = c0029e2.f600g.getPackageName();
                            String str3 = c0029e2.f596c;
                            String str4 = c0029e2.f597d;
                            long longValue2 = c0029e2.f592F.longValue();
                            int i5 = AbstractC0352w.f6025a;
                            Bundle bundle2 = new Bundle();
                            AbstractC0352w.b(bundle2, str3, str4, longValue2);
                            ((C0298a) interfaceC0304c2).l(packageName2, bundle2, new L(fVar2, c0029e2.f601h, c0029e2.f606m));
                        }
                    } else {
                        AbstractC0352w.h("BillingClient", "Current client doesn't support alternative billing only.");
                        c0029e2.n(fVar2, W.f530C, 66, null);
                    }
                } catch (DeadObjectException e6) {
                    c0029e2.n(fVar2, W.f542j, 70, e6);
                } catch (Exception e7) {
                    c0029e2.n(fVar2, W.f540h, 70, e7);
                }
                return null;
            default:
                C0029e c0029e3 = this.f494b;
                io.flutter.plugins.inapppurchase.f fVar3 = (io.flutter.plugins.inapppurchase.f) this.f495c;
                c0029e3.getClass();
                try {
                    if (!c0029e3.x()) {
                        c0029e3.l(fVar3, W.f542j, 2, null);
                    } else if (c0029e3.f615y) {
                        synchronized (c0029e3.f594a) {
                            interfaceC0304c3 = c0029e3.f602i;
                        }
                        if (interfaceC0304c3 == null) {
                            c0029e3.l(fVar3, W.f542j, 107, null);
                        } else {
                            String packageName3 = c0029e3.f600g.getPackageName();
                            String str5 = c0029e3.f596c;
                            String str6 = c0029e3.f597d;
                            long longValue3 = c0029e3.f592F.longValue();
                            int i6 = AbstractC0352w.f6025a;
                            Bundle bundle3 = new Bundle();
                            AbstractC0352w.b(bundle3, str5, str6, longValue3);
                            ((C0298a) interfaceC0304c3).o(packageName3, bundle3, new L(fVar3, c0029e3.f601h, c0029e3.f606m, (char) 0));
                        }
                    } else {
                        AbstractC0352w.h("BillingClient", "Current client doesn't support alternative billing only.");
                        c0029e3.l(fVar3, W.f530C, 66, null);
                    }
                } catch (DeadObjectException e8) {
                    c0029e3.l(fVar3, W.f542j, 69, e8);
                } catch (Exception e9) {
                    c0029e3.l(fVar3, W.f540h, 69, e9);
                }
                return null;
        }
    }
}
