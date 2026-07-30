package com.anythink.basead.ui;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.basead.b.e;
import com.anythink.basead.d.g;
import com.anythink.basead.ui.BaseShakeView;
import com.anythink.basead.ui.f.d;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.res.b;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.h;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class SinglePictureBottomSlideSplashATView extends BaseNewStyleSDKSplashATView {

    /* renamed from: a, reason: collision with root package name */
    View f10498a;
    TextView ad;
    final long ae;
    ObjectAnimator af;
    ValueAnimator ag;
    private List<Integer> ah;

    /* renamed from: b, reason: collision with root package name */
    ImageView f10499b;

    /* renamed from: c, reason: collision with root package name */
    SplashBottomShakeTextHintView f10500c;

    /* renamed from: d, reason: collision with root package name */
    TextView f10501d;

    /* renamed from: com.anythink.basead.ui.SinglePictureBottomSlideSplashATView$3, reason: invalid class name */
    public class AnonymousClass3 implements ValueAnimator.AnimatorUpdateListener {
        public AnonymousClass3() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            SinglePictureBottomSlideSplashATView singlePictureBottomSlideSplashATView = SinglePictureBottomSlideSplashATView.this;
            if (singlePictureBottomSlideSplashATView.f10499b == null || intValue >= singlePictureBottomSlideSplashATView.ah.size()) {
                return;
            }
            SinglePictureBottomSlideSplashATView singlePictureBottomSlideSplashATView2 = SinglePictureBottomSlideSplashATView.this;
            singlePictureBottomSlideSplashATView2.f10499b.setImageResource(((Integer) singlePictureBottomSlideSplashATView2.ah.get(intValue)).intValue());
        }
    }

    public SinglePictureBottomSlideSplashATView(Context context) {
        super(context);
        this.ae = 500L;
    }

    private void D() {
        View view = this.f10498a;
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 1.1f);
            this.af = ofFloat;
            ofFloat.setDuration(500L);
            this.af.setRepeatCount(-1);
            this.af.setRepeatMode(2);
        }
        if (this.f10499b != null) {
            ArrayList arrayList = new ArrayList();
            this.ah = arrayList;
            arrayList.add(Integer.valueOf(q.a(getContext(), "myoffer_slide_up_arrow_1", k.f19790c)));
            this.ah.add(Integer.valueOf(q.a(getContext(), "myoffer_slide_up_arrow_2", k.f19790c)));
            this.ah.add(Integer.valueOf(q.a(getContext(), "myoffer_slide_up_arrow_3", k.f19790c)));
            ValueAnimator ofInt = ValueAnimator.ofInt(0, this.ah.size());
            this.ag = ofInt;
            ofInt.setDuration(700L);
            this.ag.setRepeatCount(-1);
            this.ag.addUpdateListener(new AnonymousClass3());
        }
    }

    private void E() {
        ObjectAnimator objectAnimator = this.af;
        if (objectAnimator != null) {
            objectAnimator.start();
        }
        ValueAnimator valueAnimator = this.ag;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    private void F() {
        ObjectAnimator objectAnimator = this.af;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ValueAnimator valueAnimator = this.ag;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    private void G() {
        ObjectAnimator objectAnimator = this.af;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.af.cancel();
        }
        ValueAnimator valueAnimator = this.ag;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.ag.cancel();
        }
    }

    @Override // com.anythink.basead.ui.BaseSdkSplashATView
    public final void b() {
        View findViewById = findViewById(q.a(getContext(), "myoffer_splash_ad_bottom_container", "id"));
        this.f9902q = findViewById;
        this.f9899n.add(findViewById);
        this.f10498a = findViewById(q.a(getContext(), "myoffer_splash_ad_bottom_bg", "id"));
        this.f10499b = (ImageView) findViewById(q.a(getContext(), "myoffer_splash_ad_bottom_slide_icon", "id"));
        this.f10500c = (SplashBottomShakeTextHintView) findViewById(q.a(getContext(), "myoffer_splash_cta_shake", "id"));
        this.f10501d = (TextView) findViewById(q.a(getContext(), "myoffer_splash_ad_bottom_slide_hint", "id"));
        this.ad = (TextView) findViewById(q.a(getContext(), "myoffer_splash_ad_bottom_slide_title", "id"));
        if (n()) {
            if (this.f10500c != null) {
                this.f10499b.setVisibility(8);
                this.f10501d.setVisibility(8);
                this.ad.setText(e.a(getContext(), this.f9893g.K()));
                this.f10500c.setVisibility(0);
                this.f10500c.setShakeSetting(this.f9892f.f14325o, this.f9893g.K());
                this.f10500c.setOnShakeListener(new BaseShakeView.a() { // from class: com.anythink.basead.ui.SinglePictureBottomSlideSplashATView.2
                    @Override // com.anythink.basead.ui.BaseShakeView.a
                    public final boolean a() {
                        if (!SinglePictureBottomSlideSplashATView.this.C()) {
                            return false;
                        }
                        SinglePictureBottomSlideSplashATView.this.a(4, 5);
                        return true;
                    }
                }, this.f9892f.f14325o);
                return;
            }
            return;
        }
        View view = this.f10498a;
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 1.1f);
            this.af = ofFloat;
            ofFloat.setDuration(500L);
            this.af.setRepeatCount(-1);
            this.af.setRepeatMode(2);
        }
        if (this.f10499b != null) {
            ArrayList arrayList = new ArrayList();
            this.ah = arrayList;
            arrayList.add(Integer.valueOf(q.a(getContext(), "myoffer_slide_up_arrow_1", k.f19790c)));
            this.ah.add(Integer.valueOf(q.a(getContext(), "myoffer_slide_up_arrow_2", k.f19790c)));
            this.ah.add(Integer.valueOf(q.a(getContext(), "myoffer_slide_up_arrow_3", k.f19790c)));
            ValueAnimator ofInt = ValueAnimator.ofInt(0, this.ah.size());
            this.ag = ofInt;
            ofInt.setDuration(700L);
            this.ag.setRepeatCount(-1);
            this.ag.addUpdateListener(new AnonymousClass3());
        }
    }

    @Override // com.anythink.basead.ui.BaseSdkSplashATView
    public final void c() {
        super.c();
        com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, this.f9893g.B()), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new b.a() { // from class: com.anythink.basead.ui.SinglePictureBottomSlideSplashATView.4
            @Override // com.anythink.core.common.res.b.a
            public final void onFail(String str, String str2) {
            }

            @Override // com.anythink.core.common.res.b.a
            public final void onSuccess(String str, final Bitmap bitmap) {
                if (TextUtils.equals(str, SinglePictureBottomSlideSplashATView.this.f9893g.B())) {
                    SinglePictureBottomSlideSplashATView singlePictureBottomSlideSplashATView = SinglePictureBottomSlideSplashATView.this;
                    final WrapRoundImageView wrapRoundImageView = (WrapRoundImageView) singlePictureBottomSlideSplashATView.findViewById(q.a(singlePictureBottomSlideSplashATView.getContext(), "myoffer_splash_ad_content_image_area", "id"));
                    SinglePictureBottomSlideSplashATView singlePictureBottomSlideSplashATView2 = SinglePictureBottomSlideSplashATView.this;
                    final RoundImageView roundImageView = (RoundImageView) singlePictureBottomSlideSplashATView2.findViewById(q.a(singlePictureBottomSlideSplashATView2.getContext(), "myoffer_splash_bg", "id"));
                    wrapRoundImageView.setVisibility(0);
                    if (SinglePictureBottomSlideSplashATView.this.f9892f.f14325o.t() == 2) {
                        wrapRoundImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        wrapRoundImageView.setImageBitmap(bitmap);
                    } else {
                        wrapRoundImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        wrapRoundImageView.post(new Runnable() { // from class: com.anythink.basead.ui.SinglePictureBottomSlideSplashATView.4.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                wrapRoundImageView.setBitmapAndResize(bitmap, SinglePictureBottomSlideSplashATView.this.getWidth(), SinglePictureBottomSlideSplashATView.this.getHeight());
                            }
                        });
                    }
                    if (roundImageView != null) {
                        h.a(SinglePictureBottomSlideSplashATView.this.getContext(), bitmap, new h.a() { // from class: com.anythink.basead.ui.SinglePictureBottomSlideSplashATView.4.2
                            @Override // com.anythink.core.common.v.h.a
                            public final void a() {
                            }

                            @Override // com.anythink.core.common.v.h.a
                            public final void a(Bitmap bitmap2) {
                                roundImageView.setVisibility(0);
                                roundImageView.setImageBitmap(bitmap2);
                            }
                        });
                    }
                }
            }
        });
    }

    @Override // com.anythink.basead.ui.BaseSdkSplashATView
    public final void d() {
        a(this.f9892f.f14325o.ab() < 0 ? 100 : this.f9892f.f14325o.ab(), new Runnable() { // from class: com.anythink.basead.ui.SinglePictureBottomSlideSplashATView.5
            @Override // java.lang.Runnable
            public final void run() {
                SinglePictureBottomSlideSplashATView singlePictureBottomSlideSplashATView = SinglePictureBottomSlideSplashATView.this;
                if (singlePictureBottomSlideSplashATView.f10098O == null) {
                    return;
                }
                int width = singlePictureBottomSlideSplashATView.getWidth();
                int height = SinglePictureBottomSlideSplashATView.this.getHeight();
                int i = (int) (SinglePictureBottomSlideSplashATView.this.getResources().getDisplayMetrics().heightPixels * 0.5d);
                if (width < ((int) (SinglePictureBottomSlideSplashATView.this.getResources().getDisplayMetrics().widthPixels * 0.5d))) {
                    SinglePictureBottomSlideSplashATView.this.a(g.a(g.f6336k, "Splash display width is less than 50% of screen width!"));
                    Log.e("anythink", "Splash display width is less than 50% of screen width!");
                } else if (height >= i) {
                    SinglePictureBottomSlideSplashATView.this.j();
                } else {
                    SinglePictureBottomSlideSplashATView.this.a(g.a(g.f6336k, "Splash display height is less than 50% of screen height!"));
                    Log.e("anythink", "Splash display height is less than 50% of screen height!");
                }
            }
        });
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void a() {
        View inflate = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_splash_ad_layout_single_bottom_slide", "layout"), this);
        w();
        d dVar = this.f10103T;
        if (dVar != null) {
            dVar.a(d.f10958c).a(new com.anythink.basead.ui.d.a() { // from class: com.anythink.basead.ui.SinglePictureBottomSlideSplashATView.1
                @Override // com.anythink.basead.ui.d.a
                public final void a(int i, int i4) {
                    SinglePictureBottomSlideSplashATView.this.a(i, i4);
                }
            }).a(getContext(), inflate);
        }
    }

    public SinglePictureBottomSlideSplashATView(Context context, x xVar, w wVar, com.anythink.basead.g.a aVar) {
        super(context, xVar, wVar, aVar);
        this.ae = 500L;
    }

    @Override // com.anythink.basead.ui.BaseSdkSplashATView, com.anythink.basead.ui.BaseSplashATView, com.anythink.basead.ui.BaseATView
    public final void a(int i) {
        super.a(i);
        if (i != 110) {
            if (i == 111) {
                ObjectAnimator objectAnimator = this.af;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                ValueAnimator valueAnimator = this.ag;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    return;
                }
                return;
            }
            if (i != 114) {
                if (i != 115) {
                    return;
                }
                ObjectAnimator objectAnimator2 = this.af;
                if (objectAnimator2 != null) {
                    objectAnimator2.removeAllListeners();
                    this.af.cancel();
                }
                ValueAnimator valueAnimator2 = this.ag;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllListeners();
                    this.ag.cancel();
                    return;
                }
                return;
            }
        }
        ObjectAnimator objectAnimator3 = this.af;
        if (objectAnimator3 != null) {
            objectAnimator3.start();
        }
        ValueAnimator valueAnimator3 = this.ag;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }
}
