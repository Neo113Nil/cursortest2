package com.baidu.platform.comapi.bikenavi.widget;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.baidu.baidumapsdk_api.R;
import com.baidu.mapapi.bikenavi.controllers.BNavigatorWrapper;
import com.baidu.mapapi.bikenavi.model.BikeNaviDisplayOption;
import com.baidu.mapapi.bikenavi.model.c;

/* loaded from: classes2.dex */
public class b extends com.baidu.platform.comapi.walknavi.k.f.b {

    /* renamed from: b, reason: collision with root package name */
    private Activity f8847b;

    /* renamed from: c, reason: collision with root package name */
    private com.baidu.platform.comapi.b.c.b f8848c;

    /* renamed from: d, reason: collision with root package name */
    private ImageView f8849d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f8850e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f8851f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f8852g;

    /* renamed from: h, reason: collision with root package name */
    private View f8853h;

    /* renamed from: i, reason: collision with root package name */
    private RelativeLayout f8854i;

    /* renamed from: j, reason: collision with root package name */
    private c f8855j = null;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8856k = false;

    /* renamed from: l, reason: collision with root package name */
    private final com.baidu.platform.comapi.b.c.c f8857l;

    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            b.this.f8853h.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.baidu.platform.comapi.bikenavi.widget.b$b, reason: collision with other inner class name */
    class AnimationAnimationListenerC0101b implements Animation.AnimationListener {
        AnimationAnimationListenerC0101b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            b.this.f8853h.setVisibility(8);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public b(Context context, com.baidu.platform.comapi.b.c.b bVar, View view, com.baidu.platform.comapi.b.c.c cVar) {
        this.f8847b = (Activity) context;
        this.f8848c = bVar;
        this.f8857l = cVar;
        b(view);
        f();
    }

    private void b(View view) {
        this.f8854i = (RelativeLayout) view.findViewById(R.id.rl_bike_top_guide);
        BNavigatorWrapper.getWNavigator();
        BikeNaviDisplayOption e8 = com.baidu.platform.comapi.walknavi.b.n().e();
        if (e8 != null && !e8.getShowTopLayout()) {
            this.f8854i.setVisibility(8);
        }
        if (e8 == null || !e8.isUseCustomTopGuideLayout()) {
            a(view);
            this.f8851f.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f8847b, this.f8857l.z()));
            this.f8852g.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f8847b, this.f8857l.c0()));
        } else {
            if (!a(e8)) {
                a(view);
            }
            this.f8851f.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f8847b, this.f8857l.z()));
            this.f8852g.setText(com.baidu.platform.comapi.h.t.p.a.b(this.f8847b, this.f8857l.c0()));
            this.f8853h.setVisibility(8);
        }
    }

    private void f() {
        BNavigatorWrapper.getWNavigator();
        BikeNaviDisplayOption e8 = com.baidu.platform.comapi.walknavi.b.n().e();
        if (e8 == null || e8.getBikeNaviTypeface() == null) {
            return;
        }
        TextView textView = this.f8850e;
        if (textView != null) {
            textView.setTypeface(e8.getBikeNaviTypeface());
        }
        TextView textView2 = this.f8851f;
        if (textView2 != null) {
            textView2.setTypeface(e8.getBikeNaviTypeface());
        }
        TextView textView3 = this.f8852g;
        if (textView3 != null) {
            textView3.setTypeface(e8.getBikeNaviTypeface());
        }
    }

    public void a(c cVar) {
        this.f8855j = cVar;
    }

    public void e() {
        if (this.f8853h.getVisibility() == 0) {
            Animation c8 = com.baidu.platform.comapi.h.t.p.a.c(this.f8847b, R.anim.wsdk_anim_fadeaway);
            c8.setAnimationListener(new AnimationAnimationListenerC0101b());
            this.f8853h.startAnimation(c8);
        }
    }

    public void g() {
        BNavigatorWrapper.getWNavigator();
        BikeNaviDisplayOption e8 = com.baidu.platform.comapi.walknavi.b.n().e();
        if ((e8 == null || e8.getShowTopLayout()) && this.f8853h.getVisibility() == 8) {
            this.f8853h.setVisibility(0);
            Animation c8 = com.baidu.platform.comapi.h.t.p.a.c(this.f8847b, R.anim.wsdk_anim_comeout);
            this.f8853h.setAnimation(c8);
            c8.setAnimationListener(new a());
            c8.start();
        }
    }

    private boolean a(BikeNaviDisplayOption bikeNaviDisplayOption) {
        if (bikeNaviDisplayOption == null) {
            Log.e("CustomWNaviView", "Load BikeTopGuide layout failed,BikeNaviDisplayOption is null.");
            return false;
        }
        int topGuideLayout = bikeNaviDisplayOption.getTopGuideLayout();
        if (topGuideLayout == 0) {
            Log.e("CustomWNaviView", "BikeTopGuide layout resource is empty.");
            return false;
        }
        if (this.f8854i == null) {
            Log.e("CustomWNaviView", "BikeTopGuide layout add failed.");
            return false;
        }
        View inflate = LayoutInflater.from(this.f8847b).inflate(topGuideLayout, (ViewGroup) this.f8854i, false);
        if (inflate == null) {
            Log.e("CustomWNaviView", "Load BikeTopGuide layout failed,please checking layout.");
            return false;
        }
        if (!com.baidu.platform.comapi.walknavi.k.g.b.a().a(this.f8847b, 4, topGuideLayout, this)) {
            Log.e("CustomWNaviView", "Parser BikeTopGuide layout failed,please checking layout.");
            return false;
        }
        c cVar = this.f8855j;
        if (cVar == null) {
            Log.e("CustomWNaviView", "Parser BikeTopGuide layout failed,missing other keywords like TAG attribute or ID attribute.");
            return false;
        }
        if (!TextUtils.isEmpty(cVar.c()) && !TextUtils.isEmpty(this.f8855j.d()) && !TextUtils.isEmpty(this.f8855j.e()) && !TextUtils.isEmpty(this.f8855j.b()) && !TextUtils.isEmpty(this.f8855j.a())) {
            try {
                this.f8853h = inflate.findViewById(Integer.parseInt(this.f8855j.c().replace("@", "")));
                this.f8849d = (ImageView) inflate.findViewById(Integer.parseInt(this.f8855j.d().replace("@", "")));
                this.f8850e = (TextView) inflate.findViewById(Integer.parseInt(this.f8855j.e().replace("@", "")));
                this.f8851f = (TextView) inflate.findViewById(Integer.parseInt(this.f8855j.b().replace("@", "")));
                TextView textView = (TextView) inflate.findViewById(Integer.parseInt(this.f8855j.a().replace("@", "")));
                this.f8852g = textView;
                if (this.f8850e != null && this.f8849d != null && this.f8853h != null && this.f8851f != null && textView != null) {
                    this.f8854i.removeAllViews();
                    this.f8854i.addView(inflate);
                    this.f8856k = true;
                    return true;
                }
                Log.e("CustomWNaviView", "BikeTopGuide layout control initialize failed,Missing other keywords like TAG attribute or ID attribute.");
                return false;
            } catch (Exception e8) {
                e8.printStackTrace();
                Log.e("CustomWNaviView", "BikeTopGuide layout control type error.");
                return false;
            }
        }
        Log.e("CustomWNaviView", "BikeTopGuide layout missing other keywords like TAG attribute or ID attribute.");
        return false;
    }

    private void a(View view) {
        if (view != null) {
            this.f8853h = view.findViewById(R.id.gps_weak_layout);
            this.f8849d = (ImageView) view.findViewById(R.id.guidance_icon);
            this.f8850e = (TextView) view.findViewById(R.id.guidance_tv);
            this.f8851f = (TextView) view.findViewById(R.id.tv_gps_weak);
            this.f8852g = (TextView) view.findViewById(R.id.tv_gps_hint);
        }
    }

    public void a(int i8, String str) {
        if (i8 != R.drawable.bn_start_blue && i8 != R.drawable.bn_gps_blue) {
            this.f8850e.setVisibility(0);
        } else {
            this.f8850e.setVisibility(8);
        }
        if (com.baidu.platform.comapi.b.a.a.f8739a) {
            this.f8849d.setImageDrawable(com.baidu.platform.comapi.h.t.p.a.e().getDrawable(i8));
        } else {
            this.f8849d.setImageResource(i8);
        }
        this.f8850e.setText(str);
    }
}
