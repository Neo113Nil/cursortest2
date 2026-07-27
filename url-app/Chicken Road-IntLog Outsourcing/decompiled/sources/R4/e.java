package R4;

import G0.F;
import G0.P;

/* loaded from: classes.dex */
public final class e extends P {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2680c;

    public e(F f3, boolean z) {
        super(f3);
        this.f2680c = z;
    }

    @Override // G0.P
    public final void k(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        if (this.f2680c) {
            super.k(value);
        } else {
            i(value);
        }
    }
}
