package defpackage;

import android.content.Context;
import android.view.GestureDetector;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class f80 {
    public final t3 a;
    public int b = 0;
    public boolean c;
    public final GestureDetector d;

    public f80(Context context, t3 t3Var) {
        this.a = t3Var;
        this.d = new GestureDetector(context, new e80(this));
    }
}
