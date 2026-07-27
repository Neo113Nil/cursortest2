package i3;

import A.AbstractC0017m;
import A1.C0068m;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import y2.C1336k;
import y2.EnumC1337l;
import z2.C1405I;

/* loaded from: classes.dex */
public final class L implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public final Unit f7024a;

    /* renamed from: b, reason: collision with root package name */
    public final C1405I f7025b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7026c;

    public L(Unit objectInstance) {
        Intrinsics.checkNotNullParameter("kotlin.Unit", "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        this.f7024a = objectInstance;
        this.f7025b = C1405I.f11931d;
        this.f7026c = C1336k.b(EnumC1337l.f11670d, new C0068m(4, this));
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        h3.a a4 = decoder.a(descriptor);
        int s4 = a4.s(getDescriptor());
        if (s4 != -1) {
            throw new f3.c(AbstractC0017m.g(s4, "Unexpected index "));
        }
        Unit unit = Unit.f7487a;
        a4.A(descriptor);
        return this.f7024a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, y2.j] */
    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f7026c.getValue();
    }
}
