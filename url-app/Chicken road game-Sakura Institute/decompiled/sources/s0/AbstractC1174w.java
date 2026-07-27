package s0;

import android.R;
import b1.C0503c;
import b1.C0508h;
import y0.C1317a;

/* renamed from: s0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1174w {
    public static final void a(C0508h c0508h, y0.n nVar) {
        if (AbstractC1125K.a(nVar)) {
            Object obj = nVar.f11587d.f11576d.get(y0.h.f11556g);
            if (obj == null) {
                obj = null;
            }
            C1317a c1317a = (C1317a) obj;
            if (c1317a != null) {
                c0508h.a(new C0503c(null, R.id.accessibilityActionSetProgress, c1317a.f11535a, null));
            }
        }
    }
}
