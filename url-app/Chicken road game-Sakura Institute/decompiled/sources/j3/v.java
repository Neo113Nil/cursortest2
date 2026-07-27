package j3;

import A1.v0;
import a.AbstractC0345a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class v implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final v f7222a = new v();

    /* renamed from: b, reason: collision with root package name */
    public static final g3.f f7223b = j0.c.n("kotlinx.serialization.json.JsonNull", g3.h.f6806h, new SerialDescriptor[0], new v0(8));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        AbstractC0345a.h(decoder);
        if (!decoder.m()) {
            return u.INSTANCE;
        }
        Intrinsics.checkNotNullParameter("Expected 'null' literal", "message");
        Intrinsics.checkNotNullParameter("Expected 'null' literal", "message");
        throw new k3.d("Expected 'null' literal");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7223b;
    }
}
