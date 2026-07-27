package T4;

import a5.EnumC0200b;
import g4.C0471p;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import m2.C1288k;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements InterfaceC1430a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2908b;

    public /* synthetic */ m(int i2, Object obj) {
        this.f2907a = i2;
        this.f2908b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [f4.e, java.lang.Object] */
    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        m5.h hVar;
        switch (this.f2907a) {
            case 0:
                try {
                    return (List) ((InterfaceC1430a) this.f2908b).invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return C0471p.f5750a;
                }
            case 1:
                return (List) this.f2908b;
            case 2:
                a5.t tVar = (a5.t) this.f2908b;
                tVar.getClass();
                try {
                    tVar.f4011x.p(2, 0, false);
                } catch (IOException e3) {
                    EnumC0200b enumC0200b = EnumC0200b.f3918d;
                    tVar.a(enumC0200b, enumC0200b, e3);
                }
                return f4.v.f5689a;
            case 3:
                ((androidx.activity.l) this.f2908b).reportFullyDrawn();
                return null;
            case 4:
                Object[] array = (Object[]) this.f2908b;
                kotlin.jvm.internal.i.e(array, "array");
                return new N4.g(array);
            case 5:
                return new U.e((j5.g) ((C1288k) this.f2908b).f11189f.getValue());
            default:
                m5.n nVar = (m5.n) this.f2908b;
                if (nVar.f11259n && (hVar = nVar.f11250e) != null) {
                    hVar.start();
                }
                return f4.v.f5689a;
        }
    }
}
