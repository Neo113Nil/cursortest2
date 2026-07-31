package C2;

import C2.L;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* loaded from: classes3.dex */
public abstract class S {

    public static final class a implements L {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3527b f246a;

        a(InterfaceC3527b interfaceC3527b) {
            this.f246a = interfaceC3527b;
        }

        @Override // C2.L
        public InterfaceC3527b[] childSerializers() {
            return new InterfaceC3527b[]{this.f246a};
        }

        @Override // y2.InterfaceC3526a
        public Object deserialize(B2.e decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
        public A2.f getDescriptor() {
            throw new IllegalStateException("unsupported");
        }

        @Override // y2.InterfaceC3535j
        public void serialize(B2.f encoder, Object obj) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            throw new IllegalStateException("unsupported");
        }

        @Override // C2.L
        public InterfaceC3527b[] typeParametersSerializers() {
            return L.a.a(this);
        }
    }

    public static final A2.f a(String name, InterfaceC3527b primitiveSerializer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        return new Q(name, new a(primitiveSerializer));
    }
}
