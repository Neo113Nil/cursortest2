package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fov extends ViewOutlineProvider {
    final /* synthetic */ fow a;

    public fov(fow fowVar) {
        this.a = fowVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Path path = this.a.d;
        if (path.isEmpty()) {
            return;
        }
        outline.setPath(path);
    }
}
