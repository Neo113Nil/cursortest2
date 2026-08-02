package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xp {
    public int a;
    public int b;

    public final int a() {
        return this.b | this.a;
    }

    public final void b(int i, int i2) {
        if (i2 == 1) {
            this.b = i;
        } else {
            this.a = i;
        }
    }

    public final void c(int i) {
        if (i == 1) {
            this.b = 0;
        } else {
            this.a = 0;
        }
    }

    public final void d(lp lpVar) {
        View view = lpVar.a;
        this.b = view.getLeft();
        this.a = view.getTop();
        view.getRight();
        view.getBottom();
    }
}
