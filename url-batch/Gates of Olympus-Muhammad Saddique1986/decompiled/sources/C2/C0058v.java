package C2;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: C2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058v implements KSerializer {

    /* renamed from: a, reason: collision with root package name */
    public static final C0058v f791a = new C0058v();

    /* renamed from: b, reason: collision with root package name */
    public static final T f792b = new T("kotlin.Float", A2.d.f234g);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Float.valueOf(decoder.u());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f792b;
    }
}
