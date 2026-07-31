package x2;

import k.C0523b;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public static final C1057b f8731d = new C1057b(new i(false, false, false, false, false, true, "    ", false, false, "type", false, true, false, false, false, EnumC1056a.f8729d), z2.a.f9040a);

    /* renamed from: a, reason: collision with root package name */
    public final i f8732a;

    /* renamed from: b, reason: collision with root package name */
    public final C0523b f8733b;

    /* renamed from: c, reason: collision with root package name */
    public final n0.o f8734c = new n0.o(4);

    public c(i iVar, C0523b c0523b) {
        this.f8732a = iVar;
        this.f8733b = c0523b;
    }

    public final Object a(String str, KSerializer kSerializer) {
        Z1.i.f(kSerializer, "deserializer");
        Z1.i.f(this, "json");
        Z1.i.f(str, "source");
        t.u uVar = !this.f8732a.f8754o ? new t.u(str) : new y2.k(str);
        Object h3 = new y2.i(this, y2.m.f8858f, uVar, kSerializer.getDescriptor()).h(kSerializer);
        if (uVar.e() == 10) {
            return h3;
        }
        t.u.n(uVar, "Expected EOF after parsing, but had " + ((String) uVar.f7675f).charAt(uVar.f7671b - 1) + " instead", 0, null, 6);
        throw null;
    }
}
