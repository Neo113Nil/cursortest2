package defpackage;

import android.view.inputmethod.CursorAnchorInfo;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class n50 {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, bw2 bw2Var, w72 w72Var) {
        if (!w72Var.d()) {
            float f = w72Var.b;
            sm1 sm1Var = bw2Var.b;
            int c = sm1Var.c(f);
            int c2 = sm1Var.c(w72Var.d);
            if (c <= c2) {
                while (true) {
                    builder.addVisibleLineBounds(bw2Var.f(c), sm1Var.d(c), bw2Var.g(c), sm1Var.b(c));
                    if (c == c2) {
                        break;
                    }
                    c++;
                }
            }
        }
        return builder;
    }
}
