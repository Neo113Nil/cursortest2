package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class dpr extends FrameLayout implements efw {
    private boolean a;
    private boolean b;

    public dpr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public abstract int a();

    @Override // defpackage.efw
    public final void b(efu efuVar) {
        if (this.a) {
            efuVar.c(this, a());
            this.b = true;
        }
    }

    public final void c(efu efuVar, dkq dkqVar) {
        if (this.a) {
            efuVar.d(this, a(), dkqVar);
            this.b = true;
        }
    }

    public final void d() {
        this.a = true;
    }

    @Override // defpackage.efw
    public final void e(efu efuVar) {
        if (this.a && this.b) {
            efuVar.e(this);
            this.b = false;
        }
    }
}
