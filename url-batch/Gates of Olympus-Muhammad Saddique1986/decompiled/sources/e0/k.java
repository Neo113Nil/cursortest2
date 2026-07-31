package e0;

import android.graphics.Outline;
import b0.C0341j;
import b0.L;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f5795a = new k();

    public final void a(Outline outline, L l3) {
        if (!(l3 instanceof C0341j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((C0341j) l3).f5420a);
    }
}
