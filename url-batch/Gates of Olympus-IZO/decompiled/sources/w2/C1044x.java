package w2;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: w2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1044x extends O {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f8706l;

    public C1044x(String str, C1045y c1045y) {
        super(str, c1045y, 1);
        this.f8706l = true;
    }

    @Override // w2.O, kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return this.f8706l;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [L1.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [L1.g, java.lang.Object] */
    @Override // w2.O
    public final boolean equals(Object obj) {
        int i3;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1044x) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.f8622a.equals(serialDescriptor.d())) {
                C1044x c1044x = (C1044x) obj;
                if (c1044x.f8706l && Arrays.equals((SerialDescriptor[]) this.f8631j.getValue(), (SerialDescriptor[]) c1044x.f8631j.getValue())) {
                    int l3 = serialDescriptor.l();
                    int i4 = this.f8624c;
                    if (i4 == l3) {
                        for (0; i3 < i4; i3 + 1) {
                            i3 = (Z1.i.a(h(i3).d(), serialDescriptor.h(i3).d()) && Z1.i.a(h(i3).i(), serialDescriptor.h(i3).i())) ? i3 + 1 : 0;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // w2.O
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
