package com.facebook.ads;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.q.a.i;
import com.facebook.ads.internal.q.a.v;
import com.facebook.ads.internal.q.c.g;

/* loaded from: classes.dex */
public class AdChoicesView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4728a;

    /* renamed from: b, reason: collision with root package name */
    private final NativeAd f4729b;

    /* renamed from: c, reason: collision with root package name */
    private final float f4730c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4731d;
    private TextView e;
    private String f;

    /* renamed from: com.facebook.ads.AdChoicesView$3, reason: invalid class name */
    class AnonymousClass3 implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f4737a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f4738b;

        AnonymousClass3(int i, int i2) {
            this.f4737a = i;
            this.f4738b = i2;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            new Handler().postDelayed(new Runnable() { // from class: com.facebook.ads.AdChoicesView.3.1
                @Override // java.lang.Runnable
                public void run() {
                    if (AdChoicesView.this.f4731d) {
                        AdChoicesView.this.f4731d = false;
                        Animation animation2 = new Animation() { // from class: com.facebook.ads.AdChoicesView.3.1.1
                            @Override // android.view.animation.Animation
                            protected void applyTransformation(float f, Transformation transformation) {
                                int i = (int) (AnonymousClass3.this.f4737a + ((AnonymousClass3.this.f4738b - AnonymousClass3.this.f4737a) * f));
                                AdChoicesView.this.getLayoutParams().width = i;
                                AdChoicesView.this.requestLayout();
                                AdChoicesView.this.e.getLayoutParams().width = i - AnonymousClass3.this.f4738b;
                                AdChoicesView.this.e.requestLayout();
                            }

                            @Override // android.view.animation.Animation
                            public boolean willChangeBounds() {
                                return true;
                            }
                        };
                        animation2.setDuration(300L);
                        animation2.setFillAfter(true);
                        AdChoicesView.this.startAnimation(animation2);
                    }
                }
            }, 3000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public AdChoicesView(Context context, NativeAd nativeAd) {
        this(context, nativeAd, false);
    }

    public AdChoicesView(Context context, final NativeAd nativeAd, boolean z) {
        super(context);
        this.f4731d = false;
        this.f4728a = context;
        this.f4729b = nativeAd;
        this.f4730c = v.f5438b;
        if (this.f4729b.isAdLoaded() && !this.f4729b.a().h()) {
            setVisibility(8);
            return;
        }
        this.f = this.f4729b.getAdChoicesText();
        if (TextUtils.isEmpty(this.f)) {
            this.f = "AdChoices";
        }
        NativeAd.Image adChoicesIcon = this.f4729b.getAdChoicesIcon();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        setOnTouchListener(new View.OnTouchListener() { // from class: com.facebook.ads.AdChoicesView.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                if (!AdChoicesView.this.f4731d) {
                    AdChoicesView.this.a();
                    return true;
                }
                if (TextUtils.isEmpty(AdChoicesView.this.f4729b.getAdChoicesLinkUrl())) {
                    return true;
                }
                g.a(new g(), AdChoicesView.this.f4728a, Uri.parse(AdChoicesView.this.f4729b.getAdChoicesLinkUrl()), nativeAd.g());
                return true;
            }
        });
        this.e = new TextView(this.f4728a);
        addView(this.e);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!z || adChoicesIcon == null) {
            this.f4731d = true;
        } else {
            layoutParams2.addRule(11, a(adChoicesIcon).getId());
            layoutParams2.width = 0;
            layoutParams.width = Math.round((adChoicesIcon.getWidth() + 4) * this.f4730c);
            layoutParams.height = Math.round((adChoicesIcon.getHeight() + 2) * this.f4730c);
            this.f4731d = false;
        }
        setLayoutParams(layoutParams);
        layoutParams2.addRule(15, -1);
        this.e.setLayoutParams(layoutParams2);
        this.e.setSingleLine();
        this.e.setText(this.f);
        this.e.setTextSize(10.0f);
        this.e.setTextColor(-4341303);
        i.a(this, i.INTERNAL_AD_CHOICES_ICON);
        i.a(this.e, i.INTERNAL_AD_CHOICES_ICON);
    }

    private ImageView a(NativeAd.Image image) {
        ImageView imageView = new ImageView(this.f4728a);
        addView(imageView);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Math.round(image.getWidth() * this.f4730c), Math.round(image.getHeight() * this.f4730c));
        layoutParams.addRule(9);
        layoutParams.addRule(15, -1);
        layoutParams.setMargins(Math.round(this.f4730c * 4.0f), Math.round(this.f4730c * 2.0f), Math.round(this.f4730c * 2.0f), Math.round(this.f4730c * 2.0f));
        imageView.setLayoutParams(layoutParams);
        NativeAd.downloadAndDisplayImage(image, imageView);
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Paint paint = new Paint();
        paint.setTextSize(this.e.getTextSize());
        int round = Math.round(paint.measureText(this.f) + (this.f4730c * 4.0f));
        final int width = getWidth();
        final int i = round + width;
        this.f4731d = true;
        Animation animation = new Animation() { // from class: com.facebook.ads.AdChoicesView.2
            @Override // android.view.animation.Animation
            protected void applyTransformation(float f, Transformation transformation) {
                int i2 = (int) (width + ((i - width) * f));
                AdChoicesView.this.getLayoutParams().width = i2;
                AdChoicesView.this.requestLayout();
                AdChoicesView.this.e.getLayoutParams().width = i2 - width;
                AdChoicesView.this.e.requestLayout();
            }

            @Override // android.view.animation.Animation
            public boolean willChangeBounds() {
                return true;
            }
        };
        animation.setAnimationListener(new AnonymousClass3(i, width));
        animation.setDuration(300L);
        animation.setFillAfter(true);
        startAnimation(animation);
    }
}
