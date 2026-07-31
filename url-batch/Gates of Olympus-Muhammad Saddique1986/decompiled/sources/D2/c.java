package D2;

import B.Y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public static final C0072b f870d = new C0072b(new i(false, false, false, false, false, true, "    ", false, false, "type", false, true, false, false, false, EnumC0071a.f868d), F2.a.f1964a);

    /* renamed from: a, reason: collision with root package name */
    public final i f871a;

    /* renamed from: b, reason: collision with root package name */
    public final A1.i f872b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f873c = new Y(1);

    public c(i iVar, A1.i iVar2) {
        this.f871a = iVar;
        this.f872b = iVar2;
    }

    public final Object a(String str, KSerializer kSerializer) {
        f2.j.f(kSerializer, "deserializer");
        f2.j.f(this, "json");
        f2.j.f(str, "source");
        E2.o oVar = !this.f871a.f893o ? new E2.o(str) : new E2.p(str);
        Object f3 = new E2.m(this, E2.r.OBJ, oVar, kSerializer.getDescriptor()).f(kSerializer);
        if (oVar.e() == 10) {
            return f3;
        }
        E2.o.n(oVar, "Expected EOF after parsing, but had " + oVar.f1082e.charAt(oVar.f1078a - 1) + " instead", 0, null, 6);
        throw null;
    }
}
