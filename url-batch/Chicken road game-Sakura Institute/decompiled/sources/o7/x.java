package o7;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x extends p0 {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f6956l;

    public x(String str, y yVar) {
        super(str, yVar, 1);
        this.f6956l = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [d6.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [d6.g, java.lang.Object] */
    @Override // o7.p0
    public final boolean equals(Object obj) {
        int i7;
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.f6923a.equals(serialDescriptor.b())) {
                x xVar = (x) obj;
                if (xVar.f6956l && Arrays.equals((SerialDescriptor[]) this.f6932j.getValue(), (SerialDescriptor[]) xVar.f6932j.getValue())) {
                    int d8 = serialDescriptor.d();
                    int i8 = this.f6925c;
                    if (i8 == d8) {
                        for (0; i7 < i8; i7 + 1) {
                            i7 = (r6.k.a(j(i7).b(), serialDescriptor.j(i7).b()) && r6.k.a(j(i7).c(), serialDescriptor.j(i7).c())) ? i7 + 1 : 0;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // o7.p0, kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean f() {
        return this.f6956l;
    }

    @Override // o7.p0
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
