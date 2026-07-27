package k3;

import j3.AbstractC0724c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class l extends a {

    /* renamed from: l, reason: collision with root package name */
    public final j3.e f7447l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7448m;

    /* renamed from: n, reason: collision with root package name */
    public int f7449n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AbstractC0724c json, j3.e value) {
        super(json, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7447l = value;
        this.f7448m = value.size();
        this.f7449n = -1;
    }

    @Override // k3.a
    public final String N(SerialDescriptor descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return String.valueOf(i2);
    }

    @Override // k3.a
    public final j3.m P() {
        return this.f7447l;
    }

    @Override // h3.a
    public final int s(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i2 = this.f7449n;
        if (i2 >= this.f7448m - 1) {
            return -1;
        }
        int i4 = i2 + 1;
        this.f7449n = i4;
        return i4;
    }

    @Override // k3.a
    public final j3.m w(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return this.f7447l.get(Integer.parseInt(tag));
    }
}
