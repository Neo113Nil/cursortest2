package j3;

import a.AbstractC0345a;
import i3.C0682c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class g implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final g f7179a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final f f7180b = f.f7176b;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        AbstractC0345a.h(decoder);
        o elementSerializer = o.f7215a;
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        C0682c c0682c = new C0682c();
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return new e((List) c0682c.c(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7180b;
    }
}
