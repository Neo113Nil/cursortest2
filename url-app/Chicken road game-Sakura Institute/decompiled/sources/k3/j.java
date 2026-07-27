package k3;

import j3.AbstractC0724c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class j extends a {

    /* renamed from: l, reason: collision with root package name */
    public final j3.m f7442l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AbstractC0724c json, j3.m value, String str) {
        super(json, str);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7442l = value;
        this.f7428d.add("primitive");
    }

    @Override // k3.a
    public final j3.m P() {
        return this.f7442l;
    }

    @Override // h3.a
    public final int s(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return 0;
    }

    @Override // k3.a
    public final j3.m w(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (tag == "primitive") {
            return this.f7442l;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }
}
