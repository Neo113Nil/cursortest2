package k3;

import i3.C0697s;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final C0697s f7438a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7439b;

    public f(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f7438a = new C0697s(descriptor, new e(2, this, f.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0, 0));
    }
}
