package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fow extends fos {
    public fow(View view) {
        d(view);
    }

    private void d(View view) {
        view.setOutlineProvider(new fov(this));
    }

    @Override // defpackage.fos
    public final void a(View view) {
        view.setClipToOutline(true);
        view.invalidateOutline();
    }

    @Override // defpackage.fos
    public final boolean c() {
        return false;
    }
}
