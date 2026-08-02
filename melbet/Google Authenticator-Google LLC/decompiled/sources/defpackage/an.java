package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class an {
    public final cm a;

    public an(cm cmVar) {
        this.a = cmVar;
    }

    public final boolean b() {
        cm cmVar = this.a;
        View view = cmVar.a.R;
        int N = view != null ? a.N(view) : 0;
        int i = cmVar.h;
        if (N != i) {
            return (N == 2 || i == 2) ? false : true;
        }
        return true;
    }
}
