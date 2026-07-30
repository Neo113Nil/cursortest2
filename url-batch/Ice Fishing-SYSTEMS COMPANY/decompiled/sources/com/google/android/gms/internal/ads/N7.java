package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class N7 extends P7 {

    /* renamed from: h, reason: collision with root package name */
    public final B7 f26476h;
    public final long i;

    public N7(C4101w7 c4101w7, C3830r6 c3830r6, int i, B7 b72) {
        super(c4101w7, "CX4J+2yEJ2HtJzNjBSAFoPZxV3S124qFqsrwrEik3kHdsHRX3oIIB4d/zi0EQ0fu", "gfLiyhD2OvLSOj6bwf+kcmK11rwQ90aeBshxHD6xXgk=", c3830r6, i, 53);
        this.f26476h = b72;
        if (b72 != null) {
            if (b72.f23989E <= -2) {
                WeakReference weakReference = b72.f23985A;
                if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                    b72.f23989E = -3L;
                }
            }
            this.i = b72.f23989E;
        }
    }

    @Override // com.google.android.gms.internal.ads.P7
    public final void a() {
        if (this.f26476h != null) {
            long longValue = ((Long) this.f26845e.invoke(null, Long.valueOf(this.i))).longValue();
            C3830r6 c3830r6 = this.f26844d;
            c3830r6.h();
            ((D6) c3830r6.f30000u).S(longValue);
        }
    }
}
