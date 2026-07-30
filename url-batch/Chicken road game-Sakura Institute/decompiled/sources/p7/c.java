package p7;

import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public static final b f7214d = new b(new i(false, false, true, "    ", "type", true, a.f7210f), r7.a.f7970a);

    /* renamed from: a, reason: collision with root package name */
    public final i f7215a;

    /* renamed from: b, reason: collision with root package name */
    public final j4.i f7216b;

    /* renamed from: c, reason: collision with root package name */
    public final l1.x f7217c = new l1.x(9);

    public c(i iVar, j4.i iVar2) {
        this.f7215a = iVar;
        this.f7216b = iVar2;
    }

    public final Object a(String str, KSerializer kSerializer) {
        r6.k.f(kSerializer, "deserializer");
        j5.a aVar = new j5.a(str);
        Object g9 = new q7.k(this, q7.n.OBJ, aVar, kSerializer.getDescriptor()).g(kSerializer);
        if (aVar.f() == 10) {
            return g9;
        }
        j5.a.o(aVar, "Expected EOF after parsing, but had " + str.charAt(aVar.f5034b - 1) + " instead", 0, null, 6);
        throw null;
    }
}
