package n0;

import U1.C0084e;
import java.util.ArrayList;
import java.util.function.Consumer;

/* renamed from: n0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1124D implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9992a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9993b;

    public /* synthetic */ C1124D(int i3, Object obj) {
        this.f9992a = i3;
        this.f9993b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f9992a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ((InterfaceC1153o) this.f9993b).onProductDetailsResponse((C1147i) obj, arrayList);
                break;
            case 1:
                B0.g gVar = (B0.g) this.f9993b;
                ((C0084e) gVar.f131b).a(S0.a.j((C1147i) obj));
                break;
            default:
                ((B0.g) this.f9993b).b((C1147i) obj);
                break;
        }
    }

    public /* synthetic */ C1124D(B0.g gVar, C1148j c1148j) {
        this.f9992a = 1;
        this.f9993b = gVar;
    }
}
