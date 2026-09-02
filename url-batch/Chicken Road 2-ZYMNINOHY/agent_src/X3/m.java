package X3;

import c3.C0297i;
import com.startapp.sdk.internal.ib;
import com.startapp.sdk.internal.y6;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements InterfaceC1328a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3649b;

    public /* synthetic */ m(int i4, Object obj) {
        this.f3648a = i4;
        this.f3649b = obj;
    }

    @Override // o3.InterfaceC1328a
    public final Object invoke() {
        g gVar;
        switch (this.f3648a) {
            case 0:
                o oVar = (o) this.f3649b;
                if (oVar.n && (gVar = oVar.f3656e) != null) {
                    gVar.start();
                }
                return C0297i.f5732a;
            default:
                return y6.a((ib) this.f3649b);
        }
    }
}
