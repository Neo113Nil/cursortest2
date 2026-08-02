package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class blm extends blp {
    private Animatable c;

    public blm(ImageView imageView) {
        super(imageView);
    }

    private final void m(Object obj) {
        f(obj);
        if (!(obj instanceof Animatable)) {
            this.c = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.c = animatable;
        animatable.start();
    }

    @Override // defpackage.bli, defpackage.bln
    public final void b(Drawable drawable) {
        m(null);
        l(drawable);
    }

    @Override // defpackage.bli, defpackage.bln
    public final void d() {
        this.b.f();
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
        m(null);
        l(null);
    }

    @Override // defpackage.bli, defpackage.bln
    public final void e() {
        m(null);
        l(null);
    }

    protected abstract void f(Object obj);

    @Override // defpackage.bli, defpackage.bkd
    public final void h() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.bli, defpackage.bkd
    public final void i() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // defpackage.bln
    public final void k(Object obj) {
        m(obj);
    }

    public final void l(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }
}
