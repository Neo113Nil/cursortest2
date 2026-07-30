package A6;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: A6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0091c {

    /* renamed from: d, reason: collision with root package name */
    public static final C0090b f96d = new C0090b(new j(false, true, "    ", com.onesignal.inAppMessages.internal.display.impl.m.EVENT_TYPE_KEY, true, EnumC0089a.f94d), C6.a.f319a);

    /* renamed from: a, reason: collision with root package name */
    public final j f97a;

    /* renamed from: b, reason: collision with root package name */
    public final c2.e f98b;

    /* renamed from: c, reason: collision with root package name */
    public final l2.c f99c = new l2.c(1);

    public AbstractC0091c(j jVar, c2.e eVar) {
        this.f97a = jVar;
        this.f98b = eVar;
    }

    public final l a(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        p deserializer = p.f131a;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(string, "string");
        B6.v vVar = new B6.v(string);
        Object C7 = new B6.s(this, B6.x.f266i, vVar, p.f132b).C(deserializer);
        if (vVar.e() == 10) {
            return (l) C7;
        }
        B6.v.m(vVar, "Expected EOF after parsing, but had " + string.charAt(vVar.f259b - 1) + " instead", 0, 6);
        throw null;
    }
}
