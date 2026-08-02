package B;

import E1.A;
import E1.C0037m;
import E1.InterfaceC0044u;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h implements D.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f169b;

    public /* synthetic */ h(int i4, Object obj) {
        this.f168a = i4;
        this.f169b = obj;
    }

    @Override // D.a, androidx.window.extensions.core.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f168a) {
            case 0:
                i iVar = (i) obj;
                if (iVar == null) {
                    iVar = new i(-3);
                }
                ((l2.e) this.f169b).s(iVar);
                return;
            case 1:
                i iVar2 = (i) obj;
                synchronized (j.f174c) {
                    try {
                        p.j jVar = j.f175d;
                        ArrayList arrayList = (ArrayList) jVar.get((String) this.f169b);
                        if (arrayList == null) {
                            return;
                        }
                        jVar.remove((String) this.f169b);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            ((D.a) arrayList.get(i4)).accept(iVar2);
                        }
                        return;
                    } finally {
                    }
                }
            case 2:
                A a3 = new A(new ArrayList(), new ArrayList());
                ((InterfaceC0044u) this.f169b).onProductDetailsResponse((C0037m) obj, a3);
                return;
            default:
                ((io.flutter.plugins.inapppurchase.f) this.f169b).a((C0037m) obj);
                return;
        }
    }
}
