package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* loaded from: classes4.dex */
class n extends a {
    e callback;

    n(Picasso picasso, ImageView imageView, u uVar, int i8, int i9, int i10, Drawable drawable, String str, Object obj, e eVar, boolean z7) {
        super(picasso, imageView, uVar, i8, i9, i10, drawable, str, obj, z7);
        this.callback = eVar;
    }

    @Override // com.squareup.picasso.a
    void cancel() {
        super.cancel();
        if (this.callback != null) {
            this.callback = null;
        }
    }

    @Override // com.squareup.picasso.a
    public void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        ImageView imageView = (ImageView) this.target.get();
        if (imageView == null) {
            return;
        }
        Picasso picasso = this.picasso;
        r.setBitmap(imageView, picasso.context, bitmap, loadedFrom, this.noFade, picasso.indicatorsEnabled);
        e eVar = this.callback;
        if (eVar != null) {
            eVar.onSuccess();
        }
    }

    @Override // com.squareup.picasso.a
    public void error(Exception exc) {
        ImageView imageView = (ImageView) this.target.get();
        if (imageView == null) {
            return;
        }
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        int i8 = this.errorResId;
        if (i8 != 0) {
            imageView.setImageResource(i8);
        } else {
            Drawable drawable2 = this.errorDrawable;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
            }
        }
        e eVar = this.callback;
        if (eVar != null) {
            eVar.onError(exc);
        }
    }
}
