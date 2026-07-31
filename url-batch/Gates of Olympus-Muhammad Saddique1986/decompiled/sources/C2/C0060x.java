package C2;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: C2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0060x extends O {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f793l;

    public C0060x(String str, C0061y c0061y) {
        super(str, c0061y, 1);
        this.f793l = true;
    }

    @Override // C2.O, kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return this.f793l;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [R1.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [R1.f, java.lang.Object] */
    @Override // C2.O
    public final boolean equals(Object obj) {
        int i3;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0060x) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.f709a.equals(serialDescriptor.d())) {
                C0060x c0060x = (C0060x) obj;
                if (c0060x.f793l && Arrays.equals((SerialDescriptor[]) this.f718j.getValue(), (SerialDescriptor[]) c0060x.f718j.getValue())) {
                    int l3 = serialDescriptor.l();
                    int i4 = this.f711c;
                    if (i4 == l3) {
                        for (0; i3 < i4; i3 + 1) {
                            i3 = (f2.j.a(h(i3).d(), serialDescriptor.h(i3).d()) && f2.j.a(h(i3).i(), serialDescriptor.h(i3).i())) ? i3 + 1 : 0;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // C2.O
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
