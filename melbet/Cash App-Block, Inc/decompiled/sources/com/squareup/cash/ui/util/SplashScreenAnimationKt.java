package com.squareup.cash.ui.util;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.view.ScreenFlashView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.molecule.PlatformKt;
import coil3.memory.MemoryCacheService;
import com.google.android.material.focus.FocusRingDrawable;
import com.squareup.cash.R;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.SplashScreenAnimationObserver;
import com.squareup.util.android.Views;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class SplashScreenAnimationKt {
    public static final FocusRingDrawable.AnonymousClass1 splashAnimationTranslationY = new FocusRingDrawable.AnonymousClass1("splashAnimationTranslationY", 1);

    public static final AppCompatImageView addLayer(Activity activity, ViewGroup viewGroup, int i, int i2, int i3) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(activity);
        Drawable drawableCompat = PlatformKt.getDrawableCompat(activity, i, null);
        drawableCompat.getClass();
        Bitmap createBitmap = Bitmap.createBitmap(drawableCompat.getIntrinsicWidth(), drawableCompat.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawableCompat.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawableCompat.draw(canvas);
        int width = createBitmap.getWidth();
        int height = createBitmap.getHeight();
        int min = Math.min(i2, width);
        int min2 = Math.min(i3, height);
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, (width - min) / 2, (height - min2) / 2, min, min2);
        createBitmap2.getClass();
        createBitmap.recycle();
        Resources resources = activity.getResources();
        resources.getClass();
        appCompatImageView.setImageDrawable(new BitmapDrawable(resources, createBitmap2));
        viewGroup.addView(appCompatImageView, new FrameLayout.LayoutParams(i2, i3, 17));
        return appCompatImageView;
    }

    public static final void startModernSplashScreenAnimation(Activity activity, MemoryCacheService memoryCacheService, ImageView imageView, View view, SplashScreenAnimationObserver splashScreenAnimationObserver) {
        ObjectAnimator ofFloat;
        ViewGroup splashScreenView = ((WorkLauncherImpl) memoryCacheService.imageLoader).getSplashScreenView();
        splashScreenView.getClass();
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1) {
            intrinsicWidth = drawable.getBounds().width();
        }
        if (intrinsicHeight == -1) {
            intrinsicHeight = drawable.getBounds().height();
        }
        AppCompatImageView addLayer = addLayer(activity, splashScreenView, R.drawable.splash_logo_background, intrinsicWidth, intrinsicHeight);
        AppCompatImageView addLayer2 = addLayer(activity, splashScreenView, R.drawable.splash_logo_foreground, intrinsicWidth, intrinsicHeight);
        imageView.setImageDrawable(null);
        ArrayList arrayList = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.TRANSLATION_Y;
        property.getClass();
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(addLayer, (Property<AppCompatImageView, Float>) property, RecyclerView.DECELERATION_RATE, Views.dip((Context) activity, 10.0f));
        ofFloat2.setDuration(100L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(addLayer, (Property<AppCompatImageView, Float>) property, Views.dip((Context) activity, 10.0f), -Views.dip((Context) activity, 100.0f));
        ofFloat3.setDuration(200L);
        ofFloat3.setInterpolator(new AccelerateInterpolator(2.0f));
        Property property2 = View.ALPHA;
        property2.getClass();
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(addLayer, (Property<AppCompatImageView, Float>) property2, 1.0f, RecyclerView.DECELERATION_RATE);
        ofFloat4.setDuration(100L);
        ofFloat4.setStartDelay(ofFloat3.getDuration() - ofFloat4.getDuration());
        animatorSet.play(ofFloat2).before(ofFloat3);
        animatorSet.play(ofFloat3).with(ofFloat4);
        animatorSet.play(ofFloat4).after(ofFloat3.getDuration() - ofFloat4.getDuration());
        arrayList.add(animatorSet);
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(addLayer2, (Property<AppCompatImageView, Float>) property, RecyclerView.DECELERATION_RATE, Views.dip((Context) activity, 10.0f));
        ofFloat5.setDuration(100L);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(addLayer2, (Property<AppCompatImageView, Float>) property, Views.dip((Context) activity, 10.0f), -Views.dip((Context) activity, 100.0f));
        ofFloat6.setDuration(200L);
        ofFloat6.setInterpolator(new AccelerateInterpolator(1.6f));
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(addLayer2, (Property<AppCompatImageView, Float>) property2, 1.0f, RecyclerView.DECELERATION_RATE);
        ofFloat7.setDuration(100L);
        ofFloat7.setStartDelay(ofFloat6.getDuration() - ofFloat7.getDuration());
        animatorSet2.play(ofFloat5).before(ofFloat6);
        animatorSet2.play(ofFloat6).with(ofFloat7);
        animatorSet2.play(ofFloat7).after(ofFloat6.getDuration() - ofFloat7.getDuration());
        arrayList.add(animatorSet2);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(splashScreenView, (Property<ViewGroup, Float>) property2, 1.0f, RecyclerView.DECELERATION_RATE);
        ofFloat8.setDuration(200L);
        ofFloat8.setStartDelay(300L);
        ofFloat8.addListener(new ScreenFlashView.AnonymousClass2(memoryCacheService, 4));
        arrayList.add(ofFloat8);
        AnimatorSet animatorSet3 = new AnimatorSet();
        float dip = Views.dip((Context) activity, 50.0f);
        TaxWebAppBridge$$ExternalSyntheticLambda1 taxWebAppBridge$$ExternalSyntheticLambda1 = new TaxWebAppBridge$$ExternalSyntheticLambda1(29);
        if (splashScreenAnimationObserver.observers.get() > 0) {
            ofFloat = ObjectAnimator.ofFloat(splashScreenAnimationObserver, splashAnimationTranslationY, dip, RecyclerView.DECELERATION_RATE);
            taxWebAppBridge$$ExternalSyntheticLambda1.invoke(ofFloat);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, dip, RecyclerView.DECELERATION_RATE);
            taxWebAppBridge$$ExternalSyntheticLambda1.invoke(ofFloat);
        }
        view.setAlpha(RecyclerView.DECELERATION_RATE);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, RecyclerView.DECELERATION_RATE, 1.0f);
        ofFloat9.setDuration(250L);
        ofFloat9.setStartDelay(250L);
        animatorSet3.playTogether(ofFloat, ofFloat9);
        arrayList.add(animatorSet3);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(arrayList);
        animatorSet4.start();
    }
}
