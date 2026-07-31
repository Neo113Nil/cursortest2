package L1;

import android.app.Application;
import android.webkit.WebSettings;
import com.gatesof.olympus.martu.marku.salon.SalonDepot;
import e2.InterfaceC0426e;
import java.util.ArrayList;
import n2.AbstractC0730j;
import n2.AbstractC0737q;
import q2.AbstractC0837y;
import q2.InterfaceC0835w;

/* renamed from: L1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0200a extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public int f3352h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3353i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f3354j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f3355k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ G1.m f3356l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0200a(String str, String str2, G1.m mVar, V1.d dVar) {
        super(2, dVar);
        this.f3354j = str;
        this.f3355k = str2;
        this.f3356l = mVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0200a) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0200a c0200a = new C0200a(this.f3354j, this.f3355k, this.f3356l, dVar);
        c0200a.f3353i = obj;
        return c0200a;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        Object b3;
        Object b4;
        G1.m mVar = this.f3356l;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f3352h;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.a.e(obj);
            return obj;
        }
        R1.a.e(obj);
        String str = this.f3354j;
        if (AbstractC0730j.K(str)) {
            return null;
        }
        if (!AbstractC0737q.r(str, "/", false)) {
            str = str.concat("/");
        }
        try {
            f2.j.f(str, "<this>");
            G2.m mVar2 = new G2.m();
            mVar2.c(null, str);
            b3 = mVar2.a();
        } catch (Throwable th) {
            b3 = R1.a.b(th);
        }
        if (b3 instanceof R1.k) {
            b3 = null;
        }
        G2.n nVar = (G2.n) b3;
        if (nVar == null) {
            return null;
        }
        G2.m f3 = nVar.f();
        String at = SalonDepot.INSTANCE.at(2);
        f2.j.f(at, "name");
        if (f3.f2208d == null) {
            f3.f2208d = new ArrayList();
        }
        ArrayList arrayList = f3.f2208d;
        f2.j.c(arrayList);
        arrayList.add(G2.b.b(at, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219));
        ArrayList arrayList2 = f3.f2208d;
        f2.j.c(arrayList2);
        String str2 = this.f3355k;
        arrayList2.add(str2 != null ? G2.b.b(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219) : null);
        G2.n a3 = f3.a();
        try {
            String defaultUserAgent = WebSettings.getDefaultUserAgent((Application) mVar.f2116b);
            f2.j.e(defaultUserAgent, "getDefaultUserAgent(...)");
            b4 = AbstractC0737q.x(AbstractC0737q.x(defaultUserAgent, "; wv)", ")"), "Version/4.0 ", "");
        } catch (Throwable th2) {
            b4 = R1.a.b(th2);
        }
        if (b4 instanceof R1.k) {
            b4 = null;
        }
        String str3 = (String) b4;
        G1.g gVar = new G1.g(2);
        gVar.f2093e = a3;
        gVar.j("Accept", "application/json");
        if (str3 != null && str3.length() != 0) {
            gVar.j("User-Agent", str3);
        }
        gVar.k("GET", null);
        com.gatesof.olympus.martu.marku.salon.a aVar2 = new com.gatesof.olympus.martu.marku.salon.a(mVar, gVar.b(), null);
        this.f3352h = 1;
        Object A3 = AbstractC0837y.A(15000L, aVar2, this);
        return A3 == aVar ? aVar : A3;
    }
}
