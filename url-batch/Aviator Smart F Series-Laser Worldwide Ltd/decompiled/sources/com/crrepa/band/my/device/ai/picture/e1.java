package com.crrepa.band.my.device.ai.picture;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class e1 {

    class a implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ ImageView val$goods;
        final /* synthetic */ PathMeasure val$pathMeasure;

        a(PathMeasure pathMeasure, ImageView imageView) {
            this.val$pathMeasure = pathMeasure;
            this.val$goods = imageView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float[] fArr = new float[2];
            this.val$pathMeasure.getPosTan(((Float) valueAnimator.getAnimatedValue()).floatValue(), fArr, null);
            this.val$goods.setTranslationX(fArr[0]);
            this.val$goods.setTranslationY(fArr[1]);
        }
    }

    class b implements Animator.AnimatorListener {
        final /* synthetic */ ImageView val$goods;
        final /* synthetic */ c val$listener;
        final /* synthetic */ ViewGroup val$parentView;

        b(ViewGroup viewGroup, ImageView imageView, c cVar) {
            this.val$parentView = viewGroup;
            this.val$goods = imageView;
            this.val$listener = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.val$parentView.removeView(this.val$goods);
            c cVar = this.val$listener;
            if (cVar != null) {
                cVar.onAnimationEnd(animator);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public interface c {
        void onAnimationEnd(Animator animator);
    }

    public static void doSaveAnimator(Activity activity, ImageView imageView, View view, ViewGroup viewGroup, c cVar) {
        if (activity == null || imageView == null || view == null || viewGroup == null) {
            return;
        }
        ImageView imageView2 = new ImageView(activity);
        imageView2.setPadding(1, 1, 1, 1);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView2.setImageDrawable(getBitmapDrawable(imageView));
        viewGroup.addView(imageView2, new RelativeLayout.LayoutParams(100, 100));
        int[] iArr = new int[2];
        viewGroup.getLocationInWindow(iArr);
        imageView.getLocationInWindow(new int[2]);
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        float width = (r3[0] - iArr[0]) + (imageView.getWidth() / 2.0f);
        float height = (r3[1] - iArr[1]) + (imageView.getHeight() / 2.0f);
        float width2 = (iArr2[0] - iArr[0]) + (view.getWidth() / 5.0f);
        float f8 = iArr2[1] - iArr[1];
        Path path = new Path();
        path.moveTo(width, height);
        path.quadTo((width + width2) / 2.0f, height, width2, f8);
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, pathMeasure.getLength());
        ofFloat.setDuration(700L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new a(pathMeasure, imageView2));
        ofFloat.start();
        ofFloat.addListener(new b(viewGroup, imageView2, cVar));
    }

    @NonNull
    private static BitmapDrawable getBitmapDrawable(ImageView imageView) {
        Bitmap drawableToBitmap = com.moyoung.dafit.module.common.utils.g.drawableToBitmap(imageView.getDrawable(), imageView.getWidth(), imageView.getHeight());
        return new BitmapDrawable(imageView.getContext().getResources(), com.moyoung.dafit.module.common.utils.g.getRoundBitmap(drawableToBitmap, drawableToBitmap.getWidth(), drawableToBitmap.getHeight(), com.moyoung.dafit.module.common.utils.o.dp2px(imageView.getContext(), 60.0f)));
    }
}
