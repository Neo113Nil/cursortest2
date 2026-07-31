package D2;

import C2.C0040c;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class g implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final g f877a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final f f878b = f.f874b;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        O2.d.q(decoder);
        n nVar = n.f896a;
        return new e((List) new C0040c().c(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f878b;
    }
}
