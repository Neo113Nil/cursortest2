package I0;

import a0.C0239d;
import android.view.inputmethod.CursorAnchorInfo;

/* renamed from: I0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0190c {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, C0.H h3, C0239d c0239d) {
        int c2;
        C0.o oVar;
        int c3;
        if (!c0239d.e() && (c2 = h3.f558b.c(c0239d.f4725b)) <= (c3 = (oVar = h3.f558b).c(c0239d.f4727d))) {
            while (true) {
                builder.addVisibleLineBounds(h3.f(c2), oVar.d(c2), h3.g(c2), oVar.b(c2));
                if (c2 == c3) {
                    break;
                }
                c2++;
            }
        }
        return builder;
    }
}
