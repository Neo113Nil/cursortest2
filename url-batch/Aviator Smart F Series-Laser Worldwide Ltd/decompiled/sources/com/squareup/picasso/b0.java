package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;

/* loaded from: classes4.dex */
final class b0 extends a {
    b0(Picasso picasso, a0 a0Var, u uVar, int i8, int i9, Drawable drawable, String str, Object obj, int i10) {
        super(picasso, a0Var, uVar, i8, i9, i10, drawable, str, obj, false);
    }

    @Override // com.squareup.picasso.a
    void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        a0 a0Var = (a0) getTarget();
        if (a0Var != null) {
            a0Var.onBitmapLoaded(bitmap, loadedFrom);
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Target callback must not recycle bitmap!");
            }
        }
    }

    @Override // com.squareup.picasso.a
    void error(Exception exc) {
        a0 a0Var = (a0) getTarget();
        if (a0Var != null) {
            if (this.errorResId != 0) {
                a0Var.onBitmapFailed(exc, this.picasso.context.getResources().getDrawable(this.errorResId));
            } else {
                a0Var.onBitmapFailed(exc, this.errorDrawable);
            }
        }
    }
}
