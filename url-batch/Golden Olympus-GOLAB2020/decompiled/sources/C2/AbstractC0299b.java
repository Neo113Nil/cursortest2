package C2;

import B2.c;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC3531f;
import y2.C3534i;
import y2.InterfaceC3526a;
import y2.InterfaceC3527b;
import y2.InterfaceC3535j;

/* renamed from: C2.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0299b implements InterfaceC3527b {
    /* JADX INFO: Access modifiers changed from: private */
    public final Object b(B2.c cVar) {
        return c.a.c(cVar, getDescriptor(), 1, AbstractC3531f.a(this, cVar, cVar.h(getDescriptor(), 0)), null, 8, null);
    }

    public InterfaceC3526a c(B2.c decoder, String str) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.a().d(e(), str);
    }

    public InterfaceC3535j d(B2.f encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        return encoder.a().e(e(), value);
    }

    @Override // y2.InterfaceC3526a
    public final Object deserialize(B2.e decoder) {
        Object obj;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        A2.f descriptor = getDescriptor();
        B2.c b4 = decoder.b(descriptor);
        kotlin.jvm.internal.G g4 = new kotlin.jvm.internal.G();
        if (b4.v()) {
            obj = b(b4);
        } else {
            Object obj2 = null;
            while (true) {
                int t4 = b4.t(getDescriptor());
                if (t4 != -1) {
                    if (t4 == 0) {
                        g4.f41132b = b4.h(getDescriptor(), t4);
                    } else {
                        if (t4 != 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) g4.f41132b;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb.append(str);
                            sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb.append(t4);
                            throw new C3534i(sb.toString());
                        }
                        Object obj3 = g4.f41132b;
                        if (obj3 == null) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                        g4.f41132b = obj3;
                        obj2 = c.a.c(b4, getDescriptor(), t4, AbstractC3531f.a(this, b4, (String) obj3), null, 8, null);
                    }
                } else {
                    if (obj2 == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) g4.f41132b)).toString());
                    }
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer.deserialize$lambda$3");
                    obj = obj2;
                }
            }
        }
        b4.c(descriptor);
        return obj;
    }

    public abstract m2.c e();

    @Override // y2.InterfaceC3535j
    public final void serialize(B2.f encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC3535j b4 = AbstractC3531f.b(this, encoder, value);
        A2.f descriptor = getDescriptor();
        B2.d b5 = encoder.b(descriptor);
        b5.n(getDescriptor(), 0, b4.getDescriptor().a());
        A2.f descriptor2 = getDescriptor();
        Intrinsics.checkNotNull(b4, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        b5.m(descriptor2, 1, b4, value);
        b5.c(descriptor);
    }
}
