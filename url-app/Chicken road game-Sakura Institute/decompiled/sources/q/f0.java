package q;

import D.C0129f;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0945F;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import p0.InterfaceC0977m;
import z2.C1412P;

/* loaded from: classes.dex */
public final class f0 implements InterfaceC0945F, c0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1027f f9254a;

    /* renamed from: b, reason: collision with root package name */
    public final S.f f9255b;

    public f0(InterfaceC1027f interfaceC1027f, S.f fVar) {
        this.f9254a = interfaceC1027f;
        this.f9255b = fVar;
    }

    @Override // p0.InterfaceC0945F
    public final int a(InterfaceC0977m interfaceC0977m, List list, int i2) {
        int l4 = interfaceC0977m.l(this.f9254a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        float f4 = 0.0f;
        for (int i6 = 0; i6 < size; i6++) {
            InterfaceC0944E interfaceC0944E = (InterfaceC0944E) list.get(i6);
            float f5 = AbstractC1024c.f(AbstractC1024c.e(interfaceC0944E));
            int S3 = interfaceC0944E.S(i2);
            if (f5 == 0.0f) {
                i5 += S3;
            } else if (f5 > 0.0f) {
                f4 += f5;
                i4 = Math.max(i4, Math.round(S3 / f5));
            }
        }
        return ((list.size() - 1) * l4) + Math.round(i4 * f4) + i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q.c0
    public final InterfaceC0946G b(AbstractC0954O[] abstractC0954OArr, InterfaceC0947H interfaceC0947H, int[] iArr, int i2, int i4, int[] iArr2, int i5, int i6, int i7) {
        InterfaceC0946G t4;
        t4 = interfaceC0947H.t(i2, i4, C1412P.c(), new C0129f((Object) abstractC0954OArr, (Object) this, i4, (Serializable) iArr, 4));
        return t4;
    }

    @Override // q.c0
    public final void c(int i2, InterfaceC0947H interfaceC0947H, int[] iArr, int[] iArr2) {
        this.f9254a.b(interfaceC0947H, i2, iArr, interfaceC0947H.getLayoutDirection(), iArr2);
    }

    @Override // q.c0
    public final int d(AbstractC0954O abstractC0954O) {
        return abstractC0954O.f9005d;
    }

    @Override // p0.InterfaceC0945F
    public final int e(InterfaceC0977m interfaceC0977m, List list, int i2) {
        int l4 = interfaceC0977m.l(this.f9254a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * l4, i2);
        int size = list.size();
        int i4 = 0;
        float f4 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            InterfaceC0944E interfaceC0944E = (InterfaceC0944E) list.get(i5);
            float f5 = AbstractC1024c.f(AbstractC1024c.e(interfaceC0944E));
            if (f5 == 0.0f) {
                int min2 = Math.min(interfaceC0944E.X(Integer.MAX_VALUE), i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i2 - min);
                min += min2;
                i4 = Math.max(i4, interfaceC0944E.Z(min2));
            } else if (f5 > 0.0f) {
                f4 += f5;
            }
        }
        int round = f4 == 0.0f ? 0 : i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i2 - min, 0) / f4);
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            InterfaceC0944E interfaceC0944E2 = (InterfaceC0944E) list.get(i6);
            float f6 = AbstractC1024c.f(AbstractC1024c.e(interfaceC0944E2));
            if (f6 > 0.0f) {
                i4 = Math.max(i4, interfaceC0944E2.Z(round != Integer.MAX_VALUE ? Math.round(round * f6) : Integer.MAX_VALUE));
            }
        }
        return i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.a(this.f9254a, f0Var.f9254a) && Intrinsics.a(this.f9255b, f0Var.f9255b);
    }

    @Override // p0.InterfaceC0945F
    public final InterfaceC0946G f(InterfaceC0947H interfaceC0947H, List list, long j4) {
        return AbstractC1024c.g(this, M0.a.k(j4), M0.a.j(j4), M0.a.i(j4), M0.a.h(j4), interfaceC0947H.l(this.f9254a.a()), interfaceC0947H, list, new AbstractC0954O[list.size()], 0, list.size(), null, 0);
    }

    @Override // p0.InterfaceC0945F
    public final int g(InterfaceC0977m interfaceC0977m, List list, int i2) {
        int l4 = interfaceC0977m.l(this.f9254a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * l4, i2);
        int size = list.size();
        int i4 = 0;
        float f4 = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            InterfaceC0944E interfaceC0944E = (InterfaceC0944E) list.get(i5);
            float f5 = AbstractC1024c.f(AbstractC1024c.e(interfaceC0944E));
            if (f5 == 0.0f) {
                int min2 = Math.min(interfaceC0944E.X(Integer.MAX_VALUE), i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i2 - min);
                min += min2;
                i4 = Math.max(i4, interfaceC0944E.b(min2));
            } else if (f5 > 0.0f) {
                f4 += f5;
            }
        }
        int round = f4 == 0.0f ? 0 : i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i2 - min, 0) / f4);
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            InterfaceC0944E interfaceC0944E2 = (InterfaceC0944E) list.get(i6);
            float f6 = AbstractC1024c.f(AbstractC1024c.e(interfaceC0944E2));
            if (f6 > 0.0f) {
                i4 = Math.max(i4, interfaceC0944E2.b(round != Integer.MAX_VALUE ? Math.round(round * f6) : Integer.MAX_VALUE));
            }
        }
        return i4;
    }

    @Override // p0.InterfaceC0945F
    public final int h(InterfaceC0977m interfaceC0977m, List list, int i2) {
        int l4 = interfaceC0977m.l(this.f9254a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        float f4 = 0.0f;
        for (int i6 = 0; i6 < size; i6++) {
            InterfaceC0944E interfaceC0944E = (InterfaceC0944E) list.get(i6);
            float f5 = AbstractC1024c.f(AbstractC1024c.e(interfaceC0944E));
            int X3 = interfaceC0944E.X(i2);
            if (f5 == 0.0f) {
                i5 += X3;
            } else if (f5 > 0.0f) {
                f4 += f5;
                i4 = Math.max(i4, Math.round(X3 / f5));
            }
        }
        return ((list.size() - 1) * l4) + Math.round(i4 * f4) + i5;
    }

    public final int hashCode() {
        return Float.hashCode(this.f9255b.f3969a) + (this.f9254a.hashCode() * 31);
    }

    @Override // q.c0
    public final long i(int i2, int i4, int i5, boolean z4) {
        return e0.a(i2, i4, i5, z4);
    }

    @Override // q.c0
    public final int j(AbstractC0954O abstractC0954O) {
        return abstractC0954O.f9006e;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f9254a + ", verticalAlignment=" + this.f9255b + ')';
    }
}
