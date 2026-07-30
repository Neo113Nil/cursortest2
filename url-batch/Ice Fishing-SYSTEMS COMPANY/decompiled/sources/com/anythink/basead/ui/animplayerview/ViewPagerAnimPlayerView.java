package com.anythink.basead.ui.animplayerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.anythink.basead.d.g;
import com.anythink.basead.ui.WrapRoundImageView;
import com.anythink.basead.ui.animplayerview.viewpager.VpMainImgAnimatorView;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.res.image.RecycleImageView;
import com.anythink.core.common.v.h;

/* loaded from: classes.dex */
public class ViewPagerAnimPlayerView extends BaseMainAnimPlayerView {

    /* renamed from: A, reason: collision with root package name */
    private c f10635A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f10636B;

    /* renamed from: h, reason: collision with root package name */
    private RecycleImageView f10637h;

    /* renamed from: com.anythink.basead.ui.animplayerview.ViewPagerAnimPlayerView$1, reason: invalid class name */
    public class AnonymousClass1 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WrapRoundImageView f10638a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ WrapRoundImageView f10639b;

        public AnonymousClass1(WrapRoundImageView wrapRoundImageView, WrapRoundImageView wrapRoundImageView2) {
            this.f10638a = wrapRoundImageView;
            this.f10639b = wrapRoundImageView2;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
            ViewPagerAnimPlayerView.this.a(g.a(g.f6337l, g.f6321T));
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, ViewPagerAnimPlayerView.this.f10598e)) {
                if (ViewPagerAnimPlayerView.this.f10637h != null && bitmap != null) {
                    h.a(ViewPagerAnimPlayerView.this.getContext(), bitmap, new h.a() { // from class: com.anythink.basead.ui.animplayerview.ViewPagerAnimPlayerView.1.1
                        @Override // com.anythink.core.common.v.h.a
                        public final void a() {
                        }

                        @Override // com.anythink.core.common.v.h.a
                        public final void a(Bitmap bitmap2) {
                            ViewPagerAnimPlayerView.this.f10637h.setImageBitmap(bitmap2);
                        }
                    });
                }
                if (ViewPagerAnimPlayerView.this.f10635A == null) {
                    ViewPagerAnimPlayerView.this.f10635A = new VpMainImgAnimatorView(ViewPagerAnimPlayerView.this.getContext().getApplicationContext());
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams.addRule(13);
                    ((View) ViewPagerAnimPlayerView.this.f10635A).setLayoutParams(layoutParams);
                    ViewPagerAnimPlayerView viewPagerAnimPlayerView = ViewPagerAnimPlayerView.this;
                    viewPagerAnimPlayerView.addView((View) viewPagerAnimPlayerView.f10635A);
                    ViewPagerAnimPlayerView.this.f10635A.addMainView(bitmap, this.f10638a, this.f10639b);
                }
                if (ViewPagerAnimPlayerView.this.f10636B) {
                    ViewPagerAnimPlayerView.d(ViewPagerAnimPlayerView.this);
                    if (ViewPagerAnimPlayerView.this.f10635A != null) {
                        ViewPagerAnimPlayerView.this.f10635A.start();
                    }
                }
            }
        }
    }

    public ViewPagerAnimPlayerView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ boolean d(ViewPagerAnimPlayerView viewPagerAnimPlayerView) {
        viewPagerAnimPlayerView.f10636B = false;
        return false;
    }

    private void i() {
        WrapRoundImageView wrapRoundImageView = new WrapRoundImageView(getContext().getApplicationContext());
        WrapRoundImageView wrapRoundImageView2 = new WrapRoundImageView(getContext().getApplicationContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        wrapRoundImageView.setScaleType(scaleType);
        wrapRoundImageView2.setScaleType(scaleType);
        com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f10598e), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new AnonymousClass1(wrapRoundImageView, wrapRoundImageView2));
    }

    public ViewPagerAnimPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView
    public final void b() {
        c cVar = this.f10635A;
        if (cVar != null) {
            cVar.pause();
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView
    public final void c() {
        c cVar = this.f10635A;
        if (cVar != null) {
            cVar.stop();
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView
    public final void d() {
        c cVar = this.f10635A;
        if (cVar != null) {
            cVar.release();
            this.f10635A = null;
        }
    }

    public ViewPagerAnimPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseMainAnimPlayerView
    public final void a(Context context) {
        RecycleImageView recycleImageView = new RecycleImageView(context);
        this.f10637h = recycleImageView;
        recycleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.f10637h, -1, -1);
        WrapRoundImageView wrapRoundImageView = new WrapRoundImageView(getContext().getApplicationContext());
        WrapRoundImageView wrapRoundImageView2 = new WrapRoundImageView(getContext().getApplicationContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        wrapRoundImageView.setScaleType(scaleType);
        wrapRoundImageView2.setScaleType(scaleType);
        com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f10598e), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new AnonymousClass1(wrapRoundImageView, wrapRoundImageView2));
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView
    public final void a() {
        c cVar = this.f10635A;
        if (cVar != null) {
            cVar.start();
        } else {
            this.f10636B = true;
        }
    }
}
