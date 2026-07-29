package com.tapjoy;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Handler;
import android.support.v4.view.ViewCompat;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

/* loaded from: classes2.dex */
public class TJCloseButton extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7668a = "TJCloseButton";

    /* renamed from: b, reason: collision with root package name */
    private ClosePosition f7669b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7670c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7671d;

    static /* synthetic */ boolean b(TJCloseButton tJCloseButton) {
        tJCloseButton.f7671d = false;
        return false;
    }

    public enum ClosePosition {
        TOP_LEFT(new int[]{10, 9}),
        TOP_CENTER(new int[]{10, 14}),
        TOP_RIGHT(new int[]{10, 11}),
        CENTER(new int[]{13}),
        BOTTOM_LEFT(new int[]{12, 9}),
        BOTTOM_CENTER(new int[]{12, 14}),
        BOTTOM_RIGHT(new int[]{12, 11});


        /* renamed from: a, reason: collision with root package name */
        final RelativeLayout.LayoutParams f7675a = new RelativeLayout.LayoutParams(-2, -2);

        ClosePosition(int[] iArr) {
            for (int i : iArr) {
                this.f7675a.addRule(i);
            }
            int deviceScreenDensityScale = (int) (TapjoyConnectCore.getDeviceScreenDensityScale() * (-10.0f));
            this.f7675a.setMargins(0, deviceScreenDensityScale, deviceScreenDensityScale, 0);
        }
    }

    public TJCloseButton(Context context) {
        this(context, ClosePosition.TOP_RIGHT);
    }

    public TJCloseButton(Context context, ClosePosition closePosition) {
        super(context);
        Bitmap decodeResource;
        this.f7670c = true;
        this.f7669b = closePosition;
        Bitmap loadBitmapFromJar = TapjoyUtil.loadBitmapFromJar("tj_close_button.png", context);
        if (loadBitmapFromJar == null) {
            try {
                decodeResource = BitmapFactory.decodeResource(context.getResources(), context.getResources().getIdentifier("tj_close_button", "drawable", context.getPackageName()));
            } catch (Exception unused) {
                TapjoyLog.w(f7668a, "Could not find close button asset");
            }
            setImageBitmap(decodeResource);
            setBackgroundColor(ViewCompat.MEASURED_SIZE_MASK);
            setLayoutParams(this.f7669b.f7675a);
        }
        decodeResource = loadBitmapFromJar;
        setImageBitmap(decodeResource);
        setBackgroundColor(ViewCompat.MEASURED_SIZE_MASK);
        setLayoutParams(this.f7669b.f7675a);
    }

    @Override // android.widget.ImageView, android.view.View
    @TargetApi(11)
    protected void onAttachedToWindow() {
        if (Build.VERSION.SDK_INT >= 12) {
            setAlpha(0.0f);
            setVisibility(0);
            this.f7671d = true;
            setClickable(false);
            new Handler().postDelayed(new Runnable() { // from class: com.tapjoy.TJCloseButton.1
                @Override // java.lang.Runnable
                @SuppressLint({"NewApi"})
                public final void run() {
                    TJCloseButton.this.animate().alpha(1.0f).setDuration(500L).setListener(new Animator.AnimatorListener() { // from class: com.tapjoy.TJCloseButton.1.1
                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                            TJCloseButton.this.setClickable(TJCloseButton.this.f7670c);
                            TJCloseButton.b(TJCloseButton.this);
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            TJCloseButton.this.setClickable(TJCloseButton.this.f7670c);
                            TJCloseButton.b(TJCloseButton.this);
                        }
                    });
                }
            }, 2000L);
        }
    }

    void setClickableRequested(boolean z) {
        this.f7670c = z;
        if (this.f7671d) {
            return;
        }
        setClickable(z);
    }
}
