package D1;

import A2.C0003b;
import android.app.Application;
import android.webkit.WebSettings;
import com.gates.olympus.miruv.tenon.TenonLocker;
import h2.AbstractC0447i;
import h2.AbstractC0454p;
import java.util.ArrayList;
import k2.AbstractC0552y;
import k2.InterfaceC0550w;

/* renamed from: D1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0013a extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f530e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f531f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f532g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f533h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0014b f534i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0013a(String str, String str2, C0014b c0014b, P1.d dVar) {
        super(2, dVar);
        this.f532g = str;
        this.f533h = str2;
        this.f534i = c0014b;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0013a c0013a = new C0013a(this.f532g, this.f533h, this.f534i, dVar);
        c0013a.f531f = obj;
        return c0013a;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0013a) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Object t3;
        Object t4;
        C0014b c0014b = this.f534i;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f530e;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
            return obj;
        }
        I2.l.Q(obj);
        String str = this.f532g;
        if (AbstractC0447i.t0(str)) {
            return null;
        }
        if (!AbstractC0454p.c0(str, "/", false)) {
            str = str.concat("/");
        }
        try {
            Z1.i.f(str, "<this>");
            A2.p pVar = new A2.p();
            pVar.c(null, str);
            t3 = pVar.a();
        } catch (Throwable th) {
            t3 = I2.l.t(th);
        }
        if (t3 instanceof L1.l) {
            t3 = null;
        }
        A2.q qVar = (A2.q) t3;
        if (qVar == null) {
            return null;
        }
        A2.p f3 = qVar.f();
        String at = TenonLocker.INSTANCE.at(2);
        Z1.i.f(at, "name");
        if (f3.f126g == null) {
            f3.f126g = new ArrayList();
        }
        ArrayList arrayList = f3.f126g;
        Z1.i.c(arrayList);
        arrayList.add(C0003b.b(at, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219));
        ArrayList arrayList2 = f3.f126g;
        Z1.i.c(arrayList2);
        String str2 = this.f533h;
        arrayList2.add(str2 != null ? C0003b.b(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219) : null);
        A2.q a3 = f3.a();
        try {
            String defaultUserAgent = WebSettings.getDefaultUserAgent((Application) c0014b.f536b);
            Z1.i.e(defaultUserAgent, "getDefaultUserAgent(...)");
            t4 = AbstractC0454p.g0(AbstractC0454p.g0(defaultUserAgent, "; wv)", ")"), "Version/4.0 ", "");
        } catch (Throwable th2) {
            t4 = I2.l.t(th2);
        }
        if (t4 instanceof L1.l) {
            t4 = null;
        }
        String str3 = (String) t4;
        A2.k kVar = new A2.k(1);
        kVar.f108b = a3;
        kVar.j("Accept", "application/json");
        if (str3 != null && str3.length() != 0) {
            kVar.j("User-Agent", str3);
        }
        kVar.k("GET", null);
        com.gates.olympus.miruv.tenon.a aVar2 = new com.gates.olympus.miruv.tenon.a(c0014b, kVar.f(), null);
        this.f530e = 1;
        Object z3 = AbstractC0552y.z(15000L, aVar2, this);
        return z3 == aVar ? aVar : z3;
    }
}
