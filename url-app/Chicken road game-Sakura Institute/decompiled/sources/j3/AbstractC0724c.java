package j3;

import e2.C0559a;
import f1.C0607a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* renamed from: j3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0724c {

    /* renamed from: d, reason: collision with root package name */
    public static final C0723b f7172d = new C0723b(new j(false, false, false, false, false, true, "    ", false, false, "type", false, true, false, false, false, EnumC0722a.f7170d), l3.a.f7993a);

    /* renamed from: a, reason: collision with root package name */
    public final j f7173a;

    /* renamed from: b, reason: collision with root package name */
    public final A0.q f7174b;

    /* renamed from: c, reason: collision with root package name */
    public final C0607a f7175c = new C0607a(7);

    public AbstractC0724c(j jVar, A0.q qVar) {
        this.f7173a = jVar;
        this.f7174b = qVar;
    }

    public final Object a(String string, KSerializer deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(string, "string");
        C0559a e4 = k3.h.e(this, string);
        Object h4 = new k3.q(this, k3.u.f7478i, e4, deserializer.getDescriptor(), null).h(deserializer);
        if (e4.f() == 10) {
            return h4;
        }
        C0559a.o(e4, "Expected EOF after parsing, but had " + ((String) e4.f6169f).charAt(e4.f6165b - 1) + " instead", 0, null, 6);
        throw null;
    }
}
