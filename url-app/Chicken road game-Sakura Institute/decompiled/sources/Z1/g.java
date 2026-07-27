package Z1;

import android.content.Context;
import t2.C1209f;
import u2.InterfaceC1229b;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements InterfaceC1229b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4570a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4571b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4572c;

    public /* synthetic */ g(Object obj, int i2, Object obj2) {
        this.f4570a = i2;
        this.f4571b = obj;
        this.f4572c = obj2;
    }

    @Override // u2.InterfaceC1229b
    public final Object get() {
        switch (this.f4570a) {
            case 0:
                h hVar = (h) this.f4571b;
                hVar.getClass();
                b bVar = (b) this.f4572c;
                return bVar.f4565e.d(new v(bVar, hVar));
            default:
                return new C1209f((Context) this.f4571b, (String) this.f4572c);
        }
    }
}
