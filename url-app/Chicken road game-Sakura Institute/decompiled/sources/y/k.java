package y;

import A0.I;
import android.view.inputmethod.CursorAnchorInfo;

/* loaded from: classes.dex */
public abstract class k {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, I i2, Y.d dVar) {
        int c4;
        A0.o oVar;
        int c5;
        if (!dVar.e() && (c4 = i2.f290b.c(dVar.f4375b)) <= (c5 = (oVar = i2.f290b).c(dVar.f4377d))) {
            while (true) {
                builder.addVisibleLineBounds(i2.f(c4), oVar.d(c4), i2.g(c4), oVar.b(c4));
                if (c4 == c5) {
                    break;
                }
                c4++;
            }
        }
        return builder;
    }
}
