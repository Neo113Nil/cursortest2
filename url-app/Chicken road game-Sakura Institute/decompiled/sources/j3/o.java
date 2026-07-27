package j3;

import A1.v0;
import a.AbstractC0345a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class o implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final o f7215a = new o();

    /* renamed from: b, reason: collision with root package name */
    public static final g3.f f7216b = j0.c.n("kotlinx.serialization.json.JsonElement", g3.c.f6783h, new SerialDescriptor[0], new v0(9));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return AbstractC0345a.h(decoder).i();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7216b;
    }
}
