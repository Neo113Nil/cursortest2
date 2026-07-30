package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.b.e;
import com.anythink.basead.ui.BaseMediaATView;
import com.anythink.basead.ui.a;
import com.anythink.basead.ui.component.a;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.res.b;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.h;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class MediaATView extends BaseMediaATView implements a {
    public static final String TAG = "anythink_MediaATView";

    /* renamed from: j, reason: collision with root package name */
    protected TextView f10250j;

    /* renamed from: k, reason: collision with root package name */
    protected TextView f10251k;

    /* renamed from: l, reason: collision with root package name */
    protected ImageView f10252l;

    /* renamed from: m, reason: collision with root package name */
    protected ImageView f10253m;

    /* renamed from: n, reason: collision with root package name */
    protected RoundImageView f10254n;

    /* renamed from: o, reason: collision with root package name */
    protected TextView f10255o;

    /* renamed from: p, reason: collision with root package name */
    protected ImageView f10256p;

    /* renamed from: q, reason: collision with root package name */
    RelativeLayout f10257q;

    /* renamed from: r, reason: collision with root package name */
    private SimplePlayerMediaView f10258r;

    /* renamed from: com.anythink.basead.ui.MediaATView$2, reason: invalid class name */
    public class AnonymousClass2 implements b.a {
        public AnonymousClass2() {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
            Log.e(MediaATView.TAG, "load: image load fail:".concat(String.valueOf(str2)));
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, final Bitmap bitmap) {
            if (TextUtils.equals(MediaATView.this.f9983a.B(), str)) {
                MediaATView.this.f10253m.setVisibility(0);
                MediaATView.this.f10253m.setImageBitmap(bitmap);
                MediaATView.this.post(new Runnable() { // from class: com.anythink.basead.ui.MediaATView.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int width = MediaATView.this.getWidth();
                        int height = MediaATView.this.getHeight();
                        if (width <= 0 || height <= 0) {
                            return;
                        }
                        int[] a9 = am.a(width, height, bitmap.getWidth() / bitmap.getHeight());
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) MediaATView.this.f10253m.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = a9[0];
                            layoutParams.height = a9[1];
                            layoutParams.addRule(13);
                            MediaATView.this.f10253m.setLayoutParams(layoutParams);
                        }
                    }
                });
                h.a(MediaATView.this.getContext(), bitmap, new h.a() { // from class: com.anythink.basead.ui.MediaATView.2.2
                    @Override // com.anythink.core.common.v.h.a
                    public final void a() {
                    }

                    @Override // com.anythink.core.common.v.h.a
                    public final void a(Bitmap bitmap2) {
                        MediaATView.this.f10252l.setVisibility(0);
                        MediaATView.this.f10252l.setScaleType(ImageView.ScaleType.FIT_XY);
                        MediaATView.this.f10252l.setImageBitmap(bitmap2);
                    }
                });
            }
        }
    }

    public MediaATView(Context context, w wVar, x xVar, boolean z8, BaseMediaATView.a aVar) {
        super(context, wVar, xVar, z8, aVar);
    }

    private String b() {
        int i = this.f9990h;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "myoffer_media_ad_view" : "myoffer_template_text_float" : "myoffer_template_top_text" : "myoffer_template_top_image" : "myoffer_template_left_text" : "myoffer_template_left_image";
    }

    private void c() {
        FrameLayout frameLayout;
        TextView textView;
        if (a()) {
            int i = this.f9990h;
            if (i == 3 || i == 4 || i == 5) {
                ViewGroup viewGroup = (ViewGroup) findViewById(q.a(getContext(), "myoffer_title_desc", "id"));
                if (viewGroup != null) {
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof RelativeLayout.LayoutParams) {
                        ((RelativeLayout.LayoutParams) layoutParams).leftMargin = getResources().getDimensionPixelSize(q.a(getContext(), "myoffer_template_margin_white", "dimen"));
                        viewGroup.setLayoutParams(layoutParams);
                    }
                }
            } else if ((i == 1 || i == 2) && (textView = this.f10250j) != null) {
                ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    ((LinearLayout.LayoutParams) layoutParams2).leftMargin = 0;
                    this.f10250j.setLayoutParams(layoutParams2);
                }
            }
        }
        if (TextUtils.isEmpty(this.f9983a.x()) && this.f9990h == 6) {
            ViewGroup.LayoutParams layoutParams3 = this.f10255o.getLayoutParams();
            if (layoutParams3 instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams3).topMargin = 0;
                this.f10255o.setLayoutParams(layoutParams3);
            }
        }
        if (TextUtils.isEmpty(this.f9983a.y())) {
            int i4 = this.f9990h;
            if (i4 == 2 || i4 == 1) {
                ViewGroup.LayoutParams layoutParams4 = this.f10251k.getLayoutParams();
                if (layoutParams4 instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) layoutParams4;
                    layoutParams5.addRule(13);
                    layoutParams5.removeRule(12);
                }
            }
            if (this.f9990h != 5 || (frameLayout = (FrameLayout) findViewById(q.a(getContext(), "myoffer_template_bg_desc", "id"))) == null) {
                return;
            }
            frameLayout.setVisibility(8);
        }
    }

    private void d() {
        SimplePlayerMediaView simplePlayerMediaView = (SimplePlayerMediaView) findViewById(q.a(getContext(), "myoffer_media_ad_simple_player_view_no_g2c", "id"));
        this.f10258r = simplePlayerMediaView;
        if (simplePlayerMediaView != null) {
            simplePlayerMediaView.setVisibility(0);
        }
    }

    public void a(int i, int i4) {
        if (!e.a(this.f9983a, this.f9985c)) {
            this.f10253m.setScaleType(ImageView.ScaleType.FIT_CENTER);
            com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, this.f9983a.B()), i, i4, new AnonymousClass2());
            return;
        }
        SimplePlayerMediaView simplePlayerMediaView = (SimplePlayerMediaView) findViewById(q.a(getContext(), "myoffer_media_ad_simple_player_view_no_g2c", "id"));
        this.f10258r = simplePlayerMediaView;
        if (simplePlayerMediaView != null) {
            simplePlayerMediaView.setVisibility(0);
        }
    }

    @Override // com.anythink.basead.ui.a
    public void destroyPlayerView(int i) {
        SimplePlayerMediaView simplePlayerMediaView = this.f10258r;
        if (simplePlayerMediaView != null) {
            simplePlayerMediaView.destroyPlayerView(i);
        }
    }

    @Override // com.anythink.basead.ui.BaseMediaATView
    public List<View> getClickViews() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f10251k);
        if (this.f9984b.J() != 1) {
            arrayList.add(this.f10250j);
            arrayList.add(this.f10253m);
            arrayList.add(this.f10254n);
            arrayList.add(this.f10255o);
            y yVar = this.f9984b;
            if (yVar != null && yVar.J() == 0) {
                arrayList.add(this.f10252l);
                arrayList.add(this.f10257q);
            }
        }
        return arrayList;
    }

    @Override // com.anythink.basead.ui.BaseMediaATView
    public List<View> getContainerClickViews() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f10252l);
        arrayList.add(this.f10257q);
        return arrayList;
    }

    @Override // com.anythink.basead.ui.BaseMediaATView
    public View getMonitorClickView() {
        return this.f10251k;
    }

    @Override // com.anythink.basead.ui.a
    public long getVideoCurrentPosition() {
        SimplePlayerMediaView simplePlayerMediaView = this.f10258r;
        if (simplePlayerMediaView != null) {
            return simplePlayerMediaView.getVideoCurrentPosition();
        }
        return 0L;
    }

    @Override // com.anythink.basead.ui.BaseMediaATView
    public void init(int i, int i4, int i9) {
        FrameLayout frameLayout;
        TextView textView;
        w wVar;
        View findViewById;
        super.init(i, i4, i9);
        int i10 = this.f9990h;
        View inflate = LayoutInflater.from(getContext()).inflate(q.a(getContext(), i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "myoffer_media_ad_view" : "myoffer_template_text_float" : "myoffer_template_top_text" : "myoffer_template_top_image" : "myoffer_template_left_text" : "myoffer_template_left_image", "layout"), (ViewGroup) null, false);
        FrameLayout frameLayout2 = this.f9988f;
        if (frameLayout2 != null) {
            frameLayout2.removeAllViews();
            this.f9988f.addView(inflate, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f10250j = (TextView) findViewById(q.a(getContext(), "myoffer_banner_ad_title", "id"));
        this.f10251k = (TextView) findViewById(q.a(getContext(), "myoffer_media_ad_cta", "id"));
        this.f10252l = (ImageView) findViewById(q.a(getContext(), "myoffer_media_ad_bg_blur", "id"));
        this.f10253m = (ImageView) findViewById(q.a(getContext(), "myoffer_media_ad_main_image", "id"));
        this.f10256p = (ImageView) findViewById(q.a(getContext(), "myoffer_ad_logo", "id"));
        this.f10254n = (RoundImageView) findViewById(q.a(getContext(), "myoffer_media_ad_icon", "id"));
        this.f10255o = (TextView) findViewById(q.a(getContext(), "myoffer_banner_ad_desc", "id"));
        this.f10257q = (RelativeLayout) findViewById(q.a(getContext(), "myoffer_media_ad_container", "id"));
        String x3 = this.f9983a.x();
        if (TextUtils.isEmpty(x3)) {
            this.f10250j.setVisibility(8);
        } else {
            this.f10250j.setText(x3);
        }
        String D8 = this.f9983a.D();
        if (TextUtils.isEmpty(D8)) {
            this.f10251k.setText(q.a(getContext(), "myoffer_cta_learn_more", k.f19794g));
        } else {
            this.f10251k.setText(D8);
        }
        String y6 = this.f9983a.y();
        if (TextUtils.isEmpty(y6)) {
            this.f10255o.setVisibility(8);
        } else {
            this.f10255o.setText(y6);
        }
        if (TextUtils.isEmpty(this.f9983a.z())) {
            this.f10254n.setVisibility(8);
        } else {
            this.f10254n.setRadiusInDip(6);
            this.f10254n.setNeedRadiu(true);
            ViewGroup.LayoutParams layoutParams = this.f10254n.getLayoutParams();
            com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, this.f9983a.z()), layoutParams.width, layoutParams.height, new b.a() { // from class: com.anythink.basead.ui.MediaATView.1
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (TextUtils.equals(MediaATView.this.f9983a.z(), str)) {
                        MediaATView.this.f10254n.setImageBitmap(bitmap);
                    }
                }
            });
        }
        com.anythink.basead.ui.f.a aVar = new com.anythink.basead.ui.f.a(this.f9983a, this.f9985c);
        this.i = aVar;
        aVar.b(this);
        if (!e.a(this.f9983a) && (findViewById = findViewById(q.a(getContext(), "myoffer_media_ad_main_image_container", "id"))) != null) {
            ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams2).bottomMargin = q.a(getContext(), 84.0f);
                findViewById.setLayoutParams(layoutParams2);
            }
        }
        a(i, i4);
        if ((this.f10251k instanceof ScanningAnimButton) && (wVar = this.f9983a) != null && wVar.r() != null) {
            ((ScanningAnimButton) this.f10251k).startAnimation(this.f9983a.r().aH());
        }
        if (a()) {
            int i11 = this.f9990h;
            if (i11 == 3 || i11 == 4 || i11 == 5) {
                ViewGroup viewGroup = (ViewGroup) findViewById(q.a(getContext(), "myoffer_title_desc", "id"));
                if (viewGroup != null) {
                    ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
                    if (layoutParams3 instanceof RelativeLayout.LayoutParams) {
                        ((RelativeLayout.LayoutParams) layoutParams3).leftMargin = getResources().getDimensionPixelSize(q.a(getContext(), "myoffer_template_margin_white", "dimen"));
                        viewGroup.setLayoutParams(layoutParams3);
                    }
                }
            } else if ((i11 == 1 || i11 == 2) && (textView = this.f10250j) != null) {
                ViewGroup.LayoutParams layoutParams4 = textView.getLayoutParams();
                if (layoutParams4 instanceof LinearLayout.LayoutParams) {
                    ((LinearLayout.LayoutParams) layoutParams4).leftMargin = 0;
                    this.f10250j.setLayoutParams(layoutParams4);
                }
            }
        }
        if (TextUtils.isEmpty(this.f9983a.x()) && this.f9990h == 6) {
            ViewGroup.LayoutParams layoutParams5 = this.f10255o.getLayoutParams();
            if (layoutParams5 instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams5).topMargin = 0;
                this.f10255o.setLayoutParams(layoutParams5);
            }
        }
        if (TextUtils.isEmpty(this.f9983a.y())) {
            int i12 = this.f9990h;
            if (i12 == 2 || i12 == 1) {
                ViewGroup.LayoutParams layoutParams6 = this.f10251k.getLayoutParams();
                if (layoutParams6 instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) layoutParams6;
                    layoutParams7.addRule(13);
                    layoutParams7.removeRule(12);
                }
            }
            if (this.f9990h != 5 || (frameLayout = (FrameLayout) findViewById(q.a(getContext(), "myoffer_template_bg_desc", "id"))) == null) {
                return;
            }
            frameLayout.setVisibility(8);
        }
    }

    @Override // com.anythink.basead.ui.a
    public void initPlayerView(w wVar, x xVar, a.InterfaceC0055a interfaceC0055a, com.anythink.basead.j.e eVar) {
        SimplePlayerMediaView simplePlayerMediaView = this.f10258r;
        if (simplePlayerMediaView != null) {
            simplePlayerMediaView.initPlayerView(wVar, xVar, interfaceC0055a, eVar);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        super.onLayout(z8, i, i4, i9, i10);
    }

    @Override // com.anythink.basead.ui.a
    public void pauseVideo() {
        SimplePlayerMediaView simplePlayerMediaView = this.f10258r;
        if (simplePlayerMediaView != null) {
            simplePlayerMediaView.pauseVideo();
        }
    }

    @Override // com.anythink.basead.ui.a
    public void resumeVideo() {
        SimplePlayerMediaView simplePlayerMediaView = this.f10258r;
        if (simplePlayerMediaView != null) {
            simplePlayerMediaView.resumeVideo();
        }
    }

    @Override // com.anythink.basead.ui.a
    public void setATImproveClickViewController(com.anythink.basead.ui.improveclick.a aVar) {
        SimplePlayerMediaView simplePlayerMediaView = this.f10258r;
        if (simplePlayerMediaView != null) {
            simplePlayerMediaView.setATImproveClickViewController(aVar);
        }
    }

    @Override // com.anythink.basead.ui.a
    public void setAutoPlay(String str) {
        SimplePlayerMediaView simplePlayerMediaView = this.f10258r;
        if (simplePlayerMediaView != null) {
            simplePlayerMediaView.setAutoPlay(str);
        }
    }

    @Override // com.anythink.basead.ui.a
    public void setIsMuted(boolean z8) {
        SimplePlayerMediaView simplePlayerMediaView = this.f10258r;
        if (simplePlayerMediaView != null) {
            simplePlayerMediaView.setIsMuted(z8);
        }
    }

    @Override // com.anythink.basead.ui.a
    public void setPlayerOnClickListener(View.OnClickListener onClickListener) {
        SimplePlayerMediaView simplePlayerMediaView = this.f10258r;
        if (simplePlayerMediaView != null) {
            simplePlayerMediaView.setPlayerOnClickListener(onClickListener);
        }
    }

    @Override // com.anythink.basead.ui.a
    public void setVideoListener(a.InterfaceC0049a interfaceC0049a) {
        SimplePlayerMediaView simplePlayerMediaView = this.f10258r;
        if (simplePlayerMediaView != null) {
            simplePlayerMediaView.setVideoListener(interfaceC0049a);
        }
    }

    private void b(int i, int i4) {
        this.f10253m.setScaleType(ImageView.ScaleType.FIT_CENTER);
        com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, this.f9983a.B()), i, i4, new AnonymousClass2());
    }

    public boolean a() {
        return TextUtils.isEmpty(this.f9983a.z());
    }
}
