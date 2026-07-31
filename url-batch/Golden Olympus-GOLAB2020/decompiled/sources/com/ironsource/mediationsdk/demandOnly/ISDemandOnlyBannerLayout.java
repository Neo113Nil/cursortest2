package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.C1556s5;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;

/* loaded from: classes2.dex */
public class ISDemandOnlyBannerLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private View f17355a;

    /* renamed from: b, reason: collision with root package name */
    private ISBannerSize f17356b;

    /* renamed from: c, reason: collision with root package name */
    private String f17357c;

    /* renamed from: d, reason: collision with root package name */
    private Activity f17358d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f17359e;

    /* renamed from: f, reason: collision with root package name */
    private C1556s5 f17360f;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f17361a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout.LayoutParams f17362b;

        a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f17361a = view;
            this.f17362b = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            ISDemandOnlyBannerLayout.this.removeAllViews();
            ViewParent parent = this.f17361a.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f17361a);
            }
            ISDemandOnlyBannerLayout.this.f17355a = this.f17361a;
            ISDemandOnlyBannerLayout.this.addView(this.f17361a, 0, this.f17362b);
        }
    }

    public ISDemandOnlyBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f17359e = false;
        this.f17358d = activity;
        this.f17356b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
        this.f17360f = new C1556s5();
    }

    public Activity getActivity() {
        return this.f17358d;
    }

    public ISDemandOnlyBannerListener getBannerDemandOnlyListener() {
        return this.f17360f.a();
    }

    public View getBannerView() {
        return this.f17355a;
    }

    public C1556s5 getListener() {
        return this.f17360f;
    }

    public String getPlacementName() {
        return this.f17357c;
    }

    public ISBannerSize getSize() {
        return this.f17356b;
    }

    public boolean isDestroyed() {
        return this.f17359e;
    }

    public void removeBannerListener() {
        IronLog.API.info();
        this.f17360f.b((C1556s5) null);
    }

    public void setBannerDemandOnlyListener(ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
        IronLog.API.info();
        this.f17360f.b((C1556s5) iSDemandOnlyBannerListener);
    }

    public void setPlacementName(String str) {
        this.f17357c = str;
    }

    private ISDemandOnlyBannerLayout(Context context) {
        super(context);
        this.f17359e = false;
    }

    protected void a() {
        this.f17359e = true;
        this.f17358d = null;
        this.f17356b = null;
        this.f17357c = null;
        this.f17355a = null;
        removeBannerListener();
    }

    void a(View view, FrameLayout.LayoutParams layoutParams) {
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(view, layoutParams));
    }
}
