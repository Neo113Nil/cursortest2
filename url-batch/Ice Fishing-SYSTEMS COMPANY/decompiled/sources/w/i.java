package w;

import java.util.ArrayList;
import x.AbstractC5191h;
import x.C5198o;

/* loaded from: classes.dex */
public abstract class i extends C5144d {

    /* renamed from: q0, reason: collision with root package name */
    public C5144d[] f41557q0 = new C5144d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f41558r0 = 0;

    public final void R(int i, ArrayList arrayList, C5198o c5198o) {
        for (int i4 = 0; i4 < this.f41558r0; i4++) {
            C5144d c5144d = this.f41557q0[i4];
            ArrayList arrayList2 = c5198o.f41752a;
            if (!arrayList2.contains(c5144d)) {
                arrayList2.add(c5144d);
            }
        }
        for (int i9 = 0; i9 < this.f41558r0; i9++) {
            AbstractC5191h.b(this.f41557q0[i9], i, arrayList, c5198o);
        }
    }

    public void S() {
    }
}
