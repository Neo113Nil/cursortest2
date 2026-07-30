package y;

import a2.h0;
import android.view.inputmethod.CursorAnchorInfo;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class i {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, h0 h0Var, y0.d dVar) {
        if (!dVar.e()) {
            float f9 = dVar.f9781b;
            a2.o oVar = h0Var.f389b;
            int c4 = oVar.c(f9);
            int c6 = oVar.c(dVar.f9783d);
            if (c4 <= c6) {
                while (true) {
                    builder.addVisibleLineBounds(h0Var.f(c4), oVar.d(c4), h0Var.g(c4), oVar.b(c4));
                    if (c4 == c6) {
                        break;
                    }
                    c4++;
                }
            }
        }
        return builder;
    }
}
