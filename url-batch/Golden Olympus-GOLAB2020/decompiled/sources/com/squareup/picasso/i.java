package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.q;

/* loaded from: classes2.dex */
class i extends a {
    i(q qVar, ImageView imageView, t tVar, int i4, int i5, int i6, Drawable drawable, String str, Object obj, d1.b bVar, boolean z4) {
        super(qVar, imageView, tVar, i4, i5, i6, drawable, str, obj, z4);
    }

    @Override // com.squareup.picasso.a
    void a() {
        super.a();
    }

    @Override // com.squareup.picasso.a
    public void b(Bitmap bitmap, q.e eVar) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        ImageView imageView = (ImageView) this.f21657c.get();
        if (imageView == null) {
            return;
        }
        q qVar = this.f21655a;
        r.c(imageView, qVar.f21761d, bitmap, eVar, this.f21658d, qVar.f21769l);
    }

    @Override // com.squareup.picasso.a
    public void c(Exception exc) {
        ImageView imageView = (ImageView) this.f21657c.get();
        if (imageView == null) {
            return;
        }
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        int i4 = this.f21661g;
        if (i4 != 0) {
            imageView.setImageResource(i4);
            return;
        }
        Drawable drawable2 = this.f21662h;
        if (drawable2 != null) {
            imageView.setImageDrawable(drawable2);
        }
    }
}
