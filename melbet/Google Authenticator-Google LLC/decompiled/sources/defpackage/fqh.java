package defpackage;

import android.graphics.Canvas;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fqh extends fqi {
    @Override // defpackage.fob
    protected final void I(Canvas canvas) {
        if (this.a.w.isEmpty()) {
            super.I(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.a.w);
        super.I(canvas);
        canvas.restore();
    }
}
