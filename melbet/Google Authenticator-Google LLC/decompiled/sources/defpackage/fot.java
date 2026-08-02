package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fot extends ViewOutlineProvider {
    final /* synthetic */ fou a;

    public fot(fou fouVar) {
        this.a = fouVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        fou fouVar = this.a;
        if (fouVar.b == null || fouVar.c.isEmpty()) {
            return;
        }
        outline.setRoundRect((int) fouVar.c.left, (int) fouVar.c.top, (int) fouVar.c.right, (int) fouVar.c.bottom, fouVar.e);
    }
}
