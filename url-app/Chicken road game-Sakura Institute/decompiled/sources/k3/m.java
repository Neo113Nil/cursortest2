package k3;

import j3.AbstractC0724c;
import j3.x;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import z2.C1403G;
import z2.C1412P;

/* loaded from: classes.dex */
public final class m extends k {

    /* renamed from: p, reason: collision with root package name */
    public final x f7450p;

    /* renamed from: q, reason: collision with root package name */
    public final List f7451q;

    /* renamed from: r, reason: collision with root package name */
    public final int f7452r;

    /* renamed from: s, reason: collision with root package name */
    public int f7453s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(AbstractC0724c json, x value) {
        super(json, value, (String) null, 12);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f7450p = value;
        List H3 = C1403G.H(value.keySet());
        this.f7451q = H3;
        this.f7452r = H3.size() * 2;
        this.f7453s = -1;
    }

    @Override // k3.k, k3.a, h3.a
    public final void A(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // k3.k, k3.a
    public final String N(SerialDescriptor descriptor, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (String) this.f7451q.get(i2 / 2);
    }

    @Override // k3.k, k3.a
    public final j3.m P() {
        return this.f7450p;
    }

    @Override // k3.k
    /* renamed from: U */
    public final x P() {
        return this.f7450p;
    }

    @Override // k3.k, h3.a
    public final int s(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i2 = this.f7453s;
        if (i2 >= this.f7452r - 1) {
            return -1;
        }
        int i4 = i2 + 1;
        this.f7453s = i4;
        return i4;
    }

    @Override // k3.k, k3.a
    public final j3.m w(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (this.f7453s % 2 != 0) {
            return (j3.m) C1412P.d(tag, this.f7450p);
        }
        int i2 = j3.n.f7214a;
        return tag == null ? j3.u.INSTANCE : new j3.r(tag, true);
    }
}
