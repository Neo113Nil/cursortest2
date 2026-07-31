package E2;

import A2.j;
import A2.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* loaded from: classes3.dex */
public final class T implements F2.d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f556a;

    /* renamed from: b, reason: collision with root package name */
    private final String f557b;

    public T(boolean z4, String discriminator) {
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        this.f556a = z4;
        this.f557b = discriminator;
    }

    private final void d(A2.f fVar, m2.c cVar) {
        int f4 = fVar.f();
        for (int i4 = 0; i4 < f4; i4++) {
            String g4 = fVar.g(i4);
            if (Intrinsics.areEqual(g4, this.f557b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + cVar + " has property '" + g4 + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    private final void e(A2.f fVar, m2.c cVar) {
        A2.j e4 = fVar.e();
        if ((e4 instanceof A2.d) || Intrinsics.areEqual(e4, j.a.f97a)) {
            throw new IllegalArgumentException("Serializer for " + cVar.e() + " can't be registered as a subclass for polymorphic serialization because its kind " + e4 + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (this.f556a) {
            return;
        }
        if (Intrinsics.areEqual(e4, k.b.f100a) || Intrinsics.areEqual(e4, k.c.f101a) || (e4 instanceof A2.e) || (e4 instanceof j.b)) {
            throw new IllegalArgumentException("Serializer for " + cVar.e() + " of kind " + e4 + " cannot be serialized polymorphically with class discriminator.");
        }
    }

    @Override // F2.d
    public void a(m2.c baseClass, m2.c actualClass, InterfaceC3527b actualSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        A2.f descriptor = actualSerializer.getDescriptor();
        e(descriptor, actualClass);
        if (this.f556a) {
            return;
        }
        d(descriptor, actualClass);
    }

    @Override // F2.d
    public void b(m2.c baseClass, Function1 defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    @Override // F2.d
    public void c(m2.c baseClass, Function1 defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
    }
}
