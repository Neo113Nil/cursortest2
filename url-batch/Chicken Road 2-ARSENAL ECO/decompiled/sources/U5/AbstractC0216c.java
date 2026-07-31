package U5;

/* renamed from: U5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0216c {

    /* renamed from: d, reason: collision with root package name */
    public static final C0215b f2634d = new C0215b(new N3.k(false, true, "    ", com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY, true, EnumC0214a.f2632f), W5.a.f2854a);

    /* renamed from: a, reason: collision with root package name */
    public final N3.k f2635a;

    /* renamed from: b, reason: collision with root package name */
    public final U0.h f2636b;

    /* renamed from: c, reason: collision with root package name */
    public final V5.g f2637c = new V5.g(0);

    public AbstractC0216c(N3.k kVar, U0.h hVar) {
        this.f2635a = kVar;
        this.f2636b = hVar;
    }

    public final k a(String string) {
        kotlin.jvm.internal.i.e(string, "string");
        o oVar = o.f2662a;
        V5.u uVar = new V5.u(string);
        Object J3 = new V5.r(this, V5.w.f2775h, uVar, o.f2663b).J(oVar);
        if (uVar.e() == 10) {
            return (k) J3;
        }
        V5.u.m(uVar, "Expected EOF after parsing, but had " + string.charAt(uVar.f2768b - 1) + " instead", 0, 6);
        throw null;
    }
}
