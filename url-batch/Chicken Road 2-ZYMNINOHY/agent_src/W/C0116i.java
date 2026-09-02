package W;

import E1.X;
import T.C0095m;
import android.os.Handler;
import android.os.Message;
import java.util.Iterator;

/* renamed from: W.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0116i implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3311a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3312b;

    public /* synthetic */ C0116i(int i4, Object obj) {
        this.f3311a = i4;
        this.f3312b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f3311a) {
            case 0:
                n nVar = (n) this.f3312b;
                InterfaceC0119l interfaceC0119l = nVar.f3323c;
                interfaceC0119l.getClass();
                Iterator it = nVar.f3324d.iterator();
                while (it.hasNext()) {
                    C0120m c0120m = (C0120m) it.next();
                    if (!c0120m.f3320d && c0120m.f3319c) {
                        C0095m b4 = c0120m.f3318b.b();
                        c0120m.f3318b = new X();
                        c0120m.f3319c = false;
                        interfaceC0119l.b(c0120m.f3317a, b4);
                    }
                    F f4 = nVar.f3322b;
                    f4.getClass();
                    if (f4.f3257a.hasMessages(1)) {
                        break;
                    }
                }
                break;
            default:
                B b5 = (B) this.f3312b;
                b5.getClass();
                int i4 = message.what;
                if (i4 == 1) {
                    b5.f3248g.a();
                    break;
                } else if (i4 == 2) {
                    b5.f3249h.a();
                    break;
                } else if (i4 == 3) {
                    b5.f3250i.a();
                    break;
                } else if (i4 == 4) {
                    b5.f3251j.a();
                    break;
                }
                break;
        }
        return true;
    }
}
