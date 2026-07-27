package i3;

import A.AbstractC0017m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public final class r implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final r f7103a = new r();

    /* renamed from: b, reason: collision with root package name */
    public static final T f7104b = new T("kotlin.time.Duration", g3.d.f6792p);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        a.C0004a c0004a = kotlin.time.a.f7548e;
        String value = decoder.u();
        c0004a.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return new kotlin.time.a(kotlin.time.b.a(value));
        } catch (IllegalArgumentException e4) {
            throw new IllegalArgumentException(AbstractC0017m.j("Invalid ISO duration string format: '", value, "'."), e4);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f7104b;
    }
}
