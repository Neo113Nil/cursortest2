package x2;

import h.AbstractC0416e;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import w2.C1024c;

/* loaded from: classes.dex */
public final class g implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final g f8738a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final f f8739b = f.f8735b;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC0416e.l(decoder);
        n nVar = n.f8756a;
        return new e((List) new C1024c().c(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f8739b;
    }
}
