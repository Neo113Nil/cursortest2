package C2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import n.t0;
import o2.C0746a;

/* loaded from: classes.dex */
public final class r implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final r f781a = new r();

    /* renamed from: b, reason: collision with root package name */
    public static final T f782b = new T("kotlin.time.Duration", A2.d.f238k);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        int i3 = C0746a.f7442g;
        String t3 = decoder.t();
        f2.j.f(t3, "value");
        try {
            return new C0746a(t0.e(t3));
        } catch (IllegalArgumentException e3) {
            throw new IllegalArgumentException("Invalid ISO duration string format: '" + t3 + "'.", e3);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f782b;
    }
}
