package j3;

import M2.I;
import a.AbstractC0345a;
import i3.D;
import i3.a0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class z implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final z f7227a = new z();

    /* renamed from: b, reason: collision with root package name */
    public static final y f7228b = y.f7224b;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        AbstractC0345a.h(decoder);
        Intrinsics.checkNotNullParameter(I.f3583a, "<this>");
        a0 a0Var = a0.f7055a;
        o oVar = o.f7215a;
        a0 keySerializer = a0.f7055a;
        o valueSerializer = o.f7215a;
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        D d4 = new D();
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new x((Map) d4.c(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7228b;
    }
}
