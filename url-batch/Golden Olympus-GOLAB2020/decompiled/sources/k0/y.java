package k0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* loaded from: classes.dex */
class y implements z {

    /* renamed from: a, reason: collision with root package name */
    private final ViewOverlay f40988a;

    y(View view) {
        this.f40988a = view.getOverlay();
    }

    @Override // k0.z
    public void a(Drawable drawable) {
        this.f40988a.add(drawable);
    }

    @Override // k0.z
    public void b(Drawable drawable) {
        this.f40988a.remove(drawable);
    }
}
