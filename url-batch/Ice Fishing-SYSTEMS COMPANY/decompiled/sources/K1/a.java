package K1;

import J1.f;
import N1.g;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: n, reason: collision with root package name */
    public final ImageView f1557n;

    /* renamed from: u, reason: collision with root package name */
    public final d f1558u;

    /* renamed from: v, reason: collision with root package name */
    public Animatable f1559v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f1560w;

    public a(ImageView imageView, int i) {
        this.f1560w = i;
        g.c(imageView, "Argument must not be null");
        this.f1557n = imageView;
        this.f1558u = new d(imageView);
    }

    @Override // K1.c
    public final void a(f fVar) {
        this.f1558u.f1563b.remove(fVar);
    }

    @Override // K1.c
    public final void b(J1.c cVar) {
        this.f1557n.setTag(C5284R.id.glide_custom_view_target_tag, cVar);
    }

    @Override // K1.c
    public final void c(Object obj) {
        i(obj);
        if (!(obj instanceof Animatable)) {
            this.f1559v = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f1559v = animatable;
        animatable.start();
    }

    @Override // K1.c
    public final void d(Drawable drawable) {
        i(null);
        this.f1559v = null;
        this.f1557n.setImageDrawable(drawable);
    }

    @Override // K1.c
    public final void e(f fVar) {
        d dVar = this.f1558u;
        ImageView imageView = dVar.f1562a;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int a9 = dVar.a(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        ImageView imageView2 = dVar.f1562a;
        int paddingBottom = imageView2.getPaddingBottom() + imageView2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        int a10 = dVar.a(imageView2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((a9 > 0 || a9 == Integer.MIN_VALUE) && (a10 > 0 || a10 == Integer.MIN_VALUE)) {
            fVar.l(a9, a10);
            return;
        }
        ArrayList arrayList = dVar.f1563b;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
        if (dVar.f1564c == null) {
            ViewTreeObserver viewTreeObserver = imageView2.getViewTreeObserver();
            B.f fVar2 = new B.f(dVar);
            dVar.f1564c = fVar2;
            viewTreeObserver.addOnPreDrawListener(fVar2);
        }
    }

    @Override // K1.c
    public final void f(Drawable drawable) {
        i(null);
        this.f1559v = null;
        this.f1557n.setImageDrawable(drawable);
    }

    @Override // K1.c
    public final J1.c g() {
        Object tag = this.f1557n.getTag(C5284R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof J1.c) {
            return (J1.c) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // K1.c
    public final void h(Drawable drawable) {
        d dVar = this.f1558u;
        ViewTreeObserver viewTreeObserver = dVar.f1562a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(dVar.f1564c);
        }
        dVar.f1564c = null;
        dVar.f1563b.clear();
        Animatable animatable = this.f1559v;
        if (animatable != null) {
            animatable.stop();
        }
        i(null);
        this.f1559v = null;
        this.f1557n.setImageDrawable(drawable);
    }

    public final void i(Object obj) {
        switch (this.f1560w) {
            case 0:
                this.f1557n.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.f1557n.setImageDrawable((Drawable) obj);
                break;
        }
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStart() {
        Animatable animatable = this.f1559v;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStop() {
        Animatable animatable = this.f1559v;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final String toString() {
        return "Target for: " + this.f1557n;
    }

    @Override // com.bumptech.glide.manager.h
    public final void onDestroy() {
    }
}
