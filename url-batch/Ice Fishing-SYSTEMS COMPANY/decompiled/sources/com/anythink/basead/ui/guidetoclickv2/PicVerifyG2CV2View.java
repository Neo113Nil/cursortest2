package com.anythink.basead.ui.guidetoclickv2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View;
import com.anythink.basead.ui.guidetoclickv2.picverify.PictureVerifyView;
import com.anythink.basead.ui.guidetoclickv2.picverify.TextSeekbar;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class PicVerifyG2CV2View extends BaseG2CV2View {

    /* renamed from: d, reason: collision with root package name */
    PictureVerifyView f11119d;

    /* renamed from: e, reason: collision with root package name */
    TextSeekbar f11120e;

    /* renamed from: f, reason: collision with root package name */
    String f11121f;

    /* renamed from: g, reason: collision with root package name */
    ValueAnimator f11122g;

    /* renamed from: h, reason: collision with root package name */
    ValueAnimator f11123h;
    int i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f11124j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f11125k;

    /* renamed from: l, reason: collision with root package name */
    private final int f11126l;

    /* renamed from: m, reason: collision with root package name */
    private final int f11127m;

    /* renamed from: n, reason: collision with root package name */
    private final int f11128n;

    /* renamed from: o, reason: collision with root package name */
    private final int f11129o;

    /* renamed from: com.anythink.basead.ui.guidetoclickv2.PicVerifyG2CV2View$4, reason: invalid class name */
    public class AnonymousClass4 implements ValueAnimator.AnimatorUpdateListener {
        public AnonymousClass4() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            PicVerifyG2CV2View.this.f11120e.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.anythink.basead.ui.guidetoclickv2.PicVerifyG2CV2View$5, reason: invalid class name */
    public class AnonymousClass5 implements ValueAnimator.AnimatorUpdateListener {
        public AnonymousClass5() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            PicVerifyG2CV2View picVerifyG2CV2View = PicVerifyG2CV2View.this;
            if (picVerifyG2CV2View.i != intValue) {
                picVerifyG2CV2View.i = intValue;
                picVerifyG2CV2View.f11120e.setProgress(intValue);
            }
        }
    }

    public PicVerifyG2CV2View(Context context) {
        super(context);
        this.f11126l = 30;
        this.f11127m = 15;
        this.f11128n = 500;
        this.f11129o = 300;
        this.i = -1;
    }

    private void d() {
        this.f11120e.setProgress(0);
    }

    private void e() {
        if (this.f11122g == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 15);
            this.f11122g = ofInt;
            ofInt.addUpdateListener(new AnonymousClass4());
            this.f11122g.setRepeatMode(2);
            this.f11122g.setRepeatCount(-1);
            this.f11122g.setDuration(500L);
        }
        if (this.f11122g.isStarted() || this.f11123h != null) {
            return;
        }
        this.f11122g.start();
    }

    private void f() {
        ValueAnimator valueAnimator = this.f11122g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public boolean canStartNextAnim() {
        return this.f11123h == null;
    }

    public void loadImage(String str) {
        this.f11121f = str;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public void release() {
        super.release();
        ValueAnimator valueAnimator = this.f11122g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f11123h;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    public static /* synthetic */ void d(PicVerifyG2CV2View picVerifyG2CV2View) {
        ValueAnimator valueAnimator = picVerifyG2CV2View.f11122g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View
    public final void a(int i, int i4) {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_g2c_v2_pic_vertify", "layout"), this);
        this.f11119d = (PictureVerifyView) findViewById(q.a(getContext(), "myoffer_g2c_picvertify", "id"));
        this.f11120e = (TextSeekbar) findViewById(q.a(getContext(), "myoffer_g2c_picvertify_seekbar", "id"));
        final int a9 = q.a(getContext(), 48.0f);
        this.f11119d.setBlockSize(a9);
        this.f11119d.callback(new PictureVerifyView.a() { // from class: com.anythink.basead.ui.guidetoclickv2.PicVerifyG2CV2View.1
            @Override // com.anythink.basead.ui.guidetoclickv2.picverify.PictureVerifyView.a
            public final void a() {
                c.a aVar = PicVerifyG2CV2View.this.f10991c;
                if (aVar != null) {
                    aVar.a(11, 16);
                }
            }

            @Override // com.anythink.basead.ui.guidetoclickv2.picverify.PictureVerifyView.a
            public final void b() {
            }
        });
        if (!TextUtils.isEmpty(this.f11121f)) {
            com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f11121f), new b.a() { // from class: com.anythink.basead.ui.guidetoclickv2.PicVerifyG2CV2View.2
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (TextUtils.equals(str, PicVerifyG2CV2View.this.f11121f)) {
                        DisplayMetrics displayMetrics = PicVerifyG2CV2View.this.getContext().getResources().getDisplayMetrics();
                        int[] a10 = am.a(displayMetrics.widthPixels, displayMetrics.heightPixels, bitmap.getWidth() / bitmap.getHeight());
                        int i9 = a9 * 2;
                        if (bitmap.getWidth() < i9 || bitmap.getHeight() < i9) {
                            BaseG2CV2View.b bVar = PicVerifyG2CV2View.this.f10989a;
                            if (bVar != null) {
                                bVar.a();
                                return;
                            }
                            return;
                        }
                        int a11 = q.a(PicVerifyG2CV2View.this.getContext(), 180.0f);
                        if (a10[0] < a11 || a10[1] < a11) {
                            BaseG2CV2View.b bVar2 = PicVerifyG2CV2View.this.f10989a;
                            if (bVar2 != null) {
                                bVar2.a();
                                return;
                            }
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams = PicVerifyG2CV2View.this.f11119d.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = a10[0];
                            layoutParams.height = a10[1];
                            PicVerifyG2CV2View.this.f11119d.setLayoutParams(layoutParams);
                        }
                        PicVerifyG2CV2View.this.f11119d.setImageBitmap(bitmap);
                        PicVerifyG2CV2View.this.post(new Runnable() { // from class: com.anythink.basead.ui.guidetoclickv2.PicVerifyG2CV2View.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((RelativeLayout.LayoutParams) PicVerifyG2CV2View.this.f11120e.getLayoutParams()).setMargins(0, (a9 / 2) + (PicVerifyG2CV2View.this.getMeasuredHeight() / 2), 0, 0);
                                PicVerifyG2CV2View.this.f11120e.setVisibility(0);
                                PicVerifyG2CV2View.a(PicVerifyG2CV2View.this);
                            }
                        });
                    }
                }
            });
        }
        this.f11120e.setProgressDrawable(getResources().getDrawable(q.a(getContext(), "myoffer_g2c_seek_bar_bg", k.f19790c)));
        TextSeekbar textSeekbar = this.f11120e;
        Context context = getContext();
        int a10 = q.a(getContext(), "myoffer_seek_bar_icon", k.f19790c);
        textSeekbar.setThumb(new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), a10), q.a(getContext(), 60.0f), q.a(getContext(), 24.0f), false)));
        this.f11120e.setThumbOffset(0);
        this.f11120e.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.anythink.basead.ui.guidetoclickv2.PicVerifyG2CV2View.3
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar, int i9, boolean z8) {
                if (!z8) {
                    PicVerifyG2CV2View.this.f11119d.move(i9);
                    if (i9 == 100) {
                        PicVerifyG2CV2View.this.f11119d.loose();
                        return;
                    }
                    return;
                }
                if (PicVerifyG2CV2View.this.f11125k) {
                    PicVerifyG2CV2View.this.f11125k = false;
                    if (i9 > 30) {
                        PicVerifyG2CV2View.this.f11124j = false;
                    } else {
                        PicVerifyG2CV2View.this.f11124j = true;
                    }
                }
                if (!PicVerifyG2CV2View.this.f11124j) {
                    seekBar.setProgress(0);
                } else if (i9 > 30) {
                    PicVerifyG2CV2View.a(PicVerifyG2CV2View.this, i9);
                } else {
                    PicVerifyG2CV2View.this.f11119d.move(i9);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar) {
                PicVerifyG2CV2View.this.f11125k = true;
                PicVerifyG2CV2View.d(PicVerifyG2CV2View.this);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar) {
                if (PicVerifyG2CV2View.this.f11124j) {
                    PicVerifyG2CV2View.this.f11119d.loose();
                }
                PicVerifyG2CV2View.a(PicVerifyG2CV2View.this);
            }
        });
    }

    private void a(int i) {
        this.f11120e.setClickable(false);
        this.f11120e.setEnabled(false);
        this.f11120e.getProgressDrawable().setAlpha(p.f8630b);
        if (this.f11123h == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i, 100);
            this.f11123h = ofInt;
            ofInt.addUpdateListener(new AnonymousClass5());
            this.f11123h.setDuration(300L);
            this.f11123h.start();
        }
    }

    private BitmapDrawable a(Context context, int i, int i4, int i9) {
        return new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(BitmapFactory.decodeResource(context.getResources(), i), i4, i9, false));
    }

    public static /* synthetic */ void a(PicVerifyG2CV2View picVerifyG2CV2View) {
        if (picVerifyG2CV2View.f11122g == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 15);
            picVerifyG2CV2View.f11122g = ofInt;
            ofInt.addUpdateListener(picVerifyG2CV2View.new AnonymousClass4());
            picVerifyG2CV2View.f11122g.setRepeatMode(2);
            picVerifyG2CV2View.f11122g.setRepeatCount(-1);
            picVerifyG2CV2View.f11122g.setDuration(500L);
        }
        if (picVerifyG2CV2View.f11122g.isStarted() || picVerifyG2CV2View.f11123h != null) {
            return;
        }
        picVerifyG2CV2View.f11122g.start();
    }

    public static /* synthetic */ void a(PicVerifyG2CV2View picVerifyG2CV2View, int i) {
        picVerifyG2CV2View.f11120e.setClickable(false);
        picVerifyG2CV2View.f11120e.setEnabled(false);
        picVerifyG2CV2View.f11120e.getProgressDrawable().setAlpha(p.f8630b);
        if (picVerifyG2CV2View.f11123h == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i, 100);
            picVerifyG2CV2View.f11123h = ofInt;
            ofInt.addUpdateListener(picVerifyG2CV2View.new AnonymousClass5());
            picVerifyG2CV2View.f11123h.setDuration(300L);
            picVerifyG2CV2View.f11123h.start();
        }
    }
}
