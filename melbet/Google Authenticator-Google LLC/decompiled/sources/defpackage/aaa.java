package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aaa extends ym {
    protected final Window a;

    public aaa(Window window) {
        this.a = window;
    }

    protected final void s(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    protected final void t(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    protected final void u(int i) {
        this.a.clearFlags(i);
    }

    protected final void v() {
        this.a.addFlags(Integer.MIN_VALUE);
    }
}
