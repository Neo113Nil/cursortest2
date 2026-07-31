package k0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* loaded from: classes.dex */
class u implements v {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroupOverlay f40986a;

    u(ViewGroup viewGroup) {
        this.f40986a = viewGroup.getOverlay();
    }

    @Override // k0.z
    public void a(Drawable drawable) {
        this.f40986a.add(drawable);
    }

    @Override // k0.z
    public void b(Drawable drawable) {
        this.f40986a.remove(drawable);
    }

    @Override // k0.v
    public void c(View view) {
        this.f40986a.add(view);
    }

    @Override // k0.v
    public void d(View view) {
        this.f40986a.remove(view);
    }
}
